package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class WS {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Object c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final TS g;
    public static final Object h;
    public static final LinkedHashMap i;
    public static final ArrayList j;
    public static final LinkedHashMap k;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> u0 = P6.u0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(u0));
        for (String str : u0) {
            String c2 = EnumC1791qv.BOOLEAN.c();
            AbstractC0048Bt.m(c2, "BOOLEAN.desc");
            arrayList.add(C0218Ih.e("java/util/Collection", str, "Ljava/util/Collection;", c2));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TS) it.next()).b);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(arrayList3));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((TS) it2.next()).a.b());
        }
        String concat = "java/util/".concat("Collection");
        EnumC1791qv enumC1791qv = EnumC1791qv.BOOLEAN;
        String c3 = enumC1791qv.c();
        AbstractC0048Bt.m(c3, "BOOLEAN.desc");
        TS e2 = C0218Ih.e(concat, "contains", "Ljava/lang/Object;", c3);
        VS vs = VS.k;
        C1619oH c1619oH = new C1619oH(e2, vs);
        String concat2 = "java/util/".concat("Collection");
        String c4 = enumC1791qv.c();
        AbstractC0048Bt.m(c4, "BOOLEAN.desc");
        C1619oH c1619oH2 = new C1619oH(C0218Ih.e(concat2, "remove", "Ljava/lang/Object;", c4), vs);
        String concat3 = "java/util/".concat("Map");
        String c5 = enumC1791qv.c();
        AbstractC0048Bt.m(c5, "BOOLEAN.desc");
        C1619oH c1619oH3 = new C1619oH(C0218Ih.e(concat3, "containsKey", "Ljava/lang/Object;", c5), vs);
        String concat4 = "java/util/".concat("Map");
        String c6 = enumC1791qv.c();
        AbstractC0048Bt.m(c6, "BOOLEAN.desc");
        C1619oH c1619oH4 = new C1619oH(C0218Ih.e(concat4, "containsValue", "Ljava/lang/Object;", c6), vs);
        String concat5 = "java/util/".concat("Map");
        String c7 = enumC1791qv.c();
        AbstractC0048Bt.m(c7, "BOOLEAN.desc");
        C1619oH c1619oH5 = new C1619oH(C0218Ih.e(concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", c7), vs);
        C1619oH c1619oH6 = new C1619oH(C0218Ih.e("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), VS.l);
        TS e3 = C0218Ih.e("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        VS vs2 = VS.i;
        C1619oH c1619oH7 = new C1619oH(e3, vs2);
        C1619oH c1619oH8 = new C1619oH(C0218Ih.e("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), vs2);
        String concat6 = "java/util/".concat("List");
        EnumC1791qv enumC1791qv2 = EnumC1791qv.INT;
        String c8 = enumC1791qv2.c();
        AbstractC0048Bt.m(c8, "INT.desc");
        TS e4 = C0218Ih.e(concat6, "indexOf", "Ljava/lang/Object;", c8);
        VS vs3 = VS.j;
        C1619oH c1619oH9 = new C1619oH(e4, vs3);
        String concat7 = "java/util/".concat("List");
        String c9 = enumC1791qv2.c();
        AbstractC0048Bt.m(c9, "INT.desc");
        Map G = EB.G(c1619oH, c1619oH2, c1619oH3, c1619oH4, c1619oH5, c1619oH6, c1619oH7, c1619oH8, c1619oH9, new C1619oH(C0218Ih.e(concat7, "lastIndexOf", "Ljava/lang/Object;", c9), vs3));
        c = G;
        LinkedHashMap linkedHashMap = new LinkedHashMap(EB.E(G.size()));
        for (Map.Entry entry : G.entrySet()) {
            linkedHashMap.put(((TS) entry.getKey()).b, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet n = WQ.n(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(AbstractC0786bc.d0(n));
        Iterator it3 = n.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((TS) it3.next()).a);
        }
        e = AbstractC0720ac.M0(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC0786bc.d0(n));
        Iterator it4 = n.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((TS) it4.next()).b);
        }
        f = AbstractC0720ac.M0(arrayList6);
        EnumC1791qv enumC1791qv3 = EnumC1791qv.INT;
        String c10 = enumC1791qv3.c();
        AbstractC0048Bt.m(c10, "INT.desc");
        TS e5 = C0218Ih.e("java/util/List", "removeAt", c10, "Ljava/lang/Object;");
        g = e5;
        String concat8 = "java/lang/".concat("Number");
        String c11 = EnumC1791qv.BYTE.c();
        AbstractC0048Bt.m(c11, "BYTE.desc");
        C1619oH c1619oH10 = new C1619oH(C0218Ih.e(concat8, "toByte", "", c11), C0827cE.e("byteValue"));
        String concat9 = "java/lang/".concat("Number");
        String c12 = EnumC1791qv.SHORT.c();
        AbstractC0048Bt.m(c12, "SHORT.desc");
        C1619oH c1619oH11 = new C1619oH(C0218Ih.e(concat9, "toShort", "", c12), C0827cE.e("shortValue"));
        String concat10 = "java/lang/".concat("Number");
        String c13 = enumC1791qv3.c();
        AbstractC0048Bt.m(c13, "INT.desc");
        C1619oH c1619oH12 = new C1619oH(C0218Ih.e(concat10, "toInt", "", c13), C0827cE.e("intValue"));
        String concat11 = "java/lang/".concat("Number");
        String c14 = EnumC1791qv.LONG.c();
        AbstractC0048Bt.m(c14, "LONG.desc");
        C1619oH c1619oH13 = new C1619oH(C0218Ih.e(concat11, "toLong", "", c14), C0827cE.e("longValue"));
        String concat12 = "java/lang/".concat("Number");
        String c15 = EnumC1791qv.FLOAT.c();
        AbstractC0048Bt.m(c15, "FLOAT.desc");
        C1619oH c1619oH14 = new C1619oH(C0218Ih.e(concat12, "toFloat", "", c15), C0827cE.e("floatValue"));
        String concat13 = "java/lang/".concat("Number");
        String c16 = EnumC1791qv.DOUBLE.c();
        AbstractC0048Bt.m(c16, "DOUBLE.desc");
        C1619oH c1619oH15 = new C1619oH(C0218Ih.e(concat13, "toDouble", "", c16), C0827cE.e("doubleValue"));
        C1619oH c1619oH16 = new C1619oH(e5, C0827cE.e("remove"));
        String concat14 = "java/lang/".concat("CharSequence");
        String c17 = enumC1791qv3.c();
        AbstractC0048Bt.m(c17, "INT.desc");
        String c18 = EnumC1791qv.CHAR.c();
        AbstractC0048Bt.m(c18, "CHAR.desc");
        Map G2 = EB.G(c1619oH10, c1619oH11, c1619oH12, c1619oH13, c1619oH14, c1619oH15, c1619oH16, new C1619oH(C0218Ih.e(concat14, "get", c17, c18), C0827cE.e("charAt")));
        h = G2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(EB.E(G2.size()));
        for (Map.Entry entry2 : G2.entrySet()) {
            linkedHashMap2.put(((TS) entry2.getKey()).b, entry2.getValue());
        }
        i = linkedHashMap2;
        Set keySet = h.keySet();
        ArrayList arrayList7 = new ArrayList(AbstractC0786bc.d0(keySet));
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((TS) it5.next()).a);
        }
        j = arrayList7;
        Set<Map.Entry> entrySet = h.entrySet();
        ArrayList arrayList8 = new ArrayList(AbstractC0786bc.d0(entrySet));
        for (Map.Entry entry3 : entrySet) {
            arrayList8.add(new C1619oH(((TS) entry3.getKey()).a, entry3.getValue()));
        }
        int E = EB.E(AbstractC0786bc.d0(arrayList8));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(E);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            C1619oH c1619oH17 = (C1619oH) it6.next();
            linkedHashMap3.put((C0827cE) c1619oH17.i, (C0827cE) c1619oH17.h);
        }
        k = linkedHashMap3;
    }
}
