package E1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f394f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final K1.o f395a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.f f396b;

    /* renamed from: c, reason: collision with root package name */
    public int f397c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final C0004e f398e;

    public z(K1.o oVar) {
        i1.f.e(oVar, "sink");
        this.f395a = oVar;
        K1.f fVar = new K1.f();
        this.f396b = fVar;
        this.f397c = 16384;
        this.f398e = new C0004e(fVar);
    }

    public final synchronized void D(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z2 ? 1 : 0);
        this.f395a.h(i);
        this.f395a.h(i2);
        this.f395a.flush();
    }

    public final synchronized void E(int i, int i2) {
        AbstractC0001b.j("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0332e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h(i, 4, 3, 0);
        this.f395a.h(AbstractC0332e.a(i2));
        this.f395a.flush();
    }

    public final synchronized void F(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        h(i, 4, 8, 0);
        this.f395a.h((int) j2);
        this.f395a.flush();
    }

    public final synchronized void a(D d) {
        try {
            i1.f.e(d, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f397c;
            int i2 = d.f288a;
            if ((i2 & 32) != 0) {
                i = d.f289b[5];
            }
            this.f397c = i;
            if (((i2 & 2) != 0 ? d.f289b[1] : -1) != -1) {
                C0004e c0004e = this.f398e;
                int i3 = (i2 & 2) != 0 ? d.f289b[1] : -1;
                c0004e.getClass();
                int min = Math.min(i3, 16384);
                int i4 = c0004e.f306e;
                if (i4 != min) {
                    if (min < i4) {
                        c0004e.f305c = Math.min(c0004e.f305c, min);
                    }
                    c0004e.d = true;
                    c0004e.f306e = min;
                    int i5 = c0004e.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0002c[] c0002cArr = c0004e.f307f;
                            W0.i.u0(c0002cArr, 0, c0002cArr.length);
                            c0004e.f308g = c0004e.f307f.length - 1;
                            c0004e.h = 0;
                            c0004e.i = 0;
                        } else {
                            c0004e.a(i5 - min);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.f395a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f395a.close();
    }

    public final synchronized void f(boolean z2, int i, K1.f fVar, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        h(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            i1.f.b(fVar);
            this.f395a.u(fVar, i2);
        }
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f395a.flush();
    }

    public final void h(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f394f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i, i2, i3, false, i4));
        }
        if (i2 > this.f397c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f397c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC0001b.f("reserved bit set: ", i).toString());
        }
        byte[] bArr = y1.b.f4648a;
        K1.o oVar = this.f395a;
        i1.f.e(oVar, "<this>");
        oVar.f((i2 >>> 16) & 255);
        oVar.f((i2 >>> 8) & 255);
        oVar.f(i2 & 255);
        oVar.f(i3 & 255);
        oVar.f(i4 & 255);
        oVar.h(i & Integer.MAX_VALUE);
    }

    public final synchronized void i(int i, int i2, byte[] bArr) {
        AbstractC0001b.j("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0332e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        h(0, bArr.length + 8, 7, 0);
        this.f395a.h(i);
        this.f395a.h(AbstractC0332e.a(i2));
        if (bArr.length != 0) {
            K1.o oVar = this.f395a;
            if (oVar.f763c) {
                throw new IllegalStateException("closed");
            }
            oVar.f762b.J(0, bArr.length, bArr);
            oVar.a();
        }
        this.f395a.flush();
    }

    public final synchronized void q(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f398e.d(arrayList);
        long j2 = this.f396b.f746b;
        long min = Math.min(this.f397c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        h(i, (int) min, 1, i2);
        this.f395a.u(this.f396b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f397c, j3);
                j3 -= min2;
                h(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f395a.u(this.f396b, min2);
            }
        }
    }
}
