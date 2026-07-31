package io.bidmachine.analytics.internal.I;

import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public abstract class b {
    public static final Float a(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            return StringsKt.toFloatOrNull((String) obj);
        }
        return null;
    }
}
