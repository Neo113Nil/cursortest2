package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbrr extends zzbre {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbrr(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzguk.zzb(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbrq
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final /* synthetic */ void onH5AdsEvent(String str) {
                int i = zzbrr.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbrr;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzbrr_onLoadResource_1e9524e233670c18dc2669621e16df98(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(h.h, view, errorCode, description, failingUrl);
    }

    public void safedk_zzbrr_onLoadResource_1e9524e233670c18dc2669621e16df98(WebView p0, String p1) {
        if (zzc(p0) && !this.zzc.handleH5AdsRequest(p1)) {
            super.onLoadResource(p0, p1);
        }
    }

    @RequiresApi
    public boolean safedk_zzbrr_shouldOverrideUrlLoading_98cf0cf56eb14000ae52373a29c45cf0(WebView p0, WebResourceRequest p1) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p1.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @RequiresApi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbrr;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzbrr_shouldOverrideUrlLoading_98cf0cf56eb14000ae52373a29c45cf0 = safedk_zzbrr_shouldOverrideUrlLoading_98cf0cf56eb14000ae52373a29c45cf0(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zzbrr_shouldOverrideUrlLoading_98cf0cf56eb14000ae52373a29c45cf0);
        return safedk_zzbrr_shouldOverrideUrlLoading_98cf0cf56eb14000ae52373a29c45cf0;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbrr;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzbrr_shouldOverrideUrlLoading_656adcb52b1011126a8a0d0b50d6c4e5 = safedk_zzbrr_shouldOverrideUrlLoading_656adcb52b1011126a8a0d0b50d6c4e5(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzbrr_shouldOverrideUrlLoading_656adcb52b1011126a8a0d0b50d6c4e5);
        return safedk_zzbrr_shouldOverrideUrlLoading_656adcb52b1011126a8a0d0b50d6c4e5;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@Nullable WebViewClient webViewClient) {
        zzguk.zzb(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public boolean safedk_zzbrr_shouldOverrideUrlLoading_656adcb52b1011126a8a0d0b50d6c4e5(WebView p0, String p1) {
        if (!zzc(p0)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p1)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
