package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nn extends t50 implements ix0, z00 {
    public nn r;
    public nn s;
    public long t;

    @Override // defpackage.t50
    public final void b0() {
        this.s = null;
        this.r = null;
    }

    @Override // defpackage.ix0
    public final Object j() {
        return b2.v;
    }

    public final boolean j0() {
        nn nnVar = this.r;
        if (nnVar != null) {
            return nnVar.j0();
        }
        nn nnVar2 = this.s;
        if (nnVar2 != null) {
            return nnVar2.j0();
        }
        return false;
    }

    public final void k0() {
        nn nnVar = this.s;
        if (nnVar != null) {
            nnVar.k0();
            return;
        }
        nn nnVar2 = this.r;
        if (nnVar2 != null) {
            nnVar2.k0();
        }
    }

    public final void l0() {
        nn nnVar = this.s;
        if (nnVar != null) {
            nnVar.l0();
        }
        nn nnVar2 = this.r;
        if (nnVar2 != null) {
            nnVar2.l0();
        }
        this.r = null;
    }

    @Override // defpackage.z00
    public final void m(long j) {
        this.t = j;
    }

    public final void m0(p01 p01Var) {
        ix0 ix0Var;
        nn nnVar;
        nn nnVar2 = this.r;
        if (nnVar2 == null || !x40.k(nnVar2, nk.y(p01Var))) {
            if (this.d.q) {
                gj0 gj0Var = new gj0();
                yc0.t(this, new y5(gj0Var, this, p01Var, 4));
                ix0Var = (ix0) gj0Var.d;
            } else {
                ix0Var = null;
            }
            nnVar = (nn) ix0Var;
        } else {
            nnVar = nnVar2;
        }
        if (nnVar != null && nnVar2 == null) {
            nnVar.k0();
            nnVar.m0(p01Var);
            nn nnVar3 = this.s;
            if (nnVar3 != null) {
                nnVar3.l0();
            }
        } else if (nnVar == null && nnVar2 != null) {
            nn nnVar4 = this.s;
            if (nnVar4 != null) {
                nnVar4.k0();
                nnVar4.m0(p01Var);
            }
            nnVar2.l0();
        } else if (!nz.l(nnVar, nnVar2)) {
            if (nnVar != null) {
                nnVar.k0();
                nnVar.m0(p01Var);
            }
            if (nnVar2 != null) {
                nnVar2.l0();
            }
        } else if (nnVar != null) {
            nnVar.m0(p01Var);
        } else {
            nn nnVar5 = this.s;
            if (nnVar5 != null) {
                nnVar5.m0(p01Var);
            }
        }
        this.r = nnVar;
    }

    public final void n0() {
        nn nnVar = this.s;
        if (nnVar != null) {
            nnVar.n0();
            return;
        }
        nn nnVar2 = this.r;
        if (nnVar2 != null) {
            nnVar2.n0();
        }
    }

    @Override // defpackage.z00
    public final /* synthetic */ void i(b10 b10Var) {
    }
}
