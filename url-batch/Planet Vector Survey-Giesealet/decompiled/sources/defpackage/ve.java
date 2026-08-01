package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ve extends v00 implements mu {
    public final /* synthetic */ yf0[] e;
    public final /* synthetic */ we f;
    public final /* synthetic */ int g;
    public final /* synthetic */ f40 h;
    public final /* synthetic */ int[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(yf0[] yf0VarArr, we weVar, int i, f40 f40Var, int[] iArr) {
        super(1);
        this.e = yf0VarArr;
        this.f = weVar;
        this.g = i;
        this.h = f40Var;
        this.i = iArr;
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
            int i3 = i2 + 1;
            yf0Var.getClass();
            yf0Var.f();
            c10 layoutDirection = this.h.getLayoutDirection();
            float f = (this.g - yf0Var.d) / 2.0f;
            float f2 = this.f.b.a;
            if (layoutDirection != c10.d) {
                f2 *= -1.0f;
            }
            xf0.g(xf0Var, yf0Var, Math.round((1.0f + f2) * f), this.i[i2]);
            i++;
            i2 = i3;
        }
        return ky0.a;
    }
}
