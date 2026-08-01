package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w21 extends v00 implements mu {
    public final /* synthetic */ x21 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ yf0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ f40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(x21 x21Var, int i, yf0 yf0Var, int i2, f40 f40Var) {
        super(1);
        this.e = x21Var;
        this.f = i;
        this.g = yf0Var;
        this.h = i2;
        this.i = f40Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        qu quVar = this.e.s;
        yf0 yf0Var = this.g;
        xf0.i((xf0) obj, yf0Var, ((bz) quVar.invoke(new iz(px0.c(this.f - yf0Var.d, this.h - yf0Var.e)), this.i.getLayoutDirection())).a);
        return ky0.a;
    }
}
