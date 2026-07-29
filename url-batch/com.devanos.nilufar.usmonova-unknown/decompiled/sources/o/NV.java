package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class NV {
    public static final MV d = new MV();
    public boolean a;
    public long b;
    public long c;

    public NV a() {
        this.a = false;
        return this;
    }

    public NV b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public NV d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public NV g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC0048Bt.n(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("timeout < 0: ", j).toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }
}
