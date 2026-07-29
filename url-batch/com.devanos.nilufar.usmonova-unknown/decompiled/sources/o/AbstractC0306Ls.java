package o;

/* renamed from: o.Ls, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0306Ls {
    static {
        C1639ob.j(new C2245xo("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "<this>");
        if (!(interfaceC2204x9 instanceof SJ)) {
            return false;
        }
        PJ H0 = ((SJ) interfaceC2204x9).H0();
        AbstractC0048Bt.m(H0, "correspondingProperty");
        return d(H0);
    }

    public static final boolean b(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "<this>");
        return (interfaceC1118gg instanceof InterfaceC1245ib) && (((InterfaceC1245ib) interfaceC1118gg).h0() instanceof C0281Ks);
    }

    public static final boolean c(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        InterfaceC2364zb c = abstractC1004ey.B0().c();
        if (c != null) {
            return b(c);
        }
        return false;
    }

    public static final boolean d(SY sy) {
        if (sy.J() != null) {
            return false;
        }
        InterfaceC1118gg n = sy.n();
        C0827cE c0827cE = null;
        InterfaceC1245ib interfaceC1245ib = n instanceof InterfaceC1245ib ? (InterfaceC1245ib) n : null;
        if (interfaceC1245ib != null) {
            int i = AbstractC0192Hh.a;
            LY h0 = interfaceC1245ib.h0();
            C0281Ks c0281Ks = h0 instanceof C0281Ks ? (C0281Ks) h0 : null;
            if (c0281Ks != null) {
                c0827cE = c0281Ks.a;
            }
        }
        return AbstractC0048Bt.h(c0827cE, sy.getName());
    }

    public static final boolean e(InterfaceC1118gg interfaceC1118gg) {
        if (b(interfaceC1118gg)) {
            return true;
        }
        return (interfaceC1118gg instanceof InterfaceC1245ib) && (((InterfaceC1245ib) interfaceC1118gg).h0() instanceof C1615oD);
    }

    public static final JR f(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        InterfaceC2364zb c = abstractC1004ey.B0().c();
        InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
        if (interfaceC1245ib != null) {
            int i = AbstractC0192Hh.a;
            LY h0 = interfaceC1245ib.h0();
            C0281Ks c0281Ks = h0 instanceof C0281Ks ? (C0281Ks) h0 : null;
            if (c0281Ks != null) {
                return (JR) c0281Ks.b;
            }
        }
        return null;
    }
}
