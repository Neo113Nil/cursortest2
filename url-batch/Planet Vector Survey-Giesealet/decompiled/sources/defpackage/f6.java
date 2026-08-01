package defpackage;

import androidx.compose.ui.layout.a;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f6 extends v00 implements qu {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ eg f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(u50 u50Var, rq0 rq0Var, pc pcVar, qc qcVar, z9 z9Var, eg egVar, int i) {
        super(2);
        this.g = u50Var;
        this.h = rq0Var;
        this.i = pcVar;
        this.j = qcVar;
        this.k = z9Var;
        this.f = egVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj;
                mu muVar = (mu) obj5;
                p6 p6Var = (p6) obj4;
                cx0 cx0Var = (cx0) obj7;
                int i2 = 2;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar = (qh) ihVar;
                    if (qhVar.z()) {
                        qhVar.Q();
                        break;
                    }
                }
                qh qhVar2 = (qh) ihVar;
                Object K = qhVar2.K();
                Object obj8 = hh.a;
                if (K == obj8) {
                    K = (fj) muVar.c(p6Var);
                    qhVar2.e0(K);
                }
                fj fjVar = (fj) K;
                yw0 f = cx0Var.f();
                ce0 ce0Var = cx0Var.d;
                boolean g = qhVar2.g(nz.l(f.c(), obj6));
                Object K2 = qhVar2.K();
                if (g || K2 == obj8) {
                    K2 = nz.l(cx0Var.f().c(), obj6) ? wq.b : ((fj) muVar.c(p6Var)).b;
                    qhVar2.e0(K2);
                }
                wq wqVar = (wq) K2;
                Object K3 = qhVar2.K();
                if (K3 == obj8) {
                    K3 = new m6(nz.l(obj6, ce0Var.getValue()));
                    qhVar2.e0(K3);
                }
                m6 m6Var = (m6) K3;
                kq kqVar = fjVar.a;
                boolean h = qhVar2.h(fjVar);
                Object K4 = qhVar2.K();
                if (h || K4 == obj8) {
                    K4 = new c6(fjVar);
                    qhVar2.e0(K4);
                }
                u50 a = a.a((ru) K4);
                m6Var.a.setValue(Boolean.valueOf(nz.l(obj6, ce0Var.getValue())));
                u50 d = y6.d((z50) a, m6Var);
                cx0 cx0Var2 = (cx0) obj7;
                boolean h2 = qhVar2.h(obj6);
                Object K5 = qhVar2.K();
                if (h2 || K5 == obj8) {
                    K5 = new f2(5, obj6);
                    qhVar2.e0(K5);
                }
                mu muVar2 = (mu) K5;
                boolean f2 = qhVar2.f(wqVar);
                Object K6 = qhVar2.K();
                if (f2 || K6 == obj8) {
                    K6 = new j(i2, wqVar);
                    qhVar2.e0(K6);
                }
                androidx.compose.animation.a.a(cx0Var2, muVar2, d, kqVar, wqVar, (qu) K6, a50.E(-616195562, new e6((gs0) obj3, obj6, p6Var, this.f), qhVar2), qhVar2, 12582912);
                break;
            default:
                ((Number) obj2).intValue();
                px0.e((u50) obj7, (rq0) obj6, (pc) obj5, (qc) obj4, (z9) obj3, this.f, (ih) obj, yc0.v(196609));
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(cx0 cx0Var, Object obj, mu muVar, p6 p6Var, gs0 gs0Var, eg egVar) {
        super(2);
        this.g = cx0Var;
        this.h = obj;
        this.i = muVar;
        this.j = p6Var;
        this.k = gs0Var;
        this.f = egVar;
    }
}
