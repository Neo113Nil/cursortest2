package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2, Object obj) {
        super(2);
        this.e = i2;
        this.f = obj;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        r50 r50Var = r50.a;
        boolean z = false;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj;
                int intValue = ((Number) obj2).intValue();
                qh qhVar = (qh) ihVar;
                if (qhVar.N(intValue & 1, (intValue & 3) != 2)) {
                    ((k) obj3).b(qhVar, 0);
                } else {
                    qhVar.Q();
                }
                return ky0Var;
            case 1:
                ih ihVar2 = (ih) obj;
                int intValue2 = ((Number) obj2).intValue();
                qh qhVar2 = (qh) ihVar2;
                if (qhVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = qhVar2.K();
                    if (K == hh.a) {
                        K = o1.k;
                        qhVar2.e0(K);
                    }
                    AtomicInteger atomicInteger = op0.a;
                    x40.j(new AppendedSemanticsElement((mu) K), (qu) ((f70) obj3).getValue(), qhVar2, 0);
                } else {
                    qhVar2.Q();
                }
                return ky0Var;
            case 2:
                cq cqVar = (cq) obj;
                cq cqVar2 = (cq) obj2;
                cq cqVar3 = cq.f;
                if (cqVar == cqVar3 && cqVar2 == cqVar3 && !((wq) obj3).a.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ih ihVar3 = (ih) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar3 = (qh) ihVar3;
                    if (qhVar3.z()) {
                        qhVar3.Q();
                        return ky0Var;
                    }
                }
                eg egVar = (eg) obj3;
                we a = ue.a(nz.b, b2.p, ihVar3, 0);
                int A = px0.A(ihVar3);
                gf0 l = ((qh) ihVar3).l();
                u50 D = nk.D(ihVar3, r50Var);
                eh.b.getClass();
                gi giVar = dh.b;
                qh qhVar4 = (qh) ihVar3;
                qhVar4.X();
                if (qhVar4.Q) {
                    qhVar4.k(giVar);
                } else {
                    qhVar4.h0();
                }
                ld0.r(ihVar3, dh.e, a);
                ld0.r(ihVar3, dh.d, l);
                h6 h6Var = dh.f;
                if (qhVar4.Q || !nz.l(qhVar4.K(), Integer.valueOf(A))) {
                    y6.y(A, qhVar4, A, h6Var);
                }
                ld0.r(ihVar3, dh.c, D);
                egVar.b(ye.a, ihVar3, 6);
                qhVar4.q(true);
                return ky0Var;
            case 4:
                ((Number) obj2).intValue();
                ((fh) obj3).b((ih) obj, yc0.v(1));
                return ky0Var;
            case 5:
                u50 u50Var = (u50) obj;
                u50 u50Var2 = (s50) obj2;
                ih ihVar4 = (ih) obj3;
                if (u50Var2 instanceof gh) {
                    ru ruVar = ((gh) u50Var2).t;
                    px0.k(3, ruVar);
                    u50Var2 = nk.C(ihVar4, (u50) ruVar.b(r50Var, ihVar4, 0));
                }
                return u50Var.c(u50Var2);
            case 6:
                ((Number) obj2).intValue();
                a50.a((lm) obj3, (ih) obj, yc0.v(1));
                return ky0Var;
            case 7:
                ((Number) obj2).intValue();
                ((jm) obj3).b((ih) obj, yc0.v(1));
                return ky0Var;
            case 8:
                ((Number) obj2).intValue();
                ((zx) obj3).a((ih) obj, yc0.v(1));
                return ky0Var;
            case 9:
                qo0 qo0Var = (qo0) obj3;
                d31.E(qo0Var.V(), null, new po0(qo0Var, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            default:
                return new bz(((o9) obj3).a(0L, ((iz) obj).a, (c10) obj2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj) {
        super(2);
        this.e = i;
        this.f = obj;
    }
}
