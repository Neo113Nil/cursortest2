package o;

/* renamed from: o.Wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585Wl extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC0700aI i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0585Wl(AbstractC0700aI abstractC0700aI, int i) {
        super(1);
        this.h = i;
        this.i = abstractC0700aI;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                ZH.e((ZH) obj, this.i, 0, 0);
                break;
            case 1:
                ZH.f((ZH) obj, this.i);
                break;
            default:
                ZH.e((ZH) obj, this.i, 0, 0);
                break;
        }
        return C0782bY.a;
    }
}
