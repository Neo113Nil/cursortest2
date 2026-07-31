package yads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class n23 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public n23(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public final void a(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] b(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x025e A[LOOP:4: B:52:0x004a->B:58:0x025e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e A[EDGE_INSN: B:59:0x018e->B:60:0x018e BREAK  A[LOOP:4: B:52:0x004a->B:58:0x025e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.m;
        float f = this.c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.e * f2;
        double d = f3;
        int i9 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            short[] sArr = this.j;
            int i10 = this.k;
            short[] b = b(this.l, i8, i10);
            this.l = b;
            int i11 = this.b;
            System.arraycopy(sArr, 0, b, this.m * i11, i11 * i10);
            this.m += i10;
            this.k = 0;
        } else {
            int i12 = this.k;
            if (i12 >= this.h) {
                int i13 = 0;
                while (true) {
                    int i14 = this.r;
                    if (i14 > 0) {
                        i3 = Math.min(this.h, i14);
                        short[] sArr2 = this.j;
                        short[] b2 = b(this.l, this.m, i3);
                        this.l = b2;
                        int i15 = this.b;
                        System.arraycopy(sArr2, i13 * i15, b2, this.m * i15, i15 * i3);
                        this.m += i3;
                        this.r -= i3;
                    } else {
                        short[] sArr3 = this.j;
                        int i16 = this.a;
                        int i17 = i16 > 4000 ? i16 / 4000 : i9;
                        if (this.b == i9 && i17 == i9) {
                            i = a(sArr3, i13, this.f, this.g);
                        } else {
                            a(sArr3, i13, i17);
                            int a = a(this.i, 0, this.f / i17, this.g / i17);
                            if (i17 != i9) {
                                int i18 = a * i17;
                                int i19 = i17 * 4;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                int i22 = this.f;
                                if (i20 < i22) {
                                    i20 = i22;
                                }
                                int i23 = this.g;
                                if (i21 > i23) {
                                    i21 = i23;
                                }
                                if (this.b == i9) {
                                    i = a(sArr3, i13, i20, i21);
                                } else {
                                    a(sArr3, i13, i9);
                                    i = a(this.i, 0, i20, i21);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i24 = this.u;
                        int i25 = (i24 == 0 || (i5 = this.s) == 0 || this.v > i24 * 3 || i24 * 2 <= this.t * 3) ? i : i5;
                        this.t = i24;
                        this.s = i;
                        if (d > 1.0d) {
                            short[] sArr4 = this.j;
                            if (f3 >= 2.0f) {
                                i4 = (int) (i25 / (f3 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f3) * i25) / (f3 - 1.0f));
                                i4 = i25;
                            }
                            short[] b3 = b(this.l, this.m, i4);
                            this.l = b3;
                            int i26 = i4;
                            a(i4, this.b, b3, this.m, sArr4, i13, sArr4, i13 + i25);
                            this.m += i26;
                            i13 = i25 + i26 + i13;
                            if (this.h + i13 <= i12) {
                                break;
                            } else {
                                i9 = 1;
                            }
                        } else {
                            int i27 = i25;
                            short[] sArr5 = this.j;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i27 * f3) / (1.0f - f3));
                            } else {
                                this.r = (int) ((((2.0f * f3) - 1.0f) * i27) / (1.0f - f3));
                                i2 = i27;
                            }
                            int i28 = i27 + i2;
                            short[] b4 = b(this.l, this.m, i28);
                            this.l = b4;
                            int i29 = this.b;
                            System.arraycopy(sArr5, i13 * i29, b4, this.m * i29, i29 * i27);
                            i3 = i2;
                            a(i3, this.b, this.l, this.m + i27, sArr5, i13 + i27, sArr5, i13);
                            this.m += i28;
                        }
                    }
                    i13 += i3;
                    if (this.h + i13 <= i12) {
                    }
                }
                int i30 = this.k - i13;
                short[] sArr6 = this.j;
                int i31 = this.b;
                System.arraycopy(sArr6, i13 * i31, sArr6, 0, i31 * i30);
                this.k = i30;
            }
        }
        if (f4 == 1.0f || this.m == i8) {
            return;
        }
        int i32 = this.a;
        int i33 = (int) (i32 / f4);
        while (true) {
            if (i33 <= 16384 && i32 <= 16384) {
                break;
            }
            i33 /= 2;
            i32 /= 2;
        }
        int i34 = this.m - i8;
        short[] b5 = b(this.n, this.o, i34);
        this.n = b5;
        short[] sArr7 = this.l;
        int i35 = this.b;
        System.arraycopy(sArr7, i8 * i35, b5, this.o * i35, i35 * i34);
        this.m = i8;
        this.o += i34;
        int i36 = 0;
        while (true) {
            int i37 = this.o;
            int i38 = i37 - 1;
            if (i36 >= i38) {
                if (i38 == 0) {
                    return;
                }
                short[] sArr8 = this.n;
                int i39 = this.b;
                System.arraycopy(sArr8, i38 * i39, sArr8, 0, (i37 - i38) * i39);
                this.o -= i38;
                return;
            }
            while (true) {
                i6 = this.p + 1;
                int i40 = i6 * i33;
                i7 = this.q;
                if (i40 <= i7 * i32) {
                    break;
                }
                this.l = b(this.l, this.m, 1);
                int i41 = 0;
                while (true) {
                    int i42 = this.b;
                    if (i41 < i42) {
                        short[] sArr9 = this.l;
                        int i43 = (this.m * i42) + i41;
                        short[] sArr10 = this.n;
                        int i44 = (i36 * i42) + i41;
                        short s = sArr10[i44];
                        short s2 = sArr10[i44 + i42];
                        int i45 = this.q * i32;
                        int i46 = this.p;
                        int i47 = i46 * i33;
                        int i48 = (i46 + 1) * i33;
                        int i49 = i48 - i45;
                        int i50 = i48 - i47;
                        sArr9[i43] = (short) ((((i50 - i49) * s2) + (s * i49)) / i50);
                        i41++;
                    }
                }
                this.q++;
                this.m++;
            }
            this.p = i6;
            if (i6 == i32) {
                this.p = 0;
                if (i7 == i33) {
                    this.q = 0;
                } else {
                    throw new IllegalStateException();
                }
            }
            i36++;
        }
    }

    public static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
