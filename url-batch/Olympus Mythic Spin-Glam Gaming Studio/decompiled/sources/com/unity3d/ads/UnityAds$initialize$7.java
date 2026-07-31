package com.unity3d.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityServices;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UnityAds.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.UnityAds$initialize$7", f = "UnityAds.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class UnityAds$initialize$7 extends SuspendLambda implements Function2 {
    final /* synthetic */ InitializationConfiguration $configuration;
    final /* synthetic */ InitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnityAds$initialize$7(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener, Continuation continuation) {
        super(2, continuation);
        this.$configuration = initializationConfiguration;
        this.$listener = initializationListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnityAds$initialize$7(this.$configuration, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UnityAds$initialize$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$configuration.getMediationInfo() != null) {
            MediationMetaData mediationMetaData = new MediationMetaData(ClientProperties.getApplicationContext());
            InitializationConfiguration initializationConfiguration = this.$configuration;
            mediationMetaData.setName(initializationConfiguration.getMediationInfo().getName());
            mediationMetaData.setVersion(initializationConfiguration.getMediationInfo().getVersion());
            mediationMetaData.set("adapter_version", initializationConfiguration.getMediationInfo().getAdapterVersion());
            mediationMetaData.commit();
        }
        UnityServices.initialize(ClientProperties.getApplicationContext(), this.$configuration.getGameId(), this.$configuration.getIsTestModeEnabled(), this.$configuration, this.$listener);
        return Unit.INSTANCE;
    }
}
