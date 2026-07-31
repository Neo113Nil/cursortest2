package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
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
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: UnityAdsSDK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class UnityAdsSDK$getToken$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Lazy $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ CoroutineScope $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ Lazy $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$getToken$2(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, CoroutineScope coroutineScope, Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.$tokenConfiguration = tokenConfiguration;
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = coroutineScope;
        this.$getAsyncHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnityAdsSDK$getToken$2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UnityAdsSDK$getToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetAsyncHeaderBiddingToken token$lambda$11;
        TokenNumberProvider token$lambda$10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            token$lambda$11 = UnityAdsSDK.getToken$lambda$11(this.$getAsyncHeaderBiddingToken$delegate);
            token$lambda$10 = UnityAdsSDK.getToken$lambda$10(this.$tokenNumberProvider$delegate);
            int invoke = token$lambda$10.invoke();
            TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            if (token$lambda$11.invoke(invoke, tokenConfiguration, iUnityAdsTokenListener, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineScopeKt.cancel$default(this.$getTokenScope, null, 1, null);
        return Unit.INSTANCE;
    }
}
