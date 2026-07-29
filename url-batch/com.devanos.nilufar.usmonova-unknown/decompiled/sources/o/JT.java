package o;

/* loaded from: classes.dex */
public final class JT extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ KT i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JT(KT kt, int i) {
        super(0);
        this.h = i;
        this.i = kt;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C0581Wh c0581Wh = this.i.b;
                return AbstractC0868ct.K(AbstractC1807r8.y(c0581Wh), AbstractC1807r8.z(c0581Wh));
            default:
                return AbstractC0868ct.L(AbstractC1807r8.x(this.i.b));
        }
    }
}
