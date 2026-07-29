package o;

import java.util.List;

/* renamed from: o.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2373zk implements InterfaceC2308yl {
    @Override // o.InterfaceC2308yl
    public final int a(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92, InterfaceC1245ib interfaceC1245ib) {
        AbstractC0048Bt.n(interfaceC2072v9, "superDescriptor");
        AbstractC0048Bt.n(interfaceC2072v92, "subDescriptor");
        if (!(interfaceC2072v92 instanceof C0934du)) {
            return 4;
        }
        C0934du c0934du = (C0934du) interfaceC2072v92;
        if (!c0934du.getTypeParameters().isEmpty()) {
            return 4;
        }
        WG i = XG.i(interfaceC2072v9, interfaceC2072v92);
        if ((i != null ? i.c() : 0) != 0) {
            return 4;
        }
        List t0 = c0934du.t0();
        AbstractC0048Bt.m(t0, "subDescriptor.valueParameters");
        C1831rW z = PQ.z(AbstractC0720ac.i0(t0), I2.D);
        AbstractC1004ey abstractC1004ey = c0934du.n;
        AbstractC0048Bt.k(abstractC1004ey);
        C1716pm w = PQ.w(P6.X(new NQ[]{z, new T6(3, abstractC1004ey)}));
        C0261Jy c0261Jy = c0934du.p;
        C0663Zl c0663Zl = new C0663Zl(PQ.w(P6.X(new NQ[]{w, AbstractC0720ac.i0(AbstractC0868ct.L(c0261Jy != null ? c0261Jy.c() : null))})));
        while (c0663Zl.hasNext()) {
            AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) c0663Zl.next();
            if (!abstractC1004ey2.w0().isEmpty() && !(abstractC1004ey2.E0() instanceof C2216xL)) {
                return 4;
            }
        }
        InterfaceC2072v9 interfaceC2072v93 = (InterfaceC2072v9) interfaceC2072v9.e(new C2096vX(new C2150wL()));
        if (interfaceC2072v93 == null) {
            return 4;
        }
        if (interfaceC2072v93 instanceof HR) {
            HR hr = (HR) interfaceC2072v93;
            if (!hr.getTypeParameters().isEmpty()) {
                interfaceC2072v93 = hr.m0().s().build();
                AbstractC0048Bt.k(interfaceC2072v93);
            }
        }
        int c = XG.c.n(interfaceC2072v93, interfaceC2072v92, false).c();
        AbstractC1888sN.t(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
        return AbstractC2307yk.a[AbstractC1888sN.v(c)] == 1 ? 1 : 4;
    }

    @Override // o.InterfaceC2308yl
    public final int b() {
        return 2;
    }
}
