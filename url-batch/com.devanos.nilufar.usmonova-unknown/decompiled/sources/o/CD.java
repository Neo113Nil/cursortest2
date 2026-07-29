package o;

/* loaded from: classes.dex */
public final class CD {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
    }

    public final void c(int i) {
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
        this.b = new long[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r19 = r2;
        r6 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r1 = a(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r39.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (((r39.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r1 = r39.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r1 <= 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (java.lang.Long.compare((r39.e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        r1 = r39.a;
        r2 = r39.d;
        r9 = r39.b;
        r14 = r39.c;
        o.UP.a(r1, r2);
        r4 = 0;
        r5 = -1;
        r24 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r4 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r18 = r4 >> 3;
        r28 = (r4 & 7) << 3;
        r26 = (r1[r18] >> r28) & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        if (r26 != 128) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r26 == 254) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        r26 = java.lang.Long.hashCode(r9[r4]) * r19;
        r27 = r6;
        r6 = (r26 ^ (r26 << 16)) >>> 7;
        r29 = a(r6);
        r6 = r6 & r2;
        r31 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        if ((((r29 - r6) & r2) / 8) != (((r4 - r6) & r2) / 8)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        r35 = r12;
        r8 = r13;
        r6 = r29 >> 3;
        r12 = r1[r6];
        r7 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        if (((r12 >> r7) & r31) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014e, code lost:
    
        r36 = r8;
        r30 = r9;
        r37 = r4;
        r1[r6] = ((~(r31 << r7)) & r12) | ((r26 & 127) << r7);
        r1[r18] = (r1[r18] & (~(r31 << r28))) | (128 << r28);
        r30[r29] = r30[r37];
        r30[r37] = 0;
        r14[r29] = r14[r37];
        r14[r37] = null;
        r4 = r37;
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b2, code lost:
    
        r1[r1.length - 1] = (r1[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r6 = r27;
        r9 = r30;
        r7 = r31;
        r12 = r35;
        r13 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:
    
        r37 = r4;
        r36 = r8;
        r30 = r9;
        r1[r6] = ((~(r31 << r7)) & r12) | ((r26 & 127) << r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0190, code lost:
    
        if (r5 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0192, code lost:
    
        r5 = o.UP.b(r1, r37 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0198, code lost:
    
        r30[r5] = r30[r29];
        r30[r29] = r30[r37];
        r30[r37] = r30[r5];
        r14[r5] = r14[r29];
        r14[r29] = r14[r37];
        r14[r37] = r14[r5];
        r4 = r37 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        r35 = r12;
        r8 = r13;
        r1[r18] = ((r26 & 127) << r28) | (r1[r18] & (~(r31 << r28)));
        r1[r1.length - r8] = (r1[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r13 = r8;
        r6 = r27;
        r7 = r31;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        r5 = r4;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cb, code lost:
    
        r31 = r7;
        r35 = r12;
        r36 = r13;
        r39.f = o.UP.c(r39.d) - r39.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025f, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0263, code lost:
    
        r16 = r1;
        r39.e++;
        r1 = r39.f;
        r2 = r39.a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        if (((r4 >> r6) & r31) != r24) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027f, code lost:
    
        r35 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        r39.f = r1 - r35;
        r1 = r39.d;
        r4 = (r4 & (~(r31 << r6))) | (r10 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01de, code lost:
    
        r31 = 255;
        r35 = 0;
        r36 = 1;
        r24 = 128;
        r1 = o.UP.d(r39.d);
        r2 = r39.a;
        r4 = r39.b;
        r5 = r39.c;
        r6 = r39.d;
        c(r1);
        r1 = r39.a;
        r7 = r39.b;
        r8 = r39.c;
        r9 = r39.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0201, code lost:
    
        if (r12 >= r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0210, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0212, code lost:
    
        r13 = r4[r12];
        r15 = java.lang.Long.hashCode(r13) * r19;
        r15 = r15 ^ (r15 << 16);
        r16 = r1;
        r1 = a(r15 >>> 7);
        r17 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r20 = (r1 & 7) << 3;
        r1 = (r16[r15] & (~(255 << r20))) | (r1 << r20);
        r16[r15] = r1;
        r16[(((r1 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r1] = r13;
        r8[r1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0258, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0254, code lost:
    
        r16 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0095, code lost:
    
        r31 = 255;
        r35 = 0;
        r36 = 1;
        r24 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j, HD hd) {
        int i;
        int i2;
        int i3 = -862048943;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j3 = i6;
            int i13 = i9;
            int i14 = 0;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i2 = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                int i15 = i3;
                if (this.b[i2] == j) {
                    break loop0;
                }
                j5 &= j5 - 1;
                i3 = i15;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i;
        }
        this.b[i2] = j;
        this.c[i2] = hd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        int i;
        Object[] objArr;
        int i2;
        ?? r18;
        Object[] objArr2;
        long j;
        int i3;
        char c;
        long j2;
        long[] jArr2;
        int i4;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        int i5 = 0;
        if (!(obj instanceof CD)) {
            return false;
        }
        CD cd = (CD) obj;
        if (cd.e != this.e) {
            return false;
        }
        long[] jArr3 = this.b;
        Object[] objArr3 = this.c;
        long[] jArr4 = this.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        loop0: while (true) {
            long j3 = jArr4[i6];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                z = z2;
                int i9 = i5;
                while (i9 < i8) {
                    if ((j3 & 255) < 128) {
                        int i10 = (i6 << 3) + i9;
                        r18 = i5;
                        objArr2 = objArr3;
                        long j5 = jArr3[i10];
                        c = c2;
                        Object obj2 = objArr2[i10];
                        if (obj2 != null) {
                            i2 = i9;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            jArr2 = jArr3;
                            if (!obj2.equals(cd.b(j5))) {
                                return r18;
                            }
                        } else {
                            if (cd.b(j5) != null) {
                                break loop0;
                            }
                            cd.getClass();
                            int hashCode = Long.hashCode(j5) * (-862048943);
                            int i11 = hashCode ^ (hashCode << 16);
                            j2 = j4;
                            int i12 = i11 & 127;
                            int i13 = cd.d;
                            int i14 = (i11 >>> 7) & i13;
                            i3 = i7;
                            int i15 = r18 == true ? 1 : 0;
                            while (true) {
                                long[] jArr5 = cd.a;
                                int i16 = i14 >> 3;
                                int i17 = (i14 & 7) << 3;
                                long j6 = jArr5[i16] >>> i17;
                                long j7 = jArr5[i16 + 1] << (64 - i17);
                                i2 = i9;
                                jArr2 = jArr3;
                                long j8 = j6 | (j7 & ((-i17) >> 63));
                                j = j3;
                                long j9 = (i12 * 72340172838076673L) ^ j8;
                                long j10 = (j9 - 72340172838076673L) & (~j9) & j2;
                                while (true) {
                                    if (j10 == 0) {
                                        break;
                                    }
                                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                                    if (cd.b[numberOfTrailingZeros] == j5) {
                                        i4 = numberOfTrailingZeros;
                                        break;
                                    }
                                    j10 &= j10 - 1;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i13;
                                jArr3 = jArr2;
                                i9 = i2;
                                j3 = j;
                            }
                            if (!(i4 >= 0 ? z : r18 == true ? 1 : 0)) {
                                break loop0;
                            }
                        }
                    } else {
                        i2 = i9;
                        r18 = i5;
                        objArr2 = objArr3;
                        j = j3;
                        i3 = i7;
                        c = c2;
                        j2 = j4;
                        jArr2 = jArr3;
                    }
                    j3 = j >> i3;
                    i9 = i2 + 1;
                    c2 = c;
                    jArr3 = jArr2;
                    i5 = r18;
                    objArr3 = objArr2;
                    j4 = j2;
                    i7 = i3;
                }
                i = i5;
                objArr = objArr3;
                int i18 = i7;
                jArr = jArr3;
                if (i8 != i18) {
                    return z;
                }
            } else {
                z = z2;
                jArr = jArr3;
                i = i5;
                objArr = objArr3;
            }
            if (i6 == length) {
                return z;
            }
            i6++;
            jArr3 = jArr;
            z2 = z;
            i5 = i;
            objArr3 = objArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        long j2 = jArr[i5];
                        Object obj = objArr[i5];
                        i2 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "s.append('}').toString()");
        return sb2;
    }
}
