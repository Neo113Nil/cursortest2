package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tw extends v00 implements qu {
    public final /* synthetic */ md0 e;
    public final /* synthetic */ u50 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(md0 md0Var, u50 u50Var, long j, int i) {
        super(2);
        this.e = md0Var;
        this.f = u50Var;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        uw.b(this.e, this.f, this.g, (ih) obj, yc0.v(this.h | 1));
        return ky0.a;
    }
}
