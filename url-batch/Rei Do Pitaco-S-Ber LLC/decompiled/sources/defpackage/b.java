package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(r9.a);
        bytes.getClass();
        a = bytes;
    }

    public static final String a(long j, m8 m8Var) {
        if (j > 0) {
            long j2 = j - 1;
            if (m8Var.o(j2) == 13) {
                String r = m8Var.r(j2, r9.a);
                m8Var.skip(2L);
                return r;
            }
        }
        String r2 = m8Var.r(j, r9.a);
        m8Var.skip(1L);
        return r2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(m8 m8Var, xv xvVar, boolean z) {
        int i;
        int i2;
        int i3;
        e10 e10Var;
        int i4;
        xvVar.getClass();
        e10 e10Var2 = m8Var.f;
        if (e10Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = e10Var2.a;
        int i5 = e10Var2.b;
        int i6 = e10Var2.c;
        int[] iArr = xvVar.g;
        e10 e10Var3 = e10Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (e10Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            e10Var3 = e10Var3.f;
                            e10Var3.getClass();
                            int i16 = e10Var3.b;
                            byte[] bArr2 = e10Var3.a;
                            i2 = e10Var3.c;
                            if (e10Var3 == e10Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                e10Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    e10Var3.getClass();
                    e10 e10Var4 = e10Var3.f;
                    e10Var4.getClass();
                    i3 = e10Var4.b;
                    byte[] bArr3 = e10Var4.a;
                    i4 = e10Var4.c;
                    if (e10Var4 != e10Var2) {
                        e10Var = e10Var4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        e10Var = null;
                    }
                } else {
                    e10Var = e10Var3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    e10Var3 = e10Var;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                e10Var3 = e10Var;
                i11 = i20;
            }
        }
        return i7;
    }
}
