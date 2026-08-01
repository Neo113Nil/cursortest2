package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f9 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ g9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9(g9 g9Var, int i) {
        super(0);
        this.e = i;
        this.f = g9Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        g9 g9Var = this.f;
        switch (i) {
            case 0:
                g9Var.l0();
                break;
            default:
                s50 s50Var = g9Var.r;
                s50Var.getClass();
                sy syVar = (sy) s50Var;
                b11 b11Var = (b11) g9Var.A(j21.a);
                b11 b11Var2 = syVar.a;
                syVar.b.setValue(new uq(b11Var2, b11Var));
                syVar.c.setValue(new jy0(b11Var, b11Var2));
                break;
        }
        return ky0Var;
    }
}
