package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.ironsource.X3;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class MoreExecutors {
    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
        ListeningExecutorService listeningDecorator;
        if (executorService instanceof ListeningExecutorService) {
            return (ListeningExecutorService) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            listeningDecorator = new ScheduledListeningDecorator((ScheduledExecutorService) executorService);
        } else {
            listeningDecorator = new ListeningDecorator(executorService);
        }
        return listeningDecorator;
    }

    private static class ListeningDecorator extends AbstractListeningExecutorService {
        private final ExecutorService delegate;

        ListeningDecorator(ExecutorService executorService) {
            this.delegate = (ExecutorService) Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.delegate.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.delegate.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.delegate.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.delegate.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.delegate.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.delegate.execute(runnable);
        }

        public final String toString() {
            return super.toString() + X3.j.d + this.delegate + X3.j.e;
        }
    }

    private static final class ScheduledListeningDecorator extends ListeningDecorator implements ScheduledExecutorService, ListeningExecutorService {
        final ScheduledExecutorService delegate;

        ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.delegate = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask create = TrustedListenableFutureTask.create(runnable, null);
            return new ListenableScheduledTask(create, this.delegate.schedule(create, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask create = TrustedListenableFutureTask.create(callable);
            return new ListenableScheduledTask(create, this.delegate.schedule(create, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        private static final class ListenableScheduledTask extends ForwardingListenableFuture.SimpleForwardingListenableFuture implements ListenableScheduledFuture {
            private final ScheduledFuture scheduledDelegate;

            public ListenableScheduledTask(ListenableFuture listenableFuture, ScheduledFuture scheduledFuture) {
                super(listenableFuture);
                this.scheduledDelegate = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.scheduledDelegate.cancel(z);
                }
                return cancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.scheduledDelegate.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed delayed) {
                return this.scheduledDelegate.compareTo(delayed);
            }
        }

        private static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture implements Runnable {
            private final Runnable delegate;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                this.delegate = (Runnable) Preconditions.checkNotNull(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.delegate.run();
                } catch (Throwable th) {
                    setException(th);
                    throw th;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected String pendingToString() {
                return "task=[" + this.delegate + X3.j.e;
            }
        }
    }
}
