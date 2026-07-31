package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.task.CancelableTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;

    @NonNull
    private final c expiredTask;

    @NonNull
    private final AtomicBoolean isExpireTrackerSubscribed;

    @NonNull
    private final TaskScheduler taskScheduler;

    public interface Listener {
        void onExpired();
    }

    public interface TaskScheduler {
        void cancelTask(@NonNull CancelableTask cancelableTask);

        void scheduleTask(@NonNull CancelableTask cancelableTask, long j);
    }

    private static class b implements TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(CancelableTask cancelableTask) {
            cancelableTask.setCancel(true);
            Utils.cancelBackgroundThreadTask(cancelableTask);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(CancelableTask cancelableTask, long j) {
            cancelableTask.setCancel(false);
            Utils.onBackgroundThread(cancelableTask, j);
        }
    }

    private static class c extends CancelableTask {
        private final WeakReference a;

        public c(Listener listener) {
            this.a = new WeakReference(listener);
        }

        @Override // io.bidmachine.utils.task.CancelableTask
        public void runTask() {
            Listener listener = (Listener) this.a.get();
            if (listener != null) {
                listener.onExpired();
            }
        }
    }

    public ExpirationHandler(long j, @NonNull Listener listener) {
        this(j, listener, new b());
    }

    @NonNull
    TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs <= 0 || !this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            return;
        }
        this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }

    public ExpirationHandler(long j, @NonNull Listener listener, @NonNull TaskScheduler taskScheduler) {
        this.expiredTask = new c(listener);
        this.expirationTimeMs = j;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }
}
