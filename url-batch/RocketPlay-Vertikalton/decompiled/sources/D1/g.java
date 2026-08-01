package D1;

/* loaded from: classes.dex */
public final class g extends b {
    public boolean d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f269b) {
            return;
        }
        if (!this.d) {
            a();
        }
        this.f269b = true;
    }

    @Override // D1.b, K1.v
    public final long z(K1.f fVar, long j2) {
        i1.f.e(fVar, "sink");
        if (this.f269b) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        long z2 = super.z(fVar, 8192L);
        if (z2 != -1) {
            return z2;
        }
        this.d = true;
        a();
        return -1L;
    }
}
