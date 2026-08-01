package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ry extends v00 implements mu {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ yf0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(int i, yf0 yf0Var, int i2) {
        super(1);
        this.f = i;
        this.g = yf0Var;
        this.h = i2;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        int i2 = this.h;
        yf0 yf0Var = this.g;
        int i3 = this.f;
        switch (i) {
            case 0:
                xf0.g((xf0) obj, yf0Var, i3, i2);
                break;
            default:
                xf0.g((xf0) obj, yf0Var, a50.H((i3 - yf0Var.d) / 2.0f), a50.H((i2 - yf0Var.e) / 2.0f));
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(yf0 yf0Var, int i, int i2) {
        super(1);
        this.g = yf0Var;
        this.f = i;
        this.h = i2;
    }
}
