package o;

/* renamed from: o.Tw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518Tw extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0544Uw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0518Tw(C0544Uw c0544Uw, int i) {
        super(0);
        this.h = i;
        this.i = c0544Uw;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return new C0492Sw(this.i);
            default:
                C0544Uw c0544Uw = this.i;
                return c0544Uw.t(c0544Uw.s(), null);
        }
    }
}
