package com.iab.omid.library.bigosg.webviewclient;

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
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded("com.iab.omid.library", webView, str);
        safedk_b_onLoadResource_6e666a80b1d5eaa1fe9e36e681fc88dd(webView, str);
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
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted("com.iab.omid.library", webView, str);
        safedk_b_onPageStarted_1e236cb2b8aa6e044d5a79224937285d(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", webView, i, str, str2);
        safedk_b_onReceivedError_5054c7564bb9458103c16c12df230765(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_5ceef86cf3156cbbf85b14c995655eae(webView, webResourceRequest, webResourceError);
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

    public void safedk_b_onLoadResource_6e666a80b1d5eaa1fe9e36e681fc88dd(WebView p0, String p1) {
        this.a.onLoadResource(p0, p1);
    }

    public void safedk_b_onPageStarted_1e236cb2b8aa6e044d5a79224937285d(WebView p0, String p1, Bitmap p2) {
        this.a.onPageStarted(p0, p1, p2);
    }

    public void safedk_b_onReceivedError_5054c7564bb9458103c16c12df230765(WebView p0, int p1, String p2, String p3) {
        this.a.onReceivedError(p0, p1, p2, p3);
    }

    @RequiresApi
    public void safedk_b_onReceivedError_5ceef86cf3156cbbf85b14c995655eae(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        this.a.onReceivedError(p0, p1, p2);
    }

    public WebResourceResponse safedk_b_shouldInterceptRequest_0bb58441a271f3ff8629a33062706a89(WebView p0, String p1) {
        return this.a.shouldInterceptRequest(p0, p1);
    }

    @RequiresApi
    public WebResourceResponse safedk_b_shouldInterceptRequest_cff33324946084f09545b333a0df3c29(WebView p0, WebResourceRequest p1) {
        return this.a.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_b_shouldOverrideUrlLoading_07a88ba68984d7d6b2c5bc9321aa2f79(WebView p0, String p1) {
        if (a.a(p1)) {
            return true;
        }
        return this.a.shouldOverrideUrlLoading(p0, p1);
    }

    @RequiresApi
    public boolean safedk_b_shouldOverrideUrlLoading_61da4415d96ad610219529114f3566ee(WebView p0, WebResourceRequest p1) {
        if (a.a(p1.getUrl().toString())) {
            return true;
        }
        return this.a.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @RequiresApi
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", webView, webResourceRequest, safedk_b_shouldInterceptRequest_cff33324946084f09545b333a0df3c29(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse("com.iab.omid.library", webView, str, safedk_b_shouldInterceptRequest_0bb58441a271f3ff8629a33062706a89(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_61da4415d96ad610219529114f3566ee = safedk_b_shouldOverrideUrlLoading_61da4415d96ad610219529114f3566ee(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, webResourceRequest, safedk_b_shouldOverrideUrlLoading_61da4415d96ad610219529114f3566ee);
        return safedk_b_shouldOverrideUrlLoading_61da4415d96ad610219529114f3566ee;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/webviewclient/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_07a88ba68984d7d6b2c5bc9321aa2f79 = safedk_b_shouldOverrideUrlLoading_07a88ba68984d7d6b2c5bc9321aa2f79(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, str, safedk_b_shouldOverrideUrlLoading_07a88ba68984d7d6b2c5bc9321aa2f79);
        return safedk_b_shouldOverrideUrlLoading_07a88ba68984d7d6b2c5bc9321aa2f79;
    }
}
