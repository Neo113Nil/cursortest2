package o;

/* renamed from: o.Qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431Qn extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0405Pn i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0431Qn(C0405Pn c0405Pn, int i) {
        super(0);
        this.h = i;
        this.i = c0405Pn;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                this.i.q();
                break;
            default:
                C0405Pn c0405Pn = this.i;
                if (c0405Pn.b.m) {
                    PX.I0(c0405Pn);
                }
                break;
        }
        return C0782bY.a;
    }
}
