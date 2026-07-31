package io.ktor.utils.io;

import io.ktor.utils.io.core.BytePacketBuilderKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: ByteWriteChannel.kt */
/* loaded from: classes4.dex */
public abstract class ByteWriteChannelKt {
    public static final Object flushIfNeeded(ByteWriteChannel byteWriteChannel, Continuation continuation) {
        ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(byteWriteChannel);
        ByteChannel byteChannel = byteWriteChannel instanceof ByteChannel ? (ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer()) < 1048576) {
            return Unit.INSTANCE;
        }
        Object flush = byteWriteChannel.flush(continuation);
        return flush == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : Unit.INSTANCE;
    }
}
