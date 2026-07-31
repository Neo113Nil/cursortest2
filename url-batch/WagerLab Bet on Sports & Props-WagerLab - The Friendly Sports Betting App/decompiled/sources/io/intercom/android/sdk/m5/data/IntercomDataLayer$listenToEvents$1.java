package io.intercom.android.sdk.m5.data;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: IntercomDataLayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1", f = "IntercomDataLayer.kt", i = {}, l = {439}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class IntercomDataLayer$listenToEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<IntercomEvent, Unit> $onNewEvent;
    int label;
    final /* synthetic */ IntercomDataLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IntercomDataLayer$listenToEvents$1(IntercomDataLayer intercomDataLayer, Function1<? super IntercomEvent, Unit> function1, Continuation<? super IntercomDataLayer$listenToEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = intercomDataLayer;
        this.$onNewEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IntercomDataLayer$listenToEvents$1(this.this$0, this.$onNewEvent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IntercomDataLayer$listenToEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<IntercomEvent> event = this.this$0.getEvent();
            final Function1<IntercomEvent, Unit> function1 = this.$onNewEvent;
            this.label = 1;
            if (event.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1.1
                public final Object emit(IntercomEvent intercomEvent, Continuation<? super Unit> continuation) {
                    function1.invoke(intercomEvent);
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((IntercomEvent) obj2, (Continuation<? super Unit>) continuation);
                }
            }, this) == coroutine_suspended) {
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
