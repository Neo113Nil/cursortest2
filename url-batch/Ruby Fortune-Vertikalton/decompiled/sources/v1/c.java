package v1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4057a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4059c;

    public c(OutputStream outputStream, t tVar) {
        this.f4059c = outputStream;
        this.f4058b = tVar;
    }

    @Override // v1.s
    public final w a() {
        switch (this.f4057a) {
        }
        return this.f4058b;
    }

    @Override // v1.s
    public final void c(f fVar, long j2) {
        switch (this.f4057a) {
            case 0:
                i1.s.f(fVar.f4070b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    p pVar = fVar.f4069a;
                    X0.e.b(pVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += pVar.f4091c - pVar.f4090b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                pVar = pVar.f4093f;
                                X0.e.b(pVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4059c;
                    t tVar = this.f4058b;
                    tVar.h();
                    try {
                        cVar.c(fVar, j3);
                        if (tVar.i()) {
                            throw tVar.k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!tVar.i()) {
                            throw e2;
                        }
                        throw tVar.k(e2);
                    } finally {
                        tVar.i();
                    }
                }
            default:
                i1.s.f(fVar.f4070b, 0L, j2);
                while (j2 > 0) {
                    this.f4058b.f();
                    p pVar2 = fVar.f4069a;
                    X0.e.b(pVar2);
                    int min = (int) Math.min(j2, pVar2.f4091c - pVar2.f4090b);
                    ((OutputStream) this.f4059c).write(pVar2.f4089a, pVar2.f4090b, min);
                    int i = pVar2.f4090b + min;
                    pVar2.f4090b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4070b -= j4;
                    if (i == pVar2.f4091c) {
                        fVar.f4069a = pVar2.a();
                        q.a(pVar2);
                    }
                }
                return;
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4057a) {
            case 0:
                c cVar = (c) this.f4059c;
                t tVar = this.f4058b;
                tVar.h();
                try {
                    cVar.close();
                    if (tVar.i()) {
                        throw tVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!tVar.i()) {
                        throw e2;
                    }
                    throw tVar.k(e2);
                } finally {
                    tVar.i();
                }
            default:
                ((OutputStream) this.f4059c).close();
                return;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        switch (this.f4057a) {
            case 0:
                c cVar = (c) this.f4059c;
                t tVar = this.f4058b;
                tVar.h();
                try {
                    cVar.flush();
                    if (tVar.i()) {
                        throw tVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!tVar.i()) {
                        throw e2;
                    }
                    throw tVar.k(e2);
                } finally {
                    tVar.i();
                }
            default:
                ((OutputStream) this.f4059c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4057a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4059c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4059c) + ')';
        }
    }

    public c(t tVar, c cVar) {
        this.f4058b = tVar;
        this.f4059c = cVar;
    }
}
