package o;

/* loaded from: classes.dex */
public final class OY extends UB {
    public final /* synthetic */ int c = 1;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OY(int i) {
        super(r0.toString(), 1);
        StringBuilder i2 = AbstractC2188wx.i(i, "must have at least ", " value parameter");
        i2.append(i > 1 ? "s" : "");
        this.d = i;
    }

    @Override // o.InterfaceC0496Ta
    public final boolean d(C0934du c0934du) {
        switch (this.c) {
            case 0:
                if (c0934du.t0().size() >= this.d) {
                }
                break;
            default:
                if (c0934du.t0().size() == this.d) {
                }
                break;
        }
        return false;
    }

    public OY() {
        super("must have exactly 2 value parameters", 1);
        this.d = 2;
    }
}
