package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e6 extends v00 implements ru {
    public final /* synthetic */ gs0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ p6 g;
    public final /* synthetic */ eg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(gs0 gs0Var, Object obj, p6 p6Var, eg egVar) {
        super(3);
        this.e = gs0Var;
        this.f = obj;
        this.g = p6Var;
        this.h = egVar;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        v6 v6Var = (v6) obj;
        ih ihVar = (ih) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((qh) ihVar).f(v6Var) : ((qh) ihVar).h(v6Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            qh qhVar = (qh) ihVar;
            if (qhVar.z()) {
                qhVar.Q();
                return ky0.a;
            }
        }
        qh qhVar2 = (qh) ihVar;
        gs0 gs0Var = this.e;
        boolean f = qhVar2.f(gs0Var);
        Object obj4 = this.f;
        boolean h = f | qhVar2.h(obj4);
        p6 p6Var = this.g;
        boolean h2 = h | qhVar2.h(p6Var);
        Object K = qhVar2.K();
        y7 y7Var = hh.a;
        if (h2 || K == y7Var) {
            K = new y5(gs0Var, obj4, p6Var, 1);
            qhVar2.e0(K);
        }
        mz.h(v6Var, (mu) K, qhVar2);
        a70 a70Var = p6Var.d;
        v6Var.getClass();
        a70Var.m(obj4, ((w6) v6Var).a);
        Object K2 = qhVar2.K();
        if (K2 == y7Var) {
            K2 = new l6();
            qhVar2.e0(K2);
        }
        this.h.f((l6) K2, obj4, qhVar2, 0);
        return ky0.a;
    }
}
