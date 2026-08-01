package v1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4060a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4061b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4062c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f4060a = i;
        this.f4061b = obj;
        this.f4062c = obj2;
    }

    @Override // v1.u
    public final w a() {
        switch (this.f4060a) {
            case 0:
                return (t) this.f4061b;
            default:
                return (w) this.f4062c;
        }
    }

    @Override // v1.u
    public final long b(f fVar, long j2) {
        switch (this.f4060a) {
            case 0:
                X0.e.e(fVar, "sink");
                d dVar = (d) this.f4062c;
                t tVar = (t) this.f4061b;
                tVar.h();
                try {
                    long b2 = dVar.b(fVar, 8192L);
                    if (tVar.i()) {
                        throw tVar.k(null);
                    }
                    return b2;
                } catch (IOException e2) {
                    if (tVar.i()) {
                        throw tVar.k(e2);
                    }
                    throw e2;
                } finally {
                    tVar.i();
                }
            default:
                X0.e.e(fVar, "sink");
                try {
                    ((w) this.f4062c).f();
                    p o2 = fVar.o(1);
                    int read = ((InputStream) this.f4061b).read(o2.f4089a, o2.f4091c, (int) Math.min(8192L, 8192 - o2.f4091c));
                    if (read == -1) {
                        if (o2.f4090b == o2.f4091c) {
                            fVar.f4069a = o2.a();
                            q.a(o2);
                        }
                        return -1L;
                    }
                    o2.f4091c += read;
                    long j3 = read;
                    fVar.f4070b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (i1.s.k(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4060a) {
            case 0:
                d dVar = (d) this.f4062c;
                t tVar = (t) this.f4061b;
                tVar.h();
                try {
                    dVar.close();
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
                ((InputStream) this.f4061b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4060a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4062c) + ')';
            default:
                return "source(" + ((InputStream) this.f4061b) + ')';
        }
    }
}
