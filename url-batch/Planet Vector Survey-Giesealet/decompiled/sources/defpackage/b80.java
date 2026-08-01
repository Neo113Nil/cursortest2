package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b80 extends v00 implements mu {
    public final /* synthetic */ cj0 e;
    public final /* synthetic */ cj0 f;
    public final /* synthetic */ s80 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ h8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(cj0 cj0Var, cj0 cj0Var2, s80 s80Var, boolean z, h8 h8Var) {
        super(1);
        this.e = cj0Var;
        this.f = cj0Var2;
        this.g = s80Var;
        this.h = z;
        this.i = h8Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        y70 y70Var = (y70) obj;
        y70Var.getClass();
        this.e.d = true;
        this.f.d = true;
        this.g.n(y70Var, this.h, this.i);
        return ky0.a;
    }
}
