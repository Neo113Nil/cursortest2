package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a extends WebViewClient {
    public final /* synthetic */ FyberReportAdActivity a;

    public a(FyberReportAdActivity fyberReportAdActivity) {
        this.a = fyberReportAdActivity;
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
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/a;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.p, webView, i, str, str2);
        safedk_a_onReceivedError_df03ec957704e5199e0fd8c9ada804c4(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        FyberReportAdActivity fyberReportAdActivity = this.a;
        if (fyberReportAdActivity.b == webView) {
            fyberReportAdActivity.b = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.a.finish();
        return true;
    }

    public void safedk_a_onReceivedError_df03ec957704e5199e0fd8c9ada804c4(WebView p0, int p1, String p2, String p3) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(p1), p2, p3);
    }

    public boolean safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a(WebView p0, String p1) {
        com.fyber.inneractive.sdk.flow.h hVar;
        if (p1 == null) {
            return false;
        }
        if (j1.a(p1)) {
            WebView p02 = this.a.b;
            if (p02 != null) {
                DTExchangeNetworkBridge.webviewLoadUrl(p02, "chrome://crash");
            }
            return true;
        }
        if (!p1.startsWith("fybermarketplace://reportAd?") || (hVar = FyberReportAdActivity.f) == null) {
            return false;
        }
        String substring = p1.substring(28);
        com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) hVar;
        w wVar = new w(u.FYBER_REPORT_AD, gVar.b, gVar.c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", substring);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "message", substring);
        }
        wVar.f.put(jSONObject);
        wVar.g = true;
        wVar.a((String) null);
        WebView p03 = this.a.b;
        if (p03 != null) {
            q0.a(p03, "reportSent();");
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a = safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.p, webView, str, safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a);
        return safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a;
    }
}
