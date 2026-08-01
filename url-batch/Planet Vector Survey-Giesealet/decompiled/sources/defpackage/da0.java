package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class da0 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ ea0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da0(ea0 ea0Var, int i) {
        super(0);
        this.e = i;
        this.f = ea0Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        ea0 ea0Var = this.f;
        switch (i) {
            case 0:
                kc kcVar = ea0Var.H;
                kcVar.getClass();
                ea0Var.p0(kcVar, ea0Var.G);
                return ky0Var;
            case 1:
                ea0 ea0Var2 = ea0Var.t;
                if (ea0Var2 != null) {
                    ea0Var2.C0();
                }
                return ky0Var;
            default:
                if (!ea0Var.v0().q) {
                    ea0Var = null;
                }
                if (ea0Var != null) {
                    return od0.b(0L, px0.W(ea0Var.f));
                }
                return null;
        }
    }
}
