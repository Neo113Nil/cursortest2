package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* compiled from: Share.kt */
/* loaded from: classes15.dex */
public final class SubscribedFlowCollector implements FlowCollector {
    private final Function2 action;
    private final FlowCollector collector;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        return this.collector.emit(obj, continuation);
    }

    public SubscribedFlowCollector(FlowCollector flowCollector, Function2 function2) {
        this.collector = flowCollector;
        this.action = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onSubscription(Continuation continuation) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        ?? r2;
        SafeCollector safeCollector;
        SubscribedFlowCollector subscribedFlowCollector;
        try {
            if (continuation instanceof SubscribedFlowCollector$onSubscription$1) {
                subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuation;
                int i = subscribedFlowCollector$onSubscription$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    subscribedFlowCollector$onSubscription$1.label = i - Integer.MIN_VALUE;
                    Object obj = subscribedFlowCollector$onSubscription$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = subscribedFlowCollector$onSubscription$1.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        safeCollector = new SafeCollector(this.collector, subscribedFlowCollector$onSubscription$1.getContext());
                        Function2 function2 = this.action;
                        subscribedFlowCollector$onSubscription$1.L$0 = this;
                        subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
                        subscribedFlowCollector$onSubscription$1.label = 1;
                        if (function2.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        subscribedFlowCollector = this;
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
                        subscribedFlowCollector = (SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    safeCollector.releaseIntercepted();
                    FlowCollector flowCollector = subscribedFlowCollector.collector;
                    r2 = flowCollector instanceof SubscribedFlowCollector;
                    if (r2 != 0) {
                        return Unit.INSTANCE;
                    }
                    subscribedFlowCollector$onSubscription$1.L$0 = null;
                    subscribedFlowCollector$onSubscription$1.L$1 = null;
                    subscribedFlowCollector$onSubscription$1.label = 2;
                    if (((SubscribedFlowCollector) flowCollector).onSubscription(subscribedFlowCollector$onSubscription$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            safeCollector.releaseIntercepted();
            FlowCollector flowCollector2 = subscribedFlowCollector.collector;
            r2 = flowCollector2 instanceof SubscribedFlowCollector;
            if (r2 != 0) {
            }
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
        subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuation);
        Object obj2 = subscribedFlowCollector$onSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = subscribedFlowCollector$onSubscription$1.label;
    }
}
