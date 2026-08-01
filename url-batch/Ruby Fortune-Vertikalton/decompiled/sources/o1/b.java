package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3363a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3365c;

    public b(p pVar) {
        this.f3365c = pVar;
        this.f3363a = new j(((n) pVar.f3261e).f4083a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3363a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3364b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3365c;
        n nVar = (n) pVar.f3261e;
        if (nVar.f4085c) {
            throw new IllegalStateException("closed");
        }
        nVar.f4084b.t(j2);
        nVar.e();
        n nVar2 = (n) pVar.f3261e;
        nVar2.d("\r\n");
        nVar2.c(fVar, j2);
        nVar2.d("\r\n");
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3364b) {
            return;
        }
        this.f3364b = true;
        ((n) this.f3365c.f3261e).d("0\r\n\r\n");
        p pVar = this.f3365c;
        j jVar = this.f3363a;
        pVar.getClass();
        w wVar = jVar.f4074e;
        jVar.f4074e = w.d;
        wVar.a();
        wVar.b();
        this.f3365c.f3258a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3364b) {
            return;
        }
        ((n) this.f3365c.f3261e).flush();
    }
}
