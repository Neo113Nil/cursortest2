package com.pubmatic.sdk.video.renderer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUrlHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.player.POBVastPlayerListener;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker;
import java.util.List;

/* loaded from: classes5.dex */
public class POBVideoRenderer implements POBVideoRendering, POBVastPlayerListener, POBViewabilityTracker.OnViewabilityChangedListener, POBOnSkipOptionUpdateListener {
    public static final float VIEWABILITY_THRESHOLD_PERCENT_FOR_BANNER = 50.0f;
    private final String a;
    private POBAdRendererListener b;
    private POBVideoRenderingListener c;
    private POBVideoSkipEventListener d;
    private long e;
    private POBTimeoutHandler f;
    private final POBVastPlayer g;
    private POBVideoMeasurementProvider h;
    private final POBViewabilityTracker i;
    private final POBTrackerHandler j;
    private POBAdDescriptor k;
    private POBUrlHandler l;
    private POBUrlHandler m;

    class a implements POBTimeoutHandler.POBTimeoutHandlerListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBVideoRenderer.this.b();
        }
    }

    class b implements POBUrlHandler.UrlHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBVideoRenderer", "Unable to open icon click url :" + str, new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBVideoRenderer.this.j.sendTrackers(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            POBVideoRenderer.this.d();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            POBVideoRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            POBVideoRenderer.this.e();
        }
    }

    class c implements POBDsaHtmlContent.OnContentListener {
        c() {
        }

        @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
        public void onPageContentReceived(String str) {
            POBDsaInfoPresenterHelper.show(POBVideoRenderer.this.g.getContext(), POBVideoRenderer.this.k, str);
        }
    }

    class d implements Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        d(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVideoRenderer.this.h != null) {
                POBVideoRenderer.this.h.setTrackView(POBVideoRenderer.this.g);
                POBVideoRenderer.this.h.impressionOccurred();
                POBVideoRenderer.this.h.start(this.a, this.b);
                POBVideoRenderer.this.h.signalPlayerStateChange(POBCommonConstants.BANNER_PLACEMENT_TYPE.equals(POBVideoRenderer.this.a) ? POBVideoMeasurementProvider.POBVideoPlayerState.NORMAL : POBVideoMeasurementProvider.POBVideoPlayerState.FULLSCREEN);
            }
        }
    }

    class e implements POBUrlHandler.UrlHandlerListener {
        e() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBVideoRenderer", "Unable to open " + str, new Object[0]);
            POBVideoRenderer.this.a();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onExternalBrowserClose() {
            POBVideoRenderer.this.a();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBVideoRenderer.this.j.sendTrackers(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            POBVideoRenderer.this.d();
            POBVideoRenderer.this.a();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            POBVideoRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            POBVideoRenderer.this.e();
        }
    }

    class f implements POBVideoMeasurementProvider.POBOmidSessionListener {
        final /* synthetic */ float a;

        f(float f) {
            this.a = f;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider.POBOmidSessionListener
        public void onOmidSessionInitialized() {
            if (POBVideoRenderer.this.h != null) {
                POBVideoRenderer.this.h.loaded(POBVideoRenderer.this.g.getVastPlayerConfig().getSkip() == 1 && POBVideoRenderer.this.g.getSkipabilityEnabled(), this.a);
            }
        }
    }

    static /* synthetic */ class g {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBVastCreative.POBEventTypes.values().length];
            a = iArr;
            try {
                iArr[POBVastCreative.POBEventTypes.FIRST_QUARTILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBVastCreative.POBEventTypes.MID_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBVastCreative.POBEventTypes.THIRD_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[POBVastCreative.POBEventTypes.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[POBVastCreative.POBEventTypes.UNMUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[POBVastCreative.POBEventTypes.MUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[POBVastCreative.POBEventTypes.SKIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[POBVastCreative.POBEventTypes.RESUME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[POBVastCreative.POBEventTypes.PAUSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public POBVideoRenderer(@NonNull POBVastPlayer pOBVastPlayer, @NonNull POBViewabilityTracker pOBViewabilityTracker, @NonNull String str, @NonNull POBTrackerHandler pOBTrackerHandler) {
        this.g = pOBVastPlayer;
        this.a = str;
        this.j = pOBTrackerHandler;
        pOBVastPlayer.setVastPlayerListener(this);
        pOBVastPlayer.setOnSkipOptionUpdateListener(this);
        this.i = pOBViewabilityTracker;
        pOBViewabilityTracker.setOnExposureChangeWithThresholdListener(this);
    }

    private int a(int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private void k() {
        POBTimeoutHandler pOBTimeoutHandler = this.f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f = null;
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering, com.pubmatic.sdk.common.ui.POBBannerRendering
    public void destroy() {
        k();
        this.g.destroy();
        POBUrlHandler pOBUrlHandler = this.l;
        if (pOBUrlHandler != null) {
            pOBUrlHandler.destroy();
        }
        POBUrlHandler pOBUrlHandler2 = this.m;
        if (pOBUrlHandler2 != null) {
            pOBUrlHandler2.destroy();
        }
        this.i.setOnExposureChangeWithThresholdListener(null);
        this.i.destroy();
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.finishAdSession();
            this.h = null;
        }
        this.m = null;
    }

    @NonNull
    public POBVastPlayer getVastPlayer() {
        return this.g;
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void invalidateExpiration() {
        k();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onClose() {
        POBAdRendererListener pOBAdRendererListener;
        if (this.c == null || (pOBAdRendererListener = this.b) == null) {
            return;
        }
        pOBAdRendererListener.onAdInteractionStopped();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onDsaInfoIconClick() {
        POBDsaHtmlContent.getHtmlContent(this.g.getContext(), new c());
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onEndCardWillLeaveApp() {
        e();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onFailedToPlay(@NonNull POBError pOBError) {
        k();
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(pOBError);
        }
        if (this.h == null || pOBError.getErrorMessage() == null) {
            return;
        }
        this.h.signalError(POBVideoMeasurementProvider.POBVideoAdErrorType.VIDEO, pOBError.getErrorMessage());
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onIndustryIconClick(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.warn("POBVideoRenderer", POBVideoLogConstants.MSG_VAST_ICON_MISSING_CLICKTHROUGH, new Object[0]);
        } else {
            if (this.m == null) {
                this.m = new POBUrlHandler(this.g.getContext().getApplicationContext(), new b());
            }
            this.m.open(str);
        }
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.signalAdEvent(POBDataType.POBVideoAdEventType.ICON_CLICK);
        }
    }

    public void onOpenLandingPage(@Nullable String str) {
        a(str);
        i();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onPlaybackCompleted(float f2) {
        POBAdDescriptor pOBAdDescriptor;
        if (this.b != null && (pOBAdDescriptor = this.k) != null) {
            this.b.onAdReadyToRefresh(a((int) f2, pOBAdDescriptor.getRefreshInterval()));
        }
        POBVideoRenderingListener pOBVideoRenderingListener = this.c;
        if (pOBVideoRenderingListener != null) {
            pOBVideoRenderingListener.notifyAdEvent(POBDataType.POBVideoAdEventType.COMPLETE);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onReadyToPlay(@Nullable POBVastAd pOBVastAd, float f2) {
        Context context = this.g.getContext();
        if (context != null) {
            a(context);
        }
        a(pOBVastAd, f2);
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRender(this.g, this.k);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onSkip() {
        POBVideoSkipEventListener pOBVideoSkipEventListener;
        if (this.c == null || (pOBVideoSkipEventListener = this.d) == null) {
            return;
        }
        pOBVideoSkipEventListener.onAdAboutToSkip();
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener
    public void onSkipOptionUpdate(boolean z) {
        if (this.c == null || !this.g.getVastPlayerConfig().isBackButtonEnabled()) {
            return;
        }
        this.c.onSkipOptionUpdate(z);
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onVideoEventOccurred(@NonNull POBVastCreative.POBEventTypes pOBEventTypes) {
        switch (g.a[pOBEventTypes.ordinal()]) {
            case 1:
                a(POBDataType.POBVideoAdEventType.FIRST_QUARTILE);
                break;
            case 2:
                a(POBDataType.POBVideoAdEventType.MID_POINT);
                break;
            case 3:
                a(POBDataType.POBVideoAdEventType.THIRD_QUARTILE);
                break;
            case 4:
                a(POBDataType.POBVideoAdEventType.COMPLETE);
                break;
            case 5:
                a(POBDataType.POBVideoAdEventType.UNMUTE);
                break;
            case 6:
                a(POBDataType.POBVideoAdEventType.MUTE);
                break;
            case 7:
                a(POBDataType.POBVideoAdEventType.SKIP);
                break;
            case 8:
                a(POBDataType.POBVideoAdEventType.RESUME);
                break;
            case 9:
                a(POBDataType.POBVideoAdEventType.PAUSE);
                break;
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onVideoStarted(float f2, float f3) {
        if (this.h != null) {
            this.g.postDelayed(new d(f2, f3), 1000L);
        }
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker.OnViewabilityChangedListener
    public void onViewabilityChanged(boolean z) {
        if (z) {
            h();
        } else {
            g();
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering
    public void proceedAdSkip(boolean z) {
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            if (z) {
                pOBAdRendererListener.onAdInteractionStopped();
            } else {
                this.g.play();
            }
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        j();
        this.k = pOBAdDescriptor;
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        if (renderableContent != null) {
            this.g.load(renderableContent);
            return;
        }
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(new POBError(1009, POBLogConstants.MSG_RENDERING_FAILED_ERROR + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener) {
        this.b = pOBAdRendererListener;
        if (pOBAdRendererListener instanceof POBVideoRenderingListener) {
            setVideoRenderingListener((POBVideoRenderingListener) pOBAdRendererListener);
        }
    }

    public void setExpirationTimeout(long j) {
        this.e = j;
    }

    public void setMeasurementProvider(@Nullable POBVideoMeasurementProvider pOBVideoMeasurementProvider) {
        this.h = pOBVideoMeasurementProvider;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering
    public void setVideoRenderingListener(@Nullable POBVideoRenderingListener pOBVideoRenderingListener) {
        this.c = pOBVideoRenderingListener;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering
    public void setVideoSkipEventListener(@Nullable POBVideoSkipEventListener pOBVideoSkipEventListener) {
        this.d = pOBVideoSkipEventListener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setWatermark(@Nullable String str) {
        this.g.setWatermark(str);
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void shouldForwardClickEvent() {
        i();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdExpired();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onLeavingApplication();
        }
    }

    private void f() {
        POBAdRendererListener pOBAdRendererListener = this.b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderAdClick();
        }
    }

    private void g() {
        this.g.setAutoPlayOnForeground(false);
        this.g.pause();
    }

    private void h() {
        this.g.setAutoPlayOnForeground(true);
        this.g.play();
    }

    private void i() {
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.signalAdEvent(POBDataType.POBVideoAdEventType.CLICK);
        }
    }

    private void j() {
        if (this.e > 0) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new a());
            this.f = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.e);
        }
    }

    private void a(String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.warn("POBVideoRenderer", POBVideoLogConstants.MSG_VAST_VIDEO_MISSING_CLICKTHROUGH, new Object[0]);
        } else {
            POBLog.debug("POBVideoRenderer", POBVideoLogConstants.MSG_VAST_LEARN_MORE_CLICKED, str);
            POBUrlHandler pOBUrlHandler = this.l;
            if (pOBUrlHandler != null) {
                pOBUrlHandler.open(str);
            }
        }
        f();
    }

    private void a(POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.signalAdEvent(pOBVideoAdEventType);
        }
        POBVideoRenderingListener pOBVideoRenderingListener = this.c;
        if (pOBVideoRenderingListener != null) {
            pOBVideoRenderingListener.notifyAdEvent(pOBVideoAdEventType);
        }
    }

    private void a(Context context) {
        this.l = new POBUrlHandler(context, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.g.getACTEnabled()) {
            this.g.handleDeferredOpenStoreClick();
        }
    }

    private void a(POBVastAd pOBVastAd, float f2) {
        if (this.h == null || pOBVastAd == null) {
            return;
        }
        a(pOBVastAd.getCombinedVerificationList(), f2);
    }

    private void a(List list, float f2) {
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.startAdSession(this.g, list, new f(f2));
            POBLog.debug("POBVideoRenderer", "Video viewability measurement provider initialised", new Object[0]);
        } else {
            POBLog.debug("POBVideoRenderer", "Video viewability measurement provider not initialised", new Object[0]);
        }
    }
}
