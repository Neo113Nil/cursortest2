package v1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class w {
    public static final v d = new v();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4101a;

    /* renamed from: b, reason: collision with root package name */
    public long f4102b;

    /* renamed from: c, reason: collision with root package name */
    public long f4103c;

    public w a() {
        this.f4101a = false;
        return this;
    }

    public w b() {
        this.f4103c = 0L;
        return this;
    }

    public long c() {
        if (this.f4101a) {
            return this.f4102b;
        }
        throw new IllegalStateException("No deadline");
    }

    public w d(long j2) {
        this.f4101a = true;
        this.f4102b = j2;
        return this;
    }

    public boolean e() {
        return this.f4101a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4101a && this.f4102b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public w g(long j2, TimeUnit timeUnit) {
        X0.e.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f4103c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
