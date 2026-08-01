package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class m8 implements o8, n8, Cloneable, ByteChannel {
    public e10 f;
    public long g;

    public final void A(String str) {
        str.getClass();
        B(str, 0, str.length());
    }

    public final void B(String str, int i, int i2) {
        char charAt;
        str.getClass();
        if (i < 0) {
            l8.e(n20.e("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            l8.e(n20.d(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            l8.n("endIndex > string.length: ", i2, " > ", str.length());
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                e10 t = t(1);
                byte[] bArr = t.a;
                int i3 = t.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = t.c;
                int i6 = (i3 + i) - i5;
                t.c = i5 + i6;
                this.g += i6;
            } else {
                if (charAt2 < 2048) {
                    e10 t2 = t(2);
                    byte[] bArr2 = t2.a;
                    int i7 = t2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    t2.c = i7 + 2;
                    this.g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    e10 t3 = t(3);
                    byte[] bArr3 = t3.a;
                    int i8 = t3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    t3.c = i8 + 3;
                    this.g += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        w(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        e10 t4 = t(4);
                        byte[] bArr4 = t4.a;
                        int i11 = t4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        t4.c = i11 + 4;
                        this.g += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void C(int i) {
        String str;
        if (i < 128) {
            w(i);
            return;
        }
        if (i < 2048) {
            e10 t = t(2);
            byte[] bArr = t.a;
            int i2 = t.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            t.c = i2 + 2;
            this.g += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            w(63);
            return;
        }
        if (i < 65536) {
            e10 t2 = t(3);
            byte[] bArr2 = t2.a;
            int i3 = t2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            t2.c = i3 + 3;
            this.g += 3;
            return;
        }
        if (i <= 1114111) {
            e10 t3 = t(4);
            byte[] bArr3 = t3.a;
            int i4 = t3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            t3.c = i4 + 4;
            this.g += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = g8.a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: 8, size: 8");
            }
            if (i5 > 8) {
                l8.d(i5, " > endIndex: 8", "startIndex: ");
                return;
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.p20
    public final e50 a() {
        return e50.d;
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        m8Var.getClass();
        if (j < 0) {
            l8.o("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        m8Var.e(j, this);
        return j;
    }

    @Override // defpackage.o8
    public final r8 c(long j) {
        if (j < 0 || j > 2147483647L) {
            l8.o("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new r8(q(j));
        }
        r8 s = s((int) j);
        skip(j);
        return s;
    }

    public final Object clone() {
        m8 m8Var = new m8();
        if (this.g == 0) {
            return m8Var;
        }
        e10 e10Var = this.f;
        e10Var.getClass();
        e10 c = e10Var.c();
        m8Var.f = c;
        c.g = c;
        c.f = c;
        for (e10 e10Var2 = e10Var.f; e10Var2 != e10Var; e10Var2 = e10Var2.f) {
            e10 e10Var3 = c.g;
            e10Var3.getClass();
            e10Var2.getClass();
            e10Var3.b(e10Var2.c());
        }
        m8Var.g = this.g;
        return m8Var;
    }

    @Override // defpackage.o8
    public final String d() {
        return f(Long.MAX_VALUE);
    }

    @Override // defpackage.f20
    public final void e(long j, m8 m8Var) {
        e10 b;
        m8Var.getClass();
        if (m8Var == this) {
            l8.l("source == this");
            return;
        }
        vv.f(m8Var.g, 0L, j);
        while (j > 0) {
            e10 e10Var = m8Var.f;
            e10Var.getClass();
            int i = e10Var.c;
            e10 e10Var2 = m8Var.f;
            e10Var2.getClass();
            long j2 = i - e10Var2.b;
            int i2 = 0;
            if (j < j2) {
                e10 e10Var3 = this.f;
                e10 e10Var4 = e10Var3 != null ? e10Var3.g : null;
                if (e10Var4 != null && e10Var4.e) {
                    if ((e10Var4.c + j) - (e10Var4.d ? 0 : e10Var4.b) <= 8192) {
                        e10 e10Var5 = m8Var.f;
                        e10Var5.getClass();
                        e10Var5.d(e10Var4, (int) j);
                        m8Var.g -= j;
                        this.g += j;
                        return;
                    }
                }
                e10 e10Var6 = m8Var.f;
                e10Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > e10Var6.c - e10Var6.b) {
                    l8.l("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = e10Var6.c();
                } else {
                    b = f10.b();
                    byte[] bArr = e10Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = e10Var6.b;
                    o6.n0(bArr, bArr2, 0, i4, i4 + i3);
                }
                b.c = b.b + i3;
                e10Var6.b += i3;
                e10 e10Var7 = e10Var6.g;
                e10Var7.getClass();
                e10Var7.b(b);
                m8Var.f = b;
            }
            e10 e10Var8 = m8Var.f;
            e10Var8.getClass();
            long j3 = e10Var8.c - e10Var8.b;
            m8Var.f = e10Var8.a();
            e10 e10Var9 = this.f;
            if (e10Var9 == null) {
                this.f = e10Var8;
                e10Var8.g = e10Var8;
                e10Var8.f = e10Var8;
            } else {
                e10 e10Var10 = e10Var9.g;
                e10Var10.getClass();
                e10Var10.b(e10Var8);
                e10 e10Var11 = e10Var8.g;
                if (e10Var11 == e10Var8) {
                    l8.u("cannot compact");
                    return;
                }
                e10Var11.getClass();
                if (e10Var11.e) {
                    int i5 = e10Var8.c - e10Var8.b;
                    e10 e10Var12 = e10Var8.g;
                    e10Var12.getClass();
                    int i6 = 8192 - e10Var12.c;
                    e10 e10Var13 = e10Var8.g;
                    e10Var13.getClass();
                    if (!e10Var13.d) {
                        e10 e10Var14 = e10Var8.g;
                        e10Var14.getClass();
                        i2 = e10Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        e10 e10Var15 = e10Var8.g;
                        e10Var15.getClass();
                        e10Var8.d(e10Var15, i5);
                        e10Var8.a();
                        f10.a(e10Var8);
                    }
                }
            }
            m8Var.g -= j3;
            this.g += j3;
            j -= j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        long j = this.g;
        m8 m8Var = (m8) obj;
        if (j != m8Var.g) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        e10 e10Var = this.f;
        e10Var.getClass();
        e10 e10Var2 = m8Var.f;
        e10Var2.getClass();
        int i = e10Var.b;
        int i2 = e10Var2.b;
        long j2 = 0;
        while (j2 < this.g) {
            long min = Math.min(e10Var.c - i, e10Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (e10Var.a[i] != e10Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == e10Var.c) {
                e10Var = e10Var.f;
                e10Var.getClass();
                i = e10Var.b;
            }
            if (i2 == e10Var2.c) {
                e10Var2 = e10Var2.f;
                e10Var2.getClass();
                i2 = e10Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.o8
    public final String f(long j) {
        if (j < 0) {
            l8.o("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long p = p((byte) 10, 0L, j2);
        if (p != -1) {
            return b.a(p, this);
        }
        if (j2 < this.g && o(j2 - 1) == 13 && o(j2) == 10) {
            return b.a(j2, this);
        }
        m8 m8Var = new m8();
        m(m8Var, 0L, Math.min(32L, this.g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.g, j) + " content=" + m8Var.c(m8Var.g).b() + (char) 8230);
    }

    @Override // defpackage.o8
    public final int g(xv xvVar) {
        xvVar.getClass();
        int b = b.b(this, xvVar, false);
        if (b == -1) {
            return -1;
        }
        skip(xvVar.f[b].a());
        return b;
    }

    @Override // defpackage.o8
    public final void h(long j) {
        if (this.g < j) {
            throw new EOFException();
        }
    }

    public final int hashCode() {
        e10 e10Var = this.f;
        if (e10Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = e10Var.c;
            for (int i3 = e10Var.b; i3 < i2; i3++) {
                i = (i * 31) + e10Var.a[i3];
            }
            e10Var = e10Var.f;
            e10Var.getClass();
        } while (e10Var != this.f);
        return i;
    }

    @Override // defpackage.n8
    public final /* bridge */ /* synthetic */ n8 i(String str) {
        A(str);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.n8
    public final n8 j(r8 r8Var) {
        r8Var.getClass();
        r8Var.i(this, r8Var.a());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // defpackage.o8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        int i;
        if (this.g == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            e10 e10Var = this.f;
            e10Var.getClass();
            byte[] bArr = e10Var.a;
            int i3 = e10Var.b;
            int i4 = e10Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = g8.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f = e10Var.a();
                        f10.a(e10Var);
                    } else {
                        e10Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    m8 m8Var = new m8();
                    m8Var.x(j);
                    m8Var.w(b);
                    throw new NumberFormatException("Number too large: ".concat(m8Var.r(m8Var.g, r9.a)));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f != null);
        this.g -= i2;
        return j;
    }

    @Override // defpackage.o8
    public final String l(Charset charset) {
        return r(this.g, charset);
    }

    public final void m(m8 m8Var, long j, long j2) {
        m8Var.getClass();
        long j3 = j;
        vv.f(this.g, j3, j2);
        if (j2 == 0) {
            return;
        }
        m8Var.g += j2;
        e10 e10Var = this.f;
        while (true) {
            e10Var.getClass();
            long j4 = e10Var.c - e10Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            e10Var = e10Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            e10Var.getClass();
            e10 c = e10Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            e10 e10Var2 = m8Var.f;
            if (e10Var2 == null) {
                c.g = c;
                c.f = c;
                m8Var.f = c;
            } else {
                e10 e10Var3 = e10Var2.g;
                e10Var3.getClass();
                e10Var3.b(c);
            }
            j5 -= c.c - c.b;
            e10Var = e10Var.f;
            j3 = 0;
        }
    }

    public final boolean n() {
        return this.g == 0;
    }

    public final byte o(long j) {
        vv.f(this.g, j, 1L);
        e10 e10Var = this.f;
        e10Var.getClass();
        long j2 = this.g;
        if (j2 - j < j) {
            while (j2 > j) {
                e10Var = e10Var.g;
                e10Var.getClass();
                j2 -= e10Var.c - e10Var.b;
            }
            return e10Var.a[(int) ((e10Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = e10Var.c;
            int i2 = e10Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return e10Var.a[(int) ((i2 + j) - j3)];
            }
            e10Var = e10Var.f;
            e10Var.getClass();
            j3 = j4;
        }
    }

    public final long p(byte b, long j, long j2) {
        e10 e10Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.g + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.g;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (e10Var = this.f) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                e10Var = e10Var.g;
                e10Var.getClass();
                j4 -= e10Var.c - e10Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = e10Var.a;
                int min = (int) Math.min(e10Var.c, (e10Var.b + j2) - j4);
                for (int i = (int) ((e10Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - e10Var.b) + j4;
                    }
                }
                j4 += e10Var.c - e10Var.b;
                e10Var = e10Var.f;
                e10Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (e10Var.c - e10Var.b) + j3;
            if (j5 > j) {
                break;
            }
            e10Var = e10Var.f;
            e10Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = e10Var.a;
            int min2 = (int) Math.min(e10Var.c, (e10Var.b + j2) - j3);
            for (int i2 = (int) ((e10Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - e10Var.b) + j3;
                }
            }
            j3 += e10Var.c - e10Var.b;
            e10Var = e10Var.f;
            e10Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final byte[] q(long j) {
        int min;
        if (j < 0 || j > 2147483647L) {
            l8.o("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            vv.f(i, i2, i3);
            e10 e10Var = this.f;
            if (e10Var == null) {
                min = -1;
            } else {
                min = Math.min(i3, e10Var.c - e10Var.b);
                byte[] bArr2 = e10Var.a;
                int i4 = e10Var.b;
                o6.n0(bArr2, bArr, i2, i4, i4 + min);
                int i5 = e10Var.b + min;
                e10Var.b = i5;
                this.g -= min;
                if (i5 == e10Var.c) {
                    this.f = e10Var.a();
                    f10.a(e10Var);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i2 += min;
        }
        return bArr;
    }

    public final String r(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            l8.o("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        e10 e10Var = this.f;
        e10Var.getClass();
        int i = e10Var.b;
        if (i + j > e10Var.c) {
            return new String(q(j), charset);
        }
        int i2 = (int) j;
        String str = new String(e10Var.a, i, i2, charset);
        int i3 = e10Var.b + i2;
        e10Var.b = i3;
        this.g -= j;
        if (i3 == e10Var.c) {
            this.f = e10Var.a();
            f10.a(e10Var);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        e10 e10Var = this.f;
        if (e10Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), e10Var.c - e10Var.b);
        byteBuffer.put(e10Var.a, e10Var.b, min);
        int i = e10Var.b + min;
        e10Var.b = i;
        this.g -= min;
        if (i == e10Var.c) {
            this.f = e10Var.a();
            f10.a(e10Var);
        }
        return min;
    }

    @Override // defpackage.o8
    public final byte readByte() {
        if (this.g == 0) {
            throw new EOFException();
        }
        e10 e10Var = this.f;
        e10Var.getClass();
        int i = e10Var.b;
        int i2 = e10Var.c;
        int i3 = i + 1;
        byte b = e10Var.a[i];
        this.g--;
        if (i3 != i2) {
            e10Var.b = i3;
            return b;
        }
        this.f = e10Var.a();
        f10.a(e10Var);
        return b;
    }

    @Override // defpackage.o8
    public final int readInt() {
        if (this.g < 4) {
            throw new EOFException();
        }
        e10 e10Var = this.f;
        e10Var.getClass();
        int i = e10Var.b;
        int i2 = e10Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = e10Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 4;
        if (i5 != i2) {
            e10Var.b = i5;
            return i6;
        }
        this.f = e10Var.a();
        f10.a(e10Var);
        return i6;
    }

    @Override // defpackage.o8
    public final short readShort() {
        if (this.g < 2) {
            throw new EOFException();
        }
        e10 e10Var = this.f;
        e10Var.getClass();
        int i = e10Var.b;
        int i2 = e10Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = e10Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 2;
        if (i5 == i2) {
            this.f = e10Var.a();
            f10.a(e10Var);
        } else {
            e10Var.b = i5;
        }
        return (short) i6;
    }

    public final r8 s(int i) {
        if (i == 0) {
            return r8.i;
        }
        vv.f(this.g, 0L, i);
        e10 e10Var = this.f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            e10Var.getClass();
            int i5 = e10Var.c;
            int i6 = e10Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            e10Var = e10Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        e10 e10Var2 = this.f;
        int i7 = 0;
        while (i2 < i) {
            e10Var2.getClass();
            bArr[i7] = e10Var2.a;
            i2 += e10Var2.c - e10Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = e10Var2.b;
            e10Var2.d = true;
            i7++;
            e10Var2 = e10Var2.f;
        }
        return new g10(bArr, iArr);
    }

    @Override // defpackage.o8
    public final void skip(long j) {
        while (j > 0) {
            e10 e10Var = this.f;
            if (e10Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, e10Var.c - e10Var.b);
            long j2 = min;
            this.g -= j2;
            j -= j2;
            int i = e10Var.b + min;
            e10Var.b = i;
            if (i == e10Var.c) {
                this.f = e10Var.a();
                f10.a(e10Var);
            }
        }
    }

    public final e10 t(int i) {
        if (i < 1 || i > 8192) {
            l8.l("unexpected capacity");
            return null;
        }
        e10 e10Var = this.f;
        if (e10Var == null) {
            e10 b = f10.b();
            this.f = b;
            b.g = b;
            b.f = b;
            return b;
        }
        e10 e10Var2 = e10Var.g;
        e10Var2.getClass();
        if (e10Var2.c + i <= 8192 && e10Var2.e) {
            return e10Var2;
        }
        e10 b2 = f10.b();
        e10Var2.b(b2);
        return b2;
    }

    public final String toString() {
        long j = this.g;
        if (j <= 2147483647L) {
            return s((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.g).toString());
    }

    public final void u(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        vv.f(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            e10 t = t(1);
            int min = Math.min(i - i2, 8192 - t.c);
            int i3 = i2 + min;
            o6.n0(bArr, t.a, t.c, i2, i3);
            t.c += min;
            i2 = i3;
        }
        this.g += j;
    }

    public final void v(p20 p20Var) {
        p20Var.getClass();
        while (p20Var.b(8192L, this) != -1) {
        }
    }

    public final void w(int i) {
        e10 t = t(1);
        byte[] bArr = t.a;
        int i2 = t.c;
        t.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.g++;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            e10 t = t(1);
            int min = Math.min(i, 8192 - t.c);
            byteBuffer.get(t.a, t.c, min);
            i -= min;
            t.c += min;
        }
        this.g += remaining;
        return remaining;
    }

    @Override // defpackage.n8
    public final /* bridge */ /* synthetic */ n8 writeByte(int i) {
        w(i);
        return this;
    }

    @Override // defpackage.n8
    public final /* bridge */ /* synthetic */ n8 writeInt(int i) {
        y(i);
        return this;
    }

    @Override // defpackage.n8
    public final /* bridge */ /* synthetic */ n8 writeShort(int i) {
        z(i);
        return this;
    }

    public final void x(long j) {
        if (j == 0) {
            w(48);
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
        e10 t = t(i);
        byte[] bArr = t.a;
        int i2 = t.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        t.c += i;
        this.g += i;
    }

    public final void y(int i) {
        e10 t = t(4);
        byte[] bArr = t.a;
        int i2 = t.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        t.c = i2 + 4;
        this.g += 4;
    }

    public final void z(int i) {
        e10 t = t(2);
        byte[] bArr = t.a;
        int i2 = t.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        t.c = i2 + 2;
        this.g += 2;
    }

    @Override // defpackage.n8
    public final n8 write(byte[] bArr) {
        u(bArr, bArr.length);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.f20
    public final void close() {
    }

    @Override // defpackage.n8, defpackage.f20, java.io.Flushable
    public final void flush() {
    }
}
