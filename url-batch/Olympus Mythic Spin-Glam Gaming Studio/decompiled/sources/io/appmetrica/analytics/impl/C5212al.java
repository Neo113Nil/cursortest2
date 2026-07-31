package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.al, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5212al implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5264cl fromModel(@NotNull Map<String, byte[]> map) {
        C5264cl c5264cl = new C5264cl();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            C5290dl c5290dl = new C5290dl();
            c5290dl.a = entry.getKey().getBytes(Charsets.UTF_8);
            c5290dl.b = entry.getValue();
            arrayList.add(c5290dl);
        }
        c5264cl.a = (C5290dl[]) arrayList.toArray(new C5290dl[0]);
        return c5264cl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull C5264cl c5264cl) {
        C5290dl[] c5290dlArr = c5264cl.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(c5290dlArr.length), 16));
        for (C5290dl c5290dl : c5290dlArr) {
            Pair pair = TuplesKt.to(new String(c5290dl.a, Charsets.UTF_8), c5290dl.b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
