package D1;

import B1.m;
import B1.q;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends b {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, long j2) {
        super(qVar);
        this.f277e = qVar;
        this.d = j2;
        if (j2 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f269b) {
            return;
        }
        if (this.d != 0 && !y1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f277e.f226c).k();
            a();
        }
        this.f269b = true;
    }

    @Override // D1.b, K1.v
    public final long z(K1.f fVar, long j2) {
        i1.f.e(fVar, "sink");
        if (this.f269b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 == 0) {
            return -1L;
        }
        long z2 = super.z(fVar, Math.min(j3, 8192L));
        if (z2 == -1) {
            ((m) this.f277e.f226c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j4 = this.d - z2;
        this.d = j4;
        if (j4 == 0) {
            a();
        }
        return z2;
    }
}
