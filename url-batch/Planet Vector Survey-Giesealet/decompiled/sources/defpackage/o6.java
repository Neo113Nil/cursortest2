package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o6 implements g10 {
    public final xw0 a;
    public final f70 b;
    public final /* synthetic */ p6 c;

    public o6(p6 p6Var, xw0 xw0Var, f70 f70Var) {
        this.c = p6Var;
        this.a = xw0Var;
        this.b = f70Var;
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
        yf0 d = b50Var.d(j);
        p6 p6Var = this.c;
        long c = f40Var.f0() ? px0.c(d.d, d.e) : ((iz) this.a.a(new y3(5, p6Var, this), new f2(6, p6Var)).getValue()).a;
        return f40Var.h0((int) (c >> 32), (int) (4294967295L & c), xp.d, new n6(p6Var, d, c));
    }

    @Override // defpackage.u50
    public final boolean e(mu muVar) {
        return ((Boolean) muVar.c(this)).booleanValue();
    }
}
