package com.pubmatic.sdk.openwrap.core.interstitial;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.ui.POBFullScreenRendererListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.common.ui.POBVideoAdEventListener;
import com.pubmatic.sdk.common.utility.POBDeepLinkUtil;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBBannerConfig;
import com.pubmatic.sdk.webrendering.ui.POBCustomProductPageView;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class POBInterstitialRenderer implements POBInterstitialRendering, POBVideoRenderingListener, POBAdRendererListener, POBUseCustomCloseListener {
    private POBBannerRendering a;
    private POBFullScreenRendererListener b;
    private POBVideoAdEventListener c;
    private int d;
    private POBAdDescriptor e;
    private final Context f;
    private View g;
    private final RendererBuilder h;
    private POBFullScreenActivityListener i;
    private POBBannerConfig j;
    private POBMraidViewContainer k;
    private POBTimeoutHandler l;
    private long m = 0;
    private String n;
    private POBTrackerHandler o;
    private POBMraidRenderer p;
    private Boolean q;
    private boolean r;
    private POBCTAOverlayHandler s;
    private boolean t;

    public interface RendererBuilder {
        @Nullable
        POBBannerRendering build(@NonNull POBAdDescriptor pOBAdDescriptor, int i);
    }

    class a implements POBOnSkipOptionUpdateListener {
        a() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener
        public void onSkipOptionUpdate(boolean z) {
            if (POBInterstitialRenderer.this.j == null || !POBInterstitialRenderer.this.j.isBackButtonEnabled()) {
                return;
            }
            POBInterstitialRenderer.this.a(z);
        }
    }

    class b implements POBFullScreenActivityListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onCreate(Activity activity) {
            View view = this.a;
            if (!(view instanceof POBAdViewContainer)) {
                if (view instanceof POBVastPlayer) {
                    ((POBVastPlayer) view).setBaseContext(activity);
                    return;
                }
                return;
            }
            ((POBAdViewContainer) view).getAdView().setBaseContext(activity);
            if (POBInterstitialRenderer.this.k != null) {
                POBInterstitialRenderer.this.m = System.currentTimeMillis();
                POBInterstitialRenderer pOBInterstitialRenderer = POBInterstitialRenderer.this;
                pOBInterstitialRenderer.a(pOBInterstitialRenderer.k);
                POBInterstitialRenderer.this.c();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onDestroy() {
            View view = this.a;
            if (view instanceof POBAdViewContainer) {
                ((POBAdViewContainer) view).getAdView().setBaseContext(POBInterstitialRenderer.this.f.getApplicationContext());
            } else if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(POBInterstitialRenderer.this.f.getApplicationContext());
            }
            POBInterstitialRenderer.this.k();
            POBInterstitialRenderer.this.onAdInteractionStopped();
        }
    }

    class c implements POBMraidViewContainerListener {
        final /* synthetic */ POBMraidViewContainer a;

        c(POBMraidViewContainer pOBMraidViewContainer) {
            this.a = pOBMraidViewContainer;
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onClose() {
            POBInterstitialRenderer.this.b();
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onForward() {
            POBInterstitialRenderer.this.f();
            POBInterstitialRenderer.this.n();
            this.a.bringWatermarkToFront();
        }
    }

    class d implements POBTimeoutHandler.POBTimeoutHandlerListener {
        final /* synthetic */ POBMraidViewContainer a;

        d(POBMraidViewContainer pOBMraidViewContainer) {
            this.a = pOBMraidViewContainer;
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBLog.debug("POBInterstitialRenderer", "Custom close delay timer exhausted", new Object[0]);
            POBInterstitialRenderer.this.b(this.a, 2000L);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBInterstitialRenderer.this.e != null) {
                POBDeepLinkUtil.triggerDeepLink(POBInterstitialRenderer.this.f, String.format(POBCommonConstants.PLAY_STORE_URL, POBInterstitialRenderer.this.e.getBundle()), true);
                POBInterstitialRenderer.this.d();
                POBInterstitialRenderer.this.onRenderAdClick();
            }
        }
    }

    class f implements View.OnClickListener {

        class a implements POBDsaHtmlContent.OnContentListener {
            a() {
            }

            @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
            public void onPageContentReceived(String str) {
                POBDsaInfoPresenterHelper.show(POBInterstitialRenderer.this.f, POBInterstitialRenderer.this.e, str);
            }
        }

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBDsaHtmlContent.getHtmlContent(POBInterstitialRenderer.this.f, new a());
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInterstitialRenderer.this.b();
        }
    }

    class h implements POBCTAOverlayHandler.POBCTAOverlayListener {
        final /* synthetic */ POBCTAOverlayData a;

        h(POBCTAOverlayData pOBCTAOverlayData) {
            this.a = pOBCTAOverlayData;
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onClick() {
            POBLog.debug("POBInterstitialRenderer", POBLogConstants.MSG_CTA_OVERLAY_CLICKED, new Object[0]);
            POBInterstitialRenderer.this.a(this.a);
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onDismiss() {
            POBLog.debug("POBInterstitialRenderer", POBLogConstants.MSG_CTA_OVERLAY_DISMISSED, new Object[0]);
            POBInterstitialRenderer.this.j();
            POBInterstitialRenderer.this.e();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onShow() {
            POBLog.debug("POBInterstitialRenderer", POBLogConstants.MSG_CTA_OVERLAY_PRESENTED, new Object[0]);
            if (POBInterstitialRenderer.this.k != null) {
                POBInterstitialRenderer.this.k.bringWatermarkToFront();
            }
            if (POBInterstitialRenderer.this.p == null || POBInterstitialRenderer.this.s == null) {
                return;
            }
            POBInterstitialRenderer.this.p.addFriendlyObstructions(POBInterstitialRenderer.this.s.getCtaOverlayView(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
        }
    }

    public POBInterstitialRenderer(@NonNull Context context, @NonNull RendererBuilder rendererBuilder) {
        this.f = context;
        this.h = rendererBuilder;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void destroy() {
        k();
        g();
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NonNull POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
        POBVideoAdEventListener pOBVideoAdEventListener = this.c;
        if (pOBVideoAdEventListener != null) {
            pOBVideoAdEventListener.onVideoAdEvent(pOBVideoAdEventType);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdExpired();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        if (this.b != null && this.d == 0) {
            i();
            this.b.onAdInteractionStarted();
        }
        this.d++;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        POBMraidViewContainer pOBMraidViewContainer;
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            if (!(this.a instanceof POBMraidRenderer) || !a() || (pOBMraidViewContainer = this.k) == null) {
                if (this.b != null) {
                    destroy();
                    this.b.onAdInteractionStopped();
                    return;
                }
                return;
            }
            pOBMraidViewContainer.hideSkipBtn();
            f();
            n();
            this.k.bringWatermarkToFront();
            this.d++;
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.g = view;
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdRender(pOBAdDescriptor);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdUnload();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        Boolean bool;
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdClicked();
        }
        if (this.k == null || (bool = this.q) == null || bool.booleanValue()) {
            return;
        }
        this.k.onAdViewClicked();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onRenderProcessGone();
        }
        g();
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean z) {
        a(z);
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        String str;
        this.e = pOBAdDescriptor;
        POBLog.debug("POBInterstitialRenderer", POBLogConstants.MSG_RENDERING_ON_START, new Object[0]);
        if (pOBAdDescriptor.getRenderableContent() != null) {
            POBBannerRendering build = this.h.build(pOBAdDescriptor, hashCode());
            this.a = build;
            if (build != null) {
                build.setAdRendererListener(this);
                if (pOBAdDescriptor.isVideo() && (str = this.n) != null) {
                    this.a.setWatermark(str);
                }
                this.a.renderAd(pOBAdDescriptor);
                POBBannerRendering pOBBannerRendering = this.a;
                if (pOBBannerRendering instanceof POBMraidRenderer) {
                    ((POBMraidRenderer) pOBBannerRendering).setCustomCloseListener(this);
                    return;
                }
                return;
            }
        }
        POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
        if (pOBFullScreenRendererListener != null) {
            pOBFullScreenRendererListener.onAdRenderingFailed(new POBError(1009, POBLogConstants.MSG_RENDERING_FAILED_ERROR + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setAdRendererListener(@Nullable POBFullScreenRendererListener pOBFullScreenRendererListener) {
        this.b = pOBFullScreenRendererListener;
    }

    public void setTrackerHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.o = pOBTrackerHandler;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setVideoAdEventListener(@Nullable POBVideoAdEventListener pOBVideoAdEventListener) {
        this.c = pOBVideoAdEventListener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setWatermark(@NonNull String str) {
        this.n = str;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void show(int i) {
        a(i);
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener
    public void useCustomClose(boolean z) {
        l();
        this.q = Boolean.valueOf(z);
        long currentTimeMillis = System.currentTimeMillis() - this.m;
        this.m = currentTimeMillis;
        POBMraidViewContainer pOBMraidViewContainer = this.k;
        if (pOBMraidViewContainer != null) {
            b(pOBMraidViewContainer, Math.max(0L, currentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBMraidViewContainer pOBMraidViewContainer, long j) {
        if (this.r) {
            return;
        }
        this.r = true;
        Boolean bool = this.q;
        boolean z = bool != null && bool.booleanValue();
        this.q = Boolean.valueOf(z);
        pOBMraidViewContainer.setCustomCloseEnabled(z);
        if (this.q.booleanValue()) {
            a(pOBMraidViewContainer, j);
        } else {
            pOBMraidViewContainer.handleSkipTimer(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBMraidRenderer pOBMraidRenderer;
        if (this.k == null || (pOBMraidRenderer = this.p) == null) {
            return;
        }
        pOBMraidRenderer.fetchCreativeCTAOverlayData(new POBMraidRenderer.POBCTAOverlayDataListener() { // from class: com.pubmatic.sdk.openwrap.core.interstitial.POBInterstitialRenderer$$ExternalSyntheticLambda0
            @Override // com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer.POBCTAOverlayDataListener
            public final void onCTAOverlayDataReceived(POBCTAOverlayData pOBCTAOverlayData) {
                POBInterstitialRenderer.this.b(pOBCTAOverlayData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBTrackerHandler pOBTrackerHandler;
        POBAdDescriptor pOBAdDescriptor = this.e;
        if (pOBAdDescriptor == null || (pOBTrackerHandler = this.o) == null) {
            return;
        }
        pOBTrackerHandler.sendTrackers(pOBAdDescriptor.getClickTrackers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.s != null) {
            if (!a() || this.t) {
                h();
            } else {
                this.s.hide();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.s;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.hide();
            this.s.invalidateTimer();
        }
    }

    private void g() {
        POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(hashCode()));
        this.i = null;
        this.r = false;
        this.q = Boolean.FALSE;
        this.t = false;
        l();
        h();
        b();
    }

    private void h() {
        if (this.s != null) {
            j();
            this.s.cleanUp();
            this.s = null;
        }
    }

    private void i() {
        POBBannerRendering pOBBannerRendering = this.a;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.invalidateExpiration();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBCTAOverlayHandler pOBCTAOverlayHandler;
        POBMraidRenderer pOBMraidRenderer = this.p;
        if (pOBMraidRenderer == null || (pOBCTAOverlayHandler = this.s) == null) {
            return;
        }
        pOBMraidRenderer.removeFriendlyObstructions(pOBCTAOverlayHandler.getCtaOverlayView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBBannerRendering pOBBannerRendering = this.a;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.destroy();
            this.a = null;
        }
    }

    private void l() {
        POBTimeoutHandler pOBTimeoutHandler = this.l;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.l = null;
        }
    }

    private void m() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.s;
        if (pOBCTAOverlayHandler == null) {
            return;
        }
        POBCTAOverlayData ctaOverlayData = pOBCTAOverlayHandler.getCtaOverlayData();
        this.s.setCTAOverlayListener(new h(ctaOverlayData));
        this.s.showWithDelay(ctaOverlayData.getDelay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        POBCustomProductPageView pOBCustomProductPageView = new POBCustomProductPageView(this.f);
        pOBCustomProductPageView.setInstallButtonClickListener(new e());
        pOBCustomProductPageView.enableAdInfoBtn(new f());
        pOBCustomProductPageView.setCloseBtnClickListener(new g());
        POBMraidViewContainer pOBMraidViewContainer = this.k;
        if (pOBMraidViewContainer != null) {
            this.t = true;
            pOBMraidViewContainer.addView(pOBCustomProductPageView);
            POBMraidRenderer pOBMraidRenderer = this.p;
            if (pOBMraidRenderer != null) {
                pOBMraidRenderer.addFriendlyObstructions(pOBCustomProductPageView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
            }
            POBAdDescriptor pOBAdDescriptor = this.e;
            POBCTAOverlayData cTAOverlayData = pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null;
            POBCTAOverlayHandler pOBCTAOverlayHandler = this.s;
            if (pOBCTAOverlayHandler == null || cTAOverlayData == null) {
                return;
            }
            pOBCTAOverlayHandler.showWithDelay(cTAOverlayData.getEndcardDelay());
        }
    }

    private void a(int i) {
        View view;
        POBLog.info("POBInterstitialRenderer", "showInterstitialAd", new Object[0]);
        POBAdDescriptor pOBAdDescriptor = this.e;
        if (pOBAdDescriptor != null && (view = this.g) != null) {
            a(pOBAdDescriptor, view);
            POBAdViewCacheService.AdViewConfig storedAdView = POBInstanceProvider.getAdViewCacheService().getStoredAdView(Integer.valueOf(hashCode()));
            if (storedAdView != null) {
                POBBannerRendering pOBBannerRendering = this.a;
                if (pOBBannerRendering instanceof POBMraidRenderer) {
                    this.p = (POBMraidRenderer) pOBBannerRendering;
                    POBMraidViewContainer pOBMraidViewContainer = (POBMraidViewContainer) storedAdView.getAdView();
                    this.k = pOBMraidViewContainer;
                    pOBMraidViewContainer.setEnableSkipTimer(true);
                    this.k.setObstructionUpdateListener(this.p);
                    POBBannerConfig createBannerConfig = POBBannerConfig.ConfigBuilder.createBannerConfig(this.e.getRawBid(), "interstitial");
                    this.j = createBannerConfig;
                    int skipAfter = createBannerConfig.getSkipAfter();
                    if (skipAfter > 0) {
                        this.k.configureSkippability(skipAfter);
                    }
                    this.k.setSkipOptionUpdateListener(new a());
                    this.p.signalImpressionEvent();
                }
                try {
                    POBFullScreenActivity.startFullScreenActivity(this.f, i, this.e, R.style.POBBlackTheme, hashCode());
                    onAdInteractionStarted();
                    return;
                } catch (Exception e2) {
                    POBLog.error("POBInterstitialRenderer", "Unable to start full screen activity. Error: %s", e2.getMessage());
                    POBFullScreenRendererListener pOBFullScreenRendererListener = this.b;
                    if (pOBFullScreenRendererListener != null) {
                        pOBFullScreenRendererListener.onAdRenderingFailed(new POBError(1009, String.format(POBLogConstants.MSG_AD_SHOW_ERROR, "interstitial") + e2.getMessage()));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        String str = "Can not show interstitial for descriptor: " + this.e;
        POBLog.error("POBInterstitialRenderer", str, new Object[0]);
        POBFullScreenRendererListener pOBFullScreenRendererListener2 = this.b;
        if (pOBFullScreenRendererListener2 != null) {
            pOBFullScreenRendererListener2.onAdRenderingFailed(new POBError(1009, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBFullScreenActivity.closeActivity(this.f, hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(POBCTAOverlayData pOBCTAOverlayData) {
        POBAdDescriptor pOBAdDescriptor = this.e;
        POBCTAOverlayHandler resolveAndGetCTAOverlayHandler = POBCTAOverlayHandler.resolveAndGetCTAOverlayHandler(pOBCTAOverlayData, pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null, this.k, false);
        this.s = resolveAndGetCTAOverlayHandler;
        if (resolveAndGetCTAOverlayHandler != null) {
            m();
        }
    }

    private void a(POBAdDescriptor pOBAdDescriptor, View view) {
        ViewGroup viewGroup;
        this.i = new b(view);
        if (pOBAdDescriptor.isVideo()) {
            viewGroup = (ViewGroup) view;
        } else {
            POBMraidViewContainer pOBMraidViewContainer = new POBMraidViewContainer(this.f.getApplicationContext(), (ViewGroup) view, !POBUtils.isNullOrEmpty(pOBAdDescriptor.getBundle()));
            String str = this.n;
            if (str != null) {
                pOBMraidViewContainer.setWatermarkView(POBUIUtil.createWatermarkView(this.f, str));
            }
            pOBMraidViewContainer.setMraidViewContainerListener(new c(pOBMraidViewContainer));
            viewGroup = pOBMraidViewContainer;
        }
        POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode()), new POBAdViewCacheService.AdViewConfig(viewGroup, this.i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBMraidViewContainer pOBMraidViewContainer) {
        if (this.r) {
            return;
        }
        Boolean bool = this.q;
        if (bool != null && bool.booleanValue()) {
            this.r = true;
            pOBMraidViewContainer.setCustomCloseEnabled(true);
            a(pOBMraidViewContainer, 0L);
        } else {
            l();
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new d(pOBMraidViewContainer));
            this.l = pOBTimeoutHandler;
            pOBTimeoutHandler.start(2000L);
            POBLog.debug("POBInterstitialRenderer", "Custom close delay timer started with 2 sec delay", new Object[0]);
        }
    }

    private void a(POBMraidViewContainer pOBMraidViewContainer, long j) {
        pOBMraidViewContainer.handleSkipTimer(Math.max(TimeUnit.SECONDS.toMillis(this.j != null ? r1.getSkipAfter() : 0L), 20000L) - j);
    }

    private boolean a() {
        POBAdDescriptor pOBAdDescriptor = this.e;
        return (pOBAdDescriptor == null || POBUtils.isNullOrEmpty(pOBAdDescriptor.getBundle())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        POBFullScreenActivity.updateBackButtonState(this.f, hashCode(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBCTAOverlayData pOBCTAOverlayData) {
        if (pOBCTAOverlayData.getClickUrl() != null) {
            POBBannerRendering pOBBannerRendering = this.a;
            if (pOBBannerRendering instanceof POBMraidRenderer) {
                ((POBMraidRenderer) pOBBannerRendering).handleClickThrough(pOBCTAOverlayData.getClickUrl(), pOBCTAOverlayData.getClickTrackers());
            }
        }
    }
}
