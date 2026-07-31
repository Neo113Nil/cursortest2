package com.inmobi.media;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.network.NetworkUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3909c6 extends E2 {
    public final String f;
    public final Function0 g;
    public final Function1 h;
    public final Function2 i;
    public final S8 j;
    public C4152lb k;
    public C4100jb l;
    public final C4266pj m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3909c6(String api, Function0 onUserLandingCompleted, Function1 onLpLifecycleEvent, Function2 fireLandingPageTracker, InterfaceC4466x9 interfaceC4466x9, S8 s8, long j) {
        super(interfaceC4466x9);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(onUserLandingCompleted, "onUserLandingCompleted");
        Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        Intrinsics.checkNotNullParameter(fireLandingPageTracker, "fireLandingPageTracker");
        this.f = api;
        this.g = onUserLandingCompleted;
        this.h = onLpLifecycleEvent;
        this.i = fireLandingPageTracker;
        this.j = s8;
        this.m = new C4266pj(j, interfaceC4466x9, new Function1() { // from class: com.inmobi.media.c6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3909c6.a(C3909c6.this, (String) obj);
            }
        });
    }

    public final boolean a(WebView webView, String url) {
        Integer num;
        int i;
        InterfaceC3883b6 interfaceC3883b6;
        InterfaceC4531zl userLeftApplicationListener;
        if (this.e.get()) {
            return true;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + url);
        }
        C4266pj c4266pj = this.m;
        if (!c4266pj.f) {
            c4266pj.g = EnumC4213nj.c;
        }
        c4266pj.h = true;
        c4266pj.a();
        if (webView instanceof D2) {
            C4022gb a = C4048hb.a(((D2) webView).getLandingPageHandler(), this.f, (String) null, url, this.k, 16);
            num = a.b;
            i = a.a;
        } else {
            num = null;
            i = 0;
        }
        if (i == 0) {
            C4266pj c4266pj2 = this.m;
            c4266pj2.getClass();
            c4266pj2.g = EnumC4213nj.d;
            return false;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                return false;
            }
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            C4100jb c4100jb = this.l;
            if (c4100jb != null) {
                c4100jb.a(3, false, url, valueOf);
            }
            return true;
        }
        C4266pj c4266pj3 = this.m;
        c4266pj3.getClass();
        c4266pj3.g = EnumC4213nj.e;
        boolean z = webView instanceof C3935d6;
        if (z) {
            ViewParent parent = ((C3935d6) webView).getParent();
            if ((parent instanceof Y5) && (userLeftApplicationListener = ((Y5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        Function1 function1 = this.h;
        C3947di c3947di = GestureDetectorOnGestureListenerC4476xi.g1;
        String str = this.f;
        c3947di.getClass();
        function1.invoke(C3947di.a(str, "onNavigatingAway"));
        a(webView);
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
        if (!F3.a(parse) || Intrinsics.areEqual(POBCommonConstants.PLAY_STORE_DOMAIN, parse.getHost()) || Intrinsics.areEqual("market.android.com", parse.getHost()) || Intrinsics.areEqual(NetworkUtils.PROTOCOL_MARKET, parse.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z) {
                ViewParent parent2 = ((C3935d6) webView).getParent();
                if ((parent2 instanceof Y5) && (interfaceC3883b6 = ((Y5) parent2).d) != null) {
                    V8.a(((U8) interfaceC3883b6).a);
                }
            }
            S8 s8 = this.j;
            if (s8 != null) {
                ((C4159li) s8).a.x();
            }
        }
        a(this, 2, false, url, 8);
        return true;
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        Job launch$default;
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        C4266pj c4266pj = this.m;
        if (!c4266pj.f && c4266pj.a > 0) {
            long j = c4266pj.e;
            c4266pj.a();
            launch$default = BuildersKt__Builders_commonKt.launch$default(c4266pj.d, null, null, new C4240oj(c4266pj, j, str, webView, null), 3, null);
            c4266pj.i = launch$default;
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "onPageFinished: " + str);
        }
        a(this, 2, true, str, 8);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/c6;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.i, webView, str);
        safedk_c6_onPageStarted_ed460bd729aeddae3ddf3adb1a8c7991(webView, str, bitmap);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/c6;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, webView, i, str, str2);
        safedk_c6_onReceivedError_473057dcf243cf17a1412b0d0dac2e4a(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/c6;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.i, webView, webResourceRequest, webResourceError);
        safedk_c6_onReceivedError_fea657a5ea605341cbfb391c2d6cedb6(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        C4266pj c4266pj = this.m;
        String uri = webResourceRequest.getUrl().toString();
        c4266pj.getClass();
        Intrinsics.checkNotNullParameter("RECEIVED_HTTP_ERROR", "reason");
        c4266pj.a("RECEIVED_HTTP_ERROR", uri);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        boolean didCrash;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        boolean onRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            C4100jb c4100jb = this.l;
            if (c4100jb != null) {
                c4100jb.a(3, true, null, 8007);
            }
            Pair pair = TuplesKt.to("source", "embedded_browser");
            didCrash = detail.didCrash();
            Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("isCrashed", Boolean.valueOf(didCrash)));
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("WebViewRenderProcessGoneEvent", mutableMapOf, EnumC4530zk.a);
        }
        C4266pj c4266pj = this.m;
        String url = view.getUrl();
        c4266pj.getClass();
        Intrinsics.checkNotNullParameter("RENDER_PROCESS_GONE", "reason");
        c4266pj.a("RENDER_PROCESS_GONE", url);
        return onRenderProcessGone;
    }

    public void safedk_c6_onPageStarted_ed460bd729aeddae3ddf3adb1a8c7991(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        C4266pj c4266pj = this.m;
        if (!c4266pj.f && c4266pj.a > 0) {
            c4266pj.e++;
            c4266pj.f = false;
            c4266pj.g = EnumC4213nj.b;
            c4266pj.h = false;
            c4266pj.a();
        }
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "onPageStarted: " + p1);
        }
        Function1 function1 = this.h;
        C3947di c3947di = GestureDetectorOnGestureListenerC4476xi.g1;
        String str = this.f;
        c3947di.getClass();
        function1.invoke(C3947di.a(str, "onPageStart"));
        a(this, 1, true, p1, 8);
    }

    public void safedk_c6_onReceivedError_473057dcf243cf17a1412b0d0dac2e4a(WebView view, int p1, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        Integer valueOf = Integer.valueOf(p1);
        C4100jb c4100jb = this.l;
        if (c4100jb != null) {
            c4100jb.a(3, false, failingUrl, valueOf);
        }
        C4266pj c4266pj = this.m;
        c4266pj.getClass();
        Intrinsics.checkNotNullParameter("RECEIVED_ERROR", "reason");
        c4266pj.a("RECEIVED_ERROR", failingUrl);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "onReceivedError: " + failingUrl);
        }
    }

    public boolean safedk_c6_shouldOverrideUrlLoading_cd56665708de0c8bff36d9c329cfe2d0(WebView p0, WebResourceRequest p1) {
        String str;
        Uri url;
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        F5.a.getClass();
        if (!F5.x()) {
            return false;
        }
        if (p1 == null || (url = p1.getUrl()) == null || (str = url.toString()) == null) {
            str = "";
        }
        if (p0 == null || str.length() <= 0) {
            return false;
        }
        return a(p0, str);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.i, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/c6;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_c6_shouldOverrideUrlLoading_cd56665708de0c8bff36d9c329cfe2d0 = safedk_c6_shouldOverrideUrlLoading_cd56665708de0c8bff36d9c329cfe2d0(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, webView, webResourceRequest, safedk_c6_shouldOverrideUrlLoading_cd56665708de0c8bff36d9c329cfe2d0);
        return safedk_c6_shouldOverrideUrlLoading_cd56665708de0c8bff36d9c329cfe2d0;
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/c6;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_c6_shouldOverrideUrlLoading_56942a05886f00fae65410f2364df3bc = safedk_c6_shouldOverrideUrlLoading_56942a05886f00fae65410f2364df3bc(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.i, webView, str, safedk_c6_shouldOverrideUrlLoading_56942a05886f00fae65410f2364df3bc);
        return safedk_c6_shouldOverrideUrlLoading_56942a05886f00fae65410f2364df3bc;
    }

    public boolean safedk_c6_shouldOverrideUrlLoading_56942a05886f00fae65410f2364df3bc(WebView p0, String p1) {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (p0 == null || p1 == null) {
            return false;
        }
        return a(p0, p1);
    }

    public void safedk_c6_onReceivedError_fea657a5ea605341cbfb391c2d6cedb6(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            Integer valueOf = Integer.valueOf(error.getErrorCode());
            String uri = request.getUrl().toString();
            C4100jb c4100jb = this.l;
            if (c4100jb != null) {
                c4100jb.a(3, true, uri, valueOf);
            }
            C4266pj c4266pj = this.m;
            String uri2 = request.getUrl().toString();
            c4266pj.getClass();
            Intrinsics.checkNotNullParameter("RECEIVED_ERROR", "reason");
            c4266pj.a("RECEIVED_ERROR", uri2);
        }
    }

    public static final Unit a(C3909c6 c3909c6, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        S8 s8 = c3909c6.j;
        if (s8 != null) {
            C4159li c4159li = (C4159li) s8;
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (c4159li.a.getFullScreenActivity() instanceof InMobiAdActivity) {
                Activity fullScreenActivity = c4159li.a.getFullScreenActivity();
                Intrinsics.checkNotNull(fullScreenActivity, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) fullScreenActivity).a(reason);
            }
        }
        return Unit.INSTANCE;
    }

    public static void a(C3909c6 c3909c6, int i, boolean z, String str, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        C4100jb c4100jb = c3909c6.l;
        if (c4100jb != null) {
            c4100jb.a(i, z, str, null);
        }
    }
}
