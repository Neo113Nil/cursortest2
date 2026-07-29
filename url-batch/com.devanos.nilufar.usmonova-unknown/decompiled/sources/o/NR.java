package o;

/* loaded from: classes.dex */
public final class NR extends AbstractC0856ch {
    public final OW j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NR(JR jr, OW ow) {
        super(jr);
        AbstractC0048Bt.n(ow, "attributes");
        this.j = ow;
    }

    @Override // o.AbstractC0791bh, o.AbstractC1004ey
    public final OW A0() {
        return this.j;
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        return new NR(jr, this.j);
    }
}
