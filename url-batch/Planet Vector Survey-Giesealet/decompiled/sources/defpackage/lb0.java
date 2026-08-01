package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lb0 extends oc0 {
    public static final lb0 c = new lb0(0, 2, 1);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        h2 h2Var = (h2) qc0Var.b(0);
        Object b = qc0Var.b(1);
        if (b instanceof dk0) {
            dk0 dk0Var = (dk0) b;
            ca0Var.c.b(dk0Var);
            ((b70) ca0Var.g).a(dk0Var);
        }
        if (mr0Var.n != 0) {
            th.c("Can only append a slot if not current inserting");
        }
        int i = mr0Var.i;
        int i2 = mr0Var.j;
        int c2 = mr0Var.c(h2Var);
        int g = mr0Var.g(mr0Var.b, mr0Var.q(c2 + 1));
        mr0Var.i = g;
        mr0Var.j = g;
        mr0Var.v(1, c2);
        if (i >= g) {
            i++;
            i2++;
        }
        mr0Var.c[g] = b;
        mr0Var.i = i;
        mr0Var.j = i2;
    }
}
