package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TriggerInitializeListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TriggerInitializeListener$error$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ InitializationException $e;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerInitializeListener$error$1(InitializationException initializationException, Continuation continuation) {
        super(2, continuation);
        this.$e = initializationException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TriggerInitializeListener$error$1(this.$e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TriggerInitializeListener$error$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SdkProperties.notifyInitializationFailed(this.$e);
        return Unit.INSTANCE;
    }
}
