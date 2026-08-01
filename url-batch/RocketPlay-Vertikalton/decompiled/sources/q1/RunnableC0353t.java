package q1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: q1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0353t extends C implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0353t i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3920j;

    static {
        Long l2;
        RunnableC0353t runnableC0353t = new RunnableC0353t();
        i = runnableC0353t;
        runnableC0353t.H(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f3920j = timeUnit.toNanos(l2.longValue());
    }

    @Override // q1.D
    public final Thread G() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // q1.C, q1.D
    public final void J() {
        debugStatus = 4;
        super.J();
    }

    @Override // q1.C
    public final void K(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.K(runnable);
    }

    public final synchronized void N() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            C.f3861f.set(this, null);
            C.f3862g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean L2;
        c0.f3888a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (L2) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long M2 = M();
                    if (M2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f3920j + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            N();
                            if (L()) {
                                return;
                            }
                            G();
                            return;
                        }
                        if (M2 > j3) {
                            M2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (M2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            N();
                            if (L()) {
                                return;
                            }
                            G();
                            return;
                        }
                        LockSupport.parkNanos(this, M2);
                    }
                }
            }
        } finally {
            _thread = null;
            N();
            if (!L()) {
                G();
            }
        }
    }
}
