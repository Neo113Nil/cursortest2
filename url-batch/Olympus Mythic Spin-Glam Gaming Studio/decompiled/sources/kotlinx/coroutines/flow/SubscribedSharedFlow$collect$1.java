package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {412}, m = "collect")
/* loaded from: classes6.dex */
final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscribedSharedFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribedSharedFlow$collect$1(SubscribedSharedFlow subscribedSharedFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = subscribedSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
