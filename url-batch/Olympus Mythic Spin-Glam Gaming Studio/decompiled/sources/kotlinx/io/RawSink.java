package kotlinx.io;

import java.io.Flushable;

/* compiled from: RawSink.kt */
/* loaded from: classes5.dex */
public interface RawSink extends AutoCloseable, Flushable {
    void write(Buffer buffer, long j);
}
