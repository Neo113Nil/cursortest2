package com.vungle.ads.internal.model;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes15.dex */
public enum n2 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_ID(0),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_ID(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY(2);

    public static final LinkedHashMap b;
    public final int a;

    static {
        n2[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (n2 n2Var : values) {
            linkedHashMap.put(Integer.valueOf(n2Var.a), n2Var);
        }
        b = linkedHashMap;
    }

    n2(int i) {
        this.a = i;
    }
}
