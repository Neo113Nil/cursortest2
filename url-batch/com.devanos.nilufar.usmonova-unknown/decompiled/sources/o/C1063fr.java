package o;

import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: o.fr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063fr implements HS {
    public byte h;
    public final JL i;
    public final Inflater j;
    public final C0203Hs k;
    public final CRC32 l;

    public C1063fr(HS hs) {
        AbstractC0048Bt.n(hs, Constants.ScionAnalytics.PARAM_SOURCE);
        JL jl = new JL(hs);
        this.i = jl;
        Inflater inflater = new Inflater(true);
        this.j = inflater;
        this.k = new C0203Hs(jl, inflater);
        this.l = new CRC32();
    }

    public static void b(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void c(G8 g8, long j, long j2) {
        C1694pQ c1694pQ = g8.h;
        AbstractC0048Bt.k(c1694pQ);
        while (true) {
            int i = c1694pQ.c;
            int i2 = c1694pQ.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
        }
        while (j2 > 0) {
            int min = (int) Math.min(c1694pQ.c - r6, j2);
            this.l.update(c1694pQ.a, (int) (c1694pQ.b + j), min);
            j2 -= min;
            c1694pQ = c1694pQ.f;
            AbstractC0048Bt.k(c1694pQ);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.k.close();
    }

    @Override // o.HS
    public final long read(G8 g8, long j) {
        C1063fr c1063fr = this;
        AbstractC0048Bt.n(g8, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.i("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c1063fr.h;
        CRC32 crc32 = c1063fr.l;
        JL jl = c1063fr.i;
        if (b == 0) {
            jl.y(10L);
            G8 g82 = jl.i;
            byte q = g82.q(3L);
            boolean z = ((q >> 1) & 1) == 1;
            if (z) {
                c1063fr.c(g82, 0L, 10L);
            }
            b("ID1ID2", 8075, jl.readShort());
            jl.skip(8L);
            if (((q >> 2) & 1) == 1) {
                jl.y(2L);
                if (z) {
                    c(g82, 0L, 2L);
                }
                long C = g82.C() & 65535;
                jl.y(C);
                if (z) {
                    c(g82, 0L, C);
                }
                jl.skip(C);
            }
            if (((q >> 3) & 1) == 1) {
                long c = jl.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c(g82, 0L, c + 1);
                }
                jl.skip(c + 1);
            }
            if (((q >> 4) & 1) == 1) {
                long c2 = jl.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c1063fr = this;
                    c1063fr.c(g82, 0L, c2 + 1);
                } else {
                    c1063fr = this;
                }
                jl.skip(c2 + 1);
            } else {
                c1063fr = this;
            }
            if (z) {
                b("FHCRC", jl.m(), (short) crc32.getValue());
                crc32.reset();
            }
            c1063fr.h = (byte) 1;
        }
        if (c1063fr.h == 1) {
            long j2 = g8.i;
            long read = c1063fr.k.read(g8, j);
            if (read != -1) {
                c1063fr.c(g8, j2, read);
                return read;
            }
            c1063fr.h = (byte) 2;
        }
        if (c1063fr.h == 2) {
            b("CRC", jl.j(), (int) crc32.getValue());
            b("ISIZE", jl.j(), (int) c1063fr.j.getBytesWritten());
            c1063fr.h = (byte) 3;
            if (!jl.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // o.HS
    public final NV timeout() {
        return this.i.h.timeout();
    }
}
