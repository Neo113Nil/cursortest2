package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l4 extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ yu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Object obj, yu yuVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.h = yuVar;
        this.g = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        int i2 = this.g;
        yu yuVar = this.h;
        Object obj3 = this.f;
        ih ihVar = (ih) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                x40.j((u50) obj3, (qu) yuVar, ihVar, yc0.v(i2 | 1));
                break;
            case 1:
                nz.a((u50) obj3, (mu) yuVar, ihVar, yc0.v(i2 | 1));
                break;
            default:
                nz.g((wm0) obj3, (eg) yuVar, ihVar, yc0.v(i2 | 1));
                break;
        }
        return ky0Var;
    }
}
