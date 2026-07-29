package o;

/* renamed from: o.Hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0192Hh {
    public static final /* synthetic */ int a = 0;

    static {
        C0827cE.e("value");
    }

    public static final boolean a(RY ry) {
        Boolean v = AbstractC0022At.v(AbstractC0868ct.J(ry), HO.q, C0166Gh.j);
        AbstractC0048Bt.m(v, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return v.booleanValue();
    }

    public static InterfaceC2204x9 b(InterfaceC2204x9 interfaceC2204x9, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(interfaceC2204x9, "<this>");
        return (InterfaceC2204x9) AbstractC0022At.l(AbstractC0868ct.J(interfaceC2204x9), new C0140Fh(0), new C0854cf(new C1360kM(), interfaceC2114vp));
    }

    public static final C2245xo c(InterfaceC1249ig interfaceC1249ig) {
        AbstractC0048Bt.n(interfaceC1249ig, "<this>");
        C2377zo h = h(interfaceC1249ig);
        if (!h.d()) {
            h = null;
        }
        if (h != null) {
            return h.g();
        }
        return null;
    }

    public static final InterfaceC1245ib d(InterfaceC0948e4 interfaceC0948e4) {
        AbstractC0048Bt.n(interfaceC0948e4, "<this>");
        InterfaceC2364zb c = interfaceC0948e4.c().B0().c();
        if (c instanceof InterfaceC1245ib) {
            return (InterfaceC1245ib) c;
        }
        return null;
    }

    public static final AbstractC0545Ux e(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "<this>");
        return j(interfaceC1118gg).l();
    }

    public static final C1639ob f(InterfaceC2364zb interfaceC2364zb) {
        InterfaceC1118gg n;
        C1639ob f;
        if (interfaceC2364zb == null || (n = interfaceC2364zb.n()) == null) {
            return null;
        }
        if (n instanceof InterfaceC0961eH) {
            return new C1639ob(((AbstractC1027fH) ((InterfaceC0961eH) n)).l, interfaceC2364zb.getName());
        }
        if (!(n instanceof InterfaceC0004Ab) || (f = f((InterfaceC2364zb) n)) == null) {
            return null;
        }
        return f.d(interfaceC2364zb.getName());
    }

    public static final C2245xo g(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "<this>");
        C2245xo h = AbstractC0114Eh.h(interfaceC1118gg);
        return h != null ? h : AbstractC0114Eh.g(interfaceC1118gg.n()).b(interfaceC1118gg.getName()).g();
    }

    public static final C2377zo h(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "<this>");
        C2377zo g = AbstractC0114Eh.g(interfaceC1118gg);
        AbstractC0048Bt.m(g, "getFqName(this)");
        return g;
    }

    public static final void i(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "<this>");
        if (interfaceC0761bD.q(AbstractC1305jX.j) != null) {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC0761bD j(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "<this>");
        InterfaceC0761bD d = AbstractC0114Eh.d(interfaceC1118gg);
        AbstractC0048Bt.m(d, "getContainingModule(this)");
        return d;
    }

    public static final InterfaceC2204x9 k(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "<this>");
        if (!(interfaceC2204x9 instanceof MJ)) {
            return interfaceC2204x9;
        }
        PJ H0 = ((NJ) ((MJ) interfaceC2204x9)).H0();
        AbstractC0048Bt.m(H0, "correspondingProperty");
        return H0;
    }
}
