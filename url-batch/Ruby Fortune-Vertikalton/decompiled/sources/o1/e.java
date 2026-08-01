package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3370a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3372c;

    public e(p pVar) {
        this.f3372c = pVar;
        this.f3370a = new j(((n) pVar.f3261e).f4083a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3370a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3371b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4070b;
        byte[] bArr = j1.b.f2600a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((n) this.f3372c.f3261e).c(fVar, j2);
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3371b) {
            return;
        }
        this.f3371b = true;
        p pVar = this.f3372c;
        pVar.getClass();
        j jVar = this.f3370a;
        w wVar = jVar.f4074e;
        jVar.f4074e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3258a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        if (this.f3371b) {
            return;
        }
        ((n) this.f3372c.f3261e).flush();
    }
}
