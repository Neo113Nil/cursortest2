package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.Zr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669Zr implements Closeable {
    public static final Logger m = Logger.getLogger(AbstractC0228Ir.class.getName());
    public final M8 h;
    public final G8 i;
    public int j;
    public boolean k;
    public final C2380zr l;

    public C0669Zr(IL il) {
        AbstractC0048Bt.n(il, "sink");
        this.h = il;
        G8 g8 = new G8();
        this.i = g8;
        this.j = 16384;
        this.l = new C2380zr(g8);
    }

    public final synchronized void b(XQ xq) {
        try {
            AbstractC0048Bt.n(xq, "peerSettings");
            if (this.k) {
                throw new IOException("closed");
            }
            int i = this.j;
            int i2 = xq.a;
            if ((i2 & 32) != 0) {
                i = xq.b[5];
            }
            this.j = i;
            if (((i2 & 2) != 0 ? xq.b[1] : -1) != -1) {
                C2380zr c2380zr = this.l;
                int i3 = (i2 & 2) != 0 ? xq.b[1] : -1;
                c2380zr.getClass();
                int min = Math.min(i3, 16384);
                int i4 = c2380zr.d;
                if (i4 != min) {
                    if (min < i4) {
                        c2380zr.b = Math.min(c2380zr.b, min);
                    }
                    c2380zr.c = true;
                    c2380zr.d = min;
                    int i5 = c2380zr.h;
                    if (min < i5) {
                        if (min == 0) {
                            C1721pr[] c1721prArr = c2380zr.e;
                            P6.g0(c1721prArr, 0, c1721prArr.length);
                            c2380zr.f = c2380zr.e.length - 1;
                            c2380zr.g = 0;
                            c2380zr.h = 0;
                        } else {
                            c2380zr.a(i5 - min);
                        }
                    }
                }
            }
            j(0, 0, 4, 1);
            this.h.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z, int i, G8 g8, int i2) {
        if (this.k) {
            throw new IOException("closed");
        }
        j(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            M8 m8 = this.h;
            AbstractC0048Bt.k(g8);
            m8.write(g8, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.k = true;
        this.h.close();
    }

    public final synchronized void flush() {
        if (this.k) {
            throw new IOException("closed");
        }
        this.h.flush();
    }

    public final void j(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = m;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC0228Ir.a(false, i, i2, i3, i4));
        }
        if (i2 > this.j) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.j + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "reserved bit set: ").toString());
        }
        byte[] bArr = HY.a;
        M8 m8 = this.h;
        AbstractC0048Bt.n(m8, "<this>");
        m8.writeByte((i2 >>> 16) & 255);
        m8.writeByte((i2 >>> 8) & 255);
        m8.writeByte(i2 & 255);
        m8.writeByte(i3 & 255);
        m8.writeByte(i4 & 255);
        m8.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void k(byte[] bArr, int i, int i2) {
        AbstractC1888sN.p(i2, "errorCode");
        if (this.k) {
            throw new IOException("closed");
        }
        if (AbstractC1888sN.v(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        j(0, bArr.length + 8, 7, 0);
        this.h.writeInt(i);
        this.h.writeInt(AbstractC1888sN.v(i2));
        if (bArr.length != 0) {
            this.h.write(bArr);
        }
        this.h.flush();
    }

    public final synchronized void m(boolean z, int i, ArrayList arrayList) {
        if (this.k) {
            throw new IOException("closed");
        }
        this.l.d(arrayList);
        long j = this.i.i;
        long min = Math.min(this.j, j);
        int i2 = j == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        j(i, (int) min, 1, i2);
        this.h.write(this.i, min);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.j, j2);
                j2 -= min2;
                j(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.h.write(this.i, min2);
            }
        }
    }

    public final synchronized void q(int i, int i2, boolean z) {
        if (this.k) {
            throw new IOException("closed");
        }
        j(0, 8, 6, z ? 1 : 0);
        this.h.writeInt(i);
        this.h.writeInt(i2);
        this.h.flush();
    }

    public final synchronized void t(int i, int i2) {
        AbstractC1888sN.p(i2, "errorCode");
        if (this.k) {
            throw new IOException("closed");
        }
        if (AbstractC1888sN.v(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(i, 4, 3, 0);
        this.h.writeInt(AbstractC1888sN.v(i2));
        this.h.flush();
    }

    public final synchronized void v(long j, int i) {
        if (this.k) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        j(i, 4, 8, 0);
        this.h.writeInt((int) j);
        this.h.flush();
    }
}
