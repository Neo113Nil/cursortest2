package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xb0 extends oc0 {
    public static final xb0 d;
    public static final xb0 e;
    public static final xb0 f;
    public static final xb0 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new xb0(i, 2, 0);
        int i2 = 1;
        e = new xb0(i2, i2, 1);
        f = new xb0(i, 2, 2);
        int i3 = 1;
        g = new xb0(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb0(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        switch (this.c) {
            case 0:
                Object a = ((bu) qc0Var.b(0)).a();
                h2 h2Var = (h2) qc0Var.b(1);
                int a2 = qc0Var.a(0);
                h2Var.getClass();
                mr0Var.S(mr0Var.c(h2Var), a);
                u7Var.e(a2, a);
                u7Var.c(a);
                break;
            case 1:
                h2 h2Var2 = (h2) qc0Var.b(0);
                int a3 = qc0Var.a(0);
                u7Var.l();
                h2Var2.getClass();
                u7Var.b(a3, mr0Var.B(mr0Var.c(h2Var2)));
                break;
            case 2:
                Object b = qc0Var.b(0);
                h2 h2Var3 = (h2) qc0Var.b(1);
                int a4 = qc0Var.a(0);
                if (b instanceof dk0) {
                    dk0 dk0Var = (dk0) b;
                    ca0Var.c.b(dk0Var);
                    ((b70) ca0Var.g).a(dk0Var);
                }
                Object I = mr0Var.I(mr0Var.c(h2Var3), a4, b);
                if (!(I instanceof dk0)) {
                    if (I instanceof ri0) {
                        ((ri0) I).c();
                        break;
                    }
                } else {
                    ca0Var.g((dk0) I);
                    break;
                }
                break;
            default:
                Object b2 = qc0Var.b(0);
                int a5 = qc0Var.a(0);
                if (b2 instanceof dk0) {
                    dk0 dk0Var2 = (dk0) b2;
                    ca0Var.c.b(dk0Var2);
                    ((b70) ca0Var.g).a(dk0Var2);
                }
                Object I2 = mr0Var.I(mr0Var.t, a5, b2);
                if (!(I2 instanceof dk0)) {
                    if (I2 instanceof ri0) {
                        ((ri0) I2).c();
                        break;
                    }
                } else {
                    ca0Var.g((dk0) I2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oc0
    public h2 b(qc0 qc0Var) {
        switch (this.c) {
            case 0:
                return (h2) qc0Var.b(1);
            case 1:
                return (h2) qc0Var.b(0);
            default:
                return super.b(qc0Var);
        }
    }
}
