package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements u {

    /* renamed from: a, reason: collision with root package name */
    public final o f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4080b;

    /* renamed from: c, reason: collision with root package name */
    public int f4081c;
    public boolean d;

    public l(o oVar, Inflater inflater) {
        this.f4079a = oVar;
        this.f4080b = inflater;
    }

    @Override // v1.u
    public final w a() {
        return this.f4079a.f4086a.a();
    }

    @Override // v1.u
    public final long b(f fVar, long j2) {
        long j3;
        X0.e.e(fVar, "sink");
        while (!this.d) {
            o oVar = this.f4079a;
            Inflater inflater = this.f4080b;
            try {
                p o2 = fVar.o(1);
                int min = (int) Math.min(8192L, 8192 - o2.f4091c);
                if (inflater.needsInput() && !oVar.e()) {
                    p pVar = oVar.f4087b.f4069a;
                    X0.e.b(pVar);
                    int i = pVar.f4091c;
                    int i2 = pVar.f4090b;
                    int i3 = i - i2;
                    this.f4081c = i3;
                    inflater.setInput(pVar.f4089a, i2, i3);
                }
                int inflate = inflater.inflate(o2.f4089a, o2.f4091c, min);
                int i4 = this.f4081c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4081c -= remaining;
                    oVar.p(remaining);
                }
                if (inflate > 0) {
                    o2.f4091c += inflate;
                    j3 = inflate;
                    fVar.f4070b += j3;
                } else {
                    if (o2.f4090b == o2.f4091c) {
                        fVar.f4069a = o2.a();
                        q.a(o2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (oVar.e()) {
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
        this.f4080b.end();
        this.d = true;
        this.f4079a.close();
    }
}
