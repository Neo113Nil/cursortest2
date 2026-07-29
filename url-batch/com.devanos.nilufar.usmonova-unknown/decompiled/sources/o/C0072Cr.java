package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.Cr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072Cr implements YR {
    public final C2179wo h;
    public boolean i;
    public final /* synthetic */ C0202Hr j;

    public C0072Cr(C0202Hr c0202Hr) {
        this.j = c0202Hr;
        this.h = new C2179wo(((M8) c0202Hr.f).timeout());
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        ((M8) this.j.f).z("0\r\n\r\n");
        C2179wo c2179wo = this.h;
        NV nv = c2179wo.e;
        c2179wo.e = NV.d;
        nv.a();
        nv.b();
        this.j.b = 3;
    }

    @Override // o.YR, java.io.Flushable
    public final synchronized void flush() {
        if (this.i) {
            return;
        }
        ((M8) this.j.f).flush();
    }

    @Override // o.YR
    public final NV timeout() {
        return this.h;
    }

    @Override // o.YR
    public final void write(G8 g8, long j) {
        M8 m8 = (M8) this.j.f;
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        if (this.i) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        m8.g(j);
        m8.z("\r\n");
        m8.write(g8, j);
        m8.z("\r\n");
    }
}
