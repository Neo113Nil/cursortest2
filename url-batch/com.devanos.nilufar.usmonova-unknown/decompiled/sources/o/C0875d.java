package o;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875d extends AbstractC0791bh {
    public final JR i;
    public final JR j;

    public C0875d(JR jr, JR jr2) {
        AbstractC0048Bt.n(jr, "delegate");
        AbstractC0048Bt.n(jr2, "abbreviation");
        this.i = jr;
        this.j = jr2;
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new C0875d(this.i.H0(ow), this.j);
    }

    @Override // o.AbstractC0791bh
    public final JR K0() {
        return this.i;
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        return new C0875d(jr, this.j);
    }

    @Override // o.JR
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final C0875d F0(boolean z) {
        return new C0875d(this.i.F0(z), this.j.F0(z));
    }

    @Override // o.AbstractC0791bh
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final C0875d D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = this.i;
        AbstractC0048Bt.n(jr, "type");
        JR jr2 = this.j;
        AbstractC0048Bt.n(jr2, "type");
        return new C0875d(jr, jr2);
    }
}
