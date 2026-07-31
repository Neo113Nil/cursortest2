package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class th {
    public final LinkedHashMap a;

    public th(List list, r3 r3Var, a22 a22Var, mn2 mn2Var, t41 t41Var, kf1 kf1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ph phVar = (ph) it.next();
            String str = phVar.a;
            kf1 kf1Var2 = phVar.d;
            Pair pair = TuplesKt.to(str, new h02(phVar, r3Var, a22Var, mn2Var, kf1Var2 == null ? kf1Var : kf1Var2, t41Var));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.a = linkedHashMap;
    }
}
