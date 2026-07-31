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
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes12.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m8213receiveCatchingOnNoWaiterSuspendGKJJFZk;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m8213receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m8213receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return m8213receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m8213receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m8219boximpl(m8213receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
