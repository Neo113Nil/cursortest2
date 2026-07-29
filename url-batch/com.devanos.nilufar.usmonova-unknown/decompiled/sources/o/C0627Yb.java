package o;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.Yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627Yb extends AbstractC1305jX {
    public static final Logger w = Logger.getLogger(C0627Yb.class.getName());
    public static final boolean x = AbstractC1768qY.e;
    public Y1 r;
    public final byte[] s;
    public final int t;
    public int u;
    public final OutputStream v;

    public C0627Yb(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.s = new byte[max];
        this.t = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.v = outputStream;
    }

    public static int S(int i, C1151h9 c1151h9) {
        return T(c1151h9) + Z(i);
    }

    public static int T(C1151h9 c1151h9) {
        int size = c1151h9.size();
        return a0(size) + size;
    }

    public static int U(int i) {
        return Z(i) + 4;
    }

    public static int V(int i) {
        return Z(i) + 8;
    }

    public static int W(int i, F f, InterfaceC0839cQ interfaceC0839cQ) {
        return f.a(interfaceC0839cQ) + (Z(i) * 2);
    }

    public static int X(int i) {
        if (i >= 0) {
            return a0(i);
        }
        return 10;
    }

    public static int Y(String str) {
        int length;
        try {
            length = FY.b(str);
        } catch (EY unused) {
            length = str.getBytes(AbstractC2052ut.a).length;
        }
        return a0(length) + length;
    }

    public static int Z(int i) {
        return a0(i << 3);
    }

    public static int a0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    @Override // o.AbstractC1305jX
    public final void M(byte[] bArr, int i, int i2) {
        f0(bArr, i, i2);
    }

    public final void N(int i) {
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        byte[] bArr = this.s;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.u = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.u = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.u = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void O(long j) {
        int i = this.u;
        int i2 = i + 1;
        this.u = i2;
        byte[] bArr = this.s;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.u = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.u = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.u = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.u = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.u = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.u = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.u = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void P(int i, int i2) {
        Q((i << 3) | i2);
    }

    public final void Q(int i) {
        boolean z = x;
        byte[] bArr = this.s;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.u;
                this.u = i2 + 1;
                AbstractC1768qY.k(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.u;
            this.u = i3 + 1;
            AbstractC1768qY.k(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.u;
            this.u = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.u;
        this.u = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void R(long j) {
        boolean z = x;
        byte[] bArr = this.s;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.u;
                this.u = i + 1;
                AbstractC1768qY.k(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.u;
            this.u = i2 + 1;
            AbstractC1768qY.k(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.u;
            this.u = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.u;
        this.u = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void c0() {
        this.v.write(this.s, 0, this.u);
        this.u = 0;
    }

    public final void d0(int i) {
        if (this.t - this.u < i) {
            c0();
        }
    }

    public final void e0(byte b) {
        if (this.u == this.t) {
            c0();
        }
        int i = this.u;
        this.u = i + 1;
        this.s[i] = b;
    }

    public final void f0(byte[] bArr, int i, int i2) {
        int i3 = this.u;
        int i4 = this.t;
        int i5 = i4 - i3;
        byte[] bArr2 = this.s;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.u += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.u = i4;
        c0();
        if (i7 > i4) {
            this.v.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.u = i7;
        }
    }

    public final void g0(int i, boolean z) {
        d0(11);
        P(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.u;
        this.u = i2 + 1;
        this.s[i2] = b;
    }

    public final void h0(int i, C1151h9 c1151h9) {
        s0(i, 2);
        i0(c1151h9);
    }

    public final void i0(C1151h9 c1151h9) {
        u0(c1151h9.size());
        M(c1151h9.i, c1151h9.n(), c1151h9.size());
    }

    public final void j0(int i, int i2) {
        d0(14);
        P(i, 5);
        N(i2);
    }

    public final void k0(int i) {
        d0(4);
        N(i);
    }

    public final void l0(long j, int i) {
        d0(18);
        P(i, 1);
        O(j);
    }

    public final void m0(long j) {
        d0(8);
        O(j);
    }

    public final void n0(int i, int i2) {
        d0(20);
        P(i, 0);
        if (i2 >= 0) {
            Q(i2);
        } else {
            R(i2);
        }
    }

    public final void o0(int i) {
        if (i >= 0) {
            u0(i);
        } else {
            w0(i);
        }
    }

    public final void p0(int i, F f, InterfaceC0839cQ interfaceC0839cQ) {
        s0(i, 2);
        u0(f.a(interfaceC0839cQ));
        interfaceC0839cQ.c(f, this.r);
    }

    public final void q0(int i, String str) {
        s0(i, 2);
        r0(str);
    }

    public final void r0(String str) {
        try {
            int length = str.length() * 3;
            int a0 = a0(length);
            int i = a0 + length;
            int i2 = this.t;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int h = FY.a.h(str, bArr, 0, length);
                u0(h);
                f0(bArr, 0, h);
                return;
            }
            if (i > i2 - this.u) {
                c0();
            }
            int a02 = a0(str.length());
            int i3 = this.u;
            byte[] bArr2 = this.s;
            try {
                if (a02 == a0) {
                    int i4 = i3 + a02;
                    this.u = i4;
                    int h2 = FY.a.h(str, bArr2, i4, i2 - i4);
                    this.u = i3;
                    Q((h2 - i3) - a02);
                    this.u = h2;
                } else {
                    int b = FY.b(str);
                    Q(b);
                    this.u = FY.a.h(str, bArr2, this.u, b);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C0601Xb(e);
            } catch (EY e2) {
                this.u = i3;
                throw e2;
            }
        } catch (EY e3) {
            w.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC2052ut.a);
            try {
                u0(bytes.length);
                M(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C0601Xb(e4);
            }
        }
    }

    public final void s0(int i, int i2) {
        u0((i << 3) | i2);
    }

    public final void t0(int i, int i2) {
        d0(20);
        P(i, 0);
        Q(i2);
    }

    public final void u0(int i) {
        d0(5);
        Q(i);
    }

    public final void v0(long j, int i) {
        d0(20);
        P(i, 0);
        R(j);
    }

    public final void w0(long j) {
        d0(10);
        R(j);
    }
}
