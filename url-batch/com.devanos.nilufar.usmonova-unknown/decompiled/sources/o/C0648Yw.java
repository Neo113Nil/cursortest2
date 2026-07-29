package o;

/* renamed from: o.Yw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648Yw extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0674Zw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0648Yw(C0674Zw c0674Zw, int i) {
        super(0);
        this.h = i;
        this.i = c0674Zw;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return new C0622Xw(this.i);
            default:
                return this.i.s();
        }
    }
}
