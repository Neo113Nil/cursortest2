package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ba extends v00 implements qu {
    public final /* synthetic */ u50 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(u50 u50Var, int i) {
        super(2);
        this.e = u50Var;
        this.f = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int v = yc0.v(this.f | 1);
        ca.a(this.e, (ih) obj, v);
        return ky0.a;
    }
}
