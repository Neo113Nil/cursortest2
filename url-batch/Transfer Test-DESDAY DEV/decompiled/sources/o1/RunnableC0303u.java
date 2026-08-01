package o1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0303u extends F implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0303u i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3341j;

    static {
        Long l2;
        RunnableC0303u runnableC0303u = new RunnableC0303u();
        i = runnableC0303u;
        runnableC0303u.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f3341j = timeUnit.toNanos(l2.longValue());
    }

    @Override // o1.G
    public final Thread C() {
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

    @Override // o1.G
    public final void F(long j2, D d) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o1.F, o1.G
    public final void G() {
        debugStatus = 4;
        super.G();
    }

    @Override // o1.F
    public final void H(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.H(runnable);
    }

    public final synchronized void M() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            F.f3281f.set(this, null);
            F.f3282g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean J2;
        e0.f3312a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (J2) {
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
                    long K2 = K();
                    if (K2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f3341j + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            M();
                            if (J()) {
                                return;
                            }
                            C();
                            return;
                        }
                        if (K2 > j3) {
                            K2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (K2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            M();
                            if (J()) {
                                return;
                            }
                            C();
                            return;
                        }
                        LockSupport.parkNanos(this, K2);
                    }
                }
            }
        } finally {
            _thread = null;
            M();
            if (!J()) {
                C();
            }
        }
    }
}
