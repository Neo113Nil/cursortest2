package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public interface f20 extends Closeable, Flushable {
    e50 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(long j, m8 m8Var);

    @Override // java.io.Flushable
    void flush();
}
