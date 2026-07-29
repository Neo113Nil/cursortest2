package o;

import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: o.Wr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591Wr implements HS {
    public final long h;
    public boolean i;
    public final G8 j = new G8();
    public final G8 k = new G8();
    public boolean l;
    public final /* synthetic */ C0643Yr m;

    public C0591Wr(C0643Yr c0643Yr, long j, boolean z) {
        this.m = c0643Yr;
        this.h = j;
        this.i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C0643Yr c0643Yr = this.m;
        synchronized (c0643Yr) {
            this.l = true;
            G8 g8 = this.k;
            j = g8.i;
            g8.b();
            c0643Yr.notifyAll();
        }
        if (j > 0) {
            C0643Yr c0643Yr2 = this.m;
            byte[] bArr = HY.a;
            c0643Yr2.b.m(j);
        }
        this.m.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[LOOP:0: B:3:0x000e->B:40:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    @Override // o.HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(G8 g8, long j) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        AbstractC0048Bt.n(g8, "sink");
        long j3 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        while (true) {
            C0643Yr c0643Yr = this.m;
            synchronized (c0643Yr) {
                c0643Yr.k.h();
                try {
                    synchronized (c0643Yr) {
                        i = c0643Yr.m;
                    }
                    if (z) {
                        if (j2 != -1) {
                            return j2;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j3 = 0;
                } finally {
                    c0643Yr.k.k();
                }
            }
            if (i == 0 || this.i) {
                th = null;
            } else {
                th = c0643Yr.n;
                if (th == null) {
                    synchronized (c0643Yr) {
                        int i2 = c0643Yr.m;
                        AbstractC1888sN.o(i2);
                        th = new QT(i2);
                    }
                }
            }
            if (this.l) {
                throw new IOException("stream closed");
            }
            G8 g82 = this.k;
            long j4 = g82.i;
            z = false;
            if (j4 > j3) {
                j2 = g82.read(g8, Math.min(j, j4));
                long j5 = c0643Yr.c + j2;
                c0643Yr.c = j5;
                long j6 = j5 - c0643Yr.d;
                if (th == null && j6 >= c0643Yr.b.w.a() / 2) {
                    c0643Yr.b.v(j6, c0643Yr.a);
                    c0643Yr.d = c0643Yr.c;
                }
            } else {
                if (!this.i && th == null) {
                    try {
                        c0643Yr.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
            if (z) {
            }
        }
    }

    @Override // o.HS
    public final NV timeout() {
        return this.m.k;
    }
}
