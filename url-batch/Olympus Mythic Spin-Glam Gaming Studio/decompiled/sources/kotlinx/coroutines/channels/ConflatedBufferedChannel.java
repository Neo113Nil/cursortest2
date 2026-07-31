package kotlinx.coroutines.channels;

import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: classes14.dex */
public class ConflatedBufferedChannel extends BufferedChannel {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(Object obj, Continuation continuation) {
        return send$suspendImpl(this, obj, continuation);
    }

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1 function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    static /* synthetic */ Object send$suspendImpl(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object m8233trySendImplMj0NB7M = conflatedBufferedChannel.m8233trySendImplMj0NB7M(obj, true);
        if (m8233trySendImplMj0NB7M instanceof ChannelResult.Closed) {
            ChannelResult.m8222exceptionOrNullimpl(m8233trySendImplMj0NB7M);
            Function1 function1 = conflatedBufferedChannel.onUndeliveredElement;
            if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
                ExceptionsKt.addSuppressed(callUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
                throw callUndeliveredElementCatchingException$default;
            }
            throw conflatedBufferedChannel.getSendException();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo8216trySendJP2dKIU(Object obj) {
        return m8233trySendImplMj0NB7M(obj, false);
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m8233trySendImplMj0NB7M(Object obj, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m8232trySendDropLatestMj0NB7M(obj, z) : m8217trySendDropOldestJP2dKIU(obj);
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m8232trySendDropLatestMj0NB7M(Object obj, boolean z) {
        Function1 function1;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo8216trySendJP2dKIU = super.mo8216trySendJP2dKIU(obj);
        if (ChannelResult.m8226isSuccessimpl(mo8216trySendJP2dKIU) || ChannelResult.m8225isClosedimpl(mo8216trySendJP2dKIU)) {
            return mo8216trySendJP2dKIU;
        }
        if (z && (function1 = this.onUndeliveredElement) != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
            throw callUndeliveredElementCatchingException$default;
        }
        return ChannelResult.Companion.m8231successJP2dKIU(Unit.INSTANCE);
    }
}
