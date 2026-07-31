package com.google.common.math;

import com.google.common.base.Preconditions;

/* loaded from: classes.dex */
abstract class DoubleUtils {
    static long getSignificand(double d) {
        Preconditions.checkArgument(isFinite(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean isFinite(double d) {
        return Math.getExponent(d) <= 1023;
    }

    static boolean isNormal(double d) {
        return Math.getExponent(d) >= -1022;
    }

    static double scaleNormalize(double d) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
    }
}
