package o;

/* loaded from: classes.dex */
public final class AD {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public AD(int i) {
        this.a = UP.a;
        this.b = AbstractC1393kt.a;
        if (i >= 0) {
            e(UP.f(i));
        } else {
            AbstractC0773bP.l("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r8 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r3 = d(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r38.e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r38.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r3 = r38.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r3 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (java.lang.Long.compare((r38.d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r3 = r38.a;
        r4 = r38.c;
        r6 = r38.b;
        o.UP.a(r3, r4);
        r9 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r9 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r21 = r9 >> 3;
        r27 = (r9 & 7) << 3;
        r25 = (r3[r21] >> r27) & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (r25 != 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if (r25 == 254) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        r25 = java.lang.Integer.hashCode(r6[r9]) * r22;
        r26 = r8;
        r8 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = d(r8);
        r8 = r8 & r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        if ((((r28 - r8) & r4) / 8) != (((r9 - r8) & r4) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        r3[r21] = (r3[r21] & (~(r30 << r27))) | ((r25 & 127) << r27);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
    
        r7 = r28 >> 3;
        r12 = r3[r7];
        r8 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
    
        if (((r12 >> r8) & r30) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        r29 = r6;
        r3[r7] = ((~(r30 << r8)) & r12) | ((r25 & 127) << r8);
        r3[r21] = (r3[r21] & (~(r30 << r27))) | (128 << r27);
        r29[r28] = r29[r9];
        r29[r9] = 0;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019a, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r8 = r26;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0171, code lost:
    
        r29 = r6;
        r3[r7] = ((~(r30 << r8)) & r12) | ((r25 & 127) << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0186, code lost:
    
        r14 = o.UP.b(r3, r9 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018c, code lost:
    
        r29[r14] = r29[r28];
        r29[r28] = r29[r9];
        r29[r9] = r29[r14];
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        r14 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01aa, code lost:
    
        r30 = r12;
        r38.e = o.UP.c(r38.c) - r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b7, code lost:
    
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0237, code lost:
    
        r3 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023b, code lost:
    
        r14 = r3;
        r38.d++;
        r3 = r38.e;
        r4 = r38.a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0254, code lost:
    
        if (((r6 >> r8) & r30) != r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0256, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x025b, code lost:
    
        r38.e = r3 - r9;
        r3 = r38.c;
        r6 = (r6 & (~(r30 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0259, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bb, code lost:
    
        r30 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c1, code lost:
    
        r3 = o.UP.d(r38.c);
        r4 = r38.a;
        r6 = r38.b;
        r7 = r38.c;
        e(r3);
        r3 = r38.a;
        r8 = r38.b;
        r9 = r38.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d8, code lost:
    
        if (r12 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e8, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r17) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ea, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r19 = r15;
        r15 = d(r14 >>> 7);
        r21 = r3;
        r20 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r21[r14] & (~(255 << r23))) | (r3 << r23);
        r21[r14] = r3;
        r21[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r12 = r12 + 1;
        r15 = r19;
        r4 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0228, code lost:
    
        r21 = r3;
        r20 = r4;
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01be, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        r30 = 255;
        r19 = true;
        r17 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = this.d;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            boolean z2 = true;
            int i14 = i11;
            long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                int i15 = i5;
                if (this.b[i3] == i) {
                    z = true;
                    break loop0;
                }
                j4 &= j4 - 1;
                i5 = i15;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i2;
        }
        this.b[i3] = i;
        if (this.d != i4) {
            return z;
        }
        return false;
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
        this.e = UP.c(this.c) - this.d;
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
        int i5 = this.c;
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

    public final void e(int i) {
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
        this.b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AD)) {
            return false;
        }
        AD ad = (AD) obj;
        if (ad.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ad.c(iArr[(i << 3) + i3])) {
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
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
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
                        i2 = Integer.hashCode(iArr[(i << 3) + i4]) + i2;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.b;
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
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
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ AD() {
        this(6);
    }
}
