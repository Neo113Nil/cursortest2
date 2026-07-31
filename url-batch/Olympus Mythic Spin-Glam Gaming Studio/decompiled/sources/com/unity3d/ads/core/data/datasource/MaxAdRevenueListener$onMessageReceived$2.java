package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MaxAdRevenueListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2", f = "MaxAdRevenueListener.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MaxAdRevenueListener$onMessageReceived$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Bundle $messageData;
    Object L$0;
    int label;
    final /* synthetic */ MaxAdRevenueListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MaxAdRevenueListener$onMessageReceived$2(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = maxAdRevenueListener;
        this.$messageData = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaxAdRevenueListener$onMessageReceived$2(this.this$0, this.$messageData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MaxAdRevenueListener$onMessageReceived$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        AdRevenueData parseRevenueBundle;
        Logger logger2;
        HandleAdRevenueEvent handleAdRevenueEvent;
        AdRevenueData adRevenueData;
        Logger logger3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace("Failed to process ad revenue event", e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            parseRevenueBundle = this.this$0.parseRevenueBundle(this.$messageData);
            if (parseRevenueBundle != null) {
                handleAdRevenueEvent = this.this$0.handleAdRevenueEvent;
                ClientInfoOuterClass.MediationProvider mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                AdRevenueOrigin adRevenueOrigin = AdRevenueOrigin.AUTOMATIC_COLLECTION;
                this.L$0 = parseRevenueBundle;
                this.label = 1;
                if (handleAdRevenueEvent.invoke(parseRevenueBundle, mediationProvider, adRevenueOrigin, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                adRevenueData = parseRevenueBundle;
            } else {
                logger2 = this.this$0.logger;
                Logger.DefaultImpls.trace$default(logger2, "Failed to parse revenue event", null, 2, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adRevenueData = (AdRevenueData) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        logger3 = this.this$0.logger;
        Logger.DefaultImpls.trace$default(logger3, "Ad revenue event sent: revenue=" + adRevenueData.getRevenue() + ", network=" + adRevenueData.getNetworkName(), null, 2, null);
        return Unit.INSTANCE;
    }
}
