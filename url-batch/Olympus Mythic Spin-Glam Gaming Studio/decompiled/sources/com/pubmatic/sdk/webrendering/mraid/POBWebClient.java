package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes14.dex */
public class POBWebClient extends POBHTMLViewClient {
    POBWebClient(POBHTMLViewClient.OnRenderProcessGoneListener onRenderProcessGoneListener) {
        super(onRenderProcessGoneListener);
    }

    private boolean a(String str, String str2) {
        return str2.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
    }

    private WebResourceResponse b(Context context, String str) {
        if (a(str, w.k)) {
            return a(context, POBCommonConstants.POB_MRAID_JS);
        }
        if (a(str, POBCommonConstants.OPENWRAP_JS)) {
            return a(context, POBCommonConstants.OPENWRAP_JS);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.F, view, url);
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.F, view, url);
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.F, view, errorCode, description, failingUrl);
    }

    public WebResourceResponse safedk_POBWebClient_shouldInterceptRequest_a3d11e4156b5399cb325d45e8eeef0b5(WebView p0, String p1) {
        WebResourceResponse b = b(p0.getContext(), p1);
        return b != null ? b : super.shouldInterceptRequest(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/mraid/POBWebClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.F, webView, webResourceRequest, safedk_POBWebClient_shouldInterceptRequest_88d69d7aed7714dbcf29f7157ebbdda9(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/mraid/POBWebClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.F, webView, str, safedk_POBWebClient_shouldInterceptRequest_a3d11e4156b5399cb325d45e8eeef0b5(webView, str));
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.F, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    private WebResourceResponse a(Context context, String str) {
        String openWrapJs;
        POBLog.debug("POBMraidWebClient", "Injecting %s in webView", str);
        if (POBCommonConstants.POB_MRAID_JS.equals(str)) {
            openWrapJs = POBInstanceProvider.getCacheManager(context).getMraidJs();
        } else {
            openWrapJs = POBCommonConstants.OPENWRAP_JS.equals(str) ? POBInstanceProvider.getCacheManager(context).getOpenWrapJs() : null;
        }
        if (openWrapJs == null) {
            return null;
        }
        return new WebResourceResponse(POBCommonConstants.CONTENT_TYPE_JAVASCRIPT, StandardCharsets.UTF_8.name(), new ByteArrayInputStream(("javascript:" + openWrapJs).getBytes()));
    }

    @TargetApi(21)
    public WebResourceResponse safedk_POBWebClient_shouldInterceptRequest_88d69d7aed7714dbcf29f7157ebbdda9(WebView p0, WebResourceRequest p1) {
        WebResourceResponse b = b(p0.getContext(), p1.getUrl().toString());
        return b != null ? b : super.shouldInterceptRequest(p0, p1);
    }
}
