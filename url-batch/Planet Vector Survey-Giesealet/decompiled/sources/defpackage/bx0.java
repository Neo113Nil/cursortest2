package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bx0 extends v00 implements mu {
    public final /* synthetic */ cx0 e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(cx0 cx0Var, float f) {
        super(1);
        this.e = cx0Var;
        this.f = f;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        long longValue = ((Number) obj).longValue();
        cx0 cx0Var = this.e;
        boolean g = cx0Var.g();
        ae0 ae0Var = cx0Var.g;
        if (!g) {
            if (ae0Var.g() == Long.MIN_VALUE) {
                ae0Var.h(longValue);
                ((ce0) cx0Var.a.a).setValue(Boolean.TRUE);
            }
            long g2 = longValue - ae0Var.g();
            float f = this.f;
            if (f != 0.0f) {
                g2 = a50.J(g2 / f);
            }
            cx0Var.o(g2);
            cx0Var.h(g2, f == 0.0f);
        }
        return ky0.a;
    }
}
