package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.sdk.controller.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import com.safedk.android.utils.Logger;
import com.smaato.sdk.ng.vpaid.c$$ExternalSyntheticBackport1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.bridge.JsBridgeHandler;
import io.bidmachine.iab.mraid.MraidWebViewController;
import io.bidmachine.iab.script.ScriptInjector;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.model.ScriptConfig;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes15.dex */
public class MraidWebViewController {

    @NonNull
    public static final String TAG = "MraidWebViewController";
    private final Callback a;
    private final long b;
    private final MraidWebView c;
    private final AtomicBoolean d;
    private final ScriptInjector e;
    private final MraidClick f;
    private boolean g;
    private boolean h;
    private MraidViewState i;
    private MraidOrientationProperties j;

    public interface Callback {
        void onCalendarEvent(@Nullable String str);

        void onClose();

        void onError(@NonNull IabError iabError);

        void onExpand(@Nullable String str);

        void onLoaded();

        void onOpen(@NonNull String str);

        void onOpenPrivacySheet(@NonNull String str);

        void onOrientation(@NonNull MraidOrientationProperties mraidOrientationProperties);

        void onPageFinished(@NonNull String str);

        void onPlayVideo(@Nullable String str);

        void onResize(@NonNull MraidResizeProperties mraidResizeProperties);

        void onStorePicture(@Nullable String str);

        void onUseCustomClose(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends WebViewClient {
        private b() {
        }

        private void a(final String str, final String str2, final int i) {
            MraidLog.d(MraidWebViewController.TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String b;
                    b = MraidWebViewController.b.b(str, str2, i);
                    return b;
                }
            });
            if (str2 == null || !str2.contains("ERR_INTERNET_DISCONNECTED")) {
                return;
            }
            MraidWebViewController.this.h = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "onPageFinished";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "onPageStarted";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "onRenderProcessGone";
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("io.bidmachine", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MraidLog.d(MraidWebViewController.TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String b;
                    b = MraidWebViewController.b.b();
                    return b;
                }
            });
            if (MraidWebViewController.this.d.compareAndSet(false, true)) {
                MraidWebViewController.this.a.onPageFinished(str);
                MraidWebViewController.this.c.onPageFinished();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted("io.bidmachine", webView, str);
            safedk_MraidWebViewController$b_onPageStarted_30055bcb5b79239473faf332dfb0f4dd(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError("io.bidmachine", webView, i, str, str2);
            safedk_MraidWebViewController$b_onReceivedError_f9d73168955d6bdc42cadf42f414e25f(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError("io.bidmachine", webView, webResourceRequest, webResourceError);
            safedk_MraidWebViewController$b_onReceivedError_ba7fb2e7d7514c5d835c60190d597943(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            MraidLog.d(MraidWebViewController.TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$b$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String d;
                    d = MraidWebViewController.b.d();
                    return d;
                }
            });
            MraidWebViewController.this.destroy();
            MraidWebViewController.this.a.onError(IabError.internal("WebViewClient - onRenderProcessGone"));
            return true;
        }

        public void safedk_MraidWebViewController$b_onPageStarted_30055bcb5b79239473faf332dfb0f4dd(WebView p0, String p1, Bitmap p2) {
            super.onPageStarted(p0, p1, p2);
            MraidLog.d(MraidWebViewController.TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$b$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String c;
                    c = MraidWebViewController.b.c();
                    return c;
                }
            });
        }

        public void safedk_MraidWebViewController$b_onReceivedError_ba7fb2e7d7514c5d835c60190d597943(WebView p0, WebResourceRequest p1, WebResourceError p2) {
            Uri url = p1.getUrl();
            a(url != null ? url.toString() : null, p2.getDescription().toString(), p2.getErrorCode());
            super.onReceivedError(p0, p1, p2);
        }

        public WebResourceResponse safedk_MraidWebViewController$b_shouldInterceptRequest_70371e720b5f85f4d885541ae7b04fd8(WebView p0, WebResourceRequest p1) {
            return a(p1.getUrl()) ? a() : super.shouldInterceptRequest(p0, p1);
        }

        public boolean safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f(WebView p0, String p1) {
            if (p1.startsWith("mraid://")) {
                MraidWebViewController.this.a(p1);
                return true;
            }
            if (JsBridgeHandler.isHandled(p1)) {
                JsBridgeHandler.handleJsCommand(MraidWebViewController.this.c, p1);
                return true;
            }
            MraidWebViewController.this.c(p1);
            return true;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
            return CreativeInfoManager.onWebViewResponseWithHeaders("io.bidmachine", webView, webResourceRequest, safedk_MraidWebViewController$b_shouldInterceptRequest_70371e720b5f85f4d885541ae7b04fd8(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
            return CreativeInfoManager.onWebViewResponse("io.bidmachine", webView, str, safedk_MraidWebViewController$b_shouldInterceptRequest_f9a37b326fb6782bea01bbc53ca95772(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f = safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("io.bidmachine", webView, str, safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f);
            return safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(String str, String str2, int i) {
            return "onError: " + str + " / " + str2 + " / " + i;
        }

        boolean a(String str) {
            return a(Uri.parse(str.toLowerCase(Locale.US)));
        }

        public WebResourceResponse safedk_MraidWebViewController$b_shouldInterceptRequest_f9a37b326fb6782bea01bbc53ca95772(WebView p0, String p1) {
            if (a(p1)) {
                return a();
            }
            return super.shouldInterceptRequest(p0, p1);
        }

        boolean a(Uri uri) {
            return w.k.equals(uri.getLastPathSegment());
        }

        private WebResourceResponse a() {
            String b = MraidUtils.b();
            Charset charset = StandardCharsets.UTF_8;
            return new WebResourceResponse(POBCommonConstants.CONTENT_TYPE_JAVASCRIPT, charset.name(), new ByteArrayInputStream(b.getBytes(charset)));
        }

        public void safedk_MraidWebViewController$b_onReceivedError_f9d73168955d6bdc42cadf42f414e25f(WebView p0, int p1, String p2, String p3) {
            a(p3, p2, p1);
            super.onReceivedError(p0, p1, p2, p3);
        }
    }

    private class c implements MraidWebViewListener {
        private c() {
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewListener
        public void onMraidScreenMetricsChanged(MraidScreenMetrics mraidScreenMetrics) {
            if (!MraidWebViewController.this.d.get() || MraidWebViewController.this.i == MraidViewState.HIDDEN) {
                return;
            }
            MraidWebViewController.this.applyScreenMetrics(mraidScreenMetrics);
        }
    }

    public MraidWebViewController(@NonNull Context context, @NonNull Callback callback, long j) {
        this.a = callback;
        this.b = j;
        MraidWebView mraidWebView = new MraidWebView(context, this);
        this.c = mraidWebView;
        mraidWebView.setWebViewClient(new b());
        mraidWebView.setMraidWebViewListener(new c());
        this.g = false;
        this.h = false;
        this.i = MraidViewState.LOADING;
        this.d = new AtomicBoolean(false);
        this.e = new ScriptInjector(mraidWebView);
        this.f = new MraidClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "data is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f() {
        return "data must be base64 encoded json";
    }

    private void g() {
        injectJs("mraid.nativeCallComplete();");
    }

    public void applyClick(@NonNull Point point) {
        injectJs(this.f.getJs(point));
    }

    public void applyLogLevel(int i) {
        if (i == 3) {
            injectJs("mraid.logLevel = mraid.LogLevelEnum.DEBUG;");
            return;
        }
        if (i == 4) {
            injectJs("mraid.logLevel = mraid.LogLevelEnum.INFO;");
            return;
        }
        if (i == 5) {
            injectJs("mraid.logLevel = mraid.LogLevelEnum.WARNING;");
        } else if (i == 6) {
            injectJs("mraid.logLevel = mraid.LogLevelEnum.ERROR;");
        } else {
            injectJs("mraid.logLevel = mraid.LogLevelEnum.NONE;");
        }
    }

    public void applyPlacement(@Nullable MraidPlacementType mraidPlacementType) {
        if (mraidPlacementType == null) {
            return;
        }
        injectJs("mraid.setPlacementType('" + mraidPlacementType.b() + "');");
    }

    public void applyScreenMetrics(@NonNull MraidScreenMetrics mraidScreenMetrics) {
        Rect screenRectDp = mraidScreenMetrics.getScreenRectDp();
        Rect rootViewRectDp = mraidScreenMetrics.getRootViewRectDp();
        injectJs("mraid.setScreenSize(" + screenRectDp.width() + StringUtils.COMMA + screenRectDp.height() + ");mraid.setMaxSize(" + rootViewRectDp.width() + StringUtils.COMMA + rootViewRectDp.height() + ");mraid.setCurrentPosition(" + Utils.stringifyRect(mraidScreenMetrics.getCurrentAdRectDp()) + ");mraid.setDefaultPosition(" + Utils.stringifyRect(mraidScreenMetrics.getDefaultAdRectDp()) + ");mraid.fireSizeChangeEvent(" + Utils.stringifySize(mraidScreenMetrics.getCurrentAdRectDp()) + ");");
    }

    public void applyState(@NonNull MraidViewState mraidViewState) {
        this.i = mraidViewState;
        injectJs("mraid.fireStateChangeEvent('" + mraidViewState.toJsString() + "');");
    }

    public void applySupportedServices(@NonNull MraidNativeFeatureManager mraidNativeFeatureManager) {
        injectJs("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + mraidNativeFeatureManager.isCalendarFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + mraidNativeFeatureManager.isInlineVideoFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + mraidNativeFeatureManager.isSmsFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + mraidNativeFeatureManager.isStorePictureFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + mraidNativeFeatureManager.isTelFeatureAvailable() + ");");
    }

    public void applyViewable(boolean z) {
        injectJs("mraid.fireViewableChangeEvent(" + z + ");");
    }

    public void destroy() {
        this.e.destroy();
        MraidWebView mraidWebView = this.c;
        Utils.removeFromParent(mraidWebView);
        mraidWebView.destroy();
    }

    @Nullable
    public MraidOrientationProperties getLastOrientationProperties() {
        return this.j;
    }

    @NonNull
    public MraidScreenMetrics getMraidScreenMetrics() {
        return this.c.getMraidScreenMetrics();
    }

    @NonNull
    public MraidWebView getMraidWebView() {
        return this.c;
    }

    public void injectJs(@Nullable String str) {
        this.e.injectAtRuntime(str);
    }

    public boolean isReceivedJsError() {
        return this.h;
    }

    public boolean isUseCustomClose() {
        return this.g;
    }

    public void load(@NonNull String str) {
        this.d.set(false);
        BidMachineNetworkBridge.webviewLoadUrl(this.c, str);
    }

    public void notifyReady() {
        injectJs("mraid.fireReadyEvent();");
    }

    public void onViewabilityChanged(boolean z) {
        this.c.onViewabilityChanged(z);
        if (this.d.get()) {
            applyViewable(z);
        }
    }

    public void reset() {
        this.c.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (!this.c.wasClicked()) {
            MraidLog.d(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String b2;
                    b2 = MraidWebViewController.b();
                    return b2;
                }
            });
        } else {
            this.a.onOpen(str);
            this.c.resetClicked();
        }
    }

    private void d(String str) {
        if (this.b == 0 || System.currentTimeMillis() - this.c.getClickTimeMs() > this.b) {
            return;
        }
        this.a.onExpand(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b() {
        return "Can't open url because webView wasn't clicked";
    }

    public void load(@Nullable String str, @NonNull String str2, @Nullable List<ScriptConfig> list) {
        List<ScriptConfig> m;
        this.d.set(false);
        if (list != null) {
            this.e.injectStart(str, list);
        }
        this.f.configure(list);
        m = c$$ExternalSyntheticBackport1.m(new Object[]{ScriptConfig.createInline("mraid", 0, MraidUtils.b(), true), ScriptConfig.createInline(JsBridgeHandler.SCRIPT_ID, 1, JsBridgeHandler.obtainJs())});
        BidMachineNetworkBridge.webviewLoadDataWithBaseURL(this.c, str, this.e.modifyHtml(MraidUtils.processRawHtml(str2), m), POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        applyLogLevel(MraidLog.logLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        Map<String, String> parseCommandUrl;
        MraidLog.d(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String b2;
                b2 = MraidWebViewController.b(str);
                return b2;
            }
        });
        try {
            parseCommandUrl = MraidUtils.parseCommandUrl(str);
        } catch (Throwable th) {
            MraidLog.e(TAG, th);
        }
        if (parseCommandUrl == null) {
            return;
        }
        String str2 = parseCommandUrl.get(f.b.g);
        if (str2 == null) {
            MraidLog.w(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a2;
                    a2 = MraidWebViewController.a();
                    return a2;
                }
            });
        } else {
            a(str2, parseCommandUrl);
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return "handleJsCommand - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d() {
        return "mraid.resize is not supported";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c() {
        return "url is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a() {
        return "handleJsCommand not found";
    }

    private void a(String str, Map map) {
        str.hashCode();
        switch (str) {
            case "playVideo":
                this.a.onPlayVideo((String) map.get("url"));
                break;
            case "openPrivacySheet":
                String str2 = (String) map.get("data");
                if (TextUtils.isEmpty(str2)) {
                    MraidLog.e(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            String e;
                            e = MraidWebViewController.e();
                            return e;
                        }
                    });
                    break;
                } else {
                    try {
                        this.a.onOpenPrivacySheet(new String(Base64.decode(str2, 2)));
                        break;
                    } catch (Throwable unused) {
                        MraidLog.e(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final Object mo4828invoke() {
                                String f;
                                f = MraidWebViewController.f();
                                return f;
                            }
                        });
                        return;
                    }
                }
            case "expand":
                d((String) map.get("url"));
                break;
            case "loaded":
                this.a.onLoaded();
                break;
            case "noFill":
                this.a.onError(IabError.noFIll("Fired noFill event from mraid.js"));
                break;
            case "resize":
                MraidLog.d(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        String d;
                        d = MraidWebViewController.d();
                        return d;
                    }
                });
                break;
            case "createCalendarEvent":
                this.a.onCalendarEvent((String) map.get("eventJSON"));
                break;
            case "open":
                String str3 = (String) map.get("url");
                if (TextUtils.isEmpty(str3)) {
                    MraidLog.e(TAG, new Function0() { // from class: io.bidmachine.iab.mraid.MraidWebViewController$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            String c2;
                            c2 = MraidWebViewController.c();
                            return c2;
                        }
                    });
                    break;
                } else {
                    c(str3);
                    break;
                }
            case "close":
                this.a.onClose();
                break;
            case "setOrientationProperties":
                MraidOrientationProperties mraidOrientationProperties = new MraidOrientationProperties(Boolean.parseBoolean((String) map.get("allowOrientationChange")), MraidOrientationProperties.forceOrientationFromString((String) map.get("forceOrientation")));
                this.j = mraidOrientationProperties;
                this.a.onOrientation(mraidOrientationProperties);
                break;
            case "storePicture":
                this.a.onStorePicture((String) map.get("url"));
                break;
            case "useCustomClose":
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("useCustomClose"));
                if (this.g != parseBoolean) {
                    this.g = parseBoolean;
                    this.a.onUseCustomClose(parseBoolean);
                    break;
                }
                break;
        }
    }
}
