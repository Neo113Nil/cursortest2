package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.iX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241iX {
    public static final C1241iX a = new C1241iX();

    public static ArrayList a(AbstractCollection abstractCollection, InterfaceC2312yp interfaceC2312yp) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        AbstractC0048Bt.m(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            JR jr = (JR) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    JR jr2 = (JR) it2.next();
                    if (jr2 != jr) {
                        AbstractC0048Bt.m(jr2, "lower");
                        AbstractC0048Bt.m(jr, "upper");
                        if (((Boolean) interfaceC2312yp.invoke(jr2, jr)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [o.OW] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, o.OW, o.a7] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [o.JR] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, o.JR, o.ey] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Set] */
    public final JR b(ArrayList arrayList) {
        JR jr;
        JR e;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JR jr2 = (JR) it.next();
            if (jr2.B0() instanceof C2382zt) {
                Collection d = jr2.B0().d();
                AbstractC0048Bt.m(d, "type.constructor.supertypes");
                Collection<AbstractC1004ey> collection = d;
                ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(collection));
                for (AbstractC1004ey abstractC1004ey : collection) {
                    AbstractC0048Bt.m(abstractC1004ey, "it");
                    JR a0 = AbstractC0868ct.a0(abstractC1004ey);
                    if (jr2.C0()) {
                        a0 = a0.F0(true);
                    }
                    arrayList3.add(a0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(jr2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        EnumC1109gX enumC1109gX = EnumC1109gX.h;
        while (it2.hasNext()) {
            enumC1109gX = enumC1109gX.a((AbstractC2097vY) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            JR jr3 = (JR) it3.next();
            if (enumC1109gX == EnumC1109gX.k) {
                if (jr3 instanceof C2011uE) {
                    C2011uE c2011uE = (C2011uE) jr3;
                    AbstractC0048Bt.n(c2011uE, "<this>");
                    jr3 = new C2011uE(c2011uE.i, c2011uE.j, c2011uE.k, c2011uE.l, c2011uE.m, true);
                }
                AbstractC0048Bt.n(jr3, "<this>");
                JR p = C1623oL.p(jr3, false);
                jr3 = (p == null && (p = TM.w(jr3)) == null) ? jr3.F0(false) : p;
            }
            linkedHashSet.add(jr3);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((JR) it4.next()).A0());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            OW ow = (OW) it5.next();
            next = (OW) next;
            next.getClass();
            C0208Hx c0208Hx = OW.i;
            AbstractC0048Bt.n(ow, "other");
            if (!next.isEmpty() || !ow.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection values = ((ConcurrentHashMap) c0208Hx.i).values();
                AbstractC0048Bt.m(values, "idPerType.values");
                Iterator it6 = values.iterator();
                while (it6.hasNext()) {
                    int intValue = ((Number) it6.next()).intValue();
                    C1869s4 c1869s4 = (C1869s4) next.h.get(intValue);
                    C1869s4 c1869s42 = (C1869s4) ow.h.get(intValue);
                    if (c1869s4 != null) {
                        if (!AbstractC0048Bt.h(c1869s42, c1869s4)) {
                            c1869s4 = null;
                        }
                        c1869s42 = c1869s4;
                    } else if (c1869s42 == null || !AbstractC0048Bt.h(c1869s4, c1869s42)) {
                        c1869s42 = null;
                    }
                    AbstractC1052fg.e(arrayList5, c1869s42);
                }
                next = C0208Hx.I0(arrayList5);
            }
        }
        OW ow2 = (OW) next;
        if (linkedHashSet.size() == 1) {
            e = (JR) AbstractC0720ac.C0(linkedHashSet);
        } else {
            int i = 2;
            ArrayList a2 = a(linkedHashSet, new C1175hX(i, 0, this));
            a2.isEmpty();
            if (a2.isEmpty()) {
                jr = null;
            } else {
                Iterator it7 = a2.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                JR next2 = it7.next();
                while (it7.hasNext()) {
                    JR jr4 = (JR) it7.next();
                    next2 = next2;
                    if (next2 != 0 && jr4 != null) {
                        SW B0 = next2.B0();
                        SW B02 = jr4.B0();
                        boolean z = B0 instanceof C1591nt;
                        if (z && (B02 instanceof C1591nt)) {
                            Set set = ((C1591nt) B0).a;
                            Set set2 = ((C1591nt) B02).a;
                            AbstractC0048Bt.n(set, "<this>");
                            AbstractC0048Bt.n(set2, "other");
                            Set L0 = AbstractC0720ac.L0(set);
                            AbstractC1048fc.f0(L0, set2);
                            C1591nt c1591nt = new C1591nt(L0);
                            OW.i.getClass();
                            OW ow3 = OW.j;
                            AbstractC0048Bt.n(ow3, "attributes");
                            next2 = HO.s(C1318jk.h, C0273Kk.a(2, true, "unknown integer literal type"), ow3, c1591nt, false);
                        } else if (z) {
                            if (!((C1591nt) B0).a.contains(jr4)) {
                                jr4 = null;
                            }
                            next2 = jr4;
                        } else if ((B02 instanceof C1591nt) && ((C1591nt) B02).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                jr = next2;
            }
            if (jr != null) {
                e = jr;
            } else {
                InterfaceC2341zE.b.getClass();
                ArrayList a3 = a(a2, new C1175hX(i, 1, C2275yE.b));
                a3.isEmpty();
                e = a3.size() < 2 ? (JR) AbstractC0720ac.C0(a3) : new C2382zt(linkedHashSet).e();
            }
        }
        return e.H0(ow2);
    }
}
