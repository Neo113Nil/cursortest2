package yads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes14.dex */
public final class q01 extends WebViewClient {
    public final r01 a;
    public final jo3 b;
    public p01 c;

    public q01(r01 r01Var) {
        jo3 jo3Var = new jo3();
        this.a = r01Var;
        this.b = jo3Var;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.y, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.a();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.y, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/q01;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.y, webView, i, str, str2);
        safedk_q01_onReceivedError_7ae3703032d5192ee0861196c654c8df(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/q01;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.y, webView, webResourceRequest, webResourceError);
        safedk_q01_onReceivedError_a8c29d232c4fe37ae6f1ea14cba3ce94(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    public void safedk_q01_onReceivedError_7ae3703032d5192ee0861196c654c8df(WebView p0, int p1, String p2, String p3) {
        this.a.a(p1);
    }

    public WebResourceResponse safedk_q01_shouldInterceptRequest_864b3c2b4a75675832eb287a98a65523(WebView p0, WebResourceRequest p1) {
        WebResourceResponse a;
        p01 p01Var = this.c;
        return (p01Var == null || (a = p01Var.a(p0, p1)) == null) ? super.shouldInterceptRequest(p0, p1) : a;
    }

    public boolean safedk_q01_shouldOverrideUrlLoading_6201de98cdde9acd77ae6489b6a090e3(WebView p0, String p1) {
        this.a.a(p0.getContext(), p1);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/q01;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.y, webView, webResourceRequest, safedk_q01_shouldInterceptRequest_864b3c2b4a75675832eb287a98a65523(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/q01;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_q01_shouldOverrideUrlLoading_6201de98cdde9acd77ae6489b6a090e3 = safedk_q01_shouldOverrideUrlLoading_6201de98cdde9acd77ae6489b6a090e3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.y, webView, str, safedk_q01_shouldOverrideUrlLoading_6201de98cdde9acd77ae6489b6a090e3);
        return safedk_q01_shouldOverrideUrlLoading_6201de98cdde9acd77ae6489b6a090e3;
    }

    public void safedk_q01_onReceivedError_a8c29d232c4fe37ae6f1ea14cba3ce94(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        this.a.a(p2.getErrorCode());
    }
}
