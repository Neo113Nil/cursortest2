package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ge {
    public static final long b = d31.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        d31.d(4282664004L);
        d31.d(4287137928L);
        d31.d(4291611852L);
        c = d31.d(4294967295L);
        d = d31.d(4294901760L);
        d31.d(4278255360L);
        e = d31.d(4278190335L);
        d31.d(4294967040L);
        d31.d(4278255615L);
        d31.d(4294902015L);
        f = d31.c(0);
        g = d31.b(0.0f, 0.0f, 0.0f, 0.0f, qe.u);
    }

    public /* synthetic */ ge(long j) {
        this.a = j;
    }

    public static final long a(long j, me meVar) {
        ri riVar;
        me f2 = f(j);
        int i = f2.c;
        int i2 = meVar.c;
        if ((i | i2) < 0) {
            riVar = nk.m(f2, meVar);
        } else {
            p60 p60Var = si.a;
            int i3 = i | (i2 << 6);
            Object b2 = p60Var.b(i3);
            if (b2 == null) {
                b2 = nk.m(f2, meVar);
                p60Var.h(i3, b2);
            }
            riVar = (ri) b2;
        }
        return riVar.a(j);
    }

    public static long b(long j, float f2) {
        return d31.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float u;
        float f2;
        if ((63 & j) == 0) {
            u = (float) yc0.u((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            u = (float) yc0.u((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return u / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) yc0.u((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - kr.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final me f(long j) {
        float[] fArr = qe.a;
        return qe.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) yc0.u((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - kr.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) yc0.u((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - kr.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static int i(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String j(long j) {
        return "Color(" + h(j) + ", " + g(j) + ", " + e(j) + ", " + d(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ge) {
            return this.a == ((ge) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return i(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
