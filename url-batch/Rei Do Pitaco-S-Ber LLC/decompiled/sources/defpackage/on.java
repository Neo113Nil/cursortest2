package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class on implements p20 {
    public final o8 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public on(o8 o8Var) {
        o8Var.getClass();
        this.f = o8Var;
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.f.a();
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        int i;
        int readInt;
        do {
            int i2 = this.j;
            o8 o8Var = this.f;
            if (i2 == 0) {
                o8Var.skip(this.k);
                this.k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int q = z60.q(o8Var);
                    this.j = q;
                    this.g = q;
                    int readByte = o8Var.readByte() & 255;
                    this.h = o8Var.readByte() & 255;
                    Logger logger = pn.i;
                    if (logger.isLoggable(Level.FINE)) {
                        r8 r8Var = cn.a;
                        logger.fine(cn.a(true, this.i, this.g, readByte, this.h));
                    }
                    readInt = o8Var.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long b = o8Var.b(Math.min(8192L, i2), m8Var);
                if (b != -1) {
                    this.j -= (int) b;
                    return b;
                }
            }
            return -1L;
        } while (readInt == i);
        l8.y("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
