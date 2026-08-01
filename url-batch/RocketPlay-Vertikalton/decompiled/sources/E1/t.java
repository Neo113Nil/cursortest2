package E1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements K1.v {

    /* renamed from: a, reason: collision with root package name */
    public final K1.p f366a;

    /* renamed from: b, reason: collision with root package name */
    public int f367b;

    /* renamed from: c, reason: collision with root package name */
    public int f368c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f369e;

    /* renamed from: f, reason: collision with root package name */
    public int f370f;

    public t(K1.p pVar) {
        i1.f.e(pVar, "source");
        this.f366a = pVar;
    }

    @Override // K1.v
    public final K1.x b() {
        return this.f366a.f764a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // K1.v
    public final long z(K1.f fVar, long j2) {
        int i;
        int D2;
        i1.f.e(fVar, "sink");
        do {
            int i2 = this.f369e;
            K1.p pVar = this.f366a;
            if (i2 != 0) {
                long z2 = pVar.z(fVar, Math.min(8192L, i2));
                if (z2 == -1) {
                    return -1L;
                }
                this.f369e -= (int) z2;
                return z2;
            }
            pVar.J(this.f370f);
            this.f370f = 0;
            if ((this.f368c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = y1.b.r(pVar);
            this.f369e = r2;
            this.f367b = r2;
            int h = pVar.h() & 255;
            this.f368c = pVar.h() & 255;
            Logger logger = u.d;
            if (logger.isLoggable(Level.FINE)) {
                K1.i iVar = g.f311a;
                logger.fine(g.a(this.d, this.f367b, h, true, this.f368c));
            }
            D2 = pVar.D() & Integer.MAX_VALUE;
            this.d = D2;
            if (h != 9) {
                throw new IOException(h + " != TYPE_CONTINUATION");
            }
        } while (D2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
