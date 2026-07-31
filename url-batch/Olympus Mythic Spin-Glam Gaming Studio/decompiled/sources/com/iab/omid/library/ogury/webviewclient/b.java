package com.iab.omid.library.ogury.webviewclient;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public class b extends WebViewClient {
    private final WebViewClient a;

    public b(@NonNull WebViewClient webViewClient) {
        this.a = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.a.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded("com.iab.omid.library", webView, str);
        safedk_b_onLoadResource_b2411c268bee564dfc953145c1d396a2(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onPageCommitVisible(WebView webView, String str) {
        this.a.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted("com.iab.omid.library", webView, str);
        safedk_b_onPageStarted_8c8e932979fe8a1f42174b6776ab1a9c(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", webView, i, str, str2);
        safedk_b_onReceivedError_272b61110adc605b5fdb9d5c882fcff2(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_a8f7f3db80bdf0ab33eafe96e3459ac3(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        onRenderProcessGone = this.a.onRenderProcessGone(webView, renderProcessGoneDetail);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        this.a.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.a.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_b_onLoadResource_b2411c268bee564dfc953145c1d396a2(WebView p0, String p1) {
        this.a.onLoadResource(p0, p1);
    }

    public void safedk_b_onPageStarted_8c8e932979fe8a1f42174b6776ab1a9c(WebView p0, String p1, Bitmap p2) {
        this.a.onPageStarted(p0, p1, p2);
    }

    public void safedk_b_onReceivedError_272b61110adc605b5fdb9d5c882fcff2(WebView p0, int p1, String p2, String p3) {
        this.a.onReceivedError(p0, p1, p2, p3);
    }

    @RequiresApi
    public void safedk_b_onReceivedError_a8f7f3db80bdf0ab33eafe96e3459ac3(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        this.a.onReceivedError(p0, p1, p2);
    }

    @RequiresApi
    public WebResourceResponse safedk_b_shouldInterceptRequest_23703f4b6912dbe641a738ae6dd27d5f(WebView p0, WebResourceRequest p1) {
        return this.a.shouldInterceptRequest(p0, p1);
    }

    public WebResourceResponse safedk_b_shouldInterceptRequest_83464c8d3a5a642087cf64d3b1bfed38(WebView p0, String p1) {
        return this.a.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_b_shouldOverrideUrlLoading_50f9cb58b63053c88b1736200987c192(WebView p0, String p1) {
        if (a.a(p1)) {
            return true;
        }
        return this.a.shouldOverrideUrlLoading(p0, p1);
    }

    @RequiresApi
    public boolean safedk_b_shouldOverrideUrlLoading_d9bb5f49a3b9109a5a6911417ed6afed(WebView p0, WebResourceRequest p1) {
        if (a.a(p1.getUrl().toString())) {
            return true;
        }
        return this.a.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @RequiresApi
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", webView, webResourceRequest, safedk_b_shouldInterceptRequest_23703f4b6912dbe641a738ae6dd27d5f(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse("com.iab.omid.library", webView, str, safedk_b_shouldInterceptRequest_83464c8d3a5a642087cf64d3b1bfed38(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_d9bb5f49a3b9109a5a6911417ed6afed = safedk_b_shouldOverrideUrlLoading_d9bb5f49a3b9109a5a6911417ed6afed(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, webResourceRequest, safedk_b_shouldOverrideUrlLoading_d9bb5f49a3b9109a5a6911417ed6afed);
        return safedk_b_shouldOverrideUrlLoading_d9bb5f49a3b9109a5a6911417ed6afed;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/webviewclient/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_50f9cb58b63053c88b1736200987c192 = safedk_b_shouldOverrideUrlLoading_50f9cb58b63053c88b1736200987c192(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, str, safedk_b_shouldOverrideUrlLoading_50f9cb58b63053c88b1736200987c192);
        return safedk_b_shouldOverrideUrlLoading_50f9cb58b63053c88b1736200987c192;
    }
}
