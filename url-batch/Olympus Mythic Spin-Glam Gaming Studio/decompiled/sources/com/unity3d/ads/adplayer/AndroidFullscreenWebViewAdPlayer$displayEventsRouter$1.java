package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
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

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation continuation) {
        super(2, continuation);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebViewAdPlayer webViewAdPlayer;
        WebViewAdPlayer webViewAdPlayer2;
        WebViewAdPlayer webViewAdPlayer3;
        WebViewAdPlayer webViewAdPlayer4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                DisplayMessage displayMessage = this.$displayMessage;
                if (displayMessage instanceof DisplayMessage.DisplayReady) {
                    webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                    Map<String, Object> showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                    this.label = 1;
                    if (webViewAdPlayer4.requestShow(showOptions, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.WebViewInstanceRequest) {
                    MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView());
                    this.label = 2;
                    if (displayMessages.emit(webViewInstanceResponse, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                    webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                    boolean isVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).getIsVisible();
                    this.label = 3;
                    if (webViewAdPlayer3.sendVisibilityChange(isVisible, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                    webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                    boolean isFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).getIsFocused();
                    this.label = 4;
                    if (webViewAdPlayer2.sendFocusChange(isFocused, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.DisplayDestroyed) {
                    webViewAdPlayer = this.this$0.webViewAdPlayer;
                    this.label = 5;
                    if (webViewAdPlayer.sendActivityDestroyed(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                    AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                    this.label = 6;
                    if (androidFullscreenWebViewAdPlayer.destroy(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
