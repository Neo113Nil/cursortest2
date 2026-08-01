package K1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f751a;

    /* renamed from: b, reason: collision with root package name */
    public final p f752b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f753c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f754e;

    public k(v vVar) {
        i1.f.e(vVar, "source");
        p pVar = new p(vVar);
        this.f752b = pVar;
        Inflater inflater = new Inflater(true);
        this.f753c = inflater;
        this.d = new l(pVar, inflater);
        this.f754e = new CRC32();
    }

    public static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // K1.v
    public final x b() {
        return this.f752b.f764a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void f(f fVar, long j2, long j3) {
        q qVar = fVar.f745a;
        i1.f.b(qVar);
        while (true) {
            int i = qVar.f769c;
            int i2 = qVar.f768b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            qVar = qVar.f771f;
            i1.f.b(qVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(qVar.f769c - r6, j3);
            this.f754e.update(qVar.f767a, (int) (qVar.f768b + j2), min);
            j3 -= min;
            qVar = qVar.f771f;
            i1.f.b(qVar);
            j2 = 0;
        }
    }

    @Override // K1.v
    public final long z(f fVar, long j2) {
        p pVar;
        f fVar2;
        long j3;
        i1.f.e(fVar, "sink");
        byte b2 = this.f751a;
        CRC32 crc32 = this.f754e;
        p pVar2 = this.f752b;
        if (b2 == 0) {
            pVar2.I(10L);
            f fVar3 = pVar2.f765b;
            byte f2 = fVar3.f(3L);
            boolean z2 = ((f2 >> 1) & 1) == 1;
            if (z2) {
                f(fVar3, 0L, 10L);
            }
            a("ID1ID2", 8075, pVar2.F());
            pVar2.J(8L);
            if (((f2 >> 2) & 1) == 1) {
                pVar2.I(2L);
                if (z2) {
                    f(fVar3, 0L, 2L);
                }
                short E2 = fVar3.E();
                long j4 = ((short) (((E2 & 255) << 8) | ((E2 & 65280) >>> 8))) & 65535;
                pVar2.I(j4);
                if (z2) {
                    f(fVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                pVar2.J(j3);
            }
            if (((f2 >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long f3 = pVar2.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    pVar = pVar2;
                    f(fVar2, 0L, f3 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.J(f3 + 1);
            } else {
                pVar = pVar2;
                fVar2 = fVar3;
            }
            if (((f2 >> 4) & 1) == 1) {
                long f4 = pVar.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    f(fVar2, 0L, f4 + 1);
                }
                pVar.J(f4 + 1);
            }
            if (z2) {
                pVar.I(2L);
                short E3 = fVar2.E();
                a("FHCRC", (short) (((E3 & 255) << 8) | ((E3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f751a = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f751a == 1) {
            long j5 = fVar.f746b;
            long z3 = this.d.z(fVar, 8192L);
            if (z3 != -1) {
                f(fVar, j5, z3);
                return z3;
            }
            this.f751a = (byte) 2;
        }
        if (this.f751a != 2) {
            return -1L;
        }
        a("CRC", pVar.E(), (int) crc32.getValue());
        a("ISIZE", pVar.E(), (int) this.f753c.getBytesWritten());
        this.f751a = (byte) 3;
        if (pVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
