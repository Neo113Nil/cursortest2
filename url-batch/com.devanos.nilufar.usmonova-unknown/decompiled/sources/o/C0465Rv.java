package o;

/* renamed from: o.Rv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465Rv extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ InterfaceC2204x9 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0465Rv(InterfaceC2204x9 interfaceC2204x9, int i) {
        super(0);
        this.h = interfaceC2204x9;
        this.i = i;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Object obj = this.h.t0().get(this.i);
        AbstractC0048Bt.m(obj, "descriptor.valueParameters[i]");
        return (InterfaceC1882sH) obj;
    }
}
