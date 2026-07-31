package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowEvent;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function6;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class LegacyShowUseCase$invoke$4<T> implements FlowCollector {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ Function6 $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;
    final /* synthetic */ LegacyShowUseCase this$0;

    LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, AdObject adObject, Function6 function6) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$unityAdsShowOptions = unityAdsShowOptions;
        this.$adObject = adObject;
        this.$reportShowError = function6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:(1:(1:12)(2:16|17))(1:18)|13|14)(2:19|20))(5:24|25|(1:27)(2:28|(1:30)(2:31|(1:33)(2:34|(1:36)(2:37|(2:39|(1:41)(2:42|(1:44)))(2:45|(1:47)(2:48|(1:50)(2:51|52)))))))|13|14)|21|(1:23)|13|14))|57|6|7|(0)(0)|21|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        r4 = r23.$reportShowError;
        r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        r9 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r0, 0, 1, null);
        r3.L$0 = null;
        r3.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018a, code lost:
    
        if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r3) == r11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018c, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ShowEvent showEvent, Continuation continuation) {
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
        Object coroutine_suspended;
        int i;
        MutableStateFlow mutableStateFlow;
        Object sendOperativeError;
        Function6 function6;
        String reason;
        UnityAds.UnityAdsShowError unityAdsShowError;
        String message;
        Integer boxInt;
        String message2;
        ShowEvent showEvent2 = showEvent;
        if (continuation instanceof LegacyShowUseCase$invoke$4$emit$1) {
            legacyShowUseCase$invoke$4$emit$1 = (LegacyShowUseCase$invoke$4$emit$1) continuation;
            int i2 = legacyShowUseCase$invoke$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$4$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = legacyShowUseCase$invoke$4$emit$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = legacyShowUseCase$invoke$4$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (showEvent2 instanceof ShowEvent.Started) {
                        this.this$0.showStarted(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Clicked) {
                        this.this$0.showClicked(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Completed) {
                        this.this$0.showCompleted(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime), this.$placement, ((ShowEvent.Completed) showEvent2).getStatus(), this.$listeners, ((ShowEvent.Completed) showEvent2).getReason(), ((ShowEvent.Completed) showEvent2).getReasonDebug(), this.$unityAdsShowOptions);
                    } else if (showEvent2 instanceof ShowEvent.ReceivedReward) {
                        this.this$0.showReceivedReward(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Error) {
                        mutableStateFlow = this.this$0.hasStarted;
                        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                            this.this$0.showCompleted(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime), this.$placement, ShowStatus.ERROR, this.$listeners, ((ShowEvent.Error) showEvent2).getReason(), ((ShowEvent.Error) showEvent2).getMessage(), this.$unityAdsShowOptions);
                        } else {
                            LegacyShowUseCase legacyShowUseCase = this.this$0;
                            OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                            String message3 = ((ShowEvent.Error) showEvent2).getMessage();
                            AdObject adObject = this.$adObject;
                            legacyShowUseCase$invoke$4$emit$1.L$0 = showEvent2;
                            legacyShowUseCase$invoke$4$emit$1.label = 1;
                            sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$1);
                            if (sendOperativeError == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (showEvent2 instanceof ShowEvent.CancelTimeout) {
                        this.this$0.cancelTimeout(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime));
                    } else if (showEvent2 instanceof ShowEvent.LeftApplication) {
                        this.this$0.bannerLeftApplication(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                showEvent2 = (ShowEvent) legacyShowUseCase$invoke$4$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
                function6 = this.$reportShowError;
                reason = ((ShowEvent.Error) showEvent2).getReason();
                unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                message = ((ShowEvent.Error) showEvent2).getMessage();
                boxInt = Boxing.boxInt(((ShowEvent.Error) showEvent2).getErrorCode());
                message2 = ((ShowEvent.Error) showEvent2).getMessage();
                legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                legacyShowUseCase$invoke$4$emit$1.label = 2;
                if (function6.invoke(reason, unityAdsShowError, message, boxInt, message2, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, continuation);
        Object obj2 = legacyShowUseCase$invoke$4$emit$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = legacyShowUseCase$invoke$4$emit$1.label;
        if (i != 0) {
        }
        function6 = this.$reportShowError;
        reason = ((ShowEvent.Error) showEvent2).getReason();
        unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        message = ((ShowEvent.Error) showEvent2).getMessage();
        boxInt = Boxing.boxInt(((ShowEvent.Error) showEvent2).getErrorCode());
        message2 = ((ShowEvent.Error) showEvent2).getMessage();
        legacyShowUseCase$invoke$4$emit$1.L$0 = null;
        legacyShowUseCase$invoke$4$emit$1.label = 2;
        if (function6.invoke(reason, unityAdsShowError, message, boxInt, message2, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
