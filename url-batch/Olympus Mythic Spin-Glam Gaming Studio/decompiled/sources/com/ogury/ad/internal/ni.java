package com.ogury.ad.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ni extends WebViewClient {
    public abstract WebResourceResponse a(WebView webView, String str);

    public abstract void a(String str, int i, String str2, Uri uri);

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("io.presage", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted("io.presage", view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/ni;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError("io.presage", webView, i, str, str2);
        safedk_ni_onReceivedError_8b3425d7be79d9fdaafb3157970277cc(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/ni;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError("io.presage", webView, webResourceRequest, webResourceError);
        safedk_ni_onReceivedError_b3913c85649882e75adbb71b44d1b78e(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        int statusCode = errorResponse.getStatusCode();
        String reasonPhrase = errorResponse.getReasonPhrase();
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        a("HTTP", statusCode, reasonPhrase, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        int primaryError = error.getPrimaryError();
        Uri parse = Uri.parse(error.getUrl());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        a("SSL", primaryError, "An SSL error occurred while loading a resource", parse);
        super.onReceivedSslError(view, handler, error);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        boolean didCrash = Build.VERSION.SDK_INT >= 26 ? detail.didCrash() : true;
        String url = view.getUrl();
        if (url == null) {
            url = "";
        }
        Uri failingUri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(failingUri, "parse(...)");
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
        z7 z7Var = ((a8) this).e;
        if (z7Var != null) {
            z7Var.a(didCrash, failingUri);
        }
        return true;
    }

    public void safedk_ni_onReceivedError_8b3425d7be79d9fdaafb3157970277cc(WebView p0, int p1, String p2, String p3) {
        Uri parse = Uri.parse(p3);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        a("WEBVIEW", p1, p2, parse);
    }

    public WebResourceResponse safedk_ni_shouldInterceptRequest_013bf30b68f05d94a9df9fb943102e5f(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return a(view, url);
    }

    public boolean safedk_ni_shouldOverrideUrlLoading_21a963bbb7615b156d151290dc03f87a(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String url = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
        a8 a8Var = (a8) this;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        y7 y7Var = a8Var.d;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        w6 mraidCommandExecutor = y7Var.getMraidCommandExecutor();
        mraidCommandExecutor.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        b8.a(mraidCommandExecutor.a, x6.a(url));
        z7 z7Var = a8Var.e;
        if (z7Var != null) {
            return z7Var.d(view, url);
        }
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/ni;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("io.presage", webView, webResourceRequest, safedk_ni_shouldInterceptRequest_e55f05cc1bfe7a81f2b726bf4ba4a695(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/ni;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse("io.presage", webView, str, safedk_ni_shouldInterceptRequest_013bf30b68f05d94a9df9fb943102e5f(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/ni;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_ni_shouldOverrideUrlLoading_21a963bbb7615b156d151290dc03f87a = safedk_ni_shouldOverrideUrlLoading_21a963bbb7615b156d151290dc03f87a(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading("io.presage", webView, webResourceRequest, safedk_ni_shouldOverrideUrlLoading_21a963bbb7615b156d151290dc03f87a);
        return safedk_ni_shouldOverrideUrlLoading_21a963bbb7615b156d151290dc03f87a;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/ni;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_ni_shouldOverrideUrlLoading_96a38ac39b3397b2b1226b09b81156aa = safedk_ni_shouldOverrideUrlLoading_96a38ac39b3397b2b1226b09b81156aa(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading("io.presage", webView, str, safedk_ni_shouldOverrideUrlLoading_96a38ac39b3397b2b1226b09b81156aa);
        return safedk_ni_shouldOverrideUrlLoading_96a38ac39b3397b2b1226b09b81156aa;
    }

    public void safedk_ni_onReceivedError_b3913c85649882e75adbb71b44d1b78e(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String obj = error.getDescription().toString();
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        a("WEBVIEW", errorCode, obj, url);
    }

    public WebResourceResponse safedk_ni_shouldInterceptRequest_e55f05cc1bfe7a81f2b726bf4ba4a695(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(view, uri);
    }

    public boolean safedk_ni_shouldOverrideUrlLoading_96a38ac39b3397b2b1226b09b81156aa(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        a8 a8Var = (a8) this;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        y7 y7Var = a8Var.d;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        w6 mraidCommandExecutor = y7Var.getMraidCommandExecutor();
        mraidCommandExecutor.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        b8.a(mraidCommandExecutor.a, x6.a(url));
        z7 z7Var = a8Var.e;
        if (z7Var != null) {
            return z7Var.d(view, url);
        }
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return true;
    }
}
