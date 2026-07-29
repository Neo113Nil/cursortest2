package o;

import com.google.firebase.messaging.Constants;
import java.io.InterruptedIOException;

/* renamed from: o.Vr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565Vr implements YR {
    public final boolean h;
    public final G8 i = new G8();
    public boolean j;
    public final /* synthetic */ C0643Yr k;

    public C0565Vr(C0643Yr c0643Yr, boolean z) {
        this.k = c0643Yr;
        this.h = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        long min;
        boolean z2;
        C0643Yr c0643Yr = this.k;
        synchronized (c0643Yr) {
            c0643Yr.l.h();
            while (c0643Yr.e >= c0643Yr.f && !this.h && !this.j) {
                try {
                    synchronized (c0643Yr) {
                        int i = c0643Yr.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            c0643Yr.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    c0643Yr.l.k();
                    throw th;
                }
            }
            c0643Yr.l.k();
            c0643Yr.b();
            min = Math.min(c0643Yr.f - c0643Yr.e, this.i.i);
            c0643Yr.e += min;
            z2 = z && min == this.i.i;
        }
        this.k.l.h();
        try {
            C0643Yr c0643Yr2 = this.k;
            c0643Yr2.b.q(c0643Yr2.a, z2, this.i, min);
        } finally {
            this.k.l.k();
        }
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        C0643Yr c0643Yr = this.k;
        byte[] bArr = HY.a;
        synchronized (c0643Yr) {
            if (this.j) {
                return;
            }
            synchronized (c0643Yr) {
                z = c0643Yr.m == 0;
            }
            C0643Yr c0643Yr2 = this.k;
            if (!c0643Yr2.j.h) {
                if (this.i.i > 0) {
                    while (this.i.i > 0) {
                        b(true);
                    }
                } else if (z) {
                    c0643Yr2.b.q(c0643Yr2.a, true, null, 0L);
                }
            }
            synchronized (this.k) {
                this.j = true;
            }
            this.k.b.flush();
            this.k.a();
        }
    }

    @Override // o.YR, java.io.Flushable
    public final void flush() {
        C0643Yr c0643Yr = this.k;
        byte[] bArr = HY.a;
        synchronized (c0643Yr) {
            c0643Yr.b();
        }
        while (this.i.i > 0) {
            b(false);
            this.k.b.flush();
        }
    }

    @Override // o.YR
    public final NV timeout() {
        return this.k.l;
    }

    @Override // o.YR
    public final void write(G8 g8, long j) {
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        byte[] bArr = HY.a;
        G8 g82 = this.i;
        g82.write(g8, j);
        while (g82.i >= 16384) {
            b(false);
        }
    }
}
