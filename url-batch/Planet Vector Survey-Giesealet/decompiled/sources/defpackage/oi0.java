package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oi0 extends or0 {
    public final mu e;
    public int f;

    public oi0(long j, sr0 sr0Var, mu muVar) {
        super(j, sr0Var);
        this.e = muVar;
        this.f = 1;
    }

    @Override // defpackage.or0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (ur0.c) {
            o();
        }
    }

    @Override // defpackage.or0
    public final mu e() {
        return this.e;
    }

    @Override // defpackage.or0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.or0
    public final mu i() {
        return null;
    }

    @Override // defpackage.or0
    public final void k() {
        this.f++;
    }

    @Override // defpackage.or0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.or0
    public final void n(ht0 ht0Var) {
        tn0 tn0Var = ur0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.or0
    public final or0 u(mu muVar) {
        ur0.d(this);
        return new t90(this.b, this.a, ur0.l(muVar, this.e, true), this);
    }

    @Override // defpackage.or0
    public final void m() {
    }
}
