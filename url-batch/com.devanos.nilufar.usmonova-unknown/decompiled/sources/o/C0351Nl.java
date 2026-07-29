package o;

/* renamed from: o.Nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351Nl implements InterfaceC2308yl {
    @Override // o.InterfaceC2308yl
    public final int a(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92, InterfaceC1245ib interfaceC1245ib) {
        AbstractC0048Bt.n(interfaceC2072v9, "superDescriptor");
        AbstractC0048Bt.n(interfaceC2072v92, "subDescriptor");
        if (!(interfaceC2072v92 instanceof PJ) || !(interfaceC2072v9 instanceof PJ)) {
            return 4;
        }
        PJ pj = (PJ) interfaceC2072v92;
        PJ pj2 = (PJ) interfaceC2072v9;
        if (!AbstractC0048Bt.h(pj.getName(), pj2.getName())) {
            return 4;
        }
        if (AbstractC0048Bt.K(pj) && AbstractC0048Bt.K(pj2)) {
            return 1;
        }
        return (AbstractC0048Bt.K(pj) || AbstractC0048Bt.K(pj2)) ? 3 : 4;
    }

    @Override // o.InterfaceC2308yl
    public final int b() {
        return 3;
    }
}
