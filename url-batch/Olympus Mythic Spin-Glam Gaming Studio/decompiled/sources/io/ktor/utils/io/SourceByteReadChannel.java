package io.ktor.utils.io;

import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;
import org.jetbrains.annotations.Nullable;

/* compiled from: SourceByteReadChannel.kt */
/* loaded from: classes5.dex */
public final class SourceByteReadChannel implements ByteReadChannel {

    @Nullable
    private volatile CloseToken closed;
    private final Source source;

    public SourceByteReadChannel(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = this.closed;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.source.exhausted();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Source getReadBuffer() {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return this.source.getBuffer();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object awaitContent(int i, Continuation continuation) {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return Boxing.boxBoolean(this.source.request(i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable th) {
        String str;
        if (this.closed != null) {
            return;
        }
        this.source.close();
        if (th == null || (str = th.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        this.closed = new CloseToken(new IOException(str, th));
    }
}
