package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wk0 implements sl {
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public long l;
    public rq0 m;
    public boolean n;
    public long o;
    public sl p;
    public c10 q;
    public int r;
    public xc0 s;

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / this.p.a(), this);
    }

    @Override // defpackage.sl
    public final float a() {
        return this.p.a();
    }

    public final void b(float f) {
        if (this.g == f) {
            return;
        }
        this.d |= 4;
        this.g = f;
    }

    public final void d(float f) {
        if (this.e == f) {
            return;
        }
        this.d |= 1;
        this.e = f;
    }

    public final void e(float f) {
        if (this.f == f) {
            return;
        }
        this.d |= 2;
        this.f = f;
    }

    public final void f(long j) {
        if (uw0.a(this.l, j)) {
            return;
        }
        this.d |= 4096;
        this.l = j;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.p.h();
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return this.p.a() * f;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
