package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.Tr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513Tr implements HS {
    public final N8 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public C0513Tr(N8 n8) {
        AbstractC0048Bt.n(n8, Constants.ScionAnalytics.PARAM_SOURCE);
        this.h = n8;
    }

    @Override // o.HS
    public final long read(G8 g8, long j) {
        int i;
        int readInt;
        AbstractC0048Bt.n(g8, "sink");
        do {
            int i2 = this.l;
            N8 n8 = this.h;
            if (i2 == 0) {
                n8.skip(this.m);
                this.m = 0;
                if ((this.j & 4) == 0) {
                    i = this.k;
                    int r = HY.r(n8);
                    this.l = r;
                    this.i = r;
                    int readByte = n8.readByte() & 255;
                    this.j = n8.readByte() & 255;
                    Logger logger = C0539Ur.k;
                    if (logger.isLoggable(Level.FINE)) {
                        C1347k9 c1347k9 = AbstractC0228Ir.a;
                        logger.fine(AbstractC0228Ir.a(true, this.k, this.i, readByte, this.j));
                    }
                    readInt = n8.readInt() & Integer.MAX_VALUE;
                    this.k = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long read = n8.read(g8, Math.min(j, i2));
                if (read != -1) {
                    this.l -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // o.HS
    public final NV timeout() {
        return this.h.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
