package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
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

/* compiled from: UnityAdsSDK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {200}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class UnityAdsSDK$fetchToken$token$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Lazy $getHeaderBiddingToken$delegate;
    final /* synthetic */ Lazy $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$fetchToken$token$1(Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.$getHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UnityAdsSDK$fetchToken$token$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetHeaderBiddingToken fetchToken$lambda$13;
        TokenNumberProvider fetchToken$lambda$12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fetchToken$lambda$13 = UnityAdsSDK.fetchToken$lambda$13(this.$getHeaderBiddingToken$delegate);
            fetchToken$lambda$12 = UnityAdsSDK.fetchToken$lambda$12(this.$tokenNumberProvider$delegate);
            int invoke = fetchToken$lambda$12.invoke();
            this.label = 1;
            obj = GetHeaderBiddingToken.DefaultImpls.invoke$default(fetchToken$lambda$13, invoke, null, this, 2, null);
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
