package io.ktor.utils.io;

import kotlin.coroutines.Continuation;
import kotlinx.io.Sink;

/* compiled from: ByteWriteChannel.kt */
/* loaded from: classes12.dex */
public interface ByteWriteChannel {
    void cancel(Throwable th);

    Object flush(Continuation continuation);

    Object flushAndClose(Continuation continuation);

    Throwable getClosedCause();

    Sink getWriteBuffer();
}
