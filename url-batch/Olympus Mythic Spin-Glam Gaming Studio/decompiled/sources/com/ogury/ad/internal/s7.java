package com.ogury.ad.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s7 {
    public static final s7 a = new s7();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static void a(r7 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = (Function1) b.get(event.a);
        if (function1 != null) {
            function1.invoke(event);
        }
    }
}
