package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uk extends tq implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final uk m;
    public static final long n;

    static {
        Long l;
        uk ukVar = new uk();
        m = ukVar;
        ukVar.r(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        n = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.tq
    public final Thread A() {
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
                thread.setContextClassLoader(m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.tq
    public final void C(long j, rq rqVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void E() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            tq.j.set(this, null);
            tq.k.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean B;
        hw0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (B) {
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
                    long v = v();
                    if (v == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = n + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            E();
                            if (B()) {
                                return;
                            }
                            A();
                            return;
                        }
                        if (v > j2) {
                            v = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (v > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            E();
                            if (B()) {
                                return;
                            }
                            A();
                            return;
                        }
                        LockSupport.parkNanos(this, v);
                    }
                }
            }
        } finally {
            _thread = null;
            E();
            if (!B()) {
                A();
            }
        }
    }

    @Override // defpackage.tq, defpackage.pq
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.uj
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.tq
    public final void x(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.x(runnable);
    }
}
