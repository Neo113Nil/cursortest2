package E1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f383a;

    /* renamed from: b, reason: collision with root package name */
    public final q f384b;

    /* renamed from: c, reason: collision with root package name */
    public long f385c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f386e;

    /* renamed from: f, reason: collision with root package name */
    public long f387f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f388g;
    public boolean h;
    public final w i;

    /* renamed from: j, reason: collision with root package name */
    public final v f389j;

    /* renamed from: k, reason: collision with root package name */
    public final x f390k;

    /* renamed from: l, reason: collision with root package name */
    public final x f391l;

    /* renamed from: m, reason: collision with root package name */
    public int f392m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f393n;

    public y(int i, q qVar, boolean z2, boolean z3, x1.j jVar) {
        i1.f.e(qVar, "connection");
        this.f383a = i;
        this.f384b = qVar;
        this.f387f = qVar.f351q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f388g = arrayDeque;
        this.i = new w(this, qVar.f350p.a(), z3);
        this.f389j = new v(this, z2);
        this.f390k = new x(this);
        this.f391l = new x(this);
        if (jVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(jVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h;
        byte[] bArr = y1.b.f4648a;
        synchronized (this) {
            try {
                w wVar = this.i;
                if (!wVar.f378b && wVar.f380e) {
                    v vVar = this.f389j;
                    if (vVar.f374a || vVar.f376c) {
                        z2 = true;
                        h = h();
                    }
                }
                z2 = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            c(9, null);
        } else {
            if (h) {
                return;
            }
            this.f384b.h(this.f383a);
        }
    }

    public final void b() {
        v vVar = this.f389j;
        if (vVar.f376c) {
            throw new IOException("stream closed");
        }
        if (vVar.f374a) {
            throw new IOException("stream finished");
        }
        if (this.f392m != 0) {
            IOException iOException = this.f393n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f392m;
            AbstractC0001b.h(i);
            throw new E(i);
        }
    }

    public final void c(int i, IOException iOException) {
        AbstractC0001b.j("rstStatusCode", i);
        if (d(i, iOException)) {
            q qVar = this.f384b;
            qVar.getClass();
            AbstractC0001b.j("statusCode", i);
            qVar.f357w.E(this.f383a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = y1.b.f4648a;
        synchronized (this) {
            if (this.f392m != 0) {
                return false;
            }
            this.f392m = i;
            this.f393n = iOException;
            notifyAll();
            if (this.i.f378b) {
                if (this.f389j.f374a) {
                    return false;
                }
            }
            this.f384b.h(this.f383a);
            return true;
        }
    }

    public final void e(int i) {
        AbstractC0001b.j("errorCode", i);
        if (d(i, null)) {
            this.f384b.E(this.f383a, i);
        }
    }

    public final v f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f389j;
    }

    public final boolean g() {
        boolean z2 = (this.f383a & 1) == 1;
        this.f384b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f392m != 0) {
            return false;
        }
        w wVar = this.i;
        if (wVar.f378b || wVar.f380e) {
            v vVar = this.f389j;
            if (vVar.f374a || vVar.f376c) {
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(x1.j jVar, boolean z2) {
        boolean h;
        i1.f.e(jVar, "headers");
        byte[] bArr = y1.b.f4648a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f378b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f388g.add(jVar);
                if (z2) {
                }
                h = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h) {
            return;
        }
        this.f384b.h(this.f383a);
    }

    public final synchronized void j(int i) {
        AbstractC0001b.j("errorCode", i);
        if (this.f392m == 0) {
            this.f392m = i;
            notifyAll();
        }
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
