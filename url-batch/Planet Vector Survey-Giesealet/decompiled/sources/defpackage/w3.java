package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w3 extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((f3) obj4, (qu) obj3, (ih) obj, yc0.v(1));
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                rp0 rp0Var = (rp0) obj2;
                e4 e4Var = (e4) obj3;
                if (!((sp0) obj4).b.b(rp0Var.g)) {
                    e4Var.o(intValue, rp0Var);
                    e4Var.k.r(ky0Var);
                    break;
                }
                break;
            case 2:
                ih ihVar = (ih) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar = (qh) ihVar;
                    if (qhVar.z()) {
                        qhVar.Q();
                        break;
                    }
                }
                u50 a = b.a(c.a(jb.b, jb.c), (id0) obj4);
                eg egVar = (eg) obj3;
                gm0 a2 = em0.a(nz.c, b2.o, ihVar, 54);
                int A = px0.A(ihVar);
                gf0 l = ((qh) ihVar).l();
                u50 D = nk.D(ihVar, a);
                eh.b.getClass();
                gi giVar = dh.b;
                qh qhVar2 = (qh) ihVar;
                qhVar2.X();
                if (qhVar2.Q) {
                    qhVar2.k(giVar);
                } else {
                    qhVar2.h0();
                }
                ld0.r(ihVar, dh.e, a2);
                ld0.r(ihVar, dh.d, l);
                h6 h6Var = dh.f;
                if (qhVar2.Q || !nz.l(qhVar2.K(), Integer.valueOf(A))) {
                    y6.y(A, qhVar2, A, h6Var);
                }
                ld0.r(ihVar, dh.c, D);
                egVar.b(im0.a, ihVar, 6);
                qhVar2.q(true);
                break;
            case 3:
                ih ihVar2 = (ih) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar3 = (qh) ihVar2;
                    if (qhVar3.z()) {
                        qhVar3.Q();
                        break;
                    }
                }
                ((km) obj4).n.b((y70) obj3, ihVar2, 0);
                break;
            case 4:
                ((Number) obj2).intValue();
                a50.e((List) obj4, (Collection) obj3, (ih) obj, yc0.v(1));
                break;
            case 5:
                long j = ((ra0) obj2).a;
                ch0.a((pz0) obj4, (wg0) obj);
                eb ebVar = ((qo0) obj3).x;
                if (ebVar != null) {
                    ebVar.r(new pn(j));
                    break;
                }
                break;
            case 6:
                ih ihVar3 = (ih) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar4 = (qh) ihVar3;
                    if (qhVar4.z()) {
                        qhVar4.Q();
                        break;
                    }
                }
                pv0.a(((dy0) obj4).j, (qu) obj3, ihVar3, 0);
                break;
            case 7:
                ih ihVar4 = (ih) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar5 = (qh) ihVar4;
                    if (qhVar5.z()) {
                        qhVar5.Q();
                        break;
                    }
                }
                nz.g((wm0) obj4, (eg) obj3, ihVar4, 0);
                break;
            case 8:
                ih ihVar5 = (ih) obj;
                y70 y70Var = (y70) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    qh qhVar6 = (qh) ihVar5;
                    if (qhVar6.z()) {
                        qhVar6.Q();
                        break;
                    }
                }
                m80 m80Var = y70Var.e;
                m80Var.getClass();
                ((qg) m80Var).m.f((k6) obj3, y70Var, ihVar5, 0);
                break;
            case 9:
                kc kcVar = (kc) obj;
                nv nvVar = (nv) obj2;
                ea0 ea0Var = (ea0) obj4;
                p10 p10Var = ea0Var.r;
                if (!p10Var.C()) {
                    ea0Var.K = true;
                    break;
                } else {
                    ea0Var.H = kcVar;
                    ea0Var.G = nvVar;
                    fd0 snapshotObserver = ((f3) mz.Q(p10Var)).getSnapshotObserver();
                    wk0 wk0Var = ea0.M;
                    snapshotObserver.a(ea0Var, j80.k, (da0) obj3);
                    ea0Var.K = false;
                    break;
                }
            case 10:
                ((Number) obj2).intValue();
                pv0.a((dw0) obj4, (qu) obj3, (ih) obj, yc0.v(1));
                break;
            default:
                ((Number) obj2).intValue();
                ((cx0) obj4).a(obj3, (ih) obj, yc0.v(1));
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(int i, Object obj, Object obj2) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
