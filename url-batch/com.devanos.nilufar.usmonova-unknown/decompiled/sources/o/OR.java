package o;

/* loaded from: classes.dex */
public final class OR extends AbstractC0791bh implements InterfaceC2360zX {
    public final JR i;
    public final AbstractC1004ey j;

    public OR(JR jr, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(jr, "delegate");
        AbstractC0048Bt.n(abstractC1004ey, "enhancement");
        this.i = jr;
        this.j = abstractC1004ey;
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        AbstractC2097vY n = AbstractC1494mO.n(this.i.F0(z), this.j.E0().F0(z));
        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (JR) n;
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        AbstractC2097vY n = AbstractC1494mO.n(this.i.H0(ow), this.j);
        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (JR) n;
    }

    @Override // o.AbstractC0791bh
    public final JR K0() {
        return this.i;
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        return new OR(jr, this.j);
    }

    @Override // o.AbstractC0791bh
    /* renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final OR D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = this.i;
        AbstractC0048Bt.n(jr, "type");
        AbstractC1004ey abstractC1004ey = this.j;
        AbstractC0048Bt.n(abstractC1004ey, "type");
        return new OR(jr, abstractC1004ey);
    }

    @Override // o.InterfaceC2360zX
    public final AbstractC1004ey h() {
        return this.j;
    }

    @Override // o.InterfaceC2360zX
    public final AbstractC2097vY q0() {
        return this.i;
    }

    @Override // o.JR
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.j + ")] " + this.i;
    }
}
