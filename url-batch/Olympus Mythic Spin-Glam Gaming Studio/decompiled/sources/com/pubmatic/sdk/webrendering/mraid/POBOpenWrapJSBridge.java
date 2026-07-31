package com.pubmatic.sdk.webrendering.mraid;

import android.webkit.ValueCallback;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/pubmatic/sdk/webrendering/mraid/POBOpenWrapJSBridge;", "", "Lcom/pubmatic/sdk/common/view/POBWebView;", "webView", "<init>", "(Lcom/pubmatic/sdk/common/view/POBWebView;)V", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "", "callback", "requestCTAOverlayData", "(Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/pubmatic/sdk/common/view/POBWebView;", "", "b", "Ljava/lang/String;", "ctaOverlayAPI", "Companion", "webrendering_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class POBOpenWrapJSBridge {

    /* renamed from: a, reason: from kotlin metadata */
    private final POBWebView webView;

    /* renamed from: b, reason: from kotlin metadata */
    private final String ctaOverlayAPI;

    public POBOpenWrapJSBridge(@NotNull POBWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.ctaOverlayAPI = "openwrapsdk.getCtaData()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 callback, String str) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        try {
            if (POBUtils.isStringValueNullOrEmpty(str)) {
                callback.invoke(null);
            } else {
                callback.invoke(new JSONObject(str));
            }
        } catch (JSONException e) {
            POBLog.debug("POBOpenWrapJSBridge", "Failed to get CTAOverlayData %s", e.getMessage());
            callback.invoke(null);
        }
    }

    public final void requestCTAOverlayData(@NotNull final Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.webView.evaluateJavascript(this.ctaOverlayAPI, new ValueCallback() { // from class: com.pubmatic.sdk.webrendering.mraid.POBOpenWrapJSBridge$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                POBOpenWrapJSBridge.a(Function1.this, (String) obj);
            }
        });
    }
}
