package o;

/* renamed from: o.qx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1793qx implements InterfaceC1727px {
    public static final /* synthetic */ InterfaceC0937dx[] k;
    public final InterfaceC1437lX h;
    public final RM i;
    public final InterfaceC1858rx j;

    static {
        VM vm = UM.a;
        k = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1793qx.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public C1793qx(InterfaceC1858rx interfaceC1858rx, InterfaceC1437lX interfaceC1437lX) {
        Class cls;
        C0740aw c0740aw;
        Object t;
        AbstractC0048Bt.n(interfaceC1437lX, "descriptor");
        this.h = interfaceC1437lX;
        this.i = TM.u(null, new C1139h0(23, this));
        if (interfaceC1858rx == null) {
            InterfaceC1118gg n = interfaceC1437lX.n();
            AbstractC0048Bt.m(n, "descriptor.containingDeclaration");
            if (n instanceof InterfaceC1245ib) {
                t = c((InterfaceC1245ib) n);
            } else {
                if (!(n instanceof InterfaceC2204x9)) {
                    throw new C0526Ue("Unknown type parameter container: " + n);
                }
                InterfaceC1118gg n2 = ((InterfaceC2204x9) n).n();
                AbstractC0048Bt.m(n2, "declaration.containingDeclaration");
                if (n2 instanceof InterfaceC1245ib) {
                    c0740aw = c((InterfaceC1245ib) n2);
                } else {
                    InterfaceC0726ai interfaceC0726ai = n instanceof InterfaceC0726ai ? (InterfaceC0726ai) n : null;
                    if (interfaceC0726ai == null) {
                        throw new C0526Ue("Non-class callable descriptor must be deserialized: " + n);
                    }
                    InterfaceC0607Xh s = interfaceC0726ai.s();
                    C1659ov c1659ov = s instanceof C1659ov ? (C1659ov) s : null;
                    OM om = c1659ov != null ? c1659ov.j : null;
                    OM om2 = om instanceof OM ? om : null;
                    if (om2 == null || (cls = om2.a) == null) {
                        throw new C0526Ue("Container of deserialized member is not resolved: " + interfaceC0726ai);
                    }
                    c0740aw = (C0740aw) AbstractC1473m3.G(cls);
                }
                t = n.t(new Y1(15, c0740aw), C0782bY.a);
            }
            AbstractC0048Bt.m(t, "when (val declaration = … $declaration\")\n        }");
            interfaceC1858rx = (InterfaceC1858rx) t;
        }
        this.j = interfaceC1858rx;
    }

    public static C0740aw c(InterfaceC1245ib interfaceC1245ib) {
        Class j = JY.j(interfaceC1245ib);
        C0740aw c0740aw = (C0740aw) (j != null ? AbstractC1473m3.G(j) : null);
        if (c0740aw != null) {
            return c0740aw;
        }
        throw new C0526Ue("Type parameter container is not resolved: " + interfaceC1245ib.n());
    }

    public final String b() {
        String b = this.h.getName().b();
        AbstractC0048Bt.m(b, "descriptor.name.asString()");
        return b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1793qx)) {
            return false;
        }
        C1793qx c1793qx = (C1793qx) obj;
        return AbstractC0048Bt.h(this.j, c1793qx.j) && b().equals(c1793qx.b());
    }

    public final int hashCode() {
        return b().hashCode() + (this.j.hashCode() * 31);
    }

    public final String toString() {
        EnumC2056ux enumC2056ux;
        StringBuilder sb = new StringBuilder();
        int v = AbstractC1888sN.v(this.h.Y());
        if (v == 0) {
            enumC2056ux = EnumC2056ux.h;
        } else if (v == 1) {
            enumC2056ux = EnumC2056ux.i;
        } else {
            if (v != 2) {
                throw new C0057Cc();
            }
            enumC2056ux = EnumC2056ux.j;
        }
        int ordinal = enumC2056ux.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                sb.append("in ");
            } else {
                if (ordinal != 2) {
                    throw new C0057Cc();
                }
                sb.append("out ");
            }
        }
        sb.append(b());
        return sb.toString();
    }
}
