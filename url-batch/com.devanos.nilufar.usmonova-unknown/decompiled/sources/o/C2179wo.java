package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2179wo extends NV {
    public NV e;

    public C2179wo(NV nv) {
        AbstractC0048Bt.n(nv, "delegate");
        this.e = nv;
    }

    @Override // o.NV
    public final NV a() {
        return this.e.a();
    }

    @Override // o.NV
    public final NV b() {
        return this.e.b();
    }

    @Override // o.NV
    public final long c() {
        return this.e.c();
    }

    @Override // o.NV
    public final NV d(long j) {
        return this.e.d(j);
    }

    @Override // o.NV
    public final boolean e() {
        return this.e.e();
    }

    @Override // o.NV
    public final void f() {
        this.e.f();
    }

    @Override // o.NV
    public final NV g(long j) {
        AbstractC0048Bt.n(TimeUnit.MILLISECONDS, "unit");
        return this.e.g(j);
    }
}
