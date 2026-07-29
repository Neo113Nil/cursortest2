package o;

import java.util.List;

/* renamed from: o.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1782qm extends AbstractC2097vY implements InterfaceC1266iy {
    public final JR i;
    public final JR j;

    public AbstractC1782qm(JR jr, JR jr2) {
        AbstractC0048Bt.n(jr, "lowerBound");
        AbstractC0048Bt.n(jr2, "upperBound");
        this.i = jr;
        this.j = jr2;
    }

    @Override // o.AbstractC1004ey
    public final OW A0() {
        return I0().A0();
    }

    @Override // o.AbstractC1004ey
    public final SW B0() {
        return I0().B0();
    }

    @Override // o.AbstractC1004ey
    public final boolean C0() {
        return I0().C0();
    }

    public abstract JR I0();

    public abstract String J0(C2304yh c2304yh, C2304yh c2304yh2);

    @Override // o.AbstractC1004ey
    public WB r0() {
        return I0().r0();
    }

    public String toString() {
        return C2304yh.e.Y(this);
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return I0().w0();
    }
}
