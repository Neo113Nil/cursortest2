package o;

/* renamed from: o.tv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988tv extends AbstractC0868ct {
    public final PJ s;
    public final CK t;
    public final C0024Av u;
    public final InterfaceC0893dE v;
    public final C0695aD w;
    public final String x;

    public C1988tv(PJ pj, CK ck, C0024Av c0024Av, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD) {
        String str;
        String sb;
        AbstractC0048Bt.n(ck, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        this.s = pj;
        this.t = ck;
        this.u = c0024Av;
        this.v = interfaceC0893dE;
        this.w = c0695aD;
        if ((c0024Av.i & 4) == 4) {
            sb = interfaceC0893dE.getString(c0024Av.l.j).concat(interfaceC0893dE.getString(c0024Av.l.k));
        } else {
            C1395kv b = C0206Hv.b(ck, interfaceC0893dE, c0695aD, true);
            if (b == null) {
                throw new C0526Ue("No field signature for property: " + pj);
            }
            String str2 = b.h;
            String str3 = b.i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC0412Pu.a(str2));
            InterfaceC1118gg n = pj.n();
            AbstractC0048Bt.m(n, "descriptor.containingDeclaration");
            if (AbstractC0048Bt.h(pj.getVisibility(), AbstractC0270Kh.d) && (n instanceof C0581Wh)) {
                C1030fK c1030fK = ((C0581Wh) n).l;
                C2049uq c2049uq = AbstractC0180Gv.i;
                AbstractC0048Bt.m(c2049uq, "classModuleName");
                Integer num = (Integer) AbstractC1305jX.s(c1030fK, c2049uq);
                String replaceAll = AbstractC0958eE.a.h.matcher(num != null ? interfaceC0893dE.getString(num.intValue()) : "main").replaceAll("_");
                AbstractC0048Bt.m(replaceAll, "replaceAll(...)");
                str = "$".concat(replaceAll);
            } else {
                if (AbstractC0048Bt.h(pj.getVisibility(), AbstractC0270Kh.a) && (n instanceof InterfaceC0961eH)) {
                    InterfaceC0607Xh interfaceC0607Xh = ((C1186hi) pj).L;
                    if (interfaceC0607Xh instanceof C1659ov) {
                        C1659ov c1659ov = (C1659ov) interfaceC0607Xh;
                        if (c1659ov.i != null) {
                            StringBuilder sb3 = new StringBuilder("$");
                            String e = c1659ov.h.e();
                            AbstractC0048Bt.m(e, "className.internalName");
                            sb3.append(C0827cE.e(UT.Q(e, '/', e)).b());
                            str = sb3.toString();
                        }
                    }
                }
                str = "";
            }
            sb2.append(str);
            sb2.append("()");
            sb2.append(str3);
            sb = sb2.toString();
        }
        this.x = sb;
    }

    @Override // o.AbstractC0868ct
    public final String g() {
        return this.x;
    }
}
