package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class i20 implements sj3 {
    public final /* synthetic */ d20 a;

    public i20(d20 d20Var) {
        this.a = d20Var;
    }

    @Override // yads.sj3
    public final Map a() {
        g20 g20Var = this.a.e;
        List list = g20Var != null ? g20Var.b : null;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((n83) obj).a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((n83) it.next()).b);
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
