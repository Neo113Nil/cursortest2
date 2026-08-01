package p1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0263u;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3424z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3425a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3426b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3427c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3428e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3429f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.d f3430g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3431j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3432k;

    /* renamed from: l, reason: collision with root package name */
    public long f3433l;

    /* renamed from: m, reason: collision with root package name */
    public long f3434m;

    /* renamed from: n, reason: collision with root package name */
    public long f3435n;

    /* renamed from: o, reason: collision with root package name */
    public long f3436o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3437p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3438q;

    /* renamed from: r, reason: collision with root package name */
    public long f3439r;

    /* renamed from: s, reason: collision with root package name */
    public long f3440s;

    /* renamed from: t, reason: collision with root package name */
    public long f3441t;

    /* renamed from: u, reason: collision with root package name */
    public long f3442u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3443v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3444w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3445x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3446y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3424z = jVar;
    }

    public o(C0263u c0263u) {
        this.f3425a = (h) c0263u.f3052f;
        String str = (String) c0263u.f3050c;
        if (str == null) {
            X0.e.h("connectionName");
            throw null;
        }
        this.f3427c = str;
        this.f3428e = 3;
        l1.d dVar = (l1.d) c0263u.f3048a;
        this.f3430g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3431j = dVar.e();
        this.f3432k = A.f3381a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3437p = jVar;
        this.f3438q = f3424z;
        this.f3442u = r0.c();
        Socket socket = (Socket) c0263u.f3049b;
        if (socket == null) {
            X0.e.h("socket");
            throw null;
        }
        this.f3443v = socket;
        v1.n nVar = (v1.n) c0263u.f3051e;
        if (nVar == null) {
            X0.e.h("sink");
            throw null;
        }
        this.f3444w = new x(nVar);
        v1.o oVar = (v1.o) c0263u.d;
        if (oVar == null) {
            X0.e.h("source");
            throw null;
        }
        this.f3445x = new k(this, new s(oVar));
        this.f3446y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e(1, 9, null);
    }

    public final void e(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.g("connectionCode", i);
        V.g("streamCode", i2);
        byte[] bArr = j1.b.f2584a;
        try {
            h(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3426b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3426b.values().toArray(new w[0]);
                this.f3426b.clear();
            }
        }
        w[] wVarArr = (w[]) objArr;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f3444w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3443v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3431j.e();
    }

    public final synchronized w f(int i) {
        return (w) this.f3426b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f3444w.flush();
    }

    public final synchronized w g(int i) {
        w wVar;
        wVar = (w) this.f3426b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void h(int i) {
        V.g("statusCode", i);
        synchronized (this.f3444w) {
            synchronized (this) {
                if (this.f3429f) {
                    return;
                }
                this.f3429f = true;
                this.f3444w.h(this.d, i, j1.b.f2584a);
            }
        }
    }

    public final synchronized void i(long j2) {
        long j3 = this.f3439r + j2;
        this.f3439r = j3;
        long j4 = j3 - this.f3440s;
        if (j4 >= this.f3437p.c() / 2) {
            l(0, j4);
            this.f3440s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3444w.f3484c);
        r6 = r2;
        r8.f3441t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3444w.f(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3441t;
                            long j5 = this.f3442u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3426b.containsKey(Integer.valueOf(i))) {
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
            j2 -= j3;
            this.f3444w.f(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void k(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3427c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void l(int i, long j2) {
        this.h.c(new n(this.f3427c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
