package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class W6 implements HS {
    public final /* synthetic */ int h;
    public final Object i;
    public final Object j;

    public /* synthetic */ W6(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.h) {
            case 0:
                FS fs = (FS) this.i;
                W6 w6 = (W6) this.j;
                fs.h();
                try {
                    w6.close();
                    if (fs.i()) {
                        throw fs.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!fs.i()) {
                        throw e;
                    }
                    throw fs.k(e);
                } finally {
                    fs.i();
                }
            default:
                ((InputStream) this.i).close();
                return;
        }
    }

    @Override // o.HS
    public final long read(G8 g8, long j) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(g8, "sink");
                FS fs = (FS) this.i;
                W6 w6 = (W6) this.j;
                fs.h();
                try {
                    long read = w6.read(g8, j);
                    if (fs.i()) {
                        throw fs.k(null);
                    }
                    return read;
                } catch (IOException e) {
                    if (fs.i()) {
                        throw fs.k(e);
                    }
                    throw e;
                } finally {
                    fs.i();
                }
            default:
                AbstractC0048Bt.n(g8, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
                }
                try {
                    ((NV) this.j).f();
                    C1694pQ L = g8.L(1);
                    int read2 = ((InputStream) this.i).read(L.a, L.c, (int) Math.min(j, 8192 - L.c));
                    if (read2 == -1) {
                        if (L.b == L.c) {
                            g8.h = L.a();
                            AbstractC1825rQ.a(L);
                        }
                        return -1L;
                    }
                    L.c += read2;
                    long j2 = read2;
                    g8.i += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (AbstractC0946e20.z(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // o.HS
    public final NV timeout() {
        switch (this.h) {
            case 0:
                return (FS) this.i;
            default:
                return (NV) this.j;
        }
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return "AsyncTimeout.source(" + ((W6) this.j) + ')';
            default:
                return "source(" + ((InputStream) this.i) + ')';
        }
    }
}
