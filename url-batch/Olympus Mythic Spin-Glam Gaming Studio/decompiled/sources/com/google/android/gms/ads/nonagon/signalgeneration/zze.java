package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
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
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzhdi;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zze extends zzbre {
    private final zza zza;
    private final Executor zzb;
    private final Object zzc = new Object();

    @Nullable
    private Future zzd;

    @Nullable
    private WebViewClient zze;

    @Nullable
    @GuardedBy
    private WebView zzf;

    public zze(WebView webView, zza zzaVar, @UiThread zzhdi zzhdiVar) {
        this.zzf = webView;
        this.zza = zzaVar;
        this.zzb = zzhdiVar;
    }

    private final void zzd() {
        synchronized (this.zzc) {
            try {
                WebView webView = this.zzf;
                if (webView == null) {
                    return;
                }
                webView.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlt), this.zza.zzb()), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zze() {
        if (!((Boolean) zzblm.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(zze.class.getName())) {
                if (z && z2) {
                    return true;
                }
                z = true;
            } else if (z) {
                z2 = true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (zze()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    @Nullable
    protected final WebViewClient getDelegate() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (zze()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zze_onLoadResource_f4722f9fe0b2142ed6aa089c82b259cb(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (zze()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (zze()) {
            return;
        }
        zzd();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.h, webView, str);
        safedk_zze_onPageStarted_33185888fa278770355e6f95cb8ab86f(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (zze()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zze_onReceivedError_fd1fa16d565ff6e229772dfef04eb7a8(webView, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, webResourceRequest, webResourceError);
        safedk_zze_onReceivedError_e05b900f3c640425cedda24f0a4f029a(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (zze()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (zze()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        if (zze()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (zze()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @RequiresApi
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!zze()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        synchronized (this.zzc) {
            try {
                WebView webView2 = this.zzf;
                if (webView2 != null) {
                    webView2.setWebViewClient(new WebViewClient());
                    this.zzf = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Future future = this.zzd;
        if (future == null) {
            return true;
        }
        future.cancel(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @RequiresApi
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (zze()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (zze()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (zze()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zze()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_zze_onLoadResource_f4722f9fe0b2142ed6aa089c82b259cb(WebView p0, String p1) {
        if (zze()) {
            return;
        }
        super.onLoadResource(p0, p1);
    }

    public void safedk_zze_onPageStarted_33185888fa278770355e6f95cb8ab86f(WebView p0, String p1, Bitmap p2) {
        if (zze()) {
            return;
        }
        zzd();
        super.onPageStarted(p0, p1, p2);
    }

    public void safedk_zze_onReceivedError_fd1fa16d565ff6e229772dfef04eb7a8(WebView p0, int p1, String p2, String p3) {
        if (zze()) {
            return;
        }
        super.onReceivedError(p0, p1, p2, p3);
    }

    @Nullable
    public WebResourceResponse safedk_zze_shouldInterceptRequest_e4d730c43b5dda1bc53fbbef5c192fd7(WebView p0, WebResourceRequest p1) {
        if (zze()) {
            return null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    @RequiresApi
    public boolean safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9(WebView p0, WebResourceRequest p1) {
        if (zze()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, webView, webResourceRequest, safedk_zze_shouldInterceptRequest_e4d730c43b5dda1bc53fbbef5c192fd7(webView, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.h, webView, str, safedk_zze_shouldInterceptRequest_d2b5ecb9c148c2b38763420852f2fcd9(webView, str));
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zze()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @RequiresApi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9 = safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9);
        return safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16 = safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16);
        return safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16;
    }

    public final void zza() {
        this.zzd = zzcgj.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zze.this.zzb();
            }
        }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzls)).intValue(), TimeUnit.MILLISECONDS);
    }

    public final void zzb() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zze.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        WebViewClient webViewClient;
        synchronized (this.zzc) {
            WebView webView = this.zzf;
            if (webView == null) {
                return;
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (Build.VERSION.SDK_INT < 26) {
                    if (WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT")) {
                        try {
                            webViewClient = WebViewCompat.getWebViewClient(webView);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.getWebViewClient");
                        }
                    }
                    throw new IllegalStateException("getWebViewClient not supported");
                }
                webViewClient = webView.getWebViewClient();
                if (webViewClient == this) {
                    return;
                }
                if (webViewClient != null) {
                    this.zze = webViewClient;
                }
                webView.setWebViewClient(this);
                zzd();
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void safedk_zze_onReceivedError_e05b900f3c640425cedda24f0a4f029a(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        if (zze()) {
            return;
        }
        super.onReceivedError(p0, p1, p2);
    }

    @Nullable
    public WebResourceResponse safedk_zze_shouldInterceptRequest_d2b5ecb9c148c2b38763420852f2fcd9(WebView p0, String p1) {
        if (zze()) {
            return null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16(WebView p0, String p1) {
        if (zze()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
