package com.unity3d.services.ads.offerwall;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: OfferwallAdapterBridge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 83}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z, OfferwallAdapterBridge offerwallAdapterBridge, String str, Continuation continuation) {
        super(2, continuation);
        this.$placementAvailable = z;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$placementAvailable) {
                mutableSharedFlow2 = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent = OfferwallEvent.REQUEST_SUCCESS;
                String str = this.$placementName;
                OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str == null ? "" : str, null, null, 12, null);
                this.label = 1;
                if (mutableSharedFlow2.emit(offerwallEventData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                hashMap = this.this$0.placementsMap;
                String str2 = this.$placementName;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.remove(str2);
                mutableSharedFlow = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent2 = OfferwallEvent.REQUEST_FAILED;
                String str3 = this.$placementName;
                OfferwallEventData offerwallEventData2 = new OfferwallEventData(offerwallEvent2, str3 == null ? "" : str3, null, null, 12, null);
                this.label = 2;
                if (mutableSharedFlow.emit(offerwallEventData2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
