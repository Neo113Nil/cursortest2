package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i6 extends v00 implements mu {
    public final /* synthetic */ yf0[] e;
    public final /* synthetic */ j6 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(yf0[] yf0VarArr, j6 j6Var, int i, int i2) {
        super(1);
        this.e = yf0VarArr;
        this.f = j6Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        xf0 xf0Var = (xf0) obj;
        for (yf0 yf0Var : this.e) {
            if (yf0Var != null) {
                long a = this.f.a.b.a(px0.c(yf0Var.d, yf0Var.e), px0.c(this.g, this.h), c10.d);
                xf0.g(xf0Var, yf0Var, (int) (a >> 32), (int) (a & 4294967295L));
            }
        }
        return ky0.a;
    }
}
