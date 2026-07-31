package io.bidmachine.util;

import kotlin.Metadata;

/* compiled from: MathUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0004*\u00020\u0004¨\u0006\u0005"}, d2 = {"nonNegative", "", "", "", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class MathUtilsKt {
    public static final int nonNegative(int i) {
        return Math.max(i, 0);
    }

    public static final long nonNegative(long j) {
        return Math.max(j, 0L);
    }

    public static final float nonNegative(float f) {
        return Math.max(f, 0.0f);
    }

    public static final double nonNegative(double d) {
        return Math.max(d, 0.0d);
    }
}
