package o1;

import e1.l;
import f0.C0086b;
import i1.k;
import i1.m;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public long f3372e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3374g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, m mVar) {
        super(pVar);
        X0.d.e(mVar, "url");
        this.f3374g = pVar;
        this.d = mVar;
        this.f3372e = -1L;
        this.f3373f = true;
    }

    @Override // o1.a, v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3367b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3373f) {
            return -1L;
        }
        long j3 = this.f3372e;
        p pVar = this.f3374g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((v1.p) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3372e = ((v1.p) pVar.d).i();
                String obj = e1.d.y0(((v1.p) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3372e < 0 || (obj.length() > 0 && !l.i0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3372e + obj + '\"');
                }
                if (this.f3372e == 0) {
                    this.f3373f = false;
                    pVar.f3269g = ((C0086b) pVar.f3268f).f();
                    i1.p pVar2 = (i1.p) pVar.f3265b;
                    X0.d.b(pVar2);
                    k kVar = (k) pVar.f3269g;
                    X0.d.b(kVar);
                    n1.e.b(pVar2.f2487j, this.d, kVar);
                    e();
                }
                if (!this.f3373f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3372e));
        if (b2 != -1) {
            this.f3372e -= b2;
            return b2;
        }
        ((m1.m) pVar.f3266c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3367b) {
            return;
        }
        if (this.f3373f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m1.m) this.f3374g.f3266c).k();
            e();
        }
        this.f3367b = true;
    }
}
