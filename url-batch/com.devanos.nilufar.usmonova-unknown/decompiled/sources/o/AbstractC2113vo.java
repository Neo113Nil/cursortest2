package o;

/* renamed from: o.vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2113vo implements HS {
    private final HS delegate;

    public AbstractC2113vo(HS hs) {
        AbstractC0048Bt.n(hs, "delegate");
        this.delegate = hs;
    }

    @InterfaceC1315jh
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final HS m10deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final HS delegate() {
        return this.delegate;
    }

    @Override // o.HS
    public long read(G8 g8, long j) {
        AbstractC0048Bt.n(g8, "sink");
        return this.delegate.read(g8, j);
    }

    @Override // o.HS
    public NV timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
