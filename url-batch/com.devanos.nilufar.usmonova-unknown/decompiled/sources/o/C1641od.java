package o;

/* renamed from: o.od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1641od extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C2245xo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1641od(C2245xo c2245xo, int i) {
        super(1);
        this.h = i;
        this.i = c2245xo;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                InterfaceC1738q4 interfaceC1738q4 = (InterfaceC1738q4) obj;
                AbstractC0048Bt.n(interfaceC1738q4, "it");
                return interfaceC1738q4.c(this.i);
            default:
                C2245xo c2245xo = (C2245xo) obj;
                AbstractC0048Bt.n(c2245xo, "it");
                return Boolean.valueOf(!c2245xo.d() && c2245xo.e().equals(this.i));
        }
    }
}
