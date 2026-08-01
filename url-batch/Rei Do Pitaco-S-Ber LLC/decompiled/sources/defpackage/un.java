package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class un implements Closeable {
    public static final Logger k = Logger.getLogger(cn.class.getName());
    public final n8 f;
    public final m8 g;
    public int h;
    public boolean i;
    public final vm j;

    public un(ox oxVar) {
        oxVar.getClass();
        this.f = oxVar;
        m8 m8Var = new m8();
        this.g = m8Var;
        this.h = 16384;
        this.j = new vm(m8Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.i = true;
        this.f.close();
    }

    public final synchronized void flush() {
        if (this.i) {
            throw new IOException("closed");
        }
        this.f.flush();
    }

    public final synchronized void m(k10 k10Var) {
        try {
            k10Var.getClass();
            if (this.i) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i2 = k10Var.a;
            if ((i2 & 32) != 0) {
                i = k10Var.b[5];
            }
            this.h = i;
            if (((i2 & 2) != 0 ? k10Var.b[1] : -1) != -1) {
                vm vmVar = this.j;
                int i3 = (i2 & 2) != 0 ? k10Var.b[1] : -1;
                vmVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = vmVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        vmVar.b = Math.min(vmVar.b, min);
                    }
                    vmVar.c = true;
                    vmVar.d = min;
                    int i5 = vmVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            mm[] mmVarArr = vmVar.e;
                            o6.q0(mmVarArr, 0, mmVarArr.length);
                            vmVar.f = vmVar.e.length - 1;
                            vmVar.g = 0;
                            vmVar.h = 0;
                        } else {
                            vmVar.a(i5 - min);
                        }
                    }
                }
            }
            o(0, 0, 4, 1);
            this.f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z, int i, m8 m8Var, int i2) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            n8 n8Var = this.f;
            m8Var.getClass();
            n8Var.e(i2, m8Var);
        }
    }

    public final void o(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = k;
        if (logger.isLoggable(level)) {
            logger.fine(cn.a(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            l8.n("FRAME_SIZE_ERROR length > ", this.h, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            l8.e(n20.e("reserved bit set: ", i));
            return;
        }
        byte[] bArr = z60.a;
        n8 n8Var = this.f;
        n8Var.getClass();
        n8Var.writeByte((i2 >>> 16) & 255);
        n8Var.writeByte((i2 >>> 8) & 255);
        n8Var.writeByte(i2 & 255);
        n8Var.writeByte(i3 & 255);
        n8Var.writeByte(i4 & 255);
        n8Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            throw null;
        }
        if (this.i) {
            throw new IOException("closed");
        }
        if (n20.h(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        o(0, bArr.length + 8, 7, 0);
        this.f.writeInt(i);
        this.f.writeInt(n20.h(i2));
        if (bArr.length != 0) {
            this.f.write(bArr);
        }
        this.f.flush();
    }

    public final synchronized void q(boolean z, int i, ArrayList arrayList) {
        if (this.i) {
            throw new IOException("closed");
        }
        this.j.d(arrayList);
        long j = this.g.g;
        long min = Math.min(this.h, j);
        int i2 = j == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        o(i, (int) min, 1, i2);
        this.f.e(min, this.g);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.h, j2);
                j2 -= min2;
                o(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.f.e(min2, this.g);
            }
        }
    }

    public final synchronized void r(int i, int i2, boolean z) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(0, 8, 6, z ? 1 : 0);
        this.f.writeInt(i);
        this.f.writeInt(i2);
        this.f.flush();
    }

    public final synchronized void s(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (this.i) {
            throw new IOException("closed");
        }
        if (n20.h(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o(i, 4, 3, 0);
        this.f.writeInt(n20.h(i2));
        this.f.flush();
    }

    public final synchronized void t(int i, long j) {
        if (this.i) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        o(i, 4, 8, 0);
        this.f.writeInt((int) j);
        this.f.flush();
    }
}
