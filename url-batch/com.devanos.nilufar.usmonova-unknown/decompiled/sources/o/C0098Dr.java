package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098Dr extends AbstractC0046Br {
    public final C0932ds k;
    public long l;
    public boolean m;
    public final /* synthetic */ C0202Hr n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098Dr(C0202Hr c0202Hr, C0932ds c0932ds) {
        super(c0202Hr);
        AbstractC0048Bt.n(c0932ds, "url");
        this.n = c0202Hr;
        this.k = c0932ds;
        this.l = -1L;
        this.m = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.i) {
            return;
        }
        if (this.m) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = HY.a;
            AbstractC0048Bt.n(timeUnit, "timeUnit");
            try {
                z = HY.s(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                ((PL) this.n.d).k();
                b();
            }
        }
        this.i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r11.m == false) goto L30;
     */
    @Override // o.AbstractC0046Br, o.HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(G8 g8, long j) {
        C0202Hr c0202Hr = this.n;
        N8 n8 = (N8) c0202Hr.e;
        AbstractC0048Bt.n(g8, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        if (this.i) {
            throw new IllegalStateException("closed");
        }
        if (this.m) {
            long j2 = this.l;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    n8.n();
                }
                try {
                    this.l = n8.G();
                    String obj = UT.T(n8.n()).toString();
                    if (this.l < 0 || (obj.length() > 0 && !AbstractC0778bU.B(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.l + obj + '\"');
                    }
                    if (this.l == 0) {
                        this.m = false;
                        c0202Hr.h = ((C1918sr) c0202Hr.g).a();
                        EF ef = (EF) c0202Hr.c;
                        AbstractC0048Bt.k(ef);
                        HO ho = ef.q;
                        C1852rr c1852rr = (C1852rr) c0202Hr.h;
                        AbstractC0048Bt.k(c1852rr);
                        AbstractC0736as.b(ho, this.k, c1852rr);
                        b();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long read = super.read(g8, Math.min(j, this.l));
            if (read != -1) {
                this.l -= read;
                return read;
            }
            ((PL) c0202Hr.d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        return -1L;
    }
}
