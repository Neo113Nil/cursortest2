package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class go0 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ ho0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go0(ho0 ho0Var, int i) {
        super(0);
        this.e = i;
        this.f = ho0Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        ho0 ho0Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(ho0Var.a.g() > 0);
            default:
                return Boolean.valueOf(ho0Var.a.g() < ho0Var.d.g());
        }
    }
}
