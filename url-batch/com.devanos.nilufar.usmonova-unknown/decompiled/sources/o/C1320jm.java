package o;

import java.io.IOException;

/* renamed from: o.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320jm extends AbstractC2113vo {
    public final long h;
    public final boolean i;
    public long j;

    public C1320jm(HS hs, long j, boolean z) {
        super(hs);
        this.h = j;
        this.i = z;
    }

    @Override // o.AbstractC2113vo, o.HS
    public final long read(G8 g8, long j) {
        AbstractC0048Bt.n(g8, "sink");
        long j2 = this.j;
        long j3 = this.h;
        if (j2 > j3) {
            j = 0;
        } else if (this.i) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(g8, j);
        if (read != -1) {
            this.j += read;
        }
        long j5 = this.j;
        if ((j5 >= j3 || read != -1) && j5 <= j3) {
            return read;
        }
        if (read > 0 && j5 > j3) {
            long j6 = g8.i - (j5 - j3);
            G8 g82 = new G8();
            g82.E(g8);
            g8.write(g82, j6);
            g82.b();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.j);
    }
}
