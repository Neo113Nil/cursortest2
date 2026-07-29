package o;

import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: o.Rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461Rr implements Closeable {
    public static final XQ G;
    public long A;
    public long B;
    public final Socket C;
    public final C0669Zr D;
    public final C1401l0 E;
    public final LinkedHashSet F;
    public final AbstractC0280Kr h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final String j;
    public int k;
    public int l;
    public boolean m;
    public final RU n;

    /* renamed from: o, reason: collision with root package name */
    public final QU f101o;
    public final QU p;
    public final QU q;
    public final C1623oL r;
    public long s;
    public long t;
    public long u;
    public long v;
    public final XQ w;
    public XQ x;
    public long y;
    public long z;

    static {
        XQ xq = new XQ();
        xq.c(7, 65535);
        xq.c(5, 16384);
        G = xq;
    }

    public C0461Rr(C1343k5 c1343k5) {
        this.h = (AbstractC0280Kr) c1343k5.m;
        String str = (String) c1343k5.j;
        if (str == null) {
            AbstractC0048Bt.i0("connectionName");
            throw null;
        }
        this.j = str;
        this.l = 3;
        RU ru = (RU) c1343k5.h;
        this.n = ru;
        this.f101o = ru.e();
        this.p = ru.e();
        this.q = ru.e();
        this.r = C1623oL.i;
        XQ xq = new XQ();
        xq.c(7, 16777216);
        this.w = xq;
        this.x = G;
        this.B = r0.a();
        Socket socket = (Socket) c1343k5.i;
        if (socket == null) {
            AbstractC0048Bt.i0("socket");
            throw null;
        }
        this.C = socket;
        IL il = (IL) c1343k5.l;
        if (il == null) {
            AbstractC0048Bt.i0("sink");
            throw null;
        }
        this.D = new C0669Zr(il);
        JL jl = (JL) c1343k5.k;
        if (jl == null) {
            AbstractC0048Bt.i0(Constants.ScionAnalytics.PARAM_SOURCE);
            throw null;
        }
        this.E = new C1401l0(this, 2, new C0539Ur(jl));
        this.F = new LinkedHashSet();
    }

    public final void b(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        AbstractC1888sN.p(i, "connectionCode");
        AbstractC1888sN.p(i2, "streamCode");
        byte[] bArr = HY.a;
        try {
            k(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.i.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.i.values().toArray(new C0643Yr[0]);
                this.i.clear();
            }
        }
        C0643Yr[] c0643YrArr = (C0643Yr[]) objArr;
        if (c0643YrArr != null) {
            for (C0643Yr c0643Yr : c0643YrArr) {
                try {
                    c0643Yr.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.D.close();
        } catch (IOException unused3) {
        }
        try {
            this.C.close();
        } catch (IOException unused4) {
        }
        this.f101o.e();
        this.p.e();
        this.q.e();
    }

    public final synchronized C0643Yr c(int i) {
        return (C0643Yr) this.i.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final void flush() {
        this.D.flush();
    }

    public final synchronized C0643Yr j(int i) {
        C0643Yr c0643Yr;
        c0643Yr = (C0643Yr) this.i.remove(Integer.valueOf(i));
        notifyAll();
        return c0643Yr;
    }

    public final void k(int i) {
        AbstractC1888sN.p(i, "statusCode");
        synchronized (this.D) {
            synchronized (this) {
                if (this.m) {
                    return;
                }
                this.m = true;
                this.D.k(HY.a, this.k, i);
            }
        }
    }

    public final synchronized void m(long j) {
        long j2 = this.y + j;
        this.y = j2;
        long j3 = j2 - this.z;
        if (j3 >= this.w.a() / 2) {
            v(j3, 0);
            this.z += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.D.j);
        r6 = r2;
        r8.A += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i, boolean z, G8 g8, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.D.c(z, i, g8, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.A;
                            long j4 = this.B;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.i.containsKey(Integer.valueOf(i))) {
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
            this.D.c(z && j == 0, i, g8, min);
        }
    }

    public final void t(int i, int i2) {
        AbstractC1888sN.p(i2, "errorCode");
        this.f101o.c(new C0331Mr(this.j + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void v(long j, int i) {
        this.f101o.c(new C0435Qr(this.j + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
