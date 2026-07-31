package com.smaato.sdk.ng.interstitial;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.smaato.sdk.ng.CacheListener;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.api.InterstitialRequestManager;
import com.smaato.sdk.ng.api.OpenRTBApiClient;
import com.smaato.sdk.ng.api.RequestManager;
import com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter;
import com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenterFactory;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.OpenRTBAdRequestFactory;
import com.smaato.sdk.ng.models.SkipOffset;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.prefs.SessionImpressionPrefs;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.AdRequestRegistry;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.MarkupUtils;
import com.smaato.sdk.ng.utils.SignalDataProcessor;
import com.smaato.sdk.ng.utils.SkipOffsetManager;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdProcessor;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.vast.VastUrlUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class NextGenInterstitialAd implements RequestManager.RequestListener, InterstitialPresenter.Listener, VideoListener {
    private static final String v = "NextGenInterstitialAd";
    private RequestManager a;
    private RequestManager b;
    private InterstitialPresenter c;
    private AdTracker d;
    private final Listener e;
    private VideoListener f;
    private final Context g;
    private final String h;
    private String i;
    private String j;
    private SignalDataProcessor k;
    private Ad l;
    private JSONObject m;
    private boolean n;
    private SkipOffset o;
    private SkipOffset p;
    private boolean q;
    private long r;
    private long s;
    private boolean t;
    private String u;

    public interface Listener {
        void onInterstitialClick();

        void onInterstitialDismissed();

        void onInterstitialImpression();

        void onInterstitialLoadFailed(Throwable th);

        void onInterstitialLoaded();
    }

    class a implements SignalDataProcessor.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onError(Throwable th) {
            NextGenInterstitialAd.this.a(th);
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onProcessed(Ad ad) {
            if (ad != null) {
                NextGenInterstitialAd.this.prepareAd(ad);
            }
        }
    }

    class b implements VideoAdProcessor.Listener {
        final /* synthetic */ int a;
        final /* synthetic */ String b;
        final /* synthetic */ Ad.AdType c;

        b(int i, String str, Ad.AdType adType) {
            this.a = i;
            this.b = str;
            this.c = adType;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheError(Throwable th) {
            if (NextGenInterstitialAd.this.q) {
                return;
            }
            Logger.w(NextGenInterstitialAd.v, "onCacheError", th);
            NextGenInterstitialAd.this.a(th);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list) {
            if (NextGenInterstitialAd.this.q) {
                return;
            }
            if (list != null && !list.isEmpty()) {
                JsonOperations.putStringArray(NextGenInterstitialAd.this.m, "om_vendors", list);
            }
            boolean z = (adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true;
            VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str, endCardData, str2);
            NextGenInterstitialAd.this.l = new Ad(this.a, this.b, this.c);
            NextGenInterstitialAd.this.l.setHasEndCard(z);
            NextGenInterstitialAd.this.c();
            String sessionId = NextGenInterstitialAd.this.l.getSessionId();
            NextGen.getAdCache().put(sessionId, NextGenInterstitialAd.this.l);
            NextGen.getVideoAdCache().put(sessionId, videoAdCacheItem);
            NextGenInterstitialAd.this.a();
            IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
            RequestManager requestManager = NextGenInterstitialAd.this.a;
            if (requestManager != null) {
                integrationType = requestManager.getIntegrationType();
            }
            IntegrationType integrationType2 = integrationType;
            NextGenInterstitialAd nextGenInterstitialAd = NextGenInterstitialAd.this;
            NextGenInterstitialAd nextGenInterstitialAd2 = NextGenInterstitialAd.this;
            InterstitialPresenterFactory interstitialPresenterFactory = new InterstitialPresenterFactory(nextGenInterstitialAd2.g, nextGenInterstitialAd2.i);
            NextGenInterstitialAd nextGenInterstitialAd3 = NextGenInterstitialAd.this;
            nextGenInterstitialAd.c = interstitialPresenterFactory.createInterstitialPresenter(nextGenInterstitialAd3.l, nextGenInterstitialAd3.o, nextGenInterstitialAd3.p, nextGenInterstitialAd3, integrationType2, nextGenInterstitialAd3.u);
            NextGenInterstitialAd nextGenInterstitialAd4 = NextGenInterstitialAd.this;
            InterstitialPresenter interstitialPresenter = nextGenInterstitialAd4.c;
            if (interstitialPresenter == null) {
                nextGenInterstitialAd4.a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
            } else {
                interstitialPresenter.setVideoListener(nextGenInterstitialAd4);
                NextGenInterstitialAd.this.c.load();
            }
        }
    }

    class c implements NGSDKHttpClient.Listener {
        final /* synthetic */ String a;
        final /* synthetic */ long b;
        final /* synthetic */ String c;

        c(String str, long j, String str2) {
            this.a = str;
            this.b = j;
            this.c = str2;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            Logger.e(NextGenInterstitialAd.v, "Request failed: " + th.toString());
            NextGenInterstitialAd.this.a(new NextGenError(NextGenErrorCode.INVALID_ASSET));
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            NextGenInterstitialAd.this.a(this.a, str, this.b);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NextGenInterstitialAd.this.prepareCustomMarkup(this.c, str);
        }
    }

    public NextGenInterstitialAd(Activity activity, Listener listener) {
        this((Context) activity, "", listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Ad ad = this.l;
        if (ad == null) {
            return;
        }
        Integer htmlSkipOffset = ad.getHtmlSkipOffset();
        Boolean bool = Boolean.TRUE;
        Integer hTMLSkipOffset = SkipOffsetManager.getHTMLSkipOffset(htmlSkipOffset, bool);
        Integer videoSkipOffset = SkipOffsetManager.getVideoSkipOffset(this.l.getVideoSkipOffset(), null, null, Boolean.valueOf(hasEndCard()), bool);
        if (hTMLSkipOffset != null) {
            this.o = new SkipOffset(hTMLSkipOffset.intValue(), SkipOffsetManager.isCustomInterstitialHTMLSkipOffset().booleanValue());
        }
        if (videoSkipOffset != null) {
            this.p = new SkipOffset(videoSkipOffset.intValue(), SkipOffsetManager.isCustomInterstitialVideoSkipOffset().booleanValue());
        }
    }

    private void b() {
        this.n = false;
        this.m = new JSONObject();
        this.r = -1L;
        this.s = -1L;
        InterstitialPresenter interstitialPresenter = this.c;
        if (interstitialPresenter != null) {
            interstitialPresenter.destroy();
            this.c = null;
        }
        SignalDataProcessor signalDataProcessor = this.k;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.l != null) {
            this.d = new AdTracker(null, null, this.l.getBeacons("sdk_event"), null, null);
        }
    }

    private void h() {
        IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            integrationType = requestManager.getIntegrationType();
        }
        InterstitialPresenter createInterstitialPresenter = new InterstitialPresenterFactory(this.g, this.i).createInterstitialPresenter(this.l, this.o, this.p, this, integrationType, this.u);
        this.c = createInterstitialPresenter;
        if (createInterstitialPresenter == null) {
            a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
        } else {
            createInterstitialPresenter.setVideoListener(this);
            this.c.load();
        }
    }

    protected void d() {
        Listener listener = this.e;
        if (listener != null) {
            listener.onInterstitialClick();
        }
    }

    public void destroy() {
        b();
        this.q = true;
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            requestManager.destroy();
            this.a = null;
        }
        RequestManager requestManager2 = this.b;
        if (requestManager2 != null) {
            requestManager2.destroy();
            this.b = null;
        }
    }

    protected void e() {
        Ad ad = this.l;
        if (ad != null && !TextUtils.isEmpty(ad.getSessionId())) {
            NextGen.getVideoAdCache().remove(this.l.getSessionId());
            Logger.d(v, "Cleaned up VideoAdCache entry for sessionId: " + this.l.getSessionId());
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onInterstitialDismissed();
        }
    }

    protected void f() {
        Listener listener = this.e;
        if (listener != null) {
            listener.onInterstitialImpression();
        }
    }

    protected void g() {
        long j = -1;
        if (this.r != -1) {
            j = System.currentTimeMillis() - this.r;
            JsonOperations.putJsonLong(this.m, "time_to_load", j);
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            RequestManager requestManager = this.a;
            if (requestManager != null) {
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(requestManager.getIntegrationType()));
            }
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.l;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.l.getCampaignId());
                reportingEvent.setConfigId(this.l.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onInterstitialLoaded();
        }
    }

    public Integer getBidPoints() {
        Ad ad = this.l;
        return Integer.valueOf(ad != null ? ad.getECPM().intValue() : 0);
    }

    public String getCreativeId() {
        Ad ad = this.l;
        if (ad != null) {
            return ad.getCreativeId();
        }
        return null;
    }

    public String getImpressionId() {
        Ad ad = this.l;
        if (ad != null) {
            return ad.getImpressionId();
        }
        return null;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.m);
        RequestManager requestManager = this.a;
        if (requestManager != null && (placementParams2 = requestManager.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        InterstitialPresenter interstitialPresenter = this.c;
        if (interstitialPresenter != null && (placementParams = interstitialPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public String getZoneId() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public boolean hasEndCard() {
        Ad ad = this.l;
        if (ad != null) {
            return AdEndCardManager.isEndCardEnabled(ad).booleanValue();
        }
        return false;
    }

    public boolean isAutoCacheOnLoad() {
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            return requestManager.isAutoCacheOnLoad();
        }
        return true;
    }

    public boolean isReady() {
        return this.n;
    }

    public void load() {
        a("timestamp", String.valueOf(System.currentTimeMillis()));
        if (NextGen.getAppToken() != null) {
            a("app_token", NextGen.getAppToken());
        }
        a("ad_type", "fullscreen");
        RequestManager requestManager = this.a;
        if (requestManager != null && requestManager.getAdSize() != null) {
            a("ad_size", this.a.getAdSize().toString());
        }
        a("integration_type", IntegrationType.STANDALONE);
        if (!NextGen.isInitialized()) {
            this.r = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.i)) {
            this.r = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
            return;
        }
        b();
        this.r = System.currentTimeMillis();
        if (this.a != null) {
            if (!TextUtils.isEmpty(this.h)) {
                this.a.setAppToken(this.h);
            }
            this.a.setZoneId(this.i);
            this.a.setRequestListener(this);
            this.t = false;
            this.a.requestAd();
        }
    }

    public void loadExchangeAd(String str) {
        a("timestamp", String.valueOf(System.currentTimeMillis()));
        if (NextGen.getAppToken() != null) {
            a("app_token", NextGen.getAppToken());
        }
        a("ad_type", "fullscreen");
        this.b.setAdSize(AdSize.SIZE_INTERSTITIAL);
        a("ad_size", this.b.getAdSize().toString());
        a("integration_type", IntegrationType.STANDALONE);
        if (!NextGen.isInitialized()) {
            this.r = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.i)) {
            this.r = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
            return;
        }
        b();
        this.r = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.h)) {
            this.b.setAppToken(this.h);
        }
        if (!TextUtils.isEmpty(str)) {
            this.b.setAdFormat(str);
        }
        this.b.setZoneId(this.i);
        this.b.setRequestListener(this);
        this.t = true;
        this.b.requestAd();
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialClicked(InterstitialPresenter interstitialPresenter) {
        d();
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialDismissed(InterstitialPresenter interstitialPresenter) {
        e();
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialError(InterstitialPresenter interstitialPresenter) {
        a(new NextGenError(NextGenErrorCode.ERROR_RENDERING_INTERSTITIAL));
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialLoaded(InterstitialPresenter interstitialPresenter) {
        this.n = true;
        g();
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialShown(InterstitialPresenter interstitialPresenter) {
        Context context;
        if (this.s != -1) {
            a("render_time", Long.valueOf(System.currentTimeMillis() - this.s));
        }
        reportAdRender("fullscreen", getPlacementParams());
        String str = this.i;
        if (str != null && !TextUtils.isEmpty(str) && (context = this.g) != null) {
            new SessionImpressionPrefs(context).insert(this.i);
        }
        f();
    }

    @Override // com.smaato.sdk.ng.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th) {
        a(th);
    }

    @Override // com.smaato.sdk.ng.api.RequestManager.RequestListener
    public void onRequestSuccess(Ad ad) {
        if (ad == null) {
            a(new NextGenError(NextGenErrorCode.NULL_AD));
            return;
        }
        this.l = ad;
        c();
        a();
        h();
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    public void prepare() {
        prepare(null);
    }

    public void prepareAd(String str) {
        if (TextUtils.isEmpty(str)) {
            a(new NextGenError(NextGenErrorCode.INVALID_SIGNAL_DATA));
            return;
        }
        SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
        this.k = signalDataProcessor;
        signalDataProcessor.processSignalData(str, new a());
    }

    public void prepareCustomMarkup(String str) {
        prepareCustomMarkup("", str);
    }

    public void prepareVideoTag(String str) {
        prepareVideoTag("", str);
    }

    public void reportAdRender(String str, JSONObject jSONObject) {
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("render");
        reportingEvent.setAdFormat(str);
        reportingEvent.setPlatform("android");
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(requestManager.getIntegrationType()));
        }
        reportingEvent.setHasEndCard(hasEndCard());
        Ad ad = this.l;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.l.getCampaignId());
            reportingEvent.setConfigId(this.l.getConfigId());
        }
        reportingEvent.mergeJSONObject(jSONObject);
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    public void setAutoCacheOnLoad(boolean z) {
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            requestManager.setAutoCacheOnLoad(z);
        }
        RequestManager requestManager2 = this.b;
        if (requestManager2 != null) {
            requestManager2.setAutoCacheOnLoad(z);
        }
    }

    public void setCustomUrl(String str) {
        this.j = str;
    }

    public void setMediation(boolean z) {
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            requestManager.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
        RequestManager requestManager2 = this.b;
        if (requestManager2 != null) {
            requestManager2.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
        RequestManager requestManager2 = this.b;
        if (requestManager2 != null) {
            requestManager2.setMediationVendor(str);
        }
    }

    public void setVideoListener(VideoListener videoListener) {
        this.f = videoListener;
    }

    public void setWatermark(String str) {
        this.u = str;
    }

    public boolean show() {
        if (this.c == null || !this.n) {
            Logger.e(v, "Can't display ad. Interstitial not ready.");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.s = currentTimeMillis;
        long j = this.r;
        if (currentTimeMillis >= 1800000 + j && j != -1) {
            Logger.e(v, POBLogConstants.MSG_AD_EXPIRED_ERROR);
            b();
            a(new NextGenError(NextGenErrorCode.EXPIRED_AD));
            return false;
        }
        this.c.show();
        RequestManager requestManager = this.a;
        if (requestManager != null && !this.t) {
            requestManager.sendAdSessionDataToAtom(this.l, Double.valueOf(1.0d));
            return true;
        }
        RequestManager requestManager2 = this.b;
        if (requestManager2 == null || !this.t) {
            return true;
        }
        requestManager2.sendAdSessionDataToAtom(this.l, Double.valueOf(1.0d));
        return true;
    }

    public NextGenInterstitialAd(Activity activity, String str, Listener listener) {
        this((Context) activity, str, listener);
    }

    public void prepare(CacheListener cacheListener) {
        Ad ad;
        RequestManager requestManager = this.a;
        if (requestManager == null || (ad = this.l) == null) {
            return;
        }
        requestManager.cacheAd(ad, cacheListener);
    }

    public void prepareCustomMarkup(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            a(new NextGenError(NextGenErrorCode.INVALID_ASSET));
            return;
        }
        this.i = str;
        if (MarkupUtils.isVastXml(str2)) {
            if (TextUtils.isEmpty(this.i)) {
                this.i = "4";
                JsonOperations.putJsonString(this.m, "zone_id", "4");
            }
            new VideoAdProcessor().process(this.g, str2, null, new b(15, str2, Ad.AdType.VIDEO));
        } else {
            if (TextUtils.isEmpty(this.i)) {
                this.i = "3";
            }
            Ad ad = new Ad(21, str2, Ad.AdType.HTML);
            this.l = ad;
            ad.setZoneId(this.i);
            this.l.setHasEndCard(hasEndCard());
            c();
            NextGen.getAdCache().put(this.l.getSessionId(), this.l);
            a();
            IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
            RequestManager requestManager = this.a;
            if (requestManager != null) {
                integrationType = requestManager.getIntegrationType();
            }
            InterstitialPresenter createInterstitialPresenter = new InterstitialPresenterFactory(this.g, this.i).createInterstitialPresenter(this.l, this.o, this.p, this, integrationType, this.u);
            this.c = createInterstitialPresenter;
            if (createInterstitialPresenter != null) {
                createInterstitialPresenter.setVideoListener(this);
                this.c.load();
            } else {
                a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
            }
        }
        JsonOperations.putJsonString(this.m, "zone_id", this.i);
    }

    public void prepareVideoTag(String str, String str2) {
        String formatURL = VastUrlUtils.formatURL(str2, VastUrlUtils.buildParameters());
        HashMap hashMap = new HashMap();
        String userAgent = NextGen.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            hashMap.put("User-Agent", userAgent);
        }
        NGSDKHttpClient.makeRequest(this.g, formatURL, hashMap, null, new c(formatURL, System.currentTimeMillis(), str));
    }

    public NextGenInterstitialAd(Context context, String str, Listener listener) {
        this(context, null, str, listener);
    }

    public NextGenInterstitialAd(Context context, String str, String str2, Listener listener) {
        this.n = false;
        this.q = false;
        this.r = -1L;
        this.s = -1L;
        NextGen.isInitialized();
        this.a = new InterstitialRequestManager();
        this.b = new RequestManager(new OpenRTBApiClient(context), new OpenRTBAdRequestFactory());
        this.g = context;
        this.h = str;
        this.i = str2;
        this.e = listener;
        this.m = new JSONObject();
        a("zone_id", this.i);
        this.o = new SkipOffset(SkipOffsetManager.getDefaultHtmlInterstitialSkipOffset().intValue(), false);
        this.p = new SkipOffset(SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset().intValue(), false);
        RequestManager requestManager = this.a;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.b.setIntegrationType(integrationType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JsonOperations.putJsonString(this.m, "ad_request", str);
        JsonOperations.putJsonString(this.m, "ad_response", str2);
        JsonOperations.putJsonLong(this.m, "response_time", currentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, currentTimeMillis);
    }

    public void prepareAd(Ad ad) {
        if (ad != null) {
            this.l = ad;
            if (!TextUtils.isEmpty(ad.getSessionId()) && NextGen.getAdCache() != null) {
                NextGen.getAdCache().put(this.l.getSessionId(), this.l);
            }
            c();
            a();
            Ad ad2 = this.l;
            if (ad2 != null && ad2.getZoneId() != null && !this.l.getZoneId().equalsIgnoreCase(this.i)) {
                String zoneId = this.l.getZoneId();
                this.i = zoneId;
                JsonOperations.putJsonString(this.m, "zone_id", zoneId);
            } else if (this.i == null) {
                this.i = "4";
            }
            IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
            RequestManager requestManager = this.a;
            if (requestManager != null) {
                integrationType = requestManager.getIntegrationType();
            }
            InterstitialPresenter createInterstitialPresenter = new InterstitialPresenterFactory(this.g, this.i).createInterstitialPresenter(this.l, this.o, this.p, this, integrationType, this.u);
            this.c = createInterstitialPresenter;
            if (createInterstitialPresenter != null) {
                createInterstitialPresenter.setVideoListener(this);
                this.c.load();
                return;
            } else {
                a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
                return;
            }
        }
        a(new NextGenError(NextGenErrorCode.INVALID_AD));
    }

    protected void a(Throwable th) {
        long j = -1;
        if (this.r != -1) {
            j = System.currentTimeMillis() - this.r;
            JsonOperations.putJsonLong(this.m, "time_to_load_failed", j);
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load_fail");
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            RequestManager requestManager = this.a;
            if (requestManager != null) {
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(requestManager.getIntegrationType()));
            }
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.l;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.l.getCampaignId());
                reportingEvent.setConfigId(this.l.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        if (th instanceof NextGenError) {
            NextGenError nextGenError = (NextGenError) th;
            if (nextGenError.getErrorCode() == NextGenErrorCode.NO_FILL) {
                Logger.w(v, th.getMessage());
            } else {
                Logger.e(v, th.getMessage());
            }
            a(Integer.valueOf(nextGenError.getErrorCode().getCode()));
        } else {
            a(Integer.valueOf(NextGenErrorCode.UNKNOWN_ERROR.getCode()));
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onInterstitialLoadFailed(th);
        }
    }

    public void loadExchangeAd() {
        loadExchangeAd(null);
    }

    private void a(String str, Object obj) {
        JSONObject jSONObject = this.m;
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

    private void a(Integer num) {
        AdTracker adTracker = this.d;
        if (adTracker != null) {
            adTracker.trackSdkEvent(1, num);
        }
    }
}
