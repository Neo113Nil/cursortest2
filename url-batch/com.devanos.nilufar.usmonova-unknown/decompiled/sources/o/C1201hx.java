package o;

/* renamed from: o.hx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201hx extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1265ix i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1201hx(AbstractC1265ix abstractC1265ix, int i) {
        super(0);
        this.h = i;
        this.i = abstractC1265ix;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return AbstractC0048Bt.b(this.i, false);
            default:
                AbstractC1265ix abstractC1265ix = this.i;
                WJ b = abstractC1265ix.t().p().b();
                return b == null ? AbstractC1807r8.w(abstractC1265ix.t().p(), C0460Rq.t) : b;
        }
    }
}
