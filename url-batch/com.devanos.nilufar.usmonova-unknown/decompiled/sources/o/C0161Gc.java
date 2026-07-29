package o;

import android.window.OnBackInvokedDispatcher;

/* renamed from: o.Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0161Gc implements InterfaceC0288Kz {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ C0161Gc(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        switch (this.h) {
            case 0:
                YF yf = (YF) this.i;
                AbstractActivityC0446Rc abstractActivityC0446Rc = (AbstractActivityC0446Rc) this.j;
                AbstractC0048Bt.n(yf, "$dispatcher");
                if (enumC0054Bz == EnumC0054Bz.ON_CREATE) {
                    OnBackInvokedDispatcher a = C0187Hc.a.a(abstractActivityC0446Rc);
                    AbstractC0048Bt.n(a, "invoker");
                    yf.e = a;
                    yf.c(yf.g);
                    break;
                }
                break;
            default:
                C1088gC c1088gC = (C1088gC) this.i;
                InterfaceC2207xC interfaceC2207xC = (InterfaceC2207xC) this.j;
                if (enumC0054Bz != EnumC0054Bz.ON_DESTROY) {
                    c1088gC.getClass();
                    break;
                } else {
                    c1088gC.b(interfaceC2207xC);
                    break;
                }
        }
    }
}
