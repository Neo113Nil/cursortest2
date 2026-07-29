package o;

/* renamed from: o.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1913sm extends AbstractC1782qm implements InterfaceC0789bf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913sm(JR jr, JR jr2) {
        super(jr, jr2);
        AbstractC0048Bt.n(jr, "lowerBound");
        AbstractC0048Bt.n(jr2, "upperBound");
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = this.i;
        AbstractC0048Bt.n(jr, "type");
        JR jr2 = this.j;
        AbstractC0048Bt.n(jr2, "type");
        return new C1913sm(jr, jr2);
    }

    @Override // o.InterfaceC0789bf
    public final AbstractC2097vY F(AbstractC1004ey abstractC1004ey) {
        AbstractC2097vY m;
        AbstractC0048Bt.n(abstractC1004ey, "replacement");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof AbstractC1782qm) {
            m = E0;
        } else {
            if (!(E0 instanceof JR)) {
                throw new C0057Cc();
            }
            JR jr = (JR) E0;
            m = HO.m(jr, jr.F0(true));
        }
        return AbstractC1494mO.h(m, E0);
    }

    @Override // o.AbstractC2097vY
    public final AbstractC2097vY F0(boolean z) {
        return HO.m(this.i.F0(z), this.j.F0(z));
    }

    @Override // o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = this.i;
        AbstractC0048Bt.n(jr, "type");
        JR jr2 = this.j;
        AbstractC0048Bt.n(jr2, "type");
        return new C1913sm(jr, jr2);
    }

    @Override // o.AbstractC2097vY
    public final AbstractC2097vY H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return HO.m(this.i.H0(ow), this.j.H0(ow));
    }

    @Override // o.AbstractC1782qm
    public final JR I0() {
        return this.i;
    }

    @Override // o.AbstractC1782qm
    public final String J0(C2304yh c2304yh, C2304yh c2304yh2) {
        boolean n = c2304yh2.a.n();
        JR jr = this.j;
        JR jr2 = this.i;
        if (!n) {
            return c2304yh.F(c2304yh.Y(jr2), c2304yh.Y(jr), AbstractC0772bO.l(this));
        }
        return "(" + c2304yh.Y(jr2) + ".." + c2304yh.Y(jr) + ')';
    }

    @Override // o.AbstractC1782qm
    public final String toString() {
        return "(" + this.i + ".." + this.j + ')';
    }

    @Override // o.InterfaceC0789bf
    public final boolean u() {
        JR jr = this.i;
        return (jr.B0().c() instanceof InterfaceC1437lX) && AbstractC0048Bt.h(jr.B0(), this.j.B0());
    }
}
