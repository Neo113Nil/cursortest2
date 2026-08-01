package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class im implements p20 {
    public byte f;
    public final px g;
    public final Inflater h;
    public final eo i;
    public final CRC32 j;

    public im(p20 p20Var) {
        p20Var.getClass();
        px pxVar = new px(p20Var);
        this.g = pxVar;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new eo(pxVar, inflater);
        this.j = new CRC32();
    }

    public static void m(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.g.f.a();
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        long j2;
        im imVar = this;
        byte b = imVar.f;
        CRC32 crc32 = imVar.j;
        px pxVar = imVar.g;
        if (b == 0) {
            pxVar.h(10L);
            m8 m8Var2 = pxVar.g;
            byte o = m8Var2.o(3L);
            boolean z = ((o >> 1) & 1) == 1;
            if (z) {
                imVar.n(m8Var2, 0L, 10L);
            }
            m("ID1ID2", 8075, pxVar.readShort());
            pxVar.skip(8L);
            if (((o >> 2) & 1) == 1) {
                pxVar.h(2L);
                if (z) {
                    n(m8Var2, 0L, 2L);
                }
                short readShort = m8Var2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                pxVar.h(j3);
                if (z) {
                    n(m8Var2, 0L, j3);
                }
                pxVar.skip(j3);
            }
            if (((o >> 3) & 1) == 1) {
                long n = pxVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    n(m8Var2, 0L, n + 1);
                } else {
                    j2 = 2;
                }
                pxVar.skip(n + 1);
            } else {
                j2 = 2;
            }
            if (((o >> 4) & 1) == 1) {
                long j4 = j2;
                long n2 = pxVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    imVar = this;
                    imVar.n(m8Var2, 0L, n2 + 1);
                } else {
                    imVar = this;
                    j2 = j4;
                }
                pxVar.skip(n2 + 1);
            } else {
                imVar = this;
            }
            if (z) {
                pxVar.h(j2);
                short readShort2 = m8Var2.readShort();
                m("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            imVar.f = (byte) 1;
        }
        if (imVar.f == 1) {
            long j5 = m8Var.g;
            long b2 = imVar.i.b(8192L, m8Var);
            if (b2 != -1) {
                imVar.n(m8Var, j5, b2);
                return b2;
            }
            imVar.f = (byte) 2;
        }
        if (imVar.f == 2) {
            m("CRC", pxVar.o(), (int) crc32.getValue());
            m("ISIZE", pxVar.o(), (int) imVar.h.getBytesWritten());
            imVar.f = (byte) 3;
            if (!pxVar.m()) {
                l8.y("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    public final void n(m8 m8Var, long j, long j2) {
        e10 e10Var = m8Var.f;
        e10Var.getClass();
        while (true) {
            int i = e10Var.c;
            int i2 = e10Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            e10Var = e10Var.f;
            e10Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(e10Var.c - r6, j2);
            this.j.update(e10Var.a, (int) (e10Var.b + j), min);
            j2 -= min;
            e10Var = e10Var.f;
            e10Var.getClass();
            j = 0;
        }
    }
}
