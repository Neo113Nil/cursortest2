package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bj0 {
    public final aj0 a;
    public final mw0 b;
    public final x60 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public x1 g;
    public long h;
    public final b i;
    public final z60 j;

    public bj0() {
        aj0 aj0Var = new aj0();
        aj0Var.b = new long[192];
        aj0Var.c = new long[192];
        this.a = aj0Var;
        this.b = new mw0();
        this.c = new x60();
        this.h = -1L;
        this.i = new b(16, this);
        this.j = new z60();
    }

    public static long a(ea0 ea0Var, long j) {
        float[] b;
        int b2;
        cd0 cd0Var = ea0Var.L;
        if (cd0Var == null || (b2 = ud0.b((b = ((pv) cd0Var).b()))) == 3) {
            return j;
        }
        if ((b2 & 2) == 0) {
            return 9223372034707292159L;
        }
        return nz.c0(mz.I(b, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32)));
    }

    public static long h(p10 p10Var) {
        ca0 ca0Var = p10Var.F;
        ea0 ea0Var = (ea0) ca0Var.h;
        long j = 0;
        for (ea0 ea0Var2 = (iy) ca0Var.g; ea0Var2 != null && ea0Var2 != ea0Var; ea0Var2 = ea0Var2.t) {
            long a = a(ea0Var2, j);
            if (bz.a(a, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            j = bz.c(a, ea0Var2.C);
        }
        return j;
    }

    public static void i(p10 p10Var) {
        long j;
        ea0 ea0Var = (ea0) p10Var.F.h;
        long a = a(ea0Var, 0L);
        long j2 = 9223372034707292159L;
        if (!ud0.c(a)) {
            p10Var.f = 9223372034707292159L;
            return;
        }
        long c = bz.c(a, ea0Var.C);
        p10 n = p10Var.n();
        if (n != null) {
            if (!ud0.c(n.f)) {
                i(n);
            }
            long j3 = n.f;
            if (ud0.c(j3)) {
                if (n.i) {
                    j = h(n);
                    n.h = j;
                    n.i = false;
                } else {
                    j = n.h;
                }
                if (ud0.c(j)) {
                    j2 = bz.c(bz.c(j3, j), c);
                }
            }
        } else {
            j2 = c;
        }
        p10Var.f = j2;
    }

    public final void b() {
        boolean z;
        long j;
        long j2;
        long j3;
        Handler handler = y1.a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.d;
        boolean z3 = z2 || this.e;
        aj0 aj0Var = this.a;
        mw0 mw0Var = this.b;
        if (z2) {
            this.d = false;
            x60 x60Var = this.c;
            j = 128;
            Object[] objArr = x60Var.a;
            int i = x60Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((bu) objArr[i2]).a();
            }
            long[] jArr = (long[]) aj0Var.b;
            int i3 = aj0Var.a;
            j2 = 255;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j4 = jArr[i4 + 2];
                if ((((int) (j4 >> 61)) & 1) != 0) {
                    long j5 = jArr[i4];
                    long j6 = jArr[i4 + 1];
                    if (mw0Var.a.b(((int) j4) & 67108863) != null) {
                        g8.q();
                        return;
                    }
                }
            }
            j3 = -9187201950435737472L;
            p60 p60Var = mw0Var.a;
            Object[] objArr2 = p60Var.c;
            long[] jArr2 = p60Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j7 = jArr2[i5];
                    z = z3;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j7 & 255) < 128 && objArr2[(i5 << 3) + i7] != null) {
                                g8.q();
                                return;
                            }
                            j7 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z3 = z;
                }
            } else {
                z = z3;
            }
            long[] jArr3 = (long[]) aj0Var.b;
            int i8 = aj0Var.a;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-2305843009213693953L);
            }
        } else {
            z = z3;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        if (this.e) {
            this.e = false;
            p60 p60Var2 = mw0Var.a;
            Object[] objArr3 = p60Var2.c;
            long[] jArr4 = p60Var2.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                while (true) {
                    long j8 = jArr4[i11];
                    if ((((~j8) << 7) & j8 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j8 & j2) < j && objArr3[(i11 << 3) + i13] != null) {
                                g8.q();
                                return;
                            }
                            j8 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length2) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        if (z) {
            mw0Var.getClass();
        }
        if (this.f) {
            this.f = false;
            long[] jArr5 = (long[]) aj0Var.b;
            int i14 = aj0Var.a;
            long[] jArr6 = (long[]) aj0Var.c;
            int i15 = 0;
            for (int i16 = 0; i16 < jArr5.length - 2 && i15 < jArr6.length - 2 && i16 < i14; i16 += 3) {
                int i17 = i16 + 2;
                if (jArr5[i17] != 2305843009213693951L) {
                    jArr6[i15] = jArr5[i16];
                    jArr6[i15 + 1] = jArr5[i16 + 1];
                    jArr6[i15 + 2] = jArr5[i17];
                    i15 += 3;
                }
            }
            aj0Var.a = i15;
            aj0Var.b = jArr6;
            aj0Var.c = jArr5;
        }
        if (mw0Var.b > currentTimeMillis) {
            return;
        }
        p60 p60Var3 = mw0Var.a;
        Object[] objArr4 = p60Var3.c;
        long[] jArr7 = p60Var3.a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i18 = 0;
            while (true) {
                long j9 = jArr7[i18];
                if ((((~j9) << 7) & j9 & j3) != j3) {
                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j9 & j2) < j && objArr4[(i18 << 3) + i20] != null) {
                            g8.q();
                            return;
                        }
                        j9 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length3) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        mw0Var.b = -1L;
    }

    public final void c(p10 p10Var, boolean z) {
        char c;
        boolean z2;
        ca0 ca0Var = p10Var.F;
        ea0 ea0Var = (ea0) ca0Var.h;
        f50 f50Var = p10Var.G.o;
        int H = f50Var.H();
        float E = f50Var.E();
        z60 z60Var = this.j;
        z60Var.a = 0.0f;
        z60Var.b = 0.0f;
        z60Var.c = H;
        z60Var.d = E;
        while (true) {
            c = ' ';
            if (ea0Var == null) {
                break;
            }
            cd0 cd0Var = ea0Var.L;
            if (cd0Var != null) {
                float[] b = ((pv) cd0Var).b();
                if (!nz.J(b)) {
                    mz.J(b, z60Var);
                }
            }
            long j = ea0Var.C;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            z60Var.a += intBitsToFloat;
            z60Var.b += intBitsToFloat2;
            z60Var.c += intBitsToFloat;
            z60Var.d += intBitsToFloat2;
            ea0Var = ea0Var.t;
        }
        int i = (int) z60Var.a;
        int i2 = (int) z60Var.b;
        int i3 = (int) z60Var.c;
        int i4 = (int) z60Var.d;
        int i5 = p10Var.e;
        aj0 aj0Var = this.a;
        if (!z) {
            int i6 = i5 & 67108863;
            long[] jArr = (long[]) aj0Var.b;
            int i7 = aj0Var.a;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                aj0 aj0Var2 = aj0Var;
                long j2 = jArr[i9];
                z2 = true;
                if ((((int) j2) & 67108863) == i6) {
                    jArr[i8] = (i << c2) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << c2) | (i4 & 4294967295L);
                    jArr[i9] = 2305843009213693952L | j2;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    aj0Var = aj0Var2;
                }
            }
        }
        aj0 aj0Var3 = aj0Var;
        z2 = true;
        p10 n = p10Var.n();
        aj0Var3.a(i5, i, i2, i3, i4, n != null ? n.e : -1, ca0Var.h(1024), ca0Var.h(16));
        this.d = z2;
    }

    public final void d(p10 p10Var) {
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            c(p10Var2, false);
            d(p10Var2);
        }
    }

    public final void e(p10 p10Var) {
        this.d = true;
        int i = p10Var.e & 67108863;
        aj0 aj0Var = this.a;
        long[] jArr = (long[]) aj0Var.b;
        int i2 = aj0Var.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        x1 x1Var = this.g;
        boolean z = x1Var != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (x1Var != null) {
                Handler handler = y1.a;
                y1.a.removeCallbacks(x1Var);
            }
            Handler handler2 = y1.a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j2, 16 + currentTimeMillis);
            this.h = max;
            x1 x1Var2 = new x1(this.i, 0);
            y1.a.postDelayed(x1Var2, max - currentTimeMillis);
            this.g = x1Var2;
        }
    }

    public final void f(p10 p10Var) {
        long h = h(p10Var);
        if (!ud0.c(h)) {
            d(p10Var);
            return;
        }
        p10Var.h = h;
        p10Var.i = false;
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            g((p10) objArr[i2], false);
        }
        e(p10Var);
    }

    public final void g(p10 p10Var, boolean z) {
        long j;
        char c;
        f50 f50Var = p10Var.G.o;
        int H = f50Var.H();
        int E = f50Var.E();
        long j2 = p10Var.f;
        long j3 = p10Var.g;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        i(p10Var);
        long j4 = p10Var.f;
        if (!ud0.c(j4)) {
            c(p10Var, z);
            return;
        }
        p10Var.g = (E & 4294967295L) | (H << 32);
        int i3 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        int i5 = i3 + H;
        int i6 = i4 + E;
        if (!z && bz.a(j4, j2) && i == H && i2 == E) {
            return;
        }
        int i7 = p10Var.e;
        ca0 ca0Var = p10Var.F;
        aj0 aj0Var = this.a;
        if (!z) {
            int i8 = i7 & 67108863;
            long[] jArr = (long[]) aj0Var.b;
            int i9 = aj0Var.a;
            int i10 = 0;
            while (i10 < jArr.length - 2 && i10 < i9) {
                int i11 = i10 + 2;
                int i12 = i10;
                long j5 = jArr[i11];
                if ((((int) j5) & 67108863) == i8) {
                    long j6 = jArr[i12];
                    jArr[i12] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i12 + 1] = (i5 << 32) | (i6 & 4294967295L);
                    long j7 = 2305843009213693952L;
                    jArr[i11] = j5 | 2305843009213693952L;
                    if ((i3 - ((int) (j6 >> 32)) != 0) | (i4 - ((int) j6) != 0)) {
                        long j8 = -4503599560261633L;
                        char c2 = 26;
                        long[] jArr2 = (long[]) aj0Var.b;
                        long[] jArr3 = (long[]) aj0Var.c;
                        int i13 = aj0Var.a / 3;
                        jArr3[0] = (j5 & (-4503599560261633L)) | (((i12 + 3) & 67108863) << 26);
                        int i14 = 1;
                        while (i14 > 0) {
                            i14--;
                            long j9 = jArr3[i14];
                            int i15 = ((int) j9) & 67108863;
                            char c3 = c2;
                            long j10 = j8;
                            int i16 = ((int) (j9 >> c3)) & 67108863;
                            char c4 = '4';
                            int i17 = (int) (j9 >> 52);
                            char c5 = 511;
                            int i18 = i17 & 511;
                            int i19 = i18 == 511 ? i13 : i18 + i16;
                            if (i16 < 0) {
                                break;
                            }
                            while (i16 < jArr2.length - 2 && i16 < i19) {
                                int i20 = i16 + 2;
                                long j11 = jArr2[i20];
                                char c6 = c4;
                                int i21 = i19;
                                if ((((int) (j11 >> c3)) & 67108863) == i15) {
                                    long j12 = jArr2[i16];
                                    int i22 = i16 + 1;
                                    j = j7;
                                    long j13 = jArr2[i22];
                                    jArr2[i16] = ((((int) j12) + r10) & 4294967295L) | ((((int) (j12 >> 32)) + r7) << 32);
                                    jArr2[i22] = ((((int) j13) + r10) & 4294967295L) | ((((int) (j13 >> 32)) + r7) << 32);
                                    jArr2[i20] = j11 | j;
                                    c = 511;
                                    if ((((int) (j11 >> c6)) & 511) > 0) {
                                        jArr3[i14] = (((i16 + 3) & 67108863) << c3) | (j11 & j10);
                                        i14++;
                                    }
                                } else {
                                    j = j7;
                                    c = c5;
                                }
                                i16 += 3;
                                c5 = c;
                                c4 = c6;
                                i19 = i21;
                                j7 = j;
                            }
                            c2 = c3;
                            j8 = j10;
                            j7 = j7;
                        }
                    }
                    this.d = true;
                }
                i10 = i12 + 3;
            }
        }
        p10 n = p10Var.n();
        aj0Var.a(i7, i3, i4, i5, i6, n != null ? n.e : -1, ca0Var.h(1024), ca0Var.h(16));
        this.d = true;
    }

    public final void j(p10 p10Var) {
        int i = p10Var.e & 67108863;
        aj0 aj0Var = this.a;
        long[] jArr = (long[]) aj0Var.b;
        int i2 = aj0Var.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}
