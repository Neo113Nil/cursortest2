package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fx0 extends e70 {
    public final e70 o;
    public final boolean p;
    public final boolean q;
    public mu r;
    public mu s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fx0(e70 e70Var, mu muVar, mu muVar2, boolean z, boolean z2) {
        super(0L, sr0.h, ur0.l(muVar, (e70Var == null || (r0 = e70Var.e()) == null) ? ur0.j.e : r0, z), ur0.b(muVar2, (e70Var == null || (r9 = e70Var.i()) == null) ? ur0.j.f : r9));
        mu i;
        mu e;
        tn0 tn0Var = ur0.a;
        this.o = e70Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = rg0.j();
    }

    @Override // defpackage.e70
    public final void C(b70 b70Var) {
        ze0.u();
        throw null;
    }

    @Override // defpackage.e70
    public final e70 D(mu muVar, mu muVar2) {
        mu l = ur0.l(muVar, this.r, true);
        mu b = ur0.b(muVar2, this.s);
        return !this.p ? new fx0(E().D(null, b), l, b, false, true) : E().D(l, b);
    }

    public final e70 E() {
        e70 e70Var = this.o;
        return e70Var == null ? ur0.j : e70Var;
    }

    @Override // defpackage.e70, defpackage.or0
    public final void c() {
        e70 e70Var;
        this.c = true;
        if (!this.q || (e70Var = this.o) == null) {
            return;
        }
        e70Var.c();
    }

    @Override // defpackage.or0
    public final sr0 d() {
        return E().d();
    }

    @Override // defpackage.e70, defpackage.or0
    public final mu e() {
        return this.r;
    }

    @Override // defpackage.e70, defpackage.or0
    public final boolean f() {
        return E().f();
    }

    @Override // defpackage.or0
    public final long g() {
        return E().g();
    }

    @Override // defpackage.e70, defpackage.or0
    public final int h() {
        return E().h();
    }

    @Override // defpackage.e70, defpackage.or0
    public final mu i() {
        return this.s;
    }

    @Override // defpackage.e70, defpackage.or0
    public final void k() {
        ze0.u();
        throw null;
    }

    @Override // defpackage.e70, defpackage.or0
    public final void l() {
        ze0.u();
        throw null;
    }

    @Override // defpackage.e70, defpackage.or0
    public final void m() {
        E().m();
    }

    @Override // defpackage.e70, defpackage.or0
    public final void n(ht0 ht0Var) {
        E().n(ht0Var);
    }

    @Override // defpackage.or0
    public final void r(sr0 sr0Var) {
        ze0.u();
        throw null;
    }

    @Override // defpackage.or0
    public final void s(long j) {
        ze0.u();
        throw null;
    }

    @Override // defpackage.e70, defpackage.or0
    public final void t(int i) {
        E().t(i);
    }

    @Override // defpackage.e70, defpackage.or0
    public final or0 u(mu muVar) {
        mu l = ur0.l(muVar, this.r, true);
        return !this.p ? ur0.h(E().u(null), l, true) : E().u(l);
    }

    @Override // defpackage.e70
    public final ld0 w() {
        return E().w();
    }

    @Override // defpackage.e70
    public final b70 x() {
        return E().x();
    }

    @Override // defpackage.e70
    /* renamed from: y */
    public final mu e() {
        return this.r;
    }
}
