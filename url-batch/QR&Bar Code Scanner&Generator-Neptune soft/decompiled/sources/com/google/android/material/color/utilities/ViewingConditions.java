package com.google.android.material.color.utilities;

/* loaded from: classes2.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(new double[]{ColorUtils.whitePointD65()[0], ColorUtils.whitePointD65()[1], ColorUtils.whitePointD65()[2]}, (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, 50.0d, 2.0d, false);
    private final double aw;
    private final double c;
    private final double fl;
    private final double flRoot;
    private final double n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;
    private final double z;

    public double getAw() {
        return this.aw;
    }

    public double getN() {
        return this.n;
    }

    public double getNbb() {
        return this.nbb;
    }

    double getNcb() {
        return this.ncb;
    }

    double getC() {
        return this.c;
    }

    double getNc() {
        return this.nc;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    double getZ() {
        return this.z;
    }

    static ViewingConditions make(double[] dArr, double d, double d2, double d3, boolean z) {
        double lerp;
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d4 = (dArr[0] * dArr2[0][0]) + (dArr[1] * dArr2[0][1]) + (dArr[2] * dArr2[0][2]);
        double d5 = (dArr[0] * dArr2[1][0]) + (dArr[1] * dArr2[1][1]) + (dArr[2] * dArr2[1][2]);
        double d6 = (dArr[0] * dArr2[2][0]) + (dArr[1] * dArr2[2][1]) + (dArr[2] * dArr2[2][2]);
        double d7 = (d3 / 10.0d) + 0.8d;
        if (d7 >= 0.9d) {
            lerp = MathUtils.lerp(0.59d, 0.69d, (d7 - 0.9d) * 10.0d);
        } else {
            lerp = MathUtils.lerp(0.525d, 0.59d, 10.0d * (d7 - 0.8d));
        }
        double d8 = lerp;
        double clampDouble = MathUtils.clampDouble(0.0d, 1.0d, z ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d7);
        double[] dArr3 = {(((100.0d / d4) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d5) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d6) * clampDouble) + 1.0d) - clampDouble};
        double d9 = 5.0d * d;
        double d10 = 1.0d / (d9 + 1.0d);
        double d11 = d10 * d10 * d10 * d10;
        double d12 = 1.0d - d11;
        double cbrt = (d11 * d) + (0.1d * d12 * d12 * Math.cbrt(d9));
        double yFromLstar = ColorUtils.yFromLstar(d2) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double[] dArr4 = {Math.pow(((dArr3[0] * cbrt) * d4) / 100.0d, 0.42d), Math.pow(((dArr3[1] * cbrt) * d5) / 100.0d, 0.42d), Math.pow(((dArr3[2] * cbrt) * d6) / 100.0d, 0.42d)};
        double[] dArr5 = {(dArr4[0] * 400.0d) / (dArr4[0] + 27.13d), (dArr4[1] * 400.0d) / (dArr4[1] + 27.13d), (dArr4[2] * 400.0d) / (dArr4[2] + 27.13d)};
        return new ViewingConditions(yFromLstar, ((dArr5[0] * 2.0d) + dArr5[1] + (dArr5[2] * 0.05d)) * pow, pow, pow, d8, d7, dArr3, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    private ViewingConditions(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.n = d;
        this.aw = d2;
        this.nbb = d3;
        this.ncb = d4;
        this.c = d5;
        this.nc = d6;
        this.rgbD = dArr;
        this.fl = d7;
        this.flRoot = d8;
        this.z = d9;
    }
}
