package o;

/* renamed from: o.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114gc {
    public static final long b = AbstractC0022At.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final /* synthetic */ int g = 0;
    public final long a;

    static {
        AbstractC0022At.c(4282664004L);
        AbstractC0022At.c(4287137928L);
        AbstractC0022At.c(4291611852L);
        AbstractC0022At.c(4294967295L);
        c = AbstractC0022At.c(4294901760L);
        AbstractC0022At.c(4278255360L);
        d = AbstractC0022At.c(4278190335L);
        AbstractC0022At.c(4294967040L);
        AbstractC0022At.c(4278255615L);
        AbstractC0022At.c(4294902015L);
        e = AbstractC0022At.b(0);
        f = AbstractC0022At.a(0.0f, 0.0f, 0.0f, 0.0f, C1640oc.d);
    }

    public /* synthetic */ C1114gc(long j) {
        this.a = j;
    }

    public static long a(long j, float f2) {
        return AbstractC0022At.a(f(j), e(j), d(j), f2, C1640oc.f[(int) (j & 63)]);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        float l;
        float f2;
        if ((63 & j) == 0) {
            l = (float) AbstractC1035fP.l((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            l = (float) AbstractC1035fP.l((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return l / f2;
    }

    public static final float d(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC1035fP.l((j >>> 32) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC2045um.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC1035fP.l((j >>> 40) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC2045um.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC1035fP.l((j >>> 48) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC2045um.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String g(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(f(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        sb.append(c(j));
        sb.append(", ");
        return AbstractC2188wx.h(sb, C1640oc.f[(int) (j & 63)].a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1114gc) {
            return this.a == ((C1114gc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
