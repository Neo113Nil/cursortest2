package o;

/* loaded from: classes.dex */
public final class MD {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public MD(int i) {
        this.a = UP.a;
        Object[] objArr = AbstractC1473m3.d;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            f(UP.f(i));
        } else {
            AbstractC0773bP.l("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != UP.a) {
            P6.h0(jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        P6.g0(this.c, 0, this.d);
        P6.g0(this.b, 0, this.d);
        this.f = UP.c(this.d) - this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (AbstractC0048Bt.h(this.b[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final int c(int i) {
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

    public final int d(Object obj) {
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
                int c = c(i4);
                long j7 = 128;
                long j8 = 255;
                if (this.f != 0 || ((this.a[c >> 3] >> ((c & 7) << 3)) & 255) == 254) {
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
                        Object[] objArr3 = this.c;
                        int i17 = this.d;
                        f(d);
                        long[] jArr5 = this.a;
                        Object[] objArr4 = this.b;
                        Object[] objArr5 = this.c;
                        int i18 = this.d;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr4[i19 >> 3] >> ((i19 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i19];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : i13) * i15;
                                int i20 = hashCode2 ^ (hashCode2 << 16);
                                int c2 = c(i20 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j9 = i20 & 127;
                                int i21 = c2 >> 3;
                                int i22 = (c2 & 7) << 3;
                                long j10 = (jArr[i21] & (~(255 << i22))) | (j9 << i22);
                                jArr[i21] = j10;
                                jArr[(((c2 - 7) & i18) + (i18 & 7)) >> 3] = j10;
                                objArr4[c2] = obj2;
                                objArr5[c2] = objArr3[i19];
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
                        Object[] objArr6 = this.b;
                        Object[] objArr7 = this.c;
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
                                Object obj3 = objArr6[i24];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i15;
                                long j12 = j7;
                                int i29 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int c3 = c(i29);
                                int i30 = i29 & i23;
                                long j13 = j8;
                                if (((c3 - i30) & i23) / 8 == ((i24 - i30) & i23) / 8) {
                                    jArr6[i26] = ((r22 & 127) << i27) | (jArr6[i26] & (~(j13 << i27)));
                                    jArr6[jArr6.length - 1] = jArr6[0];
                                    i24++;
                                    j7 = j12;
                                    j8 = j13;
                                } else {
                                    int i31 = i24;
                                    int i32 = c3 >> 3;
                                    long j14 = jArr6[i32];
                                    int i33 = (c3 & 7) << 3;
                                    if (((j14 >> i33) & j13) == j12) {
                                        objArr = objArr6;
                                        jArr6[i32] = ((~(j13 << i33)) & j14) | ((r22 & 127) << i33);
                                        jArr6[i26] = (jArr6[i26] & (~(j13 << i27))) | (j12 << i27);
                                        objArr[c3] = objArr[i31];
                                        objArr[i31] = null;
                                        objArr7[c3] = objArr7[i31];
                                        objArr7[i31] = null;
                                        i25 = i31;
                                        i = i25;
                                    } else {
                                        objArr = objArr6;
                                        jArr6[i32] = ((~(j13 << i33)) & j14) | ((r22 & 127) << i33);
                                        if (i25 == -1) {
                                            i25 = UP.b(jArr6, i31 + 1, i23);
                                        }
                                        objArr[i25] = objArr[c3];
                                        objArr[c3] = objArr[i31];
                                        objArr[i31] = objArr[i25];
                                        objArr7[i25] = objArr7[c3];
                                        objArr7[c3] = objArr7[i31];
                                        objArr7[i31] = objArr7[i25];
                                        i = i31 - 1;
                                    }
                                    jArr6[jArr6.length - 1] = jArr6[0];
                                    objArr6 = objArr;
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
                    c = c(i4);
                }
                this.e++;
                int i34 = this.f;
                long[] jArr7 = this.a;
                int i35 = c >> 3;
                long j15 = jArr7[i35];
                int i36 = (c & 7) << 3;
                if (((j15 >> i36) & j2) != j) {
                    i11 = 0;
                }
                this.f = i34 - i11;
                int i37 = this.d;
                long j16 = (j15 & (~(j2 << i36))) | (j4 << i36);
                jArr7[i35] = j16;
                jArr7[(((c - 7) & i37) + (i37 & 7)) >> 3] = j16;
                return ~c;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i12;
            i2 = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (AbstractC0048Bt.h(this.b[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MD)) {
            return false;
        }
        MD md = (MD) obj;
        if (md.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (md.e(obj2) != null || !md.b(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(md.e(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
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
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (AbstractC0048Bt.h(this.b[i], obj)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            h(i);
        }
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                        Object obj2 = objArr2[i5];
                        i2 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0) {
            d = ~d;
        }
        this.b[d] = obj;
        this.c[d] = obj2;
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public /* synthetic */ MD() {
        this(6);
    }
}
