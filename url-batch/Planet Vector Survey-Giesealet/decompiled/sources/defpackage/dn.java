package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dn extends v00 implements bu {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ in0 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(boolean z, in0 in0Var, String str) {
        super(0);
        this.e = z;
        this.f = in0Var;
        this.g = str;
    }

    @Override // defpackage.bu
    public final Object a() {
        if (this.e) {
            in0 in0Var = this.f;
            String str = this.g;
            kn0 kn0Var = in0Var.a;
            synchronized (kn0Var.c) {
            }
        }
        return ky0.a;
    }
}
