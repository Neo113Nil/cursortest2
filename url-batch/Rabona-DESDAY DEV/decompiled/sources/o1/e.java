package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3376a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3378c;

    public e(p pVar) {
        this.f3378c = pVar;
        this.f3376a = new j(((o) pVar.f3267e).f4090a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3376a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3377b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4076b;
        byte[] bArr = j1.b.f2606a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3378c.f3267e).c(fVar, j2);
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3377b) {
            return;
        }
        this.f3377b = true;
        p pVar = this.f3378c;
        pVar.getClass();
        j jVar = this.f3376a;
        x xVar = jVar.f4080e;
        jVar.f4080e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3264a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        if (this.f3377b) {
            return;
        }
        ((o) this.f3378c.f3267e).flush();
    }
}
