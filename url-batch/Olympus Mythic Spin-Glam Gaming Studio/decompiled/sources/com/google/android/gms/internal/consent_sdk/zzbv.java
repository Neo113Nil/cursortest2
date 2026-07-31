package com.google.android.gms.internal.consent_sdk;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes14.dex */
final class zzbv extends WebViewClient {
    final /* synthetic */ zzbx zza;

    /* synthetic */ zzbv(zzbx zzbxVar, zzbw zzbwVar) {
        Objects.requireNonNull(zzbxVar);
        this.zza = zzbxVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbv;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzbv_onLoadResource_7cc938fa51001196d269296558e10711(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        zzbx zzbxVar = this.zza;
        z = zzbxVar.zzc;
        if (z) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbxVar.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbv;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zzbv_onReceivedError_1a496a61b325a528c0a8a8150c197428(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        if (webView == null) {
            return true;
        }
        didCrash = renderProcessGoneDetail.didCrash();
        String str = true != didCrash ? "was stopped by system" : "crashed";
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + rendererPriorityAtExit);
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    public void safedk_zzbv_onLoadResource_7cc938fa51001196d269296558e10711(WebView p0, String p1) {
        zzcd zzcdVar;
        zzbx zzbxVar = this.zza;
        if (zzbx.zzf(zzbxVar, p1)) {
            zzcdVar = zzbxVar.zzb;
            zzcdVar.zze(p1);
        }
    }

    public void safedk_zzbv_onReceivedError_1a496a61b325a528c0a8a8150c197428(WebView p0, int p1, String p2, String p3) {
        zzcd zzcdVar;
        zzcdVar = this.zza.zzb;
        zzcdVar.zzf(p1, p2, p3);
    }

    @RequiresApi
    public boolean safedk_zzbv_shouldOverrideUrlLoading_e3bc2984008052afa600fb51189cbb3f(WebView p0, WebResourceRequest p1) {
        zzcd zzcdVar;
        String uri = p1.getUrl().toString();
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, uri)) {
            return false;
        }
        zzcdVar = zzbxVar.zzb;
        zzcdVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbv;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzbv_shouldOverrideUrlLoading_e3bc2984008052afa600fb51189cbb3f = safedk_zzbv_shouldOverrideUrlLoading_e3bc2984008052afa600fb51189cbb3f(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zzbv_shouldOverrideUrlLoading_e3bc2984008052afa600fb51189cbb3f);
        return safedk_zzbv_shouldOverrideUrlLoading_e3bc2984008052afa600fb51189cbb3f;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbv;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzbv_shouldOverrideUrlLoading_7d983c5bb13e789a549837f9a3506678 = safedk_zzbv_shouldOverrideUrlLoading_7d983c5bb13e789a549837f9a3506678(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzbv_shouldOverrideUrlLoading_7d983c5bb13e789a549837f9a3506678);
        return safedk_zzbv_shouldOverrideUrlLoading_7d983c5bb13e789a549837f9a3506678;
    }

    public boolean safedk_zzbv_shouldOverrideUrlLoading_7d983c5bb13e789a549837f9a3506678(WebView p0, String p1) {
        zzcd zzcdVar;
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, p1)) {
            return false;
        }
        zzcdVar = zzbxVar.zzb;
        zzcdVar.zze(p1);
        return true;
    }
}
