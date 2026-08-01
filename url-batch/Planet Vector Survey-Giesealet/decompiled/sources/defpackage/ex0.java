package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ex0 {
    public static final u10 a = x40.H(w10.d, gi.D);

    public static final xw0 a(cx0 cx0Var, j3 j3Var, String str, ih ihVar, int i, int i2) {
        ww0 ww0Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f = ((qh) ihVar).f(cx0Var);
        qh qhVar = (qh) ihVar;
        Object K = qhVar.K();
        y7 y7Var = hh.a;
        if (f || K == y7Var) {
            K = new xw0(cx0Var, j3Var, str);
            qhVar.e0(K);
        }
        xw0 xw0Var = (xw0) K;
        boolean f2 = qhVar.f(cx0Var) | qhVar.h(xw0Var);
        Object K2 = qhVar.K();
        if (f2 || K2 == y7Var) {
            K2 = new y3(22, cx0Var, xw0Var);
            qhVar.e0(K2);
        }
        mz.h(xw0Var, (mu) K2, qhVar);
        if (cx0Var.g() && (ww0Var = (ww0) xw0Var.b.getValue()) != null) {
            cx0 cx0Var2 = xw0Var.c;
            ww0Var.d.f(ww0Var.f.c(cx0Var2.f().b()), ww0Var.f.c(cx0Var2.f().c()), (er) ww0Var.e.c(cx0Var2.f()));
        }
        return xw0Var;
    }
}
