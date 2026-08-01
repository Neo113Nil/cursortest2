package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nb extends v00 implements qu {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(long j, id0 id0Var, eg egVar) {
        super(2);
        this.f = j;
        this.g = id0Var;
        this.h = egVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj;
                int i2 = 2;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar = (qh) ihVar;
                    if (qhVar.z()) {
                        qhVar.Q();
                        break;
                    }
                }
                ze0.a(this.f, ((dy0) ((qh) ihVar).j(ey0.a)).m, a50.E(1327513942, new w3(i2, (id0) obj4, (eg) obj3), ihVar), ihVar, 384);
                break;
            case 1:
                ((Number) obj2).intValue();
                int v = yc0.v(3121);
                uw.a((ax) obj4, (u50) obj3, this.f, (ih) obj, v);
                break;
            default:
                ((Number) obj2).intValue();
                int v2 = yc0.v(385);
                long j = this.f;
                ze0.a(j, (dw0) obj4, (eg) obj3, (ih) obj, v2);
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(long j, dw0 dw0Var, eg egVar, int i) {
        super(2);
        this.f = j;
        this.g = dw0Var;
        this.h = egVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(ax axVar, u50 u50Var, long j, int i) {
        super(2);
        this.g = axVar;
        this.h = u50Var;
        this.f = j;
    }
}
