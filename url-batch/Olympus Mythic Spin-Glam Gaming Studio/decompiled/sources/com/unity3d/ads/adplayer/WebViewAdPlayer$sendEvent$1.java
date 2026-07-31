package com.unity3d.ads.adplayer;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewAdPlayer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {208, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "sendEvent")
/* loaded from: classes8.dex */
final class WebViewAdPlayer$sendEvent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$sendEvent$1(WebViewAdPlayer webViewAdPlayer, Continuation continuation) {
        super(continuation);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object sendEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendEvent = this.this$0.sendEvent(null, this);
        return sendEvent;
    }
}
