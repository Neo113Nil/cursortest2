package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xn extends v00 implements ru {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn(int i, Object obj, Object obj2) {
        super(3);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                wg0 wg0Var = (wg0) obj;
                wg0 wg0Var2 = (wg0) obj2;
                long j = ((ra0) obj3).a;
                qo0 qo0Var = (qo0) obj5;
                if (((Boolean) qo0Var.u.c(wg0Var)).booleanValue()) {
                    if (!qo0Var.z) {
                        if (qo0Var.x == null) {
                            qo0Var.x = x40.b(Integer.MAX_VALUE, null, 6);
                        }
                        qo0Var.z = true;
                        d31.E(qo0Var.V(), null, new bo(qo0Var, null), 3);
                    }
                    ch0.a((pz0) obj4, wg0Var);
                    long g = ra0.g(wg0Var2.c, j);
                    eb ebVar = qo0Var.x;
                    if (ebVar != null) {
                        ebVar.r(new qn(g));
                    }
                }
                return ky0.a;
            default:
                ((Number) obj3).intValue();
                qh qhVar = (qh) ((ih) obj2);
                qhVar.V(-353972293);
                sx a = ((rx) obj5).a((r60) obj4, qhVar);
                boolean f = qhVar.f(a);
                Object K = qhVar.K();
                if (f || K == hh.a) {
                    K = new tx(a);
                    qhVar.e0(K);
                }
                tx txVar = (tx) K;
                qhVar.q(false);
                return txVar;
        }
    }
}
