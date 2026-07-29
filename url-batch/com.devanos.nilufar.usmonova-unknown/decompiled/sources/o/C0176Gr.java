package o;

/* renamed from: o.Gr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176Gr extends AbstractC0046Br {
    public boolean k;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        if (!this.k) {
            b();
        }
        this.i = true;
    }

    @Override // o.AbstractC0046Br, o.HS
    public final long read(G8 g8, long j) {
        AbstractC0048Bt.n(g8, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        if (this.i) {
            throw new IllegalStateException("closed");
        }
        if (this.k) {
            return -1L;
        }
        long read = super.read(g8, j);
        if (read != -1) {
            return read;
        }
        this.k = true;
        b();
        return -1L;
    }
}
