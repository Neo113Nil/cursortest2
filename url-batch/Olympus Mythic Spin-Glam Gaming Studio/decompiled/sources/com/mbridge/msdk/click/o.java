package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.B5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;

/* compiled from: WebViewSpider.java */
/* loaded from: classes14.dex */
public class o {
    private static final String r = "o";
    private int a;
    private int b;
    private com.mbridge.msdk.setting.g d;
    private f e;
    private String f;
    private String g;
    private WebView h;
    private boolean i;
    private String j;
    private int k;
    private boolean m;
    boolean n;
    boolean o;
    private boolean l = false;
    private final Runnable p = new d();
    private final Runnable q = new e();
    private Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: WebViewSpider.java */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        a(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.a, this.b, this.c, oVar.f);
        }
    }

    /* compiled from: WebViewSpider.java */
    class b extends WebViewClient {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        b(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.o, webView, str);
            safedk_o$b_onPageStarted_28ccb49a9a20d13d6cc83746920eacc8(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.o, webView, i, str, str2);
            safedk_o$b_onReceivedError_855435f363a40a01a5eee5477370e2c8(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.c).a(this.b, this.a, webView.getUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.r) {
                    o.this.m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.e != null) {
                    o.this.e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                q0.b(o.r, th.getMessage());
                return true;
            }
        }

        public void safedk_o$b_onPageStarted_28ccb49a9a20d13d6cc83746920eacc8(WebView p0, String p1, Bitmap p2) {
            try {
                MintegralNetworkBridge.webviewLoadUrl(p0, "javascript:window.navigator.vibrate([]);");
                if (o.this.m) {
                    o.this.k = 0;
                    o.this.f();
                    return;
                }
                o.this.o = false;
                if (p0.getTag() == null) {
                    p0.setTag("has_first_started");
                } else {
                    o.this.n = true;
                }
                synchronized (o.r) {
                    try {
                        o.this.f = p1;
                        if (o.this.e == null || !o.this.e.a(p1)) {
                            o.this.h();
                        } else {
                            o.this.m = true;
                            o.this.f();
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void safedk_o$b_onReceivedError_855435f363a40a01a5eee5477370e2c8(WebView p0, int p1, String p2, String p3) {
            String p32 = o.r;
            synchronized (p32) {
                o.this.m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.e != null) {
                o.this.e.a(p1, p0.getUrl(), p2, o.this.j);
            }
        }

        public boolean safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(WebView p0, String p1) {
            synchronized (o.r) {
                try {
                    o oVar = o.this;
                    oVar.o = true;
                    oVar.c();
                    if (o.this.m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f = p1;
                    if (o.this.e != null && o.this.e.c(p1)) {
                        o.this.m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.i) {
                        HashMap hashMap = new HashMap();
                        if (o.this.h.getUrl() != null) {
                            hashMap.put("Referer", o.this.h.getUrl());
                        }
                        MintegralNetworkBridge.webviewLoadUrl(o.this.h, p1, hashMap);
                    } else {
                        WebView p02 = o.this.h;
                        MintegralNetworkBridge.webviewLoadUrl(p02, p1);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2 = safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.o, webView, str, safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2);
            return safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2;
        }
    }

    /* compiled from: WebViewSpider.java */
    class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$c;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z");
            boolean safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd = safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd(webView, str, str2, str3, jsPromptResult);
            BrandSafetyUtils.onJsPrompt(com.safedk.android.utils.h.o, webView, str, str2, safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd);
            return safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                try {
                    MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
                    if (!o.this.m) {
                        o oVar = o.this;
                        if (!oVar.o) {
                            oVar.g();
                        }
                    }
                    if (o.this.e != null) {
                        o.this.e.b(webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public boolean safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd(WebView p0, String p1, String p2, String p3, JsPromptResult p4) {
            return true;
        }
    }

    /* compiled from: WebViewSpider.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.k = 1;
            o.this.e();
        }
    }

    /* compiled from: WebViewSpider.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.k = 2;
            o.this.e();
        }
    }

    /* compiled from: WebViewSpider.java */
    interface f {
        void a(int i, String str, String str2, String str3);

        void a(String str, boolean z, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.a = 15000;
        this.b = 3000;
        com.mbridge.msdk.setting.g f2 = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        this.d = f2;
        if (f2 == null) {
            this.d = com.mbridge.msdk.setting.i.b().a();
        }
        this.i = this.d.O0();
        this.a = (int) this.d.u0();
        this.b = (int) this.d.u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.c.removeCallbacks(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.c.removeCallbacks(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (r) {
            try {
                try {
                    b();
                    this.h.destroy();
                    f fVar = this.e;
                    if (fVar != null) {
                        fVar.a(this.f, this.l, this.j);
                    }
                } catch (Exception e2) {
                    q0.b(r, e2.getMessage());
                } catch (Throwable th) {
                    q0.b(r, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.e;
                        if (fVar != null) {
                            fVar.a(this.f, this.l, this.j);
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    q0.b(r, e2.getMessage());
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.c.postDelayed(this.p, this.b);
    }

    private void j() {
        this.c.postDelayed(this.q, this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.g = str4;
            this.f = str3;
            this.e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f = str3;
            this.e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f);
        } else {
            this.c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.g)) {
                this.h.getSettings().setDefaultTextEncodingName(B5.O);
                this.b = 2000;
                this.a = 2000;
                q0.c(r, this.g);
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.h, str3, this.g, "*/*", B5.O, str3);
                return;
            }
            if (this.i) {
                HashMap hashMap = new HashMap();
                if (this.h.getUrl() != null) {
                    hashMap.put("Referer", this.h.getUrl());
                }
                MintegralNetworkBridge.webviewLoadUrl(this.h, str3, hashMap);
                return;
            }
            MintegralNetworkBridge.webviewLoadUrl(this.h, str3);
        } catch (Throwable th) {
            try {
                f fVar = this.e;
                if (fVar != null) {
                    fVar.a(0, this.f, th.getMessage(), this.j);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.h.getSettings().setCacheMode(2);
        this.h.getSettings().setLoadsImagesAutomatically(false);
        this.h.setWebViewClient(new b(str2, str, context));
        MintegralNetworkBridge.webviewSetWebChromeClient(this.h, new c());
    }
}
