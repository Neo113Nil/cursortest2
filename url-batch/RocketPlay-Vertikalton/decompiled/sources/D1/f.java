package D1;

import B1.q;
import K1.j;
import K1.o;
import K1.t;
import K1.x;

/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f278a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f280c;

    public f(q qVar) {
        this.f280c = qVar;
        this.f278a = new j(((o) qVar.f227e).f761a.b());
    }

    @Override // K1.t
    public final x b() {
        return this.f278a;
    }

    @Override // K1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f279b) {
            return;
        }
        this.f279b = true;
        q qVar = this.f280c;
        qVar.getClass();
        j jVar = this.f278a;
        x xVar = jVar.f750e;
        jVar.f750e = x.d;
        xVar.a();
        xVar.b();
        qVar.f224a = 3;
    }

    @Override // K1.t, java.io.Flushable
    public final void flush() {
        if (this.f279b) {
            return;
        }
        ((o) this.f280c.f227e).flush();
    }

    @Override // K1.t
    public final void u(K1.f fVar, long j2) {
        if (this.f279b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f746b;
        byte[] bArr = y1.b.f4648a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f280c.f227e).u(fVar, j2);
    }
}
