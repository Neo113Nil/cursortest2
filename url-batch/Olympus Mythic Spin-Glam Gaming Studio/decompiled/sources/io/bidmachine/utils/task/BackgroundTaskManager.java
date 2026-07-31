package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class BackgroundTaskManager implements TaskManager {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;

    @NonNull
    private final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(CORE_POOL_SIZE);

    @NonNull
    private final Map<Runnable, Future<?>> futureMap = new ConcurrentHashMap();

    private class a implements Runnable {
        private final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            BackgroundTaskManager.this.removeFuture(this.a);
            this.a.run();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Future<?> removeFuture(@NonNull Runnable runnable) {
        try {
            return this.futureMap.remove(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void cancel(@NonNull CancelableTask cancelableTask) {
        try {
            cancelableTask.setCancel(true);
            Future<?> removeFuture = removeFuture(cancelableTask);
            if (removeFuture == null) {
                return;
            }
            removeFuture.cancel(false);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void execute(@NonNull Runnable runnable) {
        try {
            this.executor.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    @NonNull
    @VisibleForTesting
    Map<Runnable, Future<?>> getFutureMap() {
        return this.futureMap;
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void schedule(@NonNull CancelableTask cancelableTask, long j, @NonNull TimeUnit timeUnit) {
        try {
            cancelableTask.setCancel(false);
            this.futureMap.put(cancelableTask, this.executor.schedule(new a(cancelableTask), j, timeUnit));
        } catch (Throwable unused) {
        }
    }
}
