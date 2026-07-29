package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.Fr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150Fr implements YR {
    public final C2179wo h;
    public boolean i;
    public final /* synthetic */ C0202Hr j;

    public C0150Fr(C0202Hr c0202Hr) {
        this.j = c0202Hr;
        this.h = new C2179wo(((M8) c0202Hr.f).timeout());
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        C2179wo c2179wo = this.h;
        NV nv = c2179wo.e;
        c2179wo.e = NV.d;
        nv.a();
        nv.b();
        this.j.b = 3;
    }

    @Override // o.YR, java.io.Flushable
    public final void flush() {
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
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        if (this.i) {
            throw new IllegalStateException("closed");
        }
        long j2 = g8.i;
        byte[] bArr = HY.a;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((M8) this.j.f).write(g8, j);
    }
}
