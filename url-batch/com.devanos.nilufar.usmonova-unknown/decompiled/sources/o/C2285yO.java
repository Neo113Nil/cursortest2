package o;

import java.util.Arrays;

/* renamed from: o.yO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2285yO extends AbstractC1508mc {
    public static final C1574nc p = new C1574nc(16);
    public final H00 d;
    public final float e;
    public final float f;
    public final C1634oW g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final InterfaceC0504Ti k;
    public final C2021uO l;
    public final InterfaceC0504Ti m;
    public final C2021uO n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f247o;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01f7, code lost:
    
        if (o.AbstractC2219xO.j(r1[4] - r1[r41], r1[5] - r1[1], r3[4], r3[5]) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2285yO(String str, float[] fArr, H00 h00, float[] fArr2, InterfaceC0504Ti interfaceC0504Ti, InterfaceC0504Ti interfaceC0504Ti2, float f, float f2, C1634oW c1634oW, int i) {
        super(AbstractC1310jc.a, str, i);
        ?? r41;
        float f3;
        float f4;
        boolean z;
        this.d = h00;
        this.e = f;
        this.f = f2;
        this.g = c1634oW;
        this.k = interfaceC0504Ti;
        this.l = new C2021uO(this, 0);
        this.m = interfaceC0504Ti2;
        this.n = new C2021uO(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = h00.a;
            r41 = 0;
            float f21 = h00.b;
            float f22 = 1;
            float f23 = (f22 - f14) / f15;
            float f24 = (f22 - f16) / f17;
            float f25 = (f22 - f18) / f19;
            float f26 = (f22 - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = f24 - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / (((f25 - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
        } else {
            r41 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
        }
        this.j = AbstractC0048Bt.J(this.i);
        float d = AbstractC2219xO.d(fArr3);
        float[] fArr4 = C1640oc.a;
        if (d / AbstractC2219xO.d(C1640oc.b) > 0.9f) {
            float[] fArr5 = C1640oc.a;
            float f38 = fArr3[r41];
            float f39 = fArr5[r41];
            float f40 = fArr3[1];
            float f41 = fArr5[1];
            float f42 = fArr3[2] - fArr5[2];
            float f43 = fArr3[3] - fArr5[3];
            float f44 = fArr3[4];
            float f45 = fArr5[4];
            float f46 = fArr3[5];
            float f47 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[r41] = f38 - f39;
            fArr6[1] = f40 - f41;
            fArr6[2] = f42;
            fArr6[3] = f43;
            fArr6[4] = f44 - f45;
            fArr6[5] = f46 - f47;
            if (AbstractC2219xO.j(fArr6[r41], fArr6[1], f39 - f45, f41 - f47) >= 0.0f) {
                if (AbstractC2219xO.j(fArr5[r41] - fArr5[2], fArr5[1] - fArr5[3], fArr6[r41], fArr6[1]) >= 0.0f) {
                    if (AbstractC2219xO.j(fArr6[2], fArr6[3], fArr5[2] - fArr5[r41], fArr5[3] - fArr5[1]) >= 0.0f) {
                        if (AbstractC2219xO.j(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) >= 0.0f) {
                            if (AbstractC2219xO.j(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) >= 0.0f) {
                            }
                        }
                    }
                }
            }
        } else {
            f4 = 0.0f;
        }
        int i2 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = C1640oc.a;
            if (fArr3 != fArr7) {
                for (int i3 = r41; i3 < 6; i3++) {
                    if (Float.compare(fArr3[i3], fArr7[i3]) != 0 && Math.abs(fArr3[i3] - fArr7[i3]) > 0.001f) {
                        break;
                    }
                }
            }
            if (AbstractC0048Bt.u(h00, AbstractC0022At.g) && f == f4 && f2 == f3) {
                float[] fArr8 = C1640oc.a;
                C2285yO c2285yO = C1640oc.c;
                for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                    if (Math.abs(interfaceC0504Ti.b(d2) - c2285yO.k.b(d2)) <= 0.001d && Math.abs(interfaceC0504Ti2.b(d2) - c2285yO.m.b(d2)) <= 0.001d) {
                    }
                }
            }
            z = r41;
            this.f247o = z;
        }
        z = true;
        this.f247o = z;
    }

    @Override // o.AbstractC1508mc
    public final float a(int i) {
        return this.f;
    }

    @Override // o.AbstractC1508mc
    public final float b(int i) {
        return this.e;
    }

    @Override // o.AbstractC1508mc
    public final boolean c() {
        return this.f247o;
    }

    @Override // o.AbstractC1508mc
    public final long d(float f, float f2, float f3) {
        double d = f;
        C2021uO c2021uO = this.n;
        float b = (float) c2021uO.b(d);
        float b2 = (float) c2021uO.b(f2);
        float b3 = (float) c2021uO.b(f3);
        float[] fArr = this.i;
        float f4 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f5 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // o.AbstractC1508mc
    public final float e(float f, float f2, float f3) {
        double d = f;
        C2021uO c2021uO = this.n;
        float b = (float) c2021uO.b(d);
        float b2 = (float) c2021uO.b(f2);
        float b3 = (float) c2021uO.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
    }

    @Override // o.AbstractC1508mc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2285yO.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C2285yO c2285yO = (C2285yO) obj;
        C1634oW c1634oW = c2285yO.g;
        if (Float.compare(c2285yO.e, this.e) != 0 || Float.compare(c2285yO.f, this.f) != 0 || !AbstractC0048Bt.h(this.d, c2285yO.d) || !Arrays.equals(this.h, c2285yO.h)) {
            return false;
        }
        C1634oW c1634oW2 = this.g;
        if (c1634oW2 != null) {
            return AbstractC0048Bt.h(c1634oW2, c1634oW);
        }
        if (c1634oW == null) {
            return true;
        }
        if (AbstractC0048Bt.h(this.k, c2285yO.k)) {
            return AbstractC0048Bt.h(this.m, c2285yO.m);
        }
        return false;
    }

    @Override // o.AbstractC1508mc
    public final long f(float f, float f2, float f3, float f4, AbstractC1508mc abstractC1508mc) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        C2021uO c2021uO = this.l;
        return AbstractC0022At.a((float) c2021uO.b(f5), (float) c2021uO.b(f6), (float) c2021uO.b(f7), f4, abstractC1508mc);
    }

    @Override // o.AbstractC1508mc
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C1634oW c1634oW = this.g;
        int hashCode2 = floatToIntBits2 + (c1634oW != null ? c1634oW.hashCode() : 0);
        if (c1634oW == null) {
            return this.m.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2285yO(String str, float[] fArr, H00 h00, final C1634oW c1634oW, int i) {
        this(str, fArr, h00, null, r5, new InterfaceC0504Ti() { // from class: o.wO
            @Override // o.InterfaceC0504Ti
            public final double b(double d) {
                switch (r2) {
                    case 0:
                        C1634oW c1634oW2 = c1634oW;
                        double d2 = c1634oW2.b;
                        double d3 = c1634oW2.c;
                        double d4 = c1634oW2.d;
                        return d >= c1634oW2.e * d4 ? (Math.pow(d, 1.0d / c1634oW2.a) - d3) / d2 : d / d4;
                    default:
                        C1634oW c1634oW3 = c1634oW;
                        double d5 = c1634oW3.b;
                        return d >= c1634oW3.e ? Math.pow((d5 * d) + c1634oW3.c, c1634oW3.a) : d * c1634oW3.d;
                }
            }
        }, 0.0f, 1.0f, c1634oW, i);
        final int i2 = 0;
        InterfaceC0504Ti interfaceC0504Ti = new InterfaceC0504Ti() { // from class: o.wO
            @Override // o.InterfaceC0504Ti
            public final double b(double d) {
                switch (i2) {
                    case 0:
                        C1634oW c1634oW2 = c1634oW;
                        double d2 = c1634oW2.b;
                        double d3 = c1634oW2.c;
                        double d4 = c1634oW2.d;
                        return d >= c1634oW2.e * d4 ? (Math.pow(d, 1.0d / c1634oW2.a) - d3) / d2 : d / d4;
                    default:
                        C1634oW c1634oW3 = c1634oW;
                        double d5 = c1634oW3.b;
                        return d >= c1634oW3.e ? Math.pow((d5 * d) + c1634oW3.c, c1634oW3.a) : d * c1634oW3.d;
                }
            }
        };
        final int i3 = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2285yO(String str, float[] fArr, H00 h00, final double d, float f, float f2, int i) {
        this(str, fArr, h00, null, r11, r3, f, f2, new C1634oW(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        InterfaceC0504Ti interfaceC0504Ti;
        InterfaceC0504Ti interfaceC0504Ti2 = p;
        if (d == 1.0d) {
            interfaceC0504Ti = interfaceC0504Ti2;
        } else {
            final int i2 = 0;
            interfaceC0504Ti = new InterfaceC0504Ti() { // from class: o.vO
                @Override // o.InterfaceC0504Ti
                public final double b(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            interfaceC0504Ti2 = new InterfaceC0504Ti() { // from class: o.vO
                @Override // o.InterfaceC0504Ti
                public final double b(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
    }
}
