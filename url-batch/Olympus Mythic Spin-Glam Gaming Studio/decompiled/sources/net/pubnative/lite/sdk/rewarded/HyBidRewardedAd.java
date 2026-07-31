package net.pubnative.lite.sdk.rewarded;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.pubmatic.sdk.common.log.POBLogConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.CacheListener;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.api.RewardedRequestManager;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.MarkupUtils;
import net.pubnative.lite.sdk.utils.SignalDataProcessor;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.vast.VastUrlUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class HyBidRewardedAd implements RequestManager.RequestListener, RewardedPresenter.Listener, VideoListener {
    private static final String TAG = "HyBidRewardedAd";
    private static final int TIME_TO_EXPIRE = 1800000;
    private Ad mAd;
    private AdTracker mAdTracker;
    private final String mAppToken;
    private final Context mContext;
    private String mCustomUrl;
    private long mInitialLoadTime;
    private long mInitialRenderTime;
    private boolean mIsDestroyed;
    private boolean mIsExchange;
    private final Listener mListener;
    private RequestManager mORTBRequestManager;
    private JSONObject mPlacementParams;
    private RewardedPresenter mPresenter;
    private boolean mReady;
    private RequestManager mRequestManager;
    private SignalDataProcessor mSignalDataProcessor;
    private VideoListener mVideoListener;
    private String mWatermarkData;
    private String mZoneId;

    public interface Listener {
        void onReward();

        void onRewardedClick();

        void onRewardedClosed();

        void onRewardedLoadFailed(Throwable th);

        void onRewardedLoaded();

        void onRewardedOpened();
    }

    public HyBidRewardedAd(Activity activity, Listener listener) {
        this((Context) activity, "", listener);
    }

    private void addReportingKey(String str, Object obj) {
        JSONObject jSONObject = this.mPlacementParams;
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

    private void cleanup() {
        this.mReady = false;
        this.mPlacementParams = new JSONObject();
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        RewardedPresenter rewardedPresenter = this.mPresenter;
        if (rewardedPresenter != null) {
            rewardedPresenter.destroy();
            this.mPresenter = null;
        }
        SignalDataProcessor signalDataProcessor = this.mSignalDataProcessor;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.mSignalDataProcessor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAdTracker() {
        if (this.mAd != null) {
            this.mAdTracker = new AdTracker(null, null, this.mAd.getBeacons("sdk_event"), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JsonOperations.putJsonString(this.mPlacementParams, "ad_request", str);
        JsonOperations.putJsonString(this.mPlacementParams, "ad_response", str2);
        JsonOperations.putJsonLong(this.mPlacementParams, "response_time", currentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, currentTimeMillis);
    }

    private void renderAd() {
        RewardedPresenter createRewardedPresenter = new RewardedPresenterFactory(this.mContext, this.mZoneId).createRewardedPresenter(this.mAd, this, this.mRequestManager.getIntegrationType(), this.mWatermarkData);
        this.mPresenter = createRewardedPresenter;
        if (createRewardedPresenter == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
        } else {
            createRewardedPresenter.setVideoListener(this);
            this.mPresenter.load();
        }
    }

    private void sendLoadTracker(Integer num) {
        AdTracker adTracker = this.mAdTracker;
        if (adTracker != null) {
            adTracker.trackSdkEvent(1, num);
        }
    }

    public void destroy() {
        cleanup();
        this.mIsDestroyed = true;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.destroy();
            this.mRequestManager = null;
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.destroy();
            this.mORTBRequestManager = null;
        }
    }

    public Integer getBidPoints() {
        Ad ad = this.mAd;
        return Integer.valueOf(ad != null ? ad.getECPM().intValue() : 0);
    }

    public String getCreativeId() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getCreativeId();
        }
        return null;
    }

    public String getImpressionId() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getImpressionId();
        }
        return null;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.mPlacementParams);
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && (placementParams2 = requestManager.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        RewardedPresenter rewardedPresenter = this.mPresenter;
        if (rewardedPresenter != null && (placementParams = rewardedPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public boolean hasEndCard() {
        Ad ad = this.mAd;
        if (ad != null) {
            return AdEndCardManager.isEndCardEnabled(ad).booleanValue();
        }
        return false;
    }

    protected void invokeOnClick() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedClick();
        }
    }

    protected void invokeOnClosed() {
        Ad ad = this.mAd;
        if (ad != null && !TextUtils.isEmpty(ad.getSessionId())) {
            HyBid.getVideoAdCache().remove(this.mAd.getSessionId());
            Logger.d(TAG, "Cleaned up VideoAdCache entry for sessionId: " + this.mAd.getSessionId());
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedClosed();
        }
    }

    protected void invokeOnLoadFailed(Throwable th) {
        long j = -1;
        if (this.mInitialLoadTime != -1) {
            j = System.currentTimeMillis() - this.mInitialLoadTime;
            JsonOperations.putJsonLong(this.mPlacementParams, "time_to_load_failed", j);
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load_fail");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.mAd;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        if (th instanceof HyBidError) {
            HyBidError hyBidError = (HyBidError) th;
            if (hyBidError.getErrorCode() == HyBidErrorCode.NO_FILL) {
                Logger.w(TAG, th.getMessage());
            } else {
                Logger.e(TAG, th.getMessage());
            }
            sendLoadTracker(Integer.valueOf(hyBidError.getErrorCode().getCode()));
        } else {
            sendLoadTracker(Integer.valueOf(HyBidErrorCode.UNKNOWN_ERROR.getCode()));
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedLoadFailed(th);
        }
    }

    protected void invokeOnLoadFinished() {
        long j = -1;
        if (this.mInitialLoadTime != -1) {
            j = System.currentTimeMillis() - this.mInitialLoadTime;
            JsonOperations.putJsonLong(this.mPlacementParams, "time_to_load", j);
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
            reportingEvent.setCustomInteger("time_to_load", j);
            Ad ad = this.mAd;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onRewardedLoaded();
        }
    }

    protected void invokeOnOpened() {
        Context context = this.mContext;
        if (context != null) {
            new SessionImpressionPrefs(context).insert(this.mAd.getZoneId());
            Listener listener = this.mListener;
            if (listener != null) {
                listener.onRewardedOpened();
            }
        }
    }

    protected void invokeOnReward() {
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("reward");
            reportingEvent.setAdFormat("rewarded");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
            reportingEvent.setHasEndCard(hasEndCard());
            reportingEvent.mergeJSONObject(this.mPlacementParams);
            Ad ad = this.mAd;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onReward();
        }
    }

    public boolean isAutoCacheOnLoad() {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            return requestManager.isAutoCacheOnLoad();
        }
        return true;
    }

    public boolean isReady() {
        return this.mReady;
    }

    public void load() {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey("app_token", HyBid.getAppToken());
        }
        addReportingKey("ad_type", "rewarded");
        addReportingKey("ad_size", this.mRequestManager.getAdSize().toString());
        addReportingKey("integration_type", IntegrationType.STANDALONE);
        if (!HyBid.isInitialized()) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.mZoneId)) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
            return;
        }
        cleanup();
        this.mInitialLoadTime = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.mAppToken)) {
            this.mRequestManager.setAppToken(this.mAppToken);
        }
        this.mRequestManager.setZoneId(this.mZoneId);
        this.mRequestManager.setRequestListener(this);
        this.mIsExchange = false;
        this.mRequestManager.requestAd();
    }

    public void loadExchangeAd(String str) {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey("app_token", HyBid.getAppToken());
        }
        addReportingKey("ad_type", "rewarded");
        this.mORTBRequestManager.setAdSize(AdSize.SIZE_INTERSTITIAL);
        addReportingKey("ad_size", this.mORTBRequestManager.getAdSize().toString());
        addReportingKey("integration_type", IntegrationType.STANDALONE);
        if (!HyBid.isInitialized()) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
            return;
        }
        if (TextUtils.isEmpty(this.mZoneId)) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
            return;
        }
        cleanup();
        this.mInitialLoadTime = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.mAppToken)) {
            this.mORTBRequestManager.setAppToken(this.mAppToken);
        }
        if (!TextUtils.isEmpty(str)) {
            this.mORTBRequestManager.setAdFormat(str);
        }
        this.mORTBRequestManager.setZoneId(this.mZoneId);
        this.mORTBRequestManager.setRequestListener(this);
        this.mIsExchange = true;
        this.mORTBRequestManager.requestAd();
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th) {
        invokeOnLoadFailed(th);
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestSuccess(Ad ad) {
        if (ad == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NULL_AD));
            return;
        }
        this.mAd = ad;
        initializeAdTracker();
        renderAd();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedClicked(RewardedPresenter rewardedPresenter) {
        invokeOnClick();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedClosed(RewardedPresenter rewardedPresenter) {
        invokeOnClosed();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedError(RewardedPresenter rewardedPresenter) {
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.ERROR_RENDERING_REWARDED));
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedFinished(RewardedPresenter rewardedPresenter) {
        invokeOnReward();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedLoaded(RewardedPresenter rewardedPresenter) {
        this.mReady = true;
        invokeOnLoadFinished();
    }

    @Override // net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter.Listener
    public void onRewardedOpened(RewardedPresenter rewardedPresenter) {
        if (this.mInitialRenderTime != -1) {
            addReportingKey("render_time", Long.valueOf(System.currentTimeMillis() - this.mInitialRenderTime));
        }
        reportAdRender("rewarded", getPlacementParams());
        invokeOnOpened();
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    public void prepare() {
        prepare(null);
    }

    public void prepareAd(String str) {
        if (TextUtils.isEmpty(str)) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_SIGNAL_DATA));
            return;
        }
        SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
        this.mSignalDataProcessor = signalDataProcessor;
        signalDataProcessor.processSignalData(str, new SignalDataProcessor.Listener() { // from class: net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.1
            @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
            public void onError(Throwable th) {
                HyBidRewardedAd.this.invokeOnLoadFailed(th);
            }

            @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
            public void onProcessed(Ad ad) {
                if (ad != null) {
                    HyBidRewardedAd.this.prepareAd(ad);
                }
            }
        });
    }

    public void prepareCustomMarkup(String str) {
        prepareCustomMarkup("", str);
    }

    public void prepareVideoTag(String str) {
        prepareVideoTag("", str);
    }

    public void reportAdRender(String str, JSONObject jSONObject) {
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("render");
        reportingEvent.setAdFormat(str);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mRequestManager.getIntegrationType()));
        reportingEvent.setHasEndCard(hasEndCard());
        Ad ad = this.mAd;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        reportingEvent.mergeJSONObject(jSONObject);
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    public void setAutoCacheOnLoad(boolean z) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setAutoCacheOnLoad(z);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setAutoCacheOnLoad(z);
        }
    }

    public void setCustomUrl(String str) {
        this.mCustomUrl = str;
    }

    public void setMediation(boolean z) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setMediationVendor(str);
        }
    }

    public void setVideoListener(VideoListener videoListener) {
        this.mVideoListener = videoListener;
    }

    public void setWatermark(String str) {
        this.mWatermarkData = str;
    }

    public void show() {
        if (this.mPresenter == null || !this.mReady) {
            Logger.e(TAG, "Can't display ad. Rewarded ad not ready.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.mInitialRenderTime = currentTimeMillis;
        long j = this.mInitialLoadTime;
        if (currentTimeMillis >= 1800000 + j && j != -1) {
            Logger.e(TAG, POBLogConstants.MSG_AD_EXPIRED_ERROR);
            cleanup();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.EXPIRED_AD));
            return;
        }
        this.mPresenter.show();
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && !this.mIsExchange) {
            requestManager.sendAdSessionDataToAtom(this.mAd, Double.valueOf(1.0d));
            return;
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 == null || !this.mIsExchange) {
            return;
        }
        requestManager2.sendAdSessionDataToAtom(this.mAd, Double.valueOf(1.0d));
    }

    public HyBidRewardedAd(Activity activity, String str, Listener listener) {
        this((Context) activity, str, listener);
    }

    public void prepare(CacheListener cacheListener) {
        Ad ad;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager == null || (ad = this.mAd) == null) {
            return;
        }
        requestManager.cacheAd(ad, cacheListener);
    }

    public void prepareCustomMarkup(String str, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
            return;
        }
        this.mZoneId = str;
        if (MarkupUtils.isVastXml(str2)) {
            if (TextUtils.isEmpty(this.mZoneId)) {
                this.mZoneId = "4";
                JsonOperations.putJsonString(this.mPlacementParams, "zone_id", "4");
            }
            final Ad.AdType adType = Ad.AdType.VIDEO;
            final int i = 15;
            new VideoAdProcessor().process(this.mContext, str2, null, new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.3
                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheError(Throwable th) {
                    if (HyBidRewardedAd.this.mIsDestroyed) {
                        return;
                    }
                    Logger.w(HyBidRewardedAd.TAG, "onCacheError", th);
                    HyBidRewardedAd.this.invokeOnLoadFailed(th);
                }

                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheSuccess(AdParams adParams, String str3, EndCardData endCardData, String str4, List<String> list) {
                    if (HyBidRewardedAd.this.mIsDestroyed) {
                        return;
                    }
                    if (list != null && !list.isEmpty()) {
                        JsonOperations.putStringArray(HyBidRewardedAd.this.mPlacementParams, "om_vendors", list);
                    }
                    boolean z = (adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true;
                    VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str3, endCardData, str4);
                    HyBidRewardedAd.this.mAd = new Ad(i, str2, adType);
                    HyBidRewardedAd.this.mAd.setZoneId(HyBidRewardedAd.this.mZoneId);
                    HyBidRewardedAd.this.mAd.setHasEndCard(z);
                    HyBidRewardedAd.this.initializeAdTracker();
                    String sessionId = HyBidRewardedAd.this.mAd.getSessionId();
                    HyBid.getAdCache().put(sessionId, HyBidRewardedAd.this.mAd);
                    HyBid.getVideoAdCache().put(sessionId, videoAdCacheItem);
                    HyBidRewardedAd hyBidRewardedAd = HyBidRewardedAd.this;
                    RewardedPresenterFactory rewardedPresenterFactory = new RewardedPresenterFactory(HyBidRewardedAd.this.mContext, HyBidRewardedAd.this.mZoneId);
                    Ad ad = HyBidRewardedAd.this.mAd;
                    HyBidRewardedAd hyBidRewardedAd2 = HyBidRewardedAd.this;
                    hyBidRewardedAd.mPresenter = rewardedPresenterFactory.createRewardedPresenter(ad, hyBidRewardedAd2, hyBidRewardedAd2.mRequestManager.getIntegrationType(), HyBidRewardedAd.this.mWatermarkData);
                    if (HyBidRewardedAd.this.mPresenter == null) {
                        HyBidRewardedAd.this.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
                    } else {
                        HyBidRewardedAd.this.mPresenter.setVideoListener(HyBidRewardedAd.this);
                        HyBidRewardedAd.this.mPresenter.load();
                    }
                }
            });
            return;
        }
        if (TextUtils.isEmpty(this.mZoneId)) {
            this.mZoneId = "3";
        }
        this.mAd = new Ad(21, str2, Ad.AdType.HTML);
        initializeAdTracker();
        HyBid.getAdCache().put(this.mAd.getSessionId(), this.mAd);
        RewardedPresenter createRewardedPresenter = new RewardedPresenterFactory(this.mContext, this.mZoneId).createRewardedPresenter(this.mAd, this, this.mRequestManager.getIntegrationType(), this.mWatermarkData);
        this.mPresenter = createRewardedPresenter;
        if (createRewardedPresenter == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
        } else {
            createRewardedPresenter.setVideoListener(this);
            this.mPresenter.load();
        }
    }

    public void prepareVideoTag(final String str, String str2) {
        final String formatURL = VastUrlUtils.formatURL(str2, VastUrlUtils.buildParameters());
        HashMap hashMap = new HashMap();
        String userAgent = HyBid.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            hashMap.put("User-Agent", userAgent);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        PNHttpClient.makeRequest(this.mContext, formatURL, hashMap, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.rewarded.HyBidRewardedAd.2
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th) {
                Logger.e(HyBidRewardedAd.TAG, "Request failed: " + th.toString());
                HyBidRewardedAd.this.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str3, Map<String, List<String>> map) {
                HyBidRewardedAd.this.registerAdRequest(formatURL, str3, currentTimeMillis);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                HyBidRewardedAd.this.prepareCustomMarkup(str, str3);
            }
        });
    }

    public HyBidRewardedAd(Context context, String str, Listener listener) {
        this(context, null, str, listener);
    }

    public HyBidRewardedAd(Context context, String str, String str2, Listener listener) {
        this.mReady = false;
        this.mIsDestroyed = false;
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        if (!HyBid.isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before creating a HyBidRewardedAd");
        }
        this.mRequestManager = new RewardedRequestManager();
        this.mORTBRequestManager = new RequestManager(new OpenRTBApiClient(context), new OpenRTBAdRequestFactory());
        this.mContext = context;
        this.mAppToken = str;
        this.mZoneId = str2;
        this.mListener = listener;
        this.mPlacementParams = new JSONObject();
        RequestManager requestManager = this.mRequestManager;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.mORTBRequestManager.setIntegrationType(integrationType);
        addReportingKey("zone_id", this.mZoneId);
    }

    public void prepareAd(Ad ad) {
        if (ad != null) {
            this.mAd = ad;
            if (!TextUtils.isEmpty(ad.getSessionId()) && HyBid.getAdCache() != null) {
                HyBid.getAdCache().put(this.mAd.getSessionId(), this.mAd);
            }
            initializeAdTracker();
            if (!this.mAd.getZoneId().equalsIgnoreCase(this.mZoneId)) {
                String zoneId = this.mAd.getZoneId();
                this.mZoneId = zoneId;
                JsonOperations.putJsonString(this.mPlacementParams, "zone_id", zoneId);
            }
            RewardedPresenter createRewardedPresenter = new RewardedPresenterFactory(this.mContext, this.mZoneId).createRewardedPresenter(this.mAd, this, this.mRequestManager.getIntegrationType(), this.mWatermarkData);
            this.mPresenter = createRewardedPresenter;
            if (createRewardedPresenter != null) {
                createRewardedPresenter.setVideoListener(this);
                this.mPresenter.load();
                return;
            } else {
                invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
                return;
            }
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_AD));
    }

    public void loadExchangeAd() {
        loadExchangeAd(null);
    }
}
