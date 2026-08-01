package B1;

import K1.t;
import K1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f163a;

    /* renamed from: b, reason: collision with root package name */
    public final long f164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f165c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f167f;

    public c(e eVar, t tVar, long j2) {
        i1.f.e(tVar, "delegate");
        this.f167f = eVar;
        this.f163a = tVar;
        this.f164b = j2;
    }

    public final void a() {
        this.f163a.close();
    }

    @Override // K1.t
    public final x b() {
        return this.f163a.b();
    }

    @Override // K1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f166e) {
            return;
        }
        this.f166e = true;
        long j2 = this.f164b;
        if (j2 != -1 && this.d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final IOException f(IOException iOException) {
        if (this.f165c) {
            return iOException;
        }
        this.f165c = true;
        return this.f167f.a(false, true, iOException);
    }

    @Override // K1.t, java.io.Flushable
    public final void flush() {
        try {
            h();
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void h() {
        this.f163a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f163a + ')';
    }

    @Override // K1.t
    public final void u(K1.f fVar, long j2) {
        if (this.f166e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f164b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f163a.u(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw f(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }
}
