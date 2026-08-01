package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3208a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3209b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3210c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3212f;

    public c(e eVar, t tVar, long j2) {
        X0.d.e(tVar, "delegate");
        this.f3212f = eVar;
        this.f3208a = tVar;
        this.f3209b = j2;
    }

    @Override // v1.t
    public final x a() {
        return this.f3208a.a();
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3211e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3209b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3208a.c(fVar, j2);
                this.d += j2;
                return;
            } catch (IOException e2) {
                throw f(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.d + j2));
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3211e) {
            return;
        }
        this.f3211e = true;
        long j2 = this.f3209b;
        if (j2 != -1 && this.d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3208a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3210c) {
            return iOException;
        }
        this.f3210c = true;
        return this.f3212f.a(false, true, iOException);
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        try {
            g();
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void g() {
        this.f3208a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3208a + ')';
    }
}
