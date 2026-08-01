package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ty0 extends v00 implements mu {
    public final /* synthetic */ uy0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ mu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(uy0 uy0Var, float f, mu muVar) {
        super(1);
        this.e = uy0Var;
        this.f = f;
        this.g = muVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        long longValue = ((Number) obj).longValue();
        uy0 uy0Var = this.e;
        if (uy0Var.b == Long.MIN_VALUE) {
            uy0Var.b = longValue;
        }
        float f = uy0Var.e;
        e7 e7Var = new e7(f);
        float f2 = this.f;
        e7 e7Var2 = uy0.f;
        long m = f2 == 0.0f ? uy0Var.a.m(new e7(f), e7Var2, uy0Var.c) : a50.J((longValue - uy0Var.b) / f2);
        float f3 = ((e7) uy0Var.a.j(m, e7Var, e7Var2, uy0Var.c)).a;
        uy0Var.c = (e7) uy0Var.a.g(m, e7Var, e7Var2, uy0Var.c);
        uy0Var.b = longValue;
        float f4 = uy0Var.e - f3;
        uy0Var.e = f3;
        this.g.c(Float.valueOf(f4));
        return ky0.a;
    }
}
