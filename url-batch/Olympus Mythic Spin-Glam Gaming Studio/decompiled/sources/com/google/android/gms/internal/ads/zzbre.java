package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
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
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbre extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.doUpdateVisitedHistory(webView, str, z);
    }

    @Nullable
    protected abstract WebViewClient getDelegate();

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzbre_onLoadResource_941934597e07c21852ba95b6f4ff78ee(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.h, webView, str);
        safedk_zzbre_onPageStarted_5597d94aa3807b01013226dd0e6d0074(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zzbre_onReceivedError_473d535c4b32ec60f54879d87496baf1(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, webResourceRequest, webResourceError);
        safedk_zzbre_onReceivedError_94bd303594917f6cb5c3022d075faded(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        onRenderProcessGone = delegate.onRenderProcessGone(webView, renderProcessGoneDetail);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_zzbre_onLoadResource_941934597e07c21852ba95b6f4ff78ee(WebView p0, String p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onLoadResource(p0, p1);
    }

    public void safedk_zzbre_onPageStarted_5597d94aa3807b01013226dd0e6d0074(WebView p0, String p1, Bitmap p2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageStarted(p0, p1, p2);
    }

    public void safedk_zzbre_onReceivedError_473d535c4b32ec60f54879d87496baf1(WebView p0, int p1, String p2, String p3) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(p0, p1, p2, p3);
    }

    @Nullable
    public WebResourceResponse safedk_zzbre_shouldInterceptRequest_090325a62e1ce243fda7c44f9c8fa53a(WebView p0, WebResourceRequest p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(p0, p1);
    }

    @RequiresApi
    public boolean safedk_zzbre_shouldOverrideUrlLoading_f51e1c62078a41e144d11806c22dcd84(WebView p0, WebResourceRequest p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, webView, webResourceRequest, safedk_zzbre_shouldInterceptRequest_090325a62e1ce243fda7c44f9c8fa53a(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.h, webView, str, safedk_zzbre_shouldInterceptRequest_87d960e0b5022db8d50ddc22b9ded8ad(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzbre_shouldOverrideUrlLoading_f51e1c62078a41e144d11806c22dcd84 = safedk_zzbre_shouldOverrideUrlLoading_f51e1c62078a41e144d11806c22dcd84(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zzbre_shouldOverrideUrlLoading_f51e1c62078a41e144d11806c22dcd84);
        return safedk_zzbre_shouldOverrideUrlLoading_f51e1c62078a41e144d11806c22dcd84;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbre;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzbre_shouldOverrideUrlLoading_e2f97e834818e33d4a10b99c89edd977 = safedk_zzbre_shouldOverrideUrlLoading_e2f97e834818e33d4a10b99c89edd977(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzbre_shouldOverrideUrlLoading_e2f97e834818e33d4a10b99c89edd977);
        return safedk_zzbre_shouldOverrideUrlLoading_e2f97e834818e33d4a10b99c89edd977;
    }

    public void safedk_zzbre_onReceivedError_94bd303594917f6cb5c3022d075faded(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(p0, p1, p2);
    }

    @Nullable
    public WebResourceResponse safedk_zzbre_shouldInterceptRequest_87d960e0b5022db8d50ddc22b9ded8ad(WebView p0, String p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zzbre_shouldOverrideUrlLoading_e2f97e834818e33d4a10b99c89edd977(WebView p0, String p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(p0, p1);
    }
}
