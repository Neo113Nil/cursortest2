package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zs extends t50 implements ix0, fv {
    public static final y7 t = new y7(16);
    public boolean r;
    public ea0 s;

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.ix0
    public final Object j() {
        return t;
    }

    public final at j0() {
        if (!this.q) {
            return null;
        }
        ix0 c = yc0.c(this, at.s);
        if (c instanceof at) {
            return (at) c;
        }
        return null;
    }

    @Override // defpackage.fv
    public final void n(ea0 ea0Var) {
        at j0;
        this.s = ea0Var;
        if (this.r) {
            if (!ea0Var.v0().q) {
                at j02 = j0();
                if (j02 != null) {
                    j02.j0(null);
                    return;
                }
                return;
            }
            ea0 ea0Var2 = this.s;
            if (ea0Var2 == null || !ea0Var2.v0().q || (j0 = j0()) == null) {
                return;
            }
            j0.j0(this.s);
        }
    }
}
