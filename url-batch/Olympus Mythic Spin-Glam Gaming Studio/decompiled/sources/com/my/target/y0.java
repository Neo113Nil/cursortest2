package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class y0 extends b1 {
    private final f d;
    a e;
    private h f;
    private g g;
    private boolean h;
    private boolean i;
    private d j;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(WebView webView, int i, String str, String str2);

        void a(WebView webView, String str);

        void a(String str);

        void b();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class b extends WebChromeClient {
        b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            mi.a("BannerWebView$MyWebChromeClient: JS console message " + consoleMessage.message() + " at line " + consoleMessage.lineNumber());
            return false;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface d {
        void a();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface e {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class f extends GestureDetector {
        private final View a;
        private a b;
        private e c;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        interface a {
            void a();
        }

        f(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                e eVar = this.c;
                if (eVar != null) {
                    eVar.a();
                }
                onTouchEvent(motionEvent);
                return;
            }
            if (action != 1) {
                if (action == 2 && a(motionEvent, this.a)) {
                    onTouchEvent(motionEvent);
                    return;
                }
                return;
            }
            e eVar2 = this.c;
            if (eVar2 != null) {
                eVar2.b();
            }
            if (this.b == null) {
                mi.a("BannerWebView$ViewGestureDetector: View's onUserClick() is not registered");
            } else {
                mi.a("BannerWebView$ViewGestureDetector: Gestures - user clicked");
                this.b.a();
            }
        }

        private f(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.a = view;
            setIsLongpressEnabled(false);
        }

        void a(a aVar) {
            this.b = aVar;
        }

        void a(e eVar) {
            this.c = eVar;
        }

        private boolean a(MotionEvent motionEvent, View view) {
            if (motionEvent != null && view != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x >= 0.0f && x <= view.getWidth() && y >= 0.0f && y <= view.getHeight()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface g {
        void a(WebView webView, int i, String str, String str2);

        void b(WebView webView, int i, String str, String str2);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface h {
        void a(WebView webView, String str, Bitmap bitmap);
    }

    public y0(Context context) {
        super(context);
        f fVar = new f(getContext(), this);
        this.d = fVar;
        b bVar = new b();
        c cVar = new c();
        fVar.a(new f.a() { // from class: com.my.target.y0$$ExternalSyntheticLambda1
            @Override // com.my.target.y0.f.a
            public final void a() {
                y0.this.h();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.y0$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a2;
                a2 = y0.this.a(view, motionEvent);
                return a2;
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        this.d.a(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.i = true;
    }

    public void b(String str) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    void c(String str) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.my.target.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void g() {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.my.target.y0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean a2;
                a2 = y0.a(view);
                return a2;
            }
        });
    }

    void i() {
        this.i = false;
    }

    @Override // com.my.target.b1, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.my.target.b1, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setBannerWebViewListener(@Nullable a aVar) {
        this.e = aVar;
    }

    public void setData(@NonNull String str) {
        this.h = false;
        this.i = false;
        a("https://ad.mail.ru/", str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
    }

    public void setForceMediaPlayback(boolean z) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.getSettings().setMediaPlaybackRequiresUserGesture(!z);
    }

    public void setOnLayoutListener(@Nullable d dVar) {
        this.j = dVar;
    }

    public void setUserMotionEventListener(@NonNull e eVar) {
        this.d.a(eVar);
    }

    public void setWebViewLoadingErrorListener(@NonNull g gVar) {
        this.g = gVar;
    }

    public void setWebViewLoadingStartListener(@NonNull h hVar) {
        this.f = hVar;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private final class c extends pc {
        private final List a = Arrays.asList(-2, -6);

        c() {
        }

        private boolean a(WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null) {
                return false;
            }
            String lastPathSegment = webResourceRequest.getUrl().getLastPathSegment();
            boolean z = lastPathSegment != null && lastPathSegment.endsWith(".html");
            String str = webResourceRequest.getRequestHeaders().get(com.safedk.android.utils.n.c);
            return z || (str != null && str.contains(POBCommonConstants.CONTENT_TYPE_HTML));
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.r, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            y0 y0Var = y0.this;
            if (y0Var.h) {
                return;
            }
            y0Var.h = true;
            mi.a("BannerWebView$MyWebViewClient: Page loaded");
            super.onPageFinished(webView, str);
            a aVar = y0.this.e;
            if (aVar != null) {
                aVar.a(webView, str);
            }
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/y0$c;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.r, webView, str);
            safedk_y0$c_onPageStarted_3ed4d334827d798d8816c18ae0a995a9(webView, str, bitmap);
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/y0$c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, i, str, str2);
            safedk_y0$c_onReceivedError_b43c80cb74985788e1865eb6ba0c6f11(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/y0$c;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, webResourceRequest, webResourceError);
            safedk_y0$c_onReceivedError_a0b87fd599afd9fe89280107ac959a68(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            String reasonPhrase = webResourceResponse.getReasonPhrase();
            String charSequence = reasonPhrase != null ? reasonPhrase.toString() : null;
            int statusCode = webResourceResponse.getStatusCode();
            String uri = webResourceRequest.getUrl().toString();
            if (y0.this.g == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            g gVar = y0.this.g;
            if (charSequence == null) {
                charSequence = "Unknown HTTP error";
            }
            gVar.a(webView, statusCode, charSequence, uri);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            mi.b("WebView crashed");
            a aVar = y0.this.e;
            if (aVar == null) {
                return true;
            }
            aVar.b();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            mi.a("BannerWebView$MyWebViewClient: Scale new - " + f2 + ", old - " + f);
        }

        public void safedk_y0$c_onPageStarted_3ed4d334827d798d8816c18ae0a995a9(WebView p0, String p1, Bitmap p2) {
            mi.a("BannerWebView$MyWebViewClient: Load page started");
            super.onPageStarted(p0, p1, p2);
            h hVar = y0.this.f;
            if (hVar != null) {
                hVar.a(p0, p1, p2);
            }
        }

        public void safedk_y0$c_onReceivedError_b43c80cb74985788e1865eb6ba0c6f11(WebView p0, int p1, String p2, String p3) {
            mi.a("BannerWebView$MyWebViewClient: Load failed. Error - " + p1 + ", description - " + p2 + ", url - " + p3);
            super.onReceivedError(p0, p1, p2, p3);
            a aVar = y0.this.e;
            if (aVar != null) {
                aVar.a(p0, p1, p2 != null ? p2 : "unknown JS error", p3);
            }
            g gVar = y0.this.g;
            if (gVar != null) {
                if (p2 == null) {
                    p2 = "Unknown loading error";
                }
                gVar.b(p0, p1, p2, p3);
            }
        }

        public boolean safedk_y0$c_shouldOverrideUrlLoading_995f3c1154fd075dfeb55fa6cc66f238(WebView p0, String p1) {
            y0 y0Var = y0.this;
            if (y0Var.i && p1 != null) {
                y0Var.c(p1);
                y0.this.i();
            }
            return true;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.r, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/y0$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_y0$c_shouldOverrideUrlLoading_8ff875d822cae2321d90674debf85e4b = safedk_y0$c_shouldOverrideUrlLoading_8ff875d822cae2321d90674debf85e4b(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, webResourceRequest, safedk_y0$c_shouldOverrideUrlLoading_8ff875d822cae2321d90674debf85e4b);
            return safedk_y0$c_shouldOverrideUrlLoading_8ff875d822cae2321d90674debf85e4b;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/y0$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_y0$c_shouldOverrideUrlLoading_995f3c1154fd075dfeb55fa6cc66f238 = safedk_y0$c_shouldOverrideUrlLoading_995f3c1154fd075dfeb55fa6cc66f238(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, str, safedk_y0$c_shouldOverrideUrlLoading_995f3c1154fd075dfeb55fa6cc66f238);
            return safedk_y0$c_shouldOverrideUrlLoading_995f3c1154fd075dfeb55fa6cc66f238;
        }

        public boolean safedk_y0$c_shouldOverrideUrlLoading_8ff875d822cae2321d90674debf85e4b(WebView p0, WebResourceRequest p1) {
            Uri url;
            if (!y0.this.i || (url = p1.getUrl()) == null) {
                return true;
            }
            y0.this.c(url.toString());
            y0.this.i();
            return true;
        }

        public void safedk_y0$c_onReceivedError_a0b87fd599afd9fe89280107ac959a68(WebView p0, WebResourceRequest p1, WebResourceError p2) {
            super.onReceivedError(p0, p1, p2);
            CharSequence description = p2.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = p2.getErrorCode();
            String uri = p1.getUrl().toString();
            mi.a("BannerWebView$MyWebViewClient: Load failed. Error - " + errorCode + ", description - " + charSequence + ", url - " + uri);
            a aVar = y0.this.e;
            if (aVar != null) {
                aVar.a(p0, errorCode, charSequence != null ? charSequence : "Unknown JS error", uri);
            }
            if (y0.this.g != null) {
                if (p1.isForMainFrame() || a(p1) || this.a.contains(Integer.valueOf(errorCode))) {
                    g gVar = y0.this.g;
                    if (charSequence == null) {
                        charSequence = "Unknown loading error";
                    }
                    gVar.b(p0, errorCode, charSequence, uri);
                }
            }
        }
    }
}
