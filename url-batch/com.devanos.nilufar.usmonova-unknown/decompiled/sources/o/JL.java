package o;

import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class JL implements N8 {
    public final HS h;
    public final G8 i;
    public boolean j;

    public JL(HS hs) {
        AbstractC0048Bt.n(hs, Constants.ScionAnalytics.PARAM_SOURCE);
        this.h = hs;
        this.i = new G8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        o.AbstractC0868ct.k(16);
        r1 = java.lang.Integer.toString(r2, 16);
        o.AbstractC0048Bt.m(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // o.N8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G() {
        G8 g8;
        y(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean l = l(i2);
            g8 = this.i;
            if (!l) {
                break;
            }
            byte q = g8.q(i);
            if ((q < 48 || q > 57) && ((q < 97 || q > 102) && (q < 65 || q > 70))) {
                break;
            }
            i = i2;
        }
        return g8.G();
    }

    @Override // o.N8
    public final String H(Charset charset) {
        HS hs = this.h;
        G8 g8 = this.i;
        g8.E(hs);
        return g8.D(g8.i, charset);
    }

    @Override // o.N8
    public final InputStream J() {
        return new F8(this, 1);
    }

    @Override // o.N8, o.M8
    public final G8 a() {
        return this.i;
    }

    public final boolean b() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        G8 g8 = this.i;
        return g8.m() && this.h.read(g8, 8192L) == -1;
    }

    public final long c(byte b, long j, long j2) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC1888sN.i("fromIndex=0 toIndex=", j2).toString());
        }
        long j3 = 0;
        while (j3 < j2) {
            G8 g8 = this.i;
            byte b2 = b;
            long j4 = j2;
            long t = g8.t(b2, j3, j4);
            if (t == -1) {
                long j5 = g8.i;
                if (j5 >= j4 || this.h.read(g8, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return t;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.h.close();
        this.i.b();
    }

    @Override // o.N8
    public final boolean d(C1347k9 c1347k9) {
        int i;
        AbstractC0048Bt.n(c1347k9, "bytes");
        int b = c1347k9.b();
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        if (b >= 0 && c1347k9.b() >= b) {
            for (0; i < b; i + 1) {
                long j = i;
                i = (l(1 + j) && this.i.q(j) == c1347k9.g(i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // o.N8
    public final long f(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "targetBytes");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        long j = 0;
        while (true) {
            G8 g8 = this.i;
            long x = g8.x(c1347k9, j);
            if (x != -1) {
                return x;
            }
            long j2 = g8.i;
            if (this.h.read(g8, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // o.N8
    public final C1347k9 h() {
        HS hs = this.h;
        G8 g8 = this.i;
        g8.E(hs);
        return g8.i(g8.i);
    }

    @Override // o.N8
    public final C1347k9 i(long j) {
        y(j);
        return this.i.i(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.j;
    }

    public final int j() {
        y(4L);
        int readInt = this.i.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long k() {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        y(8L);
        G8 g8 = this.i;
        if (g8.i < 8) {
            throw new EOFException();
        }
        C1694pQ c1694pQ = g8.h;
        AbstractC0048Bt.k(c1694pQ);
        int i = c1694pQ.b;
        int i2 = c1694pQ.c;
        if (i2 - i < 8) {
            j = ((g8.readInt() & 4294967295L) << 32) | (4294967295L & g8.readInt());
            c3 = '8';
            c4 = '\b';
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = c1694pQ.a;
            c = 24;
            c2 = '(';
            c3 = '8';
            c4 = '\b';
            int i3 = i + 7;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (bArr[i3] & 255);
            g8.i -= 8;
            if (i4 == i2) {
                g8.h = c1694pQ.a();
                AbstractC1825rQ.a(c1694pQ);
            } else {
                c1694pQ.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << c3) | (((-72057594037927936L) & j) >>> c3) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> c4) | ((4278190080L & j) << c4) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    @Override // o.N8
    public final boolean l(long j) {
        G8 g8;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        do {
            g8 = this.i;
            if (g8.i >= j) {
                return true;
            }
        } while (this.h.read(g8, 8192L) != -1);
        return false;
    }

    public final short m() {
        y(2L);
        return this.i.C();
    }

    @Override // o.N8
    public final String n() {
        return u(Long.MAX_VALUE);
    }

    @Override // o.N8
    public final long o(M8 m8) {
        G8 g8;
        AbstractC0048Bt.n(m8, "sink");
        long j = 0;
        while (true) {
            HS hs = this.h;
            g8 = this.i;
            if (hs.read(g8, 8192L) == -1) {
                break;
            }
            long j2 = g8.j();
            if (j2 > 0) {
                j += j2;
                m8.write(g8, j2);
            }
        }
        long j3 = g8.i;
        if (j3 <= 0) {
            return j;
        }
        long j4 = j + j3;
        m8.write(g8, j3);
        return j4;
    }

    @Override // o.N8
    public final byte[] p() {
        HS hs = this.h;
        G8 g8 = this.i;
        g8.E(hs);
        return g8.B(g8.i);
    }

    @Override // o.N8
    public final JL peek() {
        return AbstractC0946e20.h(new FH(this));
    }

    public final String q(long j) {
        y(j);
        G8 g8 = this.i;
        g8.getClass();
        return g8.D(j, AbstractC0470Sa.a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC0048Bt.n(byteBuffer, "sink");
        G8 g8 = this.i;
        if (g8.i == 0 && this.h.read(g8, 8192L) == -1) {
            return -1;
        }
        return g8.read(byteBuffer);
    }

    @Override // o.N8
    public final byte readByte() {
        y(1L);
        return this.i.readByte();
    }

    @Override // o.N8
    public final int readInt() {
        y(4L);
        return this.i.readInt();
    }

    @Override // o.N8
    public final short readShort() {
        y(2L);
        return this.i.readShort();
    }

    @Override // o.N8
    public final long s(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "bytes");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        long j = 0;
        while (true) {
            G8 g8 = this.i;
            long v = g8.v(c1347k9, j);
            if (v != -1) {
                return v;
            }
            long j2 = g8.i;
            if (this.h.read(g8, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - c1347k9.b()) + 1);
        }
    }

    @Override // o.N8
    public final void skip(long j) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            G8 g8 = this.i;
            if (g8.i == 0 && this.h.read(g8, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, g8.i);
            g8.skip(min);
            j -= min;
        }
    }

    @Override // o.HS
    public final NV timeout() {
        return this.h.timeout();
    }

    public final String toString() {
        return "buffer(" + this.h + ')';
    }

    @Override // o.N8
    public final String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("limit < 0: ", j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long c = c((byte) 10, 0L, j2);
        G8 g8 = this.i;
        if (c != -1) {
            return AbstractC0744b.b(g8, c);
        }
        if (j2 < Long.MAX_VALUE && l(j2) && g8.q(j2 - 1) == 13 && l(j2 + 1) && g8.q(j2) == 10) {
            return AbstractC0744b.b(g8, j2);
        }
        G8 g82 = new G8();
        g8.k(g82, 0L, Math.min(32, g8.i));
        throw new EOFException("\\n not found: limit=" + Math.min(g8.i, j) + " content=" + g82.i(g82.i).c() + (char) 8230);
    }

    @Override // o.N8
    public final int w(NG ng) {
        AbstractC0048Bt.n(ng, "options");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            G8 g8 = this.i;
            int c = AbstractC0744b.c(g8, ng, true);
            if (c != -2) {
                if (c != -1) {
                    g8.skip(ng.h[c].b());
                    return c;
                }
            } else if (this.h.read(g8, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // o.N8
    public final void y(long j) {
        if (!l(j)) {
            throw new EOFException();
        }
    }

    @Override // o.HS
    public final long read(G8 g8, long j) {
        AbstractC0048Bt.n(g8, "sink");
        if (j >= 0) {
            if (!this.j) {
                G8 g82 = this.i;
                if (g82.i == 0 && this.h.read(g82, 8192L) == -1) {
                    return -1L;
                }
                return g82.read(g8, Math.min(j, g82.i));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
    }
}
