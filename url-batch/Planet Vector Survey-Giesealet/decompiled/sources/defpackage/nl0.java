package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class nl0 {
    public static final lt0 a = new lt0(gi.w);
    public static final ji b = new ji(gi.v);
    public static final ql0 c;
    public static final ql0 d;

    static {
        long j = ge.g;
        c = new ql0(true, Float.NaN, j);
        d = new ql0(false, Float.NaN, j);
    }

    public static final rx a(int i, ih ihVar, int i2) {
        rx ql0Var;
        boolean z = true;
        boolean z2 = (i2 & 1) != 0;
        float f = (i2 & 2) != 0 ? Float.NaN : 20.0f;
        long j = ge.g;
        qh qhVar = (qh) ihVar;
        qhVar.V(-1280632857);
        if (((Boolean) qhVar.j(a)).booleanValue()) {
            ox0 ox0Var = ol0.a;
            f70 p = ud0.p(new ge(j), qhVar);
            boolean z3 = (((i & 14) ^ 6) > 4 && qhVar.g(z2)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !qhVar.c(f)) && (i & 48) != 32) {
                z = false;
            }
            boolean z4 = z3 | z;
            Object K = qhVar.K();
            if (z4 || K == hh.a) {
                K = new mg0(z2, f, p);
                qhVar.e0(K);
            }
            ql0Var = (mg0) K;
        } else {
            ql0Var = (jn.a(f, Float.NaN) && ge.c(j, j)) ? z2 ? c : d : new ql0(z2, f, j);
        }
        qhVar.q(false);
        return ql0Var;
    }
}
