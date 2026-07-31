package com.ironsource;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.H8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4732k8 extends WebViewClient {
    private static final String b = "k8";
    private final H8.a a;

    public C4732k8(H8.a aVar) {
        this.a = aVar;
    }

    private String a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/k8;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, i, str, str2);
        safedk_k8_onReceivedError_5f1c2168ec9a06acc7e6d65784b699c1(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/k8;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, webResourceRequest, webResourceError);
        safedk_k8_onReceivedError_28c506ce42e6073a5fed0eef74ac5ee7(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        try {
            String str = b;
            StringBuilder sb = new StringBuilder();
            sb.append("Chromium process crashed - detail.didCrash():");
            didCrash = renderProcessGoneDetail.didCrash();
            sb.append(didCrash);
            com.ironsource.sdk.utils.Logger.e(str, sb.toString());
            didCrash2 = renderProcessGoneDetail.didCrash();
            this.a.b(didCrash2 ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return true;
        }
    }

    public void safedk_k8_onReceivedError_5f1c2168ec9a06acc7e6d65784b699c1(WebView p0, int p1, String p2, String p3) {
        try {
            this.a.a(a("onReceivedError", String.valueOf(p1)));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(p0, p1, p2, p3);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.a.a(a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @TargetApi(23)
    public void safedk_k8_onReceivedError_28c506ce42e6073a5fed0eef74ac5ee7(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        try {
            this.a.a(a("onReceivedErrorM", String.valueOf(p2.getErrorCode())));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(p0, p1, p2);
    }
}
