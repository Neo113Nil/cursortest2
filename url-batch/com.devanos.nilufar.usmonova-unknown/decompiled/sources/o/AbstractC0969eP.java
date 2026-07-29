package o;

import java.lang.reflect.Method;

/* renamed from: o.eP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0969eP {
    public static final C1639ob a = C1639ob.j(new C2245xo("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static C1329jv a(InterfaceC0381Op interfaceC0381Op) {
        String e = AbstractC1035fP.e(interfaceC0381Op);
        if (e == null) {
            if (interfaceC0381Op instanceof SJ) {
                String b = AbstractC0192Hh.k(interfaceC0381Op).getName().b();
                AbstractC0048Bt.m(b, "descriptor.propertyIfAccessor.name.asString()");
                e = AbstractC0412Pu.a(b);
            } else if (interfaceC0381Op instanceof WJ) {
                String b2 = AbstractC0192Hh.k(interfaceC0381Op).getName().b();
                AbstractC0048Bt.m(b2, "descriptor.propertyIfAccessor.name.asString()");
                e = AbstractC0412Pu.b(b2);
            } else {
                e = ((AbstractC1184hg) interfaceC0381Op).getName().b();
                AbstractC0048Bt.m(e, "descriptor.name.asString()");
            }
        }
        return new C1329jv(new C1461lv(e, PX.y(interfaceC0381Op, 1)));
    }

    public static AbstractC0868ct b(PJ pj) {
        AbstractC0048Bt.n(pj, "possiblyOverriddenProperty");
        PJ a2 = ((PJ) AbstractC0114Eh.t(pj)).a();
        AbstractC0048Bt.m(a2, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (a2 instanceof C1186hi) {
            C1186hi c1186hi = (C1186hi) a2;
            CK ck = c1186hi.H;
            C2049uq c2049uq = AbstractC0180Gv.d;
            AbstractC0048Bt.m(c2049uq, "propertySignature");
            C0024Av c0024Av = (C0024Av) AbstractC1305jX.s(ck, c2049uq);
            if (c0024Av != null) {
                return new C1988tv(a2, ck, c0024Av, c1186hi.I, c1186hi.J);
            }
        } else if (a2 instanceof C1132gu) {
            IS d = ((C1132gu) a2).d();
            C0904dP c0904dP = d instanceof C0904dP ? (C0904dP) d : null;
            BM bm = c0904dP != null ? c0904dP.h : null;
            if (bm instanceof DM) {
                return new C1856rv(((DM) bm).a);
            }
            if (!(bm instanceof GM)) {
                throw new C0526Ue("Incorrect resolution sequence for Java field " + a2 + " (source = " + bm + ')');
            }
            Method method = ((GM) bm).a;
            WJ b = a2.b();
            IS d2 = b != null ? b.d() : null;
            C0904dP c0904dP2 = d2 instanceof C0904dP ? (C0904dP) d2 : null;
            BM bm2 = c0904dP2 != null ? c0904dP2.h : null;
            GM gm = bm2 instanceof GM ? (GM) bm2 : null;
            return new C1922sv(method, gm != null ? gm.a : null);
        }
        SJ getter = a2.getGetter();
        AbstractC0048Bt.k(getter);
        C1329jv a3 = a(getter);
        WJ b2 = a2.b();
        return new C2054uv(a3, b2 != null ? a(b2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC1807r8 c(InterfaceC0381Op interfaceC0381Op) {
        Method method;
        AbstractC0048Bt.n(interfaceC0381Op, "possiblySubstitutedFunction");
        InterfaceC0381Op a2 = ((InterfaceC0381Op) AbstractC0114Eh.t(interfaceC0381Op)).a();
        AbstractC0048Bt.m(a2, "unwrapFakeOverride(possi…titutedFunction).original");
        if (a2 instanceof InterfaceC0373Oh) {
            InterfaceC0373Oh interfaceC0373Oh = (InterfaceC0373Oh) a2;
            E N = interfaceC0373Oh.N();
            if (N instanceof C2017uK) {
                C1649ol c1649ol = C0206Hv.a;
                C1461lv c = C0206Hv.c((C2017uK) N, interfaceC0373Oh.v0(), interfaceC0373Oh.k0());
                if (c != null) {
                    return new C1329jv(c);
                }
            }
            if (N instanceof C1162hK) {
                C1649ol c1649ol2 = C0206Hv.a;
                C1461lv a3 = C0206Hv.a((C1162hK) N, interfaceC0373Oh.v0(), interfaceC0373Oh.k0());
                if (a3 != null) {
                    InterfaceC1118gg n = interfaceC0381Op.n();
                    AbstractC0048Bt.m(n, "possiblySubstitutedFunction.containingDeclaration");
                    return AbstractC0306Ls.b(n) ? new C1329jv(a3) : new C1263iv(a3);
                }
            }
            return a(a2);
        }
        if (a2 instanceof C0934du) {
            IS d = ((C0934du) a2).d();
            C0904dP c0904dP = d instanceof C0904dP ? (C0904dP) d : null;
            BM bm = c0904dP != null ? c0904dP.h : null;
            GM gm = bm instanceof GM ? (GM) bm : null;
            if (gm != null && (method = gm.a) != null) {
                return new C1199hv(method);
            }
            throw new C0526Ue("Incorrect resolution sequence for Java method " + a2);
        }
        if (!(a2 instanceof C0567Vt)) {
            AbstractC1184hg abstractC1184hg = (AbstractC1184hg) a2;
            if ((abstractC1184hg.getName().equals(AbstractC1499mT.c) && AbstractC1807r8.L(a2)) || ((abstractC1184hg.getName().equals(AbstractC1499mT.a) && AbstractC1807r8.L(a2)) || (AbstractC0048Bt.h(abstractC1184hg.getName(), C0238Jb.e) && a2.t0().isEmpty()))) {
                return a(a2);
            }
            throw new C0526Ue("Unknown origin of " + a2 + " (" + a2.getClass() + ')');
        }
        IS d2 = ((C0567Vt) a2).d();
        C0904dP c0904dP2 = d2 instanceof C0904dP ? (C0904dP) d2 : null;
        Object obj = c0904dP2 != null ? c0904dP2.h : null;
        if (obj instanceof AM) {
            return new C1133gv(((AM) obj).a);
        }
        if (obj instanceof C2217xM) {
            C2217xM c2217xM = (C2217xM) obj;
            if (c2217xM.a.isAnnotation()) {
                return new C1067fv(c2217xM.a);
            }
        }
        throw new C0526Ue("Incorrect resolution sequence for Java constructor " + a2 + " (" + obj + ')');
    }
}
