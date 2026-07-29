package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: o.Uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532Uk extends AbstractC2047uo {
    public final long h;
    public boolean i;
    public long j;
    public boolean k;
    public final /* synthetic */ C0584Wk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532Uk(C0584Wk c0584Wk, YR yr, long j) {
        super(yr);
        AbstractC0048Bt.n(yr, "delegate");
        this.l = c0584Wk;
        this.h = j;
    }

    public final IOException b(IOException iOException) {
        if (this.i) {
            return iOException;
        }
        this.i = true;
        return this.l.a(false, true, iOException);
    }

    @Override // o.AbstractC2047uo, o.YR, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        long j = this.h;
        if (j != -1 && this.j != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // o.AbstractC2047uo, o.YR, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // o.AbstractC2047uo, o.YR
    public final void write(G8 g8, long j) {
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        if (this.k) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.h;
        if (j2 == -1 || this.j + j <= j2) {
            try {
                super.write(g8, j);
                this.j += j;
                return;
            } catch (IOException e) {
                throw b(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.j + j));
    }
}
