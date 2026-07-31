package com.google.android.gms.ads.h5;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrr;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@RequiresApi
/* loaded from: classes5.dex */
public final class H5AdsWebViewClient extends zzbre {
    private final zzbrr zza;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.zza = new zzbrr(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    @NonNull
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.h, view, url);
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

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }
}
