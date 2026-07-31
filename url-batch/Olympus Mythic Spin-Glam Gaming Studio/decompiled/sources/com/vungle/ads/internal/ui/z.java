package com.vungle.ads.internal.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s1;
import io.bidmachine.util.network.NetworkUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes15.dex */
public final class z extends WebViewClient implements com.vungle.ads.internal.util.v {
    public final h0 a;
    public final i3 b;
    public final ExecutorService c;
    public final com.vungle.ads.internal.platform.f d;
    public final com.vungle.ads.internal.load.e e;
    public final Long f;
    public final Lazy g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public WebView m;
    public boolean n;
    public com.vungle.ads.internal.ui.view.o o;
    public com.vungle.ads.internal.ui.view.p p;
    public com.vungle.ads.internal.omsdk.f q;
    public Boolean r;
    public final s1 s;
    public final s1 t;
    public final m2 u;

    public /* synthetic */ z(h0 h0Var, i3 i3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar) {
        this(h0Var, i3Var, executorService, fVar, null, null);
    }

    public static final void b(z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.load.e eVar = this$0.e;
        if (eVar != null) {
            eVar.b();
        }
        this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public static final void c(z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.load.e eVar = this$0.e;
        if (eVar != null) {
            eVar.a();
        }
        this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", r.a);
        if (webView == null) {
            return;
        }
        this.m = webView;
        webView.setVisibility(0);
        a();
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new o(this.p));
        }
        com.vungle.ads.internal.omsdk.f fVar = this.q;
        if (fVar != null) {
            ((com.vungle.ads.internal.omsdk.e) fVar).a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/z;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.d, webView, i, str, str2);
        safedk_z_onReceivedError_401161e5a2f225fdc7eb5b65aca6daa6(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/z;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.d, webView, webResourceRequest, webResourceError);
        safedk_z_onReceivedError_5594637e6aad6408e7fd42544b571a6d(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String valueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = false;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Http Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if ((valueOf2.length() > 0 ? this.a.b(valueOf2) : false) && z2) {
            z = true;
        }
        String str = valueOf2 + ' ' + valueOf;
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Boolean bool;
        boolean didCrash;
        this.m = null;
        if (Build.VERSION.SDK_INT < 26) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", new s(webView));
            com.vungle.ads.internal.ui.view.p pVar = this.p;
            if (pVar != null) {
                ((com.vungle.ads.internal.presenter.r) pVar).a(new WebViewRenderingProcessGone("didCrash=true"), true, null);
            }
            return true;
        }
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new t(webView, renderProcessGoneDetail));
        com.vungle.ads.internal.ui.view.p pVar2 = this.p;
        if (pVar2 != null) {
            if (renderProcessGoneDetail != null) {
                didCrash = renderProcessGoneDetail.didCrash();
                bool = Boolean.valueOf(didCrash);
            } else {
                bool = null;
            }
            com.vungle.ads.internal.presenter.r rVar = (com.vungle.ads.internal.presenter.r) pVar2;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            rVar.a(new WebViewRenderingProcessGone("didCrash=" + booleanValue), booleanValue, null);
        }
        return true;
    }

    public void safedk_z_onReceivedError_401161e5a2f225fdc7eb5b65aca6daa6(WebView p0, int p1, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(p0, p1, description, failingUrl);
    }

    public WebResourceResponse safedk_z_shouldInterceptRequest_946e49b6833f34517255141b8f222c1f(WebView p0, WebResourceRequest p1) {
        String scheme;
        Object m8023constructorimpl;
        Pair pair;
        Uri url = p1 != null ? p1.getUrl() : null;
        if (url == null || (scheme = url.getScheme()) == null) {
            return null;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = scheme.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        if (!Intrinsics.areEqual(lowerCase, "http") && !Intrinsics.areEqual(lowerCase, "https")) {
            return null;
        }
        if (!this.a.B()) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", w.a);
            return null;
        }
        String uri = url.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
        com.vungle.ads.internal.model.b a = this.a.a(uri);
        String c = a != null ? a.c() : null;
        if (c == null || c.length() == 0) {
            return null;
        }
        File file = new File(c);
        if (!file.exists()) {
            return null;
        }
        long b = a.b();
        if (b <= 0) {
            return null;
        }
        long length = file.length();
        String str = p1.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
        this.s.a(str + " cached:" + length + ' ' + uri);
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.s, this.a.q());
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str == null || !StringsKt.startsWith$default(str, "bytes=", false, 2, (Object) null)) {
                pair = new Pair(0L, null);
            } else {
                List split$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(str, "bytes="), new String[]{"-"}, false, 0, 6, (Object) null);
                String str2 = (String) CollectionsKt.getOrNull(split$default, 0);
                Long longOrNull = str2 != null ? StringsKt.toLongOrNull(str2) : null;
                String str3 = (String) CollectionsKt.getOrNull(split$default, 1);
                Long longOrNull2 = str3 != null ? StringsKt.toLongOrNull(str3) : null;
                if (longOrNull == null) {
                    if (longOrNull2 == null) {
                        longOrNull = 0L;
                    } else {
                        longOrNull = Long.valueOf(b - longOrNull2.longValue());
                        longOrNull2 = null;
                    }
                }
                pair = new Pair(longOrNull, longOrNull2);
            }
            m8023constructorimpl = Result.m8023constructorimpl(pair);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = new Pair(0L, null);
        }
        Pair pair2 = (Pair) m8023constructorimpl;
        a.c(((Number) pair2.getFirst()).longValue());
        a.a((Long) pair2.getSecond());
        long longValue = ((Number) pair2.component1()).longValue();
        Long l = (Long) pair2.component2();
        long j = length - longValue;
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a(">>request: " + url + " rangeStart=" + longValue + " rangeEnd=" + l + " cachedFileLength=" + length + " availableBytes=" + j + " contentLength=" + b + ' ');
        if (j <= 0) {
            com.vungle.ads.internal.util.t.a("VungleWebClient", new x(str));
            a.q();
            length = file.length();
        }
        long longValue2 = l != null ? l.longValue() : length - 1;
        long j2 = (longValue2 - longValue) + 1;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            WebResourceResponse webResourceResponse = new WebResourceResponse(a.d(), "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", a.d()), TuplesKt.to("Accept-Ranges", "bytes"), TuplesKt.to(NetworkUtils.HEADER_CONTENT_LENGTH, String.valueOf(j2)), TuplesKt.to("Content-Range", "bytes " + longValue + '-' + longValue2 + '/' + b)), new BufferedInputStream(fileInputStream, 1024));
            StringBuilder sb = new StringBuilder();
            sb.append("<<Return:");
            sb.append(webResourceResponse.getResponseHeaders());
            com.vungle.ads.internal.util.t.a(sb.toString());
            return webResourceResponse;
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(Result.m8023constructorimpl(ResultKt.createFailure(th2)));
            if (m8026exceptionOrNullimpl != null) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Error serving local range video: ");
                a2.append(m8026exceptionOrNullimpl.getMessage());
                com.vungle.ads.internal.util.t.a("VungleWebClient", a2.toString(), m8026exceptionOrNullimpl);
                this.t.a(uri + ' ' + m8026exceptionOrNullimpl.getMessage());
                AnalyticsClient.a(AnalyticsClient.INSTANCE, this.t, this.a.q());
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0023, B:10:0x0032, B:13:0x003a, B:15:0x0047, B:17:0x004d, B:24:0x00a6, B:26:0x00aa, B:29:0x00b1, B:30:0x00be, B:32:0x00c4, B:34:0x00d7, B:36:0x0061, B:39:0x006a, B:40:0x0079, B:43:0x0082, B:44:0x008d, B:46:0x0095, B:48:0x0099, B:49:0x00fa, B:51:0x00e9, B:53:0x00f1, B:56:0x0127, B:58:0x013f, B:61:0x0156), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0023, B:10:0x0032, B:13:0x003a, B:15:0x0047, B:17:0x004d, B:24:0x00a6, B:26:0x00aa, B:29:0x00b1, B:30:0x00be, B:32:0x00c4, B:34:0x00d7, B:36:0x0061, B:39:0x006a, B:40:0x0079, B:43:0x0082, B:44:0x008d, B:46:0x0095, B:48:0x0099, B:49:0x00fa, B:51:0x00e9, B:53:0x00f1, B:56:0x0127, B:58:0x013f, B:61:0x0156), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean safedk_z_shouldOverrideUrlLoading_e3863bd732b30f177cec48088a56ae43(final WebView p0, String p1) {
        final com.vungle.ads.internal.ui.view.o oVar;
        try {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID Command " + p1);
            if (p1 != null && p1.length() != 0) {
                Uri parse = Uri.parse(p1);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                String scheme = parse.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    String scheme2 = parse.getScheme();
                    if (!Intrinsics.areEqual(scheme2, "mraid")) {
                        if (!StringsKt.equals("http", scheme2, true)) {
                            if (StringsKt.equals("https", scheme2, true)) {
                            }
                        }
                        com.vungle.ads.internal.util.t.a("VungleWebClient", "Open URL" + p1);
                        com.vungle.ads.internal.ui.view.o oVar2 = this.o;
                        if (oVar2 != null) {
                            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                            JsonElementBuildersKt.put(jsonObjectBuilder, "url", p1);
                            ((com.vungle.ads.internal.presenter.r) oVar2).a("openNonMraid", jsonObjectBuilder.build());
                        }
                        return true;
                    }
                    final String host = parse.getHost();
                    if (host != null) {
                        int hashCode = host.hashCode();
                        if (hashCode == -1943542072) {
                            if (host.equals("propertiesChangeCompleted")) {
                                if (!this.n) {
                                    this.n = true;
                                    this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z.a(z.this, p0);
                                        }
                                    });
                                }
                                return true;
                            }
                            oVar = this.o;
                            if (oVar == null) {
                            }
                        } else {
                            if (hashCode != 88409791) {
                                if (hashCode == 119543762 && host.equals("readyToPlay")) {
                                    this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z.b(z.this, p0);
                                        }
                                    });
                                    return true;
                                }
                                oVar = this.o;
                                if (oVar == null) {
                                    a(p0, "window.vungle.mraidBridge.notifyCommandComplete()");
                                    return true;
                                }
                                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                                for (String param : parse.getQueryParameterNames()) {
                                    Intrinsics.checkNotNullExpressionValue(param, "param");
                                    JsonElementBuildersKt.put(jsonObjectBuilder2, param, parse.getQueryParameter(param));
                                }
                                final JsonObject build = jsonObjectBuilder2.build();
                                this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        z.a(com.vungle.ads.internal.ui.view.o.this, host, build, this, p0);
                                    }
                                });
                                return true;
                            }
                            if (host.equals("failToLoad")) {
                                this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        z.c(z.this, p0);
                                    }
                                });
                                return true;
                            }
                            oVar = this.o;
                            if (oVar == null) {
                            }
                        }
                    }
                    this.u.a("url: " + p1);
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.u, this.a.q(), 4);
                    com.vungle.ads.internal.util.t.a("VungleWebClient", new y(p1));
                    return false;
                }
                return false;
            }
            com.vungle.ads.internal.util.t.b("VungleWebClient", "Invalid URL ");
            return false;
        } catch (Throwable p02) {
            if (p02 instanceof OutOfMemoryError) {
                new OutOfMemory(com.iab.omid.library.vungle.d.a("mraid:", p1)).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/z;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.d, webView, webResourceRequest, safedk_z_shouldInterceptRequest_946e49b6833f34517255141b8f222c1f(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/z;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_z_shouldOverrideUrlLoading_e3863bd732b30f177cec48088a56ae43 = safedk_z_shouldOverrideUrlLoading_e3863bd732b30f177cec48088a56ae43(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.d, webView, str, safedk_z_shouldOverrideUrlLoading_e3863bd732b30f177cec48088a56ae43);
        return safedk_z_shouldOverrideUrlLoading_e3863bd732b30f177cec48088a56ae43;
    }

    public z(h0 advertisement, i3 placement, ExecutorService offloadExecutor, com.vungle.ads.internal.platform.f fVar, com.vungle.ads.internal.load.e eVar, Long l) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.a = advertisement;
        this.b = placement;
        this.c = offloadExecutor;
        this.d = fVar;
        this.e = eVar;
        this.f = l;
        this.g = LazyKt.lazy(p.a);
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.s = new s1(sDKMetricType);
        this.t = new s1(sDKMetricType);
        this.u = new m2(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    public final void a(int i) {
        ((com.vungle.ads.internal.util.j) this.g.getValue()).a(this.m, i, new q(this));
    }

    public final void b(boolean z) {
        this.r = Boolean.valueOf(z);
        WebView webView = this.m;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, X3.i.o, Boolean.valueOf(z));
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void a(boolean z, String str, String str2, String str3, String str4) {
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final void a(com.vungle.ads.internal.ui.view.o oVar) {
        this.o = oVar;
    }

    public static final void a(z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.a.g() + ')');
    }

    public void safedk_z_onReceivedError_5594637e6aad6408e7fd42544b571a6d(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        String valueOf = String.valueOf(p2 != null ? p2.getDescription() : null);
        String valueOf2 = String.valueOf(p1 != null ? p1.getUrl() : null);
        boolean z = false;
        boolean z2 = p1 != null && p1.isForMainFrame();
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if ((valueOf2.length() > 0 ? this.a.b(valueOf2) : false) && z2) {
            z = true;
        }
        String str = valueOf2 + ' ' + valueOf;
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z, str);
        }
    }

    public static final void a(com.vungle.ads.internal.ui.view.o it, String command, JsonObject args, z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((com.vungle.ads.internal.presenter.r) it).a(command, args)) {
            this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        }
    }

    public final void a() {
        final boolean z = true;
        this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                z.a(z, this);
            }
        });
    }

    public final void a(String errorMessage, int i) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        WebView webView = this.m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i + ')');
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Returning black screen result: " + i + '%');
        if (i >= 0) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i, this.a.q(), null, 8);
        } else {
            AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.a.q());
        }
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z) {
        WebView webView = this.m;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(z));
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void a(com.vungle.ads.internal.ui.view.p errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.p = errorHandler;
    }

    public final void a(com.vungle.ads.internal.omsdk.e eVar) {
        this.q = eVar;
    }

    public final void a(WebView webView, String str) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new u(str));
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new v(this, webView, str));
    }

    public static final void a(boolean z, z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.a.F());
        Boolean bool = this$0.r;
        if (bool != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, X3.i.o, bool);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "os", "android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", Boolean.valueOf(this$0.b.j()));
        com.vungle.ads.internal.platform.f fVar = this$0.d;
        if (fVar != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(((com.vungle.ads.internal.platform.c) fVar).o()));
        }
        Long l = this$0.f;
        if (l != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", l);
        }
        if (this$0.h) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.TRUE);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.i);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.j);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.k);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.l);
        } else {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.FALSE);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ',' + z + ')';
        WebView webView = this$0.m;
        if (webView != null) {
            this$0.a(webView, str);
        }
    }
}
