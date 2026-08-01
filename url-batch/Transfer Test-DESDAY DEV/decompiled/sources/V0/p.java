package V0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p extends T.e {
    public static int Z(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map a0(ArrayList arrayList) {
        n nVar = n.f876a;
        int size = arrayList.size();
        if (size == 0) {
            return nVar;
        }
        if (size == 1) {
            U0.d dVar = (U0.d) arrayList.get(0);
            g1.f.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f863a, dVar.f864b);
            g1.f.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U0.d dVar2 = (U0.d) it.next();
            linkedHashMap.put(dVar2.f863a, dVar2.f864b);
        }
        return linkedHashMap;
    }
}
