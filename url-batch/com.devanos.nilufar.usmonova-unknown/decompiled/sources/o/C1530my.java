package o;

/* renamed from: o.my, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530my extends AbstractC1508mc {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1530my(int i, int i2, long j, String str) {
        super(j, str, i);
        this.d = i2;
    }

    @Override // o.AbstractC1508mc
    public final float a(int i) {
        switch (this.d) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // o.AbstractC1508mc
    public final float b(int i) {
        switch (this.d) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // o.AbstractC1508mc
    public final long d(float f, float f2, float f3) {
        switch (this.d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float f8 = f6 * AbstractC0022At.h[0];
                return (Float.floatToRawIntBits(f7 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f) & 4294967295L);
        }
    }

    @Override // o.AbstractC1508mc
    public final float e(float f, float f2, float f3) {
        switch (this.d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * AbstractC0022At.h[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // o.AbstractC1508mc
    public final long f(float f, float f2, float f3, float f4, AbstractC1508mc abstractC1508mc) {
        switch (this.d) {
            case 0:
                float[] fArr = AbstractC0022At.h;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float cbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float cbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * cbrt2) - 16.0f;
                float f9 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return AbstractC0022At.a(f8, f9, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f4, abstractC1508mc);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return AbstractC0022At.a(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, abstractC1508mc);
        }
    }
}
