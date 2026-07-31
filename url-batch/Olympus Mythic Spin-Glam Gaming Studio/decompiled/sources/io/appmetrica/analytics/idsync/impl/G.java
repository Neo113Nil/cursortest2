package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes15.dex */
public final class G {
    public final ModulePreferences a;
    public final F b = new F();
    public final String c = "request_state";
    public final Map d = MapsKt.toMutableMap(a());

    public G(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.b.toModel(this.a.getString(this.c, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(model, 10)), 16));
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).a, obj);
        }
        return linkedHashMap;
    }
}
