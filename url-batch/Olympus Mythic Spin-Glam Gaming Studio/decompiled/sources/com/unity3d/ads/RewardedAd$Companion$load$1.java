package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardedAd.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.RewardedAd$Companion$load$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RewardedAd$Companion$load$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ LoadConfiguration $configuration;
    final /* synthetic */ LoadListener<RewardedAd> $listener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardedAd$Companion$load$1(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener, Continuation continuation) {
        super(2, continuation);
        this.$configuration = loadConfiguration;
        this.$listener = loadListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RewardedAd$Companion$load$1 rewardedAd$Companion$load$1 = new RewardedAd$Companion$load$1(this.$configuration, this.$listener, continuation);
        rewardedAd$Companion$load$1.L$0 = obj;
        return rewardedAd$Companion$load$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RewardedAd$Companion$load$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LoadConfiguration loadConfiguration = this.$configuration;
        final LoadListener<RewardedAd> loadListener = this.$listener;
        try {
            Result.Companion companion = Result.INSTANCE;
            LoadConfigurationInternal loadConfigurationInternal = new LoadConfigurationInternal(loadConfiguration.getPlacementId(), loadConfiguration.getAdMarkup(), loadConfiguration.getMediationAdUnitId(), loadConfiguration.getMediationInfo(), MapsKt.toMap(loadConfiguration.getExtras()));
            UUID randomUUID = UUID.randomUUID();
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(randomUUID.toString());
            unityAdsLoadOptions.setAdMarkup(loadConfiguration.getAdMarkup());
            unityAdsLoadOptions.loadConfiguration = loadConfigurationInternal;
            UnityAdsImplementation.getInstance().load(loadConfiguration.getPlacementId(), unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.ads.RewardedAd$Companion$load$1$1$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    Intrinsics.checkNotNullParameter(adObject, "adObject");
                    loadListener.onAdLoaded(new RewardedAd(adObject, (SafeCallbackInvoke) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(null, Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class), 1, null))), null);
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    loadListener.onAdLoaded(null, error);
                }
            });
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        final LoadListener<RewardedAd> loadListener2 = this.$listener;
        final Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.RewardedAd$Companion$load$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(LoadListener.this, m8026exceptionOrNullimpl);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(LoadListener loadListener, Throwable th) {
        loadListener.onAdLoaded(null, new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.getNumber(), "Unity Ads SDK load failed due to unexpected error: " + th.getMessage()));
    }
}
