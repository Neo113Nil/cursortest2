package o1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class I extends H implements InterfaceC0305w {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3285c;

    public I(Executor executor) {
        Method method;
        this.f3285c = executor;
        Method method2 = s1.c.f3692a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = s1.c.f3692a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3285c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).f3285c == this.f3285c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3285c);
    }

    @Override // o1.AbstractC0299p
    public final String toString() {
        return this.f3285c.toString();
    }

    @Override // o1.InterfaceC0305w
    public final void v(C0288e c0288e) {
        Executor executor = this.f3285c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new H.a(this, 2, c0288e), 1500L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                AbstractC0302t.a(c0288e.f3311e, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c0288e.o(new C0287d(0, scheduledFuture));
        } else {
            RunnableC0303u.i.v(c0288e);
        }
    }

    @Override // o1.AbstractC0299p
    public final void z(X0.i iVar, Runnable runnable) {
        try {
            this.f3285c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            AbstractC0302t.a(iVar, cancellationException);
            AbstractC0308z.f3346b.z(iVar, runnable);
        }
    }
}
