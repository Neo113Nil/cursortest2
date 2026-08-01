package p1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements v1.v {

    /* renamed from: a, reason: collision with root package name */
    public final v1.p f3475a;

    /* renamed from: b, reason: collision with root package name */
    public int f3476b;

    /* renamed from: c, reason: collision with root package name */
    public int f3477c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3478e;

    /* renamed from: f, reason: collision with root package name */
    public int f3479f;

    public r(v1.p pVar) {
        X0.d.e(pVar, "source");
        this.f3475a = pVar;
    }

    @Override // v1.v
    public final v1.x a() {
        return this.f3475a.f4093a.a();
    }

    @Override // v1.v
    public final long b(v1.f fVar, long j2) {
        int i;
        int j3;
        X0.d.e(fVar, "sink");
        do {
            int i2 = this.f3478e;
            v1.p pVar = this.f3475a;
            if (i2 != 0) {
                long b2 = pVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f3478e -= (int) b2;
                return b2;
            }
            pVar.p(this.f3479f);
            this.f3479f = 0;
            if ((this.f3477c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int q2 = j1.b.q(pVar);
            this.f3478e = q2;
            this.f3476b = q2;
            int g2 = pVar.g() & 255;
            this.f3477c = pVar.g() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                v1.i iVar = f.f3425a;
                logger.fine(f.a(true, this.d, this.f3476b, g2, this.f3477c));
            }
            j3 = pVar.j() & Integer.MAX_VALUE;
            this.d = j3;
            if (g2 != 9) {
                throw new IOException(g2 + " != TYPE_CONTINUATION");
            }
        } while (j3 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
