package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fm0 extends v00 implements mu {
    public final /* synthetic */ yf0[] e;
    public final /* synthetic */ gm0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm0(yf0[] yf0VarArr, gm0 gm0Var, int i, int[] iArr) {
        super(1);
        this.e = yf0VarArr;
        this.f = gm0Var;
        this.g = i;
        this.h = iArr;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        xf0 xf0Var = (xf0) obj;
        yf0[] yf0VarArr = this.e;
        int length = yf0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            yf0 yf0Var = yf0VarArr[i];
            yf0Var.getClass();
            yf0Var.f();
            xf0.g(xf0Var, yf0Var, this.h[i2], Math.round((1.0f + this.f.b.a) * ((this.g - yf0Var.e) / 2.0f)));
            i++;
            i2++;
        }
        return ky0.a;
    }
}
