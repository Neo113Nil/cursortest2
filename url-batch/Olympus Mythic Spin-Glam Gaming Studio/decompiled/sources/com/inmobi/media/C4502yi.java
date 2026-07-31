package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4502yi extends E2 {
    public final Hi f;
    public final Function1 g;
    public boolean h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4502yi(Hi hi, InterfaceC4466x9 interfaceC4466x9, Function1 onRenderViewProcessGone) {
        super(interfaceC4466x9);
        Intrinsics.checkNotNullParameter(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f = hi;
        this.g = onRenderViewProcessGone;
        this.i = RedirectEvent.b;
    }

    public final boolean a(WebView webView, String str) {
        boolean z;
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC4476xi) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) webView;
            gestureDetectorOnGestureListenerC4476xi.getClass();
            z = true;
            if (!gestureDetectorOnGestureListenerC4476xi.a()) {
                gestureDetectorOnGestureListenerC4476xi.a(this.i);
                return true;
            }
            InterfaceC4466x9 interfaceC4466x92 = this.a;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC4476xi.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC4476xi, str);
        } else {
            z = false;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.a;
        if (interfaceC4466x93 != null) {
            ((C4493y9) interfaceC4466x93).a("RenderViewClient", "Override URL loading :" + str + " returned " + z);
        }
        return z;
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.i, webView, str);
        safedk_yi_onLoadResource_975cbd9d993da8c47da24eb4c62a2d23(webView, str);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Xh xh;
        Hi hi = this.f;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            CoroutineScope coroutineScope = Hl.a;
            a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a2 = hi.a("WebViewLoadFinished");
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(a2, a, EnumC4530zk.a);
        }
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "Page load finished:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC4476xi) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) webView;
            a(gestureDetectorOnGestureListenerC4476xi);
            if (Intrinsics.areEqual("Loading", gestureDetectorOnGestureListenerC4476xi.A)) {
                gestureDetectorOnGestureListenerC4476xi.h("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC4476xi.h("window.mraidview.broadcastEvent('ready');");
                BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4397ui(gestureDetectorOnGestureListenerC4476xi, null), 3, null);
            }
        }
        InterfaceC4466x9 interfaceC4466x92 = this.a;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC4466x9 interfaceC4466x93 = this.a;
        if (interfaceC4466x93 == null || (xh = ((C4493y9) interfaceC4466x93).a) == null) {
            return;
        }
        xh.a();
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.i, webView, str);
        safedk_yi_onPageStarted_7fb3126fae80bb075dce0a81a385e7cd(webView, str, bitmap);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, webView, i, str, str2);
        safedk_yi_onReceivedError_4743078851fbd80ddb85bf14a9a1b4cc(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, webView, webResourceRequest, webResourceError);
        safedk_yi_onReceivedError_f63a28884a51fc0c7baf7b9da6eda920(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        boolean didCrash;
        boolean didCrash2;
        int rendererPriorityAtExit;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC4466x9 interfaceC4466x9 = this.a;
            if (interfaceC4466x9 != null) {
                didCrash2 = detail.didCrash();
                rendererPriorityAtExit = detail.rendererPriorityAtExit();
                ((C4493y9) interfaceC4466x9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + didCrash2 + " priority - " + rendererPriorityAtExit);
            }
            Function1 function1 = this.g;
            didCrash = detail.didCrash();
            function1.invoke(Boolean.valueOf(didCrash));
        } else {
            InterfaceC4466x9 interfaceC4466x92 = this.a;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    public void safedk_yi_onLoadResource_975cbd9d993da8c47da24eb4c62a2d23(WebView p0, String p1) {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "Resource loading:" + p1);
        }
        if (p0 instanceof GestureDetectorOnGestureListenerC4476xi) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) p0;
            String url = gestureDetectorOnGestureListenerC4476xi.getUrl();
            if (p1 == null || url == null || StringsKt.startsWith$default(url, "file:", false, 2, (Object) null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC4476xi);
        }
    }

    public void safedk_yi_onPageStarted_7fb3126fae80bb075dce0a81a385e7cd(WebView p0, String p1, Bitmap p2) {
        Xh xh;
        Hi hi = this.f;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            CoroutineScope coroutineScope = Hl.a;
            a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a2 = hi.a("PageStarted");
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(a2, a, EnumC4530zk.a);
        }
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "Page load started:" + p1);
        }
        if (p0 instanceof GestureDetectorOnGestureListenerC4476xi) {
            InterfaceC4466x9 interfaceC4466x92 = this.a;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC4476xi) p0).getMarkupType());
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) p0;
            a(gestureDetectorOnGestureListenerC4476xi);
            gestureDetectorOnGestureListenerC4476xi.setAndUpdateViewState("Loading");
        }
        InterfaceC4466x9 interfaceC4466x93 = this.a;
        if (interfaceC4466x93 != null) {
            ((C4493y9) interfaceC4466x93).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC4466x9 interfaceC4466x94 = this.a;
        if (interfaceC4466x94 == null || (xh = ((C4493y9) interfaceC4466x94).a) == null) {
            return;
        }
        xh.a();
    }

    public void safedk_yi_onReceivedError_4743078851fbd80ddb85bf14a9a1b4cc(WebView view, int p1, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("RenderViewClient", "OnReceivedError - errorCode - " + p1 + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, p1, description, failingUrl);
    }

    public WebResourceResponse safedk_yi_shouldInterceptRequest_121dd6c743cea431a6e319117d75f9bc(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        WebResourceResponse a = Do.a(request, this.a);
        return a == null ? super.shouldInterceptRequest(view, request) : a;
    }

    public boolean safedk_yi_shouldOverrideUrlLoading_b8a72f7a72e5a5dd2b7eefd7511ce194(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        F5.a.getClass();
        if (!F5.x()) {
            return false;
        }
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(view, uri);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.i, webView, webResourceRequest, safedk_yi_shouldInterceptRequest_121dd6c743cea431a6e319117d75f9bc(webView, webResourceRequest));
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.i, webView, str, safedk_yi_shouldInterceptRequest_70eaff721ca7024af9d68401afff2d30(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_yi_shouldOverrideUrlLoading_b8a72f7a72e5a5dd2b7eefd7511ce194 = safedk_yi_shouldOverrideUrlLoading_b8a72f7a72e5a5dd2b7eefd7511ce194(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, webView, webResourceRequest, safedk_yi_shouldOverrideUrlLoading_b8a72f7a72e5a5dd2b7eefd7511ce194);
        return safedk_yi_shouldOverrideUrlLoading_b8a72f7a72e5a5dd2b7eefd7511ce194;
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/yi;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_yi_shouldOverrideUrlLoading_694a7e3a166c25148fd33c3941f942d5 = safedk_yi_shouldOverrideUrlLoading_694a7e3a166c25148fd33c3941f942d5(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, webView, str, safedk_yi_shouldOverrideUrlLoading_694a7e3a166c25148fd33c3941f942d5);
        return safedk_yi_shouldOverrideUrlLoading_694a7e3a166c25148fd33c3941f942d5;
    }

    public void safedk_yi_onReceivedError_f63a28884a51fc0c7baf7b9da6eda920(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        F5.a.getClass();
        if (F5.z()) {
            InterfaceC4466x9 interfaceC4466x9 = this.a;
            if (interfaceC4466x9 != null) {
                int errorCode = error.getErrorCode();
                CharSequence description = error.getDescription();
                ((C4493y9) interfaceC4466x9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.a;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).b("RenderViewClient", "OnReceivedError ");
        }
    }

    public WebResourceResponse safedk_yi_shouldInterceptRequest_70eaff721ca7024af9d68401afff2d30(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        WebResourceResponse a = Do.a(url, this.a);
        return a == null ? super.shouldInterceptRequest(view, url) : a;
    }

    public boolean safedk_yi_shouldOverrideUrlLoading_694a7e3a166c25148fd33c3941f942d5(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + url);
        }
        return a(view, url);
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC4476xi.s();
        C4022gb a = C4048hb.a(gestureDetectorOnGestureListenerC4476xi.getLandingPageHandler(), this.i, (String) null, str, (C4152lb) null, 24);
        InterfaceC4466x9 interfaceC4466x92 = this.a;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC4476xi.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC4476xi.getOriginalUrl() + " URL: " + str);
        }
        InterfaceC4466x9 interfaceC4466x93 = this.a;
        if (interfaceC4466x93 != null) {
            ((C4493y9) interfaceC4466x93).c("RenderViewClient", "landingPage process result - " + a.a);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        if (this.h || gestureDetectorOnGestureListenerC4476xi.e) {
            return;
        }
        this.h = true;
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC4476xi.h(gestureDetectorOnGestureListenerC4476xi.getMraidJsString());
    }
}
