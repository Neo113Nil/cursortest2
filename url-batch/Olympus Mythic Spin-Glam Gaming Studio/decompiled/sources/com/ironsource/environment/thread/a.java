package com.ironsource.environment.thread;

import com.ironsource.C4774me;
import com.ironsource.environment.thread.a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class a implements ScheduledExecutorService {

    @NotNull
    public static final C1359a c = new C1359a(null);

    @NotNull
    private final AtomicReference<Thread> a;

    @NotNull
    private final ScheduledExecutorService b;

    /* renamed from: com.ironsource.environment.thread.a$a, reason: collision with other inner class name */
    public static final class C1359a {
        public /* synthetic */ C1359a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(@NotNull final String threadName) {
            Intrinsics.checkNotNullParameter(threadName, "threadName");
            final AtomicReference atomicReference = new AtomicReference();
            return new a(atomicReference, new C4774me(1, new ThreadFactory() { // from class: com.ironsource.environment.thread.a$a$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread a;
                    a = a.C1359a.a(threadName, atomicReference, runnable);
                    return a;
                }
            }), null);
        }

        private C1359a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread a(String threadName, AtomicReference ref, Runnable runnable) {
            Intrinsics.checkNotNullParameter(threadName, "$threadName");
            Intrinsics.checkNotNullParameter(ref, "$ref");
            Thread thread = new Thread(runnable, threadName);
            ref.set(thread);
            return thread;
        }
    }

    public /* synthetic */ a(AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomicReference, scheduledExecutorService);
    }

    public final boolean a() {
        return this.a.get() == Thread.currentThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public void close() {
        super.close();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.b.submit(runnable);
    }

    private a(AtomicReference<Thread> atomicReference, ScheduledExecutorService scheduledExecutorService) {
        this.a = atomicReference;
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.b.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(callable);
    }
}
