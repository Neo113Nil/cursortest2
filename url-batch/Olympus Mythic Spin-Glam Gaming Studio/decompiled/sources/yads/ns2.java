package yads;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class ns2 implements RunnableFuture {
    public final ry b = new ry();
    public final ry c = new ry();
    public final Object d = new Object();
    public Exception e;
    public Object f;
    public Thread g;
    public boolean h;

    public void a() {
    }

    public abstract Object b();

    public final Object c() {
        if (this.h) {
            throw new CancellationException();
        }
        if (this.e == null) {
            return this.f;
        }
        throw new ExecutionException(this.e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.d) {
            try {
                if (!this.h && !this.c.c()) {
                    this.h = true;
                    a();
                    Thread thread = this.g;
                    if (thread == null) {
                        this.b.d();
                        this.c.d();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.c.a();
        return c();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        ry ryVar = this.c;
        synchronized (ryVar) {
            z = ryVar.a;
        }
        return z;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                if (this.h) {
                    return;
                }
                this.g = Thread.currentThread();
                this.b.d();
                try {
                    try {
                        this.f = b();
                        synchronized (this.d) {
                            this.c.d();
                            this.g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.d) {
                            this.c.d();
                            this.g = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.e = e;
                    synchronized (this.d) {
                        this.c.d();
                        this.g = null;
                        Thread.interrupted();
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        ry ryVar = this.c;
        synchronized (ryVar) {
            if (convert <= 0) {
                z = ryVar.a;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    ryVar.a();
                } else {
                    while (!ryVar.a && elapsedRealtime < j2) {
                        ryVar.wait(j2 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = ryVar.a;
            }
        }
        if (z) {
            return c();
        }
        throw new TimeoutException();
    }
}
