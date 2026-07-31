package com.smaato.sdk.ng.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.CacheListener;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.api.OpenRTBApiClient;
import com.smaato.sdk.ng.api.RequestManager;
import com.smaato.sdk.ng.banner.presenter.BannerPresenterFactory;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.ImpressionTrackingMethod;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.OpenRTBAdRequestFactory;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.mraid.utils.MraidCloseAdRepo;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.prefs.SessionImpressionPrefs;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.MarkupUtils;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import com.smaato.sdk.ng.utils.SignalDataProcessor;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.utils.WatermarkHelper;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import com.smaato.sdk.ng.views.endcard.NextGenEndCardView;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdProcessor;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.vast.VastUrlUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NextGenAdView extends FrameLayout implements RequestManager.RequestListener, AdPresenter.Listener, AdPresenter.ImpressionListener, VideoListener, MRAIDViewListener, MraidCloseAdRepo.ICloseAdObserver {
    private static final String F = "NextGenAdView";
    private ImpressionTrackingMethod A;
    private Long B;
    private String C;
    private String D;
    private final Handler E;
    private Position a;
    private WindowManager b;
    private FrameLayout c;
    private NextGenEndCardView d;
    private String e;
    private String f;
    private String g;
    private Drawable h;
    private ImageView i;
    private WatermarkHelper j;
    private RequestManager k;
    private RequestManager l;
    protected Listener m;
    protected VideoListener n;
    protected MRAIDViewListener o;
    private AdPresenter p;
    private AdTracker q;
    protected Ad r;
    private boolean s;
    private boolean t;
    private final String u;
    private SignalDataProcessor v;
    private JSONObject w;
    private long x;
    private long y;
    private IntegrationType z;

    public interface Listener {
        void onAdClick();

        void onAdImpression();

        void onAdLoadFailed(Throwable th);

        void onAdLoaded();
    }

    public enum Position {
        TOP,
        BOTTOM
    }

    class a implements SignalDataProcessor.Listener {

        /* renamed from: com.smaato.sdk.ng.views.NextGenAdView$a$a, reason: collision with other inner class name */
        class RunnableC1698a implements Runnable {
            RunnableC1698a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NextGenAdView.this.renderAd();
            }
        }

        a() {
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onError(Throwable th) {
            NextGenAdView.this.a(th);
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onProcessed(Ad ad) {
            if (ad != null) {
                NextGenAdView nextGenAdView = NextGenAdView.this;
                nextGenAdView.A = ImpressionTrackingMethod.AD_VIEWABLE;
                nextGenAdView.r = ad;
                nextGenAdView.a(ad);
                new Handler(Looper.getMainLooper()).post(new RunnableC1698a());
                return;
            }
            NextGenAdView nextGenAdView2 = NextGenAdView.this;
            NextGenErrorCode nextGenErrorCode = NextGenErrorCode.NULL_AD;
            nextGenAdView2.a(new NextGenError(nextGenErrorCode));
            if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
                return;
            }
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setAppToken(NextGen.getAppToken());
            reportingEvent.setEventType("render_error");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(NextGenAdView.this.z));
            reportingEvent.setErrorCode(nextGenErrorCode.getCode());
            reportingEvent.setErrorMessage(nextGenErrorCode.getMessage());
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            Ad ad2 = NextGenAdView.this.r;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(NextGenAdView.this.r.getCampaignId());
                reportingEvent.setConfigId(NextGenAdView.this.r.getConfigId());
            }
            RequestManager requestManager = NextGenAdView.this.k;
            if (requestManager != null && requestManager.getAdSize() != null) {
                reportingEvent.setAdSize(NextGenAdView.this.k.getAdSize().toString());
            }
            reportingEvent.setIntegrationType(NextGenAdView.this.z.getCode());
            Ad ad3 = NextGenAdView.this.r;
            if (ad3 != null) {
                if (!TextUtils.isEmpty(ad3.getVast())) {
                    reportingEvent.setVast(NextGenAdView.this.r.getVast());
                }
                if (!TextUtils.isEmpty(NextGenAdView.this.r.getZoneId())) {
                    reportingEvent.setZoneId(NextGenAdView.this.r.getZoneId());
                }
            }
            reportingEvent.mergeJSONObject(NextGenAdView.this.getPlacementParams());
            NextGenAdView.this.a(reportingEvent);
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
    }

    class b implements NGSDKHttpClient.Listener {
        final /* synthetic */ Listener a;

        b(Listener listener) {
            this.a = listener;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            Logger.e(NextGenAdView.F, "Request failed: " + th.toString());
            NextGenAdView.this.a(new NextGenError(NextGenErrorCode.INVALID_ASSET));
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NextGenAdView.this.renderCustomMarkup(str, this.a);
        }
    }

    class c implements VideoAdProcessor.Listener {
        final /* synthetic */ int a;
        final /* synthetic */ String b;
        final /* synthetic */ Ad.AdType c;
        final /* synthetic */ String d;

        c(int i, String str, Ad.AdType adType, String str2) {
            this.a = i;
            this.b = str;
            this.c = adType;
            this.d = str2;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheError(Throwable th) {
            if (NextGenAdView.this.t) {
                return;
            }
            Logger.w(NextGenAdView.F, "onCacheError", th);
            NextGenAdView.this.a(th);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list) {
            if (NextGenAdView.this.t) {
                return;
            }
            if (list != null && !list.isEmpty()) {
                JsonOperations.putStringArray(NextGenAdView.this.w, "om_vendors", list);
            }
            boolean z = (adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true;
            VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str, endCardData, str2);
            NextGenAdView.this.r = new Ad(this.a, this.b, this.c);
            NextGenAdView.this.r.setZoneId(this.d);
            NextGenAdView.this.r.setHasEndCard(z);
            String sessionId = NextGenAdView.this.r.getSessionId();
            NextGen.getAdCache().put(sessionId, NextGenAdView.this.r);
            NextGen.getVideoAdCache().put(sessionId, videoAdCacheItem);
            NextGenAdView.this.k();
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdSize.values().length];
            a = iArr;
            try {
                iArr[AdSize.SIZE_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdSize.SIZE_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NextGenAdView(Context context) {
        super(context);
        this.j = new WatermarkHelper();
        this.s = true;
        this.u = "banner";
        this.x = -1L;
        this.y = -1L;
        this.z = IntegrationType.IN_APP_BIDDING;
        this.A = ImpressionTrackingMethod.AD_VIEWABLE;
        this.B = 0L;
        this.C = null;
        this.D = null;
        this.E = new Handler(Looper.getMainLooper());
        a(getRequestManager(), getORTBRequestManager());
    }

    private void a(RequestManager requestManager, RequestManager requestManager2) {
        NextGen.isInitialized();
        this.k = requestManager;
        this.l = requestManager2;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.l.setIntegrationType(integrationType);
        this.w = new JSONObject();
        d();
    }

    private void c() {
        removeWatermark();
        this.i = WatermarkHelper.createWatermarkView(getContext(), this.h);
    }

    private void d() {
        this.d = new NextGenEndCardView(getContext());
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        load(this.C, this.D, this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (this.B.longValue() > 0) {
                this.E.postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.views.NextGenAdView$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        NextGenAdView.this.h();
                    }
                }, this.B.longValue());
            }
        }
    }

    private void j() {
        postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.views.NextGenAdView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NextGenAdView.this.i();
            }
        }, 100L);
    }

    RequestManager b(AdSize adSize) {
        return new RequestManager(adSize);
    }

    public void destroy() {
        stopAutoRefresh();
        a();
        RequestManager requestManager = this.k;
        if (requestManager != null) {
            requestManager.destroy();
            this.k = null;
        }
        RequestManager requestManager2 = this.l;
        if (requestManager2 != null) {
            requestManager2.destroy();
            this.l = null;
        }
        this.t = true;
        this.m = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    protected void e() {
        Listener listener = this.m;
        if (listener != null) {
            listener.onAdClick();
        }
    }

    protected void f() {
        String str = this.D;
        if (str != null && !TextUtils.isEmpty(str) && getContext() != null) {
            new SessionImpressionPrefs(getContext()).insert(this.D);
        }
        AdTracker adTracker = this.q;
        if (adTracker != null) {
            adTracker.trackSdkEvent(2, null);
        }
        Listener listener = this.m;
        if (listener != null) {
            listener.onAdImpression();
        }
    }

    protected void g() {
        long j = -1;
        if (this.x != -1) {
            j = System.currentTimeMillis() - this.x;
            a("time_to_load", Long.valueOf(j));
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.z));
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.r;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.r.getCampaignId());
                reportingEvent.setConfigId(this.r.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        AdTracker adTracker = this.q;
        if (adTracker != null) {
            adTracker.trackSdkEvent(1, null);
        }
        Listener listener = this.m;
        if (listener != null) {
            listener.onAdLoaded();
        }
    }

    public Integer getBidPoints() {
        Ad ad = this.r;
        return Integer.valueOf(ad != null ? ad.getECPM().intValue() : 0);
    }

    public String getCreativeId() {
        Ad ad = this.r;
        if (ad != null) {
            return ad.getCreativeId();
        }
        return null;
    }

    public String getImpressionId() {
        Ad ad = this.r;
        if (ad != null) {
            return ad.getImpressionId();
        }
        return null;
    }

    protected String getLogTag() {
        return NextGenAdView.class.getSimpleName();
    }

    RequestManager getORTBRequestManager() {
        return new RequestManager(new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.w);
        RequestManager requestManager = this.k;
        if (requestManager != null && (placementParams2 = requestManager.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        AdPresenter adPresenter = this.p;
        if (adPresenter != null && (placementParams = adPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    RequestManager getRequestManager() {
        return new RequestManager();
    }

    public boolean hasEndCard() {
        Ad ad = this.r;
        if (ad != null) {
            return AdEndCardManager.isEndCardEnabled(ad).booleanValue();
        }
        return false;
    }

    public boolean isAutoCacheOnLoad() {
        RequestManager requestManager = this.k;
        if (requestManager != null) {
            return requestManager.isAutoCacheOnLoad();
        }
        return true;
    }

    public boolean isAutoShowOnLoad() {
        return this.s;
    }

    protected void k() {
        AdPresenter b2 = b();
        this.p = b2;
        if (b2 == null) {
            a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
            return;
        }
        b2.setVideoListener(this);
        this.p.setMRaidListener(this);
        this.p.load();
    }

    protected void l() {
        AdPresenter adPresenter = this.p;
        if (adPresenter != null) {
            adPresenter.startTracking(new NextGenConsumer() { // from class: com.smaato.sdk.ng.views.NextGenAdView$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.utils.NextGenConsumer
                public final void accept(Object obj) {
                    NextGenAdView.this.a((Double) obj);
                }
            });
        }
    }

    public void load(String str, Position position, Listener listener) {
        this.a = position;
        load(str, listener);
    }

    public void loadCustomExchangeAd(String str, Listener listener) {
        loadExchangeAd(str, "", "", listener);
    }

    public void loadExchangeAd(String str, Position position, Listener listener) {
        this.a = position;
        loadExchangeAd(str, listener);
    }

    protected void m() {
        AdPresenter adPresenter = this.p;
        if (adPresenter != null) {
            adPresenter.stopTracking();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.Listener
    public void onAdClicked(AdPresenter adPresenter) {
        e();
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.Listener
    public void onAdError(AdPresenter adPresenter) {
        a(new NextGenError(NextGenErrorCode.ERROR_RENDERING_BANNER));
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.Listener
    public void onAdLoaded(AdPresenter adPresenter, View view) {
        if (view == null) {
            a(new NextGenError(NextGenErrorCode.ERROR_RENDERING_BANNER));
        } else {
            setupAdView(view);
        }
    }

    @Override // com.smaato.sdk.ng.mraid.utils.MraidCloseAdRepo.ICloseAdObserver
    public void onCloseExpandedAd() {
        destroy();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
        MRAIDViewListener mRAIDViewListener = this.o;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.onExpandedAdClosed();
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        reportAdRender("banner", getPlacementParams());
        f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    @Override // com.smaato.sdk.ng.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th) {
        j();
        a(th);
    }

    @Override // com.smaato.sdk.ng.api.RequestManager.RequestListener
    public void onRequestSuccess(Ad ad) {
        j();
        if (ad == null) {
            a(new NextGenError(NextGenErrorCode.NULL_AD));
            return;
        }
        this.r = ad;
        if (this.s) {
            renderAd();
        } else {
            g();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.n;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.n;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.n;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.n;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.n;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    public void prepare() {
        prepare(null);
    }

    public void removeWatermark() {
        if (WatermarkHelper.removeWatermarkView(this.i)) {
            this.i = null;
            this.j.reset();
        }
    }

    public void renderAd() {
        if (System.currentTimeMillis() >= this.x + 1800000) {
            Logger.e(F, POBLogConstants.MSG_AD_EXPIRED_ERROR);
            a();
            a(new NextGenError(NextGenErrorCode.EXPIRED_AD));
            return;
        }
        if (this.p != null) {
            Logger.e(F, "Ad is already rendering. Dropping call.");
            return;
        }
        AdPresenter b2 = b();
        this.p = b2;
        if (b2 != null) {
            b2.setVideoListener(this);
            this.p.load();
            return;
        }
        NextGenErrorCode nextGenErrorCode = NextGenErrorCode.UNSUPPORTED_ASSET;
        a(new NextGenError(nextGenErrorCode));
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setAppToken(NextGen.getAppToken());
        reportingEvent.setEventType("render_error");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.z));
        reportingEvent.setErrorCode(nextGenErrorCode.getCode());
        reportingEvent.setErrorMessage(nextGenErrorCode.getMessage());
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        Ad ad = this.r;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.r.getCampaignId());
            reportingEvent.setConfigId(this.r.getConfigId());
        }
        RequestManager requestManager = this.k;
        if (requestManager != null && requestManager.getAdSize() != null) {
            reportingEvent.setAdSize(this.k.getAdSize().toString());
        }
        reportingEvent.setIntegrationType(this.z.getCode());
        Ad ad2 = this.r;
        if (ad2 != null) {
            if (!TextUtils.isEmpty(ad2.getVast())) {
                reportingEvent.setVast(this.r.getVast());
            }
            if (!TextUtils.isEmpty(this.r.getZoneId())) {
                reportingEvent.setZoneId(this.r.getZoneId());
            }
        }
        reportingEvent.mergeJSONObject(getPlacementParams());
        a(reportingEvent);
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    public void renderCustomMarkup(String str, Listener listener) {
        RequestManager requestManager;
        a();
        this.x = System.currentTimeMillis();
        this.m = listener;
        if (TextUtils.isEmpty(str) || (requestManager = this.k) == null) {
            a(new NextGenError(NextGenErrorCode.INVALID_ASSET));
            return;
        }
        int i = d.a[requestManager.getAdSize().ordinal()];
        if (i == 1) {
            if (MarkupUtils.isVastXml(str)) {
                new VideoAdProcessor().process(getContext(), str, AdSize.SIZE_300x250, new c(4, str, Ad.AdType.VIDEO, "6"));
                return;
            }
            Ad ad = new Ad(8, str, Ad.AdType.HTML);
            this.r = ad;
            ad.setZoneId("5");
            k();
            return;
        }
        if (i != 2) {
            Ad ad2 = new Ad(10, str, Ad.AdType.HTML);
            this.r = ad2;
            ad2.setZoneId("2");
            k();
            return;
        }
        Ad ad3 = new Ad(24, str, Ad.AdType.HTML);
        this.r = ad3;
        ad3.setZoneId("8");
        k();
    }

    public void renderVideoTag(String str, Listener listener) {
        String formatURL = VastUrlUtils.formatURL(str, VastUrlUtils.buildParameters());
        HashMap hashMap = new HashMap();
        String userAgent = NextGen.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            hashMap.put("User-Agent", userAgent);
        }
        NGSDKHttpClient.makeRequest(getContext(), formatURL, hashMap, null, new b(listener));
    }

    public void reportAdRender(String str, JSONObject jSONObject) {
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("render");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.z));
        reportingEvent.setAdFormat(str);
        reportingEvent.setHasEndCard(hasEndCard());
        Ad ad = this.r;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.r.getCampaignId());
            reportingEvent.setConfigId(this.r.getConfigId());
        }
        reportingEvent.mergeJSONObject(jSONObject);
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    public void setAdSize(AdSize adSize) {
        this.k.setAdSize(adSize);
        this.l.setAdSize(adSize);
    }

    public void setAutoCacheOnLoad(boolean z) {
        RequestManager requestManager = this.k;
        if (requestManager != null) {
            requestManager.setAutoCacheOnLoad(z);
        }
        RequestManager requestManager2 = this.l;
        if (requestManager2 != null) {
            requestManager2.setAutoCacheOnLoad(z);
        }
    }

    public void setAutoRefreshTimeInSeconds(int i) {
        if (this.s) {
            this.B = Long.valueOf(i * 1000);
        }
    }

    public void setAutoShowOnLoad(boolean z) {
        this.s = z;
        if (z) {
            return;
        }
        stopAutoRefresh();
    }

    public void setIsAdSticky(boolean z) {
        MraidCloseAdRepo.getInstance().setIsAdSticky(z);
    }

    public void setMediation(boolean z) {
        RequestManager requestManager = this.k;
        if (requestManager != null) {
            requestManager.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
        RequestManager requestManager2 = this.l;
        if (requestManager2 != null) {
            requestManager2.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
        if (z) {
            this.z = IntegrationType.MEDIATION;
        } else {
            this.z = IntegrationType.STANDALONE;
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.k;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
        RequestManager requestManager2 = this.l;
        if (requestManager2 != null) {
            requestManager2.setMediationVendor(str);
        }
    }

    public void setMraidListener(MRAIDViewListener mRAIDViewListener) {
        this.o = mRAIDViewListener;
    }

    public void setPosition(Position position) {
        this.a = position;
    }

    public void setScreenIabCategory(String str) {
        this.e = str;
    }

    public void setScreenKeywords(String str) {
        this.f = str;
    }

    public void setTrackingMethod(ImpressionTrackingMethod impressionTrackingMethod) {
        if (impressionTrackingMethod != null) {
            this.A = impressionTrackingMethod;
        }
    }

    public void setUserIntent(String str) {
        this.g = str;
    }

    public void setVideoListener(VideoListener videoListener) {
        this.n = videoListener;
    }

    public void setWatermark(String str) {
        this.h = WatermarkHelper.decodeWatermark(getContext(), str);
    }

    protected void setupAdView(View view) {
        Position position = this.a;
        if (position != null) {
            show(view, position);
            return;
        }
        AdSize adSize = AdSize.SIZE_320x50;
        int width = adSize.getWidth();
        int height = adSize.getHeight();
        RequestManager requestManager = this.k;
        if (requestManager != null && requestManager.getAdSize() != null) {
            width = (int) ViewUtils.convertDpToPixel(this.k.getAdSize().getWidth(), getContext());
            height = (int) ViewUtils.convertDpToPixel(this.k.getAdSize().getHeight(), getContext());
        }
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
            layoutParams.gravity = 17;
            addView(view, layoutParams);
            if (this.h != null) {
                c();
            }
            ImageView imageView = this.i;
            if (imageView != null) {
                if (imageView.getParent() != null && (this.i.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.i.getParent()).removeView(this.i);
                }
                addView(this.i);
                if (this.p != null && !this.j.isWatermarkRegistered()) {
                    this.p.addFriendlyObstruction(this.i);
                    this.j.setWatermarkRegistered();
                }
            }
        }
        if (this.s) {
            g();
        }
        l();
        if (this.y != -1) {
            a("render_time", Long.valueOf(System.currentTimeMillis() - this.y));
        }
    }

    public void show() {
        renderAd();
    }

    public void stopAutoRefresh() {
        this.B = 0L;
        this.E.removeCallbacksAndMessages(null);
    }

    protected AdPresenter b() {
        this.y = System.currentTimeMillis();
        AdSize adSize = AdSize.SIZE_320x50;
        RequestManager requestManager = this.k;
        if (requestManager != null && requestManager.getAdSize() != null) {
            adSize = this.k.getAdSize();
        }
        return new BannerPresenterFactory(getContext(), this.z).createPresenter(this.r, this.q, adSize, this.A, this, this, this.i);
    }

    public void prepare(CacheListener cacheListener) {
        Ad ad;
        RequestManager requestManager = this.k;
        if (requestManager == null || (ad = this.r) == null) {
            return;
        }
        requestManager.cacheAd(ad, cacheListener);
    }

    public void show(View view, Position position) {
        a("timestamp", String.valueOf(System.currentTimeMillis()));
        if (NextGen.getAppToken() != null) {
            a("app_token", NextGen.getAppToken());
        }
        RequestManager requestManager = this.k;
        if (requestManager != null && requestManager.getAdSize() != null) {
            a("ad_size", this.k.getAdSize().toString());
        }
        a("integration_type", this.z);
        a("ad_position", position.name());
        if (this.b == null) {
            this.b = (WindowManager) getContext().getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (position == Position.TOP) {
                layoutParams.gravity = 49;
            } else if (position == Position.BOTTOM) {
                layoutParams.gravity = 81;
            }
            layoutParams.flags = 262152;
            RequestManager requestManager2 = this.k;
            if (requestManager2 != null && requestManager2.getAdSize() != null) {
                layoutParams.width = (int) ViewUtils.convertDpToPixel(this.k.getAdSize().getWidth(), getContext());
                layoutParams.height = (int) ViewUtils.convertDpToPixel(this.k.getAdSize().getHeight(), getContext());
            }
            layoutParams.format = -2;
            if (this.c == null) {
                this.c = new FrameLayout(getContext());
            }
            this.c.addView(view);
            this.b.addView(this.c, layoutParams);
        }
        if (this.s) {
            g();
        }
        l();
        if (this.y != -1) {
            a("render_time", Long.valueOf(System.currentTimeMillis() - this.y));
        }
    }

    public void load(String str, Listener listener) {
        load((String) null, str, listener);
    }

    public void loadExchangeAd(String str, Listener listener) {
        loadExchangeAd((String) null, str, listener);
    }

    public void load(String str, String str2, Listener listener) {
        this.C = str;
        this.D = str2;
        this.m = listener;
        if (NextGen.isInitialized()) {
            a();
            this.x = System.currentTimeMillis();
            if (TextUtils.isEmpty(str2)) {
                a(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
            } else {
                a("zone_id", str2);
                if (!TextUtils.isEmpty(str)) {
                    this.k.setAppToken(str);
                }
                this.k.setZoneId(str2);
                this.k.setRequestListener(this);
                this.k.requestAd();
            }
        } else {
            this.x = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.NOT_INITIALISED));
        }
        MraidCloseAdRepo.getInstance().registerExpandedAdCloseObserver(this);
    }

    public void loadExchangeAd(String str, String str2, Listener listener) {
        loadExchangeAd(null, str, str2, listener);
    }

    public void loadExchangeAd(String str, String str2, String str3, Listener listener) {
        loadExchangeAd(str, str2, str3, listener, null);
    }

    public void loadExchangeAd(String str, String str2, String str3, Listener listener, String str4) {
        this.C = str2;
        this.D = str3;
        this.m = listener;
        if (NextGen.isInitialized()) {
            a();
            this.x = System.currentTimeMillis();
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str3)) {
                    a(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
                    return;
                }
                a("zone_id", str3);
                if (!TextUtils.isEmpty(str2)) {
                    this.l.setAppToken(str2);
                }
                if (!TextUtils.isEmpty(str4)) {
                    this.l.setAdFormat(str4);
                }
                this.l.setZoneId(str3);
                this.l.setRequestListener(this);
                this.l.requestAd();
                return;
            }
            if (!TextUtils.isEmpty(str4)) {
                this.l.setAdFormat(str4);
            }
            this.l.setCustomUrl(str);
            this.l.setZoneId(str3);
            this.l.setRequestListener(this);
            this.l.requestAd();
            return;
        }
        this.x = System.currentTimeMillis();
        a(new NextGenError(NextGenErrorCode.NOT_INITIALISED));
    }

    protected void a() {
        m();
        removeWatermark();
        removeAllViews();
        Ad ad = this.r;
        if (ad != null && !TextUtils.isEmpty(ad.getSessionId())) {
            NextGen.getVideoAdCache().remove(this.r.getSessionId());
            Logger.d(F, "Cleaned up VideoAdCache entry for sessionId: " + this.r.getSessionId());
        }
        this.r = null;
        this.w = new JSONObject();
        this.x = -1L;
        this.y = -1L;
        AdPresenter adPresenter = this.p;
        if (adPresenter != null) {
            adPresenter.destroy();
            this.p = null;
        }
        if (this.q != null) {
            this.q = null;
        }
        SignalDataProcessor signalDataProcessor = this.v;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.v = null;
        }
        if (this.b == null || !this.c.isShown()) {
            return;
        }
        this.b.removeViewImmediate(this.c);
        this.b = null;
        this.c = null;
    }

    RequestManager a(AdSize adSize) {
        return new RequestManager(adSize, new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Double d2) {
        RequestManager requestManager = this.k;
        if (requestManager != null) {
            requestManager.sendAdSessionDataToAtom(this.r, d2);
        }
    }

    protected void a(Throwable th) {
        long j = -1;
        if (this.x != -1) {
            j = System.currentTimeMillis() - this.x;
            a("time_to_load_failed", Long.valueOf(j));
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load_fail");
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.z));
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.r;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.r.getCampaignId());
                reportingEvent.setConfigId(this.r.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        if (th instanceof NextGenError) {
            NextGenError nextGenError = (NextGenError) th;
            if (nextGenError.getErrorCode() == NextGenErrorCode.NO_FILL) {
                Logger.w(getLogTag(), th.getMessage());
            } else {
                Logger.e(getLogTag(), th.getMessage());
            }
            AdTracker adTracker = this.q;
            if (adTracker != null) {
                adTracker.trackSdkEvent(1, Integer.valueOf(nextGenError.getErrorCode().getCode()));
            }
        } else {
            AdTracker adTracker2 = this.q;
            if (adTracker2 != null) {
                adTracker2.trackSdkEvent(1, Integer.valueOf(NextGenErrorCode.UNKNOWN_ERROR.getCode()));
            }
        }
        Listener listener = this.m;
        if (listener != null) {
            listener.onAdLoadFailed(th);
        }
    }

    public NextGenAdView(Context context, AdSize adSize) {
        super(context);
        this.j = new WatermarkHelper();
        this.s = true;
        this.u = "banner";
        this.x = -1L;
        this.y = -1L;
        this.z = IntegrationType.IN_APP_BIDDING;
        this.A = ImpressionTrackingMethod.AD_VIEWABLE;
        this.B = 0L;
        this.C = null;
        this.D = null;
        this.E = new Handler(Looper.getMainLooper());
        if (adSize == null) {
            a(getRequestManager(), getORTBRequestManager());
        } else {
            a(b(adSize), a(adSize));
        }
    }

    public void renderAd(Ad ad, Listener listener) {
        if (ad != null) {
            a();
            this.x = System.currentTimeMillis();
            this.m = listener;
            this.r = ad;
            a(ad);
            renderAd();
            return;
        }
        NextGenErrorCode nextGenErrorCode = NextGenErrorCode.INVALID_AD;
        a(new NextGenError(nextGenErrorCode));
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setAppToken(NextGen.getAppToken());
        reportingEvent.setEventType("render_error");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.z));
        reportingEvent.setErrorCode(nextGenErrorCode.getCode());
        reportingEvent.setErrorMessage(nextGenErrorCode.getMessage());
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        Ad ad2 = this.r;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.r.getCampaignId());
            reportingEvent.setConfigId(this.r.getConfigId());
        }
        RequestManager requestManager = this.k;
        if (requestManager != null && requestManager.getAdSize() != null) {
            reportingEvent.setAdSize(this.k.getAdSize().toString());
        }
        reportingEvent.setIntegrationType(this.z.getCode());
        Ad ad3 = this.r;
        if (ad3 != null) {
            if (!TextUtils.isEmpty(ad3.getVast())) {
                reportingEvent.setVast(this.r.getVast());
            }
            if (!TextUtils.isEmpty(this.r.getZoneId())) {
                reportingEvent.setZoneId(this.r.getZoneId());
            }
        }
        reportingEvent.mergeJSONObject(getPlacementParams());
        a(reportingEvent);
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ReportingEvent reportingEvent) {
        Ad ad;
        if (reportingEvent == null || (ad = this.r) == null) {
            return;
        }
        int i = ad.assetgroupid;
        if (i != 4 && i != 15) {
            reportingEvent.setAdType("HTML");
            reportingEvent.setCreative(this.r.getAssetHtml("htmlbanner"));
        } else {
            reportingEvent.setAdType(VastTagName.VAST);
            reportingEvent.setCreative(this.r.getVast());
        }
    }

    public void renderAd(String str, Listener listener) {
        a();
        this.x = System.currentTimeMillis();
        this.m = listener;
        if (!TextUtils.isEmpty(str)) {
            SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
            this.v = signalDataProcessor;
            signalDataProcessor.processSignalData(str, new a());
            return;
        }
        NextGenErrorCode nextGenErrorCode = NextGenErrorCode.INVALID_SIGNAL_DATA;
        a(new NextGenError(nextGenErrorCode));
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setAppToken(NextGen.getAppToken());
        reportingEvent.setEventType("render_error");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.z));
        reportingEvent.setErrorCode(nextGenErrorCode.getCode());
        reportingEvent.setErrorMessage(nextGenErrorCode.getMessage());
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        Ad ad = this.r;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.r.getCampaignId());
            reportingEvent.setConfigId(this.r.getConfigId());
        }
        RequestManager requestManager = this.k;
        if (requestManager != null && requestManager.getAdSize() != null) {
            reportingEvent.setAdSize(this.k.getAdSize().toString());
        }
        reportingEvent.setIntegrationType(this.z.getCode());
        Ad ad2 = this.r;
        if (ad2 != null) {
            if (!TextUtils.isEmpty(ad2.getVast())) {
                reportingEvent.setVast(this.r.getVast());
            }
            if (!TextUtils.isEmpty(this.r.getZoneId())) {
                reportingEvent.setZoneId(this.r.getZoneId());
            }
        }
        reportingEvent.mergeJSONObject(getPlacementParams());
        a(reportingEvent);
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    private void a(String str, Object obj) {
        JSONObject jSONObject = this.w;
        if (jSONObject != null) {
            if (obj instanceof Long) {
                JsonOperations.putJsonLong(jSONObject, str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                JsonOperations.putJsonValue(jSONObject, str, (Integer) obj);
            } else if (obj instanceof Double) {
                JsonOperations.putJsonValue(jSONObject, str, (Double) obj);
            } else {
                JsonOperations.putJsonString(jSONObject, str, obj.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Ad ad) {
        if (ad != null) {
            this.q = new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event"));
        }
    }

    public NextGenAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new WatermarkHelper();
        this.s = true;
        this.u = "banner";
        this.x = -1L;
        this.y = -1L;
        this.z = IntegrationType.IN_APP_BIDDING;
        this.A = ImpressionTrackingMethod.AD_VIEWABLE;
        this.B = 0L;
        this.C = null;
        this.D = null;
        this.E = new Handler(Looper.getMainLooper());
        a(getRequestManager(), getORTBRequestManager());
    }

    public NextGenAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new WatermarkHelper();
        this.s = true;
        this.u = "banner";
        this.x = -1L;
        this.y = -1L;
        this.z = IntegrationType.IN_APP_BIDDING;
        this.A = ImpressionTrackingMethod.AD_VIEWABLE;
        this.B = 0L;
        this.C = null;
        this.D = null;
        this.E = new Handler(Looper.getMainLooper());
        a(getRequestManager(), getORTBRequestManager());
    }

    public NextGenAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j = new WatermarkHelper();
        this.s = true;
        this.u = "banner";
        this.x = -1L;
        this.y = -1L;
        this.z = IntegrationType.IN_APP_BIDDING;
        this.A = ImpressionTrackingMethod.AD_VIEWABLE;
        this.B = 0L;
        this.C = null;
        this.D = null;
        this.E = new Handler(Looper.getMainLooper());
        a(getRequestManager(), getORTBRequestManager());
    }
}
