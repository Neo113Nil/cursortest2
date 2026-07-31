package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public class zzcna extends zzcmz {
    public zzcna(zzclm zzclmVar, zzbif zzbifVar, boolean z, @Nullable zzelp zzelpVar) {
        super(zzclmVar, zzbifVar, z, zzelpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmz, com.google.android.gms.internal.ads.zzclx, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Nullable
    public WebResourceResponse safedk_zzcna_shouldInterceptRequest_ccdcafb855c404312f3d40cd9af0d134(WebView p0, WebResourceRequest p1) {
        if (p1 == null || p1.getUrl() == null) {
            return null;
        }
        return zzac(p0, p1.getUrl().toString(), p1.getRequestHeaders());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcna;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, webView, webResourceRequest, safedk_zzcna_shouldInterceptRequest_ccdcafb855c404312f3d40cd9af0d134(webView, webResourceRequest));
    }
}
