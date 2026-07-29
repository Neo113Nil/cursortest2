package o;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class P3 implements InterfaceC0957eD {
    public final /* synthetic */ int h;
    public final Object i;
    public final Object j;

    public P3(Choreographer choreographer, N3 n3) {
        this.h = 0;
        this.i = choreographer;
        this.j = n3;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        switch (this.h) {
        }
        return PX.E0(this, interfaceC0189He);
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        switch (this.h) {
        }
        return interfaceC2312yp.invoke(obj, this);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        switch (this.h) {
        }
        return PX.z0(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        switch (this.h) {
        }
        return PX.J(this, interfaceC0163Ge);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // o.InterfaceC0957eD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(InterfaceC2114vp interfaceC2114vp, AbstractC2367ze abstractC2367ze) {
        EH eh;
        EnumC0448Re enumC0448Re;
        int i;
        boolean z;
        Object q;
        P3 p3;
        Object v;
        switch (this.h) {
            case 0:
                N3 n3 = (N3) this.j;
                C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(abstractC2367ze));
                c0849ca.r();
                O3 o3 = new O3(c0849ca, this, interfaceC2114vp);
                if (AbstractC0048Bt.h(n3.j, (Choreographer) this.i)) {
                    synchronized (n3.l) {
                        n3.n.add(o3);
                        if (!n3.q) {
                            n3.q = true;
                            n3.j.postFrameCallback(n3.r);
                        }
                    }
                    c0849ca.t(new C0810c0(n3, 4, o3));
                } else {
                    ((Choreographer) this.i).postFrameCallback(o3);
                    c0849ca.t(new C0810c0(this, 5, o3));
                }
                return c0849ca.q();
            default:
                if (abstractC2367ze instanceof EH) {
                    eh = (EH) abstractC2367ze;
                    int i2 = eh.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        eh.l = i2 - Integer.MIN_VALUE;
                        Object obj = eh.j;
                        enumC0448Re = EnumC0448Re.h;
                        i = eh.l;
                        if (i != 0) {
                            AbstractC1494mO.l(obj);
                            C1662oy c1662oy = (C1662oy) this.j;
                            eh.h = this;
                            eh.i = interfaceC2114vp;
                            eh.l = 1;
                            synchronized (c1662oy.a) {
                                z = c1662oy.d;
                            }
                            if (z) {
                                q = C0782bY.a;
                            } else {
                                C0849ca c0849ca2 = new C0849ca(1, AbstractC1473m3.L(eh));
                                c0849ca2.r();
                                synchronized (c1662oy.a) {
                                    c1662oy.b.add(c0849ca2);
                                }
                                c0849ca2.t(new C0810c0(c1662oy, 10, c0849ca2));
                                q = c0849ca2.q();
                                if (q != enumC0448Re) {
                                    q = C0782bY.a;
                                }
                            }
                            if (q != enumC0448Re) {
                                p3 = this;
                            }
                            return enumC0448Re;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1494mO.l(obj);
                            return obj;
                        }
                        interfaceC2114vp = eh.i;
                        p3 = eh.h;
                        AbstractC1494mO.l(obj);
                        InterfaceC0957eD interfaceC0957eD = (InterfaceC0957eD) p3.i;
                        eh.h = null;
                        eh.i = null;
                        eh.l = 2;
                        v = interfaceC0957eD.v(interfaceC2114vp, eh);
                        if (v != enumC0448Re) {
                            return v;
                        }
                        return enumC0448Re;
                    }
                }
                eh = new EH(this, abstractC2367ze);
                Object obj2 = eh.j;
                enumC0448Re = EnumC0448Re.h;
                i = eh.l;
                if (i != 0) {
                }
                InterfaceC0957eD interfaceC0957eD2 = (InterfaceC0957eD) p3.i;
                eh.h = null;
                eh.i = null;
                eh.l = 2;
                v = interfaceC0957eD2.v(interfaceC2114vp, eh);
                if (v != enumC0448Re) {
                }
                return enumC0448Re;
        }
    }

    public P3(InterfaceC0957eD interfaceC0957eD) {
        this.h = 1;
        this.i = interfaceC0957eD;
        this.j = new C1662oy();
    }
}
