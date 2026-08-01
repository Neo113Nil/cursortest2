package p1;

import X.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3492b;

    /* renamed from: c, reason: collision with root package name */
    public long f3493c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3494e;

    /* renamed from: f, reason: collision with root package name */
    public long f3495f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3496g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3497j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3498k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3499l;

    /* renamed from: m, reason: collision with root package name */
    public int f3500m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3501n;

    public w(int i, o oVar, boolean z2, boolean z3, i1.l lVar) {
        X0.d.e(oVar, "connection");
        this.f3491a = i;
        this.f3492b = oVar;
        this.f3495f = oVar.f3459q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3496g = arrayDeque;
        this.i = new u(this, oVar.f3458p.c(), z3);
        this.f3497j = new t(this, z2);
        this.f3498k = new v(this);
        this.f3499l = new v(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h;
        byte[] bArr = j1.b.f2609a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3486b && uVar.f3488e) {
                    t tVar = this.f3497j;
                    if (tVar.f3482a || tVar.f3484c) {
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
            this.f3492b.g(this.f3491a);
        }
    }

    public final void b() {
        t tVar = this.f3497j;
        if (tVar.f3484c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3482a) {
            throw new IOException("stream finished");
        }
        if (this.f3500m != 0) {
            IOException iOException = this.f3501n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3500m;
            V.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3492b;
            oVar.getClass();
            V.g("statusCode", i);
            oVar.f3465w.k(this.f3491a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = j1.b.f2609a;
        synchronized (this) {
            if (this.f3500m != 0) {
                return false;
            }
            this.f3500m = i;
            this.f3501n = iOException;
            notifyAll();
            if (this.i.f3486b) {
                if (this.f3497j.f3482a) {
                    return false;
                }
            }
            this.f3492b.g(this.f3491a);
            return true;
        }
    }

    public final void e(int i) {
        V.g("errorCode", i);
        if (d(i, null)) {
            this.f3492b.k(this.f3491a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3497j;
    }

    public final boolean g() {
        boolean z2 = (this.f3491a & 1) == 1;
        this.f3492b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3500m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3486b || uVar.f3488e) {
            t tVar = this.f3497j;
            if (tVar.f3482a || tVar.f3484c) {
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
    public final void i(i1.l lVar, boolean z2) {
        boolean h;
        X0.d.e(lVar, "headers");
        byte[] bArr = j1.b.f2609a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3486b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3496g.add(lVar);
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
        this.f3492b.g(this.f3491a);
    }

    public final synchronized void j(int i) {
        V.g("errorCode", i);
        if (this.f3500m == 0) {
            this.f3500m = i;
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
