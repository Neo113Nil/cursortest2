package com.mbridge.msdk.mbsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* compiled from: WindVaneWebViewClient.java */
/* loaded from: classes4.dex */
public class k extends com.mbridge.msdk.mbsignalcommon.base.b {
    protected String c = null;
    private int d = 0;
    private c e;

    @RequiresApi
    private WebResourceResponse a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !i.e(str)) {
                return null;
            }
            q0.c("WindVaneWebViewClient", "is image " + str);
            Bitmap b = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str);
            q0.c("WindVaneWebViewClient", "find image from cache " + str);
            if (b == null || b.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(i.b(str), B5.O, com.mbridge.msdk.foundation.same.image.a.a(b));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.o, view, url);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/windvane/k;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.o, webView, str);
        safedk_k_onPageStarted_02e4e32ed4cead242fa20ba0acc0a170(webView, str, bitmap);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.o, view, errorCode, description, failingUrl);
    }

    public void safedk_k_onPageStarted_02e4e32ed4cead242fa20ba0acc0a170(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        this.c = p1;
        c cVar = this.e;
        if (cVar != null) {
            cVar.onPageStarted(p0, p1, p2);
        }
    }

    @TargetApi(11)
    public WebResourceResponse safedk_k_shouldInterceptRequest_ea33cd8cea7780c2ad8461786cf124f9(WebView p0, String p1) {
        WebResourceResponse a = a(p1);
        if (a == null) {
            return super.shouldInterceptRequest(p0, p1);
        }
        q0.c("WindVaneWebViewClient", "find WebResourceResponse url is " + p1);
        return a;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/windvane/k;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.o, webView, str, safedk_k_shouldInterceptRequest_ea33cd8cea7780c2ad8461786cf124f9(webView, str));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.o, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }
}
