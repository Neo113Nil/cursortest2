package K1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f779a;

    /* renamed from: b, reason: collision with root package name */
    public long f780b;

    /* renamed from: c, reason: collision with root package name */
    public long f781c;

    public x a() {
        this.f779a = false;
        return this;
    }

    public x b() {
        this.f781c = 0L;
        return this;
    }

    public long c() {
        if (this.f779a) {
            return this.f780b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f779a = true;
        this.f780b = j2;
        return this;
    }

    public boolean e() {
        return this.f779a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f779a && this.f780b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        i1.f.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f781c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
