package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class b extends WebViewClient {
    public static final String[] c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a a;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a b;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/storepromo/controller/webview/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.p, webView, i, str, str2);
        safedk_b_onReceivedError_a18dc1f4ba42489cfda0260d5062d592(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/storepromo/controller/webview/b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.p, webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_5add5806d70aa336d58203a5285b9aeb(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    public void safedk_b_onReceivedError_a18dc1f4ba42489cfda0260d5062d592(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", p2, Integer.valueOf(p1), p3);
        if (a(p3)) {
            return;
        }
        String str = p2 + " errCode: " + p1;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(p3)) {
            p3 = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str, p3);
        }
    }

    public boolean safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453(WebView p0, String p1) {
        IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", p1);
        Uri parse = Uri.parse(p1);
        if (parse == null || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority()) || TextUtils.isEmpty(parse.getHost()) || !"FyRemote://".toLowerCase().contains(parse.getScheme())) {
            return true;
        }
        HashMap a = h0.a(parse);
        String host = parse.getHost();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.a;
        if (aVar == null) {
            return true;
        }
        aVar.a(host, a);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/storepromo/controller/webview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453 = safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.p, webView, str, safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453);
        return safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453;
    }

    public final void a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str2 = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            if (renderProcessGoneDetail != null) {
                didCrash = renderProcessGoneDetail.didCrash();
                str2 = String.valueOf(didCrash);
            }
            IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", str2, str);
        } else {
            IAlog.a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        String str3 = "Webview did crash: " + str2 + " on webview: " + str;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, null);
        }
    }

    public static boolean a(String str) {
        s sVar;
        if (str == null || (sVar = IAConfigManager.N.t) == null) {
            return false;
        }
        o oVar = sVar.b;
        String[] strArr = c;
        String a = oVar.a("font_urls", (String) null);
        if (a != null) {
            try {
                JSONArray jSONArray = new JSONArray(a);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr2[i] = jSONArray.getString(i);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    public void safedk_b_onReceivedError_5add5806d70aa336d58203a5285b9aeb(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        int i;
        String str;
        super.onReceivedError(p0, p1, p2);
        String str2 = "";
        if (p2 != null) {
            if (p2.getDescription() != null) {
                str2 = p2.getDescription().toString();
            }
            i = p2.getErrorCode();
        } else {
            i = -999;
        }
        if (p1 != null && p1.getUrl() != null) {
            str = p1.getUrl().toString();
        } else {
            str = "unknown";
        }
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str2, Integer.valueOf(i), str);
        if (a(str)) {
            return;
        }
        String str3 = str2 + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(str)) {
            str = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, str);
        }
    }
}
