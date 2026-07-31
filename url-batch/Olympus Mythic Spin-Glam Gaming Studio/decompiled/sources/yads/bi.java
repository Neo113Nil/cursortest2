package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class bi {
    public final LinkedHashMap a;

    public bi(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ph phVar = (ph) it.next();
            Pair pair = TuplesKt.to(phVar.a, phVar.c);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.a = linkedHashMap;
    }
}
