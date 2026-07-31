package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes5.dex */
public final class m0 extends WebViewClient {
    public final /* synthetic */ v0 a;

    public m0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.p, view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Activity activity = (Activity) com.fyber.inneractive.sdk.util.v.a(this.a.q);
        if (activity != null) {
            activity.finish();
        }
        com.fyber.inneractive.sdk.util.r.b.postDelayed(new l0(this), 1000L);
        return true;
    }

    public boolean safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02(WebView p0, String p1) {
        if (p1.endsWith("success")) {
            v0 v0Var = this.a;
            n0 n0Var = v0Var.p;
            if (n0Var != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(n0Var);
                v0Var.p = null;
            }
            v0 v0Var2 = this.a;
            v0Var2.getClass();
            IAlog.a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.a(v0Var2), Long.valueOf(System.currentTimeMillis() - this.a.o));
            this.a.l = true;
            return true;
        }
        if (!p1.startsWith("exit")) {
            return false;
        }
        Activity activity = (Activity) com.fyber.inneractive.sdk.util.v.a(this.a.q);
        if (activity == null) {
            return true;
        }
        try {
            Uri parse = Uri.parse(p1);
            String queryParameter = parse.getQueryParameter("target");
            boolean equals = TextUtils.equals("mail", parse.getAuthority());
            Intent intent = new Intent(equals ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", Uri.parse(queryParameter));
            if (equals) {
                intent = Intent.createChooser(intent, "Choose an application");
            }
            com.fyber.inneractive.sdk.util.h0.a(activity, intent);
        } catch (Throwable th) {
            com.fyber.inneractive.sdk.network.z.a(th, null, null);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/m0;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02 = safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.p, webView, str, safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02);
        return safedk_m0_shouldOverrideUrlLoading_7aeb99688b0e69bc90d8de69d03a3f02;
    }
}
