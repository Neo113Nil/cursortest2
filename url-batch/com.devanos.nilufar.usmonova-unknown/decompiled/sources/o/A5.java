package o;

/* loaded from: classes.dex */
public final class A5 extends AbstractViewOnTouchListenerC1981to {
    public final /* synthetic */ H5 q;
    public final /* synthetic */ K5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(K5 k5, K5 k52, H5 h5) {
        super(k52);
        this.r = k5;
        this.q = h5;
    }

    @Override // o.AbstractViewOnTouchListenerC1981to
    public final InterfaceC1629oR b() {
        return this.q;
    }

    @Override // o.AbstractViewOnTouchListenerC1981to
    public final boolean c() {
        K5 k5 = this.r;
        if (k5.getInternalPopup().a()) {
            return true;
        }
        k5.m.m(k5.getTextDirection(), k5.getTextAlignment());
        return true;
    }
}
