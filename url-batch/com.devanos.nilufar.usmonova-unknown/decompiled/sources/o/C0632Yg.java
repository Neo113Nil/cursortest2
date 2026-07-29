package o;

/* renamed from: o.Yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632Yg extends AbstractC0791bh implements InterfaceC0789bf, MR {
    public final JR i;
    public final boolean j;

    public C0632Yg(JR jr, boolean z) {
        this.i = jr;
        this.j = z;
    }

    @Override // o.AbstractC0791bh, o.AbstractC1004ey
    public final boolean C0() {
        return false;
    }

    @Override // o.InterfaceC0789bf
    public final AbstractC2097vY F(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "replacement");
        return TM.v(abstractC1004ey.E0(), this.j);
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        return z ? this.i.F0(z) : this;
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new C0632Yg(this.i.H0(ow), this.j);
    }

    @Override // o.AbstractC0791bh
    public final JR K0() {
        return this.i;
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        return new C0632Yg(jr, this.j);
    }

    @Override // o.JR
    public final String toString() {
        return this.i + " & Any";
    }

    @Override // o.InterfaceC0789bf
    public final boolean u() {
        JR jr = this.i;
        jr.B0();
        return jr.B0().c() instanceof InterfaceC1437lX;
    }
}
