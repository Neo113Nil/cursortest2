package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebViewAdPlayer$storageEventCallback$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ StorageEventInfo $it;
    int label;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$storageEventCallback$1$1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewAdPlayer;
        this.$it = storageEventInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewAdPlayer$storageEventCallback$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WebViewAdPlayer$storageEventCallback$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebViewBridge webViewBridge;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            webViewBridge = this.this$0.bridge;
            OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
            this.label = 1;
            if (webViewBridge.sendEvent(onStorageEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
