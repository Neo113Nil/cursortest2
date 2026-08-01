package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sy implements g10, s50 {
    public final b11 a;
    public final ce0 b;
    public final ce0 c;

    public sy(x5 x5Var) {
        this.a = x5Var;
        this.b = ud0.o(x5Var);
        this.c = ud0.o(x5Var);
    }

    @Override // defpackage.u50
    public final Object a(qu quVar, Object obj) {
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.u50
    public final /* synthetic */ u50 c(u50 u50Var) {
        return y6.d(this, u50Var);
    }

    @Override // defpackage.g10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        ce0 ce0Var = this.b;
        int a = ((b11) ce0Var.getValue()).a(f40Var, f40Var.getLayoutDirection());
        int b = ((b11) ce0Var.getValue()).b(f40Var);
        int c = ((b11) ce0Var.getValue()).c(f40Var, f40Var.getLayoutDirection()) + a;
        int d = ((b11) ce0Var.getValue()).d(f40Var) + b;
        yf0 d2 = b50Var.d(vi.h(-c, -d, j));
        return f40Var.h0(vi.f(j, d2.d + c), vi.e(j, d2.e + d), xp.d, new ry(d2, a, b));
    }

    @Override // defpackage.u50
    public final boolean e(mu muVar) {
        return ((Boolean) muVar.c(this)).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sy) {
            return nz.l(((sy) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
