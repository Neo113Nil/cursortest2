package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bf implements u50 {
    public final u50 a;
    public final u50 b;

    public bf(u50 u50Var, u50 u50Var2) {
        this.a = u50Var;
        this.b = u50Var2;
    }

    @Override // defpackage.u50
    public final Object a(qu quVar, Object obj) {
        return this.b.a(quVar, this.a.a(quVar, obj));
    }

    @Override // defpackage.u50
    public final /* synthetic */ u50 c(u50 u50Var) {
        return y6.d(this, u50Var);
    }

    @Override // defpackage.u50
    public final boolean e(mu muVar) {
        return this.a.e(muVar) && this.b.e(muVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.a.equals(bfVar.a) && nz.l(this.b, bfVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a(h6.h, "")) + ']';
    }
}
