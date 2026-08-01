package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gx0 extends or0 {
    public final or0 e;
    public final boolean f;
    public final boolean g;
    public mu h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx0(or0 or0Var, mu muVar, boolean z, boolean z2) {
        super(0L, sr0.h);
        mu e;
        tn0 tn0Var = ur0.a;
        this.e = or0Var;
        this.f = z;
        this.g = z2;
        this.h = ur0.l(muVar, (or0Var == null || (e = or0Var.e()) == null) ? ur0.j.e : e, z);
        this.i = rg0.j();
    }

    @Override // defpackage.or0
    public final void c() {
        or0 or0Var;
        this.c = true;
        if (!this.g || (or0Var = this.e) == null) {
            return;
        }
        or0Var.c();
    }

    @Override // defpackage.or0
    public final sr0 d() {
        return v().d();
    }

    @Override // defpackage.or0
    public final mu e() {
        return this.h;
    }

    @Override // defpackage.or0
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.or0
    public final long g() {
        return v().g();
    }

    @Override // defpackage.or0
    public final mu i() {
        return null;
    }

    @Override // defpackage.or0
    public final void k() {
        ze0.u();
        throw null;
    }

    @Override // defpackage.or0
    public final void l() {
        ze0.u();
        throw null;
    }

    @Override // defpackage.or0
    public final void m() {
        v().m();
    }

    @Override // defpackage.or0
    public final void n(ht0 ht0Var) {
        v().n(ht0Var);
    }

    @Override // defpackage.or0
    public final or0 u(mu muVar) {
        mu l = ur0.l(muVar, this.h, true);
        return !this.f ? ur0.h(v().u(null), l, true) : v().u(l);
    }

    public final or0 v() {
        or0 or0Var = this.e;
        return or0Var == null ? ur0.j : or0Var;
    }
}
