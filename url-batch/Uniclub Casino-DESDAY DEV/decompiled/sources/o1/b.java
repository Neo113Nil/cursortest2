package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3346c;

    public b(p pVar) {
        this.f3346c = pVar;
        this.f3344a = new j(((o) pVar.f3270e).f4066a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3344a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3345b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3346c;
        o oVar = (o) pVar.f3270e;
        if (oVar.f4068c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4067b.t(j2);
        oVar.e();
        o oVar2 = (o) pVar.f3270e;
        oVar2.d("\r\n");
        oVar2.c(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3345b) {
            return;
        }
        this.f3345b = true;
        ((o) this.f3346c.f3270e).d("0\r\n\r\n");
        p pVar = this.f3346c;
        j jVar = this.f3344a;
        pVar.getClass();
        x xVar = jVar.f4056e;
        jVar.f4056e = x.d;
        xVar.a();
        xVar.b();
        this.f3346c.f3267a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3345b) {
            return;
        }
        ((o) this.f3346c.f3270e).flush();
    }
}
