package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4086b;

    /* renamed from: c, reason: collision with root package name */
    public int f4087c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f4085a = pVar;
        this.f4086b = inflater;
    }

    @Override // v1.v
    public final x a() {
        return this.f4085a.f4093a.a();
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        long j3;
        X0.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f4085a;
            Inflater inflater = this.f4086b;
            try {
                q o2 = fVar.o(1);
                int min = (int) Math.min(8192L, 8192 - o2.f4098c);
                if (inflater.needsInput() && !pVar.e()) {
                    q qVar = pVar.f4094b.f4075a;
                    X0.d.b(qVar);
                    int i = qVar.f4098c;
                    int i2 = qVar.f4097b;
                    int i3 = i - i2;
                    this.f4087c = i3;
                    inflater.setInput(qVar.f4096a, i2, i3);
                }
                int inflate = inflater.inflate(o2.f4096a, o2.f4098c, min);
                int i4 = this.f4087c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4087c -= remaining;
                    pVar.p(remaining);
                }
                if (inflate > 0) {
                    o2.f4098c += inflate;
                    j3 = inflate;
                    fVar.f4076b += j3;
                } else {
                    if (o2.f4097b == o2.f4098c) {
                        fVar.f4075a = o2.a();
                        r.a(o2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.e()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f4086b.end();
        this.d = true;
        this.f4085a.close();
    }
}
