package yads;

import com.google.android.exoplayer2.C;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class y11 extends sz2 {
    public static final w11 b = new w11() { // from class: yads.y11$$ExternalSyntheticLambda0
        @Override // yads.w11
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return y11.b(i, i2, i3, i4, i5);
        }
    };
    public final w11 a;

    public y11() {
        this.a = null;
    }

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public static yt1 c(int i, xb2 xb2Var) {
        int p = xb2Var.p();
        int m = xb2Var.m();
        int m2 = xb2Var.m();
        int k = xb2Var.k();
        int k2 = xb2Var.k();
        wb2 wb2Var = new wb2();
        wb2Var.b(xb2Var.a, xb2Var.c);
        wb2Var.b(xb2Var.b * 8);
        int i2 = ((i - 10) * 8) / (k + k2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a = wb2Var.a(k);
            int a2 = wb2Var.a(k2);
            iArr[i3] = a;
            iArr2[i3] = a2;
        }
        return new yt1(p, m, m2, iArr, iArr2);
    }

    public static aj2 d(int i, xb2 xb2Var) {
        byte[] bArr = new byte[i];
        xb2Var.a(bArr, 0, i);
        int b2 = b(bArr, 0);
        String str = new String(bArr, 0, b2, C.ISO88591_NAME);
        int i2 = b2 + 1;
        return new aj2(str, i <= i2 ? sb3.f : Arrays.copyOfRange(bArr, i2, i));
    }

    public static l63 e(int i, xb2 xb2Var) {
        if (i < 1) {
            return null;
        }
        int k = xb2Var.k();
        String b2 = b(k);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xb2Var.a(bArr, 0, i2);
        int a = a(bArr, 0, k);
        String str = new String(bArr, 0, a, b2);
        int a2 = a(k) + a;
        return new l63("TXXX", str, a(a2, a(bArr, a2, k), b2, bArr));
    }

    public static gb3 f(int i, xb2 xb2Var) {
        if (i < 1) {
            return null;
        }
        int k = xb2Var.k();
        String b2 = b(k);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xb2Var.a(bArr, 0, i2);
        int a = a(bArr, 0, k);
        String str = new String(bArr, 0, a, b2);
        int a2 = a(k) + a;
        return new gb3("WXXX", str, a(a2, b(bArr, a2), C.ISO88591_NAME, bArr));
    }

    public static int g(int i, xb2 xb2Var) {
        byte[] bArr = xb2Var.a;
        int i2 = xb2Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    @Override // yads.sz2
    public final ht1 a(jt1 jt1Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public static vt b(xb2 xb2Var, int i, int i2, boolean z, int i3, w11 w11Var) {
        int i4 = xb2Var.b;
        int b2 = b(xb2Var.a, i4);
        String str = new String(xb2Var.a, i4, b2 - i4, C.ISO88591_NAME);
        xb2Var.e(b2 + 1);
        int k = xb2Var.k();
        boolean z2 = (k & 2) != 0;
        boolean z3 = (k & 1) != 0;
        int k2 = xb2Var.k();
        String[] strArr = new String[k2];
        for (int i5 = 0; i5 < k2; i5++) {
            int i6 = xb2Var.b;
            int b3 = b(xb2Var.a, i6);
            strArr[i5] = new String(xb2Var.a, i6, b3 - i6, C.ISO88591_NAME);
            xb2Var.e(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (xb2Var.b < i7) {
            z11 a = a(i2, xb2Var, z, i3, w11Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new vt(str, z2, z3, strArr, (z11[]) arrayList.toArray(new z11[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ht1 a(byte[] bArr, int i) {
        x11 x11Var;
        ArrayList arrayList = new ArrayList();
        xb2 xb2Var = new xb2(bArr, i);
        boolean z = false;
        if (i - xb2Var.b < 10) {
            gh1.d("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int m = xb2Var.m();
            if (m == 4801587) {
                int k = xb2Var.k();
                xb2Var.e(xb2Var.b + 1);
                int k2 = xb2Var.k();
                int j = xb2Var.j();
                if (k == 2) {
                    if ((k2 & 64) != 0) {
                        gh1.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    x11Var = new x11(k, j, k >= 4 && (k2 & 128) != 0);
                } else {
                    if (k == 3) {
                        if ((k2 & 64) != 0) {
                            int a = xb2Var.a();
                            xb2Var.e(xb2Var.b + a);
                            j -= a + 4;
                        }
                    } else if (k == 4) {
                        if ((k2 & 64) != 0) {
                            int j2 = xb2Var.j();
                            xb2Var.e(xb2Var.b + (j2 - 4));
                            j -= j2;
                        }
                        if ((k2 & 16) != 0) {
                            j -= 10;
                        }
                    } else {
                        mf1.a(k, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    x11Var = new x11(k, j, k >= 4 && (k2 & 128) != 0);
                }
                if (x11Var != null) {
                    return null;
                }
                int i2 = xb2Var.b;
                int i3 = x11Var.a == 2 ? 6 : 10;
                int i4 = x11Var.c;
                if (x11Var.b) {
                    i4 = g(i4, xb2Var);
                }
                xb2Var.d(i2 + i4);
                if (!a(xb2Var, x11Var.a, i3, false)) {
                    if (x11Var.a != 4 || !a(xb2Var, 4, i3, true)) {
                        gh1.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + x11Var.a);
                        return null;
                    }
                    z = true;
                }
                while (xb2Var.c - xb2Var.b >= i3) {
                    z11 a2 = a(x11Var.a, xb2Var, z, i3, this.a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                return new ht1(arrayList);
            }
            gh1.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(m))));
        }
        x11Var = null;
        if (x11Var != null) {
        }
    }

    public y11(w11 w11Var) {
        this.a = w11Var;
    }

    public static gb3 b(int i, String str, xb2 xb2Var) {
        byte[] bArr = new byte[i];
        xb2Var.a(bArr, 0, i);
        return new gb3(str, null, new String(bArr, 0, b(bArr, 0), C.ISO88591_NAME));
    }

    public static dy0 b(int i, xb2 xb2Var) {
        byte[] copyOfRange;
        int k = xb2Var.k();
        String b2 = b(k);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xb2Var.a(bArr, 0, i2);
        int b3 = b(bArr, 0);
        String str = new String(bArr, 0, b3, C.ISO88591_NAME);
        int i3 = b3 + 1;
        int a = a(bArr, i3, k);
        String a2 = a(i3, a, b2, bArr);
        int a3 = a(k) + a;
        int a4 = a(bArr, a3, k);
        String a5 = a(a3, a4, b2, bArr);
        int a6 = a(k) + a4;
        if (i2 <= a6) {
            copyOfRange = sb3.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, a6, i2);
        }
        return new dy0(str, a2, a5, copyOfRange);
    }

    public static String b(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i != 3) {
            return C.ISO88591_NAME;
        }
        return "UTF-8";
    }

    public static tt a(xb2 xb2Var, int i, int i2, boolean z, int i3, w11 w11Var) {
        int i4 = xb2Var.b;
        int b2 = b(xb2Var.a, i4);
        String str = new String(xb2Var.a, i4, b2 - i4, C.ISO88591_NAME);
        xb2Var.e(b2 + 1);
        int a = xb2Var.a();
        int a2 = xb2Var.a();
        long l = xb2Var.l();
        long j = l == 4294967295L ? -1L : l;
        long l2 = xb2Var.l();
        long j2 = l2 == 4294967295L ? -1L : l2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (xb2Var.b < i5) {
            z11 a3 = a(i2, xb2Var, z, i3, w11Var);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new tt(str, a, a2, j, j2, (z11[]) arrayList.toArray(new z11[0]));
    }

    public static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(xb2 xb2Var, int i, int i2, boolean z) {
        int m;
        long m2;
        int i3;
        int i4;
        int i5 = xb2Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (xb2Var.c - xb2Var.b < i2) {
                    xb2Var.e(i5);
                    return true;
                }
                if (i >= 3) {
                    m = xb2Var.a();
                    m2 = xb2Var.l();
                    i3 = xb2Var.p();
                } else {
                    m = xb2Var.m();
                    m2 = xb2Var.m();
                    i3 = 0;
                }
                if (m == 0 && m2 == 0 && i3 == 0) {
                    xb2Var.e(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & m2) != 0) {
                        xb2Var.e(i5);
                        return false;
                    }
                    m2 = (((m2 >> 24) & 255) << 21) | (m2 & 255) | (((m2 >> 8) & 255) << 7) | (((m2 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i4 += 4;
                    }
                    if (m2 < i4) {
                        xb2Var.e(i5);
                        return false;
                    }
                    int i6 = xb2Var.c;
                    int i7 = xb2Var.b;
                    if (i6 - i7 < m2) {
                        xb2Var.e(i5);
                        return false;
                    }
                    xb2Var.e(i7 + ((int) m2));
                }
            } catch (Throwable th) {
                xb2Var.e(i5);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0195, code lost:
    
        if (r14 == 67) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z11 a(int i, xb2 xb2Var, boolean z, int i2, w11 w11Var) {
        int m;
        String str;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str2;
        z11 fpVar;
        int k = xb2Var.k();
        int k2 = xb2Var.k();
        int k3 = xb2Var.k();
        int k4 = i >= 3 ? xb2Var.k() : 0;
        if (i == 4) {
            m = xb2Var.n();
            if (!z) {
                m = (((m >> 24) & 255) << 21) | (m & 255) | (((m >> 8) & 255) << 7) | (((m >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            m = xb2Var.n();
        } else {
            m = xb2Var.m();
        }
        int i5 = m;
        int p = i >= 3 ? xb2Var.p() : 0;
        if (k == 0 && k2 == 0 && k3 == 0 && k4 == 0 && i5 == 0 && p == 0) {
            xb2Var.e(xb2Var.c);
            return null;
        }
        int i6 = xb2Var.b + i5;
        if (i6 > xb2Var.c) {
            gh1.d("Id3Decoder", "Frame size exceeds remaining tag data");
            xb2Var.e(xb2Var.c);
            return null;
        }
        if (w11Var != null) {
            str = "Id3Decoder";
            i3 = i6;
            i4 = p;
            if (!w11Var.a(i, k, k2, k3, k4)) {
                xb2Var.e(i3);
                return null;
            }
        } else {
            str = "Id3Decoder";
            i3 = i6;
            i4 = p;
        }
        if (i == 3) {
            z2 = (i4 & 128) != 0;
            boolean z7 = (i4 & 64) != 0;
            z5 = (i4 & 32) != 0;
            z6 = false;
            z4 = z7;
            z3 = z2;
        } else if (i == 4) {
            boolean z8 = (i4 & 64) != 0;
            z2 = (i4 & 8) != 0;
            boolean z9 = (i4 & 4) != 0;
            boolean z10 = (i4 & 2) != 0;
            if ((i4 & 1) != 0) {
                z6 = z10;
                z5 = z8;
                z4 = z9;
                z3 = true;
            } else {
                z6 = z10;
                z5 = z8;
                z4 = z9;
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (!z2 && !z4) {
            if (z5) {
                i5--;
                xb2Var.e(xb2Var.b + 1);
            }
            if (z3) {
                i5 -= 4;
                xb2Var.e(xb2Var.b + 4);
            }
            int i7 = i5;
            if (z6) {
                i7 = g(i7, xb2Var);
            }
            int i8 = i7;
            try {
                try {
                    if (k == 84 && k2 == 88 && k3 == 88 && (i == 2 || k4 == 88)) {
                        fpVar = e(i8, xb2Var);
                    } else if (k == 84) {
                        fpVar = a(i8, a(i, k, k2, k3, k4), xb2Var);
                    } else if (k == 87 && k2 == 88 && k3 == 88 && (i == 2 || k4 == 88)) {
                        fpVar = f(i8, xb2Var);
                    } else if (k == 87) {
                        fpVar = b(i8, a(i, k, k2, k3, k4), xb2Var);
                    } else if (k == 80 && k2 == 82 && k3 == 73 && k4 == 86) {
                        fpVar = d(i8, xb2Var);
                    } else if (k == 71 && k2 == 69 && k3 == 79 && (k4 == 66 || i == 2)) {
                        fpVar = b(i8, xb2Var);
                    } else if (i == 2) {
                        if (k == 80 && k2 == 73 && k3 == 67) {
                            fpVar = a(xb2Var, i8, i);
                        }
                        if (k != 67 && k2 == 79 && k3 == 77 && (k4 == 77 || i == 2)) {
                            fpVar = a(i8, xb2Var);
                        } else if (k != 67 && k2 == 72 && k3 == 65 && k4 == 80) {
                            fpVar = a(xb2Var, i8, i, z, i2, w11Var);
                        } else if (k != 67 && k2 == 84 && k3 == 79 && k4 == 67) {
                            fpVar = b(xb2Var, i8, i, z, i2, w11Var);
                        } else if (k != 77 && k2 == 76 && k3 == 76 && k4 == 84) {
                            fpVar = c(i8, xb2Var);
                        } else {
                            String a = a(i, k, k2, k3, k4);
                            byte[] bArr = new byte[i8];
                            xb2Var.a(bArr, 0, i8);
                            fpVar = new fp(a, bArr);
                        }
                    } else {
                        if (k == 65) {
                            if (k2 == 80) {
                                if (k3 == 73) {
                                }
                            }
                        }
                        if (k != 67) {
                        }
                        if (k != 67) {
                        }
                        if (k != 67) {
                        }
                        if (k != 77) {
                        }
                        String a2 = a(i, k, k2, k3, k4);
                        byte[] bArr2 = new byte[i8];
                        xb2Var.a(bArr2, 0, i8);
                        fpVar = new fp(a2, bArr2);
                    }
                    if (fpVar == null) {
                        str2 = str;
                        try {
                            gh1.d(str2, "Failed to decode frame: id=" + a(i, k, k2, k3, k4) + ", frameSize=" + i8);
                        } catch (UnsupportedEncodingException unused) {
                            gh1.d(str2, "Unsupported character encoding");
                            xb2Var.e(i3);
                            return null;
                        }
                    }
                    xb2Var.e(i3);
                    return fpVar;
                } catch (Throwable th) {
                    xb2Var.e(i3);
                    throw th;
                }
            } catch (UnsupportedEncodingException unused2) {
                str2 = str;
            }
        } else {
            gh1.d(str, "Skipping unsupported compressed or encrypted frame");
            xb2Var.e(i3);
            return null;
        }
    }

    public static l63 a(int i, String str, xb2 xb2Var) {
        if (i < 1) {
            return null;
        }
        int k = xb2Var.k();
        String b2 = b(k);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xb2Var.a(bArr, 0, i2);
        return new l63(str, null, new String(bArr, 0, a(bArr, 0, k), b2));
    }

    public static se a(xb2 xb2Var, int i, int i2) {
        int b2;
        String a;
        byte[] copyOfRange;
        int k = xb2Var.k();
        String b3 = b(k);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        xb2Var.a(bArr, 0, i3);
        if (i2 == 2) {
            a = "image/" + lh.a(new String(bArr, 0, 3, C.ISO88591_NAME));
            if ("image/jpg".equals(a)) {
                a = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(bArr, 0);
            a = lh.a(new String(bArr, 0, b2, C.ISO88591_NAME));
            if (a.indexOf(47) == -1) {
                a = "image/".concat(a);
            }
        }
        int i4 = bArr[b2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = b2 + 2;
        int a2 = a(bArr, i5, k);
        String str = new String(bArr, i5, a2 - i5, b3);
        int a3 = a(k) + a2;
        if (i3 <= a3) {
            copyOfRange = sb3.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, a3, i3);
        }
        return new se(a, str, i4, copyOfRange);
    }

    public static ix a(int i, xb2 xb2Var) {
        if (i < 4) {
            return null;
        }
        int k = xb2Var.k();
        String b2 = b(k);
        byte[] bArr = new byte[3];
        xb2Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        xb2Var.a(bArr2, 0, i2);
        int a = a(bArr2, 0, k);
        String str2 = new String(bArr2, 0, a, b2);
        int a2 = a(k) + a;
        return new ix(str, str2, a(a2, a(bArr2, a2, k), b2, bArr2));
    }

    public static String a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int a(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if ((b2 - i) % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    public static String a(int i, int i2, String str, byte[] bArr) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, str);
        }
        return "";
    }
}
