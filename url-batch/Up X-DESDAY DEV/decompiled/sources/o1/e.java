package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3354a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3356c;

    public e(p pVar) {
        this.f3356c = pVar;
        this.f3354a = new j(((n) pVar.f3245e).f4067a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3354a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3355b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4054b;
        byte[] bArr = j1.b.f2584a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((n) this.f3356c.f3245e).c(fVar, j2);
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3355b) {
            return;
        }
        this.f3355b = true;
        p pVar = this.f3356c;
        pVar.getClass();
        j jVar = this.f3354a;
        w wVar = jVar.f4058e;
        jVar.f4058e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3242a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        if (this.f3355b) {
            return;
        }
        ((n) this.f3356c.f3245e).flush();
    }
}
