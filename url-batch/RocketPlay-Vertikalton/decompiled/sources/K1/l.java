package K1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f755a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f756b;

    /* renamed from: c, reason: collision with root package name */
    public int f757c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f755a = pVar;
        this.f756b = inflater;
    }

    @Override // K1.v
    public final x b() {
        return this.f755a.f764a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f756b.end();
        this.d = true;
        this.f755a.close();
    }

    @Override // K1.v
    public final long z(f fVar, long j2) {
        long j3;
        i1.f.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f755a;
            Inflater inflater = this.f756b;
            try {
                q I2 = fVar.I(1);
                int min = (int) Math.min(8192L, 8192 - I2.f769c);
                if (inflater.needsInput() && !pVar.a()) {
                    q qVar = pVar.f765b.f745a;
                    i1.f.b(qVar);
                    int i = qVar.f769c;
                    int i2 = qVar.f768b;
                    int i3 = i - i2;
                    this.f757c = i3;
                    inflater.setInput(qVar.f767a, i2, i3);
                }
                int inflate = inflater.inflate(I2.f767a, I2.f769c, min);
                int i4 = this.f757c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f757c -= remaining;
                    pVar.J(remaining);
                }
                if (inflate > 0) {
                    I2.f769c += inflate;
                    j3 = inflate;
                    fVar.f746b += j3;
                } else {
                    if (I2.f768b == I2.f769c) {
                        fVar.f745a = I2.a();
                        r.a(I2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        throw new IllegalStateException("closed");
    }
}
