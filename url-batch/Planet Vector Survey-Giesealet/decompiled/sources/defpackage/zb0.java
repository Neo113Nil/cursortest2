package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zb0 extends oc0 {
    public static final zb0 c = new zb0(0, 3, 1);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        j3 j3Var;
        jr0 jr0Var = (jr0) qc0Var.b(1);
        h2 h2Var = (h2) qc0Var.b(0);
        gr grVar = (gr) qc0Var.b(2);
        mr0 d = jr0Var.d();
        if (pc0Var != null) {
            try {
                j3Var = new j3(8, pc0Var, mr0Var);
            } catch (Throwable th) {
                d.e(false);
                throw th;
            }
        } else {
            j3Var = null;
        }
        if (!grVar.i.P()) {
            th.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        grVar.h.O(u7Var, d, ca0Var, j3Var);
        d.e(true);
        mr0Var.d();
        h2Var.getClass();
        mr0Var.y(jr0Var, jr0Var.a(h2Var));
        mr0Var.k();
    }
}
