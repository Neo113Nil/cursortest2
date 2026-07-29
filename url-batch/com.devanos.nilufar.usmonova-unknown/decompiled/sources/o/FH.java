package o;

/* loaded from: classes.dex */
public final class FH implements HS {
    public final N8 h;
    public final G8 i;
    public C1694pQ j;
    public int k;
    public boolean l;
    public long m;

    public FH(N8 n8) {
        this.h = n8;
        G8 a = n8.a();
        this.i = a;
        C1694pQ c1694pQ = a.h;
        this.j = c1694pQ;
        this.k = c1694pQ != null ? c1694pQ.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // o.HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(G8 g8, long j) {
        C1694pQ c1694pQ;
        AbstractC0048Bt.n(g8, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        if (this.l) {
            throw new IllegalStateException("closed");
        }
        C1694pQ c1694pQ2 = this.j;
        G8 g82 = this.i;
        if (c1694pQ2 != null) {
            C1694pQ c1694pQ3 = g82.h;
            if (c1694pQ2 == c1694pQ3) {
                int i = this.k;
                AbstractC0048Bt.k(c1694pQ3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.h.l(this.m + 1)) {
            return -1L;
        }
        if (this.j == null && (c1694pQ = g82.h) != null) {
            this.j = c1694pQ;
            this.k = c1694pQ.b;
        }
        long min = Math.min(j, g82.i - this.m);
        this.i.k(g8, this.m, min);
        this.m += min;
        return min;
    }

    @Override // o.HS
    public final NV timeout() {
        return this.h.timeout();
    }
}
