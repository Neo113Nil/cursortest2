package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class O6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gm[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        Gm[] gmArr = new Gm[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            Gm gm = new Gm();
            gm.a = (String) entry.getKey();
            gm.b = (String[]) ((Collection) entry.getValue()).toArray(new String[0]);
            gmArr[i] = gm;
            i = i2;
        }
        return gmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull Gm[] gmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(gmArr.length), 16));
        for (Gm gm : gmArr) {
            Pair pair = TuplesKt.to(gm.a, ArraysKt.toList(gm.b));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
