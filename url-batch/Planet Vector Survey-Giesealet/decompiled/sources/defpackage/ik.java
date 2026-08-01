package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ik implements ro {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ik(float f, float f2, float f3) {
        int a0;
        this.a = f;
        this.b = f2;
        this.c = f3;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(1.0f)) {
            hh0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f4 = (f2 - 0.0f) * 3.0f;
        float f5 = (1.0f - f2) * 3.0f;
        double d = f4;
        double d2 = f5;
        double d3 = 2.0d * d2;
        double d4 = (d - d3) + 0.0d;
        if (d4 == 0.0d) {
            a0 = d2 == 0.0d ? 0 : mz.a0((float) ((d3 - 0.0d) / (d3 - 0.0d)), fArr, 0);
        } else {
            double d5 = -Math.sqrt((d2 * d2) - (0.0d * d));
            double d6 = (-d) + d2;
            int a02 = mz.a0((float) ((-(d5 + d6)) / d4), fArr, 0);
            a0 = mz.a0((float) ((d5 - d6) / d4), fArr, a02) + a02;
            if (a0 > 1) {
                float f6 = fArr[0];
                float f7 = fArr[1];
                if (f6 > f7) {
                    fArr[0] = f7;
                    fArr[1] = f6;
                } else if (f6 == f7) {
                    a0--;
                }
            }
        }
        float f8 = (f5 - f4) * 2.0f;
        int a03 = mz.a0((-f8) / (((0.0f - f5) * 2.0f) - f8), fArr, a0) + a0;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < a03; i++) {
            float f9 = fArr[i];
            float f10 = (((((((((f2 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f9) + (((1.0f - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f9) + f4) * f9) + 0.0f;
            min = Math.min(min, f10);
            max = Math.max(max, f10);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.d = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.e = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f5, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0222, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024c  */
    @Override // defpackage.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        boolean isNaN;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f2 = this.a;
        float f3 = this.c;
        float f4 = f3 - f;
        double d = 0.0f - f;
        float f5 = 0.0f;
        double d2 = ((d - ((f2 - f) * 2.0d)) + f4) * 3.0d;
        double d3 = (r6 - r4) * 3.0d;
        double d4 = ((r6 - f4) * 3.0d) + (-r4) + (1.0f - f);
        float f6 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double sqrt = Math.sqrt(-d10);
                double d13 = (-d9) / sqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double acos = Math.acos(d13);
                double q = nk.q((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * q) - d12);
                float f7 = cos < 0.0f ? 0.0f : cos;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - cos) > 1.05E-6f) {
                    f7 = Float.NaN;
                }
                if (Float.isNaN(f7)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * q) - d12);
                    f7 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - cos2) > 1.05E-6f) {
                        f7 = Float.NaN;
                    }
                    if (Float.isNaN(f7)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * q) - d12);
                        if (cos3 >= 0.0f) {
                            f5 = cos3;
                        }
                        if (f5 > 1.0f) {
                            f5 = 1.0f;
                        }
                    }
                }
                f6 = f7;
                isNaN = Float.isNaN(f6);
                float f8 = this.b;
                if (isNaN) {
                }
            } else if (d11 == 0.0d) {
                float f9 = -nk.q((float) d9);
                float f10 = (float) d12;
                float f11 = (f9 * 2.0f) - f10;
                float f12 = f11 < 0.0f ? 0.0f : f11;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (Math.abs(f12 - f11) > 1.05E-6f) {
                    f12 = Float.NaN;
                }
                if (Float.isNaN(f12)) {
                    float f13 = (-f9) - f10;
                    if (f13 >= 0.0f) {
                        f5 = f13;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                } else {
                    f6 = f12;
                }
                isNaN = Float.isNaN(f6);
                float f82 = this.b;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float q2 = (float) ((nk.q((float) ((-d9) + sqrt2)) - nk.q((float) (d9 + sqrt2))) - d12);
                if (q2 >= 0.0f) {
                    f5 = q2;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f14 = (float) ((-d) / d3);
                    if (f14 >= 0.0f) {
                        f5 = f14;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                }
                isNaN = Float.isNaN(f6);
                float f822 = this.b;
                if (isNaN) {
                    float f15 = ((((((f822 - 1.0f) + 0.33333334f) * f6) + (1.0f - (2.0f * f822))) * f6) + f822) * 3.0f * f6;
                    float f16 = this.d;
                    if (f15 < f16) {
                        f15 = f16;
                    }
                    float f17 = this.e;
                    return f15 > f17 ? f17 : f15;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f2 + ", " + f822 + ", " + f3 + ", 1.0) has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f18 = (float) ((sqrt3 - d3) / d14);
            float f19 = f18 < 0.0f ? 0.0f : f18;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (Math.abs(f19 - f18) > 1.05E-6f) {
                f19 = Float.NaN;
            }
            if (Float.isNaN(f19)) {
                float f20 = (float) (((-d3) - sqrt3) / d14);
                if (f20 >= 0.0f) {
                    f5 = f20;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
            } else {
                f6 = f19;
            }
            isNaN = Float.isNaN(f6);
            float f8222 = this.b;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return this.a == ikVar.a && this.b == ikVar.b && this.c == ikVar.c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=1.0)";
    }
}
