package o;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class GD {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public GD(int i) {
        this.a = UP.a;
        this.b = AbstractC1473m3.d;
        this.c = AbstractC1393kt.a;
        if (i >= 0) {
            d(UP.f(i));
        } else {
            AbstractC0773bP.l("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
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

    public final int b(Object obj) {
        long j;
        long j2;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = 1;
            long j3 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j4 = i5;
            int i12 = i5;
            int i13 = 0;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j6 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                int i14 = i2;
                if (AbstractC0048Bt.h(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j6 &= j6 - 1;
                i2 = i14;
            }
            int i15 = i2;
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int a = a(i4);
                long j7 = 128;
                long j8 = 255;
                if (this.f != 0 || ((this.a[a >> 3] >> ((a & 7) << 3)) & 255) == 254) {
                    j = 128;
                    j2 = 255;
                } else {
                    int i16 = this.d;
                    if (i16 <= 8 || Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE) > 0) {
                        j = 128;
                        j2 = 255;
                        int d = UP.d(this.d);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.b;
                        int[] iArr = this.c;
                        int i17 = this.d;
                        d(d);
                        long[] jArr5 = this.a;
                        Object[] objArr3 = this.b;
                        int[] iArr2 = this.c;
                        int i18 = this.d;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr4[i19 >> 3] >> ((i19 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i19];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : i13) * i15;
                                int i20 = hashCode2 ^ (hashCode2 << 16);
                                int a2 = a(i20 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j9 = i20 & 127;
                                int i21 = a2 >> 3;
                                int i22 = (a2 & 7) << 3;
                                long j10 = (jArr[i21] & (~(255 << i22))) | (j9 << i22);
                                jArr[i21] = j10;
                                jArr[(((a2 - 7) & i18) + (i18 & 7)) >> 3] = j10;
                                objArr3[a2] = obj2;
                                iArr2[a2] = iArr[i19];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i19++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                            i13 = 0;
                        }
                    } else {
                        long[] jArr6 = this.a;
                        int i23 = this.d;
                        Object[] objArr4 = this.b;
                        int[] iArr3 = this.c;
                        UP.a(jArr6, i23);
                        int i24 = 0;
                        int i25 = -1;
                        while (i24 != i23) {
                            int i26 = i24 >> 3;
                            int i27 = (i24 & 7) << 3;
                            long j11 = (jArr6[i26] >> i27) & j8;
                            if (j11 == j7) {
                                int i28 = i24;
                                i24++;
                                i25 = i28;
                            } else if (j11 != 254) {
                                i24++;
                            } else {
                                Object obj3 = objArr4[i24];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i15;
                                long j12 = j7;
                                int i29 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int a3 = a(i29);
                                int i30 = i29 & i23;
                                long j13 = j8;
                                if (((a3 - i30) & i23) / 8 == ((i24 - i30) & i23) / 8) {
                                    jArr6[i26] = ((r24 & 127) << i27) | (jArr6[i26] & (~(j13 << i27)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i24++;
                                    j7 = j12;
                                    j8 = j13;
                                } else {
                                    int i31 = i24;
                                    int i32 = a3 >> 3;
                                    long j14 = jArr6[i32];
                                    int i33 = (a3 & 7) << 3;
                                    if (((j14 >> i33) & j13) == j12) {
                                        objArr = objArr4;
                                        jArr6[i32] = ((~(j13 << i33)) & j14) | ((r24 & 127) << i33);
                                        jArr6[i26] = (jArr6[i26] & (~(j13 << i27))) | (j12 << i27);
                                        objArr[a3] = objArr[i31];
                                        objArr[i31] = null;
                                        iArr3[a3] = iArr3[i31];
                                        iArr3[i31] = 0;
                                        i25 = i31;
                                        i = i25;
                                    } else {
                                        objArr = objArr4;
                                        jArr6[i32] = ((~(j13 << i33)) & j14) | ((r24 & 127) << i33);
                                        if (i25 == -1) {
                                            i25 = UP.b(jArr6, i31 + 1, i23);
                                        }
                                        objArr[i25] = objArr[a3];
                                        objArr[a3] = objArr[i31];
                                        objArr[i31] = objArr[i25];
                                        iArr3[i25] = iArr3[a3];
                                        iArr3[a3] = iArr3[i31];
                                        iArr3[i31] = iArr3[i25];
                                        i = i31 - 1;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    objArr4 = objArr;
                                    j8 = j13;
                                    i24 = i + 1;
                                    j7 = j12;
                                }
                            }
                        }
                        j = j7;
                        j2 = j8;
                        this.f = UP.c(this.d) - this.e;
                    }
                    a = a(i4);
                }
                this.e++;
                int i34 = this.f;
                long[] jArr7 = this.a;
                int i35 = a >> 3;
                long j15 = jArr7[i35];
                int i36 = (a & 7) << 3;
                if (((j15 >> i36) & j2) != j) {
                    i11 = 0;
                }
                this.f = i34 - i11;
                int i37 = this.d;
                long j16 = (j15 & (~(j2 << i36))) | (j4 << i36);
                jArr7[i35] = j16;
                jArr7[(((a - 7) & i37) + (i37 & 7)) >> 3] = j16;
                return ~a;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i12;
            i2 = i15;
        }
    }

    public final int c(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (AbstractC0048Bt.h(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, UP.e(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = UP.a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            P6.h0(jArr);
        }
        this.a = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = UP.c(this.d) - this.e;
        this.b = new Object[max];
        this.c = new int[max];
    }

    public final void e(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GD) {
            GD gd = (GD) obj;
            if (gd.e == this.e) {
                Object[] objArr = this.b;
                int[] iArr = this.c;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = objArr[i4];
                                int i5 = iArr[i4];
                                int c = gd.c(obj2);
                                if (c < 0) {
                                    throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                                }
                                if (i5 != gd.c[c]) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return true;
                        }
                    }
                    if (i == length) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ GD() {
        this(6);
    }
}
