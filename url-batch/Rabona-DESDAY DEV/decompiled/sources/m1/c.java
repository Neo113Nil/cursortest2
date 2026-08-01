package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f3205a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3206b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3207c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3209f;

    public c(e eVar, t tVar, long j2) {
        X0.d.e(tVar, "delegate");
        this.f3209f = eVar;
        this.f3205a = tVar;
        this.f3206b = j2;
    }

    @Override // v1.t
    public final x a() {
        return this.f3205a.a();
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3208e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3206b;
        if (j3 == -1 || this.d + j2 <= j3) {
            try {
                this.f3205a.c(fVar, j2);
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
        if (this.f3208e) {
            return;
        }
        this.f3208e = true;
        long j2 = this.f3206b;
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
        this.f3205a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3207c) {
            return iOException;
        }
        this.f3207c = true;
        return this.f3209f.a(false, true, iOException);
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
        this.f3205a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3205a + ')';
    }
}
