package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class w {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final short[] f;
    public int g;
    public short[] h;
    public int i;
    public short[] j;
    public int k;
    public short[] l;
    public int q;
    public int r;
    public int s;
    public int t;
    public int v;
    public int w;
    public int x;
    public int m = 0;
    public int n = 0;
    public int u = 0;
    public float o = 1.0f;
    public float p = 1.0f;

    public w(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i / 400;
        int i3 = i / 65;
        this.d = i3;
        int i4 = i3 * 2;
        this.e = i4;
        this.f = new short[i4];
        this.g = i4;
        int i5 = i2 * i4;
        this.h = new short[i5];
        this.i = i4;
        this.j = new short[i5];
        this.k = i4;
        this.l = new short[i5];
    }

    public final void a(int i) {
        int i2 = this.q + i;
        int i3 = this.g;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.g = i4;
            this.h = Arrays.copyOf(this.h, i4 * this.b);
        }
    }

    public final void b(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.i = i4;
            this.j = Arrays.copyOf(this.j, i4 * this.b);
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f[i7] = (short) (i8 / i5);
        }
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
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
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
        this.w = i6 / i7;
        this.x = i8 / i5;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x024b A[LOOP:4: B:54:0x0045->B:60:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172 A[EDGE_INSN: B:61:0x0172->B:62:0x0172 BREAK  A[LOOP:4: B:54:0x0045->B:60:0x024b], SYNTHETIC] */
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
        int i8 = this.r;
        float f = this.o / this.p;
        double d = f;
        int i9 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            short[] sArr = this.h;
            int i10 = this.q;
            b(i10);
            int i11 = this.b;
            System.arraycopy(sArr, 0, this.j, this.r * i11, i11 * i10);
            this.r += i10;
            this.q = 0;
        } else {
            int i12 = this.q;
            if (i12 >= this.e) {
                int i13 = 0;
                while (true) {
                    int i14 = this.t;
                    if (i14 > 0) {
                        i3 = Math.min(this.e, i14);
                        short[] sArr2 = this.h;
                        b(i3);
                        int i15 = this.b;
                        System.arraycopy(sArr2, i13 * i15, this.j, this.r * i15, i15 * i3);
                        this.r += i3;
                        this.t -= i3;
                    } else {
                        short[] sArr3 = this.h;
                        int i16 = this.a;
                        int i17 = i16 > 4000 ? i16 / 4000 : i9;
                        if (this.b == i9 && i17 == i9) {
                            i = a(sArr3, i13, this.c, this.d);
                        } else {
                            a(sArr3, i13, i17);
                            int a = a(this.f, 0, this.c / i17, this.d / i17);
                            if (i17 != i9) {
                                int i18 = a * i17;
                                int i19 = i17 * 4;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                int i22 = this.c;
                                if (i20 < i22) {
                                    i20 = i22;
                                }
                                int i23 = this.d;
                                if (i21 > i23) {
                                    i21 = i23;
                                }
                                if (this.b == i9) {
                                    i = a(sArr3, i13, i20, i21);
                                } else {
                                    a(sArr3, i13, i9);
                                    i = a(this.f, 0, i20, i21);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i24 = this.w;
                        int i25 = (i24 == 0 || (i5 = this.u) == 0 || this.x > i24 * 3 || i24 * 2 <= this.v * 3) ? i : i5;
                        this.v = i24;
                        this.u = i;
                        if (d > 1.0d) {
                            short[] sArr4 = this.h;
                            if (f >= 2.0f) {
                                i4 = (int) (i25 / (f - 1.0f));
                            } else {
                                this.t = (int) (((2.0f - f) * i25) / (f - 1.0f));
                                i4 = i25;
                            }
                            b(i4);
                            int i26 = i4;
                            a(i4, this.b, this.j, this.r, sArr4, i13, sArr4, i13 + i25);
                            this.r += i26;
                            i13 = i25 + i26 + i13;
                            if (this.e + i13 <= i12) {
                                break;
                            } else {
                                i9 = 1;
                            }
                        } else {
                            int i27 = i25;
                            short[] sArr5 = this.h;
                            if (f < 0.5f) {
                                i2 = (int) ((i27 * f) / (1.0f - f));
                            } else {
                                this.t = (int) ((((2.0f * f) - 1.0f) * i27) / (1.0f - f));
                                i2 = i27;
                            }
                            int i28 = i27 + i2;
                            b(i28);
                            int i29 = this.b;
                            System.arraycopy(sArr5, i13 * i29, this.j, this.r * i29, i29 * i27);
                            i3 = i2;
                            a(i3, this.b, this.j, this.r + i27, sArr5, i27 + i13, sArr5, i13);
                            this.r += i28;
                        }
                    }
                    i13 += i3;
                    if (this.e + i13 <= i12) {
                    }
                }
                int i30 = this.q - i13;
                short[] sArr6 = this.h;
                int i31 = this.b;
                System.arraycopy(sArr6, i13 * i31, sArr6, 0, i31 * i30);
                this.q = i30;
            }
        }
        float f2 = this.p;
        if (f2 == 1.0f || this.r == i8) {
            return;
        }
        int i32 = this.a;
        int i33 = (int) (i32 / f2);
        while (true) {
            if (i33 <= 16384 && i32 <= 16384) {
                break;
            }
            i33 /= 2;
            i32 /= 2;
        }
        int i34 = this.r - i8;
        int i35 = this.s + i34;
        int i36 = this.k;
        if (i35 > i36) {
            int i37 = (i36 / 2) + i34 + i36;
            this.k = i37;
            this.l = Arrays.copyOf(this.l, i37 * this.b);
        }
        short[] sArr7 = this.j;
        int i38 = this.b;
        System.arraycopy(sArr7, i8 * i38, this.l, this.s * i38, i38 * i34);
        this.r = i8;
        this.s += i34;
        int i39 = 0;
        while (true) {
            int i40 = this.s;
            int i41 = i40 - 1;
            if (i39 >= i41) {
                if (i41 == 0) {
                    return;
                }
                short[] sArr8 = this.l;
                int i42 = this.b;
                System.arraycopy(sArr8, i41 * i42, sArr8, 0, (i40 - i41) * i42);
                this.s -= i41;
                return;
            }
            while (true) {
                i6 = this.m + 1;
                int i43 = i6 * i33;
                i7 = this.n;
                if (i43 <= i7 * i32) {
                    break;
                }
                b(1);
                int i44 = 0;
                while (true) {
                    int i45 = this.b;
                    if (i44 < i45) {
                        short[] sArr9 = this.j;
                        int i46 = (this.r * i45) + i44;
                        short[] sArr10 = this.l;
                        int i47 = (i39 * i45) + i44;
                        short s = sArr10[i47];
                        short s2 = sArr10[i47 + i45];
                        int i48 = this.n * i32;
                        int i49 = this.m;
                        int i50 = i49 * i33;
                        int i51 = (i49 + 1) * i33;
                        int i52 = i51 - i48;
                        int i53 = i51 - i50;
                        sArr9[i46] = (short) ((((i53 - i52) * s2) + (s * i52)) / i53);
                        i44++;
                    }
                }
                this.n++;
                this.r++;
            }
            this.m = i6;
            if (i6 == i32) {
                this.m = 0;
                if (i7 == i33) {
                    this.n = 0;
                } else {
                    throw new IllegalStateException();
                }
            }
            i39++;
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
