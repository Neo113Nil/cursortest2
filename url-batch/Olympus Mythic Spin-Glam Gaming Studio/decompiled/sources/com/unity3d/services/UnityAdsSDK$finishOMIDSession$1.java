package com.unity3d.services;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: UnityAdsSDK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class UnityAdsSDK$finishOMIDSession$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Lazy $getAdObject$delegate;
    final /* synthetic */ Lazy $omFinishSession$delegate;
    final /* synthetic */ CoroutineScope $omidScope;
    final /* synthetic */ String $opportunityId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$finishOMIDSession$1(String str, CoroutineScope coroutineScope, Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.$opportunityId = str;
        this.$omidScope = coroutineScope;
        this.$getAdObject$delegate = lazy;
        this.$omFinishSession$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnityAdsSDK$finishOMIDSession$1(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UnityAdsSDK$finishOMIDSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetAdObject finishOMIDSession$lambda$20;
        OmFinishSession finishOMIDSession$lambda$21;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            finishOMIDSession$lambda$20 = UnityAdsSDK.finishOMIDSession$lambda$20(this.$getAdObject$delegate);
            AdObject invoke = finishOMIDSession$lambda$20.invoke(this.$opportunityId);
            if (invoke != null) {
                finishOMIDSession$lambda$21 = UnityAdsSDK.finishOMIDSession$lambda$21(this.$omFinishSession$delegate);
                this.label = 1;
                if (finishOMIDSession$lambda$21.invoke(invoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineScopeKt.cancel$default(this.$omidScope, null, 1, null);
        return Unit.INSTANCE;
    }
}
