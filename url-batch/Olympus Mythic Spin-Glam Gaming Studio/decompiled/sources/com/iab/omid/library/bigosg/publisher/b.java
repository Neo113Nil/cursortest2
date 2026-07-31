package com.iab.omid.library.bigosg.publisher;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.internal.g;
import com.iab.omid.library.bigosg.internal.h;
import com.iab.omid.library.bigosg.utils.f;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
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

        @RequiresApi
        public boolean safedk_b$a_shouldOverrideUrlLoading_7c8043f66479ff54b98faab60962ffc0(WebView p0, WebResourceRequest p1) {
            return com.iab.omid.library.bigosg.webviewclient.a.a(p1.getUrl().toString());
        }

        public boolean safedk_b$a_shouldOverrideUrlLoading_9e3c0c6ac43d48a543ef98c104925366(WebView p0, String p1) {
            return com.iab.omid.library.bigosg.webviewclient.a.a(p1);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/publisher/b$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_b$a_shouldOverrideUrlLoading_7c8043f66479ff54b98faab60962ffc0 = safedk_b$a_shouldOverrideUrlLoading_7c8043f66479ff54b98faab60962ffc0(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, webResourceRequest, safedk_b$a_shouldOverrideUrlLoading_7c8043f66479ff54b98faab60962ffc0);
            return safedk_b$a_shouldOverrideUrlLoading_7c8043f66479ff54b98faab60962ffc0;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/bigosg/publisher/b$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_b$a_shouldOverrideUrlLoading_9e3c0c6ac43d48a543ef98c104925366 = safedk_b$a_shouldOverrideUrlLoading_9e3c0c6ac43d48a543ef98c104925366(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, str, safedk_b$a_shouldOverrideUrlLoading_9e3c0c6ac43d48a543ef98c104925366);
            return safedk_b$a_shouldOverrideUrlLoading_9e3c0c6ac43d48a543ef98c104925366;
        }
    }

    /* renamed from: com.iab.omid.library.bigosg.publisher.b$b, reason: collision with other inner class name */
    class C0275b extends WebViewClient {
        C0275b() {
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
        renderProcessGoneDetail.toString();
        Objects.toString(webView);
        if (getWebView() == webView) {
            a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean a(boolean z, Context context) {
        return !z && com.iab.omid.library.bigosg.attestation.c.a(context).b();
    }

    private WebViewClient c(boolean z) {
        return z ? k() : j();
    }

    private WebViewClient j() {
        return new C0275b();
    }

    private WebViewClient k() {
        return new a();
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bigosg.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.bigosg.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
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
        this.g.setWebViewClient(c(a(com.iab.omid.library.bigosg.attestation.g.a(this.g), a2)));
        a(this.g);
        h.a().c(this.g, this.j);
        for (String str : this.i.keySet()) {
            h.a().d(this.g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.h = Long.valueOf(f.b());
    }
}
