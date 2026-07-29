package com.google.android.material.color;

/* loaded from: classes2.dex */
final class ViewingConditions {
    public static final ViewingConditions DEFAULT;
    private final float aw;
    private final float c;
    private final float fl;
    private final float flRoot;
    private final float n;
    private final float nbb;
    private final float nc;
    private final float ncb;
    private final float[] rgbD;
    private final float z;

    static {
        float[] whitePointD65 = ColorUtils.whitePointD65();
        double yFromLstar = ColorUtils.yFromLstar(50.0f);
        Double.isNaN(yFromLstar);
        DEFAULT = make(whitePointD65, (float) ((yFromLstar * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public float getAw() {
        return this.aw;
    }

    public float getN() {
        return this.n;
    }

    public float getNbb() {
        return this.nbb;
    }

    float getNcb() {
        return this.ncb;
    }

    float getC() {
        return this.c;
    }

    float getNc() {
        return this.nc;
    }

    public float[] getRgbD() {
        return this.rgbD;
    }

    float getFl() {
        return this.fl;
    }

    public float getFlRoot() {
        return this.flRoot;
    }

    float getZ() {
        return this.z;
    }

    static ViewingConditions make(float[] fArr, float f, float f2, float f3, boolean z) {
        float lerp;
        float[][] fArr2 = Cam16.XYZ_TO_CAM16RGB;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        if (f7 >= 0.9d) {
            lerp = MathUtils.lerp(0.59f, 0.69f, (f7 - 0.9f) * 10.0f);
        } else {
            lerp = MathUtils.lerp(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        }
        float f8 = lerp;
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        double d2 = f;
        Double.isNaN(d2);
        float cbrt = (f10 * f) + (0.1f * f11 * f11 * ((float) Math.cbrt(d2 * 5.0d)));
        float yFromLstar = ColorUtils.yFromLstar(f2) / fArr[1];
        double d3 = yFromLstar;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = fArr3[0] * cbrt * f4;
        Double.isNaN(d4);
        double d5 = fArr3[1] * cbrt * f5;
        Double.isNaN(d5);
        double d6 = fArr3[2] * cbrt * f6;
        Double.isNaN(d6);
        float[] fArr4 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLstar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, f8, f7, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.n = f;
        this.aw = f2;
        this.nbb = f3;
        this.ncb = f4;
        this.c = f5;
        this.nc = f6;
        this.rgbD = fArr;
        this.fl = f7;
        this.flRoot = f8;
        this.z = f9;
    }
}
