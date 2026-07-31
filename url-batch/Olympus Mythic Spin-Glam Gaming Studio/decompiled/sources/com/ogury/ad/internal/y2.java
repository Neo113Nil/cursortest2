package com.ogury.ad.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y2 {
    public static final y2 a = new y2();
    public static final Map b;

    static {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(...)");
        b = synchronizedMap;
    }
}
