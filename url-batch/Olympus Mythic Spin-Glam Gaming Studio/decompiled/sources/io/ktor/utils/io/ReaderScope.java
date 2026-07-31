package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ByteReadChannelOperations.kt */
/* loaded from: classes.dex */
public final class ReaderScope implements CoroutineScope {
    private final ByteReadChannel channel;
    private final CoroutineContext coroutineContext;

    public ReaderScope(ByteReadChannel channel, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.channel = channel;
        this.coroutineContext = coroutineContext;
    }

    public final ByteReadChannel getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
