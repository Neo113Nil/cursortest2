package o;

/* renamed from: o.Py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416Py extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0494Sy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0416Py(C0494Sy c0494Sy, int i) {
        super(1);
        this.h = i;
        this.i = c0494Sy;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                C0827cE c0827cE = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE, "it");
                return C0494Sy.v(this.i, c0827cE);
            default:
                C0827cE c0827cE2 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE2, "it");
                return C0494Sy.w(this.i, c0827cE2);
        }
    }
}
