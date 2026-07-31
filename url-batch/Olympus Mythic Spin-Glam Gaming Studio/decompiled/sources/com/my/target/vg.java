package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class vg extends b1 {
    a d;
    boolean e;
    boolean f;
    long g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(int i, String str, String str2);

        void a(String str);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class b extends WebChromeClient {
        b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            mi.a("JS Console Message at line " + consoleMessage.lineNumber() + ": " + message);
            return false;
        }
    }

    public vg(Context context) {
        super(context);
        this.g = 0L;
        b bVar = new b();
        c cVar = new c();
        new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()).setIsLongpressEnabled(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.vg$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a2;
                a2 = vg.this.a(view, motionEvent);
                return a2;
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewBackgroundColor(-16777216);
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
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g = Long.MAX_VALUE;
            mi.a("ShoppableWebView: action down");
            onTouchEvent(motionEvent);
            return false;
        }
        if (action == 1) {
            this.g = System.currentTimeMillis();
            mi.a("ShoppableWebView: action up");
            this.f = true;
            return false;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            this.g = System.currentTimeMillis();
            mi.a("ShoppableWebView: action cancel");
            return false;
        }
        mi.a("ShoppableWebView: action move");
        this.g = Long.MAX_VALUE;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x < 0.0f || x > view.getWidth() || y < 0.0f || y > view.getHeight()) {
            return false;
        }
        onTouchEvent(motionEvent);
        return false;
    }

    void b(String str) {
        this.f = false;
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.my.target.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public long getAndResetInteractionEnd() {
        long j = this.g;
        this.g = 0L;
        return j;
    }

    @Override // com.my.target.b1, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.my.target.b1, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setListener(@Nullable a aVar) {
        this.d = aVar;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private final class c extends pc {
        c() {
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.r, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            vg vgVar = vg.this;
            if (vgVar.e) {
                return;
            }
            vgVar.e = true;
            mi.a("ShoppableWebView$MyWebViewClient: page loaded");
            super.onPageFinished(webView, str);
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/vg$c;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.r, webView, str);
            safedk_vg$c_onPageStarted_a7f09d64f0e2f4afc00d58e036f8abae(webView, str, bitmap);
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/vg$c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, i, str, str2);
            safedk_vg$c_onReceivedError_2a5a7ebdb72cb27c0cb4d1339ff65403(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/vg$c;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, webResourceRequest, webResourceError);
            safedk_vg$c_onReceivedError_543142dd69320cb67d116281f2844487(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            mi.a("ShoppableWebView$MyWebViewClient: new scale - " + f2 + ", old scale - " + f);
        }

        public void safedk_vg$c_onPageStarted_a7f09d64f0e2f4afc00d58e036f8abae(WebView p0, String p1, Bitmap p2) {
            mi.a("ShoppableWebView$MyWebViewClient: page started");
            super.onPageStarted(p0, p1, p2);
        }

        public void safedk_vg$c_onReceivedError_2a5a7ebdb72cb27c0cb4d1339ff65403(WebView p0, int p1, String p2, String p3) {
            mi.a("ShoppableWebView$MyWebViewClient: load failed, error - " + p1 + ", description - " + p2 + ", url - " + p3);
            super.onReceivedError(p0, p1, p2, p3);
            a aVar = vg.this.d;
            if (aVar != null) {
                aVar.a(p1, p2, p3);
            }
        }

        public boolean safedk_vg$c_shouldOverrideUrlLoading_c1ed3134fdfaee45e8918d3f129199d0(WebView p0, String p1) {
            vg vgVar = vg.this;
            if (vgVar.f && p1 != null) {
                vgVar.b(p1);
            }
            return true;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.r, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/vg$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_vg$c_shouldOverrideUrlLoading_1576d1ca8106c9eee838ba1c40212cb0 = safedk_vg$c_shouldOverrideUrlLoading_1576d1ca8106c9eee838ba1c40212cb0(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, webResourceRequest, safedk_vg$c_shouldOverrideUrlLoading_1576d1ca8106c9eee838ba1c40212cb0);
            return safedk_vg$c_shouldOverrideUrlLoading_1576d1ca8106c9eee838ba1c40212cb0;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/vg$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_vg$c_shouldOverrideUrlLoading_c1ed3134fdfaee45e8918d3f129199d0 = safedk_vg$c_shouldOverrideUrlLoading_c1ed3134fdfaee45e8918d3f129199d0(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, str, safedk_vg$c_shouldOverrideUrlLoading_c1ed3134fdfaee45e8918d3f129199d0);
            return safedk_vg$c_shouldOverrideUrlLoading_c1ed3134fdfaee45e8918d3f129199d0;
        }

        public boolean safedk_vg$c_shouldOverrideUrlLoading_1576d1ca8106c9eee838ba1c40212cb0(WebView p0, WebResourceRequest p1) {
            Uri url;
            if (!vg.this.f || (url = p1.getUrl()) == null) {
                return true;
            }
            vg.this.b(url.toString());
            return true;
        }

        public void safedk_vg$c_onReceivedError_543142dd69320cb67d116281f2844487(WebView p0, WebResourceRequest p1, WebResourceError p2) {
            super.onReceivedError(p0, p1, p2);
            CharSequence description = p2.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = p2.getErrorCode();
            String uri = p1.getUrl().toString();
            mi.a("ShoppableWebView$MyWebViewClient: load failed, error - " + errorCode + ", description - " + charSequence + ", url - " + uri);
            a aVar = vg.this.d;
            if (aVar != null) {
                aVar.a(errorCode, charSequence, uri);
            }
        }
    }
}
