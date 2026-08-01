package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mb0 extends oc0 {
    public static final mb0 c = new mb0(0, 2, 1);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        gz gzVar = (gz) qc0Var.b(1);
        int i = gzVar != null ? gzVar.a : 0;
        rc rcVar = (rc) qc0Var.b(0);
        if (i > 0) {
            u7Var = new sa0(u7Var, i);
        }
        rcVar.N(u7Var, mr0Var, ca0Var, pc0Var != null ? new j3(8, pc0Var, mr0Var) : null);
    }
}
