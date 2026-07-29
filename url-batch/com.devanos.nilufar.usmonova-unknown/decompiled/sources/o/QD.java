package o;

/* loaded from: classes.dex */
public final class QD {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public QD(int i) {
        this.a = UP.a;
        this.b = AbstractC1473m3.d;
        if (i >= 0) {
            f(UP.f(i));
        } else {
            AbstractC0773bP.l("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.d;
        this.b[d(obj)] = obj;
        return this.d != i;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != UP.a) {
            P6.h0(jArr);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        P6.g0(this.b, 0, this.c);
        this.e = UP.c(this.c) - this.d;
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
    public final boolean c(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
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

    public final int d(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        long j4;
        int i = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j5 = ((jArr3[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr3[i8] >>> i9);
            long j6 = i4;
            int i10 = i4;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j8) >> 3)) & i5;
                int i11 = i;
                if (AbstractC0048Bt.h(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i = i11;
            }
            int i12 = i;
            char c = '\b';
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int e = e(i3);
                long j9 = 128;
                long j10 = 255;
                if (this.e != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 128;
                    j2 = 255;
                    j3 = j6;
                } else {
                    int i13 = this.c;
                    if (i13 <= 8 || Long.compare((this.d * 32) ^ Long.MIN_VALUE, (i13 * 25) ^ Long.MIN_VALUE) > 0) {
                        j = 128;
                        j2 = 255;
                        j3 = j6;
                        int d = UP.d(this.c);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.b;
                        int i14 = this.c;
                        f(d);
                        long[] jArr5 = this.a;
                        Object[] objArr3 = this.b;
                        int i15 = this.c;
                        int i16 = 0;
                        while (i16 < i14) {
                            if (((jArr4[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i16];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                int i17 = hashCode2 ^ (hashCode2 << 16);
                                int e2 = e(i17 >>> 7);
                                long j11 = i17 & 127;
                                int i18 = e2 >> 3;
                                int i19 = (e2 & 7) << 3;
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j12 = (jArr5[i18] & (~(255 << i19))) | (j11 << i19);
                                jArr[i18] = j12;
                                jArr[(((e2 - 7) & i15) + (i15 & 7)) >> 3] = j12;
                                objArr3[e2] = obj2;
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i16++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.a;
                        int i20 = this.c;
                        Object[] objArr4 = this.b;
                        UP.a(jArr6, i20);
                        int i21 = 0;
                        int i22 = -1;
                        while (i21 != i20) {
                            int i23 = i21 >> 3;
                            int i24 = (i21 & 7) << 3;
                            long j13 = (jArr6[i23] >> i24) & j10;
                            if (j13 == j9) {
                                i22 = i21;
                                i21++;
                            } else if (j13 != 254) {
                                i21++;
                            } else {
                                Object obj3 = objArr4[i21];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i12;
                                char c2 = c;
                                int i25 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int e3 = e(i25);
                                int i26 = i25 & i20;
                                long j14 = j9;
                                if (((e3 - i26) & i20) / 8 == ((i21 - i26) & i20) / 8) {
                                    long j15 = j10;
                                    jArr6[i23] = ((r23 & 127) << i24) | (jArr6[i23] & (~(j15 << i24)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i21++;
                                    c = c2;
                                    j9 = j14;
                                    j10 = j15;
                                } else {
                                    long j16 = j10;
                                    int i27 = e3 >> 3;
                                    long j17 = jArr6[i27];
                                    int i28 = (e3 & 7) << 3;
                                    if (((j17 >> i28) & j16) == j14) {
                                        j4 = j6;
                                        objArr = objArr4;
                                        jArr6[i27] = ((~(j16 << i28)) & j17) | ((r23 & 127) << i28);
                                        jArr6[i23] = (jArr6[i23] & (~(j16 << i24))) | (j14 << i24);
                                        objArr[e3] = objArr[i21];
                                        objArr[i21] = null;
                                        i22 = i21;
                                    } else {
                                        objArr = objArr4;
                                        j4 = j6;
                                        jArr6[i27] = ((r23 & 127) << i28) | (j17 & (~(j16 << i28)));
                                        if (i22 == -1) {
                                            i22 = UP.b(jArr6, i21 + 1, i20);
                                        }
                                        objArr[i22] = objArr[e3];
                                        objArr[e3] = objArr[i21];
                                        objArr[i21] = objArr[i22];
                                        i21--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i21++;
                                    objArr4 = objArr;
                                    c = c2;
                                    j9 = j14;
                                    j10 = j16;
                                    j6 = j4;
                                }
                            }
                        }
                        j = j9;
                        j2 = j10;
                        j3 = j6;
                        this.e = UP.c(this.c) - this.d;
                    }
                    e = e(i3);
                }
                this.d++;
                int i29 = this.e;
                long[] jArr7 = this.a;
                int i30 = e >> 3;
                long j18 = jArr7[i30];
                int i31 = (e & 7) << 3;
                this.e = i29 - (((j18 >> i31) & j2) == j ? 1 : 0);
                int i32 = this.c;
                long j19 = (j18 & (~(j2 << i31))) | (j3 << i31);
                jArr7[i30] = j19;
                jArr7[(((e - 7) & i32) + (i32 & 7)) >> 3] = j19;
                return e;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QD)) {
            return false;
        }
        QD qd = (QD) obj;
        if (qd.d != this.d) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !qd.c(objArr[(i << 3) + i3])) {
                            return false;
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
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, UP.e(i)) : 0;
        this.c = max;
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
        this.e = UP.c(this.c) - this.d;
        this.b = new Object[max];
    }

    public final boolean g() {
        return this.d == 0;
    }

    public final boolean h() {
        return this.d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
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
                        Object obj = objArr[(i << 3) + i4];
                        i2 += obj != null ? obj.hashCode() : 0;
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

    public final void i(QD qd) {
        AbstractC0048Bt.n(qd, "elements");
        Object[] objArr = qd.b;
        long[] jArr = qd.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        this.b[d(obj)] = obj;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
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
        boolean z = i >= 0;
        if (z) {
            k(i);
        }
        return z;
    }

    public final void k(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final String toString() {
        VP vp = new VP(this, 0);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) vp.invoke(obj));
                            i2++;
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
            String sb2 = sb.toString();
            AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "]");
        String sb22 = sb.toString();
        AbstractC0048Bt.m(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public /* synthetic */ QD() {
        this(6);
    }
}
