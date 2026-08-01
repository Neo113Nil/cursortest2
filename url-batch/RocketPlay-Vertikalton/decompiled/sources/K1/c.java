package K1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f733a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f734b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f735c;

    public c(OutputStream outputStream, u uVar) {
        this.f735c = outputStream;
        this.f734b = uVar;
    }

    @Override // K1.t
    public final x b() {
        switch (this.f733a) {
        }
        return this.f734b;
    }

    @Override // K1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f733a) {
            case 0:
                c cVar = (c) this.f735c;
                u uVar = this.f734b;
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
                ((OutputStream) this.f735c).close();
                return;
        }
    }

    @Override // K1.t, java.io.Flushable
    public final void flush() {
        switch (this.f733a) {
            case 0:
                c cVar = (c) this.f735c;
                u uVar = this.f734b;
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
                ((OutputStream) this.f735c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f733a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f735c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f735c) + ')';
        }
    }

    @Override // K1.t
    public final void u(f fVar, long j2) {
        switch (this.f733a) {
            case 0:
                F1.d.p(fVar.f746b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f745a;
                    i1.f.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f769c - qVar.f768b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f771f;
                                i1.f.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f735c;
                    u uVar = this.f734b;
                    uVar.h();
                    try {
                        cVar.u(fVar, j3);
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
                F1.d.p(fVar.f746b, 0L, j2);
                while (j2 > 0) {
                    this.f734b.f();
                    q qVar2 = fVar.f745a;
                    i1.f.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f769c - qVar2.f768b);
                    ((OutputStream) this.f735c).write(qVar2.f767a, qVar2.f768b, min);
                    int i = qVar2.f768b + min;
                    qVar2.f768b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f746b -= j4;
                    if (i == qVar2.f769c) {
                        fVar.f745a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public c(u uVar, c cVar) {
        this.f734b = uVar;
        this.f735c = cVar;
    }
}
