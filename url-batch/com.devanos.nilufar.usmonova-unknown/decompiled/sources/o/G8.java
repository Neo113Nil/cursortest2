package o;

import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class G8 implements N8, M8, Cloneable, ByteChannel {
    public C1694pQ h;
    public long i;

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 A(long j) {
        O(j);
        return this;
    }

    public final byte[] B(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount: ", j).toString());
        }
        if (this.i < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        return bArr;
    }

    public final short C() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String D(long j, Charset charset) {
        AbstractC0048Bt.n(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount: ", j).toString());
        }
        if (this.i < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        int i = c1694pQ.b;
        if (i + j > c1694pQ.c) {
            return new String(B(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c1694pQ.a, i, i2, charset);
        int i3 = c1694pQ.b + i2;
        c1694pQ.b = i3;
        this.i -= j;
        if (i3 == c1694pQ.c) {
            this.h = c1694pQ.a();
            AbstractC1825rQ.a(c1694pQ);
        }
        return str;
    }

    @Override // o.M8
    public final long E(HS hs) {
        AbstractC0048Bt.n(hs, Constants.ScionAnalytics.PARAM_SOURCE);
        long j = 0;
        while (true) {
            long read = hs.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final String F() {
        return D(this.i, AbstractC0470Sa.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    @Override // o.N8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G() {
        int i;
        if (this.i == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C1694pQ c1694pQ = this.h;
            AbstractC0048Bt.k(c1694pQ);
            byte[] bArr = c1694pQ.a;
            int i3 = c1694pQ.b;
            int i4 = c1694pQ.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = AbstractC1473m3.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.h = c1694pQ.a();
                        AbstractC1825rQ.a(c1694pQ);
                    } else {
                        c1694pQ.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    G8 g8 = new G8();
                    g8.P(j);
                    g8.N(b);
                    throw new NumberFormatException("Number too large: ".concat(g8.F()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.h != null);
        this.i -= i2;
        return j;
    }

    @Override // o.N8
    public final String H(Charset charset) {
        return D(this.i, charset);
    }

    public final int I() {
        int i;
        int i2;
        int i3;
        if (this.i == 0) {
            throw new EOFException();
        }
        byte q = q(0L);
        if ((q & 128) == 0) {
            i = q & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((q & 224) == 192) {
            i = q & 31;
            i2 = 2;
            i3 = 128;
        } else if ((q & 240) == 224) {
            i = q & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((q & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = q & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.i < j) {
            StringBuilder i4 = AbstractC2188wx.i(i2, "size < ", ": ");
            i4.append(this.i);
            i4.append(" (to read code point prefixed 0x");
            char[] cArr = AbstractC1473m3.a;
            i4.append(new String(new char[]{cArr[(q >> 4) & 15], cArr[q & 15]}));
            i4.append(')');
            throw new EOFException(i4.toString());
        }
        for (int i5 = 1; i5 < i2; i5++) {
            long j2 = i5;
            byte q2 = q(j2);
            if ((q2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (q2 & 63);
        }
        skip(j);
        if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i3)) {
            return i;
        }
        return 65533;
    }

    @Override // o.N8
    public final InputStream J() {
        return new F8(this, 0);
    }

    public final C1347k9 K(int i) {
        if (i == 0) {
            return C1347k9.k;
        }
        EB.f(this.i, 0L, i);
        C1694pQ c1694pQ = this.h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            AbstractC0048Bt.k(c1694pQ);
            int i5 = c1694pQ.c;
            int i6 = c1694pQ.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c1694pQ = c1694pQ.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C1694pQ c1694pQ2 = this.h;
        int i7 = 0;
        while (i2 < i) {
            AbstractC0048Bt.k(c1694pQ2);
            bArr[i7] = c1694pQ2.a;
            i2 += c1694pQ2.c - c1694pQ2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c1694pQ2.b;
            c1694pQ2.d = true;
            i7++;
            c1694pQ2 = c1694pQ2.f;
        }
        return new C1891sQ(bArr, iArr);
    }

    public final C1694pQ L(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            C1694pQ b = AbstractC1825rQ.b();
            this.h = b;
            b.g = b;
            b.f = b;
            return b;
        }
        C1694pQ c1694pQ2 = c1694pQ.g;
        AbstractC0048Bt.k(c1694pQ2);
        if (c1694pQ2.c + i <= 8192 && c1694pQ2.e) {
            return c1694pQ2;
        }
        C1694pQ b2 = AbstractC1825rQ.b();
        c1694pQ2.b(b2);
        return b2;
    }

    public final void M(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "byteString");
        c1347k9.p(this, c1347k9.b());
    }

    public final void N(int i) {
        C1694pQ L = L(1);
        byte[] bArr = L.a;
        int i2 = L.c;
        L.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.i++;
    }

    public final void O(long j) {
        boolean z;
        if (j == 0) {
            N(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                S("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C1694pQ L = L(i);
        byte[] bArr = L.a;
        int i2 = L.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC0744b.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        L.c += i;
        this.i += i;
    }

    public final void P(long j) {
        if (j == 0) {
            N(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C1694pQ L = L(i);
        byte[] bArr = L.a;
        int i2 = L.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0744b.a[(int) (15 & j)];
            j >>>= 4;
        }
        L.c += i;
        this.i += i;
    }

    public final void Q(int i) {
        C1694pQ L = L(4);
        byte[] bArr = L.a;
        int i2 = L.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        L.c = i2 + 4;
        this.i += 4;
    }

    public final void R(int i) {
        C1694pQ L = L(2);
        byte[] bArr = L.a;
        int i2 = L.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        L.c = i2 + 2;
        this.i += 2;
    }

    public final void S(String str) {
        AbstractC0048Bt.n(str, "string");
        T(str, 0, str.length());
    }

    public final void T(String str, int i, int i2) {
        char charAt;
        AbstractC0048Bt.n(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder i3 = AbstractC2188wx.i(i2, "endIndex > string.length: ", " > ");
            i3.append(str.length());
            throw new IllegalArgumentException(i3.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                C1694pQ L = L(1);
                byte[] bArr = L.a;
                int i4 = L.c - i;
                int min = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) charAt2;
                while (true) {
                    i = i5;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                }
                int i6 = L.c;
                int i7 = (i4 + i) - i6;
                L.c = i6 + i7;
                this.i += i7;
            } else {
                if (charAt2 < 2048) {
                    C1694pQ L2 = L(2);
                    byte[] bArr2 = L2.a;
                    int i8 = L2.c;
                    bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    L2.c = i8 + 2;
                    this.i += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C1694pQ L3 = L(3);
                    byte[] bArr3 = L3.a;
                    int i9 = L3.c;
                    bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                    L3.c = i9 + 3;
                    this.i += 3;
                } else {
                    int i10 = i + 1;
                    char charAt3 = i10 < i2 ? str.charAt(i10) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        N(63);
                        i = i10;
                    } else {
                        int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C1694pQ L4 = L(4);
                        byte[] bArr4 = L4.a;
                        int i12 = L4.c;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        L4.c = i12 + 4;
                        this.i += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void U(int i) {
        String str;
        if (i < 128) {
            N(i);
            return;
        }
        if (i < 2048) {
            C1694pQ L = L(2);
            byte[] bArr = L.a;
            int i2 = L.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            L.c = i2 + 2;
            this.i += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            N(63);
            return;
        }
        if (i < 65536) {
            C1694pQ L2 = L(3);
            byte[] bArr2 = L2.a;
            int i3 = L2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            L2.c = i3 + 3;
            this.i += 3;
            return;
        }
        if (i <= 1114111) {
            C1694pQ L3 = L(4);
            byte[] bArr3 = L3.a;
            int i4 = L3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            L3.c = i4 + 4;
            this.i += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC1473m3.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException(AbstractC1888sN.h(i5, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i5 > 8) {
                throw new IllegalArgumentException(AbstractC1888sN.h(i5, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b() {
        skip(this.i);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final G8 clone() {
        G8 g8 = new G8();
        if (this.i == 0) {
            return g8;
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        C1694pQ c = c1694pQ.c();
        g8.h = c;
        c.g = c;
        c.f = c;
        for (C1694pQ c1694pQ2 = c1694pQ.f; c1694pQ2 != c1694pQ; c1694pQ2 = c1694pQ2.f) {
            C1694pQ c1694pQ3 = c.g;
            AbstractC0048Bt.k(c1694pQ3);
            AbstractC0048Bt.k(c1694pQ2);
            c1694pQ3.b(c1694pQ2.c());
        }
        g8.i = this.i;
        return g8;
    }

    @Override // o.N8
    public final boolean d(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "bytes");
        int b = c1347k9.b();
        if (b >= 0 && this.i >= b && c1347k9.b() >= b) {
            for (int i = 0; i < b; i++) {
                if (q(i) == c1347k9.g(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 e(String str, int i, int i2) {
        T(str, i, i2);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        long j = this.i;
        G8 g8 = (G8) obj;
        if (j != g8.i) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        C1694pQ c1694pQ2 = g8.h;
        AbstractC0048Bt.k(c1694pQ2);
        int i = c1694pQ.b;
        int i2 = c1694pQ2.b;
        long j2 = 0;
        while (j2 < this.i) {
            long min = Math.min(c1694pQ.c - i, c1694pQ2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c1694pQ.a[i] != c1694pQ2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c1694pQ.c) {
                c1694pQ = c1694pQ.f;
                AbstractC0048Bt.k(c1694pQ);
                i = c1694pQ.b;
            }
            if (i2 == c1694pQ2.c) {
                c1694pQ2 = c1694pQ2.f;
                AbstractC0048Bt.k(c1694pQ2);
                i2 = c1694pQ2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // o.N8
    public final long f(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "targetBytes");
        return x(c1347k9, 0L);
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 g(long j) {
        P(j);
        return this;
    }

    @Override // o.N8
    public final C1347k9 h() {
        return i(this.i);
    }

    public final int hashCode() {
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c1694pQ.c;
            for (int i3 = c1694pQ.b; i3 < i2; i3++) {
                i = (i * 31) + c1694pQ.a[i3];
            }
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
        } while (c1694pQ != this.h);
        return i;
    }

    @Override // o.N8
    public final C1347k9 i(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount: ", j).toString());
        }
        if (this.i < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C1347k9(B(j));
        }
        C1347k9 K = K((int) j);
        skip(j);
        return K;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j = this.i;
        if (j == 0) {
            return 0L;
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        C1694pQ c1694pQ2 = c1694pQ.g;
        AbstractC0048Bt.k(c1694pQ2);
        return (c1694pQ2.c >= 8192 || !c1694pQ2.e) ? j : j - (r3 - c1694pQ2.b);
    }

    public final void k(G8 g8, long j, long j2) {
        AbstractC0048Bt.n(g8, "out");
        long j3 = j;
        EB.f(this.i, j3, j2);
        if (j2 == 0) {
            return;
        }
        g8.i += j2;
        C1694pQ c1694pQ = this.h;
        while (true) {
            AbstractC0048Bt.k(c1694pQ);
            long j4 = c1694pQ.c - c1694pQ.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c1694pQ = c1694pQ.f;
        }
        C1694pQ c1694pQ2 = c1694pQ;
        long j5 = j2;
        while (j5 > 0) {
            AbstractC0048Bt.k(c1694pQ2);
            C1694pQ c = c1694pQ2.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            C1694pQ c1694pQ3 = g8.h;
            if (c1694pQ3 == null) {
                c.g = c;
                c.f = c;
                g8.h = c;
            } else {
                C1694pQ c1694pQ4 = c1694pQ3.g;
                AbstractC0048Bt.k(c1694pQ4);
                c1694pQ4.b(c);
            }
            j5 -= c.c - c.b;
            c1694pQ2 = c1694pQ2.f;
            j3 = 0;
        }
    }

    @Override // o.N8
    public final boolean l(long j) {
        return this.i >= j;
    }

    public final boolean m() {
        return this.i == 0;
    }

    @Override // o.N8
    public final String n() {
        return u(Long.MAX_VALUE);
    }

    @Override // o.N8
    public final long o(M8 m8) {
        AbstractC0048Bt.n(m8, "sink");
        long j = this.i;
        if (j > 0) {
            m8.write(this, j);
        }
        return j;
    }

    @Override // o.N8
    public final byte[] p() {
        return B(this.i);
    }

    @Override // o.N8
    public final JL peek() {
        return AbstractC0946e20.h(new FH(this));
    }

    public final byte q(long j) {
        EB.f(this.i, j, 1L);
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            AbstractC0048Bt.k(null);
            throw null;
        }
        long j2 = this.i;
        if (j2 - j < j) {
            while (j2 > j) {
                c1694pQ = c1694pQ.g;
                AbstractC0048Bt.k(c1694pQ);
                j2 -= c1694pQ.c - c1694pQ.b;
            }
            return c1694pQ.a[(int) ((c1694pQ.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c1694pQ.c;
            int i2 = c1694pQ.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return c1694pQ.a[(int) ((i2 + j) - j3)];
            }
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j3 = j4;
        }
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 r(C1347k9 c1347k9) {
        M(c1347k9);
        return this;
    }

    @Override // o.HS
    public final long read(G8 g8, long j) {
        AbstractC0048Bt.n(g8, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        g8.write(this, j);
        return j;
    }

    @Override // o.N8
    public final byte readByte() {
        if (this.i == 0) {
            throw new EOFException();
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        int i = c1694pQ.b;
        int i2 = c1694pQ.c;
        int i3 = i + 1;
        byte b = c1694pQ.a[i];
        this.i--;
        if (i3 != i2) {
            c1694pQ.b = i3;
            return b;
        }
        this.h = c1694pQ.a();
        AbstractC1825rQ.a(c1694pQ);
        return b;
    }

    @Override // o.N8
    public final int readInt() {
        if (this.i < 4) {
            throw new EOFException();
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        int i = c1694pQ.b;
        int i2 = c1694pQ.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c1694pQ.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.i -= 4;
        if (i5 != i2) {
            c1694pQ.b = i5;
            return i6;
        }
        this.h = c1694pQ.a();
        AbstractC1825rQ.a(c1694pQ);
        return i6;
    }

    @Override // o.N8
    public final short readShort() {
        if (this.i < 2) {
            throw new EOFException();
        }
        C1694pQ c1694pQ = this.h;
        AbstractC0048Bt.k(c1694pQ);
        int i = c1694pQ.b;
        int i2 = c1694pQ.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c1694pQ.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.i -= 2;
        if (i5 == i2) {
            this.h = c1694pQ.a();
            AbstractC1825rQ.a(c1694pQ);
        } else {
            c1694pQ.b = i5;
        }
        return (short) i6;
    }

    @Override // o.N8
    public final long s(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "bytes");
        return v(c1347k9, 0L);
    }

    @Override // o.N8
    public final void skip(long j) {
        while (j > 0) {
            C1694pQ c1694pQ = this.h;
            if (c1694pQ == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, c1694pQ.c - c1694pQ.b);
            long j2 = min;
            this.i -= j2;
            j -= j2;
            int i = c1694pQ.b + min;
            c1694pQ.b = i;
            if (i == c1694pQ.c) {
                this.h = c1694pQ.a();
                AbstractC1825rQ.a(c1694pQ);
            }
        }
    }

    public final long t(byte b, long j, long j2) {
        C1694pQ c1694pQ;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.i + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.i;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c1694pQ = this.h) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c1694pQ = c1694pQ.g;
                AbstractC0048Bt.k(c1694pQ);
                j4 -= c1694pQ.c - c1694pQ.b;
            }
            while (j4 < j2) {
                byte[] bArr = c1694pQ.a;
                int min = (int) Math.min(c1694pQ.c, (c1694pQ.b + j2) - j4);
                for (int i = (int) ((c1694pQ.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - c1694pQ.b) + j4;
                    }
                }
                j4 += c1694pQ.c - c1694pQ.b;
                c1694pQ = c1694pQ.f;
                AbstractC0048Bt.k(c1694pQ);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (c1694pQ.c - c1694pQ.b) + j3;
            if (j5 > j) {
                break;
            }
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c1694pQ.a;
            int min2 = (int) Math.min(c1694pQ.c, (c1694pQ.b + j2) - j3);
            for (int i2 = (int) ((c1694pQ.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - c1694pQ.b) + j3;
                }
            }
            j3 += c1694pQ.c - c1694pQ.b;
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j = j3;
        }
        return -1L;
    }

    @Override // o.HS
    public final NV timeout() {
        return NV.d;
    }

    public final String toString() {
        long j = this.i;
        if (j <= 2147483647L) {
            return K((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.i).toString());
    }

    @Override // o.N8
    public final String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("limit < 0: ", j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long t = t((byte) 10, 0L, j2);
        if (t != -1) {
            return AbstractC0744b.b(this, t);
        }
        if (j2 < this.i && q(j2 - 1) == 13 && q(j2) == 10) {
            return AbstractC0744b.b(this, j2);
        }
        G8 g8 = new G8();
        k(g8, 0L, Math.min(32, this.i));
        throw new EOFException("\\n not found: limit=" + Math.min(this.i, j) + " content=" + g8.i(g8.i).c() + (char) 8230);
    }

    public final long v(C1347k9 c1347k9, long j) {
        AbstractC0048Bt.n(c1347k9, "bytes");
        if (c1347k9.b() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("fromIndex < 0: ", j).toString());
        }
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            return -1L;
        }
        long j3 = this.i;
        if (j3 - j < j) {
            while (j3 > j) {
                c1694pQ = c1694pQ.g;
                AbstractC0048Bt.k(c1694pQ);
                j3 -= c1694pQ.c - c1694pQ.b;
            }
            byte[] f = c1347k9.f();
            byte b = f[0];
            int b2 = c1347k9.b();
            long j4 = (this.i - b2) + 1;
            while (j3 < j4) {
                byte[] bArr = c1694pQ.a;
                int min = (int) Math.min(c1694pQ.c, (c1694pQ.b + j4) - j3);
                for (int i = (int) ((c1694pQ.b + j) - j3); i < min; i++) {
                    if (bArr[i] == b && AbstractC0744b.a(c1694pQ, i + 1, f, b2)) {
                        return (i - c1694pQ.b) + j3;
                    }
                }
                j3 += c1694pQ.c - c1694pQ.b;
                c1694pQ = c1694pQ.f;
                AbstractC0048Bt.k(c1694pQ);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j5 = (c1694pQ.c - c1694pQ.b) + j2;
            if (j5 > j) {
                break;
            }
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j2 = j5;
        }
        byte[] f2 = c1347k9.f();
        byte b3 = f2[0];
        int b4 = c1347k9.b();
        long j6 = (this.i - b4) + 1;
        while (j2 < j6) {
            byte[] bArr2 = c1694pQ.a;
            int min2 = (int) Math.min(c1694pQ.c, (c1694pQ.b + j6) - j2);
            for (int i2 = (int) ((c1694pQ.b + j) - j2); i2 < min2; i2++) {
                if (bArr2[i2] == b3 && AbstractC0744b.a(c1694pQ, i2 + 1, f2, b4)) {
                    return (i2 - c1694pQ.b) + j2;
                }
            }
            j2 += c1694pQ.c - c1694pQ.b;
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j = j2;
        }
        return -1L;
    }

    @Override // o.N8
    public final int w(NG ng) {
        AbstractC0048Bt.n(ng, "options");
        int c = AbstractC0744b.c(this, ng, false);
        if (c == -1) {
            return -1;
        }
        skip(ng.h[c].b());
        return c;
    }

    @Override // o.M8
    public final M8 write(byte[] bArr) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.PARAM_SOURCE);
        m5write(bArr, 0, bArr.length);
        return this;
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 writeByte(int i) {
        N(i);
        return this;
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 writeInt(int i) {
        Q(i);
        return this;
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 writeShort(int i) {
        R(i);
        return this;
    }

    public final long x(C1347k9 c1347k9, long j) {
        AbstractC0048Bt.n(c1347k9, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("fromIndex < 0: ", j).toString());
        }
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            return -1L;
        }
        long j3 = this.i;
        if (j3 - j < j) {
            while (j3 > j) {
                c1694pQ = c1694pQ.g;
                AbstractC0048Bt.k(c1694pQ);
                j3 -= c1694pQ.c - c1694pQ.b;
            }
            if (c1347k9.b() == 2) {
                byte g = c1347k9.g(0);
                byte g2 = c1347k9.g(1);
                while (j3 < this.i) {
                    byte[] bArr = c1694pQ.a;
                    int i = c1694pQ.c;
                    for (int i2 = (int) ((c1694pQ.b + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == g || b == g2) {
                            return (i2 - c1694pQ.b) + j3;
                        }
                    }
                    j3 += c1694pQ.c - c1694pQ.b;
                    c1694pQ = c1694pQ.f;
                    AbstractC0048Bt.k(c1694pQ);
                    j = j3;
                }
            } else {
                byte[] f = c1347k9.f();
                while (j3 < this.i) {
                    byte[] bArr2 = c1694pQ.a;
                    int i3 = c1694pQ.c;
                    for (int i4 = (int) ((c1694pQ.b + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : f) {
                            if (b2 == b3) {
                                return (i4 - c1694pQ.b) + j3;
                            }
                        }
                    }
                    j3 += c1694pQ.c - c1694pQ.b;
                    c1694pQ = c1694pQ.f;
                    AbstractC0048Bt.k(c1694pQ);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (c1694pQ.c - c1694pQ.b) + j2;
            if (j4 > j) {
                break;
            }
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j2 = j4;
        }
        if (c1347k9.b() == 2) {
            byte g3 = c1347k9.g(0);
            byte g4 = c1347k9.g(1);
            while (j2 < this.i) {
                byte[] bArr3 = c1694pQ.a;
                int i5 = c1694pQ.c;
                for (int i6 = (int) ((c1694pQ.b + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == g3 || b4 == g4) {
                        return (i6 - c1694pQ.b) + j2;
                    }
                }
                j2 += c1694pQ.c - c1694pQ.b;
                c1694pQ = c1694pQ.f;
                AbstractC0048Bt.k(c1694pQ);
                j = j2;
            }
        } else {
            byte[] f2 = c1347k9.f();
            while (j2 < this.i) {
                byte[] bArr4 = c1694pQ.a;
                int i7 = c1694pQ.c;
                for (int i8 = (int) ((c1694pQ.b + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : f2) {
                        if (b5 == b6) {
                            return (i8 - c1694pQ.b) + j2;
                        }
                    }
                }
                j2 += c1694pQ.c - c1694pQ.b;
                c1694pQ = c1694pQ.f;
                AbstractC0048Bt.k(c1694pQ);
                j = j2;
            }
        }
        return -1L;
    }

    @Override // o.N8
    public final void y(long j) {
        if (this.i < j) {
            throw new EOFException();
        }
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 z(String str) {
        S(str);
        return this;
    }

    @Override // o.M8
    public final /* bridge */ /* synthetic */ M8 write(byte[] bArr, int i, int i2) {
        m5write(bArr, i, i2);
        return this;
    }

    @Override // o.YR
    public final void write(G8 g8, long j) {
        C1694pQ b;
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        if (g8 != this) {
            EB.f(g8.i, 0L, j);
            while (j > 0) {
                C1694pQ c1694pQ = g8.h;
                AbstractC0048Bt.k(c1694pQ);
                int i = c1694pQ.c;
                C1694pQ c1694pQ2 = g8.h;
                AbstractC0048Bt.k(c1694pQ2);
                long j2 = i - c1694pQ2.b;
                int i2 = 0;
                if (j < j2) {
                    C1694pQ c1694pQ3 = this.h;
                    C1694pQ c1694pQ4 = c1694pQ3 != null ? c1694pQ3.g : null;
                    if (c1694pQ4 != null && c1694pQ4.e) {
                        if ((c1694pQ4.c + j) - (c1694pQ4.d ? 0 : c1694pQ4.b) <= 8192) {
                            C1694pQ c1694pQ5 = g8.h;
                            AbstractC0048Bt.k(c1694pQ5);
                            c1694pQ5.d(c1694pQ4, (int) j);
                            g8.i -= j;
                            this.i += j;
                            return;
                        }
                    }
                    C1694pQ c1694pQ6 = g8.h;
                    AbstractC0048Bt.k(c1694pQ6);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= c1694pQ6.c - c1694pQ6.b) {
                        if (i3 >= 1024) {
                            b = c1694pQ6.c();
                        } else {
                            b = AbstractC1825rQ.b();
                            byte[] bArr = c1694pQ6.a;
                            byte[] bArr2 = b.a;
                            int i4 = c1694pQ6.b;
                            P6.Z(0, i4, i4 + i3, bArr, bArr2);
                        }
                        b.c = b.b + i3;
                        c1694pQ6.b += i3;
                        C1694pQ c1694pQ7 = c1694pQ6.g;
                        AbstractC0048Bt.k(c1694pQ7);
                        c1694pQ7.b(b);
                        g8.h = b;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C1694pQ c1694pQ8 = g8.h;
                AbstractC0048Bt.k(c1694pQ8);
                long j3 = c1694pQ8.c - c1694pQ8.b;
                g8.h = c1694pQ8.a();
                C1694pQ c1694pQ9 = this.h;
                if (c1694pQ9 == null) {
                    this.h = c1694pQ8;
                    c1694pQ8.g = c1694pQ8;
                    c1694pQ8.f = c1694pQ8;
                } else {
                    C1694pQ c1694pQ10 = c1694pQ9.g;
                    AbstractC0048Bt.k(c1694pQ10);
                    c1694pQ10.b(c1694pQ8);
                    C1694pQ c1694pQ11 = c1694pQ8.g;
                    if (c1694pQ11 != c1694pQ8) {
                        AbstractC0048Bt.k(c1694pQ11);
                        if (c1694pQ11.e) {
                            int i5 = c1694pQ8.c - c1694pQ8.b;
                            C1694pQ c1694pQ12 = c1694pQ8.g;
                            AbstractC0048Bt.k(c1694pQ12);
                            int i6 = 8192 - c1694pQ12.c;
                            C1694pQ c1694pQ13 = c1694pQ8.g;
                            AbstractC0048Bt.k(c1694pQ13);
                            if (!c1694pQ13.d) {
                                C1694pQ c1694pQ14 = c1694pQ8.g;
                                AbstractC0048Bt.k(c1694pQ14);
                                i2 = c1694pQ14.b;
                            }
                            if (i5 <= i6 + i2) {
                                C1694pQ c1694pQ15 = c1694pQ8.g;
                                AbstractC0048Bt.k(c1694pQ15);
                                c1694pQ8.d(c1694pQ15, i5);
                                c1694pQ8.a();
                                AbstractC1825rQ.a(c1694pQ8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                g8.i -= j3;
                this.i += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC0048Bt.n(byteBuffer, "sink");
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c1694pQ.c - c1694pQ.b);
        byteBuffer.put(c1694pQ.a, c1694pQ.b, min);
        int i = c1694pQ.b + min;
        c1694pQ.b = i;
        this.i -= min;
        if (i == c1694pQ.c) {
            this.h = c1694pQ.a();
            AbstractC1825rQ.a(c1694pQ);
        }
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        EB.f(bArr.length, i, i2);
        C1694pQ c1694pQ = this.h;
        if (c1694pQ == null) {
            return -1;
        }
        int min = Math.min(i2, c1694pQ.c - c1694pQ.b);
        byte[] bArr2 = c1694pQ.a;
        int i3 = c1694pQ.b;
        P6.Z(i, i3, i3 + min, bArr2, bArr);
        int i4 = c1694pQ.b + min;
        c1694pQ.b = i4;
        this.i -= min;
        if (i4 == c1694pQ.c) {
            this.h = c1694pQ.a();
            AbstractC1825rQ.a(c1694pQ);
        }
        return min;
    }

    @Override // o.N8, o.M8
    public final G8 a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.YR
    public final void close() {
    }

    @Override // o.M8, o.YR, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC0048Bt.n(byteBuffer, Constants.ScionAnalytics.PARAM_SOURCE);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C1694pQ L = L(1);
            int min = Math.min(i, 8192 - L.c);
            byteBuffer.get(L.a, L.c, min);
            i -= min;
            L.c += min;
        }
        this.i += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m5write(byte[] bArr, int i, int i2) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.PARAM_SOURCE);
        long j = i2;
        EB.f(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C1694pQ L = L(1);
            int min = Math.min(i3 - i, 8192 - L.c);
            int i4 = i + min;
            P6.Z(L.c, i, i4, bArr, L.a);
            L.c += min;
            i = i4;
        }
        this.i += j;
    }
}
