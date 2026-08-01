package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xw0 {
    public final j3 a;
    public final ce0 b = ud0.o(null);
    public final /* synthetic */ cx0 c;

    public xw0(cx0 cx0Var, j3 j3Var, String str) {
        this.c = cx0Var;
        this.a = j3Var;
    }

    public final ww0 a(mu muVar, mu muVar2) {
        ce0 ce0Var = this.b;
        ww0 ww0Var = (ww0) ce0Var.getValue();
        cx0 cx0Var = this.c;
        if (ww0Var == null) {
            Object c = muVar2.c(cx0Var.a.b());
            Object c2 = muVar2.c(cx0Var.a.b());
            j3 j3Var = this.a;
            i7 i7Var = (i7) ((mu) j3Var.e).c(c2);
            i7Var.d();
            ax0 ax0Var = new ax0(cx0Var, c, i7Var, j3Var);
            ww0Var = new ww0(this, ax0Var, muVar, muVar2);
            ce0Var.setValue(ww0Var);
            cx0Var.i.add(ax0Var);
        }
        ww0Var.f = muVar2;
        ww0Var.e = muVar;
        ww0Var.a(cx0Var.f());
        return ww0Var;
    }
}
