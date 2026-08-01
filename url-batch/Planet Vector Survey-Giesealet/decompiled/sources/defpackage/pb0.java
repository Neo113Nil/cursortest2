package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pb0 extends oc0 {
    public static final pb0 c = new pb0(0, 2, 1);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        int i;
        gz gzVar = (gz) qc0Var.b(0);
        int c2 = mr0Var.c((h2) qc0Var.b(1));
        if (mr0Var.t >= c2) {
            th.c("Check failed");
        }
        a50.B(mr0Var, u7Var, c2);
        int i2 = mr0Var.t;
        int i3 = mr0Var.v;
        while (i3 >= 0 && !mr0Var.w(i3)) {
            i3 = mr0Var.C(mr0Var.b, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (mr0Var.t(i2, i4)) {
                if (mr0Var.w(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += mr0Var.w(i4) ? 1 : mr0Var.b[(mr0Var.q(i4) * 5) + 1] & 67108863;
                i4 += mr0Var.s(i4);
            }
        }
        while (true) {
            i = mr0Var.t;
            if (i >= c2) {
                break;
            }
            if (mr0Var.t(c2, i)) {
                int i6 = mr0Var.t;
                if (i6 < mr0Var.u && (mr0Var.b[(mr0Var.q(i6) * 5) + 1] & 1073741824) != 0) {
                    u7Var.c(mr0Var.B(mr0Var.t));
                    i5 = 0;
                }
                mr0Var.N();
            } else {
                i5 += mr0Var.J();
            }
        }
        if (i != c2) {
            th.c("Check failed");
        }
        gzVar.a = i5;
    }
}
