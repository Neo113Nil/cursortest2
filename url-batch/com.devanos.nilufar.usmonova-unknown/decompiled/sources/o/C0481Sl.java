package o;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.Sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481Sl implements HS {
    public final C0935dv h;
    public long i;
    public boolean j;

    public C0481Sl(C0935dv c0935dv, long j) {
        this.h = c0935dv;
        this.i = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0935dv c0935dv = this.h;
        if (this.j) {
            return;
        }
        this.j = true;
        ReentrantLock reentrantLock = c0935dv.k;
        reentrantLock.lock();
        try {
            int i = c0935dv.j - 1;
            c0935dv.j = i;
            if (i == 0) {
                if (c0935dv.i) {
                    synchronized (c0935dv) {
                        c0935dv.l.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.HS
    public final long read(G8 g8, long j) {
        long j2;
        long j3;
        int i;
        AbstractC0048Bt.n(g8, "sink");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0935dv c0935dv = this.h;
        long j4 = this.i;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            C1694pQ L = g8.L(1);
            byte[] bArr = L.a;
            int i2 = L.c;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (c0935dv) {
                AbstractC0048Bt.n(bArr, "array");
                c0935dv.l.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = c0935dv.l.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (L.b == L.c) {
                    g8.h = L.a();
                    AbstractC1825rQ.a(L);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                L.c += i;
                long j7 = i;
                j6 += j7;
                g8.i += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.i += j3;
        }
        return j3;
    }

    @Override // o.HS
    public final NV timeout() {
        return NV.d;
    }
}
