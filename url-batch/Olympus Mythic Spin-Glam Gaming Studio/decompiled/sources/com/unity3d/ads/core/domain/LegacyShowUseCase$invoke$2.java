package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "close", "Lkotlin/Function0;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {178, 184, 185}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class LegacyShowUseCase$invoke$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $placement;
    final /* synthetic */ Function6 $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$2(LegacyShowUseCase legacyShowUseCase, AdObject adObject, boolean z, Function6 function6, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = legacyShowUseCase;
        this.$adObject = adObject;
        this.$useTimeout = z;
        this.$reportShowError = function6;
        this.$placement = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new LegacyShowUseCase$invoke$2(this.this$0, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, continuation);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function0 function0, Continuation continuation) {
        return ((LegacyShowUseCase$invoke$2) create(function0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object sendOperativeError;
        Show show;
        Function6 function6;
        UnityAds.UnityAdsShowError unityAdsShowError;
        String str;
        Function0 function02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            function0 = (Function0) this.L$0;
            mutableStateFlow = this.this$0.hasStarted;
            if (!((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                mutableStateFlow2 = this.this$0.timeoutCancellationRequested;
                if (!((Boolean) mutableStateFlow2.getValue()).booleanValue()) {
                    LegacyShowUseCase legacyShowUseCase = this.this$0;
                    OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                    AdObject adObject = this.$adObject;
                    this.L$0 = function0;
                    this.label = 1;
                    sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, "timeout", adObject, this);
                    if (sendOperativeError == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function02 = (Function0) this.L$0;
                ResultKt.throwOnFailure(obj);
                function02.mo4828invoke();
                return Unit.INSTANCE;
            }
            function0 = (Function0) this.L$0;
            ResultKt.throwOnFailure(obj);
            function6 = this.$reportShowError;
            unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
            this.L$0 = function0;
            this.label = 3;
            if (function6.invoke("timeout", unityAdsShowError, str, null, null, this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            function02 = function0;
            function02.mo4828invoke();
            return Unit.INSTANCE;
        }
        function0 = (Function0) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (this.$useTimeout) {
            show = this.this$0.show;
            AdObject adObject2 = this.$adObject;
            this.L$0 = function0;
            this.label = 2;
            if (show.terminate(adObject2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            function6 = this.$reportShowError;
            unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
            this.L$0 = function0;
            this.label = 3;
            if (function6.invoke("timeout", unityAdsShowError, str, null, null, this) != coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }
}
