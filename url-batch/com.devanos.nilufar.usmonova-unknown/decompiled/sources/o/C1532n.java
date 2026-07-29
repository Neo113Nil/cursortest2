package o;

import java.util.List;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532n implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1598o i;

    public /* synthetic */ C1532n(AbstractC1598o abstractC1598o, int i) {
        this.h = i;
        this.i = abstractC1598o;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        int i = this.h;
        AbstractC1598o abstractC1598o = this.i;
        switch (i) {
            case 0:
                WB n0 = abstractC1598o.n0();
                C1466m c1466m = new C1466m(0, this);
                C0195Hk c0195Hk = AbstractC2228xX.a;
                if (C0273Kk.f(abstractC1598o)) {
                    return C0273Kk.c(EnumC0247Jk.r, abstractC1598o.toString());
                }
                SW z = abstractC1598o.z();
                if (z == null) {
                    AbstractC2228xX.a(12);
                    throw null;
                }
                if (n0 == null) {
                    AbstractC2228xX.a(13);
                    throw null;
                }
                List d = AbstractC2228xX.d(z.getParameters());
                OW.i.getClass();
                return HO.t(OW.j, z, d, false, n0, c1466m);
            case 1:
                return new C0332Ms(abstractC1598o.n0());
            default:
                return new C0261Jy(abstractC1598o);
        }
    }
}
