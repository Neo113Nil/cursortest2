package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e00 extends c00 {
    public final g00 h;
    public final f00 i;
    public final jd j;
    public final Object k;

    public e00(g00 g00Var, f00 f00Var, jd jdVar, Object obj) {
        this.h = g00Var;
        this.i = f00Var;
        this.j = jdVar;
        this.k = obj;
    }

    @Override // defpackage.c00
    public final boolean k() {
        return false;
    }

    @Override // defpackage.c00
    public final void l(Throwable th) {
        jd jdVar = this.j;
        jd R = g00.R(jdVar);
        g00 g00Var = this.h;
        f00 f00Var = this.i;
        Object obj = this.k;
        if (R == null || !g00Var.a0(f00Var, R, obj)) {
            f00Var.d.e(new k30(2), 2);
            jd R2 = g00.R(jdVar);
            if (R2 == null || !g00Var.a0(f00Var, R2, obj)) {
                g00Var.w(g00Var.F(f00Var, obj));
            }
        }
    }
}
