package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.Zu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672Zu implements Z1, InterfaceC1160hI {
    public static final /* synthetic */ InterfaceC0937dx[] n;
    public final C0826cD h;
    public final SA i;
    public final JR j;
    public final SA k;
    public final PA l;
    public final SA m;

    static {
        VM vm = UM.a;
        n = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0672Zu.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), vm.g(new UJ(vm.b(C0672Zu.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), vm.g(new UJ(vm.b(C0672Zu.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public C0672Zu(C0826cD c0826cD, VA va, C1139h0 c1139h0) {
        this.h = c0826cD;
        this.i = new SA(va, c1139h0);
        C1441lb c1441lb = new C1441lb(new C1450lk(c0826cD, new C2245xo("java.io"), 1), C0827cE.e("Serializable"), 4, 2, AbstractC0868ct.J(new C2124vz(va, new C0620Xu(this, 0))), va);
        c1441lb.w0(VB.b, C1648ok.h, null);
        this.j = c1441lb.i();
        this.k = new SA(va, new K2(this, 9, va));
        this.l = new PA(va, new ConcurrentHashMap(3, 1.0f, 2), new C2311yo(1), 0);
        this.m = new SA(va, new C0620Xu(this, 1));
    }

    @Override // o.InterfaceC1160hI
    public final boolean a(InterfaceC1245ib interfaceC1245ib, C1251ii c1251ii) {
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        C0390Oy b = b(interfaceC1245ib);
        if (b == null || !c1251ii.getAnnotations().i(AbstractC1226iI.a)) {
            return true;
        }
        d().getClass();
        String y = PX.y(c1251ii, 3);
        C0494Sy w0 = b.w0();
        C0827cE name = c1251ii.getName();
        AbstractC0048Bt.m(name, "functionDescriptor.name");
        Collection a = w0.a(name, DE.h);
        if ((a instanceof Collection) && a.isEmpty()) {
            return false;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (PX.y((HR) it.next(), 3).equals(y)) {
                return true;
            }
        }
        return false;
    }

    public final C0390Oy b(InterfaceC1245ib interfaceC1245ib) {
        if (interfaceC1245ib == null) {
            AbstractC0545Ux.a(108);
            throw null;
        }
        C0827cE c0827cE = AbstractC0545Ux.e;
        if (!AbstractC0545Ux.b(interfaceC1245ib, AbstractC1433lT.a) && AbstractC0545Ux.I(interfaceC1245ib)) {
            C2377zo h = AbstractC0192Hh.h(interfaceC1245ib);
            if (h.d()) {
                String str = C1460lu.a;
                C1639ob f = C1460lu.f(h);
                if (f != null) {
                    InterfaceC1245ib H = AbstractC0022At.H(d().a, f.b());
                    if (H instanceof C0390Oy) {
                        return (C0390Oy) H;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x02c5, code lost:
    
        if (r6 != 3) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5 A[SYNTHETIC] */
    @Override // o.Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection c(C0827cE c0827cE, InterfaceC1245ib interfaceC1245ib) {
        Set i;
        Object obj;
        InterfaceC1245ib interfaceC1245ib2;
        HR hr;
        boolean booleanValue;
        boolean z;
        HR hr2;
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        boolean equals = c0827cE.equals(C0238Jb.e);
        InterfaceC0937dx[] interfaceC0937dxArr = n;
        C1318jk<HR> c1318jk = C1318jk.h;
        if (equals && (interfaceC1245ib instanceof C0581Wh)) {
            C0827cE c0827cE2 = AbstractC0545Ux.e;
            if (AbstractC0545Ux.b(interfaceC1245ib, AbstractC1433lT.g) || AbstractC0545Ux.r(interfaceC1245ib) != null) {
                C0581Wh c0581Wh = (C0581Wh) interfaceC1245ib;
                List list = c0581Wh.l.x;
                AbstractC0048Bt.m(list, "classDescriptor.classProto.functionList");
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC1052fg.C(c0581Wh.s.b, ((C2017uK) it.next()).m).equals(C0238Jb.e)) {
                            return c1318jk;
                        }
                    }
                }
                InterfaceC0355Np m0 = ((HR) AbstractC0720ac.C0(((JR) AbstractC0772bO.o(this.k, interfaceC0937dxArr[1])).r0().a(c0827cE, DE.h))).m0();
                m0.E(c0581Wh);
                m0.x(AbstractC0270Kh.e);
                m0.P(c0581Wh.i());
                m0.t(c0581Wh.z0());
                InterfaceC0381Op build = m0.build();
                AbstractC0048Bt.k(build);
                return AbstractC0868ct.J((HR) build);
            }
        }
        d().getClass();
        C0646Yu c0646Yu = new C0646Yu(c0827cE, 0);
        C0390Oy b = b(interfaceC1245ib);
        int i2 = 2;
        if (b != null) {
            C2245xo g = AbstractC0192Hh.g(b);
            C0066Cl c0066Cl = C0066Cl.f;
            AbstractC0048Bt.n(c0066Cl, "builtIns");
            InterfaceC1245ib o2 = HO.o(g, c0066Cl);
            if (o2 == null) {
                i = C1648ok.h;
            } else {
                String str = C1460lu.a;
                C2245xo c2245xo = (C2245xo) C1460lu.k.get(AbstractC0192Hh.h(o2));
                i = c2245xo == null ? AbstractC0773bP.i(o2) : AbstractC0868ct.K(o2, c0066Cl.i(c2245xo));
            }
            Iterable iterable = i;
            if (iterable instanceof List) {
                List list2 = (List) iterable;
                if (!list2.isEmpty()) {
                    obj = list2.get(list2.size() - 1);
                    interfaceC1245ib2 = (InterfaceC1245ib) obj;
                    if (interfaceC1245ib2 != null) {
                        int i3 = C1630oS.j;
                        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(AbstractC0192Hh.g((InterfaceC1245ib) it2.next()));
                        }
                        C1630oS c1630oS = new C1630oS();
                        c1630oS.addAll(arrayList);
                        String str2 = C1460lu.a;
                        boolean containsKey = C1460lu.j.containsKey(AbstractC0114Eh.g(interfaceC1245ib));
                        C2245xo g2 = AbstractC0192Hh.g(b);
                        K2 k2 = new K2(b, 10, interfaceC1245ib2);
                        PA pa = this.l;
                        pa.getClass();
                        Object invoke = pa.invoke(new QA(g2, k2));
                        if (invoke == null) {
                            PA.a(3);
                            throw null;
                        }
                        WB n0 = ((InterfaceC1245ib) invoke).n0();
                        AbstractC0048Bt.m(n0, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                        Iterable iterable2 = (Iterable) c0646Yu.invoke(n0);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : iterable2) {
                            HR hr3 = (HR) obj2;
                            if (hr3.M() == 1 && hr3.getVisibility().a.b && !AbstractC0545Ux.C(hr3)) {
                                Collection o3 = hr3.o();
                                if (!(o3 instanceof Collection) || !o3.isEmpty()) {
                                    Iterator it3 = o3.iterator();
                                    while (it3.hasNext()) {
                                        InterfaceC1118gg n2 = ((InterfaceC0381Op) it3.next()).n();
                                        AbstractC0048Bt.m(n2, "it.containingDeclaration");
                                        if (c1630oS.contains(AbstractC0192Hh.g(n2))) {
                                            break;
                                        }
                                    }
                                }
                                InterfaceC1118gg n3 = hr3.n();
                                AbstractC0048Bt.l(n3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                if (C0805bv.d.contains(AbstractC1305jX.H((InterfaceC1245ib) n3, PX.y(hr3, 3))) ^ containsKey) {
                                    booleanValue = true;
                                } else {
                                    Boolean v = AbstractC0022At.v(AbstractC0868ct.J(hr3), HO.B, new UY(15, this));
                                    AbstractC0048Bt.m(v, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                    booleanValue = v.booleanValue();
                                }
                                if (!booleanValue) {
                                    z = true;
                                    if (!z) {
                                        arrayList2.add(obj2);
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                        hr = null;
                        c1318jk = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        for (HR hr4 : c1318jk) {
                            InterfaceC1118gg n4 = hr4.n();
                            AbstractC0048Bt.l(n4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            InterfaceC0381Op e = hr4.e(new C2096vX(AbstractC0048Bt.C((InterfaceC1245ib) n4, interfaceC1245ib)));
                            AbstractC0048Bt.l(e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                            InterfaceC0355Np m02 = ((HR) e).m0();
                            m02.E(interfaceC1245ib);
                            m02.t(interfaceC1245ib.z0());
                            m02.A();
                            InterfaceC1118gg n5 = hr4.n();
                            AbstractC0048Bt.l(n5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            Object l = AbstractC0022At.l(AbstractC0868ct.J((InterfaceC1245ib) n5), new C1590ns(5, this), new C0854cf(PX.y(hr4, 3), new C1360kM(), i2));
                            AbstractC0048Bt.m(l, "jvmDescriptor = computeJ…CONSIDERED\n            })");
                            int ordinal = ((EnumC0594Wu) l).ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 2) {
                                    m02.o((InterfaceC1738q4) AbstractC0772bO.o(this.m, interfaceC0937dxArr[2]));
                                }
                                InterfaceC0381Op build2 = m02.build();
                                AbstractC0048Bt.k(build2);
                                hr2 = (HR) build2;
                            } else {
                                if (!(interfaceC1245ib.g() == 1 && interfaceC1245ib.B() != 3)) {
                                    m02.N();
                                    InterfaceC0381Op build22 = m02.build();
                                    AbstractC0048Bt.k(build22);
                                    hr2 = (HR) build22;
                                }
                                hr2 = hr;
                            }
                            if (hr2 != null) {
                                arrayList3.add(hr2);
                            }
                        }
                        return arrayList3;
                    }
                }
                obj = null;
                interfaceC1245ib2 = (InterfaceC1245ib) obj;
                if (interfaceC1245ib2 != null) {
                }
            } else {
                Iterator it4 = iterable.iterator();
                if (it4.hasNext()) {
                    Object next = it4.next();
                    while (it4.hasNext()) {
                        next = it4.next();
                    }
                    obj = next;
                    interfaceC1245ib2 = (InterfaceC1245ib) obj;
                    if (interfaceC1245ib2 != null) {
                    }
                }
                obj = null;
                interfaceC1245ib2 = (InterfaceC1245ib) obj;
                if (interfaceC1245ib2 != null) {
                }
            }
        }
        hr = null;
        ArrayList arrayList32 = new ArrayList();
        while (r3.hasNext()) {
        }
        return arrayList32;
    }

    public final C0516Tu d() {
        return (C0516Tu) AbstractC0772bO.o(this.i, n[0]);
    }

    @Override // o.Z1
    public final Collection f(InterfaceC1245ib interfaceC1245ib) {
        C2377zo h = AbstractC0192Hh.h(interfaceC1245ib);
        LinkedHashSet linkedHashSet = C0805bv.a;
        C2377zo c2377zo = AbstractC1433lT.g;
        boolean equals = h.equals(c2377zo);
        boolean z = false;
        JR jr = this.j;
        if (!equals) {
            HashMap hashMap = AbstractC1433lT.c0;
            if (hashMap.get(h) == null) {
                if (h.equals(c2377zo) || hashMap.get(h) != null) {
                    z = true;
                } else {
                    String str = C1460lu.a;
                    C1639ob f = C1460lu.f(h);
                    if (f != null) {
                        try {
                            z = Serializable.class.isAssignableFrom(Class.forName(f.b().b()));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return z ? AbstractC0868ct.J(jr) : C1318jk.h;
            }
        }
        JR jr2 = (JR) AbstractC0772bO.o(this.k, n[1]);
        AbstractC0048Bt.m(jr2, "cloneableType");
        return AbstractC0868ct.K(jr2, jr);
    }

    @Override // o.Z1
    public final Collection g(InterfaceC1245ib interfaceC1245ib) {
        Set set;
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        d().getClass();
        C0390Oy b = b(interfaceC1245ib);
        if (b == null || (set = b.w0().d()) == null) {
            set = C1648ok.h;
        }
        return set;
    }

    @Override // o.Z1
    public final Collection i(InterfaceC1245ib interfaceC1245ib) {
        InterfaceC1245ib o2;
        if (interfaceC1245ib.B() == 1) {
            d().getClass();
            C0390Oy b = b(interfaceC1245ib);
            if (b != null && (o2 = HO.o(AbstractC0192Hh.g(b), C0066Cl.f)) != null) {
                C2096vX c2096vX = new C2096vX(AbstractC0048Bt.C(o2, b));
                List list = (List) b.x.q.invoke();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C0981eb c0981eb = (C0981eb) next;
                    C0981eb c0981eb2 = c0981eb;
                    if (c0981eb2.getVisibility().a.b) {
                        Collection E = o2.E();
                        AbstractC0048Bt.m(E, "defaultKotlinVersion.constructors");
                        Collection<C0981eb> collection = E;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            for (C0981eb c0981eb3 : collection) {
                                AbstractC0048Bt.m(c0981eb3, "it");
                                if (XG.j(c0981eb3, c0981eb.e(c2096vX)) == 1) {
                                    break;
                                }
                            }
                        }
                        if (c0981eb2.t0().size() == 1) {
                            List t0 = c0981eb2.t0();
                            AbstractC0048Bt.m(t0, "valueParameters");
                            InterfaceC2364zb c = ((RY) AbstractC0720ac.D0(t0)).c().B0().c();
                            if (AbstractC0048Bt.h(c != null ? AbstractC0192Hh.h(c) : null, AbstractC0192Hh.h(interfaceC1245ib))) {
                            }
                        }
                        if (!AbstractC0545Ux.C(c0981eb) && !C0805bv.e.contains(AbstractC1305jX.H(b, PX.y(c0981eb, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0981eb c0981eb4 = (C0981eb) it2.next();
                    C0981eb c0981eb5 = c0981eb4;
                    c0981eb5.getClass();
                    C0407Pp N0 = c0981eb5.N0(C2096vX.b);
                    N0.i = interfaceC1245ib;
                    N0.P(interfaceC1245ib.i());
                    N0.v = true;
                    AbstractC1964tX f = c2096vX.f();
                    if (f == null) {
                        C0407Pp.a(37);
                        throw null;
                    }
                    N0.h = f;
                    if (!C0805bv.f.contains(AbstractC1305jX.H(b, PX.y(c0981eb4, 3)))) {
                        N0.o((InterfaceC1738q4) AbstractC0772bO.o(this.m, n[2]));
                    }
                    AbstractC0433Qp K0 = N0.E.K0(N0);
                    AbstractC0048Bt.l(K0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((C0981eb) K0);
                }
                return arrayList2;
            }
        }
        return C1318jk.h;
    }
}
