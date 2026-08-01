package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class em0 {
    public static final gm0 a = new gm0(nz.a, b2.n);

    public static final gm0 a(x7 x7Var, n9 n9Var, ih ihVar, int i) {
        if (x7Var.equals(nz.a) && n9Var.equals(b2.n)) {
            qh qhVar = (qh) ihVar;
            qhVar.V(-849081669);
            qhVar.q(false);
            return a;
        }
        qh qhVar2 = (qh) ihVar;
        qhVar2.V(-849030798);
        boolean z = (((i & 112) ^ 48) > 32 && qhVar2.f(n9Var)) || (i & 48) == 32;
        Object K = qhVar2.K();
        if (z || K == hh.a) {
            K = new gm0(x7Var, n9Var);
            qhVar2.e0(K);
        }
        gm0 gm0Var = (gm0) K;
        qhVar2.q(false);
        return gm0Var;
    }
}
