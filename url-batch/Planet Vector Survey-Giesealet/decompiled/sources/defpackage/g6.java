package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class g6 extends v00 implements qu {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ u50 f;
    public final /* synthetic */ eg g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(u50 u50Var, rq0 rq0Var, pc pcVar, qc qcVar, z9 z9Var, eg egVar, int i) {
        super(2);
        this.f = u50Var;
        this.i = rq0Var;
        this.j = pcVar;
        this.k = qcVar;
        this.l = z9Var;
        this.g = egVar;
        this.h = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        int i2 = this.h;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int v = yc0.v(i2 | 1);
                u50 u50Var = this.f;
                x40.a((cx0) obj6, u50Var, (mu) obj5, (o9) obj3, (mu) obj4, this.g, (ih) obj, v);
                break;
            default:
                ((Number) obj2).intValue();
                int v2 = yc0.v(i2 | 1);
                u50 u50Var2 = this.f;
                px0.a(u50Var2, (rq0) obj6, (pc) obj5, (qc) obj4, (z9) obj3, this.g, (ih) obj, v2);
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(cx0 cx0Var, u50 u50Var, mu muVar, o9 o9Var, mu muVar2, eg egVar, int i) {
        super(2);
        this.i = cx0Var;
        this.f = u50Var;
        this.j = muVar;
        this.l = o9Var;
        this.k = muVar2;
        this.g = egVar;
        this.h = i;
    }
}
