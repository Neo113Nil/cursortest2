package com.inmobi.media;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: com.inmobi.media.p3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4250p3 extends WebViewClient {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ C4276q3 c;
    public final /* synthetic */ Z2 d;

    public C4250p3(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C4276q3 c4276q3, Z2 z2) {
        this.a = atomicBoolean;
        this.b = ref$ObjectRef;
        this.c = c4276q3;
        this.d = z2;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C4276q3.a(this.a, this.b, this.c, this.d, true);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/p3;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, webView, i, str, str2);
        safedk_p3_onReceivedError_de9dea7399eecc8e09eda3c6d2284b0a(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/p3;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, webView, webResourceRequest, webResourceError);
        safedk_p3_onReceivedError_9bcf8e8eb81ffe5131801269cebf2491(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        C4276q3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        C4276q3.a(this.a, this.b, this.c, this.d, false);
        return No.a(view, detail, "click_mgr");
    }

    public void safedk_p3_onReceivedError_de9dea7399eecc8e09eda3c6d2284b0a(WebView view, int p1, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        C4276q3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.i, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/p3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_p3_shouldOverrideUrlLoading_9fdd5e8324e7d32b46c6a8591794fffa = safedk_p3_shouldOverrideUrlLoading_9fdd5e8324e7d32b46c6a8591794fffa(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, webView, webResourceRequest, safedk_p3_shouldOverrideUrlLoading_9fdd5e8324e7d32b46c6a8591794fffa);
        return safedk_p3_shouldOverrideUrlLoading_9fdd5e8324e7d32b46c6a8591794fffa;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/p3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_p3_shouldOverrideUrlLoading_1246bfcef3b3e6414532fb7a471b9c2a = safedk_p3_shouldOverrideUrlLoading_1246bfcef3b3e6414532fb7a471b9c2a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, webView, str, safedk_p3_shouldOverrideUrlLoading_1246bfcef3b3e6414532fb7a471b9c2a);
        return safedk_p3_shouldOverrideUrlLoading_1246bfcef3b3e6414532fb7a471b9c2a;
    }

    public void safedk_p3_onReceivedError_9bcf8e8eb81ffe5131801269cebf2491(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        C4276q3.a(this.a, this.b, this.c, this.d, false);
    }

    public boolean safedk_p3_shouldOverrideUrlLoading_9fdd5e8324e7d32b46c6a8591794fffa(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        return (this.d.d || Intrinsics.areEqual(request.getUrl().toString(), this.d.b)) ? false : true;
    }

    public boolean safedk_p3_shouldOverrideUrlLoading_1246bfcef3b3e6414532fb7a471b9c2a(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Z2 z2 = this.d;
        return (z2.d || Intrinsics.areEqual(url, z2.b)) ? false : true;
    }
}
