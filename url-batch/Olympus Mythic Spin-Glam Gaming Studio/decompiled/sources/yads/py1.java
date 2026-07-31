package yads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class py1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static int a(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oy1 b(byte[] bArr, int i, int i2) {
        int d2;
        boolean c2;
        int i3;
        boolean z;
        boolean c3;
        float f;
        float f2;
        int b2;
        int i4;
        yb2 yb2Var = new yb2(bArr, i + 1, i2);
        int b3 = yb2Var.b(8);
        int b4 = yb2Var.b(8);
        int b5 = yb2Var.b(8);
        int d3 = yb2Var.d();
        if (b3 == 100 || b3 == 110 || b3 == 122 || b3 == 244 || b3 == 44 || b3 == 83 || b3 == 86 || b3 == 118 || b3 == 128 || b3 == 138) {
            d2 = yb2Var.d();
            c2 = d2 == 3 ? yb2Var.c() : false;
            yb2Var.d();
            yb2Var.d();
            yb2Var.f();
            if (yb2Var.c()) {
                int i5 = d2 != 3 ? 8 : 12;
                int i6 = 0;
                while (i6 < i5) {
                    if (yb2Var.c()) {
                        int i7 = i6 < 6 ? 16 : 64;
                        int i8 = 8;
                        int i9 = 8;
                        for (int i10 = 0; i10 < i7; i10++) {
                            if (i8 != 0) {
                                i8 = ((yb2Var.e() + i9) + 256) % 256;
                            }
                            if (i8 != 0) {
                                i9 = i8;
                            }
                        }
                    }
                    i6++;
                }
            }
        } else {
            d2 = 1;
            c2 = false;
        }
        int d4 = yb2Var.d() + 4;
        int d5 = yb2Var.d();
        if (d5 == 0) {
            i3 = yb2Var.d() + 4;
        } else {
            if (d5 == 1) {
                boolean c4 = yb2Var.c();
                yb2Var.e();
                yb2Var.e();
                long d6 = yb2Var.d();
                for (int i11 = 0; i11 < d6; i11++) {
                    yb2Var.d();
                }
                z = c4;
                i3 = 0;
                yb2Var.d();
                yb2Var.f();
                int d7 = yb2Var.d() + 1;
                int d8 = yb2Var.d() + 1;
                c3 = yb2Var.c();
                int i12 = 2 - (c3 ? 1 : 0);
                int i13 = d8 * i12;
                if (!c3) {
                    yb2Var.f();
                }
                yb2Var.f();
                int i14 = d7 * 16;
                int i15 = i13 * 16;
                if (yb2Var.c()) {
                    int d9 = yb2Var.d();
                    int d10 = yb2Var.d();
                    int d11 = yb2Var.d();
                    int d12 = yb2Var.d();
                    if (d2 == 0) {
                        i4 = 1;
                    } else {
                        int i16 = d2 == 3 ? 1 : 2;
                        i12 *= d2 == 1 ? 2 : 1;
                        i4 = i16;
                    }
                    i14 -= (d9 + d10) * i4;
                    i15 -= (d11 + d12) * i12;
                }
                int i17 = i15;
                if (yb2Var.c() && yb2Var.c()) {
                    b2 = yb2Var.b(8);
                    if (b2 != 255) {
                        int b6 = yb2Var.b(16);
                        int b7 = yb2Var.b(16);
                        if (b6 != 0 && b7 != 0) {
                            f2 = b6 / b7;
                            return new oy1(b3, b4, b5, d3, i14, i17, f2, c2, c3, d4, d5, i3, z);
                        }
                    } else {
                        float[] fArr = b;
                        if (b2 < 17) {
                            f = fArr[b2];
                            f2 = f;
                            return new oy1(b3, b4, b5, d3, i14, i17, f2, c2, c3, d4, d5, i3, z);
                        }
                        mf1.a(b2, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                f = 1.0f;
                f2 = f;
                return new oy1(b3, b4, b5, d3, i14, i17, f2, c2, c3, d4, d5, i3, z);
            }
            i3 = 0;
        }
        z = false;
        yb2Var.d();
        yb2Var.f();
        int d72 = yb2Var.d() + 1;
        int d82 = yb2Var.d() + 1;
        c3 = yb2Var.c();
        int i122 = 2 - (c3 ? 1 : 0);
        int i132 = d82 * i122;
        if (!c3) {
        }
        yb2Var.f();
        int i142 = d72 * 16;
        int i152 = i132 * 16;
        if (yb2Var.c()) {
        }
        int i172 = i152;
        if (yb2Var.c()) {
            b2 = yb2Var.b(8);
            if (b2 != 255) {
            }
        }
        f = 1.0f;
        f2 = f;
        return new oy1(b3, b4, b5, d3, i142, i172, f2, c2, c3, d4, d5, i3, z);
    }

    public static my1 a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        boolean z;
        int[] iArr2;
        yb2 yb2Var = new yb2(bArr, i + 2, i2);
        int i7 = 4;
        yb2Var.d(4);
        int b2 = yb2Var.b(3);
        yb2Var.f();
        int b3 = yb2Var.b(2);
        boolean c2 = yb2Var.c();
        int b4 = yb2Var.b(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (yb2Var.c()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr3 = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr3[i11] = yb2Var.b(8);
        }
        int b5 = yb2Var.b(8);
        int i12 = 0;
        for (int i13 = 0; i13 < b2; i13++) {
            if (yb2Var.c()) {
                i12 += 89;
            }
            if (yb2Var.c()) {
                i12 += 8;
            }
        }
        yb2Var.d(i12);
        if (b2 > 0) {
            yb2Var.d((8 - b2) * 2);
        }
        yb2Var.d();
        int d2 = yb2Var.d();
        if (d2 == 3) {
            yb2Var.f();
        }
        int d3 = yb2Var.d();
        int d4 = yb2Var.d();
        if (yb2Var.c()) {
            int d5 = yb2Var.d();
            int d6 = yb2Var.d();
            int d7 = yb2Var.d();
            int d8 = yb2Var.d();
            d3 -= (d5 + d6) * ((d2 == 1 || d2 == 2) ? 2 : 1);
            d4 -= (d7 + d8) * (d2 == 1 ? 2 : 1);
        }
        int i14 = d4;
        int i15 = d3;
        yb2Var.d();
        yb2Var.d();
        int d9 = yb2Var.d();
        for (int i16 = yb2Var.c() ? 0 : b2; i16 <= b2; i16++) {
            yb2Var.d();
            yb2Var.d();
            yb2Var.d();
        }
        yb2Var.d();
        yb2Var.d();
        yb2Var.d();
        yb2Var.d();
        yb2Var.d();
        yb2Var.d();
        if (yb2Var.c() && yb2Var.c()) {
            int i17 = 0;
            while (i17 < i7) {
                int i18 = 0;
                while (i18 < i10) {
                    if (!yb2Var.c()) {
                        yb2Var.d();
                    } else {
                        int min = Math.min(64, 1 << ((i17 << 1) + 4));
                        if (i17 > 1) {
                            yb2Var.e();
                        }
                        for (int i19 = 0; i19 < min; i19++) {
                            yb2Var.e();
                        }
                    }
                    i18 += i17 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i17++;
                i7 = 4;
                i10 = 6;
            }
        }
        yb2Var.d(2);
        if (yb2Var.c()) {
            yb2Var.d(8);
            yb2Var.d();
            yb2Var.d();
            yb2Var.f();
        }
        int d10 = yb2Var.d();
        int[] iArr4 = new int[0];
        int[] iArr5 = new int[0];
        int i20 = -1;
        int i21 = 0;
        int i22 = -1;
        while (i21 < d10) {
            if (i21 != 0 && yb2Var.c()) {
                int i23 = i20 + i22;
                int d11 = (1 - ((yb2Var.c() ? 1 : 0) * 2)) * (yb2Var.d() + 1);
                i3 = d10;
                int i24 = i23 + 1;
                i6 = b5;
                boolean[] zArr = new boolean[i24];
                iArr = iArr3;
                for (int i25 = 0; i25 <= i23; i25++) {
                    if (!yb2Var.c()) {
                        zArr[i25] = yb2Var.c();
                    } else {
                        zArr[i25] = true;
                    }
                }
                int[] iArr6 = new int[i24];
                int[] iArr7 = new int[i24];
                int i26 = 0;
                for (int i27 = i22 - 1; i27 >= 0; i27--) {
                    int i28 = iArr5[i27] + d11;
                    if (i28 < 0 && zArr[i20 + i27]) {
                        iArr6[i26] = i28;
                        i26++;
                    }
                }
                if (d11 < 0 && zArr[i23]) {
                    iArr6[i26] = d11;
                    i26++;
                }
                i5 = i8;
                int i29 = i26;
                i4 = b4;
                for (int i30 = 0; i30 < i20; i30++) {
                    int i31 = iArr4[i30] + d11;
                    if (i31 < 0 && zArr[i30]) {
                        iArr6[i29] = i31;
                        i29++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr6, i29);
                int i32 = 0;
                for (int i33 = i20 - 1; i33 >= 0; i33--) {
                    int i34 = iArr4[i33] + d11;
                    if (i34 > 0 && zArr[i33]) {
                        iArr7[i32] = i34;
                        i32++;
                    }
                }
                if (d11 > 0 && zArr[i23]) {
                    iArr7[i32] = d11;
                    i32++;
                }
                int i35 = i32;
                for (int i36 = 0; i36 < i22; i36++) {
                    int i37 = iArr5[i36] + d11;
                    if (i37 > 0 && zArr[i20 + i36]) {
                        iArr7[i35] = i37;
                        i35++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr7, i35);
                i22 = i35;
                iArr4 = copyOf;
                i20 = i29;
                z = true;
            } else {
                i3 = d10;
                i4 = b4;
                i5 = i8;
                iArr = iArr3;
                i6 = b5;
                int d12 = yb2Var.d();
                i22 = yb2Var.d();
                iArr4 = new int[d12];
                for (int i38 = 0; i38 < d12; i38++) {
                    iArr4[i38] = yb2Var.d() + 1;
                    yb2Var.f();
                }
                z = true;
                int[] iArr8 = new int[i22];
                for (int i39 = 0; i39 < i22; i39++) {
                    iArr8[i39] = yb2Var.d() + 1;
                    yb2Var.f();
                }
                i20 = d12;
                iArr2 = iArr8;
            }
            i21++;
            b5 = i6;
            iArr3 = iArr;
            i8 = i5;
            b4 = i4;
            iArr5 = iArr2;
            d10 = i3;
        }
        int i40 = b4;
        int i41 = i8;
        int[] iArr9 = iArr3;
        int i42 = b5;
        if (yb2Var.c()) {
            for (int i43 = 0; i43 < yb2Var.d(); i43++) {
                yb2Var.d(d9 + 5);
            }
        }
        yb2Var.d(2);
        float f = 1.0f;
        if (yb2Var.c()) {
            if (yb2Var.c()) {
                int b6 = yb2Var.b(8);
                if (b6 == 255) {
                    int b7 = yb2Var.b(16);
                    int b8 = yb2Var.b(16);
                    if (b7 != 0 && b8 != 0) {
                        f = b7 / b8;
                    }
                } else {
                    float[] fArr = b;
                    if (b6 < 17) {
                        f = fArr[b6];
                    } else {
                        mf1.a(b6, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
            }
            if (yb2Var.c()) {
                yb2Var.f();
            }
            if (yb2Var.c()) {
                yb2Var.d(4);
                if (yb2Var.c()) {
                    yb2Var.d(24);
                }
            }
            if (yb2Var.c()) {
                yb2Var.d();
                yb2Var.d();
            }
            yb2Var.f();
            if (yb2Var.c()) {
                i14 *= 2;
            }
        }
        return new my1(b3, c2, i40, i41, iArr9, i42, i15, i14, f);
    }

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalStateException();
        }
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
