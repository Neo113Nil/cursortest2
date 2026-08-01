package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements K1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f377a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f378b;

    /* renamed from: c, reason: collision with root package name */
    public final K1.f f379c = new K1.f();
    public final K1.f d = new K1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f381f;

    public w(y yVar, long j2, boolean z2) {
        this.f381f = yVar;
        this.f377a = j2;
        this.f378b = z2;
    }

    public final void a(long j2) {
        byte[] bArr = y1.b.f4648a;
        this.f381f.f384b.q(j2);
    }

    @Override // K1.v
    public final K1.x b() {
        return this.f381f.f390k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        y yVar = this.f381f;
        synchronized (yVar) {
            this.f380e = true;
            K1.f fVar = this.d;
            j2 = fVar.f746b;
            fVar.G(j2);
            yVar.notifyAll();
        }
        if (j2 > 0) {
            a(j2);
        }
        this.f381f.a();
    }

    @Override // K1.v
    public final long z(K1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        i1.f.e(fVar, "sink");
        do {
            y yVar = this.f381f;
            synchronized (yVar) {
                yVar.f390k.h();
                try {
                    synchronized (yVar) {
                        i = yVar.f392m;
                    }
                } finally {
                    yVar.f390k.k();
                }
            }
            if (i == 0 || this.f378b) {
                th = null;
            } else {
                th = yVar.f393n;
                if (th == null) {
                    synchronized (yVar) {
                        int i2 = yVar.f392m;
                        AbstractC0001b.h(i2);
                        th = new E(i2);
                    }
                }
            }
            if (this.f380e) {
                throw new IOException("stream closed");
            }
            K1.f fVar2 = this.d;
            long j4 = fVar2.f746b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.z(fVar, Math.min(8192L, j4));
                long j5 = yVar.f385c + j3;
                yVar.f385c = j5;
                long j6 = j5 - yVar.d;
                if (th == null && j6 >= yVar.f384b.f350p.a() / 2) {
                    yVar.f384b.F(yVar.f383a, j6);
                    yVar.d = yVar.f385c;
                }
            } else {
                if (!this.f378b && th == null) {
                    yVar.k();
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
}
