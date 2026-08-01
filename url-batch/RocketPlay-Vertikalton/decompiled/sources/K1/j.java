package K1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f750e;

    public j(x xVar) {
        i1.f.e(xVar, "delegate");
        this.f750e = xVar;
    }

    @Override // K1.x
    public final x a() {
        return this.f750e.a();
    }

    @Override // K1.x
    public final x b() {
        return this.f750e.b();
    }

    @Override // K1.x
    public final long c() {
        return this.f750e.c();
    }

    @Override // K1.x
    public final x d(long j2) {
        return this.f750e.d(j2);
    }

    @Override // K1.x
    public final boolean e() {
        return this.f750e.e();
    }

    @Override // K1.x
    public final void f() {
        this.f750e.f();
    }

    @Override // K1.x
    public final x g(long j2, TimeUnit timeUnit) {
        i1.f.e(timeUnit, "unit");
        return this.f750e.g(j2, timeUnit);
    }
}
