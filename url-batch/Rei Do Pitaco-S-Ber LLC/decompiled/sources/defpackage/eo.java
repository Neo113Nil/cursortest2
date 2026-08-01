package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class eo implements p20 {
    public final px f;
    public final Inflater g;
    public int h;
    public boolean i;

    public eo(px pxVar, Inflater inflater) {
        this.f = pxVar;
        this.g = inflater;
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.f.f.a();
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        long j2;
        Inflater inflater = this.g;
        while (!this.i) {
            try {
                e10 t = m8Var.t(1);
                int min = (int) Math.min(8192L, 8192 - t.c);
                boolean needsInput = inflater.needsInput();
                px pxVar = this.f;
                if (needsInput && !pxVar.m()) {
                    e10 e10Var = pxVar.g.f;
                    e10Var.getClass();
                    int i = e10Var.c;
                    int i2 = e10Var.b;
                    int i3 = i - i2;
                    this.h = i3;
                    inflater.setInput(e10Var.a, i2, i3);
                }
                int inflate = inflater.inflate(t.a, t.c, min);
                int i4 = this.h;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.h -= remaining;
                    pxVar.skip(remaining);
                }
                if (inflate > 0) {
                    t.c += inflate;
                    j2 = inflate;
                    m8Var.g += j2;
                } else {
                    if (t.b == t.c) {
                        m8Var.f = t.a();
                        f10.a(t);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pxVar.m()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        l8.u("closed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.g.end();
        this.i = true;
        this.f.close();
    }
}
