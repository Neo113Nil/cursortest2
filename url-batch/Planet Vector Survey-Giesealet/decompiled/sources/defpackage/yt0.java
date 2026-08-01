package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yt0 extends v00 implements qu {
    public final /* synthetic */ u50 e;
    public final /* synthetic */ rq0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ z9 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ qu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(u50 u50Var, rq0 rq0Var, long j, float f, z9 z9Var, float f2, qu quVar) {
        super(2);
        this.e = u50Var;
        this.f = rq0Var;
        this.g = j;
        this.h = f;
        this.i = z9Var;
        this.j = f2;
        this.k = quVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ih ihVar = (ih) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        ky0 ky0Var = ky0.a;
        if (intValue == 2) {
            qh qhVar = (qh) ihVar;
            if (qhVar.z()) {
                qhVar.Q();
                return ky0Var;
            }
        }
        long c = au0.c(this.g, this.h, ihVar);
        qh qhVar2 = (qh) ihVar;
        u50 b = au0.b(this.e, this.f, c, this.i, ((sl) qhVar2.j(hi.h)).o(this.j));
        j80 j80Var = j80.B;
        AtomicInteger atomicInteger = op0.a;
        u50 c2 = b.c(new AppendedSemanticsElement(j80Var));
        m5 m5Var = new m5(2, null, 2);
        qg0 qg0Var = hu0.a;
        u50 c3 = c2.c(new SuspendPointerInputElement(ky0Var, null, new gu0(m5Var), 6));
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
        this.k.invoke(qhVar2, 0);
        qhVar2.q(true);
        return ky0Var;
    }
}
