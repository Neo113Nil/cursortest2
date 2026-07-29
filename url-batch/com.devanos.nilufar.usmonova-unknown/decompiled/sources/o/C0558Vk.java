package o;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: o.Vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558Vk extends AbstractC2113vo {
    public final long h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final /* synthetic */ C0584Wk m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558Vk(C0584Wk c0584Wk, HS hs, long j) {
        super(hs);
        AbstractC0048Bt.n(hs, "delegate");
        this.m = c0584Wk;
        this.h = j;
        this.j = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.k) {
            return iOException;
        }
        this.k = true;
        if (iOException == null && this.j) {
            this.j = false;
        }
        return this.m.a(true, false, iOException);
    }

    @Override // o.AbstractC2113vo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.l) {
            return;
        }
        this.l = true;
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // o.AbstractC2113vo, o.HS
    public final long read(G8 g8, long j) {
        AbstractC0048Bt.n(g8, "sink");
        if (this.l) {
            throw new IllegalStateException("closed");
        }
        try {
            long read = delegate().read(g8, j);
            if (this.j) {
                this.j = false;
            }
            if (read == -1) {
                b(null);
                return -1L;
            }
            long j2 = this.i + read;
            long j3 = this.h;
            if (j3 == -1 || j2 <= j3) {
                this.i = j2;
                if (j2 == j3) {
                    b(null);
                }
                return read;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw b(e);
        }
    }
}
