package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3351a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3353c;

    public e(p pVar) {
        this.f3353c = pVar;
        this.f3351a = new j(((o) pVar.f3270e).f4066a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3351a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3352b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4052b;
        byte[] bArr = j1.b.f2609a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3353c.f3270e).c(fVar, j2);
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3352b) {
            return;
        }
        this.f3352b = true;
        p pVar = this.f3353c;
        pVar.getClass();
        j jVar = this.f3351a;
        x xVar = jVar.f4056e;
        jVar.f4056e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3267a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        if (this.f3352b) {
            return;
        }
        ((o) this.f3353c.f3270e).flush();
    }
}
