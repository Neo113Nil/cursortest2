package o;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface YR extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    NV timeout();

    void write(G8 g8, long j);
}
