package o;

/* renamed from: o.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1979tm extends AbstractC1782qm implements InterfaceC2360zX {
    public final AbstractC1782qm k;
    public final AbstractC1004ey l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1979tm(AbstractC1782qm abstractC1782qm, AbstractC1004ey abstractC1004ey) {
        super(abstractC1782qm.i, abstractC1782qm.j);
        AbstractC0048Bt.n(abstractC1782qm, "origin");
        AbstractC0048Bt.n(abstractC1004ey, "enhancement");
        this.k = abstractC1782qm;
        this.l = abstractC1004ey;
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        AbstractC1782qm abstractC1782qm = this.k;
        AbstractC0048Bt.n(abstractC1782qm, "type");
        AbstractC1004ey abstractC1004ey = this.l;
        AbstractC0048Bt.n(abstractC1004ey, "type");
        return new C1979tm(abstractC1782qm, abstractC1004ey);
    }

    @Override // o.AbstractC2097vY
    public final AbstractC2097vY F0(boolean z) {
        return AbstractC1494mO.n(this.k.F0(z), this.l.E0().F0(z));
    }

    @Override // o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        AbstractC1782qm abstractC1782qm = this.k;
        AbstractC0048Bt.n(abstractC1782qm, "type");
        AbstractC1004ey abstractC1004ey = this.l;
        AbstractC0048Bt.n(abstractC1004ey, "type");
        return new C1979tm(abstractC1782qm, abstractC1004ey);
    }

    @Override // o.AbstractC2097vY
    public final AbstractC2097vY H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return AbstractC1494mO.n(this.k.H0(ow), this.l);
    }

    @Override // o.AbstractC1782qm
    public final JR I0() {
        return this.k.I0();
    }

    @Override // o.AbstractC1782qm
    public final String J0(C2304yh c2304yh, C2304yh c2304yh2) {
        C0062Ch c0062Ch = c2304yh2.a;
        return ((Boolean) c0062Ch.m.a(c0062Ch, C0062Ch.W[11])).booleanValue() ? c2304yh.Y(this.l) : this.k.J0(c2304yh, c2304yh2);
    }

    @Override // o.InterfaceC2360zX
    public final AbstractC1004ey h() {
        return this.l;
    }

    @Override // o.InterfaceC2360zX
    public final AbstractC2097vY q0() {
        return this.k;
    }

    @Override // o.AbstractC1782qm
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.l + ")] " + this.k;
    }
}
