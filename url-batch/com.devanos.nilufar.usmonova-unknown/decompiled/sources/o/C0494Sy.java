package o;

import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Sy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494Sy extends AbstractC1005ez {
    public final InterfaceC1245ib n;

    /* renamed from: o, reason: collision with root package name */
    public final C2217xM f108o;
    public final boolean p;
    public final SA q;
    public final SA r;
    public final SA s;
    public final SA t;
    public final TA u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494Sy(C1216i8 c1216i8, InterfaceC1245ib interfaceC1245ib, C2217xM c2217xM, boolean z, C0494Sy c0494Sy) {
        super(c1216i8, c0494Sy);
        AbstractC0048Bt.n(c1216i8, "c");
        AbstractC0048Bt.n(c2217xM, "jClass");
        this.n = interfaceC1245ib;
        this.f108o = c2217xM;
        this.p = z;
        OT ot = ((C1198hu) c1216i8.i).a;
        C0442Qy c0442Qy = new C0442Qy(this, c1216i8);
        VA va = (VA) ot;
        va.getClass();
        this.q = new SA(va, c0442Qy);
        C0468Ry c0468Ry = new C0468Ry(this, 1);
        VA va2 = (VA) ot;
        va2.getClass();
        this.r = new SA(va2, c0468Ry);
        C0442Qy c0442Qy2 = new C0442Qy(c1216i8, this);
        VA va3 = (VA) ot;
        va3.getClass();
        this.s = new SA(va3, c0442Qy2);
        C0468Ry c0468Ry2 = new C0468Ry(this, 0);
        VA va4 = (VA) ot;
        va4.getClass();
        this.t = new SA(va4, c0468Ry2);
        this.u = ((VA) ot).c(new C0810c0(this, 12, c1216i8));
    }

    public static HR C(HR hr, InterfaceC0381Op interfaceC0381Op, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return hr;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            HR hr2 = (HR) it.next();
            if (!hr.equals(hr2) && hr2.I == null && F(hr2, interfaceC0381Op)) {
                InterfaceC0381Op build = hr.m0().v().build();
                AbstractC0048Bt.k(build);
                return (HR) build;
            }
        }
        return hr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HR D(HR hr) {
        C2245xo c2245xo;
        List t0 = hr.t0();
        AbstractC0048Bt.m(t0, "valueParameters");
        RY ry = (RY) AbstractC0720ac.w0(t0);
        if (ry != null) {
            InterfaceC2364zb c = ry.c().B0().c();
            if (c != null) {
                C2377zo h = AbstractC0192Hh.h(c);
                if (!h.d()) {
                    h = null;
                }
                if (h != null) {
                    c2245xo = h.g();
                    if (!AbstractC0048Bt.h(c2245xo, AbstractC1499mT.f)) {
                        ry = null;
                    }
                    if (ry != null) {
                        InterfaceC0355Np m0 = hr.m0();
                        List t02 = hr.t0();
                        AbstractC0048Bt.m(t02, "valueParameters");
                        HR hr2 = (HR) m0.k(AbstractC0720ac.l0(t02)).P(((AbstractC1701pX) ry.c().w0().get(0)).b()).build();
                        if (hr2 == null) {
                            return hr2;
                        }
                        hr2.B = true;
                        return hr2;
                    }
                }
            }
            c2245xo = null;
            if (!AbstractC0048Bt.h(c2245xo, AbstractC1499mT.f)) {
            }
            if (ry != null) {
            }
        }
        return null;
    }

    public static boolean F(InterfaceC0381Op interfaceC0381Op, InterfaceC0381Op interfaceC0381Op2) {
        int c = XG.c.n(interfaceC0381Op2, interfaceC0381Op, true).c();
        AbstractC1888sN.t(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return c == 1 && !EB.n(interfaceC0381Op2, interfaceC0381Op);
    }

    public static boolean G(HR hr, HR hr2) {
        int i = Z8.l;
        AbstractC0048Bt.n(hr, "<this>");
        if (AbstractC0048Bt.h(hr.getName().b(), "removeAt") && AbstractC0048Bt.h(PX.z(hr), WS.g.b)) {
            hr2 = hr2.a();
        }
        AbstractC0048Bt.m(hr2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(hr2, hr);
    }

    public static HR H(PJ pj, String str, InterfaceC2114vp interfaceC2114vp) {
        HR hr;
        Iterator it = ((Iterable) interfaceC2114vp.invoke(C0827cE.e(str))).iterator();
        do {
            hr = null;
            if (!it.hasNext()) {
                break;
            }
            HR hr2 = (HR) it.next();
            if (hr2.t0().size() == 0) {
                AE ae = InterfaceC1136gy.a;
                AbstractC1004ey abstractC1004ey = hr2.n;
                if (abstractC1004ey == null ? false : ae.b(abstractC1004ey, pj.c())) {
                    hr = hr2;
                }
            }
        } while (hr == null);
        return hr;
    }

    public static HR J(PJ pj, InterfaceC2114vp interfaceC2114vp) {
        HR hr;
        AbstractC1004ey abstractC1004ey;
        String b = pj.getName().b();
        AbstractC0048Bt.m(b, "name.asString()");
        Iterator it = ((Iterable) interfaceC2114vp.invoke(C0827cE.e(AbstractC0412Pu.b(b)))).iterator();
        do {
            hr = null;
            if (!it.hasNext()) {
                break;
            }
            HR hr2 = (HR) it.next();
            if (hr2.t0().size() == 1 && (abstractC1004ey = hr2.n) != null) {
                C0827cE c0827cE = AbstractC0545Ux.e;
                if (AbstractC0545Ux.D(abstractC1004ey, AbstractC1433lT.d)) {
                    AE ae = InterfaceC1136gy.a;
                    List t0 = hr2.t0();
                    AbstractC0048Bt.m(t0, "descriptor.valueParameters");
                    if (ae.a(((RY) AbstractC0720ac.D0(t0)).c(), pj.c())) {
                        hr = hr2;
                    }
                }
            }
        } while (hr == null);
        return hr;
    }

    public static boolean M(HR hr, InterfaceC0381Op interfaceC0381Op) {
        String y = PX.y(hr, 2);
        InterfaceC0381Op a = interfaceC0381Op.a();
        AbstractC0048Bt.m(a, "builtinWithErasedParameters.original");
        return y.equals(PX.y(a, 2)) && !F(hr, interfaceC0381Op);
    }

    public static final ArrayList v(C0494Sy c0494Sy, C0827cE c0827cE) {
        Collection d = ((InterfaceC1578ng) c0494Sy.e.invoke()).d(c0827cE);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(d));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(c0494Sy.t((GM) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(C0494Sy c0494Sy, C0827cE c0827cE) {
        LinkedHashSet K = c0494Sy.K(c0827cE);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            HR hr = (HR) obj;
            AbstractC0048Bt.n(hr, "<this>");
            if (AbstractC1035fP.f(hr) == null && C0691a9.a(hr) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, C1630oS c1630oS, InterfaceC2114vp interfaceC2114vp) {
        HR hr;
        WJ wj;
        C0804bu c0804bu;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PJ pj = (PJ) it.next();
            if (E(pj, interfaceC2114vp)) {
                HR I = I(pj, interfaceC2114vp);
                AbstractC0048Bt.k(I);
                if (pj.G()) {
                    hr = J(pj, interfaceC2114vp);
                    AbstractC0048Bt.k(hr);
                } else {
                    hr = null;
                }
                if (hr != null) {
                    hr.g();
                    I.g();
                }
                InterfaceC1245ib interfaceC1245ib = this.n;
                AbstractC0048Bt.n(interfaceC1245ib, "ownerDescriptor");
                C0804bu c0804bu2 = new C0804bu(interfaceC1245ib, C0460Rq.t, I.g(), I.getVisibility(), hr != null, pj.getName(), I.d(), null, 1, false, null);
                AbstractC1004ey abstractC1004ey = I.n;
                AbstractC0048Bt.k(abstractC1004ey);
                C0261Jy p = p();
                C1318jk c1318jk = C1318jk.h;
                c0804bu2.O0(abstractC1004ey, c1318jk, p, null, c1318jk);
                SJ B = AbstractC1807r8.B(c0804bu2, I.getAnnotations(), false, I.d());
                B.s = I;
                B.K0(c0804bu2.c());
                if (hr != null) {
                    List t0 = hr.t0();
                    AbstractC0048Bt.m(t0, "setterMethod.valueParameters");
                    RY ry = (RY) AbstractC0720ac.p0(t0);
                    if (ry == null) {
                        throw new AssertionError("No parameter found for " + hr);
                    }
                    wj = AbstractC1807r8.D(c0804bu2, hr.getAnnotations(), ry.getAnnotations(), false, hr.getVisibility(), hr.d());
                    wj.s = hr;
                } else {
                    wj = null;
                }
                c0804bu2.L0(B, wj, null, null);
                c0804bu = c0804bu2;
            } else {
                c0804bu = null;
            }
            if (c0804bu != null) {
                abstractCollection.add(c0804bu);
                if (c1630oS != null) {
                    c1630oS.add(pj);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z = this.p;
        InterfaceC1245ib interfaceC1245ib = this.n;
        if (z) {
            Collection d = interfaceC1245ib.z().d();
            AbstractC0048Bt.m(d, "ownerDescriptor.typeConstructor.supertypes");
            return d;
        }
        ((AE) ((C1198hu) this.b.i).u).getClass();
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        Collection d2 = interfaceC1245ib.z().d();
        AbstractC0048Bt.m(d2, "classDescriptor.typeConstructor.supertypes");
        return d2;
    }

    public final boolean E(PJ pj, InterfaceC2114vp interfaceC2114vp) {
        if (AbstractC0048Bt.K(pj)) {
            return false;
        }
        HR I = I(pj, interfaceC2114vp);
        HR J = J(pj, interfaceC2114vp);
        if (I == null) {
            return false;
        }
        if (pj.G()) {
            return J != null && J.g() == I.g();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final HR I(PJ pj, InterfaceC2114vp interfaceC2114vp) {
        C0827cE c0827cE;
        SJ getter = pj.getGetter();
        String str = null;
        SJ sj = getter != null ? (SJ) AbstractC1035fP.f(getter) : null;
        if (sj != null) {
            AbstractC0545Ux.z(sj);
            InterfaceC2204x9 b = AbstractC0192Hh.b(AbstractC0192Hh.k(sj), I2.v);
            if (b != null && (c0827cE = (C0827cE) AbstractC0757b9.a.get(AbstractC0192Hh.g(b))) != null) {
                str = c0827cE.b();
            }
        }
        if (str != null && !AbstractC1035fP.h(this.n, sj)) {
            return H(pj, str, interfaceC2114vp);
        }
        String b2 = pj.getName().b();
        AbstractC0048Bt.m(b2, "name.asString()");
        return H(pj, AbstractC0412Pu.a(b2), interfaceC2114vp);
    }

    public final LinkedHashSet K(C0827cE c0827cE) {
        Collection B = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(linkedHashSet, ((AbstractC1004ey) it.next()).r0().a(c0827cE, DE.l));
        }
        return linkedHashSet;
    }

    public final Set L(C0827cE c0827cE) {
        Collection B = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            Collection c = ((AbstractC1004ey) it.next()).r0().c(c0827cE, DE.l);
            ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(c));
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PJ) it2.next());
            }
            AbstractC1048fc.f0(arrayList, arrayList2);
        }
        return AbstractC0720ac.M0(arrayList);
    }

    public final boolean N(HR hr) {
        Collection L;
        C0827cE name = hr.getName();
        AbstractC0048Bt.m(name, "function.name");
        String b = name.b();
        AbstractC0048Bt.m(b, "name.asString()");
        C2245xo c2245xo = AbstractC0412Pu.a;
        if (AbstractC0778bU.B(b, "get", false) || AbstractC0778bU.B(b, "is", false)) {
            C0827cE M = EB.M(name, "get", null, 12);
            if (M == null) {
                M = EB.M(name, "is", null, 8);
            }
            L = AbstractC0868ct.L(M);
        } else if (AbstractC0778bU.B(b, "set", false)) {
            L = P6.i0(new C0827cE[]{EB.M(name, "set", null, 4), EB.M(name, "set", "is", 4)});
        } else {
            L = (List) AbstractC0757b9.b.get(name);
            if (L == null) {
                L = C1318jk.h;
            }
        }
        if (!L.isEmpty()) {
            Iterator it = L.iterator();
            loop0: while (it.hasNext()) {
                Set<PJ> L2 = L((C0827cE) it.next());
                if (!(L2 instanceof Collection) || !L2.isEmpty()) {
                    for (PJ pj : L2) {
                        if (E(pj, new C0810c0(hr, 11, this))) {
                            if (pj.G()) {
                                break loop0;
                            }
                            String b2 = hr.getName().b();
                            AbstractC0048Bt.m(b2, "function.name.asString()");
                            if (!AbstractC0778bU.B(b2, "set", false)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = WS.a;
        C0827cE name2 = hr.getName();
        AbstractC0048Bt.m(name2, "name");
        C0827cE c0827cE = (C0827cE) WS.k.get(name2);
        if (c0827cE != null) {
            LinkedHashSet K = K(c0827cE);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : K) {
                HR hr2 = (HR) obj;
                AbstractC0048Bt.n(hr2, "<this>");
                if (AbstractC1035fP.f(hr2) != null) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC0355Np m0 = hr.m0();
                m0.p(c0827cE);
                m0.T();
                m0.A();
                InterfaceC0381Op build = m0.build();
                AbstractC0048Bt.k(build);
                HR hr3 = (HR) build;
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (G((HR) it2.next(), hr3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i = C0691a9.l;
        C0827cE name3 = hr.getName();
        AbstractC0048Bt.m(name3, "name");
        if (C0691a9.b(name3)) {
            C0827cE name4 = hr.getName();
            AbstractC0048Bt.m(name4, "name");
            LinkedHashSet K2 = K(name4);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = K2.iterator();
            while (it3.hasNext()) {
                InterfaceC0381Op a = C0691a9.a((HR) it3.next());
                if (a != null) {
                    arrayList3.add(a);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (M(hr, (InterfaceC0381Op) it4.next())) {
                        break;
                    }
                }
            }
        }
        HR D = D(hr);
        if (D == null) {
            return true;
        }
        C0827cE name5 = hr.getName();
        AbstractC0048Bt.m(name5, "name");
        LinkedHashSet<HR> K3 = K(name5);
        if (K3.isEmpty()) {
            return true;
        }
        for (HR hr4 : K3) {
            if (hr4.isSuspend() && F(D, hr4)) {
                return false;
            }
        }
        return true;
    }

    public final void O(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        AbstractC0048Bt.n(((C1198hu) this.b.i).n, "<this>");
        AbstractC0048Bt.n(this.n, "scopeOwner");
    }

    @Override // o.AbstractC1005ez, o.XB, o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        O(c0827cE, de);
        return super.a(c0827cE, de);
    }

    @Override // o.AbstractC1005ez, o.XB, o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        O(c0827cE, de);
        return super.c(c0827cE, de);
    }

    @Override // o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        TA ta;
        InterfaceC1245ib interfaceC1245ib;
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        O(c0827cE, de);
        C0494Sy c0494Sy = (C0494Sy) this.c;
        return (c0494Sy == null || (ta = c0494Sy.u) == null || (interfaceC1245ib = (InterfaceC1245ib) ta.invoke(c0827cE)) == null) ? (InterfaceC2364zb) this.u.invoke(c0827cE) : interfaceC1245ib;
    }

    @Override // o.AbstractC1005ez
    public final Set h(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return WQ.n((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // o.AbstractC1005ez
    public final Set i(C2106vh c2106vh, C2316yt c2316yt) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        InterfaceC1245ib interfaceC1245ib = this.n;
        Collection d = interfaceC1245ib.z().d();
        AbstractC0048Bt.m(d, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(linkedHashSet, ((AbstractC1004ey) it.next()).r0().d());
        }
        SA sa = this.e;
        linkedHashSet.addAll(((InterfaceC1578ng) sa.invoke()).a());
        linkedHashSet.addAll(((InterfaceC1578ng) sa.invoke()).b());
        linkedHashSet.addAll(h(c2106vh, c2316yt));
        C1216i8 c1216i8 = this.b;
        ((C1097gL) ((C1198hu) c1216i8.i).x).getClass();
        AbstractC0048Bt.n(c1216i8, "_context_receiver_0");
        AbstractC0048Bt.n(interfaceC1245ib, "thisDescriptor");
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // o.AbstractC1005ez
    public final void j(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        boolean f = this.f108o.f();
        InterfaceC1245ib interfaceC1245ib = this.n;
        C1216i8 c1216i8 = this.b;
        if (f) {
            SA sa = this.e;
            if (((InterfaceC1578ng) sa.invoke()).f(c0827cE) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((HR) it.next()).t0().isEmpty()) {
                            break;
                        }
                    }
                }
                JM f2 = ((InterfaceC1578ng) sa.invoke()).f(c0827cE);
                AbstractC0048Bt.k(f2);
                C0338My G = AbstractC0022At.G(c1216i8, f2);
                C1198hu c1198hu = (C1198hu) c1216i8.i;
                C0934du W0 = C0934du.W0(interfaceC1245ib, G, f2.c(), c1198hu.j.H0(f2), true);
                AbstractC1004ey S = ((C0950e6) c1216i8.m).S(f2.f(), AbstractC1305jX.J(2, false, null, 6));
                C0261Jy p = p();
                C0244Jh c0244Jh = AbstractC0270Kh.e;
                C1318jk c1318jk = C1318jk.h;
                W0.V0(null, p, c1318jk, c1318jk, c1318jk, S, 3, c0244Jh, null);
                W0.K = 1;
                c1198hu.g.getClass();
                arrayList.add(W0);
            }
        }
        ((C1097gL) ((C1198hu) c1216i8.i).x).getClass();
        AbstractC0048Bt.n(c1216i8, "_context_receiver_0");
        AbstractC0048Bt.n(interfaceC1245ib, "thisDescriptor");
        AbstractC0048Bt.n(c0827cE, "name");
    }

    @Override // o.AbstractC1005ez
    public final InterfaceC1578ng k() {
        return new C1179hb(this.f108o, C2316yt.p);
    }

    @Override // o.AbstractC1005ez
    public final void m(LinkedHashSet linkedHashSet, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        LinkedHashSet K = K(c0827cE);
        ArrayList arrayList = WS.a;
        if (!WS.j.contains(c0827cE)) {
            int i = C0691a9.l;
            if (!C0691a9.b(c0827cE)) {
                if (!K.isEmpty()) {
                    Iterator it = K.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC0381Op) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : K) {
                    if (N((HR) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, c0827cE, arrayList2, false);
                return;
            }
        }
        C1630oS c1630oS = new C1630oS();
        LinkedHashSet N = AbstractC1052fg.N(c0827cE, K, C1318jk.h, this.n, InterfaceC0143Fk.c, ((AE) ((C1198hu) this.b.i).u).d);
        int i2 = 1;
        z(c0827cE, linkedHashSet, N, linkedHashSet, new U8(i2, 5, this));
        z(c0827cE, linkedHashSet, N, c1630oS, new U8(i2, 6, this));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : K) {
            if (N((HR) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, c0827cE, AbstractC0720ac.A0(arrayList3, c1630oS), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC1005ez
    public final void n(ArrayList arrayList, C0827cE c0827cE) {
        Set set;
        GM gm;
        AbstractC0048Bt.n(c0827cE, "name");
        boolean isAnnotation = this.f108o.a.isAnnotation();
        C1216i8 c1216i8 = this.b;
        if (isAnnotation && (gm = (GM) AbstractC0720ac.E0(((InterfaceC1578ng) this.e.invoke()).d(c0827cE))) != null) {
            C1132gu P0 = C1132gu.P0(this.n, AbstractC0022At.G(c1216i8, gm), AbstractC2219xO.t(gm.e()), false, gm.c(), ((C1198hu) c1216i8.i).j.H0(gm), false);
            SJ v = AbstractC1807r8.v(P0, C0460Rq.t);
            P0.L0(v, null, null, null);
            AbstractC0048Bt.n(c1216i8, "<this>");
            AbstractC1004ey l = AbstractC1005ez.l(gm, new C1216i8((C1198hu) c1216i8.i, new C1333jz(c1216i8, P0, gm, 0), c1216i8.k));
            C0261Jy p = p();
            C1318jk c1318jk = C1318jk.h;
            P0.O0(l, c1318jk, p, null, c1318jk);
            v.t = l;
            arrayList.add(P0);
        }
        Set L = L(c0827cE);
        if (L.isEmpty()) {
            return;
        }
        C1630oS c1630oS = new C1630oS();
        C1630oS c1630oS2 = new C1630oS();
        A(L, arrayList, c1630oS, new C0416Py(this, 0));
        if (c1630oS.isEmpty()) {
            set = AbstractC0720ac.M0(L);
        } else if (c1630oS instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : L) {
                if (!c1630oS.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            set = linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(L);
            linkedHashSet2.removeAll(c1630oS);
            set = linkedHashSet2;
        }
        A(set, c1630oS2, null, new C0416Py(this, 1));
        LinkedHashSet n = WQ.n(L, c1630oS2);
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        arrayList.addAll(AbstractC1052fg.N(c0827cE, n, arrayList, this.n, c1198hu.f, ((AE) c1198hu.u).d));
    }

    @Override // o.AbstractC1005ez
    public final Set o(C2106vh c2106vh) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        if (this.f108o.a.isAnnotation()) {
            return d();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC1578ng) this.e.invoke()).e());
        Collection d = this.n.z().d();
        AbstractC0048Bt.m(d, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = d.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(linkedHashSet, ((AbstractC1004ey) it.next()).r0().e());
        }
        return linkedHashSet;
    }

    @Override // o.AbstractC1005ez
    public final C0261Jy p() {
        InterfaceC1245ib interfaceC1245ib = this.n;
        if (interfaceC1245ib != null) {
            int i = AbstractC0114Eh.a;
            return interfaceC1245ib.z0();
        }
        AbstractC0114Eh.a(0);
        throw null;
    }

    @Override // o.AbstractC1005ez
    public final InterfaceC1118gg q() {
        return this.n;
    }

    @Override // o.AbstractC1005ez
    public final boolean r(C0934du c0934du) {
        if (this.f108o.a.isAnnotation()) {
            return false;
        }
        return N(c0934du);
    }

    @Override // o.AbstractC1005ez
    public final C0808bz s(GM gm, ArrayList arrayList, AbstractC1004ey abstractC1004ey, List list) {
        AbstractC0048Bt.n(gm, "method");
        ((C1198hu) this.b.i).e.getClass();
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new C0808bz(abstractC1004ey, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "descriptor";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.AbstractC1005ez
    public final String toString() {
        return "Lazy Java member scope for " + this.f108o.c();
    }

    public final void x(ArrayList arrayList, C0567Vt c0567Vt, int i, GM gm, AbstractC1004ey abstractC1004ey, AbstractC1004ey abstractC1004ey2) {
        InterfaceC0411Pt interfaceC0411Pt;
        C1672p4 c1672p4 = C0460Rq.t;
        C0827cE c = gm.c();
        if (abstractC1004ey == null) {
            AbstractC2228xX.a(2);
            throw null;
        }
        AbstractC2097vY g = AbstractC2228xX.g(abstractC1004ey, false);
        Object defaultValue = gm.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC1492mM.a;
            interfaceC0411Pt = Enum.class.isAssignableFrom(cls) ? new CM(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new C1690pM(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new C1756qM(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C2283yM(null, (Class) defaultValue) : new EM(null, defaultValue);
        } else {
            interfaceC0411Pt = null;
        }
        arrayList.add(new RY(c0567Vt, null, i, c1672p4, c, g, interfaceC0411Pt != null, false, false, abstractC1004ey2 != null ? AbstractC2228xX.g(abstractC1004ey2, false) : null, ((C1198hu) this.b.i).j.H0(gm)));
    }

    public final void y(LinkedHashSet linkedHashSet, C0827cE c0827cE, ArrayList arrayList, boolean z) {
        C1198hu c1198hu = (C1198hu) this.b.i;
        LinkedHashSet<HR> N = AbstractC1052fg.N(c0827cE, arrayList, linkedHashSet, this.n, c1198hu.f, ((AE) c1198hu.u).d);
        if (!z) {
            linkedHashSet.addAll(N);
            return;
        }
        ArrayList A0 = AbstractC0720ac.A0(linkedHashSet, N);
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(N));
        for (HR hr : N) {
            HR hr2 = (HR) AbstractC1035fP.g(hr);
            if (hr2 != null) {
                hr = C(hr, hr2, A0);
            }
            arrayList2.add(hr);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(C0827cE c0827cE, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, InterfaceC2114vp interfaceC2114vp) {
        HR C;
        Object obj;
        HR hr;
        HR C2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            HR hr2 = (HR) it.next();
            HR hr3 = (HR) AbstractC1035fP.f(hr2);
            HR hr4 = null;
            if (hr3 != null) {
                String e = AbstractC1035fP.e(hr3);
                AbstractC0048Bt.k(e);
                Iterator it2 = ((Collection) interfaceC2114vp.invoke(C0827cE.e(e))).iterator();
                while (it2.hasNext()) {
                    InterfaceC0355Np m0 = ((HR) it2.next()).m0();
                    m0.p(c0827cE);
                    m0.T();
                    m0.A();
                    InterfaceC0381Op build = m0.build();
                    AbstractC0048Bt.k(build);
                    HR hr5 = (HR) build;
                    if (G(hr3, hr5)) {
                        C = C(hr5, hr3, linkedHashSet);
                        break;
                    }
                }
            }
            C = null;
            AbstractC1052fg.e(abstractSet, C);
            InterfaceC0381Op a = C0691a9.a(hr2);
            if (a != 0) {
                C0827cE name = ((AbstractC1184hg) a).getName();
                AbstractC0048Bt.m(name, "overridden.name");
                Iterator it3 = ((Iterable) interfaceC2114vp.invoke(name)).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it3.next();
                        if (M((HR) obj, a)) {
                            break;
                        }
                    }
                }
                HR hr6 = (HR) obj;
                if (hr6 != null) {
                    InterfaceC0355Np m02 = hr6.m0();
                    List t0 = a.t0();
                    AbstractC0048Bt.m(t0, "overridden.valueParameters");
                    ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(t0));
                    Iterator it4 = t0.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((RY) it4.next()).c());
                    }
                    List t02 = hr6.t0();
                    AbstractC0048Bt.m(t02, "override.valueParameters");
                    m02.k(AbstractC1494mO.c(arrayList, t02, a));
                    m02.T();
                    m02.A();
                    m02.M();
                    hr = (HR) m02.build();
                } else {
                    hr = null;
                }
                if (hr != null) {
                    if (!N(hr)) {
                        hr = null;
                    }
                    if (hr != null) {
                        C2 = C(hr, a, linkedHashSet);
                        AbstractC1052fg.e(abstractSet, C2);
                        if (!hr2.isSuspend()) {
                            C0827cE name2 = hr2.getName();
                            AbstractC0048Bt.m(name2, "descriptor.name");
                            Iterator it5 = ((Iterable) interfaceC2114vp.invoke(name2)).iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                HR D = D((HR) it5.next());
                                if (D == null || !F(D, hr2)) {
                                    D = null;
                                }
                                if (D != null) {
                                    hr4 = D;
                                    break;
                                }
                            }
                        }
                        AbstractC1052fg.e(abstractSet, hr4);
                    }
                }
            }
            C2 = null;
            AbstractC1052fg.e(abstractSet, C2);
            if (!hr2.isSuspend()) {
            }
            AbstractC1052fg.e(abstractSet, hr4);
        }
    }
}
