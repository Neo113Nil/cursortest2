package o;

/* renamed from: o.fx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069fx extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1135gx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1069fx(AbstractC1135gx abstractC1135gx, int i) {
        super(0);
        this.h = i;
        this.i = abstractC1135gx;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return AbstractC0048Bt.b(this.i, true);
            default:
                AbstractC1135gx abstractC1135gx = this.i;
                SJ getter = abstractC1135gx.t().p().getGetter();
                return getter == null ? AbstractC1807r8.v(abstractC1135gx.t().p(), C0460Rq.t) : getter;
        }
    }
}
