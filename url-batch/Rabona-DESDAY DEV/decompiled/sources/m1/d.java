package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.v;
import v1.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3211b;

    /* renamed from: c, reason: collision with root package name */
    public long f3212c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3213e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3215g;

    public d(e eVar, v vVar, long j2) {
        X0.d.e(vVar, "delegate");
        this.f3215g = eVar;
        this.f3210a = vVar;
        this.f3211b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    @Override // v1.v
    public final x a() {
        return this.f3210a.a();
    }

    @Override // v1.v
    public final long b(v1.f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (this.f3214f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3210a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3215g;
                eVar.getClass();
                X0.d.e(eVar.f3216a, "call");
            }
            if (b2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f3212c + b2;
            long j4 = this.f3211b;
            if (j4 == -1 || j3 <= j4) {
                this.f3212c = j3;
                if (j3 == j4) {
                    f(null);
                }
                return b2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3214f) {
            return;
        }
        this.f3214f = true;
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3210a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3213e) {
            return iOException;
        }
        this.f3213e = true;
        e eVar = this.f3215g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            X0.d.e(eVar.f3216a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3210a + ')';
    }
}
