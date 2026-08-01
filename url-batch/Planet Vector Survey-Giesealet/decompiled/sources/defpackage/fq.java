package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fq extends v00 implements mu {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ bu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(boolean z, bu buVar) {
        super(1);
        this.e = z;
        this.f = buVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        wk0 wk0Var = (wk0) obj;
        boolean z = !this.e && ((Boolean) this.f.a()).booleanValue();
        if (wk0Var.n != z) {
            wk0Var.d |= 16384;
            wk0Var.n = z;
        }
        return ky0.a;
    }
}
