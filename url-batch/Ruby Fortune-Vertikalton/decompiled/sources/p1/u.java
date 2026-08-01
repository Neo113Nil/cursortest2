package p1;

import X.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements v1.u {

    /* renamed from: a, reason: collision with root package name */
    public final long f3480a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3481b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.f f3482c = new v1.f();
    public final v1.f d = new v1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3484f;

    public u(w wVar, long j2, boolean z2) {
        this.f3484f = wVar;
        this.f3480a = j2;
        this.f3481b = z2;
    }

    @Override // v1.u
    public final v1.w a() {
        return this.f3484f.f3493k;
    }

    @Override // v1.u
    public final long b(v1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        X0.e.e(fVar, "sink");
        do {
            w wVar = this.f3484f;
            synchronized (wVar) {
                wVar.f3493k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3495m;
                    }
                } finally {
                    wVar.f3493k.k();
                }
            }
            if (i == 0 || this.f3481b) {
                th = null;
            } else {
                th = wVar.f3496n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3495m;
                        V.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3483e) {
                throw new IOException("stream closed");
            }
            v1.f fVar2 = this.d;
            long j4 = fVar2.f4070b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.b(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3488c + j3;
                wVar.f3488c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f3487b.f3453p.b() / 2) {
                    wVar.f3487b.l(wVar.f3486a, j6);
                    wVar.d = wVar.f3488c;
                }
            } else {
                if (!this.f3481b && th == null) {
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
        w wVar = this.f3484f;
        synchronized (wVar) {
            this.f3483e = true;
            v1.f fVar = this.d;
            j2 = fVar.f4070b;
            fVar.m(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            e(j2);
        }
        this.f3484f.a();
    }

    public final void e(long j2) {
        byte[] bArr = j1.b.f2600a;
        this.f3484f.f3487b.i(j2);
    }
}
