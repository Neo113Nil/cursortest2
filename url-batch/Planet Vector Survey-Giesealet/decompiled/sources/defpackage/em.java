package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class em extends v00 implements qu {
    public final /* synthetic */ y70 e;
    public final /* synthetic */ lm f;
    public final /* synthetic */ wm0 g;
    public final /* synthetic */ gs0 h;
    public final /* synthetic */ km i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(y70 y70Var, lm lmVar, wm0 wm0Var, gs0 gs0Var, km kmVar) {
        super(2);
        this.e = y70Var;
        this.f = lmVar;
        this.g = wm0Var;
        this.h = gs0Var;
        this.i = kmVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ih ihVar = (ih) obj;
        int i = 3;
        if ((((Number) obj2).intValue() & 3) == 2) {
            qh qhVar = (qh) ihVar;
            if (qhVar.z()) {
                qhVar.Q();
                return ky0.a;
            }
        }
        qh qhVar2 = (qh) ihVar;
        y70 y70Var = this.e;
        boolean h = qhVar2.h(y70Var);
        lm lmVar = this.f;
        boolean f = h | qhVar2.f(lmVar);
        Object K = qhVar2.K();
        if (f || K == hh.a) {
            K = new y5(this.h, y70Var, lmVar, 3);
            qhVar2.e0(K);
        }
        mz.h(y70Var, (mu) K, qhVar2);
        nz.f(y70Var, this.g, a50.E(-497631156, new w3(i, this.i, y70Var), qhVar2), qhVar2, 384);
        return ky0.a;
    }
}
