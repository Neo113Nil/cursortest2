package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.Uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529Uh extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0581Wh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0529Uh(C0581Wh c0581Wh, int i) {
        super(0);
        this.h = i;
        this.i = c0581Wh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.ArrayList] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Object obj;
        C0244Jh c0244Jh;
        Object obj2;
        MR mr;
        ?? r1;
        int i = this.h;
        int i2 = 2;
        int i3 = 1;
        C0581Wh c0581Wh = this.i;
        switch (i) {
            case 0:
                return TM.n(c0581Wh);
            case 1:
                return AbstractC0720ac.J0(c0581Wh.s.a.e.c(c0581Wh.C));
            case 2:
                C1030fK c1030fK = c0581Wh.l;
                if ((c1030fK.j & 4) != 4) {
                    return null;
                }
                InterfaceC2364zb g = c0581Wh.w0().g(AbstractC1052fg.C(c0581Wh.s.b, c1030fK.m), DE.n);
                if (g instanceof InterfaceC1245ib) {
                    return (InterfaceC1245ib) g;
                }
                return null;
            case 3:
                C0321Mh c0321Mh = c0581Wh.s;
                List list = c0581Wh.l.w;
                AbstractC0048Bt.m(list, "classProto.constructorList");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (AbstractC1650om.m.c(((C1162hK) obj3).k).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1162hK c1162hK = (C1162hK) it.next();
                    SB sb = c0321Mh.i;
                    AbstractC0048Bt.m(c1162hK, "it");
                    arrayList2.add(sb.d(c1162hK, false));
                }
                return AbstractC0720ac.A0(AbstractC0720ac.A0(arrayList2, AbstractC0868ct.L(c0581Wh.i0())), c0321Mh.a.n.i(c0581Wh));
            case 4:
                C0581Wh c0581Wh2 = this.i;
                int i4 = c0581Wh2.r;
                if (!AbstractC1888sN.a(i4)) {
                    List list2 = c0581Wh2.l.w;
                    AbstractC0048Bt.m(list2, "classProto.constructorList");
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (!AbstractC1650om.m.c(((C1162hK) obj).k).booleanValue()) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    C1162hK c1162hK2 = (C1162hK) obj;
                    if (c1162hK2 != null) {
                        return c0581Wh2.s.i.d(c1162hK2, true);
                    }
                    return null;
                }
                C1777qh c1777qh = new C1777qh(c0581Wh2, null, C0460Rq.t, true, 1, IS.e);
                List list3 = Collections.EMPTY_LIST;
                int i5 = AbstractC0114Eh.a;
                if (i4 == 3 || AbstractC1888sN.a(i4)) {
                    c0244Jh = AbstractC0270Kh.a;
                    if (c0244Jh == null) {
                        AbstractC0114Eh.a(49);
                        throw null;
                    }
                } else if (AbstractC0114Eh.q(c0581Wh2)) {
                    c0244Jh = AbstractC0270Kh.a;
                    if (c0244Jh == null) {
                        AbstractC0114Eh.a(51);
                        throw null;
                    }
                } else if (AbstractC0114Eh.k(c0581Wh2)) {
                    c0244Jh = AbstractC0270Kh.j;
                    if (c0244Jh == null) {
                        AbstractC0114Eh.a(52);
                        throw null;
                    }
                } else {
                    c0244Jh = AbstractC0270Kh.e;
                    if (c0244Jh == null) {
                        AbstractC0114Eh.a(53);
                        throw null;
                    }
                }
                c1777qh.V0(list3, c0244Jh);
                c1777qh.n = c0581Wh2.i();
                return c1777qh;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                int i6 = c0581Wh.p;
                if (i6 == 2) {
                    List<Integer> list4 = c0581Wh.l.B;
                    AbstractC0048Bt.m(list4, "fqNames");
                    if (!list4.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Integer num : list4) {
                            C0321Mh c0321Mh2 = c0581Wh.s;
                            C0296Lh c0296Lh = c0321Mh2.a;
                            InterfaceC0893dE interfaceC0893dE = c0321Mh2.b;
                            AbstractC0048Bt.m(num, "index");
                            InterfaceC1245ib b = c0296Lh.b(AbstractC1052fg.x(interfaceC0893dE, num.intValue()));
                            if (b != null) {
                                arrayList3.add(b);
                            }
                        }
                        return arrayList3;
                    }
                    if (i6 == 2) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        InterfaceC1118gg interfaceC1118gg = c0581Wh.x;
                        if (interfaceC1118gg instanceof InterfaceC0961eH) {
                            AbstractC0946e20.l(c0581Wh, linkedHashSet, ((InterfaceC0961eH) interfaceC1118gg).r0(), false);
                        }
                        AbstractC0946e20.l(c0581Wh, linkedHashSet, c0581Wh.g0(), true);
                        return AbstractC0720ac.G0(linkedHashSet, new C0685a3(8));
                    }
                }
                return C1318jk.h;
            default:
                C0321Mh c0321Mh3 = c0581Wh.s;
                if (!c0581Wh.m() && !c0581Wh.j()) {
                    return null;
                }
                C1030fK c1030fK2 = c0581Wh.l;
                InterfaceC0893dE interfaceC0893dE2 = c0321Mh3.b;
                C0695aD c0695aD = c0321Mh3.d;
                U8 u8 = new U8(i3, i3, c0321Mh3.h);
                U8 u82 = new U8(i3, i2, c0581Wh);
                AbstractC0048Bt.n(c1030fK2, "<this>");
                AbstractC0048Bt.n(interfaceC0893dE2, "nameResolver");
                if (c1030fK2.G.size() > 0) {
                    List<Integer> list5 = c1030fK2.G;
                    AbstractC0048Bt.m(list5, "multiFieldValueClassUnderlyingNameList");
                    ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(list5));
                    for (Integer num2 : list5) {
                        AbstractC0048Bt.m(num2, "it");
                        arrayList4.add(AbstractC1052fg.C(interfaceC0893dE2, num2.intValue()));
                    }
                    C1619oH c1619oH = new C1619oH(Integer.valueOf(c1030fK2.J.size()), Integer.valueOf(c1030fK2.I.size()));
                    if (c1619oH.equals(new C1619oH(Integer.valueOf(arrayList4.size()), 0))) {
                        List<Integer> list6 = c1030fK2.J;
                        AbstractC0048Bt.m(list6, "multiFieldValueClassUnderlyingTypeIdList");
                        r1 = new ArrayList(AbstractC0786bc.d0(list6));
                        for (Integer num3 : list6) {
                            AbstractC0048Bt.m(num3, "it");
                            r1.add(c0695aD.a(num3.intValue()));
                        }
                    } else {
                        if (!c1619oH.equals(new C1619oH(0, Integer.valueOf(arrayList4.size())))) {
                            throw new IllegalStateException(("class " + AbstractC1052fg.C(interfaceC0893dE2, c1030fK2.l) + " has illegal multi-field value class representation").toString());
                        }
                        r1 = c1030fK2.I;
                    }
                    AbstractC0048Bt.m(r1, "when (typeIdCount to typ…epresentation\")\n        }");
                    ArrayList arrayList5 = new ArrayList(AbstractC0786bc.d0(r1));
                    Iterator it3 = r1.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(u8.invoke(it3.next()));
                    }
                    obj2 = new C1615oD(AbstractC0720ac.O0(arrayList4, arrayList5));
                } else if ((c1030fK2.j & 8) == 8) {
                    C0827cE C = AbstractC1052fg.C(interfaceC0893dE2, c1030fK2.D);
                    int i7 = c1030fK2.j;
                    MK a = (i7 & 16) == 16 ? c1030fK2.E : (i7 & 32) == 32 ? c0695aD.a(c1030fK2.F) : null;
                    if ((a == null || (mr = (MR) u8.invoke(a)) == null) && (mr = (MR) u82.invoke(C)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC1052fg.C(interfaceC0893dE2, c1030fK2.l) + " with property " + C).toString());
                    }
                    obj2 = new C0281Ks(C, mr);
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    return obj2;
                }
                if (c0581Wh.m.a(1, 5, 1)) {
                    return null;
                }
                C0981eb i0 = c0581Wh.i0();
                if (i0 == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + c0581Wh).toString());
                }
                List t0 = i0.t0();
                AbstractC0048Bt.m(t0, "constructor.valueParameters");
                C0827cE name = ((RY) AbstractC0720ac.n0(t0)).getName();
                AbstractC0048Bt.m(name, "constructor.valueParameters.first().name");
                JR A0 = c0581Wh.A0(name);
                if (A0 != null) {
                    return new C0281Ks(name, A0);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + c0581Wh).toString());
        }
    }
}
