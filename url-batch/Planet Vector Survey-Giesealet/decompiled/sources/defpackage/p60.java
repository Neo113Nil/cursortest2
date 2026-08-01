package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p60 extends zy {
    public int f;

    public p60(int i) {
        this.a = vn0.a;
        this.b = hz.a;
        this.c = nz.g;
        if (i >= 0) {
            f(vn0.d(i));
        } else {
            g8.r("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != vn0.a) {
            p8.Y(jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        p8.X(this.c, 0, this.d);
        this.f = vn0.a(this.d) - this.e;
    }

    public final int d(int i) {
        long j;
        int i2;
        int i3;
        long j2;
        long[] jArr;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        int i7 = -862048943;
        int i8 = i * (-862048943);
        int i9 = i8 ^ (i8 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            int i18 = i14;
            int i19 = 0;
            long j3 = (((-i16) >> 63) & (jArr3[i15 + 1] << (64 - i16))) | (jArr3[i15] >>> i16);
            long j4 = i11;
            int i20 = i7;
            int i21 = i11;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j7) >> 3)) & i12;
                long j8 = j6;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                j6 = j8;
            }
            long j9 = j6;
            if ((((~j3) << 6) & j3 & j9) != 0) {
                int e = e(i10);
                long j10 = 255;
                if (this.f != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    i3 = 0;
                    j2 = 128;
                } else {
                    int i22 = this.d;
                    if (i22 > 8) {
                        j2 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i23 = this.d;
                            int[] iArr = this.b;
                            Object[] objArr = this.c;
                            int i24 = (i23 + 7) >> 3;
                            int i25 = 0;
                            while (i25 < i24) {
                                long j11 = j10;
                                long j12 = jArr4[i25] & j9;
                                jArr4[i25] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i25++;
                                i24 = i24;
                                j10 = j11;
                            }
                            j = j10;
                            int a0 = p8.a0(jArr4);
                            int i26 = a0 - 1;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[a0] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i23) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j13 = (jArr4[i28] >> i29) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int i30 = iArr[i27] * i20;
                                    int i31 = (i30 ^ (i30 << 16)) >>> 7;
                                    int e2 = e(i31);
                                    int i32 = i31 & i23;
                                    int i33 = i20;
                                    if (((e2 - i32) & i23) / 8 == ((i27 - i32) & i23) / 8) {
                                        int i34 = i17;
                                        int i35 = i19;
                                        jArr4[i28] = ((r11 & 127) << i29) | (jArr4[i28] & (~(j << i29)));
                                        jArr4[jArr4.length - i34] = (jArr4[i35] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27++;
                                        i17 = i34;
                                        i20 = i33;
                                        i19 = i35;
                                    } else {
                                        int i36 = i17;
                                        int i37 = i19;
                                        int i38 = e2 >> 3;
                                        long j14 = jArr4[i38];
                                        int i39 = (e2 & 7) << 3;
                                        if (((j14 >> i39) & j) == 128) {
                                            i4 = i36;
                                            i5 = i23;
                                            int i40 = i27;
                                            jArr4[i38] = (j14 & (~(j << i39))) | ((r11 & 127) << i39);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            iArr[e2] = iArr[i40];
                                            iArr[i40] = i37;
                                            objArr[e2] = objArr[i40];
                                            objArr[i40] = null;
                                            i6 = i40;
                                        } else {
                                            int i41 = i27;
                                            i4 = i36;
                                            i5 = i23;
                                            jArr4[i38] = ((r11 & 127) << i39) | (j14 & (~(j << i39)));
                                            int i42 = iArr[e2];
                                            iArr[e2] = iArr[i41];
                                            iArr[i41] = i42;
                                            Object obj = objArr[e2];
                                            objArr[e2] = objArr[i41];
                                            objArr[i41] = obj;
                                            i6 = i41 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i37] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27 = i6 + 1;
                                        i23 = i5;
                                        i20 = i33;
                                        i19 = i37;
                                        i17 = i4;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            i2 = i17;
                            i3 = i19;
                            this.f = vn0.a(this.d) - this.e;
                            e = e(i10);
                        }
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    i2 = 1;
                    i3 = 0;
                    int b = vn0.b(this.d);
                    long[] jArr5 = this.a;
                    int[] iArr2 = this.b;
                    Object[] objArr2 = this.c;
                    int i43 = this.d;
                    f(b);
                    long[] jArr6 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i44 = this.d;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j2) {
                            int i46 = iArr2[i45];
                            int i47 = i46 * i20;
                            int i48 = i47 ^ (i47 << 16);
                            int e3 = e(i48 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i48 & 127;
                            int i49 = e3 >> 3;
                            int i50 = (e3 & 7) << 3;
                            long j16 = (jArr[i49] & (~(255 << i50))) | (j15 << i50);
                            jArr[i49] = j16;
                            jArr[(((e3 - 7) & i44) + (i44 & 7)) >> 3] = j16;
                            iArr3[e3] = i46;
                            objArr3[e3] = objArr2[i45];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i10);
                }
                this.e++;
                int i51 = this.f;
                long[] jArr7 = this.a;
                int i52 = e >> 3;
                long j17 = jArr7[i52];
                int i53 = (e & 7) << 3;
                if (((j17 >> i53) & j) == j2) {
                    i3 = i2;
                }
                this.f = i51 - i3;
                int i54 = this.d;
                long j18 = (j17 & (~(j << i53))) | (j4 << i53);
                jArr7[i52] = j18;
                jArr7[(((e - 7) & i54) + (i54 & 7)) >> 3] = j18;
                return e;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
            i11 = i21;
            i7 = i20;
        }
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, vn0.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = vn0.a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            p8.Y(jArr);
        }
        this.a = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = vn0.a(this.d) - this.e;
        this.b = new int[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i) {
        int i2;
        int i3 = (-862048943) * i;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i11 = this.d;
        int i12 = i2 >> 3;
        int i13 = (i2 & 7) << 3;
        long j4 = (jArr2[i12] & (~(255 << i13))) | (254 << i13);
        jArr2[i12] = j4;
        jArr2[(((i2 - 7) & i11) + (i11 & 7)) >> 3] = j4;
        Object[] objArr = this.c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void h(int i, Object obj) {
        int d = d(i);
        this.b[d] = i;
        this.c[d] = obj;
    }

    public /* synthetic */ p60() {
        this(6);
    }
}
