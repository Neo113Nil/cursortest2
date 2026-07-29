package o;

import java.util.List;

/* renamed from: o.Xu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620Xu extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0672Zu i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0620Xu(C0672Zu c0672Zu, int i) {
        super(0);
        this.h = i;
        this.i = c0672Zu;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        int i = this.h;
        C0672Zu c0672Zu = this.i;
        switch (i) {
            case 0:
                return c0672Zu.h.k.e();
            default:
                AbstractC0545Ux abstractC0545Ux = c0672Zu.h.k;
                C0827cE c0827cE = AbstractC1540n4.a;
                AbstractC0048Bt.n(abstractC0545Ux, "<this>");
                List J = AbstractC0868ct.J(new O8(abstractC0545Ux, AbstractC1433lT.m, EB.G(new C1619oH(AbstractC1540n4.a, new ST("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new C1619oH(AbstractC1540n4.b, new C1606o4((Object) new O8(abstractC0545Ux, AbstractC1433lT.f194o, EB.G(new C1619oH(AbstractC1540n4.d, new ST("")), new C1619oH(AbstractC1540n4.e, new O6(C1318jk.h, new C1400l(8, abstractC0545Ux))))))), new C1619oH(AbstractC1540n4.c, new C2175wk(C1639ob.j(AbstractC1433lT.n), C0827cE.e("WARNING"))))));
                return J.isEmpty() ? C0460Rq.t : new C1803r4(0, J);
        }
    }
}
