package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ue {
    public static final we a = new we(nz.b, b2.p);

    public static final we a(a8 a8Var, m9 m9Var, ih ihVar, int i) {
        if (a8Var.equals(nz.b) && m9Var.equals(b2.p)) {
            qh qhVar = (qh) ihVar;
            qhVar.V(345962472);
            qhVar.q(false);
            return a;
        }
        qh qhVar2 = (qh) ihVar;
        qhVar2.V(346016319);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && qhVar2.f(a8Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !qhVar2.f(m9Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object K = qhVar2.K();
        if (z3 || K == hh.a) {
            K = new we(a8Var, m9Var);
            qhVar2.e0(K);
        }
        we weVar = (we) K;
        qhVar2.q(false);
        return weVar;
    }
}
