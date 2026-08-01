package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.u;
import v1.w;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f3188a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3189b;

    /* renamed from: c, reason: collision with root package name */
    public long f3190c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3191e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3193g;

    public d(e eVar, u uVar, long j2) {
        X0.e.e(uVar, "delegate");
        this.f3193g = eVar;
        this.f3188a = uVar;
        this.f3189b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    @Override // v1.u
    public final w a() {
        return this.f3188a.a();
    }

    @Override // v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3192f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3188a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3193g;
                eVar.getClass();
                X0.e.e(eVar.f3194a, "call");
            }
            if (b2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f3190c + b2;
            long j4 = this.f3189b;
            if (j4 == -1 || j3 <= j4) {
                this.f3190c = j3;
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
        if (this.f3192f) {
            return;
        }
        this.f3192f = true;
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3188a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3191e) {
            return iOException;
        }
        this.f3191e = true;
        e eVar = this.f3193g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            X0.e.e(eVar.f3194a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3188a + ')';
    }
}
