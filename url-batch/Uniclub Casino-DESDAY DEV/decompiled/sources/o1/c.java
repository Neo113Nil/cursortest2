package o1;

import e1.l;
import f0.C0098b;
import i1.n;
import i1.q;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m1.m;
import m1.p;

/* loaded from: classes.dex */
public final class c extends a {
    public final n d;

    /* renamed from: e, reason: collision with root package name */
    public long f3347e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, n nVar) {
        super(pVar);
        X0.d.e(nVar, "url");
        this.f3349g = pVar;
        this.d = nVar;
        this.f3347e = -1L;
        this.f3348f = true;
    }

    @Override // o1.a, v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3342b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f3348f) {
            return -1L;
        }
        long j3 = this.f3347e;
        p pVar = this.f3349g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((v1.p) pVar.d).m(Long.MAX_VALUE);
            }
            try {
                this.f3347e = ((v1.p) pVar.d).i();
                String obj = e1.d.w0(((v1.p) pVar.d).m(Long.MAX_VALUE)).toString();
                if (this.f3347e < 0 || (obj.length() > 0 && !l.g0(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3347e + obj + '\"');
                }
                if (this.f3347e == 0) {
                    this.f3348f = false;
                    pVar.f3272g = ((C0098b) pVar.f3271f).f();
                    q qVar = (q) pVar.f3268b;
                    X0.d.b(qVar);
                    i1.l lVar = (i1.l) pVar.f3272g;
                    X0.d.b(lVar);
                    n1.e.b(qVar.f2494j, this.d, lVar);
                    e();
                }
                if (!this.f3348f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long b2 = super.b(fVar, Math.min(8192L, this.f3347e));
        if (b2 != -1) {
            this.f3347e -= b2;
            return b2;
        }
        ((m) pVar.f3269c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        e();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3342b) {
            return;
        }
        if (this.f3348f && !j1.b.f(this, TimeUnit.MILLISECONDS)) {
            ((m) this.f3349g.f3269c).k();
            e();
        }
        this.f3342b = true;
    }
}
