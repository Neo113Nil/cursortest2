package o;

/* loaded from: classes.dex */
public final class QY extends RY {
    public final BU s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QY(InterfaceC2072v9 interfaceC2072v9, RY ry, int i, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, AbstractC1004ey abstractC1004ey, boolean z, boolean z2, boolean z3, AbstractC1004ey abstractC1004ey2, IS is, InterfaceC1455lp interfaceC1455lp) {
        super(interfaceC2072v9, ry, i, interfaceC1738q4, c0827cE, abstractC1004ey, z, z2, z3, abstractC1004ey2, is);
        AbstractC0048Bt.n(interfaceC2072v9, "containingDeclaration");
        this.s = EB.D(interfaceC1455lp);
    }

    @Override // o.RY
    public final RY H0(C0459Rp c0459Rp, C0827cE c0827cE, int i) {
        InterfaceC1738q4 annotations = getAnnotations();
        AbstractC0048Bt.m(annotations, "annotations");
        AbstractC1004ey c = c();
        AbstractC0048Bt.m(c, "type");
        return new QY(c0459Rp, null, i, annotations, c0827cE, c, I0(), this.f98o, this.p, this.q, IS.e, new LE(16, this));
    }
}
