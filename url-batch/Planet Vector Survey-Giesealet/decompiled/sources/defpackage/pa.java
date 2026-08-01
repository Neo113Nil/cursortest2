package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pa extends t50 implements ma, z00, ix0 {
    public static final y7 t = new y7(4);
    public dj r;
    public boolean s;

    public static final zi0 j0(pa paVar, ea0 ea0Var, bu buVar) {
        zi0 zi0Var;
        if (paVar.q && paVar.s) {
            ea0 Z = nz.Z(paVar);
            if (!ea0Var.v0().q) {
                ea0Var = null;
            }
            if (ea0Var != null && (zi0Var = (zi0) buVar.a()) != null) {
                float f = Z.z(ea0Var, false).a;
                return zi0Var.e((Float.floatToRawIntBits(r4.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.ma
    public final Object T(ea0 ea0Var, bu buVar, fu0 fu0Var) {
        Object v = x40.v(new oa(this, ea0Var, buVar, new c9(this, ea0Var, buVar, 1), null), fu0Var);
        return v == ck.d ? v : ky0.a;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.z00
    public final void i(b10 b10Var) {
        this.s = true;
    }

    @Override // defpackage.ix0
    public final Object j() {
        return t;
    }

    @Override // defpackage.z00
    public final /* synthetic */ void m(long j) {
    }
}
