package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2105vg extends AbstractC0428Qk implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC2105vg q;
    public static final long r;

    static {
        Long l;
        RunnableC2105vg runnableC2105vg = new RunnableC2105vg();
        q = runnableC2105vg;
        runnableC2105vg.R(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        r = timeUnit.toNanos(l.longValue());
    }

    @Override // o.AbstractC0454Rk
    public final Thread Q() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(q.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // o.AbstractC0454Rk
    public final void U(long j, AbstractRunnableC0376Ok abstractRunnableC0376Ok) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o.AbstractC0428Qk
    public final void V(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.V(runnable);
    }

    public final synchronized void a0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC0428Qk.n.set(this, null);
            AbstractC0428Qk.f91o.set(this, null);
            notifyAll();
        }
    }

    @Override // o.AbstractC0428Qk, o.InterfaceC0658Zg
    public final InterfaceC0297Li m(long j, PV pv, InterfaceC0189He interfaceC0189He) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return PE.h;
        }
        long nanoTime = System.nanoTime();
        C0350Nk c0350Nk = new C0350Nk(j2 + nanoTime, pv);
        Z(nanoTime, c0350Nk);
        return c0350Nk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean Y;
        EV.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (Y) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long S = S();
                    if (S == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = r + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            a0();
                            if (Y()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        if (S > j2) {
                            S = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (S > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            a0();
                            if (Y()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        LockSupport.parkNanos(this, S);
                    }
                }
            }
        } finally {
            _thread = null;
            a0();
            if (!Y()) {
                Q();
            }
        }
    }

    @Override // o.AbstractC0428Qk, o.AbstractC0454Rk
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // o.AbstractC0267Ke
    public final String toString() {
        return "DefaultExecutor";
    }
}
