package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$result$1", f = "CommonWebViewBridge.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonWebViewBridge$handleInvocationResult$result$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ ExposedFunction $handler;
    final /* synthetic */ Invocation $invocation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocationResult$result$1(ExposedFunction exposedFunction, Invocation invocation, Continuation continuation) {
        super(2, continuation);
        this.$handler = exposedFunction;
        this.$invocation = invocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommonWebViewBridge$handleInvocationResult$result$1(this.$handler, this.$invocation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CommonWebViewBridge$handleInvocationResult$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ExposedFunction exposedFunction = this.$handler;
            Object[] parameters = this.$invocation.getParameters();
            this.label = 1;
            obj = exposedFunction.invoke(parameters, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
