package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: Share.kt */
/* loaded from: classes6.dex */
final class SubscribedSharedFlow implements SharedFlow {
    private final Function2 action;
    private final SharedFlow sharedFlow;

    public SubscribedSharedFlow(SharedFlow sharedFlow, Function2 function2) {
        this.sharedFlow = sharedFlow;
        this.action = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        int i;
        if (continuation instanceof SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1) continuation;
            int i2 = subscribedSharedFlow$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribedSharedFlow$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = subscribedSharedFlow$collect$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscribedSharedFlow$collect$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlow = this.sharedFlow;
                    SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(flowCollector, this.action);
                    subscribedSharedFlow$collect$1.label = 1;
                    if (sharedFlow.collect(subscribedFlowCollector, subscribedSharedFlow$collect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, continuation);
        Object obj2 = subscribedSharedFlow$collect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscribedSharedFlow$collect$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
