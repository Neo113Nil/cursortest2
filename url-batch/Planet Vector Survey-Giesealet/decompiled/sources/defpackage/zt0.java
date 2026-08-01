package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material3.MinimumInteractiveModifier;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zt0 extends v00 implements qu {
    public final /* synthetic */ u50 e;
    public final /* synthetic */ rq0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ z9 i;
    public final /* synthetic */ r60 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ bu l;
    public final /* synthetic */ float m;
    public final /* synthetic */ eg n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(u50 u50Var, rq0 rq0Var, long j, float f, z9 z9Var, r60 r60Var, boolean z, bu buVar, float f2, eg egVar) {
        super(2);
        this.e = u50Var;
        this.f = rq0Var;
        this.g = j;
        this.h = f;
        this.i = z9Var;
        this.j = r60Var;
        this.k = z;
        this.l = buVar;
        this.m = f2;
        this.n = egVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ih ihVar = (ih) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            qh qhVar = (qh) ihVar;
            if (qhVar.z()) {
                qhVar.Q();
                return ky0.a;
            }
        }
        lt0 lt0Var = lz.a;
        u50 c = this.e.c(MinimumInteractiveModifier.a);
        long c2 = au0.c(this.g, this.h, ihVar);
        qh qhVar2 = (qh) ihVar;
        u50 c3 = a.c(au0.b(c, this.f, c2, this.i, ((sl) qhVar2.j(hi.h)).o(this.m)), this.j, nl0.a(0, qhVar2, 7), this.k, null, this.l, 24);
        g50 e = ca.e(b2.e, true);
        int A = px0.A(qhVar2);
        gf0 l = qhVar2.l();
        u50 D = nk.D(qhVar2, c3);
        eh.b.getClass();
        gi giVar = dh.b;
        qhVar2.X();
        if (qhVar2.Q) {
            qhVar2.k(giVar);
        } else {
            qhVar2.h0();
        }
        ld0.r(qhVar2, dh.e, e);
        ld0.r(qhVar2, dh.d, l);
        h6 h6Var = dh.f;
        if (qhVar2.Q || !nz.l(qhVar2.K(), Integer.valueOf(A))) {
            y6.y(A, qhVar2, A, h6Var);
        }
        ld0.r(qhVar2, dh.c, D);
        this.n.invoke(qhVar2, 0);
        qhVar2.q(true);
        return ky0.a;
    }
}
