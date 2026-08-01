package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t60 {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j) {
        int i;
        int i2 = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (i4 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
    }

    public final void c(int i) {
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
        this.b = new long[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r39.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (((r39.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r1 = r39.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        if (java.lang.Long.compare((r39.e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        r1 = r39.a;
        r2 = r39.d;
        r3 = r39.b;
        r5 = r39.c;
        r6 = (r2 + 7) >> 3;
        r29 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        if (r7 >= r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        r33 = r11;
        r11 = r1[r7] & r33;
        r1[r7] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r7 = r7 + 1;
        r14 = r14;
        r13 = r13;
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
    
        r22 = r13;
        r8 = r14;
        r6 = defpackage.p8.a0(r1);
        r7 = r6 - 1;
        r13 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        if (r6 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        r7 = r6 >> 3;
        r19 = (r6 & 7) << 3;
        r11 = (r1[r7] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r11 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r11 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r11 = r3[r6];
        r11 = ((int) (r11 ^ (r11 >>> r22))) * r20;
        r12 = (r11 ^ (r11 << 16)) >>> 7;
        r31 = a(r12);
        r12 = r12 & r2;
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        if ((((r31 - r12) & r2) / 8) != (((r6 - r12) & r2) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0170, code lost:
    
        r34 = r13;
        r8 = r31 >> 3;
        r12 = r1[r8];
        r14 = (r31 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        if (((r12 >> r14) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0182, code lost:
    
        r32 = r2;
        r36 = r3;
        r1[r8] = ((~(255 << r14)) & r12) | ((r11 & 127) << r14);
        r1[r7] = (r1[r7] & (~(255 << r19))) | (128 << r19);
        r36[r31] = r36[r6];
        r36[r6] = 0;
        r5[r31] = r5[r6];
        r5[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d1, code lost:
    
        r1[r1.length - 1] = (r1[0] & r34) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r2 = r32;
        r8 = r33;
        r13 = r34;
        r3 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ad, code lost:
    
        r32 = r2;
        r36 = r3;
        r1[r8] = ((~(255 << r14)) & r12) | ((r11 & 127) << r14);
        r2 = r36[r31];
        r36[r31] = r36[r6];
        r36[r6] = r2;
        r2 = r5[r31];
        r5[r31] = r5[r6];
        r5[r6] = r2;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014d, code lost:
    
        r34 = r13;
        r1[r7] = ((r11 & 127) << r19) | (r1[r7] & (~(255 << r19)));
        r1[r1.length - 1] = (r1[0] & r34) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r8 = r33;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e8, code lost:
    
        r33 = r8;
        r39.f = defpackage.vn0.a(r39.d) - r39.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027b, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027f, code lost:
    
        r17 = r1;
        r39.e++;
        r1 = r39.f;
        r2 = r39.a;
        r3 = r17 >> 3;
        r4 = r2[r3];
        r6 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0299, code lost:
    
        if (((r4 >> r6) & r29) != r25) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029b, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x029f, code lost:
    
        r39.f = r1 - r7;
        r1 = r39.d;
        r4 = (r4 & (~(r29 << r6))) | (r9 << r6);
        r2[r3] = r4;
        r2[(((r17 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029e, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f7, code lost:
    
        r29 = 255;
        r33 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0201, code lost:
    
        r1 = defpackage.vn0.b(r39.d);
        r2 = r39.a;
        r3 = r39.b;
        r5 = r39.c;
        r6 = r39.d;
        c(r1);
        r1 = r39.a;
        r7 = r39.b;
        r8 = r39.c;
        r11 = r39.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021b, code lost:
    
        if (r12 >= r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x022b, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r25) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022d, code lost:
    
        r13 = r3[r12];
        r21 = r1;
        r19 = r2;
        r1 = ((int) (r13 ^ (r13 >>> r13))) * r20;
        r2 = a((r1 ^ (r1 << 16)) >>> 7);
        r18 = r2 >> 3;
        r23 = (r2 & 7) << 3;
        r1 = (r21[r18] & (~(255 << r23))) | ((r1 & 127) << r23);
        r21[r18] = r1;
        r21[(((r2 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r2] = r13;
        r8[r2] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0274, code lost:
    
        r12 = r12 + 1;
        r2 = r19;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0270, code lost:
    
        r21 = r1;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fe, code lost:
    
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009f, code lost:
    
        r29 = 255;
        r33 = 1;
        r25 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j, x60 x60Var) {
        int i;
        int i2;
        char c = ' ';
        int i3 = -862048943;
        int i4 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            int i14 = i10;
            long j2 = (((-i12) >> 63) & (jArr[i11 + 1] << (64 - i12))) | (jArr[i11] >>> i12);
            long j3 = i7;
            char c2 = c;
            int i15 = i7;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = -9187201950435737472L;
            long j6 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i2 = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                int i16 = i3;
                if (this.b[i2] == j) {
                    break loop0;
                }
                j6 &= j6 - 1;
                i3 = i16;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i7 = i15;
            i3 = i;
            c = c2;
        }
        this.b[i2] = j;
        this.c[i2] = x60Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (((r4 & ((~r4) << 6)) & r22) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        boolean z;
        long[] jArr3;
        long[] jArr4;
        long j;
        int i;
        char c;
        long j2;
        Object[] objArr2;
        int i2;
        if (obj != this) {
            if (obj instanceof t60) {
                t60 t60Var = (t60) obj;
                if (t60Var.e == this.e) {
                    long[] jArr5 = this.b;
                    Object[] objArr3 = this.c;
                    long[] jArr6 = this.a;
                    int length = jArr6.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j3 = jArr6[i3];
                            char c2 = 7;
                            long j4 = -9187201950435737472L;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8;
                                int i5 = 8 - ((~(i3 - length)) >>> 31);
                                int i6 = 0;
                                while (i6 < i5) {
                                    if ((j3 & 255) < 128) {
                                        int i7 = (i3 << 3) + i6;
                                        jArr4 = jArr5;
                                        long j5 = jArr4[i7];
                                        Object obj2 = objArr3[i7];
                                        if (obj2 != null) {
                                            jArr3 = jArr6;
                                            j = j3;
                                            i = i4;
                                            c = c2;
                                            j2 = j4;
                                            objArr2 = objArr3;
                                            if (!obj2.equals(t60Var.b(j5))) {
                                                return false;
                                            }
                                        } else {
                                            if (t60Var.b(j5) != null) {
                                                return false;
                                            }
                                            c = c2;
                                            j2 = j4;
                                            int i8 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
                                            int i9 = i8 ^ (i8 << 16);
                                            int i10 = i9 & 127;
                                            int i11 = t60Var.d;
                                            int i12 = (i9 >>> 7) & i11;
                                            i = i4;
                                            int i13 = 0;
                                            while (true) {
                                                long[] jArr7 = t60Var.a;
                                                int i14 = i12 >> 3;
                                                jArr3 = jArr6;
                                                int i15 = (i12 & 7) << 3;
                                                long j6 = jArr7[i14] >>> i15;
                                                long j7 = jArr7[i14 + 1] << (64 - i15);
                                                int i16 = i12;
                                                objArr2 = objArr3;
                                                long j8 = j6 | (j7 & ((-i15) >> 63));
                                                j = j3;
                                                long j9 = (i10 * 72340172838076673L) ^ j8;
                                                long j10 = (j9 - 72340172838076673L) & (~j9) & j2;
                                                while (true) {
                                                    if (j10 == 0) {
                                                        break;
                                                    }
                                                    int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
                                                    if (t60Var.b[numberOfTrailingZeros] == j5) {
                                                        i2 = numberOfTrailingZeros;
                                                        break;
                                                    }
                                                    j10 &= j10 - 1;
                                                }
                                                i13 += 8;
                                                i12 = (i16 + i13) & i11;
                                                objArr3 = objArr2;
                                                jArr6 = jArr3;
                                                j3 = j;
                                            }
                                            if (!(i2 >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                        jArr4 = jArr5;
                                        j = j3;
                                        i = i4;
                                        c = c2;
                                        j2 = j4;
                                        objArr2 = objArr3;
                                    }
                                    j3 = j >> i;
                                    i6++;
                                    c2 = c;
                                    objArr3 = objArr2;
                                    jArr5 = jArr4;
                                    jArr6 = jArr3;
                                    j4 = j2;
                                    i4 = i;
                                }
                                jArr = jArr6;
                                jArr2 = jArr5;
                                int i17 = i4;
                                z = true;
                                objArr = objArr3;
                                if (i5 != i17) {
                                    return true;
                                }
                            } else {
                                jArr = jArr6;
                                jArr2 = jArr5;
                                objArr = objArr3;
                                z = true;
                            }
                            if (i3 == length) {
                                return z;
                            }
                            i3++;
                            objArr3 = objArr;
                            jArr5 = jArr2;
                            jArr6 = jArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
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
                        i2 += (obj != null ? obj.hashCode() : 0) ^ ((int) (j2 ^ (j2 >>> 32)));
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
        return sb.toString();
    }
}
