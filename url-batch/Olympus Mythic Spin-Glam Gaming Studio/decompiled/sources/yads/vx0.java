package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes12.dex */
public final class vx0 {
    public final kx0 a = new kx0();

    public final String a(d8 d8Var) {
        SortedMap sortedMap;
        Set entrySet;
        String joinToString$default;
        List sorted;
        String joinToString$default2;
        this.a.getClass();
        jx0 a = kx0.a(d8Var);
        List list = a.e;
        String str = (list == null || (sorted = CollectionsKt.sorted(list)) == null || (joinToString$default2 = CollectionsKt.joinToString$default(sorted, StringUtils.COMMA, null, null, 0, null, null, 62, null)) == null) ? "" : joinToString$default2;
        LinkedHashMap linkedHashMap = a.f;
        return CollectionsKt.joinToString$default(CollectionsKt.listOf(a.a, a.b, a.c, a.d, str, (linkedHashMap == null || (sortedMap = MapsKt.toSortedMap(linkedHashMap)) == null || (entrySet = sortedMap.entrySet()) == null || (joinToString$default = CollectionsKt.joinToString$default(entrySet, ";", null, null, 0, null, ux0.b, 30, null)) == null) ? "" : joinToString$default, a.g), "_", null, null, 0, null, null, 62, null);
    }
}
