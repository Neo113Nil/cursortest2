package o;

/* renamed from: o.zD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2340zD {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public C2340zD(int i) {
        this.a = UP.a;
        this.b = AbstractC1393kt.a;
        this.c = AbstractC1473m3.d;
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
        this.f = UP.c(this.d) - this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return i2 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return i2 >= 0;
    }

    public final int d(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return this.c[i2];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2340zD)) {
            return false;
        }
        C2340zD c2340zD = (C2340zD) obj;
        if (c2340zD.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                            int i5 = iArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (c2340zD.e(i5) != null || !c2340zD.c(i5)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(c2340zD.e(i5))) {
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
        this.b = new int[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i10 = this.d;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
        jArr2[i11] = j4;
        jArr2[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j4;
        Object[] objArr = this.c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r2 = d(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r40.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (((r40.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        r2 = r40.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        if (java.lang.Long.compare((r40.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        r2 = r40.a;
        r3 = r40.d;
        r5 = r40.b;
        r6 = r40.c;
        o.UP.a(r2, r3);
        r13 = 0;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        if (r13 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        r24 = r13 >> 3;
        r27 = (r13 & 7) << 3;
        r25 = (r2[r24] >> r27) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        if (r25 != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (r25 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        r25 = java.lang.Integer.hashCode(r5[r13]) * r21;
        r28 = r11;
        r11 = (r25 ^ (r25 << 16)) >>> 7;
        r12 = d(r11);
        r11 = r11 & r3;
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        if ((((r12 - r11) & r3) / 8) != (((r13 - r11) & r3) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        r33 = r9;
        r2[r24] = (r2[r24] & (~(r28 << r27))) | ((r25 & 127) << r27);
        r2[r2.length - 1] = (r2[r15] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        r11 = r28;
        r14 = r30;
        r9 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        r33 = r9;
        r8 = r12 >> 3;
        r35 = r2[r8];
        r9 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0152, code lost:
    
        if (((r35 >> r9) & r28) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0154, code lost:
    
        r26 = r15;
        r2[r8] = ((r25 & 127) << r9) | (r35 & (~(r28 << r9)));
        r2[r24] = (r2[r24] & (~(r28 << r27))) | (128 << r27);
        r5[r12] = r5[r13];
        r5[r13] = r26;
        r6[r12] = r6[r13];
        r6[r13] = null;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b0, code lost:
    
        r2[r2.length - 1] = (r2[r26] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017e, code lost:
    
        r26 = r15;
        r2[r8] = ((r25 & 127) << r9) | (r35 & (~(r28 << r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018e, code lost:
    
        if (r7 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0190, code lost:
    
        r7 = o.UP.b(r2, r13 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0196, code lost:
    
        r5[r7] = r5[r12];
        r5[r12] = r5[r13];
        r5[r13] = r5[r7];
        r6[r7] = r6[r12];
        r6[r12] = r6[r13];
        r6[r13] = r6[r7];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r39 = r13;
        r13 = r13 + 1;
        r7 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c1, code lost:
    
        r33 = r9;
        r28 = r11;
        r30 = r14;
        r26 = r15;
        r40.f = o.UP.c(r40.d) - r40.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0251, code lost:
    
        r13 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0258, code lost:
    
        r40.e++;
        r1 = r40.f;
        r2 = r40.a;
        r3 = r13 >> 3;
        r4 = r2[r3];
        r6 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0270, code lost:
    
        if (((r4 >> r6) & r28) != r16) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0272, code lost:
    
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0277, code lost:
    
        r40.f = r1 - r7;
        r1 = r40.d;
        r4 = (r4 & (~(r28 << r6))) | (r33 << r6);
        r2[r3] = r4;
        r2[(((r13 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0275, code lost:
    
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
    
        r33 = r9;
        r28 = 255;
        r30 = 1;
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e2, code lost:
    
        r2 = o.UP.d(r40.d);
        r3 = r40.a;
        r5 = r40.b;
        r6 = r40.c;
        r7 = r40.d;
        f(r2);
        r2 = r40.a;
        r8 = r40.b;
        r9 = r40.c;
        r10 = r40.d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fd, code lost:
    
        if (r11 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020e, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = d(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r18))) | (r1 << r18);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x024b, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024a, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01df, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009a, code lost:
    
        r33 = r9;
        r28 = 255;
        r30 = 1;
        r26 = 0;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0257, code lost:
    
        r13 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, Object obj) {
        int i2;
        int i3;
        int i4 = i;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i4) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i11;
            int i16 = 0;
            long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                int i17 = i5;
                if (this.b[i3] == i4) {
                    break loop0;
                }
                j4 &= j4 - 1;
                i5 = i17;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i;
            i5 = i2;
        }
        this.b[i3] = i;
        this.c[i3] = obj;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                        int i6 = iArr[i5];
                        Object obj = objArr[i5];
                        i2 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i6);
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
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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

    public /* synthetic */ C2340zD() {
        this(6);
    }
}
