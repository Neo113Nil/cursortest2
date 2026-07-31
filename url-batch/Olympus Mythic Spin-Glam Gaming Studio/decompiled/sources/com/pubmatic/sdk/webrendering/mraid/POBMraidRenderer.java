package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBUrlHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBAdVisibilityListener;
import com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

@MainThread
/* loaded from: classes15.dex */
public class POBMraidRenderer implements o, POBBannerRendering, POBHtmlRendererListener, POBObstructionUpdateListener, POBHTMLViewClient.OnRenderProcessGoneListener {
    private final String a;
    private final POBMraidController b;
    private final POBMraidBridge c;
    private final POBHTMLRenderer d;
    private POBAdRendererListener e;
    private POBUseCustomCloseListener f;
    private final POBAdViewContainer g;
    private boolean h;
    private View.OnLayoutChangeListener i;
    private POBAdVisibilityListener j;
    private POBHTMLMeasurementProvider k;
    private String l;
    private final Context m;
    private POBWebView n;
    private final POBOpenWrapJSBridge o;
    private POBAdDescriptor p;
    private POBUrlHandler q;
    private POBTrackerHandler r;
    private boolean s;
    private String t;
    private POBCTAOverlayHandler u;

    public interface POBCTAOverlayDataListener {
        void onCTAOverlayDataReceived(@Nullable POBCTAOverlayData pOBCTAOverlayData);
    }

    class a implements POBWebView.OnFocusChangedListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.view.POBWebView.OnFocusChangedListener
        public void onFocusChanged(boolean z) {
            if (POBMraidRenderer.this.j != null) {
                POBMraidRenderer.this.j.onVisibilityChange(z);
            }
        }
    }

    class b implements POBMeasurementProvider.POBScriptListener {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onFailedToReceiveMeasurementScript(int i) {
            POBLog.error("POBMraidRenderer", POBLogConstants.OMID_JS_SCRIPT_FAILURE, new Object[0]);
            POBMraidRenderer.this.d.loadHTML(this.a, POBMraidRenderer.this.l, this.b);
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onMeasurementScriptReceived(String str) {
            POBMraidRenderer.this.d.loadHTML("<script>" + str + "</script>" + this.a, POBMraidRenderer.this.l, this.b);
        }
    }

    class c implements POBViewabilityTracker.OnViewabilityChangedListener {
        final /* synthetic */ POBViewabilityTracker a;

        c(POBViewabilityTracker pOBViewabilityTracker) {
            this.a = pOBViewabilityTracker;
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker.OnViewabilityChangedListener
        public void onViewabilityChanged(boolean z) {
            if (z) {
                POBMraidRenderer.this.e();
                this.a.destroy();
            }
        }
    }

    class d implements POBCTAOverlayHandler.POBCTAOverlayListener {
        final /* synthetic */ POBCTAOverlayData a;

        d(POBCTAOverlayData pOBCTAOverlayData) {
            this.a = pOBCTAOverlayData;
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onClick() {
            POBLog.debug("POBMraidRenderer", POBLogConstants.MSG_CTA_OVERLAY_CLICKED, new Object[0]);
            POBMraidRenderer.this.handleClickThrough(this.a.getClickUrl(), this.a.getClickTrackers());
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onDismiss() {
            POBLog.debug("POBMraidRenderer", POBLogConstants.MSG_CTA_OVERLAY_DISMISSED, new Object[0]);
            POBMraidRenderer.this.b();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onShow() {
            if (POBMraidRenderer.this.g.getWatermarkView() != null) {
                POBMraidRenderer.this.g.getWatermarkView().bringToFront();
            }
            POBLog.debug("POBMraidRenderer", POBLogConstants.MSG_CTA_OVERLAY_PRESENTED, new Object[0]);
            POBMraidRenderer pOBMraidRenderer = POBMraidRenderer.this;
            pOBMraidRenderer.addFriendlyObstructions(pOBMraidRenderer.u.getCtaOverlayView(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
        }
    }

    class e implements View.OnClickListener {
        final /* synthetic */ POBAdDescriptor a;

        class a implements POBDsaHtmlContent.OnContentListener {
            a() {
            }

            @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
            public void onPageContentReceived(String str) {
                POBDsaInfoPresenterHelper.show(POBMraidRenderer.this.m, e.this.a, str);
            }
        }

        e(POBAdDescriptor pOBAdDescriptor) {
            this.a = pOBAdDescriptor;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBDsaHtmlContent.getHtmlContent(POBMraidRenderer.this.m, new a());
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMraidRenderer.this.h) {
                POBMraidRenderer.this.c.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.DEFAULT);
            }
            POBMraidRenderer.this.b.initProperties(POBMraidRenderer.this.c, POBMraidRenderer.this.h);
            POBMraidRenderer.this.h = false;
        }
    }

    class g implements View.OnLayoutChangeListener {
        g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            POBMraidRenderer.this.j();
        }
    }

    class h implements POBUrlHandler.UrlHandlerListener {
        h() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBMraidRenderer", "Error opening url %s", str);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBMraidRenderer.this.a(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            POBMraidRenderer.this.d();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            POBMraidRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            POBMraidRenderer.this.onLeavingApplication();
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMraidRenderer.this.k != null) {
                POBMraidRenderer.this.k.signalAdEvent(POBHTMLMeasurementProvider.POBHTMLAdEventType.IMPRESSION);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected POBMraidRenderer(@NonNull Context context, @NonNull String str, @NonNull POBAdViewContainer pOBAdViewContainer, int i2) {
        this.m = context;
        this.a = str;
        this.g = pOBAdViewContainer;
        this.n = pOBAdViewContainer.getAdView();
        this.s = "interstitial".equals(str);
        this.n.getSettings().setJavaScriptEnabled(true);
        this.n.getSettings().setCacheMode(2);
        this.n.setScrollBarStyle(0);
        this.o = new POBOpenWrapJSBridge(this.n);
        POBWebClient pOBWebClient = new POBWebClient(this);
        pOBWebClient.disableMultipleOnPageFinished(true);
        POBHTMLRenderer pOBHTMLRenderer = new POBHTMLRenderer(this.n, pOBWebClient);
        this.d = pOBHTMLRenderer;
        pOBHTMLRenderer.setRendererViewListener(this);
        POBMraidBridge pOBMraidBridge = new POBMraidBridge(pOBAdViewContainer);
        this.c = pOBMraidBridge;
        POBMraidController pOBMraidController = new POBMraidController(context, pOBMraidBridge, str, i2);
        this.b = pOBMraidController;
        pOBMraidController.setMraidControllerListener(this);
        pOBMraidController.addInlineVideoSupportToWebView(this.n);
        i();
        a(pOBMraidController);
    }

    @Nullable
    public static POBMraidRenderer createInstance(@NonNull Context context, @NonNull String str, int i2) {
        POBWebView createInstance = POBWebView.createInstance(context);
        if (createInstance != null) {
            return new POBMraidRenderer(context, str, new POBAdViewContainer(context, createInstance), i2);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    public void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.addFriendlyObstructions(view, pOBFriendlyObstructionPurpose);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void destroy() {
        invalidate();
        this.d.destroy();
        POBUrlHandler pOBUrlHandler = this.q;
        if (pOBUrlHandler != null) {
            pOBUrlHandler.destroy();
        }
    }

    public void fetchCreativeCTAOverlayData(@NonNull final POBCTAOverlayDataListener pOBCTAOverlayDataListener) {
        this.o.requestCTAOverlayData(new Function1() { // from class: com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a2;
                a2 = POBMraidRenderer.a(POBMraidRenderer.POBCTAOverlayDataListener.this, (JSONObject) obj);
                return a2;
            }
        });
    }

    public void handleClickThrough(@Nullable String str, @Nullable List<String> list) {
        POBAdDescriptor pOBAdDescriptor = this.p;
        if (pOBAdDescriptor != null) {
            a(pOBAdDescriptor.getClickTrackers());
        }
        if (list != null && !list.isEmpty()) {
            a(list);
        }
        b(str);
        f();
    }

    public void invalidate() {
        this.b.destroy();
        POBWebView pOBWebView = this.n;
        if (pOBWebView != null) {
            pOBWebView.removeOnLayoutChangeListener(this.i);
            this.n.setOnfocusChangedListener(null);
            this.n = null;
        }
        this.i = null;
        b();
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.finishAdSession();
            this.k = null;
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void invalidateExpiration() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public boolean isUserInteracted(boolean z) {
        boolean isUserInteracted = this.d.isUserInteracted();
        if (z) {
            this.d.setUserInteracted(false);
        }
        return isUserInteracted;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdInteractionStarted() {
        if (!this.s) {
            this.g.resizeAdInfoIcon(true);
        }
        c();
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdInteractionStopped() {
        if (!this.s) {
            this.g.resizeAdInfoIcon(false);
        }
        d();
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdUnload() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdUnload();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdViewChanged(@NonNull View view) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.setTrackView(view);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onLeavingApplication() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onMRAIDAdClick() {
        POBAdDescriptor pOBAdDescriptor = this.p;
        if (pOBAdDescriptor != null) {
            a(pOBAdDescriptor.getClickTrackers());
        }
        f();
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onOpen(@Nullable String str) {
        handleClickThrough(str, null);
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.OnRenderProcessGoneListener
    public void onRenderProcessGone() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderProcessGone();
        }
        invalidate();
        this.d.invalidateWebView();
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewClicked(@Nullable String str) {
        handleClickThrough(str, null);
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRendered(@NonNull View view) {
        Trace.endSection();
        if (!this.s) {
            this.b.close();
        }
        if (POBCommonConstants.BANNER_PLACEMENT_TYPE.equals(this.a) && a()) {
            fetchCreativeCTAOverlayData(new POBCTAOverlayDataListener() { // from class: com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer$$ExternalSyntheticLambda0
                @Override // com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer.POBCTAOverlayDataListener
                public final void onCTAOverlayDataReceived(POBCTAOverlayData pOBCTAOverlayData) {
                    POBMraidRenderer.this.a(pOBCTAOverlayData);
                }
            });
        }
        this.c.resetPropertyMap();
        this.h = true;
        if (!this.s) {
            j();
        }
        h();
        l();
        POBAdDescriptor pOBAdDescriptor = this.p;
        if (pOBAdDescriptor != null && !pOBAdDescriptor.isCompanion()) {
            a(this.p);
        }
        if (this.e != null) {
            a(this.m);
            String str = this.t;
            if (str != null) {
                a(str);
            }
            this.e.onAdRender(this.g, this.p);
            POBAdDescriptor pOBAdDescriptor2 = this.p;
            if (pOBAdDescriptor2 != null && pOBAdDescriptor2.getImpressionCountingMethod() == POBImpressionCountingMethod.ON_LOAD) {
                e();
            }
            POBAdDescriptor pOBAdDescriptor3 = this.p;
            this.e.onAdReadyToRefresh(pOBAdDescriptor3 != null ? pOBAdDescriptor3.getRefreshInterval() : 0);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRenderingFailed(@NonNull POBError pOBError) {
        Trace.endSection();
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    public void removeFriendlyObstructions(@Nullable View view) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.removeFriendlyObstructions(view);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        Trace.beginSection("POB Mraid Parsing");
        this.p = pOBAdDescriptor;
        if (pOBAdDescriptor.getImpressionCountingMethod() == POBImpressionCountingMethod.ONE_PX_VIEWABLE) {
            g();
        }
        this.b.addCommandHandlers(this.c, false, this.p.isCompanion());
        JSONArray adomains = pOBAdDescriptor.getAdomains();
        if (adomains != null && !adomains.isNull(0)) {
            this.b.setAdomain(adomains.optString(0));
        }
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        boolean isCompanion = pOBAdDescriptor.isCompanion();
        if (isCompanion && !POBUtils.isNullOrEmpty(renderableContent) && renderableContent.toLowerCase().startsWith("http")) {
            this.d.loadHTML(null, renderableContent, isCompanion);
            return;
        }
        Context applicationContext = this.m.getApplicationContext();
        POBDeviceInfo deviceInfo = POBInstanceProvider.getDeviceInfo(applicationContext);
        String str = POBMRAIDUtil.getMRAIDEnvironment(POBInstanceProvider.getAppInfo(applicationContext).getPackageName(), deviceInfo.getAdvertisingID(), deviceInfo.getLmtEnabled(), POBInstanceProvider.getSdkConfig().isCoppa()) + renderableContent;
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.omidJsServiceScript(this.m.getApplicationContext(), new b(str, isCompanion));
        } else {
            this.d.loadHTML(str, this.l, isCompanion);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener) {
        this.e = pOBAdRendererListener;
    }

    public void setBaseURL(@Nullable String str) {
        this.l = str;
    }

    public void setCustomCloseListener(@Nullable POBUseCustomCloseListener pOBUseCustomCloseListener) {
        this.f = pOBUseCustomCloseListener;
    }

    public void setHTMLMeasurementListener(POBHTMLMeasurementProvider pOBHTMLMeasurementProvider) {
        this.k = pOBHTMLMeasurementProvider;
    }

    public void setRenderingTimeout(int i2) {
        this.d.setRenderingTimeout(i2);
    }

    public void setTrackerHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.r = pOBTrackerHandler;
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setWatermark(@Nullable String str) {
        this.t = str;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void shouldUseCustomClose(boolean z) {
        POBLog.debug("POBMraidRenderer", "MRAID useCustomClose: %s", Boolean.valueOf(z));
        POBUseCustomCloseListener pOBUseCustomCloseListener = this.f;
        if (pOBUseCustomCloseListener != null) {
            pOBUseCustomCloseListener.useCustomClose(z);
        }
    }

    public void signalImpressionEvent() {
        POBWebView pOBWebView;
        if (this.k == null || (pOBWebView = this.n) == null) {
            return;
        }
        pOBWebView.postDelayed(new i(), 1000L);
    }

    private void b(String str) {
        if (this.q == null || POBUtils.isNullOrEmpty(str) || POBCommonConstants.PLACEHOLDER_CLICK_THROUGH.equals(str)) {
            POBLog.warn("POBMraidRenderer", "Click through url is missing.", new Object[0]);
        } else {
            this.q.open(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdImpression();
        }
    }

    private void f() {
        POBAdRendererListener pOBAdRendererListener = this.e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderAdClick();
        }
    }

    private void g() {
        POBWebView pOBWebView = this.n;
        if (pOBWebView != null) {
            POBViewabilityTracker pOBViewabilityTracker = new POBViewabilityTracker((View) pOBWebView, 1);
            pOBViewabilityTracker.setAllowViewTreeObserverRegistration(true);
            pOBViewabilityTracker.setOnExposureChangeWithThresholdListener(new c(pOBViewabilityTracker));
        }
    }

    private void h() {
        if (this.i != null || this.n == null) {
            POBLog.debug("POBMraidRenderer", "layoutChangeListener null", new Object[0]);
            return;
        }
        g gVar = new g();
        this.i = gVar;
        this.n.addOnLayoutChangeListener(gVar);
    }

    private void i() {
        POBWebView pOBWebView = this.n;
        if (pOBWebView != null) {
            pOBWebView.setOnfocusChangedListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBWebView pOBWebView = this.n;
        if (pOBWebView != null) {
            pOBWebView.post(new f());
        }
    }

    private void k() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.u;
        if (pOBCTAOverlayHandler == null) {
            return;
        }
        POBCTAOverlayData ctaOverlayData = pOBCTAOverlayHandler.getCtaOverlayData();
        this.u.setCTAOverlayListener(new d(ctaOverlayData));
        this.u.showWithDelay(ctaOverlayData.getDelay());
    }

    private void l() {
        POBWebView pOBWebView;
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
        if (pOBHTMLMeasurementProvider == null || (pOBWebView = this.n) == null) {
            return;
        }
        pOBHTMLMeasurementProvider.startAdSession(pOBWebView);
        this.k.signalAdEvent(POBHTMLMeasurementProvider.POBHTMLAdEventType.LOADED);
        if (this.s) {
            return;
        }
        signalImpressionEvent();
    }

    private void a(POBAdVisibilityListener pOBAdVisibilityListener) {
        this.j = pOBAdVisibilityListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit a(POBCTAOverlayDataListener pOBCTAOverlayDataListener, JSONObject jSONObject) {
        POBCTAOverlayData pOBCTAOverlayData;
        if (jSONObject != null) {
            POBLog.debug("POBMraidRenderer", "CTA data from creative: %s", jSONObject);
            pOBCTAOverlayData = POBCTAOverlayData.parse(jSONObject);
        } else {
            pOBCTAOverlayData = null;
        }
        pOBCTAOverlayDataListener.onCTAOverlayDataReceived(pOBCTAOverlayData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.u;
        if (pOBCTAOverlayHandler != null) {
            removeFriendlyObstructions(pOBCTAOverlayHandler.getCtaOverlayView());
            this.u.cleanUp();
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list) {
        POBTrackerHandler pOBTrackerHandler = this.r;
        if (pOBTrackerHandler != null) {
            pOBTrackerHandler.sendTrackers(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(POBCTAOverlayData pOBCTAOverlayData) {
        POBAdDescriptor pOBAdDescriptor = this.p;
        POBCTAOverlayHandler resolveAndGetCTAOverlayHandler = POBCTAOverlayHandler.resolveAndGetCTAOverlayHandler(pOBCTAOverlayData, pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null, this.g, true);
        this.u = resolveAndGetCTAOverlayHandler;
        if (resolveAndGetCTAOverlayHandler != null) {
            k();
        }
    }

    private void a(POBAdDescriptor pOBAdDescriptor) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider;
        this.g.addAdInfoIcon(this.s, pOBAdDescriptor.isVideo(), new e(pOBAdDescriptor));
        ImageButton adInfoIcon = this.g.getAdInfoIcon();
        if (adInfoIcon == null || (pOBHTMLMeasurementProvider = this.k) == null) {
            return;
        }
        pOBHTMLMeasurementProvider.addFriendlyObstructions(adInfoIcon, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
    }

    private void a(String str) {
        this.g.addWatermark(str);
        ImageView watermarkView = this.g.getWatermarkView();
        if (watermarkView != null) {
            POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.k;
            if (pOBHTMLMeasurementProvider != null) {
                pOBHTMLMeasurementProvider.addFriendlyObstructions(watermarkView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
            }
            watermarkView.bringToFront();
        }
    }

    private void a(Context context) {
        this.q = new POBUrlHandler(context, new h());
    }

    private boolean a() {
        POBAdDescriptor pOBAdDescriptor = this.p;
        if (pOBAdDescriptor == null) {
            return false;
        }
        int contentWidth = pOBAdDescriptor.getContentWidth();
        POBAdSize pOBAdSize = POBAdSize.BANNER_SIZE_300x250;
        return contentWidth == pOBAdSize.getAdWidth() && this.p.getContentHeight() == pOBAdSize.getAdHeight();
    }
}
