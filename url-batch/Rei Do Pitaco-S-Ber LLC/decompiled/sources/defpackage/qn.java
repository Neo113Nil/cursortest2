package defpackage;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class qn implements f20 {
    public final boolean f;
    public final m8 g = new m8();
    public boolean h;
    public final /* synthetic */ tn i;

    public qn(tn tnVar, boolean z) {
        this.i = tnVar;
        this.f = z;
    }

    @Override // defpackage.f20
    public final e50 a() {
        return this.i.l;
    }

    @Override // defpackage.f20, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        tn tnVar = this.i;
        byte[] bArr = z60.a;
        synchronized (tnVar) {
            if (this.h) {
                return;
            }
            synchronized (tnVar) {
                z = tnVar.m == 0;
            }
            tn tnVar2 = this.i;
            if (!tnVar2.j.f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        m(true);
                    }
                } else if (z) {
                    tnVar2.b.r(tnVar2.a, true, null, 0L);
                }
            }
            synchronized (this.i) {
                this.h = true;
            }
            this.i.b.flush();
            this.i.a();
        }
    }

    @Override // defpackage.f20
    public final void e(long j, m8 m8Var) {
        byte[] bArr = z60.a;
        m8 m8Var2 = this.g;
        m8Var2.e(j, m8Var);
        while (m8Var2.g >= 16384) {
            m(false);
        }
    }

    @Override // defpackage.f20, java.io.Flushable
    public final void flush() {
        tn tnVar = this.i;
        byte[] bArr = z60.a;
        synchronized (tnVar) {
            tnVar.b();
        }
        while (this.g.g > 0) {
            m(false);
            this.i.b.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void m(boolean z) {
        long min;
        boolean z2;
        tn tnVar = this.i;
        synchronized (tnVar) {
            tnVar.l.h();
            while (tnVar.e >= tnVar.f && !this.f && !this.h) {
                try {
                    synchronized (tnVar) {
                        int i = tnVar.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            tnVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    tnVar.l.k();
                    throw th;
                }
            }
            tnVar.l.k();
            tnVar.b();
            min = Math.min(tnVar.f - tnVar.e, this.g.g);
            tnVar.e += min;
            z2 = z && min == this.g.g;
        }
        this.i.l.h();
        try {
            tn tnVar2 = this.i;
            tnVar2.b.r(tnVar2.a, z2, this.g, min);
        } finally {
            this.i.l.k();
        }
    }
}
