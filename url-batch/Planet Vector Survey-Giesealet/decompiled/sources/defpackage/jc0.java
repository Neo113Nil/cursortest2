package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jc0 extends oc0 {
    public static final jc0 c = new jc0(1, 0, 2);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        int a = qc0Var.a(0);
        int i = mr0Var.v;
        int L = mr0Var.L(mr0Var.b, mr0Var.q(i));
        int g = mr0Var.g(mr0Var.b, mr0Var.q(i + 1));
        for (int max = Math.max(L, g - a); max < g; max++) {
            Object obj = mr0Var.c[mr0Var.h(max)];
            if (obj instanceof dk0) {
                ca0Var.g((dk0) obj);
            } else if (obj instanceof ri0) {
                ((ri0) obj).c();
            }
        }
        if (a <= 0) {
            th.c("Check failed");
        }
        int i2 = mr0Var.v;
        int L2 = mr0Var.L(mr0Var.b, mr0Var.q(i2));
        int g2 = mr0Var.g(mr0Var.b, mr0Var.q(i2 + 1)) - a;
        if (g2 < L2) {
            th.c("Check failed");
        }
        mr0Var.H(g2, a, i2);
        int i3 = mr0Var.i;
        if (i3 >= L2) {
            mr0Var.i = i3 - a;
        }
    }
}
