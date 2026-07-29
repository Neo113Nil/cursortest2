package o;

import android.view.Choreographer;

/* renamed from: o.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907sg implements InterfaceC0957eD {
    public static final C1907sg h = new C1907sg();
    public static final Choreographer i;

    static {
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        i = (Choreographer) AbstractC0868ct.S(AbstractC1810rB.a.m, new C1841rg(2, null));
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        return PX.E0(this, interfaceC0189He);
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(obj, this);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.z0(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.J(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0957eD
    public final Object v(InterfaceC2114vp interfaceC2114vp, AbstractC2367ze abstractC2367ze) {
        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(abstractC2367ze));
        c0849ca.r();
        O3 o3 = new O3(c0849ca, interfaceC2114vp);
        i.postFrameCallback(o3);
        c0849ca.t(new C1400l(14, o3));
        return c0849ca.q();
    }
}
