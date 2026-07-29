package o;

/* renamed from: o.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977tk implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C2043uk i;

    public /* synthetic */ C1977tk(C2043uk c2043uk, int i) {
        this.h = i;
        this.i = c2043uk;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                C0827cE c0827cE = (C0827cE) obj;
                if (c0827cE != null) {
                    C2043uk c2043uk = this.i;
                    return c2043uk.j(c0827cE, c2043uk.i().a(c0827cE, DE.m));
                }
                C2043uk.h(8);
                throw null;
            default:
                C0827cE c0827cE2 = (C0827cE) obj;
                if (c0827cE2 != null) {
                    C2043uk c2043uk2 = this.i;
                    return c2043uk2.j(c0827cE2, c2043uk2.i().c(c0827cE2, DE.m));
                }
                C2043uk.h(4);
                throw null;
        }
    }
}
