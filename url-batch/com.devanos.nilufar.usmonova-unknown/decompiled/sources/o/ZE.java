package o;

/* loaded from: classes.dex */
public final class ZE extends AbstractC0791bh implements InterfaceC0789bf {
    public final JR i;

    public ZE(JR jr) {
        AbstractC0048Bt.n(jr, "delegate");
        this.i = jr;
    }

    @Override // o.AbstractC0791bh, o.AbstractC1004ey
    public final boolean C0() {
        return false;
    }

    @Override // o.InterfaceC0789bf
    public final AbstractC2097vY F(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "replacement");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (!AbstractC2228xX.f(E0) && !AbstractC2228xX.e(E0)) {
            return E0;
        }
        if (E0 instanceof JR) {
            JR jr = (JR) E0;
            JR F0 = jr.F0(false);
            return !AbstractC2228xX.f(jr) ? F0 : new ZE(F0);
        }
        if (!(E0 instanceof AbstractC1782qm)) {
            throw new IllegalStateException(("Incorrect type: " + E0).toString());
        }
        AbstractC1782qm abstractC1782qm = (AbstractC1782qm) E0;
        JR jr2 = abstractC1782qm.i;
        JR F02 = jr2.F0(false);
        if (AbstractC2228xX.f(jr2)) {
            F02 = new ZE(F02);
        }
        JR jr3 = abstractC1782qm.j;
        JR F03 = jr3.F0(false);
        if (AbstractC2228xX.f(jr3)) {
            F03 = new ZE(F03);
        }
        return AbstractC1494mO.n(HO.m(F02, F03), AbstractC1494mO.e(E0));
    }

    @Override // o.JR, o.AbstractC2097vY
    public final AbstractC2097vY H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new ZE(this.i.H0(ow));
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        return z ? this.i.F0(true) : this;
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new ZE(this.i.H0(ow));
    }

    @Override // o.AbstractC0791bh
    public final JR K0() {
        return this.i;
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        return new ZE(jr);
    }

    @Override // o.InterfaceC0789bf
    public final boolean u() {
        return true;
    }
}
