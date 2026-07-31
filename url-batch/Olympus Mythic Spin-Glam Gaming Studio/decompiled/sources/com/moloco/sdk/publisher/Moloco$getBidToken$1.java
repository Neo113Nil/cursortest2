package com.moloco.sdk.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.bidtoken.h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class Moloco$getBidToken$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ MolocoBidTokenListener $listener;
    final /* synthetic */ MediationInfo $mediationInfo;
    final /* synthetic */ MetricsRecorder $metricsRecorder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$getBidToken$1(MetricsRecorder metricsRecorder, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, Continuation continuation) {
        super(2, continuation);
        this.$metricsRecorder = metricsRecorder;
        this.$mediationInfo = mediationInfo;
        this.$listener = molocoBidTokenListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Moloco$getBidToken$1(this.$metricsRecorder, this.$mediationInfo, this.$listener, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h bidTokenHandler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
            bidTokenHandler = Moloco.INSTANCE.getBidTokenHandler();
            MetricsRecorder metricsRecorder = this.$metricsRecorder;
            MediationInfo mediationInfo = this.$mediationInfo;
            MolocoBidTokenListener molocoBidTokenListener = this.$listener;
            this.label = 1;
            if (bidTokenHandler.a(metricsRecorder, mediationInfo, molocoBidTokenListener, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((Moloco$getBidToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
