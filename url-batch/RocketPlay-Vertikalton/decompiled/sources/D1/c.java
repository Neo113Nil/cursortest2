package D1;

import B1.q;
import K1.j;
import K1.o;
import K1.t;
import K1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f271a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f273c;

    public c(q qVar) {
        this.f273c = qVar;
        this.f271a = new j(((o) qVar.f227e).f761a.b());
    }

    @Override // K1.t
    public final x b() {
        return this.f271a;
    }

    @Override // K1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f272b) {
            return;
        }
        this.f272b = true;
        ((o) this.f273c.f227e).o("0\r\n\r\n");
        q qVar = this.f273c;
        j jVar = this.f271a;
        qVar.getClass();
        x xVar = jVar.f750e;
        jVar.f750e = x.d;
        xVar.a();
        xVar.b();
        this.f273c.f224a = 3;
    }

    @Override // K1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f272b) {
            return;
        }
        ((o) this.f273c.f227e).flush();
    }

    @Override // K1.t
    public final void u(K1.f fVar, long j2) {
        if (this.f272b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        q qVar = this.f273c;
        o oVar = (o) qVar.f227e;
        if (oVar.f763c) {
            throw new IllegalStateException("closed");
        }
        oVar.f762b.N(j2);
        oVar.a();
        o oVar2 = (o) qVar.f227e;
        oVar2.o("\r\n");
        oVar2.u(fVar, j2);
        oVar2.o("\r\n");
    }
}
