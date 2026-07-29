package o;

import com.google.firebase.messaging.Constants;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.Rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455Rl implements YR {
    public final C0935dv h;
    public long i;
    public boolean j;

    public C0455Rl(C0935dv c0935dv) {
        AbstractC0048Bt.n(c0935dv, "fileHandle");
        this.h = c0935dv;
        this.i = 0L;
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // o.YR, java.io.Flushable
    public final void flush() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0935dv c0935dv = this.h;
        synchronized (c0935dv) {
            c0935dv.l.getFD().sync();
        }
    }

    @Override // o.YR
    public final NV timeout() {
        return NV.d;
    }

    @Override // o.YR
    public final void write(G8 g8, long j) {
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0935dv c0935dv = this.h;
        long j2 = this.i;
        c0935dv.getClass();
        EB.f(g8.i, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            C1694pQ c1694pQ = g8.h;
            AbstractC0048Bt.k(c1694pQ);
            int min = (int) Math.min(j3 - j2, c1694pQ.c - c1694pQ.b);
            byte[] bArr = c1694pQ.a;
            int i = c1694pQ.b;
            synchronized (c0935dv) {
                AbstractC0048Bt.n(bArr, "array");
                c0935dv.l.seek(j2);
                c0935dv.l.write(bArr, i, min);
            }
            int i2 = c1694pQ.b + min;
            c1694pQ.b = i2;
            long j4 = min;
            j2 += j4;
            g8.i -= j4;
            if (i2 == c1694pQ.c) {
                g8.h = c1694pQ.a();
                AbstractC1825rQ.a(c1694pQ);
            }
        }
        this.i += j;
    }
}
