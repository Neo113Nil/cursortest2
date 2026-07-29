package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0860cl extends AbstractC0795bl implements InterfaceC0658Zg {
    public final Executor j;

    public C0860cl(Executor executor) {
        this.j = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // o.AbstractC0267Ke
    public final void L(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        try {
            this.j.execute(runnable);
        } catch (RejectedExecutionException e) {
            PX.s(interfaceC0189He, PX.a("The task was rejected", e));
            C0191Hg c0191Hg = AbstractC0115Ei.a;
            ExecutorC0035Bg.j.L(interfaceC0189He, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.j;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0860cl) && ((C0860cl) obj).j == this.j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.j);
    }

    @Override // o.InterfaceC0658Zg
    public final InterfaceC0297Li m(long j, PV pv, InterfaceC0189He interfaceC0189He) {
        Executor executor = this.j;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(pv, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                PX.s(interfaceC0189He, PX.a("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new C0271Ki(scheduledFuture) : RunnableC2105vg.q.m(j, pv, interfaceC0189He);
    }

    @Override // o.AbstractC0267Ke
    public final String toString() {
        return this.j.toString();
    }

    @Override // o.InterfaceC0658Zg
    public final void x(long j, C0849ca c0849ca) {
        Executor executor = this.j;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC1996u1 runnableC1996u1 = new RunnableC1996u1(8, this, c0849ca, false);
            InterfaceC0189He interfaceC0189He = c0849ca.l;
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnableC1996u1, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                PX.s(interfaceC0189He, PX.a("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            c0849ca.u(new Y9(0, scheduledFuture));
        } else {
            RunnableC2105vg.q.x(j, c0849ca);
        }
    }
}
