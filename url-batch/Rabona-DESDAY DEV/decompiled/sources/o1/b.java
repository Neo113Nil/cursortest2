package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3369a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3371c;

    public b(p pVar) {
        this.f3371c = pVar;
        this.f3369a = new j(((o) pVar.f3267e).f4090a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3369a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3370b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3371c;
        o oVar = (o) pVar.f3267e;
        if (oVar.f4092c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4091b.t(j2);
        oVar.e();
        o oVar2 = (o) pVar.f3267e;
        oVar2.d("\r\n");
        oVar2.c(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3370b) {
            return;
        }
        this.f3370b = true;
        ((o) this.f3371c.f3267e).d("0\r\n\r\n");
        p pVar = this.f3371c;
        j jVar = this.f3369a;
        pVar.getClass();
        x xVar = jVar.f4080e;
        jVar.f4080e = x.d;
        xVar.a();
        xVar.b();
        this.f3371c.f3264a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3370b) {
            return;
        }
        ((o) this.f3371c.f3267e).flush();
    }
}
