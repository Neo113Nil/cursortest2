package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.u;
import v1.w;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f3204a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3205b;

    /* renamed from: c, reason: collision with root package name */
    public long f3206c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3207e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3209g;

    public d(e eVar, u uVar, long j2) {
        X0.e.e(uVar, "delegate");
        this.f3209g = eVar;
        this.f3204a = uVar;
        this.f3205b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    @Override // v1.u
    public final w a() {
        return this.f3204a.a();
    }

    @Override // v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3208f) {
            throw new IllegalStateException("closed");
        }
        try {
            long b2 = this.f3204a.b(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f3209g;
                eVar.getClass();
                X0.e.e(eVar.f3210a, "call");
            }
            if (b2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f3206c + b2;
            long j4 = this.f3205b;
            if (j4 == -1 || j3 <= j4) {
                this.f3206c = j3;
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
        if (this.f3208f) {
            return;
        }
        this.f3208f = true;
        try {
            e();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final void e() {
        this.f3204a.close();
    }

    public final IOException f(IOException iOException) {
        if (this.f3207e) {
            return iOException;
        }
        this.f3207e = true;
        e eVar = this.f3209g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            X0.e.e(eVar.f3210a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3204a + ')';
    }
}
