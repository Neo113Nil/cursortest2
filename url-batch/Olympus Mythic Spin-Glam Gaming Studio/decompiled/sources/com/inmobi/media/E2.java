package com.inmobi.media;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class E2 extends WebViewClient {
    public final InterfaceC4466x9 a;
    public boolean c;
    public boolean d;
    public int b = -1;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public E2(InterfaceC4466x9 interfaceC4466x9) {
        this.a = interfaceC4466x9;
    }

    public final void a(WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.e.set(true);
        view.postDelayed(new Runnable() { // from class: com.inmobi.media.E2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                E2.a(E2.this);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.d) {
            this.d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Xb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        view.destroy();
        return true;
    }

    public WebResourceResponse safedk_E2_shouldInterceptRequest_e6336a3ad4ed9a8dbf5c39f6ff6e39bf(WebView view, String url) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        F5.a.getClass();
        if (!F5.x() && -1 != (i = this.b)) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new Handler(Looper.getMainLooper()).post(new Ue(view));
                this.c = true;
                if (view instanceof GestureDetectorOnGestureListenerC4476xi) {
                    ((GestureDetectorOnGestureListenerC4476xi) view).G();
                }
            }
        }
        WebResourceResponse a = Do.a(url, this.a);
        return a == null ? super.shouldInterceptRequest(view, url) : a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/E2;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.i, webView, webResourceRequest, safedk_E2_shouldInterceptRequest_0cd896de340a79ecd23e15b181e7e5d5(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/E2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.i, webView, str, safedk_E2_shouldInterceptRequest_e6336a3ad4ed9a8dbf5c39f6ff6e39bf(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    public static final void a(E2 e2) {
        e2.e.set(false);
    }

    public WebResourceResponse safedk_E2_shouldInterceptRequest_0cd896de340a79ecd23e15b181e7e5d5(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
        int i = this.b;
        if (-1 != i) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new Handler(Looper.getMainLooper()).post(new Ue(view));
                this.c = true;
                if (view instanceof GestureDetectorOnGestureListenerC4476xi) {
                    ((GestureDetectorOnGestureListenerC4476xi) view).G();
                }
            }
        }
        WebResourceResponse a = Do.a(request, this.a);
        return a == null ? super.shouldInterceptRequest(view, request) : a;
    }
}
