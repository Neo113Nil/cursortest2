package o;

/* loaded from: classes.dex */
public final class WF implements InterfaceC0288Kz, Z9 {
    public final AbstractC0106Dz h;
    public final C0380Oo i;
    public XF j;
    public final /* synthetic */ YF k;

    public WF(YF yf, AbstractC0106Dz abstractC0106Dz, C0380Oo c0380Oo) {
        AbstractC0048Bt.n(abstractC0106Dz, "lifecycle");
        AbstractC0048Bt.n(c0380Oo, "onBackPressedCallback");
        this.k = yf;
        this.h = abstractC0106Dz;
        this.i = c0380Oo;
        abstractC0106Dz.a(this);
    }

    @Override // o.Z9
    public final void cancel() {
        this.h.b(this);
        this.i.b.remove(this);
        XF xf = this.j;
        if (xf != null) {
            xf.cancel();
        }
        this.j = null;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        if (enumC0054Bz == EnumC0054Bz.ON_START) {
            C0380Oo c0380Oo = this.i;
            AbstractC0048Bt.n(c0380Oo, "onBackPressedCallback");
            YF yf = this.k;
            yf.b.addLast(c0380Oo);
            XF xf = new XF(yf, c0380Oo);
            c0380Oo.b.add(xf);
            yf.d();
            c0380Oo.c = new J2(0, yf, YF.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 6);
            this.j = xf;
            return;
        }
        if (enumC0054Bz != EnumC0054Bz.ON_STOP) {
            if (enumC0054Bz == EnumC0054Bz.ON_DESTROY) {
                cancel();
            }
        } else {
            XF xf2 = this.j;
            if (xf2 != null) {
                xf2.cancel();
            }
        }
    }
}
