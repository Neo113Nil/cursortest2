package B1;

import K1.v;
import K1.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f168a;

    /* renamed from: b, reason: collision with root package name */
    public final long f169b;

    /* renamed from: c, reason: collision with root package name */
    public long f170c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f171e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f173g;

    public d(e eVar, v vVar, long j2) {
        i1.f.e(vVar, "delegate");
        this.f173g = eVar;
        this.f168a = vVar;
        this.f169b = j2;
        this.d = true;
        if (j2 == 0) {
            f(null);
        }
    }

    public final void a() {
        this.f168a.close();
    }

    @Override // K1.v
    public final x b() {
        return this.f168a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f172f) {
            return;
        }
        this.f172f = true;
        try {
            a();
            f(null);
        } catch (IOException e2) {
            throw f(e2);
        }
    }

    public final IOException f(IOException iOException) {
        if (this.f171e) {
            return iOException;
        }
        this.f171e = true;
        e eVar = this.f173g;
        if (iOException == null && this.d) {
            this.d = false;
            eVar.getClass();
            i1.f.e(eVar.f174a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f168a + ')';
    }

    @Override // K1.v
    public final long z(K1.f fVar, long j2) {
        i1.f.e(fVar, "sink");
        if (this.f172f) {
            throw new IllegalStateException("closed");
        }
        try {
            long z2 = this.f168a.z(fVar, 8192L);
            if (this.d) {
                this.d = false;
                e eVar = this.f173g;
                eVar.getClass();
                i1.f.e(eVar.f174a, "call");
            }
            if (z2 == -1) {
                f(null);
                return -1L;
            }
            long j3 = this.f170c + z2;
            long j4 = this.f169b;
            if (j4 == -1 || j3 <= j4) {
                this.f170c = j3;
                if (j3 == j4) {
                    f(null);
                }
                return z2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw f(e2);
        }
    }
}
