package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4552c extends WebViewClient {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C4554e f137;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f140 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f139 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f138 = null;

    public C4552c(C4554e c4554e) {
        this.f137 = c4554e;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f137.mo3948(webView);
        this.f140 = false;
        this.f139 = true;
        if (this.f138 == null) {
            this.f138 = webView.getOriginalUrl();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/c;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
        safedk_c_onPageStarted_38a12856255089468932e3c8bd4427c1(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, view, errorCode, description, failingUrl);
    }

    public void safedk_c_onPageStarted_38a12856255089468932e3c8bd4427c1(WebView p0, String p1, Bitmap p2) {
        this.f137.mo3948(p0);
        this.f140 = true;
    }

    public boolean safedk_c_shouldOverrideUrlLoading_c2024b7929db51ae315cc3199ad4369f(WebView p0, WebResourceRequest p1) {
        return shouldOverrideUrlLoading(p0, p1.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_c2024b7929db51ae315cc3199ad4369f = safedk_c_shouldOverrideUrlLoading_c2024b7929db51ae315cc3199ad4369f(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, webResourceRequest, safedk_c_shouldOverrideUrlLoading_c2024b7929db51ae315cc3199ad4369f);
        return safedk_c_shouldOverrideUrlLoading_c2024b7929db51ae315cc3199ad4369f;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_fbc12b60bb39b67fc2d443638dc3f12b = safedk_c_shouldOverrideUrlLoading_fbc12b60bb39b67fc2d443638dc3f12b(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_c_shouldOverrideUrlLoading_fbc12b60bb39b67fc2d443638dc3f12b);
        return safedk_c_shouldOverrideUrlLoading_fbc12b60bb39b67fc2d443638dc3f12b;
    }

    public boolean safedk_c_shouldOverrideUrlLoading_fbc12b60bb39b67fc2d443638dc3f12b(WebView p0, String p1) {
        if (p1.startsWith(this.f137.f146)) {
            this.f138 = p0.getOriginalUrl();
            String p12 = p1.substring(this.f137.f146.length());
            C4554e c4554e = this.f137;
            c4554e.mo3950(p0, c4554e.f146, p12);
            return true;
        }
        if (this.f138 == null) {
            this.f138 = p0.getOriginalUrl();
        }
        this.f137.mo3951(p0, p1, (this.f140 && this.f139) || !(p0.getOriginalUrl() == null || this.f138 == null || p0.getOriginalUrl().equals(this.f138)));
        this.f139 = true;
        this.f140 = false;
        return false;
    }
}
