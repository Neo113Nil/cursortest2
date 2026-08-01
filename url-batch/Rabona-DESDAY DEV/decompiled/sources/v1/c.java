package v1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4063a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f4064b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4065c;

    public c(OutputStream outputStream, u uVar) {
        this.f4065c = outputStream;
        this.f4064b = uVar;
    }

    @Override // v1.t
    public final x a() {
        switch (this.f4063a) {
        }
        return this.f4064b;
    }

    @Override // v1.t
    public final void c(f fVar, long j2) {
        switch (this.f4063a) {
            case 0:
                i1.s.f(fVar.f4076b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f4075a;
                    X0.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f4098c - qVar.f4097b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f4100f;
                                X0.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4065c;
                    u uVar = this.f4064b;
                    uVar.h();
                    try {
                        cVar.c(fVar, j3);
                        if (uVar.i()) {
                            throw uVar.k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!uVar.i()) {
                            throw e2;
                        }
                        throw uVar.k(e2);
                    } finally {
                        uVar.i();
                    }
                }
            default:
                i1.s.f(fVar.f4076b, 0L, j2);
                while (j2 > 0) {
                    this.f4064b.f();
                    q qVar2 = fVar.f4075a;
                    X0.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f4098c - qVar2.f4097b);
                    ((OutputStream) this.f4065c).write(qVar2.f4096a, qVar2.f4097b, min);
                    int i = qVar2.f4097b + min;
                    qVar2.f4097b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4076b -= j4;
                    if (i == qVar2.f4098c) {
                        fVar.f4075a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4063a) {
            case 0:
                c cVar = (c) this.f4065c;
                u uVar = this.f4064b;
                uVar.h();
                try {
                    cVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!uVar.i()) {
                        throw e2;
                    }
                    throw uVar.k(e2);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f4065c).close();
                return;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        switch (this.f4063a) {
            case 0:
                c cVar = (c) this.f4065c;
                u uVar = this.f4064b;
                uVar.h();
                try {
                    cVar.flush();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!uVar.i()) {
                        throw e2;
                    }
                    throw uVar.k(e2);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f4065c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4063a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4065c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4065c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f4064b = uVar;
        this.f4065c = cVar;
    }
}
