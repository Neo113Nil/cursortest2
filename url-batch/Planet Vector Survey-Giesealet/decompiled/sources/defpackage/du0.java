package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class du0 extends v00 implements mu {
    public final /* synthetic */ gj0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ x6 g;
    public final /* synthetic */ i7 h;
    public final /* synthetic */ d7 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ mu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(gj0 gj0Var, Object obj, x6 x6Var, i7 i7Var, d7 d7Var, float f, mu muVar) {
        super(1);
        this.e = gj0Var;
        this.f = obj;
        this.g = x6Var;
        this.h = i7Var;
        this.i = d7Var;
        this.j = f;
        this.k = muVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        long longValue = ((Number) obj).longValue();
        x6 x6Var = this.g;
        b7 b7Var = new b7(this.f, x6Var.d(), this.h, longValue, x6Var.e(), longValue, new cu0(this.i, 0));
        ze0.f(b7Var, longValue, this.j, this.g, this.i, this.k);
        this.e.d = b7Var;
        return ky0.a;
    }
}
