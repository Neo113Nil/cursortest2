package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.B5;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;
import org.slf4j.Marker;

/* compiled from: NativeAdvancedWebViewClient.java */
/* loaded from: classes12.dex */
public class a extends b {
    private final String c = "NativeAdvancedWebViewClient";
    private final String d;
    private final String e;
    String f;
    com.mbridge.msdk.advanced.middle.a g;
    private c h;

    /* compiled from: NativeAdvancedWebViewClient.java */
    /* renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    class C1389a implements ValueCallback<String> {
        C1389a() {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.d = e.b(cVar2) != null ? e.b(cVar2) : k0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.e = k0.a("Y+xgWkl2");
        this.f = str;
        this.g = aVar;
        this.h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.h != null) {
            try {
                String str2 = "";
                if (str.startsWith("file") && str.startsWith(this.d)) {
                    str2 = str.replace("file://", "");
                }
                if (a(str)) {
                    str2 = this.h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter(ShareConstants.MEDIA_URI)));
                }
                if (!TextUtils.isEmpty(str2) && a(str2, this.d)) {
                    q0.a("NativeAdvancedWebViewClient", "replace url : " + str2);
                    if (!str2.contains("127.0.0.1") && !str2.startsWith("http")) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
                        WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", B5.O, new FileInputStream(str2));
                        webResourceResponse.setResponseHeaders(hashMap);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th) {
                q0.b("NativeAdvancedWebViewClient", th.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.h != null) {
            this.h = null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.o, view, url);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.o, webView, str);
        safedk_a_onPageStarted_0d1a3c6a21900a20a8eabbc7d3b03e91(webView, str, bitmap);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(h.o, view, errorCode, description, failingUrl);
    }

    public void safedk_a_onPageStarted_0d1a3c6a21900a20a8eabbc7d3b03e91(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        try {
            String p12 = "javascript:" + com.mbridge.msdk.setting.util.a.a().b();
            p0.evaluateJavascript(p12, new C1389a());
        } catch (Throwable th) {
            q0.b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    @Nullable
    public WebResourceResponse safedk_a_shouldInterceptRequest_f98edc53b84eb6cd8b74482c601d3e96(WebView p0, String p1) {
        return a(p0, p1);
    }

    public boolean safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee(WebView p0, String p1) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) p0;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.d) {
                    if (com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.b)) {
                        return false;
                    }
                }
            } catch (Exception e) {
                q0.b("NativeAdvancedWebViewClient", e.getMessage());
            }
            q0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, p1);
            return true;
        } catch (Throwable th) {
            q0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.o, webView, webResourceRequest, safedk_a_shouldInterceptRequest_760d8c02192100f041c6f359c7ace52c(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.o, webView, str, safedk_a_shouldInterceptRequest_f98edc53b84eb6cd8b74482c601d3e96(webView, str));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee = safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.o, webView, str, safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee);
        return safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee;
    }

    @Nullable
    public WebResourceResponse safedk_a_shouldInterceptRequest_760d8c02192100f041c6f359c7ace52c(WebView p0, WebResourceRequest p1) {
        return a(p0, p1.getUrl().toString());
    }

    private boolean a(String str) {
        Uri parse;
        String scheme;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (scheme = parse.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.e) || scheme.equals("mb-h5");
    }
}
