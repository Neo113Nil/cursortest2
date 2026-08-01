package K1;

import E1.AbstractC0001b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f745a;

    /* renamed from: b, reason: collision with root package name */
    public long f746b;

    public final int D() {
        if (this.f746b < 4) {
            throw new EOFException();
        }
        q qVar = this.f745a;
        i1.f.b(qVar);
        int i = qVar.f768b;
        int i2 = qVar.f769c;
        if (i2 - i < 4) {
            return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
        }
        byte[] bArr = qVar.f767a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f746b -= 4;
        if (i5 == i2) {
            this.f745a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f768b = i5;
        }
        return i6;
    }

    public final short E() {
        if (this.f746b < 2) {
            throw new EOFException();
        }
        q qVar = this.f745a;
        i1.f.b(qVar);
        int i = qVar.f768b;
        int i2 = qVar.f769c;
        if (i2 - i < 2) {
            return (short) (((h() & 255) << 8) | (h() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = qVar.f767a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f746b -= 2;
        if (i5 == i2) {
            this.f745a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f768b = i5;
        }
        return (short) i6;
    }

    public final String F(long j2, Charset charset) {
        i1.f.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f746b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        q qVar = this.f745a;
        i1.f.b(qVar);
        int i = qVar.f768b;
        if (i + j2 > qVar.f769c) {
            return new String(i(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(qVar.f767a, i, i2, charset);
        int i3 = qVar.f768b + i2;
        qVar.f768b = i3;
        this.f746b -= j2;
        if (i3 == qVar.f769c) {
            this.f745a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final void G(long j2) {
        while (j2 > 0) {
            q qVar = this.f745a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, qVar.f769c - qVar.f768b);
            long j3 = min;
            this.f746b -= j3;
            j2 -= j3;
            int i = qVar.f768b + min;
            qVar.f768b = i;
            if (i == qVar.f769c) {
                this.f745a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final i H(int i) {
        if (i == 0) {
            return i.d;
        }
        F1.d.p(this.f746b, 0L, i);
        q qVar = this.f745a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            i1.f.b(qVar);
            int i5 = qVar.f769c;
            int i6 = qVar.f768b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            qVar = qVar.f771f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        q qVar2 = this.f745a;
        int i7 = 0;
        while (i2 < i) {
            i1.f.b(qVar2);
            bArr[i7] = qVar2.f767a;
            i2 += qVar2.f769c - qVar2.f768b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qVar2.f768b;
            qVar2.d = true;
            i7++;
            qVar2 = qVar2.f771f;
        }
        return new s(bArr, iArr);
    }

    public final q I(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f745a;
        if (qVar == null) {
            q b2 = r.b();
            this.f745a = b2;
            b2.f772g = b2;
            b2.f771f = b2;
            return b2;
        }
        q qVar2 = qVar.f772g;
        i1.f.b(qVar2);
        if (qVar2.f769c + i <= 8192 && qVar2.f770e) {
            return qVar2;
        }
        q b3 = r.b();
        qVar2.b(b3);
        return b3;
    }

    public final void J(int i, int i2, byte[] bArr) {
        i1.f.e(bArr, "source");
        long j2 = i2;
        F1.d.p(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            q I2 = I(1);
            int min = Math.min(i3 - i, 8192 - I2.f769c);
            int i4 = i + min;
            W0.i.s0(I2.f769c, i, i4, bArr, I2.f767a);
            I2.f769c += min;
            i = i4;
        }
        this.f746b += j2;
    }

    public final void K(i iVar) {
        i1.f.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void L(v vVar) {
        i1.f.e(vVar, "source");
        while (vVar.z(this, 8192L) != -1) {
        }
    }

    public final void M(int i) {
        q I2 = I(1);
        int i2 = I2.f769c;
        I2.f769c = i2 + 1;
        I2.f767a[i2] = (byte) i;
        this.f746b++;
    }

    public final void N(long j2) {
        if (j2 == 0) {
            M(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        q I2 = I(i);
        int i2 = I2.f769c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            I2.f767a[i3] = L1.a.f807a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        I2.f769c += i;
        this.f746b += i;
    }

    public final void O(int i) {
        q I2 = I(4);
        int i2 = I2.f769c;
        byte[] bArr = I2.f767a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        I2.f769c = i2 + 4;
        this.f746b += 4;
    }

    public final void P(String str) {
        i1.f.e(str, "string");
        Q(str, 0, str.length());
    }

    public final void Q(String str, int i, int i2) {
        char charAt;
        i1.f.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0001b.f("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0001b.d(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                q I2 = I(1);
                int i3 = I2.f769c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = I2.f767a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = I2.f769c;
                int i6 = (i3 + i) - i5;
                I2.f769c = i5 + i6;
                this.f746b += i6;
            } else {
                if (charAt2 < 2048) {
                    q I3 = I(2);
                    int i7 = I3.f769c;
                    byte[] bArr2 = I3.f767a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    I3.f769c = i7 + 2;
                    this.f746b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q I4 = I(3);
                    int i8 = I4.f769c;
                    byte[] bArr3 = I4.f767a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    I4.f769c = i8 + 3;
                    this.f746b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        M(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q I5 = I(4);
                        int i11 = I5.f769c;
                        byte[] bArr4 = I5.f767a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        I5.f769c = i11 + 4;
                        this.f746b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void R(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            M(i);
            return;
        }
        if (i < 2048) {
            q I2 = I(2);
            int i3 = I2.f769c;
            byte[] bArr = I2.f767a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            I2.f769c = i3 + 2;
            this.f746b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            M(63);
            return;
        }
        if (i < 65536) {
            q I3 = I(3);
            int i4 = I3.f769c;
            byte[] bArr2 = I3.f767a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            I3.f769c = i4 + 3;
            this.f746b += 3;
            return;
        }
        if (i <= 1114111) {
            q I4 = I(4);
            int i5 = I4.f769c;
            byte[] bArr3 = I4.f767a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            I4.f769c = i5 + 4;
            this.f746b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = L1.b.f808a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: 8, size: 8");
            }
            if (i2 > 8) {
                throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: 8");
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean a() {
        return this.f746b == 0;
    }

    @Override // K1.v
    public final x b() {
        return x.d;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f746b != 0) {
            q qVar = this.f745a;
            i1.f.b(qVar);
            q c2 = qVar.c();
            fVar.f745a = c2;
            c2.f772g = c2;
            c2.f771f = c2;
            for (q qVar2 = qVar.f771f; qVar2 != qVar; qVar2 = qVar2.f771f) {
                q qVar3 = c2.f772g;
                i1.f.b(qVar3);
                i1.f.b(qVar2);
                qVar3.b(qVar2.c());
            }
            fVar.f746b = this.f746b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, K1.t
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f746b;
                f fVar = (f) obj;
                if (j2 == fVar.f746b) {
                    if (j2 != 0) {
                        q qVar = this.f745a;
                        i1.f.b(qVar);
                        q qVar2 = fVar.f745a;
                        i1.f.b(qVar2);
                        int i = qVar.f768b;
                        int i2 = qVar2.f768b;
                        long j3 = 0;
                        while (j3 < this.f746b) {
                            long min = Math.min(qVar.f769c - i, qVar2.f769c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = qVar.f767a[i];
                                int i4 = i2 + 1;
                                if (b2 == qVar2.f767a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == qVar.f769c) {
                                q qVar3 = qVar.f771f;
                                i1.f.b(qVar3);
                                i = qVar3.f768b;
                                qVar = qVar3;
                            }
                            if (i2 == qVar2.f769c) {
                                qVar2 = qVar2.f771f;
                                i1.f.b(qVar2);
                                i2 = qVar2.f768b;
                            }
                            j3 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte f(long j2) {
        F1.d.p(this.f746b, j2, 1L);
        q qVar = this.f745a;
        if (qVar == null) {
            i1.f.b(null);
            throw null;
        }
        long j3 = this.f746b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                qVar = qVar.f772g;
                i1.f.b(qVar);
                j3 -= qVar.f769c - qVar.f768b;
            }
            return qVar.f767a[(int) ((qVar.f768b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = qVar.f769c;
            int i2 = qVar.f768b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return qVar.f767a[(int) ((i2 + j2) - j4)];
            }
            qVar = qVar.f771f;
            i1.f.b(qVar);
            j4 = j5;
        }
    }

    @Override // K1.t, java.io.Flushable
    public final void flush() {
    }

    @Override // K1.h
    public final int g(n nVar) {
        i1.f.e(nVar, "options");
        int b2 = L1.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        G(nVar.f759a[b2].a());
        return b2;
    }

    public final byte h() {
        if (this.f746b == 0) {
            throw new EOFException();
        }
        q qVar = this.f745a;
        i1.f.b(qVar);
        int i = qVar.f768b;
        int i2 = qVar.f769c;
        int i3 = i + 1;
        byte b2 = qVar.f767a[i];
        this.f746b--;
        if (i3 == i2) {
            this.f745a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f768b = i3;
        }
        return b2;
    }

    public final int hashCode() {
        q qVar = this.f745a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f769c;
            for (int i3 = qVar.f768b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f767a[i3];
            }
            qVar = qVar.f771f;
            i1.f.b(qVar);
        } while (qVar != this.f745a);
        return i;
    }

    public final byte[] i(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f746b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            F1.d.p(i, i2, i3);
            q qVar = this.f745a;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, qVar.f769c - qVar.f768b);
                int i4 = qVar.f768b;
                W0.i.s0(i2, i4, i4 + min, qVar.f767a, bArr);
                int i5 = qVar.f768b + min;
                qVar.f768b = i5;
                this.f746b -= min;
                if (i5 == qVar.f769c) {
                    this.f745a = qVar.a();
                    r.a(qVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i2 += min;
        }
        return bArr;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // K1.g
    public final /* bridge */ /* synthetic */ g o(String str) {
        P(str);
        return this;
    }

    public final i q(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f746b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new i(i(j2));
        }
        i H2 = H((int) j2);
        G(j2);
        return H2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        i1.f.e(byteBuffer, "sink");
        q qVar = this.f745a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f769c - qVar.f768b);
        byteBuffer.put(qVar.f767a, qVar.f768b, min);
        int i = qVar.f768b + min;
        qVar.f768b = i;
        this.f746b -= min;
        if (i == qVar.f769c) {
            this.f745a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final String toString() {
        long j2 = this.f746b;
        if (j2 <= 2147483647L) {
            return H((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f746b).toString());
    }

    @Override // K1.t
    public final void u(f fVar, long j2) {
        q b2;
        i1.f.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        F1.d.p(fVar.f746b, 0L, j2);
        while (j2 > 0) {
            q qVar = fVar.f745a;
            i1.f.b(qVar);
            int i = qVar.f769c;
            q qVar2 = fVar.f745a;
            i1.f.b(qVar2);
            long j3 = i - qVar2.f768b;
            int i2 = 0;
            if (j2 < j3) {
                q qVar3 = this.f745a;
                q qVar4 = qVar3 != null ? qVar3.f772g : null;
                if (qVar4 != null && qVar4.f770e) {
                    if ((qVar4.f769c + j2) - (qVar4.d ? 0 : qVar4.f768b) <= 8192) {
                        q qVar5 = fVar.f745a;
                        i1.f.b(qVar5);
                        qVar5.d(qVar4, (int) j2);
                        fVar.f746b -= j2;
                        this.f746b += j2;
                        return;
                    }
                }
                q qVar6 = fVar.f745a;
                i1.f.b(qVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > qVar6.f769c - qVar6.f768b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    int i4 = qVar6.f768b;
                    W0.i.s0(0, i4, i4 + i3, qVar6.f767a, b2.f767a);
                }
                b2.f769c = b2.f768b + i3;
                qVar6.f768b += i3;
                q qVar7 = qVar6.f772g;
                i1.f.b(qVar7);
                qVar7.b(b2);
                fVar.f745a = b2;
            }
            q qVar8 = fVar.f745a;
            i1.f.b(qVar8);
            long j4 = qVar8.f769c - qVar8.f768b;
            fVar.f745a = qVar8.a();
            q qVar9 = this.f745a;
            if (qVar9 == null) {
                this.f745a = qVar8;
                qVar8.f772g = qVar8;
                qVar8.f771f = qVar8;
            } else {
                q qVar10 = qVar9.f772g;
                i1.f.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f772g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                i1.f.b(qVar11);
                if (qVar11.f770e) {
                    int i5 = qVar8.f769c - qVar8.f768b;
                    q qVar12 = qVar8.f772g;
                    i1.f.b(qVar12);
                    int i6 = 8192 - qVar12.f769c;
                    q qVar13 = qVar8.f772g;
                    i1.f.b(qVar13);
                    if (!qVar13.d) {
                        q qVar14 = qVar8.f772g;
                        i1.f.b(qVar14);
                        i2 = qVar14.f768b;
                    }
                    if (i5 <= i6 + i2) {
                        q qVar15 = qVar8.f772g;
                        i1.f.b(qVar15);
                        qVar8.d(qVar15, i5);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f746b -= j4;
            this.f746b += j4;
            j2 -= j4;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        i1.f.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q I2 = I(1);
            int min = Math.min(i, 8192 - I2.f769c);
            byteBuffer.get(I2.f767a, I2.f769c, min);
            i -= min;
            I2.f769c += min;
        }
        this.f746b += remaining;
        return remaining;
    }

    @Override // K1.h
    public final String y(Charset charset) {
        return F(this.f746b, charset);
    }

    @Override // K1.v
    public final long z(f fVar, long j2) {
        i1.f.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f746b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.u(this, j2);
        return j2;
    }
}
