package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mn implements Closeable {
    public static final k10 E;
    public final Socket A;
    public final un B;
    public final hn C;
    public final LinkedHashSet D;
    public final en f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;
    public int i;
    public int j;
    public boolean k;
    public final m40 l;
    public final l40 m;
    public final l40 n;
    public final l40 o;
    public final tg p;
    public long q;
    public long r;
    public long s;
    public long t;
    public final k10 u;
    public k10 v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        k10 k10Var = new k10();
        k10Var.b(7, 65535);
        k10Var.b(5, 16384);
        E = k10Var;
    }

    public mn(e4 e4Var) {
        this.f = (en) e4Var.f;
        String str = (String) e4Var.c;
        if (str == null) {
            oo.P("connectionName");
            throw null;
        }
        this.h = str;
        this.j = 3;
        m40 m40Var = (m40) e4Var.a;
        this.l = m40Var;
        this.m = m40Var.e();
        this.n = m40Var.e();
        this.o = m40Var.e();
        this.p = tg.j;
        k10 k10Var = new k10();
        k10Var.b(7, 16777216);
        this.u = k10Var;
        this.v = E;
        this.z = r0.a();
        Socket socket = (Socket) e4Var.b;
        if (socket == null) {
            oo.P("socket");
            throw null;
        }
        this.A = socket;
        ox oxVar = (ox) e4Var.e;
        if (oxVar == null) {
            oo.P("sink");
            throw null;
        }
        this.B = new un(oxVar);
        px pxVar = (px) e4Var.d;
        if (pxVar == null) {
            oo.P("source");
            throw null;
        }
        this.C = new hn(this, new pn(pxVar));
        this.D = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m(1, 9, null);
    }

    public final void flush() {
        this.B.flush();
    }

    public final void m(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        byte[] bArr = z60.a;
        try {
            p(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.g.isEmpty()) {
                objArr = this.g.values().toArray(new tn[0]);
                this.g.clear();
            }
        }
        tn[] tnVarArr = (tn[]) objArr;
        if (tnVarArr != null) {
            for (tn tnVar : tnVarArr) {
                try {
                    tnVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.B.close();
        } catch (IOException unused3) {
        }
        try {
            this.A.close();
        } catch (IOException unused4) {
        }
        this.m.e();
        this.n.e();
        this.o.e();
    }

    public final synchronized tn n(int i) {
        return (tn) this.g.get(Integer.valueOf(i));
    }

    public final synchronized tn o(int i) {
        tn tnVar;
        tnVar = (tn) this.g.remove(Integer.valueOf(i));
        notifyAll();
        return tnVar;
    }

    public final void p(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.B) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                this.k = true;
                this.B.p(this.i, i, z60.a);
            }
        }
    }

    public final synchronized void q(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.a() / 2) {
            t(0, j3);
            this.x += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.h);
        r6 = r2;
        r8.y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i, boolean z, m8 m8Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.B.n(z, i, m8Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.y;
                            long j4 = this.z;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.g.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.B.n(z && j == 0, i, m8Var, min);
        }
    }

    public final void s(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.m.c(new gn(this.h + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void t(int i, long j) {
        this.m.c(new ln(this.h + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
