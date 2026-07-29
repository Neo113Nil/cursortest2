package o;

/* loaded from: classes.dex */
public final class GL implements CT, InterfaceC2243xm, InterfaceC0589Wp {
    public final /* synthetic */ ET h;

    public GL(ET et) {
        this.h = et;
    }

    @Override // o.InterfaceC2243xm
    public final Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        this.h.collect(interfaceC2309ym, interfaceC2235xe);
        return EnumC0448Re.h;
    }

    @Override // o.CT
    public final Object getValue() {
        return this.h.getValue();
    }

    @Override // o.InterfaceC0589Wp
    public final InterfaceC2243xm p(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return (((i < 0 || i >= 2) && i != -2) || h8 != H8.i) ? AbstractC0868ct.u(this, interfaceC0189He, i, h8) : this;
    }
}
