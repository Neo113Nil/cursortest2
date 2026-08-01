package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class so0 extends v00 implements mu {
    public final /* synthetic */ to0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ yf0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(to0 to0Var, int i, yf0 yf0Var) {
        super(1);
        this.e = to0Var;
        this.f = i;
        this.g = yf0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        xf0 xf0Var = (xf0) obj;
        to0 to0Var = this.e;
        int i = -rg0.g(to0Var.r.a.g(), 0, this.f);
        boolean z = to0Var.s;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        xf0Var.d = true;
        xf0.l(xf0Var, this.g, i2, i);
        xf0Var.d = false;
        return ky0.a;
    }
}
