package o;

/* loaded from: classes.dex */
public final class SF extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ YF i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SF(YF yf, int i) {
        super(0);
        this.h = i;
        this.i = yf;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                this.i.b();
                break;
            case 1:
                this.i.a();
                break;
            default:
                this.i.b();
                break;
        }
        return C0782bY.a;
    }
}
