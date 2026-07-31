package io.ktor.http.cio;

import io.ktor.http.content.MultiPartData;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;

/* compiled from: CIOMultipartDataBase.kt */
/* loaded from: classes6.dex */
public final class CIOMultipartDataBase implements MultiPartData, CoroutineScope {
    private final CoroutineContext coroutineContext;
    private final ReceiveChannel events;

    public CIOMultipartDataBase(CoroutineContext coroutineContext, ByteReadChannel channel, CharSequence contentType, Long l, long j) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.coroutineContext = coroutineContext;
        this.events = MultipartKt.parseMultipart(this, channel, contentType, l, j);
    }

    public /* synthetic */ CIOMultipartDataBase(CoroutineContext coroutineContext, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, byteReadChannel, charSequence, l, (i & 16) != 0 ? 65536L : j);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
