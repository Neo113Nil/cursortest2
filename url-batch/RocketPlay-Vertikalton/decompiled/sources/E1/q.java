package E1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final D f337z;

    /* renamed from: a, reason: collision with root package name */
    public final j f338a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f339b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f340c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f341e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f342f;

    /* renamed from: g, reason: collision with root package name */
    public final A1.f f343g;
    public final A1.c h;
    public final A1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final A1.c f344j;

    /* renamed from: k, reason: collision with root package name */
    public final C f345k;

    /* renamed from: l, reason: collision with root package name */
    public long f346l;

    /* renamed from: m, reason: collision with root package name */
    public long f347m;

    /* renamed from: n, reason: collision with root package name */
    public long f348n;

    /* renamed from: o, reason: collision with root package name */
    public long f349o;

    /* renamed from: p, reason: collision with root package name */
    public final D f350p;

    /* renamed from: q, reason: collision with root package name */
    public D f351q;

    /* renamed from: r, reason: collision with root package name */
    public long f352r;

    /* renamed from: s, reason: collision with root package name */
    public long f353s;

    /* renamed from: t, reason: collision with root package name */
    public long f354t;

    /* renamed from: u, reason: collision with root package name */
    public long f355u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f356v;

    /* renamed from: w, reason: collision with root package name */
    public final z f357w;

    /* renamed from: x, reason: collision with root package name */
    public final m f358x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f359y;

    static {
        D d = new D();
        d.c(7, 65535);
        d.c(5, 16384);
        f337z = d;
    }

    public q(h hVar) {
        this.f338a = (j) hVar.f318f;
        String str = (String) hVar.f316c;
        if (str == null) {
            i1.f.h("connectionName");
            throw null;
        }
        this.f340c = str;
        this.f341e = 3;
        A1.f fVar = (A1.f) hVar.f314a;
        this.f343g = fVar;
        this.h = fVar.e();
        this.i = fVar.e();
        this.f344j = fVar.e();
        this.f345k = C.f287a;
        D d = new D();
        d.c(7, 16777216);
        this.f350p = d;
        this.f351q = f337z;
        this.f355u = r0.a();
        Socket socket = (Socket) hVar.f315b;
        if (socket == null) {
            i1.f.h("socket");
            throw null;
        }
        this.f356v = socket;
        K1.o oVar = (K1.o) hVar.f317e;
        if (oVar == null) {
            i1.f.h("sink");
            throw null;
        }
        this.f357w = new z(oVar);
        K1.p pVar = (K1.p) hVar.d;
        if (pVar == null) {
            i1.f.h("source");
            throw null;
        }
        this.f358x = new m(this, new u(pVar));
        this.f359y = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f357w.f397c);
        r6 = r2;
        r8.f354t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i, boolean z2, K1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f357w.f(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f354t;
                            long j5 = this.f355u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f339b.containsKey(Integer.valueOf(i))) {
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
            this.f357w.f(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void E(int i, int i2) {
        AbstractC0001b.j("errorCode", i2);
        this.h.c(new l(this.f340c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void F(int i, long j2) {
        this.h.c(new p(this.f340c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        AbstractC0001b.j("connectionCode", i);
        AbstractC0001b.j("streamCode", i2);
        byte[] bArr = y1.b.f4648a;
        try {
            i(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f339b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f339b.values().toArray(new y[0]);
                this.f339b.clear();
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f357w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f356v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f344j.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized y f(int i) {
        return (y) this.f339b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f357w.flush();
    }

    public final synchronized y h(int i) {
        y yVar;
        yVar = (y) this.f339b.remove(Integer.valueOf(i));
        notifyAll();
        return yVar;
    }

    public final void i(int i) {
        AbstractC0001b.j("statusCode", i);
        synchronized (this.f357w) {
            synchronized (this) {
                if (this.f342f) {
                    return;
                }
                this.f342f = true;
                this.f357w.i(this.d, i, y1.b.f4648a);
            }
        }
    }

    public final synchronized void q(long j2) {
        long j3 = this.f352r + j2;
        this.f352r = j3;
        long j4 = j3 - this.f353s;
        if (j4 >= this.f350p.a() / 2) {
            F(0, j4);
            this.f353s += j4;
        }
    }
}
