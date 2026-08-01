package p1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0262u;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3440z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3441a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3442b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3443c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3444e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3445f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.d f3446g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3447j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3448k;

    /* renamed from: l, reason: collision with root package name */
    public long f3449l;

    /* renamed from: m, reason: collision with root package name */
    public long f3450m;

    /* renamed from: n, reason: collision with root package name */
    public long f3451n;

    /* renamed from: o, reason: collision with root package name */
    public long f3452o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3453p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3454q;

    /* renamed from: r, reason: collision with root package name */
    public long f3455r;

    /* renamed from: s, reason: collision with root package name */
    public long f3456s;

    /* renamed from: t, reason: collision with root package name */
    public long f3457t;

    /* renamed from: u, reason: collision with root package name */
    public long f3458u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3459v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3460w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3461x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3462y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3440z = jVar;
    }

    public o(C0262u c0262u) {
        this.f3441a = (h) c0262u.f3068f;
        String str = (String) c0262u.f3066c;
        if (str == null) {
            X0.e.h("connectionName");
            throw null;
        }
        this.f3443c = str;
        this.f3444e = 3;
        l1.d dVar = (l1.d) c0262u.f3064a;
        this.f3446g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3447j = dVar.e();
        this.f3448k = A.f3397a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3453p = jVar;
        this.f3454q = f3440z;
        this.f3458u = r0.b();
        Socket socket = (Socket) c0262u.f3065b;
        if (socket == null) {
            X0.e.h("socket");
            throw null;
        }
        this.f3459v = socket;
        v1.n nVar = (v1.n) c0262u.f3067e;
        if (nVar == null) {
            X0.e.h("sink");
            throw null;
        }
        this.f3460w = new x(nVar);
        v1.o oVar = (v1.o) c0262u.d;
        if (oVar == null) {
            X0.e.h("source");
            throw null;
        }
        this.f3461x = new k(this, new s(oVar));
        this.f3462y = new LinkedHashSet();
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
        byte[] bArr = j1.b.f2600a;
        try {
            h(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3442b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3442b.values().toArray(new w[0]);
                this.f3442b.clear();
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
            this.f3460w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3459v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3447j.e();
    }

    public final synchronized w f(int i) {
        return (w) this.f3442b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f3460w.flush();
    }

    public final synchronized w g(int i) {
        w wVar;
        wVar = (w) this.f3442b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void h(int i) {
        V.g("statusCode", i);
        synchronized (this.f3460w) {
            synchronized (this) {
                if (this.f3445f) {
                    return;
                }
                this.f3445f = true;
                this.f3460w.h(this.d, i, j1.b.f2600a);
            }
        }
    }

    public final synchronized void i(long j2) {
        long j3 = this.f3455r + j2;
        this.f3455r = j3;
        long j4 = j3 - this.f3456s;
        if (j4 >= this.f3453p.b() / 2) {
            l(0, j4);
            this.f3456s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3460w.f3500c);
        r6 = r2;
        r8.f3457t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3460w.f(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3457t;
                            long j5 = this.f3458u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3442b.containsKey(Integer.valueOf(i))) {
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
            this.f3460w.f(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void k(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3443c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void l(int i, long j2) {
        this.h.c(new n(this.f3443c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
