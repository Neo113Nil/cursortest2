package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0757b9 {
    public static final Object a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    static {
        C2377zo c2377zo = AbstractC1433lT.j;
        C1619oH c1619oH = new C1619oH(c2377zo.b(C0827cE.e("name")).g(), C0827cE.e("name"));
        C1619oH c1619oH2 = new C1619oH(c2377zo.b(C0827cE.e("ordinal")).g(), C0827cE.e("ordinal"));
        C1619oH c1619oH3 = new C1619oH(AbstractC1433lT.B.c(C0827cE.e("size")), C0827cE.e("size"));
        C2245xo c2245xo = AbstractC1433lT.F;
        Map G = EB.G(c1619oH, c1619oH2, c1619oH3, new C1619oH(c2245xo.c(C0827cE.e("size")), C0827cE.e("size")), new C1619oH(AbstractC1433lT.e.b(C0827cE.e("length")).g(), C0827cE.e("length")), new C1619oH(c2245xo.c(C0827cE.e("keys")), C0827cE.e("keySet")), new C1619oH(c2245xo.c(C0827cE.e("values")), C0827cE.e("values")), new C1619oH(c2245xo.c(C0827cE.e("entries")), C0827cE.e("entrySet")));
        a = G;
        Set<Map.Entry> entrySet = G.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(entrySet));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C1619oH(((C2245xo) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1619oH c1619oH4 = (C1619oH) it.next();
            C0827cE c0827cE = (C0827cE) c1619oH4.i;
            Object obj = linkedHashMap.get(c0827cE);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c0827cE, obj);
            }
            ((List) obj).add((C0827cE) c1619oH4.h);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(EB.E(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            AbstractC0048Bt.n(iterable, "<this>");
            linkedHashMap2.put(key, AbstractC0720ac.J0(AbstractC0720ac.L0(iterable)));
        }
        b = linkedHashMap2;
        Set keySet = a.keySet();
        c = keySet;
        Set set = keySet;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(set));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C2245xo) it2.next()).f());
        }
        d = AbstractC0720ac.M0(arrayList2);
    }
}
