package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class px implements o8 {
    public final p20 f;
    public final m8 g;
    public boolean h;

    public px(p20 p20Var) {
        p20Var.getClass();
        this.f = p20Var;
        this.g = new m8();
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.f.a();
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        m8Var.getClass();
        if (j < 0) {
            l8.o("byteCount < 0: ", j);
            return 0L;
        }
        if (this.h) {
            l8.u("closed");
            return 0L;
        }
        m8 m8Var2 = this.g;
        if (m8Var2.g == 0 && this.f.b(8192L, m8Var2) == -1) {
            return -1L;
        }
        return m8Var2.b(Math.min(j, m8Var2.g), m8Var);
    }

    @Override // defpackage.o8
    public final r8 c(long j) {
        h(j);
        return this.g.c(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.close();
        m8 m8Var = this.g;
        m8Var.skip(m8Var.g);
    }

    @Override // defpackage.o8
    public final String d() {
        return f(Long.MAX_VALUE);
    }

    @Override // defpackage.o8
    public final String f(long j) {
        if (j < 0) {
            l8.o("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long n = n((byte) 10, 0L, j2);
        m8 m8Var = this.g;
        if (n != -1) {
            return b.a(n, m8Var);
        }
        if (j2 < Long.MAX_VALUE && p(j2) && m8Var.o(j2 - 1) == 13 && p(j2 + 1) && m8Var.o(j2) == 10) {
            return b.a(j2, m8Var);
        }
        m8 m8Var2 = new m8();
        m8Var.m(m8Var2, 0L, Math.min(32L, m8Var.g));
        throw new EOFException("\\n not found: limit=" + Math.min(m8Var.g, j) + " content=" + m8Var2.c(m8Var2.g).b() + (char) 8230);
    }

    @Override // defpackage.o8
    public final int g(xv xvVar) {
        xvVar.getClass();
        if (this.h) {
            l8.u("closed");
            return 0;
        }
        while (true) {
            m8 m8Var = this.g;
            int b = b.b(m8Var, xvVar, true);
            if (b != -2) {
                if (b != -1) {
                    m8Var.skip(xvVar.f[b].a());
                    return b;
                }
            } else if (this.f.b(8192L, m8Var) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.o8
    public final void h(long j) {
        if (!p(j)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.g8.q(16);
        defpackage.g8.q(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.o8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        m8 m8Var;
        h(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean p = p(i2);
            m8Var = this.g;
            if (!p) {
                break;
            }
            byte o = m8Var.o(i);
            if ((o < 48 || o > 57) && ((o < 97 || o > 102) && (o < 65 || o > 70))) {
                break;
            }
            i = i2;
        }
        return m8Var.k();
    }

    @Override // defpackage.o8
    public final String l(Charset charset) {
        p20 p20Var = this.f;
        m8 m8Var = this.g;
        m8Var.v(p20Var);
        return m8Var.r(m8Var.g, charset);
    }

    public final boolean m() {
        if (this.h) {
            l8.u("closed");
            return false;
        }
        m8 m8Var = this.g;
        return m8Var.n() && this.f.b(8192L, m8Var) == -1;
    }

    public final long n(byte b, long j, long j2) {
        if (this.h) {
            l8.u("closed");
            return 0L;
        }
        if (0 > j2) {
            l8.o("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            m8 m8Var = this.g;
            byte b2 = b;
            long j4 = j2;
            long p = m8Var.p(b2, j3, j4);
            if (p == -1) {
                long j5 = m8Var.g;
                if (j5 >= j4 || this.f.b(8192L, m8Var) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return p;
            }
        }
        return -1L;
    }

    public final int o() {
        h(4L);
        int readInt = this.g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean p(long j) {
        m8 m8Var;
        if (j < 0) {
            l8.o("byteCount < 0: ", j);
            return false;
        }
        if (this.h) {
            l8.u("closed");
            return false;
        }
        do {
            m8Var = this.g;
            if (m8Var.g >= j) {
                return true;
            }
        } while (this.f.b(8192L, m8Var) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m8 m8Var = this.g;
        if (m8Var.g == 0 && this.f.b(8192L, m8Var) == -1) {
            return -1;
        }
        return m8Var.read(byteBuffer);
    }

    @Override // defpackage.o8
    public final byte readByte() {
        h(1L);
        return this.g.readByte();
    }

    @Override // defpackage.o8
    public final int readInt() {
        h(4L);
        return this.g.readInt();
    }

    @Override // defpackage.o8
    public final short readShort() {
        h(2L);
        return this.g.readShort();
    }

    @Override // defpackage.o8
    public final void skip(long j) {
        if (this.h) {
            l8.u("closed");
            return;
        }
        while (j > 0) {
            m8 m8Var = this.g;
            if (m8Var.g == 0 && this.f.b(8192L, m8Var) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, m8Var.g);
            m8Var.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }
}
