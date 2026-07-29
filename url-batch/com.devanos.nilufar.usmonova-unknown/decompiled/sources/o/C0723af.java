package o;

/* renamed from: o.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723af implements InterfaceC2372zj {
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public C0723af(float f, float f2) {
        int c0;
        this.h = f;
        this.i = f2;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, " + f2 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d = 0.0f;
        double d2 = 3.0f;
        double d3 = 0.0f;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            c0 = d2 == d3 ? 0 : AbstractC1052fg.c0((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int c02 = AbstractC1052fg.c0((float) ((-(d6 + d7)) / d5), fArr, 0);
            c0 = AbstractC1052fg.c0((float) ((d6 - d7) / d5), fArr, c02) + c02;
            if (c0 > 1) {
                float f3 = fArr[0];
                float f4 = fArr[1];
                if (f3 > f4) {
                    fArr[0] = f4;
                    fArr[1] = f3;
                } else if (f3 == f4) {
                    c0--;
                }
            }
        }
        int c03 = AbstractC1052fg.c0(0.5f, fArr, c0) + c0;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < c03; i++) {
            float f5 = fArr[i];
            float f6 = ((((((-2.0f) * f5) + 3.0f) * f5) + 0.0f) * f5) + 0.0f;
            min = Math.min(min, f6);
            max = Math.max(max, f6);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.j = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.k = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d6, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e0, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ff, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0209, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        r15 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        r15 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0192, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    @Override // o.InterfaceC2372zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        float H;
        float cos;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f2 = this.h;
        float f3 = this.i;
        float f4 = f3 - f;
        double d = 0.0f - f;
        double d2 = ((d - ((f2 - f) * 2.0d)) + f4) * 3.0d;
        double d3 = (r6 - r4) * 3.0d;
        double d4 = ((r6 - f4) * 3.0d) + (-r4) + (1.0f - f);
        float f5 = Float.NaN;
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
                double H2 = PX.H((float) sqrt) * 2.0f;
                cos = (float) ((Math.cos(acos / 3.0d) * H2) - d12);
                if (cos < 0.0f) {
                    if (cos >= -8.34465E-7f) {
                        cos = 0.0f;
                        if (Float.isNaN(cos)) {
                            cos = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * H2) - d12);
                            if (cos < 0.0f) {
                                if (cos >= -8.34465E-7f) {
                                    cos = 0.0f;
                                    if (Float.isNaN(cos)) {
                                        H = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * H2) - d12);
                                        if (H >= 0.0f) {
                                            if (H > 1.0f) {
                                            }
                                            f5 = H;
                                        }
                                    }
                                }
                                cos = Float.NaN;
                                if (Float.isNaN(cos)) {
                                }
                            } else {
                                if (cos > 1.0f) {
                                    if (cos <= 1.0000008f) {
                                        cos = 1.0f;
                                    }
                                    cos = Float.NaN;
                                }
                                if (Float.isNaN(cos)) {
                                }
                            }
                        }
                        f5 = cos;
                    }
                    cos = Float.NaN;
                    if (Float.isNaN(cos)) {
                    }
                    f5 = cos;
                } else {
                    if (cos > 1.0f) {
                        if (cos <= 1.0000008f) {
                            cos = 1.0f;
                        }
                        cos = Float.NaN;
                    }
                    if (Float.isNaN(cos)) {
                    }
                    f5 = cos;
                }
            } else if (d11 == 0.0d) {
                float f6 = -PX.H((float) d9);
                float f7 = (float) d12;
                float f8 = (2.0f * f6) - f7;
                if (f8 < 0.0f) {
                    if (f8 >= -8.34465E-7f) {
                        f8 = 0.0f;
                        if (Float.isNaN(f8)) {
                            H = (-f6) - f7;
                            if (H >= 0.0f) {
                                if (H > 1.0f) {
                                }
                                f5 = H;
                            }
                        } else {
                            f5 = f8;
                        }
                    }
                    f8 = Float.NaN;
                    if (Float.isNaN(f8)) {
                    }
                } else {
                    if (f8 > 1.0f) {
                        if (f8 <= 1.0000008f) {
                            f8 = 1.0f;
                        }
                        f8 = Float.NaN;
                    }
                    if (Float.isNaN(f8)) {
                    }
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                H = (float) ((PX.H((float) ((-d9) + sqrt2)) - PX.H((float) (d9 + sqrt2))) - d12);
                if (H >= 0.0f) {
                    if (H > 1.0f) {
                    }
                    f5 = H;
                }
            }
        } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            cos = (float) ((sqrt3 - d3) / d14);
            if (cos < 0.0f) {
                if (cos >= -8.34465E-7f) {
                    cos = 0.0f;
                    if (Float.isNaN(cos)) {
                        H = (float) (((-d3) - sqrt3) / d14);
                        if (H >= 0.0f) {
                            if (H > 1.0f) {
                            }
                            f5 = H;
                        }
                    }
                    f5 = cos;
                }
                cos = Float.NaN;
                if (Float.isNaN(cos)) {
                }
                f5 = cos;
            } else {
                if (cos > 1.0f) {
                    if (cos <= 1.0000008f) {
                        cos = 1.0f;
                    }
                    cos = Float.NaN;
                }
                if (Float.isNaN(cos)) {
                }
                f5 = cos;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            H = (float) ((-d) / d3);
            if (H >= 0.0f) {
                if (H > 1.0f) {
                }
                f5 = H;
            }
        }
        if (!Float.isNaN(f5)) {
            float f9 = (((((-0.6666666f) * f5) + 1.0f) * f5) + 0.0f) * 3.0f * f5;
            float f10 = this.j;
            if (f9 < f10) {
                f9 = f10;
            }
            float f11 = this.k;
            return f9 > f11 ? f11 : f9;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f2 + ", 0.0, " + f3 + ", 1.0) has no solution at " + f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0723af)) {
            return false;
        }
        C0723af c0723af = (C0723af) obj;
        return this.h == c0723af.h && this.i == c0723af.i;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + AbstractC1888sN.e(this.i, AbstractC1888sN.e(0.0f, Float.hashCode(this.h) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.h + ", b=0.0, c=" + this.i + ", d=1.0)";
    }
}
