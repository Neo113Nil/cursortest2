package p1;

import X.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements v1.u {

    /* renamed from: a, reason: collision with root package name */
    public final long f3464a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3465b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.f f3466c = new v1.f();
    public final v1.f d = new v1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3468f;

    public u(w wVar, long j2, boolean z2) {
        this.f3468f = wVar;
        this.f3464a = j2;
        this.f3465b = z2;
    }

    @Override // v1.u
    public final v1.w a() {
        return this.f3468f.f3477k;
    }

    @Override // v1.u
    public final long b(v1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        X0.e.e(fVar, "sink");
        do {
            w wVar = this.f3468f;
            synchronized (wVar) {
                wVar.f3477k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3479m;
                    }
                } finally {
                    wVar.f3477k.k();
                }
            }
            if (i == 0 || this.f3465b) {
                th = null;
            } else {
                th = wVar.f3480n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3479m;
                        V.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3467e) {
                throw new IOException("stream closed");
            }
            v1.f fVar2 = this.d;
            long j4 = fVar2.f4054b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.b(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3472c + j3;
                wVar.f3472c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f3471b.f3437p.c() / 2) {
                    wVar.f3471b.l(wVar.f3470a, j6);
                    wVar.d = wVar.f3472c;
                }
            } else {
                if (!this.f3465b && th == null) {
                    wVar.k();
                    z2 = true;
                }
                j3 = -1;
            }
        } while (z2);
        if (j3 != -1) {
            return j3;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        w wVar = this.f3468f;
        synchronized (wVar) {
            this.f3467e = true;
            v1.f fVar = this.d;
            j2 = fVar.f4054b;
            fVar.m(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            e(j2);
        }
        this.f3468f.a();
    }

    public final void e(long j2) {
        byte[] bArr = j1.b.f2584a;
        this.f3468f.f3471b.i(j2);
    }
}
