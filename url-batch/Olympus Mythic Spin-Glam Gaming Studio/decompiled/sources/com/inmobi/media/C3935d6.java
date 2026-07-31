package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.yandex.div.core.DivActionHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3935d6 extends D2 implements Eh {
    public long b;
    public final String c;
    public final String d;
    public final String e;
    public final Function1 f;
    public final InterfaceC4466x9 g;
    public C3909c6 h;
    public final String i;
    public C4152lb j;
    public boolean k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3935d6(Context context, long j, String placementType, String impressionId, String creativeId, Function1 onLpLifecycleEvent, InterfaceC4466x9 interfaceC4466x9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.b = j;
        this.c = placementType;
        this.d = impressionId;
        this.e = creativeId;
        this.f = onLpLifecycleEvent;
        this.g = interfaceC4466x9;
        this.i = C3935d6.class.getSimpleName();
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final Unit a(C3935d6 c3935d6) {
        InterfaceC3883b6 interfaceC3883b6;
        ViewParent parent = c3935d6.getParent();
        Y5 y5 = parent instanceof Y5 ? (Y5) parent : null;
        if (y5 != null && (interfaceC3883b6 = y5.d) != null) {
            C c = ((U8) interfaceC3883b6).a.b;
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = c instanceof GestureDetectorOnGestureListenerC4476xi ? (GestureDetectorOnGestureListenerC4476xi) c : null;
            if (gestureDetectorOnGestureListenerC4476xi != null) {
                gestureDetectorOnGestureListenerC4476xi.D();
            }
        }
        return Unit.INSTANCE;
    }

    private final AdConfig getAdConfig() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getRendering();
    }

    private void safedk_webview_d6_webviewLoadData_172d49d32092f6f80826f3dca3960029(String p1, String p2, String p3) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/d6;->safedk_webview_d6_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", this, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", com.safedk.android.utils.h.i);
            if (z) {
                CreativeInfoManager.a((String) null, p1, this, com.safedk.android.utils.h.i);
                SafeDKWebAppInterface.a(com.safedk.android.utils.h.i, (WebView) this, p1, true);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadData exception", th);
        }
        super.loadData(p1, p2, p3);
    }

    private void safedk_webview_d6_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String p1) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/d6;->safedk_webview_d6_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", p1, ", WebView address : ", toString(), ", SDK_PACKAGE_NAME = ", com.safedk.android.utils.h.i);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(p1) && !p1.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(com.safedk.android.utils.h.i, this, p1);
                    AdNetworkDiscovery j = CreativeInfoManager.j(com.safedk.android.utils.h.i);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(p1, (String) null, this, com.safedk.android.utils.h.i);
                    }
                    SafeDKWebAppInterface.a(com.safedk.android.utils.h.i, (WebView) this, p1, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        super.loadUrl(p1);
    }

    @Override // com.inmobi.media.Eh
    public final boolean c() {
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.D2
    public final C4048hb d() {
        C4074ib c4074ib = new C4074ib(true, null, getAdConfig().getCctEnabled(), 18);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new C4048hb(context, c4074ib, null, this, null, this.g, 140);
    }

    @Override // com.inmobi.media.D2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void e() {
        C3909c6 c3909c6 = new C3909c6("IN_CUSTOM_EXPAND", new Function0() { // from class: com.inmobi.media.d6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3935d6.a(C3935d6.this);
            }
        }, new Function1() { // from class: com.inmobi.media.d6$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3935d6.a(C3935d6.this, (JSONObject) obj);
            }
        }, new Function2() { // from class: com.inmobi.media.d6$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3935d6.a(C3935d6.this, (String) obj, (Map) obj2);
            }
        }, this.g, null, 0L);
        setWebViewClient(c3909c6);
        this.h = c3909c6;
    }

    @Nullable
    public final C4152lb getLandingPageTelemetryControlInfo() {
        return this.j;
    }

    @Override // com.inmobi.media.Eh
    public long getViewTouchTimestamp() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        Intrinsics.checkNotNullParameter(data, "data");
        safedk_webview_d6_webviewLoadData_172d49d32092f6f80826f3dca3960029(data, str, str2);
        C3909c6 c3909c6 = this.h;
        if (c3909c6 != null) {
            c3909c6.d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        safedk_webview_d6_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(url);
        C3909c6 c3909c6 = this.h;
        if (c3909c6 != null) {
            c3909c6.d = true;
        }
    }

    @Override // com.inmobi.media.D2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.l) {
            this.l = true;
            Function1 function1 = this.f;
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            function1.invoke(C3947di.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.k) {
            this.k = true;
            Function1 function1 = this.f;
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            function1.invoke(C3947di.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(@Nullable C4152lb c4152lb) {
        this.j = c4152lb;
        C3909c6 c3909c6 = this.h;
        if (c3909c6 != null) {
            c3909c6.k = c4152lb;
            c3909c6.l = new C4100jb(c4152lb, c3909c6);
        }
    }

    public void setViewTouchTimestamp(long j) {
        this.b = j;
    }

    public static final Unit a(C3935d6 c3935d6, JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3935d6.f.invoke(it);
        return Unit.INSTANCE;
    }

    public static final Unit a(C3935d6 c3935d6, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        ViewParent parent = c3935d6.getParent();
        Y5 y5 = parent instanceof Y5 ? (Y5) parent : null;
        if (y5 != null) {
            Intrinsics.checkNotNullParameter(trackerName, "trackerName");
            Intrinsics.checkNotNullParameter(macros, "macros");
            InterfaceC3883b6 interfaceC3883b6 = y5.d;
            if (interfaceC3883b6 != null) {
                Intrinsics.checkNotNullParameter(trackerName, "trackerName");
                Intrinsics.checkNotNullParameter(macros, "macros");
                C c = ((U8) interfaceC3883b6).a.b;
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = c instanceof GestureDetectorOnGestureListenerC4476xi ? (GestureDetectorOnGestureListenerC4476xi) c : null;
                if (gestureDetectorOnGestureListenerC4476xi != null) {
                    gestureDetectorOnGestureListenerC4476xi.b(trackerName, macros);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Eh
    public final boolean a() {
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.Eh
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.e);
        hashMap.put(DivActionHandler.DivActionReason.TRIGGER, api);
        hashMap.put("impressionId", this.d);
        hashMap.put("adType", this.c);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("BlockAutoRedirection", hashMap, EnumC4530zk.a);
    }
}
