package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class R5 {

    @NotNull
    public static final R5 a = new R5();

    @NotNull
    public static final String b = "ext_";

    private R5() {
    }

    @NotNull
    public final Map<String, String> a(@Nullable Bundle bundle) {
        Set<String> keySet = bundle != null ? bundle.keySet() : null;
        if (keySet == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(keySet, 10)), 16));
        for (String str : keySet) {
            String str2 = b + str;
            Object obj = bundle.get(str);
            Pair pair = TuplesKt.to(str2, obj instanceof Iterable ? CollectionsKt.joinToString$default((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
