package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class zk0 implements hn {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ zk0(dl0 dl0Var, int i) {
        this.a = i;
        this.b = dl0Var;
    }

    @Override // defpackage.hn
    public final double b(double d) {
        int i = this.a;
        dl0 dl0Var = this.b;
        switch (i) {
            case 0:
                return rg0.e(dl0Var.k.b(d), dl0Var.e, dl0Var.f);
            default:
                return dl0Var.n.b(rg0.e(d, dl0Var.e, dl0Var.f));
        }
    }
}
