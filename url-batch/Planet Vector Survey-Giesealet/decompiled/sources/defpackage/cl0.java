package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cl0 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ dl0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl0(dl0 dl0Var, int i) {
        super(1);
        this.e = i;
        this.f = dl0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        dl0 dl0Var = this.f;
        switch (i) {
            case 0:
                return Double.valueOf(dl0Var.n.b(rg0.e(((Number) obj).doubleValue(), dl0Var.e, dl0Var.f)));
            default:
                return Double.valueOf(rg0.e(dl0Var.k.b(((Number) obj).doubleValue()), dl0Var.e, dl0Var.f));
        }
    }
}
