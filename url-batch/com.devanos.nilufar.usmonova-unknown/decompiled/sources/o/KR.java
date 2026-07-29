package o;

import java.util.List;

/* loaded from: classes.dex */
public final class KR extends JR {
    public final SW i;
    public final List j;
    public final boolean k;
    public final WB l;
    public final InterfaceC2114vp m;

    public KR(SW sw, List list, boolean z, WB wb, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(sw, "constructor");
        AbstractC0048Bt.n(list, "arguments");
        AbstractC0048Bt.n(wb, "memberScope");
        this.i = sw;
        this.j = list;
        this.k = z;
        this.l = wb;
        this.m = interfaceC2114vp;
        if (!(wb instanceof C0169Gk) || (wb instanceof KV)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + wb + '\n' + sw);
    }

    @Override // o.AbstractC1004ey
    public final OW A0() {
        OW.i.getClass();
        return OW.j;
    }

    @Override // o.AbstractC1004ey
    public final SW B0() {
        return this.i;
    }

    @Override // o.AbstractC1004ey
    public final boolean C0() {
        return this.k;
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = (JR) this.m.invoke(c1398ky);
        return jr == null ? this : jr;
    }

    @Override // o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = (JR) this.m.invoke(c1398ky);
        return jr == null ? this : jr;
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        return z == this.k ? this : z ? new YE(this, 1) : new YE(this, 0);
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return ow.isEmpty() ? this : new NR(this, ow);
    }

    @Override // o.AbstractC1004ey
    public final WB r0() {
        return this.l;
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return this.j;
    }
}
