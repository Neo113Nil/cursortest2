package D1;

import B1.m;
import B1.q;
import K1.p;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import x1.j;
import x1.l;

/* loaded from: classes.dex */
public final class d extends b {
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public long f274e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f276g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, l lVar) {
        super(qVar);
        i1.f.e(lVar, "url");
        this.f276g = qVar;
        this.d = lVar;
        this.f274e = -1L;
        this.f275f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f269b) {
            return;
        }
        if (this.f275f && !y1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f276g.f226c).k();
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
        if (!this.f275f) {
            return -1L;
        }
        long j3 = this.f274e;
        q qVar = this.f276g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((p) qVar.d).G(Long.MAX_VALUE);
            }
            try {
                this.f274e = ((p) qVar.d).q();
                String obj = p1.d.a0(((p) qVar.d).G(Long.MAX_VALUE)).toString();
                if (this.f274e < 0 || (obj.length() > 0 && !p1.l.J(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f274e + obj + '\"');
                }
                if (this.f274e == 0) {
                    this.f275f = false;
                    qVar.f229g = ((a) qVar.f228f).f();
                    x1.p pVar = (x1.p) qVar.f225b;
                    i1.f.b(pVar);
                    j jVar = (j) qVar.f229g;
                    i1.f.b(jVar);
                    C1.f.b(pVar.f4568j, this.d, jVar);
                    a();
                }
                if (!this.f275f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long z2 = super.z(fVar, Math.min(8192L, this.f274e));
        if (z2 != -1) {
            this.f274e -= z2;
            return z2;
        }
        ((m) qVar.f226c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
