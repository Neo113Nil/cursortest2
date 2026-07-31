package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* compiled from: Builders.kt */
/* loaded from: classes12.dex */
final class CallbackFlowBuilder extends ChannelFlowBuilder {
    private final Function2 block;

    public /* synthetic */ CallbackFlowBuilder(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public CallbackFlowBuilder(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i, bufferOverflow);
        this.block = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object collectTo(ProducerScope producerScope, Continuation continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        int i;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i2 = callbackFlowBuilder$collectTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callbackFlowBuilder$collectTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = callbackFlowBuilder$collectTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    callbackFlowBuilder$collectTo$1.L$0 = producerScope;
                    callbackFlowBuilder$collectTo$1.label = 1;
                    if (super.collectTo(producerScope, callbackFlowBuilder$collectTo$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    producerScope = (ProducerScope) callbackFlowBuilder$collectTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (producerScope.isClosedForSend()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.INSTANCE;
            }
        }
        callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, continuation);
        Object obj2 = callbackFlowBuilder$collectTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = callbackFlowBuilder$collectTo$1.label;
        if (i != 0) {
        }
        if (producerScope.isClosedForSend()) {
        }
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.block, coroutineContext, i, bufferOverflow);
    }
}
