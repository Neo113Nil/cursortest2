package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3347a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3349c;

    public b(p pVar) {
        this.f3349c = pVar;
        this.f3347a = new j(((n) pVar.f3245e).f4067a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3347a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3348b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3349c;
        n nVar = (n) pVar.f3245e;
        if (nVar.f4069c) {
            throw new IllegalStateException("closed");
        }
        nVar.f4068b.t(j2);
        nVar.e();
        n nVar2 = (n) pVar.f3245e;
        nVar2.d("\r\n");
        nVar2.c(fVar, j2);
        nVar2.d("\r\n");
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3348b) {
            return;
        }
        this.f3348b = true;
        ((n) this.f3349c.f3245e).d("0\r\n\r\n");
        p pVar = this.f3349c;
        j jVar = this.f3347a;
        pVar.getClass();
        w wVar = jVar.f4058e;
        jVar.f4058e = w.d;
        wVar.a();
        wVar.b();
        this.f3349c.f3242a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3348b) {
            return;
        }
        ((n) this.f3349c.f3245e).flush();
    }
}
