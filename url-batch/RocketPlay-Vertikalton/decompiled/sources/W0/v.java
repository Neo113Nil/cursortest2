package W0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v extends F1.d {
    public static int r0(int i) {
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

    public static Map s0(ArrayList arrayList) {
        t tVar = t.f1285a;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size == 1) {
            V0.d dVar = (V0.d) arrayList.get(0);
            i1.f.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f1243a, dVar.f1244b);
            i1.f.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V0.d dVar2 = (V0.d) it.next();
            linkedHashMap.put(dVar2.f1243a, dVar2.f1244b);
        }
        return linkedHashMap;
    }
}
