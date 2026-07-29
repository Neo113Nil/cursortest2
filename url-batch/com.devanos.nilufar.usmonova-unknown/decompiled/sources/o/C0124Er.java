package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Er, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124Er extends AbstractC0046Br {
    public long k;
    public final /* synthetic */ C0202Hr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124Er(C0202Hr c0202Hr, long j) {
        super(c0202Hr);
        this.l = c0202Hr;
        this.k = j;
        if (j == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.i) {
            return;
        }
        if (this.k != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = HY.a;
            AbstractC0048Bt.n(timeUnit, "timeUnit");
            try {
                z = HY.s(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                ((PL) this.l.d).k();
                b();
            }
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
        long j2 = this.k;
        if (j2 == 0) {
            return -1L;
        }
        long read = super.read(g8, Math.min(j2, j));
        if (read == -1) {
            ((PL) this.l.d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j3 = this.k - read;
        this.k = j3;
        if (j3 == 0) {
            b();
        }
        return read;
    }
}
