package com.iab.omid.library.ogury.publisher;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.iab.omid.library.ogury.adsession.AdSessionContext;
import com.iab.omid.library.ogury.adsession.VerificationScriptResource;
import com.iab.omid.library.ogury.internal.g;
import com.iab.omid.library.ogury.internal.h;
import com.iab.omid.library.ogury.utils.f;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {
    private WebView g;
    private Long h;
    private final Map<String, VerificationScriptResource> i;
    private final String j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.iab.omid.library", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted("com.iab.omid.library", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }

        public boolean safedk_b$a_shouldOverrideUrlLoading_68535b6eb58fd027163e4d8476125ae0(WebView p0, String p1) {
            return com.iab.omid.library.ogury.webviewclient.a.a(p1);
        }

        @RequiresApi
        public boolean safedk_b$a_shouldOverrideUrlLoading_e68fa1cfe1e1bce22168a4b6a9e422aa(WebView p0, WebResourceRequest p1) {
            return com.iab.omid.library.ogury.webviewclient.a.a(p1.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/publisher/b$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_b$a_shouldOverrideUrlLoading_e68fa1cfe1e1bce22168a4b6a9e422aa = safedk_b$a_shouldOverrideUrlLoading_e68fa1cfe1e1bce22168a4b6a9e422aa(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, webResourceRequest, safedk_b$a_shouldOverrideUrlLoading_e68fa1cfe1e1bce22168a4b6a9e422aa);
            return safedk_b$a_shouldOverrideUrlLoading_e68fa1cfe1e1bce22168a4b6a9e422aa;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/ogury/publisher/b$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_b$a_shouldOverrideUrlLoading_68535b6eb58fd027163e4d8476125ae0 = safedk_b$a_shouldOverrideUrlLoading_68535b6eb58fd027163e4d8476125ae0(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, str, safedk_b$a_shouldOverrideUrlLoading_68535b6eb58fd027163e4d8476125ae0);
            return safedk_b$a_shouldOverrideUrlLoading_68535b6eb58fd027163e4d8476125ae0;
        }
    }

    /* renamed from: com.iab.omid.library.ogury.publisher.b$b, reason: collision with other inner class name */
    class C0315b extends WebViewClient {
        C0315b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.iab.omid.library", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted("com.iab.omid.library", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }
    }

    class c implements Runnable {
        private final WebView a;

        c() {
            this.a = b.this.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (getWebView() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean a(boolean z, Context context) {
        return !z && com.iab.omid.library.ogury.attestation.c.a(context).b();
    }

    private WebViewClient c(boolean z) {
        return z ? k() : j();
    }

    private WebViewClient j() {
        return new C0315b();
    }

    private WebViewClient k() {
        return new a();
    }

    @Override // com.iab.omid.library.ogury.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ogury.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.ogury.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.ogury.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // com.iab.omid.library.ogury.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        l();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void l() {
        Context a2 = g.b().a();
        WebView webView = new WebView(a2);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(c(a(com.iab.omid.library.ogury.attestation.g.a(this.g), a2)));
        a(this.g);
        h.a().c(this.g, this.j);
        for (String str : this.i.keySet()) {
            h.a().d(this.g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.h = Long.valueOf(f.b());
    }
}
