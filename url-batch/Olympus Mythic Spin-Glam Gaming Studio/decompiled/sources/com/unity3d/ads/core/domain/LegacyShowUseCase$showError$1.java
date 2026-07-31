package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function6;
import kotlin.time.TimeMark;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "diagnosticReason", "", "reason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "message", "code", "", "debugMessage"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class LegacyShowUseCase$showError$1 extends SuspendLambda implements Function6 {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    final /* synthetic */ TimeMark $startTime;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$showError$1(LegacyShowUseCase legacyShowUseCase, String str, TimeMark timeMark, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, String str2, Continuation continuation) {
        super(6, continuation);
        this.this$0 = legacyShowUseCase;
        this.$opportunityId = str;
        this.$startTime = timeMark;
        this.$showOptions = unityAdsShowOptions;
        this.$listeners = listeners;
        this.$placement = str2;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, Continuation continuation) {
        LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new LegacyShowUseCase$showError$1(this.this$0, this.$opportunityId, this.$startTime, this.$showOptions, this.$listeners, this.$placement, continuation);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String adInfoString;
        AdObject adObject;
        SendDiagnosticEvent sendDiagnosticEvent;
        Map tags;
        SafeCallbackInvoke safeCallbackInvoke;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            final UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            final String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            logger = this.this$0.logger;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to show ad ");
            adInfoString = this.this$0.getAdInfoString();
            sb.append(adInfoString);
            sb.append(", error: ");
            sb.append(str2);
            Logger.DefaultImpls.error$default(logger, sb.toString(), null, 2, null);
            adObject = this.this$0.adObject;
            if (adObject == null) {
                adObject = this.this$0.getTmpAdObject(this.$opportunityId);
            }
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME;
            Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(this.$startTime));
            tags = this.this$0.getTags(str, num, str3, this.$showOptions);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, tags, (Map) null, adObject, (Integer) null, (ByteString) null, 104, (Object) null);
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            final Listeners listeners = this.$listeners;
            final String str4 = this.$placement;
            safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = LegacyShowUseCase$showError$1.invokeSuspend$lambda$0(Listeners.this, str4, unityAdsShowError, str2);
                    return invokeSuspend$lambda$0;
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        listeners.onError(str, unityAdsShowError, str2);
        return Unit.INSTANCE;
    }
}
