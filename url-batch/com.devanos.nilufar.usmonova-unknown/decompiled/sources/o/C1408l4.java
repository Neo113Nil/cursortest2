package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408l4 {
    public static final LinkedHashMap c;
    public final C1790qu a;
    public final ConcurrentHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1212i4 enumC1212i4 : EnumC1212i4.values()) {
            String str = enumC1212i4.h;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC1212i4);
            }
        }
        c = linkedHashMap;
    }

    public C1408l4(C1790qu c1790qu) {
        AbstractC0048Bt.n(c1790qu, "javaTypeEnhancementState");
        this.a = c1790qu;
        this.b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z) {
        InterfaceC0948e4 interfaceC0948e4 = (InterfaceC0948e4) obj;
        AbstractC0048Bt.n(interfaceC0948e4, "<this>");
        Map f = interfaceC0948e4.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : f.entrySet()) {
            AbstractC1048fc.f0(arrayList, (!z || AbstractC0048Bt.h((C0827cE) entry.getKey(), AbstractC0438Qu.b)) ? j((AbstractC0551Vd) entry.getValue()) : C1318jk.h);
        }
        return arrayList;
    }

    public static Object c(Object obj, C2245xo c2245xo) {
        for (Object obj2 : e(obj)) {
            if (AbstractC0048Bt.h(d(obj2), c2245xo)) {
                return obj2;
            }
        }
        return null;
    }

    public static C2245xo d(Object obj) {
        InterfaceC0948e4 interfaceC0948e4 = (InterfaceC0948e4) obj;
        AbstractC0048Bt.n(interfaceC0948e4, "<this>");
        return interfaceC0948e4.e();
    }

    public static Iterable e(Object obj) {
        InterfaceC1738q4 annotations;
        InterfaceC0948e4 interfaceC0948e4 = (InterfaceC0948e4) obj;
        AbstractC0048Bt.n(interfaceC0948e4, "<this>");
        InterfaceC1245ib d = AbstractC0192Hh.d(interfaceC0948e4);
        return (d == null || (annotations = d.getAnnotations()) == null) ? C1318jk.h : annotations;
    }

    public static boolean f(Object obj, C2245xo c2245xo) {
        Iterable e = e(obj);
        if ((e instanceof Collection) && ((Collection) e).isEmpty()) {
            return false;
        }
        Iterator it = e.iterator();
        while (it.hasNext()) {
            if (AbstractC0048Bt.h(d(it.next()), c2245xo)) {
                return true;
            }
        }
        return false;
    }

    public static List j(AbstractC0551Vd abstractC0551Vd) {
        if (!(abstractC0551Vd instanceof O6)) {
            return abstractC0551Vd instanceof C2175wk ? AbstractC0868ct.J(((C2175wk) abstractC0551Vd).c.c()) : C1318jk.h;
        }
        Iterable iterable = (Iterable) ((O6) abstractC0551Vd).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC1048fc.f0(arrayList, j((AbstractC0551Vd) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [o.vF] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1987tu b(C1987tu c1987tu, InterfaceC1738q4 interfaceC1738q4) {
        C0619Xt c0619Xt;
        DN h;
        C0619Xt c0619Xt2;
        Object c2;
        Object obj;
        C1619oH c1619oH;
        boolean z;
        boolean z2;
        ?? r11;
        int i;
        C2144wF c2144wF;
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        C1790qu c1790qu = this.a;
        if (!c1790qu.b) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : interfaceC1738q4) {
                boolean z3 = c1790qu.b;
                DN dn = DN.i;
                DN dn2 = DN.j;
                if (!z3 && (c0619Xt = (C0619Xt) AbstractC1276j4.f.get(d(obj2))) != null) {
                    C2245xo d = d(obj2);
                    if (d == null || !AbstractC1276j4.e.containsKey(d)) {
                        h = h(obj2);
                        if (h == null) {
                            h = c1790qu.a.a;
                        }
                    } else {
                        h = (DN) C1724pu.j.invoke(d);
                    }
                    if (h == dn) {
                        h = null;
                    }
                    if (h != null) {
                        C2144wF a = C2144wF.a(c0619Xt.a, null, h == dn2, 1);
                        Collection collection = c0619Xt.b;
                        boolean z4 = c0619Xt.c;
                        AbstractC0048Bt.n(collection, "qualifierApplicabilityTypes");
                        c0619Xt2 = new C0619Xt(a, collection, z4);
                        if (c0619Xt2 == null) {
                            r11 = c0619Xt2;
                        } else {
                            if (!c1790qu.a.d && (c2 = c(obj2, AbstractC1276j4.c)) != null) {
                                Iterator it = e(obj2).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (i(obj) != null) {
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    ArrayList a2 = a(c2, true);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it2 = a2.iterator();
                                    while (it2.hasNext()) {
                                        EnumC1212i4 enumC1212i4 = (EnumC1212i4) c.get((String) it2.next());
                                        if (enumC1212i4 != null) {
                                            linkedHashSet.add(enumC1212i4);
                                        }
                                    }
                                    if (linkedHashSet.contains(EnumC1212i4.l)) {
                                        Set u0 = P6.u0(EnumC1212i4.values());
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(EB.E(u0.size()));
                                        boolean z5 = false;
                                        for (Object obj3 : u0) {
                                            if (z5 || !AbstractC0048Bt.h(obj3, EnumC1212i4.m)) {
                                                z = true;
                                            } else {
                                                z = false;
                                                z5 = true;
                                            }
                                            if (z) {
                                                linkedHashSet2.add(obj3);
                                            }
                                        }
                                        linkedHashSet = WQ.n(linkedHashSet2, linkedHashSet);
                                    }
                                    c1619oH = new C1619oH(obj, linkedHashSet);
                                    if (c1619oH != null) {
                                        Object obj4 = c1619oH.h;
                                        Set set = (Set) c1619oH.i;
                                        DN h2 = h(obj2);
                                        if (h2 == null && (h2 = h(obj4)) == null) {
                                            h2 = c1790qu.a.a;
                                        }
                                        if (h2 != dn) {
                                            AbstractC0048Bt.n(obj4, "$this$extractNullability");
                                            C2144wF g = g(obj4, false);
                                            if (g != null) {
                                                c2144wF = g;
                                            } else {
                                                Object i2 = i(obj4);
                                                if (i2 != null) {
                                                    DN h3 = h(obj4);
                                                    if (h3 == null) {
                                                        h3 = c1790qu.a.a;
                                                    }
                                                    if (h3 != dn) {
                                                        z2 = false;
                                                        z2 = false;
                                                        C2144wF g2 = g(i2, false);
                                                        if (g2 != null) {
                                                            r11 = 0;
                                                            i = 1;
                                                            c2144wF = C2144wF.a(g2, null, h3 == dn2, 1);
                                                        } else {
                                                            r11 = 0;
                                                            i = 1;
                                                            c2144wF = null;
                                                        }
                                                        if (c2144wF != null) {
                                                            ?? r9 = z2;
                                                            if (h2 == dn2) {
                                                                r9 = i;
                                                            }
                                                            r11 = new C0619Xt(C2144wF.a(c2144wF, r11, r9, i), set);
                                                        }
                                                    }
                                                }
                                                c2144wF = null;
                                            }
                                            z2 = false;
                                            r11 = 0;
                                            i = 1;
                                            if (c2144wF != null) {
                                            }
                                        }
                                    }
                                    r11 = 0;
                                }
                            }
                            c1619oH = null;
                            if (c1619oH != null) {
                            }
                            r11 = 0;
                        }
                        if (r11 == 0) {
                            arrayList.add(r11);
                        }
                    }
                }
                c0619Xt2 = null;
                if (c0619Xt2 == null) {
                }
                if (r11 == 0) {
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = c1987tu != null ? new EnumMap(c1987tu.a) : new EnumMap(EnumC1212i4.class);
                Iterator it3 = arrayList.iterator();
                boolean z6 = false;
                while (it3.hasNext()) {
                    C0619Xt c0619Xt3 = (C0619Xt) it3.next();
                    Iterator it4 = c0619Xt3.b.iterator();
                    z6 = z6;
                    while (it4.hasNext()) {
                        enumMap.put((EnumMap) it4.next(), (EnumC1212i4) c0619Xt3);
                        z6 = true;
                    }
                }
                if (z6) {
                    return new C1987tu(enumMap);
                }
            }
        }
        return c1987tu;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r10.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r10.equals("UNKNOWN") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r10.equals("NEVER") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r10.equals("MAYBE") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (r0.equals(o.AbstractC0464Ru.m) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2144wF g(Object obj, boolean z) {
        C2245xo d = d(obj);
        if (d != null) {
            this.a.getClass();
            DN dn = (DN) C1724pu.j.invoke(d);
            dn.getClass();
            if (dn == DN.i) {
                return null;
            }
            boolean contains = AbstractC0464Ru.g.contains(d);
            EnumC2078vF enumC2078vF = EnumC2078vF.i;
            if (!contains) {
                boolean contains2 = AbstractC0464Ru.j.contains(d);
                EnumC2078vF enumC2078vF2 = EnumC2078vF.j;
                if (!contains2) {
                    if (!(d.equals(AbstractC0464Ru.a) ? true : d.equals(AbstractC0464Ru.d))) {
                        boolean equals = d.equals(AbstractC0464Ru.b) ? true : d.equals(AbstractC0464Ru.e);
                        EnumC2078vF enumC2078vF3 = EnumC2078vF.h;
                        if (!equals) {
                            if (d.equals(AbstractC0464Ru.h)) {
                                String str = (String) AbstractC0720ac.o0(a(obj, false));
                                if (str != null) {
                                    switch (str.hashCode()) {
                                        case 73135176:
                                            break;
                                        case 74175084:
                                            break;
                                        case 433141802:
                                            break;
                                        case 1933739535:
                                            break;
                                    }
                                }
                            } else if (!d.equals(AbstractC0464Ru.k)) {
                                if (!d.equals(AbstractC0464Ru.l) && !d.equals(AbstractC0464Ru.n)) {
                                }
                            }
                        }
                        enumC2078vF = enumC2078vF3;
                    }
                }
                enumC2078vF = enumC2078vF2;
            }
            return new C2144wF(enumC2078vF, (dn == DN.j) || z);
        }
        return null;
    }

    public final DN h(Object obj) {
        String str;
        C1790qu c1790qu = this.a;
        DN dn = (DN) c1790qu.a.c.get(d(obj));
        if (dn != null) {
            return dn;
        }
        Object c2 = c(obj, AbstractC1276j4.d);
        if (c2 == null || (str = (String) AbstractC0720ac.o0(a(c2, false))) == null) {
            return null;
        }
        DN dn2 = c1790qu.a.b;
        if (dn2 != null) {
            return dn2;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return DN.i;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return DN.k;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return DN.j;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object obj2;
        AbstractC0048Bt.n(obj, "annotation");
        if (!this.a.a.d) {
            if (AbstractC0720ac.j0(AbstractC1276j4.g, d(obj)) || f(obj, AbstractC1276j4.b)) {
                return obj;
            }
            if (f(obj, AbstractC1276j4.a)) {
                InterfaceC1245ib d = AbstractC0192Hh.d((InterfaceC0948e4) obj);
                AbstractC0048Bt.k(d);
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj3 = concurrentHashMap.get(d);
                if (obj3 != null) {
                    return obj3;
                }
                Iterator it = e(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = i(it.next());
                    if (obj2 != null) {
                        break;
                    }
                }
                if (obj2 != null) {
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(d, obj2);
                    return putIfAbsent == null ? obj2 : putIfAbsent;
                }
            }
        }
        return null;
    }
}
