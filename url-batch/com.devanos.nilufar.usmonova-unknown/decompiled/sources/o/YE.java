package o;

/* loaded from: classes.dex */
public final class YE extends AbstractC0856ch {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YE(JR jr, int i) {
        super(jr);
        this.j = i;
    }

    @Override // o.AbstractC0791bh, o.AbstractC1004ey
    public final boolean C0() {
        switch (this.j) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        switch (this.j) {
            case 0:
                return new YE(jr, 0);
            default:
                return new YE(jr, 1);
        }
    }
}
