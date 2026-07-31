package com.smaato.sdk.ng.rewarded;

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
import com.smaato.sdk.ng.api.OpenRTBApiClient;
import com.smaato.sdk.ng.api.RequestManager;
import com.smaato.sdk.ng.api.RewardedRequestManager;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.OpenRTBAdRequestFactory;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.prefs.SessionImpressionPrefs;
import com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter;
import com.smaato.sdk.ng.rewarded.presenter.RewardedPresenterFactory;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.AdRequestRegistry;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.MarkupUtils;
import com.smaato.sdk.ng.utils.SignalDataProcessor;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdProcessor;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.vast.VastUrlUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class NextGenRewardedAd implements RequestManager.RequestListener, RewardedPresenter.Listener, VideoListener {
    private static final String t = "NextGenRewardedAd";
    private RequestManager a;
    private RequestManager b;
    private RewardedPresenter c;
    private AdTracker d;
    private final Listener e;
    private final Context f;
    private final String g;
    private String h;
    private String i;
    private Ad j;
    private SignalDataProcessor k;
    private JSONObject l;
    private boolean m;
    private boolean n;
    private long o;
    private long p;
    private VideoListener q;
    private boolean r;
    private String s;

    public interface Listener {
        void onReward();

        void onRewardedClick();

        void onRewardedClosed();

        void onRewardedLoadFailed(Throwable th);

        void onRewardedLoaded();

        void onRewardedOpened();
    }

    class a implements SignalDataProcessor.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onError(Throwable th) {
            NextGenRewardedAd.this.a(th);
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onProcessed(Ad ad) {
            if (ad != null) {
                NextGenRewardedAd.this.prepareAd(ad);
            }
        }
    }

    class b implements NGSDKHttpClient.Listener {
        final /* synthetic */ String a;
        final /* synthetic */ long b;
        final /* synthetic */ String c;

        b(String str, long j, String str2) {
            this.a = str;
            this.b = j;
            this.c = str2;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            Logger.e(NextGenRewardedAd.t, "Request failed: " + th.toString());
            NextGenRewardedAd.this.a(new NextGenError(NextGenErrorCode.INVALID_ASSET));
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            NextGenRewardedAd.this.a(this.a, str, this.b);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NextGenRewardedAd.this.prepareCustomMarkup(this.c, str);
        }
    }

    class c implements VideoAdProcessor.Listener {
        final /* synthetic */ int a;
        final /* synthetic */ String b;
        final /* synthetic */ Ad.AdType c;

        c(int i, String str, Ad.AdType adType) {
            this.a = i;
            this.b = str;
            this.c = adType;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheError(Throwable th) {
            if (NextGenRewardedAd.this.n) {
                return;
            }
            Logger.w(NextGenRewardedAd.t, "onCacheError", th);
            NextGenRewardedAd.this.a(th);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list) {
            if (NextGenRewardedAd.this.n) {
                return;
            }
            if (list != null && !list.isEmpty()) {
                JsonOperations.putStringArray(NextGenRewardedAd.this.l, "om_vendors", list);
            }
            boolean z = (adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true;
            VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str, endCardData, str2);
            NextGenRewardedAd.this.j = new Ad(this.a, this.b, this.c);
            NextGenRewardedAd nextGenRewardedAd = NextGenRewardedAd.this;
            nextGenRewardedAd.j.setZoneId(nextGenRewardedAd.h);
            NextGenRewardedAd.this.j.setHasEndCard(z);
            NextGenRewardedAd.this.b();
            String sessionId = NextGenRewardedAd.this.j.getSessionId();
            NextGen.getAdCache().put(sessionId, NextGenRewardedAd.this.j);
            NextGen.getVideoAdCache().put(sessionId, videoAdCacheItem);
            NextGenRewardedAd nextGenRewardedAd2 = NextGenRewardedAd.this;
            NextGenRewardedAd nextGenRewardedAd3 = NextGenRewardedAd.this;
            RewardedPresenterFactory rewardedPresenterFactory = new RewardedPresenterFactory(nextGenRewardedAd3.f, nextGenRewardedAd3.h);
            NextGenRewardedAd nextGenRewardedAd4 = NextGenRewardedAd.this;
            nextGenRewardedAd2.c = rewardedPresenterFactory.createRewardedPresenter(nextGenRewardedAd4.j, nextGenRewardedAd4, nextGenRewardedAd4.a.getIntegrationType(), NextGenRewardedAd.this.s);
            NextGenRewardedAd nextGenRewardedAd5 = NextGenRewardedAd.this;
            RewardedPresenter rewardedPresenter = nextGenRewardedAd5.c;
            if (rewardedPresenter == null) {
                nextGenRewardedAd5.a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
            } else {
                rewardedPresenter.setVideoListener(nextGenRewardedAd5);
                NextGenRewardedAd.this.c.load();
            }
        }
    }

    public NextGenRewardedAd(Activity activity, Listener listener) {
        this((Context) activity, "", listener);
    }

    private void a() {
        this.m = false;
        this.l = new JSONObject();
        this.o = -1L;
        this.p = -1L;
        RewardedPresenter rewardedPresenter = this.c;
        if (rewardedPresenter != null) {
            rewardedPresenter.destroy();
            this.c = null;
        }
        SignalDataProcessor signalDataProcessor = this.k;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.j != null) {
            this.d = new AdTracker(null, null, this.j.getBeacons("sdk_event"), null, null);
        }
    }

    private void h() {
        RewardedPresenter createRewardedPresenter = new RewardedPresenterFactory(this.f, this.h).createRewardedPresenter(this.j, this, this.a.getIntegrationType(), this.s);
        this.c = createRewardedPresenter;
        if (createRewardedPresenter == null) {
            a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
        } else {
            createRewardedPresenter.setVideoListener(this);
            this.c.load();
        }
    }

    protected void c() {
        Listener listener = this.e;
        if (listener != null) {
            listener.onRewardedClick();
        }
    }

    protected void d() {
        Ad ad = this.j;
        if (ad != null && !TextUtils.isEmpty(ad.getSessionId())) {
            NextGen.getVideoAdCache().remove(this.j.getSessionId());
            Logger.d(t, "Cleaned up VideoAdCache entry for sessionId: " + this.j.getSessionId());
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onRewardedClosed();
        }
    }

    public void destroy() {
        a();
        this.n = true;
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
        long j = -1;
        if (this.o != -1) {
            j = System.currentTimeMillis() - this.o;
            JsonOperations.putJsonLong(this.l, "time_to_load", j);
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a.getIntegrationType()));
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.j;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.j.getCampaignId());
                reportingEvent.setConfigId(this.j.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onRewardedLoaded();
        }
    }

    protected void f() {
        Context context = this.f;
        if (context != null) {
            new SessionImpressionPrefs(context).insert(this.j.getZoneId());
            Listener listener = this.e;
            if (listener != null) {
                listener.onRewardedOpened();
            }
        }
    }

    protected void g() {
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("reward");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a.getIntegrationType()));
            reportingEvent.setHasEndCard(hasEndCard());
            reportingEvent.mergeJSONObject(this.l);
            Ad ad = this.j;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.j.getCampaignId());
                reportingEvent.setConfigId(this.j.getConfigId());
            }
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onReward();
        }
    }

    public Integer getBidPoints() {
        Ad ad = this.j;
        return Integer.valueOf(ad != null ? ad.getECPM().intValue() : 0);
    }

    public String getCreativeId() {
        Ad ad = this.j;
        if (ad != null) {
            return ad.getCreativeId();
        }
        return null;
    }

    public String getImpressionId() {
        Ad ad = this.j;
        if (ad != null) {
            return ad.getImpressionId();
        }
        return null;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.l);
        RequestManager requestManager = this.a;
        if (requestManager != null && (placementParams2 = requestManager.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        RewardedPresenter rewardedPresenter = this.c;
        if (rewardedPresenter != null && (placementParams = rewardedPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public boolean hasEndCard() {
        Ad ad = this.j;
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
        return this.m;
    }

    public void load() {
        a("timestamp", String.valueOf(System.currentTimeMillis()));
        if (NextGen.getAppToken() != null) {
            a("app_token", NextGen.getAppToken());
        }
        a("ad_type", "rewarded");
        a("ad_size", this.a.getAdSize().toString());
        a("integration_type", IntegrationType.STANDALONE);
        if (!NextGen.isInitialized()) {
            this.o = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.h)) {
            this.o = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
            return;
        }
        a();
        this.o = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.g)) {
            this.a.setAppToken(this.g);
        }
        this.a.setZoneId(this.h);
        this.a.setRequestListener(this);
        this.r = false;
        this.a.requestAd();
    }

    public void loadExchangeAd(String str) {
        a("timestamp", String.valueOf(System.currentTimeMillis()));
        if (NextGen.getAppToken() != null) {
            a("app_token", NextGen.getAppToken());
        }
        a("ad_type", "rewarded");
        this.b.setAdSize(AdSize.SIZE_INTERSTITIAL);
        a("ad_size", this.b.getAdSize().toString());
        a("integration_type", IntegrationType.STANDALONE);
        if (!NextGen.isInitialized()) {
            this.o = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.h)) {
            this.o = System.currentTimeMillis();
            a(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
            return;
        }
        a();
        this.o = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.g)) {
            this.b.setAppToken(this.g);
        }
        if (!TextUtils.isEmpty(str)) {
            this.b.setAdFormat(str);
        }
        this.b.setZoneId(this.h);
        this.b.setRequestListener(this);
        this.r = true;
        this.b.requestAd();
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
        this.j = ad;
        b();
        h();
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedClicked(RewardedPresenter rewardedPresenter) {
        c();
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedClosed(RewardedPresenter rewardedPresenter) {
        d();
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedError(RewardedPresenter rewardedPresenter) {
        a(new NextGenError(NextGenErrorCode.ERROR_RENDERING_REWARDED));
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedFinished(RewardedPresenter rewardedPresenter) {
        g();
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedLoaded(RewardedPresenter rewardedPresenter) {
        this.m = true;
        e();
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedOpened(RewardedPresenter rewardedPresenter) {
        if (this.p != -1) {
            a("render_time", Long.valueOf(System.currentTimeMillis() - this.p));
        }
        reportAdRender("rewarded", getPlacementParams());
        f();
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.q;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.q;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.q;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.q;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.q;
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
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a.getIntegrationType()));
        reportingEvent.setHasEndCard(hasEndCard());
        Ad ad = this.j;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.j.getCampaignId());
            reportingEvent.setConfigId(this.j.getConfigId());
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
        this.i = str;
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
        this.q = videoListener;
    }

    public void setWatermark(String str) {
        this.s = str;
    }

    public void show() {
        if (this.c == null || !this.m) {
            Logger.e(t, "Can't display ad. Rewarded ad not ready.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.p = currentTimeMillis;
        long j = this.o;
        if (currentTimeMillis >= 1800000 + j && j != -1) {
            Logger.e(t, POBLogConstants.MSG_AD_EXPIRED_ERROR);
            a();
            a(new NextGenError(NextGenErrorCode.EXPIRED_AD));
            return;
        }
        this.c.show();
        RequestManager requestManager = this.a;
        if (requestManager != null && !this.r) {
            requestManager.sendAdSessionDataToAtom(this.j, Double.valueOf(1.0d));
            return;
        }
        RequestManager requestManager2 = this.b;
        if (requestManager2 == null || !this.r) {
            return;
        }
        requestManager2.sendAdSessionDataToAtom(this.j, Double.valueOf(1.0d));
    }

    public NextGenRewardedAd(Activity activity, String str, Listener listener) {
        this((Context) activity, str, listener);
    }

    public void prepare(CacheListener cacheListener) {
        Ad ad;
        RequestManager requestManager = this.a;
        if (requestManager == null || (ad = this.j) == null) {
            return;
        }
        requestManager.cacheAd(ad, cacheListener);
    }

    public void prepareCustomMarkup(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            a(new NextGenError(NextGenErrorCode.INVALID_ASSET));
            return;
        }
        this.h = str;
        if (MarkupUtils.isVastXml(str2)) {
            if (TextUtils.isEmpty(this.h)) {
                this.h = "4";
                JsonOperations.putJsonString(this.l, "zone_id", "4");
            }
            new VideoAdProcessor().process(this.f, str2, null, new c(15, str2, Ad.AdType.VIDEO));
            return;
        }
        if (TextUtils.isEmpty(this.h)) {
            this.h = "3";
        }
        this.j = new Ad(21, str2, Ad.AdType.HTML);
        b();
        NextGen.getAdCache().put(this.j.getSessionId(), this.j);
        RewardedPresenter createRewardedPresenter = new RewardedPresenterFactory(this.f, this.h).createRewardedPresenter(this.j, this, this.a.getIntegrationType(), this.s);
        this.c = createRewardedPresenter;
        if (createRewardedPresenter == null) {
            a(new NextGenError(NextGenErrorCode.UNSUPPORTED_ASSET));
        } else {
            createRewardedPresenter.setVideoListener(this);
            this.c.load();
        }
    }

    public void prepareVideoTag(String str, String str2) {
        String formatURL = VastUrlUtils.formatURL(str2, VastUrlUtils.buildParameters());
        HashMap hashMap = new HashMap();
        String userAgent = NextGen.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            hashMap.put("User-Agent", userAgent);
        }
        NGSDKHttpClient.makeRequest(this.f, formatURL, hashMap, null, new b(formatURL, System.currentTimeMillis(), str));
    }

    public NextGenRewardedAd(Context context, String str, Listener listener) {
        this(context, null, str, listener);
    }

    public NextGenRewardedAd(Context context, String str, String str2, Listener listener) {
        this.m = false;
        this.n = false;
        this.o = -1L;
        this.p = -1L;
        NextGen.isInitialized();
        this.a = new RewardedRequestManager();
        this.b = new RequestManager(new OpenRTBApiClient(context), new OpenRTBAdRequestFactory());
        this.f = context;
        this.g = str;
        this.h = str2;
        this.e = listener;
        this.l = new JSONObject();
        RequestManager requestManager = this.a;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.b.setIntegrationType(integrationType);
        a("zone_id", this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JsonOperations.putJsonString(this.l, "ad_request", str);
        JsonOperations.putJsonString(this.l, "ad_response", str2);
        JsonOperations.putJsonLong(this.l, "response_time", currentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, currentTimeMillis);
    }

    public void prepareAd(Ad ad) {
        if (ad != null) {
            this.j = ad;
            if (!TextUtils.isEmpty(ad.getSessionId()) && NextGen.getAdCache() != null) {
                NextGen.getAdCache().put(this.j.getSessionId(), this.j);
            }
            b();
            if (!this.j.getZoneId().equalsIgnoreCase(this.h)) {
                String zoneId = this.j.getZoneId();
                this.h = zoneId;
                JsonOperations.putJsonString(this.l, "zone_id", zoneId);
            }
            RewardedPresenter createRewardedPresenter = new RewardedPresenterFactory(this.f, this.h).createRewardedPresenter(this.j, this, this.a.getIntegrationType(), this.s);
            this.c = createRewardedPresenter;
            if (createRewardedPresenter != null) {
                createRewardedPresenter.setVideoListener(this);
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
        if (this.o != -1) {
            j = System.currentTimeMillis() - this.o;
            JsonOperations.putJsonLong(this.l, "time_to_load_failed", j);
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load_fail");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a.getIntegrationType()));
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.j;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.j.getCampaignId());
                reportingEvent.setConfigId(this.j.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        if (th instanceof NextGenError) {
            NextGenError nextGenError = (NextGenError) th;
            if (nextGenError.getErrorCode() == NextGenErrorCode.NO_FILL) {
                Logger.w(t, th.getMessage());
            } else {
                Logger.e(t, th.getMessage());
            }
            a(Integer.valueOf(nextGenError.getErrorCode().getCode()));
        } else {
            a(Integer.valueOf(NextGenErrorCode.UNKNOWN_ERROR.getCode()));
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onRewardedLoadFailed(th);
        }
    }

    public void loadExchangeAd() {
        loadExchangeAd(null);
    }

    private void a(String str, Object obj) {
        JSONObject jSONObject = this.l;
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
