package o;

/* renamed from: o.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0856ch extends AbstractC0791bh {
    public final JR i;

    public AbstractC0856ch(JR jr) {
        this.i = jr;
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        return z == C0() ? this : this.i.F0(z).H0(A0());
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return ow != A0() ? new NR(this, ow) : this;
    }

    @Override // o.AbstractC0791bh
    public final JR K0() {
        return this.i;
    }
}
