package o;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0744b {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0470Sa.a);
        AbstractC0048Bt.m(bytes, "getBytes(...)");
        a = bytes;
    }

    public static final boolean a(C1694pQ c1694pQ, int i, byte[] bArr, int i2) {
        int i3 = c1694pQ.c;
        byte[] bArr2 = c1694pQ.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c1694pQ = c1694pQ.f;
                AbstractC0048Bt.k(c1694pQ);
                bArr2 = c1694pQ.a;
                i = c1694pQ.b;
                i3 = c1694pQ.c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(G8 g8, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (g8.q(j2) == 13) {
                String D = g8.D(j2, AbstractC0470Sa.a);
                g8.skip(2L);
                return D;
            }
        }
        String D2 = g8.D(j, AbstractC0470Sa.a);
        g8.skip(1L);
        return D2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(G8 g8, NG ng, boolean z) {
        int i;
        int i2;
        int i3;
        C1694pQ c1694pQ;
        int i4;
        AbstractC0048Bt.n(ng, "options");
        C1694pQ c1694pQ2 = g8.h;
        if (c1694pQ2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c1694pQ2.a;
        int i5 = c1694pQ2.b;
        int i6 = c1694pQ2.c;
        int[] iArr = ng.i;
        C1694pQ c1694pQ3 = c1694pQ2;
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
            if (c1694pQ3 == null) {
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
                            c1694pQ3 = c1694pQ3.f;
                            AbstractC0048Bt.k(c1694pQ3);
                            int i16 = c1694pQ3.b;
                            byte[] bArr2 = c1694pQ3.a;
                            i2 = c1694pQ3.c;
                            if (c1694pQ3 == c1694pQ2) {
                                i3 = i16;
                                bArr = bArr2;
                                c1694pQ3 = null;
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
                    AbstractC0048Bt.k(c1694pQ3);
                    C1694pQ c1694pQ4 = c1694pQ3.f;
                    AbstractC0048Bt.k(c1694pQ4);
                    i3 = c1694pQ4.b;
                    byte[] bArr3 = c1694pQ4.a;
                    i4 = c1694pQ4.c;
                    if (c1694pQ4 != c1694pQ2) {
                        c1694pQ = c1694pQ4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        c1694pQ = null;
                    }
                } else {
                    c1694pQ = c1694pQ3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    c1694pQ3 = c1694pQ;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                c1694pQ3 = c1694pQ;
                i11 = i20;
            }
        }
        return i7;
    }
}
