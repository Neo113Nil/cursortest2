package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ql0 implements vx {
    public final boolean a;
    public final float b;
    public final long c;

    public ql0(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.rx
    public final sx a(r60 r60Var, qh qhVar) {
        qhVar.V(1257603829);
        qhVar.q(false);
        return b2.H;
    }

    @Override // defpackage.vx
    public final nl b(r60 r60Var) {
        return new ql(r60Var, this.a, this.b, new p01(17, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql0)) {
            return false;
        }
        ql0 ql0Var = (ql0) obj;
        if (this.a == ql0Var.a && jn.a(this.b, ql0Var.b)) {
            return ge.c(this.c, ql0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return ge.i(this.c) + y6.t(this.b, (this.a ? 1231 : 1237) * 31, 961);
    }
}
