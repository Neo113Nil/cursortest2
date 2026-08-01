package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ar0 extends g0 {
    public long a;
    public hc b;

    @Override // defpackage.g0
    public final boolean a(f0 f0Var) {
        zq0 zq0Var = (zq0) f0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = zq0Var.k;
        if (j < zq0Var.l) {
            zq0Var.l = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.g0
    public final kj[] b(f0 f0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((zq0) f0Var).u(j);
    }
}
