package K1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f736a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f737b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f738c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f736a = i;
        this.f737b = obj;
        this.f738c = obj2;
    }

    @Override // K1.v
    public final x b() {
        switch (this.f736a) {
            case 0:
                return (u) this.f737b;
            default:
                return (x) this.f738c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f736a) {
            case 0:
                d dVar = (d) this.f738c;
                u uVar = (u) this.f737b;
                uVar.h();
                try {
                    dVar.close();
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
                ((InputStream) this.f737b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f736a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f738c) + ')';
            default:
                return "source(" + ((InputStream) this.f737b) + ')';
        }
    }

    @Override // K1.v
    public final long z(f fVar, long j2) {
        switch (this.f736a) {
            case 0:
                i1.f.e(fVar, "sink");
                d dVar = (d) this.f738c;
                u uVar = (u) this.f737b;
                uVar.h();
                try {
                    long z2 = dVar.z(fVar, 8192L);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return z2;
                } catch (IOException e2) {
                    if (uVar.i()) {
                        throw uVar.k(e2);
                    }
                    throw e2;
                } finally {
                    uVar.i();
                }
            default:
                i1.f.e(fVar, "sink");
                try {
                    ((x) this.f738c).f();
                    q I2 = fVar.I(1);
                    int read = ((InputStream) this.f737b).read(I2.f767a, I2.f769c, (int) Math.min(8192L, 8192 - I2.f769c));
                    if (read == -1) {
                        if (I2.f768b == I2.f769c) {
                            fVar.f745a = I2.a();
                            r.a(I2);
                        }
                        return -1L;
                    }
                    I2.f769c += read;
                    long j3 = read;
                    fVar.f746b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (F1.d.K(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }
}
