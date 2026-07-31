package com.yandex.div.evaluable.function;

import kotlin.Metadata;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toColorFloatComponentValue", "", "", "toColorIntComponentValue", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ColorFunctionsKt {
    public static final double toColorFloatComponentValue(int i) throws IllegalArgumentException {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return i / 255.0f;
    }

    public static final int toColorIntComponentValue(double d) throws IllegalArgumentException {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d * 255.0f) + 0.5f);
    }
}
