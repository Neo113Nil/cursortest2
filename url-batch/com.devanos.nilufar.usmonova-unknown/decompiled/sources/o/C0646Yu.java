package o;

/* renamed from: o.Yu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646Yu extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0827cE i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0646Yu(C0827cE c0827cE, int i) {
        super(1);
        this.h = i;
        this.i = c0827cE;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                WB wb = (WB) obj;
                AbstractC0048Bt.n(wb, "it");
                return wb.a(this.i, DE.h);
            default:
                WB wb2 = (WB) obj;
                AbstractC0048Bt.n(wb2, "it");
                return wb2.c(this.i, DE.l);
        }
    }
}
