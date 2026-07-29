package o;

import java.util.List;

/* loaded from: classes.dex */
public abstract class XM {
    public static final C2304yh a = C2304yh.c;

    public static void a(StringBuilder sb, InterfaceC2204x9 interfaceC2204x9) {
        C0261Jy g = JY.g(interfaceC2204x9);
        C0261Jy J = interfaceC2204x9.J();
        if (g != null) {
            sb.append(d(g.c()));
            sb.append(".");
        }
        boolean z = (g == null || J == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (J != null) {
            sb.append(d(J.c()));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(InterfaceC0381Op interfaceC0381Op) {
        AbstractC0048Bt.n(interfaceC0381Op, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, interfaceC0381Op);
        C0827cE name = ((AbstractC1184hg) interfaceC0381Op).getName();
        AbstractC0048Bt.m(name, "descriptor.name");
        sb.append(a.O(name, true));
        List t0 = interfaceC0381Op.t0();
        AbstractC0048Bt.m(t0, "descriptor.valueParameters");
        AbstractC0720ac.s0(t0, sb, ", ", "(", ")", WI.p, 48);
        sb.append(": ");
        AbstractC1004ey returnType = interfaceC0381Op.getReturnType();
        AbstractC0048Bt.k(returnType);
        sb.append(d(returnType));
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String c(PJ pj) {
        AbstractC0048Bt.n(pj, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(pj.G() ? "var " : "val ");
        a(sb, pj);
        C0827cE name = pj.getName();
        AbstractC0048Bt.m(name, "descriptor.name");
        sb.append(a.O(name, true));
        sb.append(": ");
        AbstractC1004ey c = pj.c();
        AbstractC0048Bt.m(c, "descriptor.type");
        sb.append(d(c));
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String d(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "type");
        return a.Y(abstractC1004ey);
    }
}
