package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.wL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2150wL extends AbstractC1964tX {
    public static final C1658ou c = AbstractC1305jX.J(2, false, null, 5).b(3);
    public static final C1658ou d = AbstractC1305jX.J(2, false, null, 5).b(2);
    public final C0208Hx b = new C0208Hx(new C0218Ih(19));

    @Override // o.AbstractC1964tX
    public final AbstractC1701pX d(AbstractC1004ey abstractC1004ey) {
        return new C1767qX(h(abstractC1004ey, new C1658ou(2, false, false, null, 62)));
    }

    public final C1619oH g(JR jr, InterfaceC1245ib interfaceC1245ib, C1658ou c1658ou) {
        if (jr.B0().getParameters().isEmpty()) {
            return new C1619oH(jr, Boolean.FALSE);
        }
        if (AbstractC0545Ux.y(jr)) {
            AbstractC1701pX abstractC1701pX = (AbstractC1701pX) jr.w0().get(0);
            int a = abstractC1701pX.a();
            AbstractC1004ey b = abstractC1701pX.b();
            AbstractC0048Bt.m(b, "componentTypeProjection.type");
            return new C1619oH(HO.r(AbstractC0868ct.J(new C1767qX(a, h(b, c1658ou))), jr.A0(), jr.B0(), jr.C0()), Boolean.FALSE);
        }
        if (AbstractC1473m3.P(jr)) {
            return new C1619oH(C0273Kk.c(EnumC0247Jk.u, jr.B0().toString()), Boolean.FALSE);
        }
        WB d0 = interfaceC1245ib.d0(this);
        AbstractC0048Bt.m(d0, "declaration.getMemberScope(this)");
        OW A0 = jr.A0();
        SW z = interfaceC1245ib.z();
        AbstractC0048Bt.m(z, "declaration.typeConstructor");
        List<InterfaceC1437lX> parameters = interfaceC1245ib.z().getParameters();
        AbstractC0048Bt.m(parameters, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters));
        for (InterfaceC1437lX interfaceC1437lX : parameters) {
            AbstractC0048Bt.m(interfaceC1437lX, "parameter");
            C0208Hx c0208Hx = this.b;
            arrayList.add(C0218Ih.f(interfaceC1437lX, c1658ou, c0208Hx, c0208Hx.O0(interfaceC1437lX, c1658ou)));
        }
        return new C1619oH(HO.t(A0, z, arrayList, jr.C0(), d0, new C2084vL(interfaceC1245ib, this, jr, c1658ou)), Boolean.TRUE);
    }

    public final AbstractC1004ey h(AbstractC1004ey abstractC1004ey, C1658ou c1658ou) {
        InterfaceC2364zb c2 = abstractC1004ey.B0().c();
        if (c2 instanceof InterfaceC1437lX) {
            c1658ou.getClass();
            return h(this.b.O0((InterfaceC1437lX) c2, C1658ou.a(c1658ou, 0, true, null, null, 59)), c1658ou);
        }
        if (!(c2 instanceof InterfaceC1245ib)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + c2).toString());
        }
        InterfaceC2364zb c3 = AbstractC0868ct.a0(abstractC1004ey).B0().c();
        if (c3 instanceof InterfaceC1245ib) {
            C1619oH g = g(AbstractC0868ct.M(abstractC1004ey), (InterfaceC1245ib) c2, c);
            JR jr = (JR) g.h;
            boolean booleanValue = ((Boolean) g.i).booleanValue();
            C1619oH g2 = g(AbstractC0868ct.a0(abstractC1004ey), (InterfaceC1245ib) c3, d);
            JR jr2 = (JR) g2.h;
            return (booleanValue || ((Boolean) g2.i).booleanValue()) ? new C2216xL(jr, jr2) : HO.m(jr, jr2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + c3 + "\" while for lower it's \"" + c2 + '\"').toString());
    }
}
