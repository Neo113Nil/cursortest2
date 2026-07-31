package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes12.dex */
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatching$1(BufferedChannel bufferedChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m8212receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m8212receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return m8212receiveCatchingJP2dKIU$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m8212receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m8219boximpl(m8212receiveCatchingJP2dKIU$suspendImpl);
    }
}
