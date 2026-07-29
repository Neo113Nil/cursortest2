package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2047uo implements YR {
    private final YR delegate;

    public AbstractC2047uo(YR yr) {
        AbstractC0048Bt.n(yr, "delegate");
        this.delegate = yr;
    }

    @InterfaceC1315jh
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final YR m9deprecated_delegate() {
        return this.delegate;
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final YR delegate() {
        return this.delegate;
    }

    @Override // o.YR, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // o.YR
    public NV timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // o.YR
    public void write(G8 g8, long j) {
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        this.delegate.write(g8, j);
    }
}
