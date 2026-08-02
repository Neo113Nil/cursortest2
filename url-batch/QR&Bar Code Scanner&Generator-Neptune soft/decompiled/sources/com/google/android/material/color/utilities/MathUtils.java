package com.google.android.material.color.utilities;

/* loaded from: classes2.dex */
public class MathUtils {
    public static double clampDouble(double d, double d2, double d3) {
        return d3 < d ? d : d3 > d2 ? d2 : d3;
    }

    public static int clampInt(int i, int i2, int i3) {
        return i3 < i ? i : i3 > i2 ? i2 : i3;
    }

    public static double lerp(double d, double d2, double d3) {
        return ((1.0d - d3) * d) + (d3 * d2);
    }

    public static double sanitizeDegreesDouble(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    public static int signum(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    private MathUtils() {
    }

    public static int sanitizeDegreesInt(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static double rotationDirection(double d, double d2) {
        return sanitizeDegreesDouble(d2 - d) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double differenceDegrees(double d, double d2) {
        return 180.0d - Math.abs(Math.abs(d - d2) - 180.0d);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        return new double[]{(dArr[0] * dArr2[0][0]) + (dArr[1] * dArr2[0][1]) + (dArr[2] * dArr2[0][2]), (dArr[0] * dArr2[1][0]) + (dArr[1] * dArr2[1][1]) + (dArr[2] * dArr2[1][2]), (dArr[0] * dArr2[2][0]) + (dArr[1] * dArr2[2][1]) + (dArr[2] * dArr2[2][2])};
    }
}
