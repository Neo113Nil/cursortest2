package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: o.Hs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203Hs implements HS {
    public final JL h;
    public final Inflater i;
    public int j;
    public boolean k;

    public C0203Hs(JL jl, Inflater inflater) {
        this.h = jl;
        this.i = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.i.end();
        this.k = true;
        this.h.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // o.HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(G8 g8, long j) {
        long j2;
        AbstractC0048Bt.n(g8, "sink");
        while (j >= 0) {
            if (this.k) {
                throw new IllegalStateException("closed");
            }
            JL jl = this.h;
            Inflater inflater = this.i;
            if (j != 0) {
                try {
                    C1694pQ L = g8.L(1);
                    int min = (int) Math.min(j, 8192 - L.c);
                    if (inflater.needsInput() && !jl.b()) {
                        C1694pQ c1694pQ = jl.i.h;
                        AbstractC0048Bt.k(c1694pQ);
                        int i = c1694pQ.c;
                        int i2 = c1694pQ.b;
                        int i3 = i - i2;
                        this.j = i3;
                        inflater.setInput(c1694pQ.a, i2, i3);
                    }
                    int inflate = inflater.inflate(L.a, L.c, min);
                    int i4 = this.j;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.j -= remaining;
                        jl.skip(remaining);
                    }
                    if (inflate > 0) {
                        L.c += inflate;
                        j2 = inflate;
                        g8.i += j2;
                        if (j2 <= 0) {
                            return j2;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (jl.b()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (L.b == L.c) {
                        g8.h = L.a();
                        AbstractC1825rQ.a(L);
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            j2 = 0;
            if (j2 <= 0) {
            }
        }
        throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
    }

    @Override // o.HS
    public final NV timeout() {
        return this.h.h.timeout();
    }
}
