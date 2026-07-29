package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class XW {
    public final C0321Mh a;
    public final XW b;
    public final String c;
    public final String d;
    public final TA e;
    public final TA f;
    public final Object g;

    public XW(C0321Mh c0321Mh, XW xw, List list, String str, String str2) {
        Map linkedHashMap;
        AbstractC0048Bt.n(list, "typeParameterProtos");
        AbstractC0048Bt.n(str, "debugName");
        this.a = c0321Mh;
        this.b = xw;
        this.c = str;
        this.d = str2;
        C0296Lh c0296Lh = c0321Mh.a;
        this.e = c0296Lh.a.c(new VW(this, 0));
        this.f = c0296Lh.a.c(new VW(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = C1384kk.h;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                RK rk = (RK) it.next();
                linkedHashMap.put(Integer.valueOf(rk.k), new C1382ki(this.a, rk, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static JR a(JR jr, AbstractC1004ey abstractC1004ey) {
        AbstractC0545Ux l = AbstractC0772bO.l(jr);
        InterfaceC1738q4 annotations = jr.getAnnotations();
        AbstractC1004ey x = AbstractC0946e20.x(jr);
        List u = AbstractC0946e20.u(jr);
        List l0 = AbstractC0720ac.l0(AbstractC0946e20.y(jr));
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(l0));
        Iterator it = l0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1701pX) it.next()).b());
        }
        return AbstractC0946e20.q(l, annotations, x, u, arrayList, abstractC1004ey, true).F0(jr.C0());
    }

    public static final ArrayList e(MK mk, XW xw) {
        List list = mk.k;
        AbstractC0048Bt.m(list, "argumentList");
        MK C = AbstractC0946e20.C(mk, xw.a.d);
        Iterable e = C != null ? e(C, xw) : null;
        if (e == null) {
            e = C1318jk.h;
        }
        return AbstractC0720ac.A0(list, e);
    }

    public static OW f(List list, InterfaceC1738q4 interfaceC1738q4, SW sw, InterfaceC1118gg interfaceC1118gg) {
        OW I0;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0528Ug) it.next()).getClass();
            if (interfaceC1738q4.isEmpty()) {
                OW.i.getClass();
                I0 = OW.j;
            } else {
                C0208Hx c0208Hx = OW.i;
                List J = AbstractC0868ct.J(new C1869s4(interfaceC1738q4));
                c0208Hx.getClass();
                I0 = C0208Hx.I0(J);
            }
            arrayList.add(I0);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1048fc.f0(arrayList2, (Iterable) it2.next());
        }
        OW.i.getClass();
        return C0208Hx.I0(arrayList2);
    }

    public static final InterfaceC1245ib h(XW xw, MK mk, int i) {
        C0321Mh c0321Mh = xw.a;
        C1639ob x = AbstractC1052fg.x(c0321Mh.b, i);
        C1831rW z = PQ.z(PQ.x(mk, new VW(xw, 2)), RP.D);
        ArrayList arrayList = new ArrayList();
        Iterator it = z.a.iterator();
        while (it.hasNext()) {
            arrayList.add(z.b.invoke(it.next()));
        }
        int t = PQ.t(PQ.x(x, WW.j));
        while (arrayList.size() < t) {
            arrayList.add(0);
        }
        return c0321Mh.a.l.x(x, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return AbstractC0720ac.J0(this.g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final InterfaceC1437lX c(int i) {
        InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) this.g.get(Integer.valueOf(i));
        if (interfaceC1437lX != null) {
            return interfaceC1437lX;
        }
        XW xw = this.b;
        if (xw != null) {
            return xw.c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JR d(MK mk, boolean z) {
        SW d;
        InterfaceC2364zb interfaceC2364zb;
        Object obj;
        JR r;
        JR r2;
        AbstractC1701pX abstractC1701pX;
        AbstractC1004ey b;
        int size;
        Iterator it;
        int i;
        AbstractC1701pX c1767qX;
        C0321Mh c0321Mh = this.a;
        C0695aD c0695aD = c0321Mh.d;
        InterfaceC0893dE interfaceC0893dE = c0321Mh.b;
        InterfaceC1118gg interfaceC1118gg = c0321Mh.c;
        C0296Lh c0296Lh = c0321Mh.a;
        AbstractC0048Bt.n(mk, "proto");
        if (mk.p()) {
            if (AbstractC1052fg.x(c0321Mh.b, mk.p).c) {
                c0321Mh.a.g.getClass();
            }
        } else if ((mk.j & 128) == 128) {
            if (AbstractC1052fg.x(c0321Mh.b, mk.s).c) {
                c0321Mh.a.g.getClass();
            }
        }
        if (!mk.p()) {
            int i2 = mk.j;
            if ((i2 & 32) == 32) {
                interfaceC2364zb = c(mk.q);
                if (interfaceC2364zb == null) {
                    C0273Kk c0273Kk = C0273Kk.a;
                    d = C0273Kk.d(EnumC0247Jk.v, String.valueOf(mk.q), this.d);
                }
            } else if ((i2 & 64) == 64) {
                String string = interfaceC0893dE.getString(mk.r);
                Iterator it2 = b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (AbstractC0048Bt.h(((InterfaceC1437lX) obj).getName().b(), string)) {
                        break;
                    }
                }
                InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) obj;
                if (interfaceC1437lX == null) {
                    C0273Kk c0273Kk2 = C0273Kk.a;
                    d = C0273Kk.d(EnumC0247Jk.w, string, interfaceC1118gg.toString());
                } else {
                    interfaceC2364zb = interfaceC1437lX;
                }
            } else if ((i2 & 128) == 128) {
                interfaceC2364zb = (InterfaceC2364zb) this.f.invoke(Integer.valueOf(mk.s));
                if (interfaceC2364zb == null) {
                    interfaceC2364zb = h(this, mk, mk.s);
                }
            } else {
                C0273Kk c0273Kk3 = C0273Kk.a;
                d = C0273Kk.d(EnumC0247Jk.y, new String[0]);
            }
            boolean z2 = true;
            if (!C0273Kk.f(d.c())) {
                C0273Kk c0273Kk4 = C0273Kk.a;
                return C0273Kk.e(EnumC0247Jk.D, C1318jk.h, d, (String[]) Arrays.copyOf(new String[]{d.toString()}, 1));
            }
            C0347Nh c0347Nh = new C0347Nh(c0296Lh.a, new K2(this, 22, mk));
            OW f = f(c0296Lh.s, c0347Nh, d, interfaceC1118gg);
            ArrayList e = e(mk, this);
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(e));
            Iterator it3 = e.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC0868ct.Y();
                    throw null;
                }
                KK kk = (KK) next;
                List parameters = d.getParameters();
                AbstractC0048Bt.m(parameters, "constructor.parameters");
                InterfaceC1437lX interfaceC1437lX2 = (InterfaceC1437lX) AbstractC0720ac.q0(i3, parameters);
                JK jk = kk.j;
                if (jk == JK.STAR) {
                    c1767qX = interfaceC1437lX2 == null ? new C1565nT(c0296Lh.b.l()) : new C1631oT(interfaceC1437lX2);
                    it = it3;
                } else {
                    AbstractC0048Bt.m(jk, "typeArgumentProto.projection");
                    int ordinal = jk.ordinal();
                    if (ordinal != 0) {
                        it = it3;
                        i = 3;
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    throw new C0057Cc();
                                }
                                throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + jk);
                            }
                            i = 1;
                        }
                    } else {
                        it = it3;
                        i = 2;
                    }
                    int i5 = kk.i;
                    MK a = (i5 & 2) == 2 ? kk.k : (i5 & 4) == 4 ? c0695aD.a(kk.l) : null;
                    c1767qX = a == null ? new C1767qX(1, C0273Kk.c(EnumC0247Jk.I, kk.toString())) : new C1767qX(i, g(a));
                }
                arrayList.add(c1767qX);
                i3 = i4;
                it3 = it;
            }
            List J0 = AbstractC0720ac.J0(arrayList);
            InterfaceC2364zb c = d.c();
            if (z && (c instanceof C1316ji)) {
                C1316ji c1316ji = (C1316ji) c;
                AbstractC0048Bt.n(c1316ji, "<this>");
                CU cu = new CU();
                List parameters2 = c1316ji.n.getParameters();
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(parameters2));
                Iterator it4 = parameters2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((InterfaceC1437lX) it4.next()).a());
                }
                C1334k c1334k = new C1334k(null, c1316ji, J0, EB.V(AbstractC0720ac.O0(arrayList2, J0)), 18);
                OW.i.getClass();
                OW ow = OW.j;
                AbstractC0048Bt.n(ow, "attributes");
                JR c2 = cu.c(c1334k, ow, false, 0, true);
                List list = c0296Lh.s;
                ArrayList y0 = AbstractC0720ac.y0(c0347Nh, c2.getAnnotations());
                OW f2 = f(list, y0.isEmpty() ? C0460Rq.t : new C1803r4(0, y0), d, interfaceC1118gg);
                if (!AbstractC2228xX.e(c2) && !mk.l) {
                    z2 = false;
                }
                r = c2.F0(z2).H0(f2);
            } else if (AbstractC1650om.a.c(mk.x).booleanValue()) {
                boolean z3 = mk.l;
                int size2 = d.getParameters().size() - J0.size();
                if (size2 != 0) {
                    if (size2 == 1 && (size = J0.size() - 1) >= 0) {
                        SW z4 = d.l().v(size).z();
                        AbstractC0048Bt.m(z4, "functionTypeConstructor.…on(arity).typeConstructor");
                        r2 = HO.r(J0, f, z4, z3);
                        if (r2 != null) {
                            C0273Kk c0273Kk5 = C0273Kk.a;
                            r = C0273Kk.e(EnumC0247Jk.x, J0, d, new String[0]);
                        } else {
                            r = r2;
                        }
                    }
                    r2 = null;
                    if (r2 != null) {
                    }
                } else {
                    r2 = HO.r(J0, f, d, z3);
                    InterfaceC2364zb c3 = r2.B0().c();
                    if ((c3 != null ? AbstractC0946e20.v(c3) : null) == EnumC0304Lp.k && (abstractC1701pX = (AbstractC1701pX) AbstractC0720ac.w0(AbstractC0946e20.y(r2))) != null && (b = abstractC1701pX.b()) != null) {
                        InterfaceC2364zb c4 = b.B0().c();
                        C2245xo g = c4 != null ? AbstractC0192Hh.g(c4) : null;
                        if (b.w0().size() == 1 && (AbstractC0048Bt.h(g, AbstractC1499mT.f) || AbstractC0048Bt.h(g, YW.a))) {
                            AbstractC1004ey b2 = ((AbstractC1701pX) AbstractC0720ac.D0(b.w0())).b();
                            AbstractC0048Bt.m(b2, "continuationArgumentType.arguments.single().type");
                            InterfaceC2072v9 interfaceC2072v9 = interfaceC1118gg instanceof InterfaceC2072v9 ? (InterfaceC2072v9) interfaceC1118gg : null;
                            r2 = AbstractC0048Bt.h(interfaceC2072v9 != null ? AbstractC0192Hh.c(interfaceC2072v9) : null, AbstractC2093vU.a) ? a(r2, b2) : a(r2, b2);
                        }
                        if (r2 != null) {
                        }
                    }
                    r2 = null;
                    if (r2 != null) {
                    }
                }
            } else {
                r = HO.r(J0, f, d, mk.l);
                if (AbstractC1650om.b.c(mk.x).booleanValue()) {
                    C0632Yg p = C1623oL.p(r, true);
                    if (p == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + r + '\'').toString());
                    }
                    r = p;
                }
            }
            int i6 = mk.j;
            MK a2 = (i6 & 1024) == 1024 ? mk.v : (i6 & 2048) == 2048 ? c0695aD.a(mk.w) : null;
            if (a2 != null) {
                r = TM.F(r, d(a2, false));
            }
            if (mk.p()) {
                AbstractC1052fg.x(interfaceC0893dE, mk.p);
                c0296Lh.r.getClass();
                AbstractC0048Bt.n(r, "computedType");
            }
            return r;
        }
        interfaceC2364zb = (InterfaceC2364zb) this.e.invoke(Integer.valueOf(mk.p));
        if (interfaceC2364zb == null) {
            interfaceC2364zb = h(this, mk, mk.p);
        }
        d = interfaceC2364zb.z();
        AbstractC0048Bt.m(d, "classifier.typeConstructor");
        boolean z22 = true;
        if (!C0273Kk.f(d.c())) {
        }
    }

    public final AbstractC1004ey g(MK mk) {
        AbstractC0048Bt.n(mk, "proto");
        if ((mk.j & 2) != 2) {
            return d(mk, true);
        }
        C0321Mh c0321Mh = this.a;
        String string = c0321Mh.b.getString(mk.m);
        JR d = d(mk, true);
        C0695aD c0695aD = c0321Mh.d;
        int i = mk.j;
        MK a = (i & 4) == 4 ? mk.n : (i & 8) == 8 ? c0695aD.a(mk.f68o) : null;
        AbstractC0048Bt.k(a);
        return c0321Mh.a.j.b(mk, string, d, d(a, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        XW xw = this.b;
        if (xw == null) {
            str = "";
        } else {
            str = ". Child of " + xw.c;
        }
        sb.append(str);
        return sb.toString();
    }
}
