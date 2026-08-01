package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class eo0 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ fo0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo0(fo0 fo0Var, int i) {
        super(0);
        this.e = i;
        this.f = fo0Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        fo0 fo0Var = this.f;
        switch (i) {
            case 0:
                return Float.valueOf(fo0Var.r.a.g());
            default:
                return Float.valueOf(fo0Var.r.d.g());
        }
    }
}
