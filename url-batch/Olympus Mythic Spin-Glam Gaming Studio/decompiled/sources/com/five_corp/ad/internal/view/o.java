package com.five_corp.ad.internal.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: classes15.dex */
public final class o extends WebViewClient {
    public final /* synthetic */ com.five_corp.ad.internal.layouter.d a;

    public o(com.five_corp.ad.internal.layouter.d dVar) {
        this.a = dVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("com.five_corp.ad", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted("com.five_corp.ad", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError("com.five_corp.ad", view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        StringBuilder sb = new StringBuilder("onRenderProcessGone, didCrash:");
        didCrash = renderProcessGoneDetail.didCrash();
        sb.append(didCrash);
        sb.append(", rendererPriorityAtExit: ");
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        sb.append(rendererPriorityAtExit);
        String sb2 = sb.toString();
        com.five_corp.ad.internal.layouter.d dVar = this.a;
        dVar.g.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.T6, sb2, null));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.five_corp.ad.internal.view.o$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                H.a(webView);
            }
        });
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.five_corp.ad", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.five_corp.ad", view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }
}
