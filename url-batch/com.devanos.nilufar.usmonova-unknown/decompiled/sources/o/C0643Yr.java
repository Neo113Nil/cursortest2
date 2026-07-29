package o;

import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: o.Yr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643Yr {
    public final int a;
    public final C0461Rr b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final C0591Wr i;
    public final C0565Vr j;
    public final C0617Xr k;
    public final C0617Xr l;
    public int m;
    public IOException n;

    public C0643Yr(int i, C0461Rr c0461Rr, boolean z, boolean z2, C1852rr c1852rr) {
        AbstractC0048Bt.n(c0461Rr, "connection");
        this.a = i;
        this.b = c0461Rr;
        this.f = c0461Rr.x.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new C0591Wr(this, c0461Rr.w.a(), z2);
        this.j = new C0565Vr(this, z);
        this.k = new C0617Xr(this);
        this.l = new C0617Xr(this);
        if (c1852rr == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c1852rr);
        }
    }

    public final void a() {
        boolean z;
        boolean h;
        byte[] bArr = HY.a;
        synchronized (this) {
            try {
                C0591Wr c0591Wr = this.i;
                if (!c0591Wr.i && c0591Wr.l) {
                    C0565Vr c0565Vr = this.j;
                    if (!c0565Vr.h) {
                        if (c0565Vr.j) {
                        }
                    }
                    z = true;
                    h = h();
                }
                z = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (h) {
                return;
            }
            this.b.j(this.a);
        }
    }

    public final void b() {
        C0565Vr c0565Vr = this.j;
        if (c0565Vr.j) {
            throw new IOException("stream closed");
        }
        if (c0565Vr.h) {
            throw new IOException("stream finished");
        }
        if (this.m != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.m;
            AbstractC1888sN.o(i);
            throw new QT(i);
        }
    }

    public final void c(int i, IOException iOException) {
        AbstractC1888sN.p(i, "rstStatusCode");
        if (d(i, iOException)) {
            C0461Rr c0461Rr = this.b;
            c0461Rr.getClass();
            AbstractC1888sN.p(i, "statusCode");
            c0461Rr.D.t(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = HY.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.i) {
                if (this.j.h) {
                    return false;
                }
            }
            this.b.j(this.a);
            return true;
        }
    }

    public final void e(int i) {
        AbstractC1888sN.p(i, "errorCode");
        if (d(i, null)) {
            this.b.t(this.a, i);
        }
    }

    public final C0565Vr f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            C0591Wr c0591Wr = this.i;
            if (!c0591Wr.i) {
                if (c0591Wr.l) {
                }
                return true;
            }
            C0565Vr c0565Vr = this.j;
            if (c0565Vr.h || c0565Vr.j) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(C1852rr c1852rr, boolean z) {
        boolean h;
        AbstractC0048Bt.n(c1852rr, "headers");
        byte[] bArr = HY.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.i = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.g.add(c1852rr);
                if (z) {
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
        this.b.j(this.a);
    }

    public final synchronized void j(int i) {
        AbstractC1888sN.p(i, "errorCode");
        if (this.m == 0) {
            this.m = i;
            notifyAll();
        }
    }
}
