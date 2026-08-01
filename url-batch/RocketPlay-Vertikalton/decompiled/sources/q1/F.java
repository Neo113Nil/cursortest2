package q1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class F extends E implements InterfaceC0355v {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3865c;

    public F(Executor executor) {
        Method method;
        this.f3865c = executor;
        Method method2 = u1.c.f4179a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = u1.c.f4179a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // q1.AbstractC0349o
    public final void D(Z0.i iVar, Runnable runnable) {
        try {
            this.f3865c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            AbstractC0352s.a(iVar, cancellationException);
            AbstractC0358y.f3925b.D(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3865c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f3865c == this.f3865c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3865c);
    }

    @Override // q1.AbstractC0349o
    public final String toString() {
        return this.f3865c.toString();
    }
}
