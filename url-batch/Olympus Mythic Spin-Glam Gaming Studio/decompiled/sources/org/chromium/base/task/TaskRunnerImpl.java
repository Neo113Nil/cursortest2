package org.chromium.base.task;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import internal.org.chromium.build.NullUtil;
import internal.org.jni_zero.CalledByNative;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.chromium.base.TraceEvent;

/* loaded from: classes12.dex */
public class TaskRunnerImpl implements TaskRunner {
    private static int sPendingTaskMapNextIndex;
    private static final Runnable[] sPendingTaskTable;
    private boolean mDidOneTimeInitialization;
    private volatile long mNativeTaskRunnerAndroid;
    private List mPreNativeDelayedTasks;
    private final Object mPreNativeTaskLock;
    private Queue mPreNativeTasks;
    protected final Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    protected final int mTaskTraits;
    private final String mTraceEvent;
    private static final ReferenceQueue sQueue = new ReferenceQueue();
    private static final Object sPendingTaskLock = new Object();
    private static final Map sPendingTaskMap = new HashMap();
    private static final Set sCleaners = new HashSet();

    interface Natives {
        void destroy(long j);

        long init(int i, int i2);

        void postDelayedTask(long j, long j2, int i);
    }

    static {
        Runnable[] runnableArr = new Runnable[50];
        sPendingTaskTable = runnableArr;
        sPendingTaskMapNextIndex = runnableArr.length;
    }

    private static class TaskRunnerCleaner extends WeakReference {
        final long mNativePtr;

        TaskRunnerCleaner(TaskRunnerImpl taskRunnerImpl) {
            super(taskRunnerImpl, TaskRunnerImpl.sQueue);
            this.mNativePtr = taskRunnerImpl.mNativeTaskRunnerAndroid;
        }

        void destroy() {
            TaskRunnerImplJni.get().destroy(this.mNativePtr);
        }
    }

    private static void destroyGarbageCollectedTaskRunners() {
        while (true) {
            TaskRunnerCleaner taskRunnerCleaner = (TaskRunnerCleaner) sQueue.poll();
            if (taskRunnerCleaner == null) {
                return;
            }
            taskRunnerCleaner.destroy();
            Set set = sCleaners;
            synchronized (set) {
                set.remove(taskRunnerCleaner);
            }
        }
    }

    TaskRunnerImpl(int i) {
        this(i, "TaskRunnerImpl", 0);
        destroyGarbageCollectedTaskRunners();
    }

    protected TaskRunnerImpl(int i, String str, int i2) {
        this.mRunPreNativeTaskClosure = new Runnable() { // from class: org.chromium.base.task.TaskRunnerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunnerImpl.this.runPreNativeTask();
            }
        };
        this.mPreNativeTaskLock = new Object();
        this.mTaskTraits = i;
        this.mTraceEvent = str + ".PreNativeTask.run";
        this.mTaskRunnerType = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        postDelayedTask(runnable, 0L);
    }

    @Override // org.chromium.base.task.TaskRunner
    public final void postDelayedTask(Runnable runnable, long j) {
        if (PostTask.ENABLE_TASK_ORIGINS) {
            runnable = PostTask.populateTaskOrigin(new TaskOriginException(), runnable);
        }
        if (this.mNativeTaskRunnerAndroid != 0) {
            queueDelayedTaskToNative(this.mNativeTaskRunnerAndroid, runnable, j);
            return;
        }
        synchronized (this.mPreNativeTaskLock) {
            try {
                oneTimeInitialization();
                if (this.mNativeTaskRunnerAndroid != 0) {
                    queueDelayedTaskToNative(this.mNativeTaskRunnerAndroid, runnable, j);
                    return;
                }
                if (j == 0) {
                    ((Queue) NullUtil.assumeNonNull(this.mPreNativeTasks)).add(runnable);
                    schedulePreNativeTask();
                } else if (!schedulePreNativeDelayedTask(runnable, j)) {
                    ((List) NullUtil.assumeNonNull(this.mPreNativeDelayedTasks)).add(new Pair(runnable, Long.valueOf(j)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void oneTimeInitialization() {
        if (this.mDidOneTimeInitialization) {
            return;
        }
        this.mDidOneTimeInitialization = true;
        if (!PostTask.registerPreNativeTaskRunner(this)) {
            initNativeTaskRunner();
        } else {
            this.mPreNativeTasks = new ArrayDeque();
            this.mPreNativeDelayedTasks = new ArrayList();
        }
    }

    protected void schedulePreNativeTask() {
        PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    protected boolean schedulePreNativeDelayedTask(Runnable runnable, long j) {
        PostTask.getPrenativeThreadPoolDelayedExecutor();
        return false;
    }

    protected void runPreNativeTask() {
        TraceEvent scoped = TraceEvent.scoped(this.mTraceEvent);
        try {
            synchronized (this.mPreNativeTaskLock) {
                Queue queue = this.mPreNativeTasks;
                if (queue == null) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    ((Runnable) queue.poll()).run();
                    if (scoped != null) {
                        scoped.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void initNativeTaskRunner() {
        long init = TaskRunnerImplJni.get().init(this.mTaskRunnerType, this.mTaskTraits);
        synchronized (this.mPreNativeTaskLock) {
            try {
                Queue queue = this.mPreNativeTasks;
                if (queue != null) {
                    Iterator it = queue.iterator();
                    while (it.hasNext()) {
                        queueDelayedTaskToNative(init, (Runnable) it.next(), 0L);
                    }
                    this.mPreNativeTasks = null;
                }
                List<Pair> list = this.mPreNativeDelayedTasks;
                if (list != null) {
                    for (Pair pair : list) {
                        queueDelayedTaskToNative(init, (Runnable) pair.first, ((Long) pair.second).longValue());
                    }
                    this.mPreNativeDelayedTasks = null;
                }
                this.mNativeTaskRunnerAndroid = init;
            } catch (Throwable th) {
                throw th;
            }
        }
        Set set = sCleaners;
        synchronized (set) {
            set.add(new TaskRunnerCleaner(this));
        }
        destroyGarbageCollectedTaskRunners();
    }

    private static void queueDelayedTaskToNative(long j, Runnable runnable, long j2) {
        TaskRunnerImplJni.get().postDelayedTask(j, j2, queueTask(runnable, j2 == 0));
    }

    @CalledByNative
    @VisibleForTesting
    static void runTask(int i) {
        dequeueTask(i).run();
    }

    private static int queueTask(Runnable runnable, boolean z) {
        synchronized (sPendingTaskLock) {
            int i = 0;
            while (z) {
                try {
                    Runnable[] runnableArr = sPendingTaskTable;
                    if (i >= runnableArr.length) {
                        break;
                    }
                    if (runnableArr[i] == null) {
                        runnableArr[i] = runnable;
                        return i;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = sPendingTaskMapNextIndex;
            sPendingTaskMapNextIndex = i2 + 1;
            sPendingTaskMap.put(Integer.valueOf(i2), runnable);
            return i2;
        }
    }

    private static Runnable dequeueTask(int i) {
        Runnable runnable;
        synchronized (sPendingTaskLock) {
            try {
                Runnable[] runnableArr = sPendingTaskTable;
                if (i < runnableArr.length) {
                    runnable = runnableArr[i];
                    runnableArr[i] = null;
                } else {
                    runnable = (Runnable) sPendingTaskMap.remove(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return runnable;
    }
}
