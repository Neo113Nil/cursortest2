package com.pubmatic.sdk.webrendering.ui;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class POBHTMLViewClient extends WebViewClient {
    private HTMLViewClientListener a;
    private boolean b;
    private boolean c;
    private final OnRenderProcessGoneListener d;

    public interface HTMLViewClientListener {
        void onPageFinished(@NonNull WebView webView);

        void onReceivedError(@NonNull POBError pOBError);

        boolean shouldOverrideUrlLoading(@Nullable String str);
    }

    public interface OnRenderProcessGoneListener {
        void onRenderProcessGone();
    }

    public POBHTMLViewClient(@NonNull OnRenderProcessGoneListener onRenderProcessGoneListener) {
        this.d = onRenderProcessGoneListener;
    }

    private void a(String str) {
        POBLog.error("POBHTMLViewClient", str, new Object[0]);
        HTMLViewClientListener hTMLViewClientListener = this.a;
        if (hTMLViewClientListener != null) {
            hTMLViewClientListener.onReceivedError(new POBError(1009, str));
        }
    }

    public void disableMultipleOnPageFinished(boolean z) {
        this.b = z;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.F, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        HTMLViewClientListener hTMLViewClientListener;
        super.onPageFinished(webView, str);
        POBLog.debug("POBHTMLViewClient", "WebView creative loading finished.", new Object[0]);
        if (!this.c && (hTMLViewClientListener = this.a) != null) {
            hTMLViewClientListener.onPageFinished(webView);
            this.c = this.b;
        }
        webView.setFocusableInTouchMode(true);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.F, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/ui/POBHTMLViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.F, webView, i, str, str2);
        safedk_POBHTMLViewClient_onReceivedError_cf80c93cc03b6b2282a9dbd00940786e(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/ui/POBHTMLViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.F, webView, webResourceRequest, webResourceError);
        safedk_POBHTMLViewClient_onReceivedError_6f8864a1359086cc518326a42d606eff(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        if (renderProcessGoneDetail != null) {
            didCrash = renderProcessGoneDetail.didCrash();
            Boolean valueOf = Boolean.valueOf(didCrash);
            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
            POBLog.error("POBHTMLViewClient", "WebView Render process gone, did it crash? :-> %s, reason: %s", valueOf, Integer.valueOf(rendererPriorityAtExit));
        }
        this.d.onRenderProcessGone();
        return true;
    }

    public void safedk_POBHTMLViewClient_onReceivedError_cf80c93cc03b6b2282a9dbd00940786e(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
    }

    public boolean safedk_POBHTMLViewClient_shouldOverrideUrlLoading_382c66d7a442ba308ad7f0ab00a768b1(WebView p0, String p1) {
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    public void setHTMLClientListener(@Nullable HTMLViewClientListener hTMLViewClientListener) {
        this.a = hTMLViewClientListener;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.F, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/ui/POBHTMLViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_POBHTMLViewClient_shouldOverrideUrlLoading_f9e49170d2e080bbd29e65bd6b1a8bd2 = safedk_POBHTMLViewClient_shouldOverrideUrlLoading_f9e49170d2e080bbd29e65bd6b1a8bd2(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.F, webView, webResourceRequest, safedk_POBHTMLViewClient_shouldOverrideUrlLoading_f9e49170d2e080bbd29e65bd6b1a8bd2);
        return safedk_POBHTMLViewClient_shouldOverrideUrlLoading_f9e49170d2e080bbd29e65bd6b1a8bd2;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/ui/POBHTMLViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_POBHTMLViewClient_shouldOverrideUrlLoading_382c66d7a442ba308ad7f0ab00a768b1 = safedk_POBHTMLViewClient_shouldOverrideUrlLoading_382c66d7a442ba308ad7f0ab00a768b1(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.F, webView, str, safedk_POBHTMLViewClient_shouldOverrideUrlLoading_382c66d7a442ba308ad7f0ab00a768b1);
        return safedk_POBHTMLViewClient_shouldOverrideUrlLoading_382c66d7a442ba308ad7f0ab00a768b1;
    }

    public void safedk_POBHTMLViewClient_onReceivedError_6f8864a1359086cc518326a42d606eff(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        if (p1.isForMainFrame()) {
            a(String.format("WebView received error on page loading. Error : %s", p2 != null ? p2.toString() : " Not defined"));
        }
    }

    @TargetApi(24)
    public boolean safedk_POBHTMLViewClient_shouldOverrideUrlLoading_f9e49170d2e080bbd29e65bd6b1a8bd2(WebView p0, WebResourceRequest p1) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(p0, p1);
        POBLog.debug("POBHTMLViewClient", "WebView shouldOverrideUrlLoading.. Request redirect = " + p1.isRedirect(), new Object[0]);
        if (p1.isRedirect() || p1.getUrl() == null) {
            return shouldOverrideUrlLoading;
        }
        String uri = p1.getUrl().toString();
        HTMLViewClientListener hTMLViewClientListener = this.a;
        return hTMLViewClientListener != null ? hTMLViewClientListener.shouldOverrideUrlLoading(uri) : shouldOverrideUrlLoading;
    }
}
