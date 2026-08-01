package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class rn implements p20 {
    public final long f;
    public boolean g;
    public final m8 h = new m8();
    public final m8 i = new m8();
    public boolean j;
    public final /* synthetic */ tn k;

    public rn(tn tnVar, long j, boolean z) {
        this.k = tnVar;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.k.k;
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        do {
            tn tnVar = this.k;
            synchronized (tnVar) {
                tnVar.k.h();
                try {
                    synchronized (tnVar) {
                        i = tnVar.m;
                    }
                } catch (Throwable th2) {
                    tnVar.k.k();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.g) {
                Throwable th3 = tnVar.n;
                if (th3 == null) {
                    synchronized (tnVar) {
                        int i2 = tnVar.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        th3 = new l30(i2);
                    }
                }
                th = th3;
            }
            if (this.j) {
                throw new IOException("stream closed");
            }
            m8 m8Var2 = this.i;
            long j3 = m8Var2.g;
            z = false;
            if (j3 > 0) {
                j2 = m8Var2.b(Math.min(8192L, j3), m8Var);
                long j4 = tnVar.c + j2;
                tnVar.c = j4;
                long j5 = j4 - tnVar.d;
                if (th == null && j5 >= tnVar.b.u.a() / 2) {
                    tnVar.b.t(tnVar.a, j5);
                    tnVar.d = tnVar.c;
                }
            } else {
                if (!this.g && th == null) {
                    try {
                        tnVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
            tnVar.k.k();
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        tn tnVar = this.k;
        synchronized (tnVar) {
            this.j = true;
            m8 m8Var = this.i;
            j = m8Var.g;
            m8Var.skip(j);
            tnVar.notifyAll();
        }
        if (j > 0) {
            m(j);
        }
        this.k.a();
    }

    public final void m(long j) {
        byte[] bArr = z60.a;
        this.k.b.q(j);
    }
}
