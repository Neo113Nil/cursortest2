package o;

import java.util.List;

/* renamed from: o.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0791bh extends JR {
    @Override // o.AbstractC1004ey
    public OW A0() {
        return K0().A0();
    }

    @Override // o.AbstractC1004ey
    public final SW B0() {
        return K0().B0();
    }

    @Override // o.AbstractC1004ey
    public boolean C0() {
        return K0().C0();
    }

    public abstract JR K0();

    @Override // o.AbstractC2097vY
    /* renamed from: L0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JR G0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR K0 = K0();
        AbstractC0048Bt.n(K0, "type");
        return M0(K0);
    }

    public abstract AbstractC0791bh M0(JR jr);

    @Override // o.AbstractC1004ey
    public final WB r0() {
        return K0().r0();
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return K0().w0();
    }
}
