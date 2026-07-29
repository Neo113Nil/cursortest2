package o;

/* renamed from: o.Ew, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129Ew extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0259Jw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0129Ew(C0259Jw c0259Jw, int i) {
        super(0);
        this.h = i;
        this.i = c0259Jw;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return AbstractC0946e20.p(this.i.i);
            default:
                return new C0207Hw(this.i);
        }
    }
}
