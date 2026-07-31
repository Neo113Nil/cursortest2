package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: WebViewContainer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewContainer;", "", "loadUrl", "", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateJavascript", "handlerType", "Lcom/unity3d/ads/adplayer/HandlerType;", "arguments", "Lorg/json/JSONArray;", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addJavascriptInterface", "webViewBridgeInterface", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "name", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastInputEvent", "Lkotlinx/coroutines/flow/StateFlow;", "Landroid/view/InputEvent;", "getLastInputEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WebViewContainer {
    @Nullable
    Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull Continuation continuation);

    @Nullable
    Object destroy(@NotNull Continuation continuation);

    @Nullable
    Object evaluateJavascript(@NotNull HandlerType handlerType, @NotNull JSONArray jSONArray, @NotNull Continuation continuation);

    @NotNull
    StateFlow getLastInputEvent();

    @Nullable
    Object loadUrl(@NotNull String str, @NotNull Continuation continuation);
}
