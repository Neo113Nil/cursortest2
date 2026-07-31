package org.chromium.base.task;

import internal.org.chromium.build.BuildConfig;
import internal.org.chromium.build.NullUtil;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;

/* loaded from: classes9.dex */
public class PostTask {
    static final boolean ENABLE_TASK_ORIGINS;
    private static volatile boolean sDisablePreNativeUiTasks;
    private static volatile boolean sNativeInitialized;
    private static final Object sPreNativeTaskRunnerLock;
    private static List sPreNativeTaskRunners;
    private static ChromeThreadPoolExecutor sPrenativeThreadPoolExecutor;
    private static volatile Executor sPrenativeThreadPoolExecutorForTesting;
    private static final ThreadLocal sTaskOrigin;
    private static final TaskRunner[] sTraitsToRunnerMap;

    public interface DelayedExecutorForTesting {
    }

    static DelayedExecutorForTesting getPrenativeThreadPoolDelayedExecutor() {
        return null;
    }

    private static boolean isUiTaskTraits(int i) {
        return i >= 6;
    }

    static {
        boolean z = BuildConfig.ENABLE_ASSERTS;
        ENABLE_TASK_ORIGINS = z;
        sPreNativeTaskRunnerLock = new Object();
        sPreNativeTaskRunners = new ArrayList();
        sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
        sTaskOrigin = z ? new ThreadLocal() : null;
        sTraitsToRunnerMap = new TaskRunner[10];
        resetTaskRunner();
    }

    private static class TaskOriginRunnable implements Runnable {
        private final TaskOriginException mTaskOrigin;
        private final Runnable mWrappedRunnable;

        TaskOriginRunnable(TaskOriginException taskOriginException, Runnable runnable) {
            this.mTaskOrigin = taskOriginException;
            this.mWrappedRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ThreadLocal) NullUtil.assumeNonNull(PostTask.sTaskOrigin)).set(this.mTaskOrigin);
            try {
                this.mWrappedRunnable.run();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static void postTask(int i, Runnable runnable) {
        postDelayedTask(i, runnable, 0L);
    }

    public static void postDelayedTask(int i, Runnable runnable, long j) {
        sTraitsToRunnerMap[i].postDelayedTask(runnable, j);
    }

    public static void runOrPostTask(int i, Runnable runnable) {
        if (canRunTaskImmediately(i)) {
            runnable.run();
        } else {
            postTask(i, runnable);
        }
    }

    public static boolean canRunTaskImmediately(int i) {
        return isUiTaskTraits(i) && ThreadUtils.runningOnUiThread() && canRunUiTaskBeforeNativeInit(i);
    }

    static Executor getPrenativeThreadPoolExecutor() {
        if (sPrenativeThreadPoolExecutorForTesting != null) {
            return sPrenativeThreadPoolExecutorForTesting;
        }
        return sPrenativeThreadPoolExecutor;
    }

    public static Exception getTaskOrigin() {
        if (!ENABLE_TASK_ORIGINS) {
            return null;
        }
        ThreadLocal threadLocal = sTaskOrigin;
        NullUtil.assumeNonNull(threadLocal);
        return (Exception) threadLocal.get();
    }

    public static Throwable maybeAddTaskOrigin(Throwable th) {
        Exception taskOrigin = getTaskOrigin();
        if (taskOrigin != null) {
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            try {
                th2.initCause(taskOrigin);
            } catch (Exception unused) {
            }
        }
        return th;
    }

    static Runnable populateTaskOrigin(TaskOriginException taskOriginException, Runnable runnable) {
        return runnable instanceof TaskOriginRunnable ? runnable : new TaskOriginRunnable(taskOriginException, runnable);
    }

    static boolean registerPreNativeTaskRunner(TaskRunnerImpl taskRunnerImpl) {
        synchronized (sPreNativeTaskRunnerLock) {
            try {
                List list = sPreNativeTaskRunners;
                if (list == null) {
                    return false;
                }
                list.add(taskRunnerImpl);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    private static void onNativeSchedulerReady() {
        List list;
        if (sNativeInitialized) {
            return;
        }
        sNativeInitialized = true;
        synchronized (sPreNativeTaskRunnerLock) {
            list = sPreNativeTaskRunners;
            sPreNativeTaskRunners = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TaskRunnerImpl) it.next()).initNativeTaskRunner();
        }
    }

    static boolean canRunUiTaskBeforeNativeInit(int i) {
        return i == 9 || !sDisablePreNativeUiTasks;
    }

    @CalledByNative
    private static void resetTaskRunner() {
        for (int i = 0; i <= 5; i++) {
            sTraitsToRunnerMap[i] = new TaskRunnerImpl(i);
        }
        for (int i2 = 6; i2 <= 9; i2++) {
            sTraitsToRunnerMap[i2] = new UiThreadTaskRunnerImpl(i2);
        }
    }
}
