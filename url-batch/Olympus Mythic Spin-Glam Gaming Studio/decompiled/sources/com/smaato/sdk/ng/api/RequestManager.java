package com.smaato.sdk.ng.api;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.smaato.sdk.ng.AdCache;
import com.smaato.sdk.ng.CacheListener;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.api.ApiClient;
import com.smaato.sdk.ng.api.RequestManager;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdRequest;
import com.smaato.sdk.ng.models.AdRequestFactory;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.NGSDKAdRequest;
import com.smaato.sdk.ng.models.NGSDKAdRequestFactory;
import com.smaato.sdk.ng.models.request.OpenRTBAdRequest;
import com.smaato.sdk.ng.utils.AdTopicsAPIManager;
import com.smaato.sdk.ng.utils.AtomManager;
import com.smaato.sdk.ng.utils.CheckUtils;
import com.smaato.sdk.ng.utils.HeaderBiddingUtils;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKInitializationHelper;
import com.smaato.sdk.ng.utils.PrebidUtils;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import com.smaato.sdk.ng.vpaid.VideoAdCache;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdProcessor;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RequestManager {
    private static final String w = "RequestManager";
    private IntegrationType a;
    private ApiClient b;
    private DeviceInfo c;
    private AdCache d;
    private VideoAdCache e;
    private final AdRequestFactory f;
    private final ReportingController g;
    private final NGSDKInitializationHelper h;
    private String i;
    private String j;
    private String k;
    private RequestListener l;
    private boolean m;
    private AdSize n;
    private final JSONObject o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    final JSONObject t;
    private Long u;
    private Long v;

    public static final class AdFormat {
        public static final String HTML = "html";
        public static final String VIDEO = "video";
    }

    public interface RequestListener {
        void onRequestFail(Throwable th);

        void onRequestSuccess(Ad ad);
    }

    class a implements ApiClient.AdRequestListener {
        final /* synthetic */ AdRequest a;

        a(AdRequest adRequest) {
            this.a = adRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Throwable th) {
            RequestListener requestListener = RequestManager.this.l;
            if (requestListener != null) {
                requestListener.onRequestFail(th);
            }
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.AdRequestListener
        public void onFailure(final Throwable th) {
            if (RequestManager.this.m) {
                return;
            }
            Logger.w(RequestManager.w, th.getMessage());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.api.RequestManager$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RequestManager.a.this.a(th);
                }
            });
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.AdRequestListener
        public void onSuccess(Ad ad) {
            if (RequestManager.this.m) {
                return;
            }
            Logger.d(RequestManager.w, "Received ad response for zone id: " + this.a.zoneId);
            RequestManager requestManager = RequestManager.this;
            requestManager.a(this.a, ad, requestManager.a);
            RequestManager.this.a(this.a, ad);
        }
    }

    class b implements VideoAdProcessor.Listener {
        final /* synthetic */ Ad a;
        final /* synthetic */ CacheListener b;

        b(Ad ad, CacheListener cacheListener) {
            this.a = ad;
            this.b = cacheListener;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheError(Throwable th) {
            RequestListener requestListener;
            if (RequestManager.this.m) {
                return;
            }
            Logger.w(RequestManager.w, th.getMessage());
            RequestManager requestManager = RequestManager.this;
            requestManager.q = false;
            requestManager.r = false;
            if (requestManager.p && (requestListener = requestManager.l) != null) {
                requestListener.onRequestFail(th);
                return;
            }
            CacheListener cacheListener = this.b;
            if (cacheListener != null) {
                cacheListener.onCacheFailed(th);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list) {
            RequestListener requestListener;
            RequestManager requestManager = RequestManager.this;
            if (requestManager.m) {
                return;
            }
            requestManager.v = Long.valueOf(System.currentTimeMillis());
            if (list != null && !list.isEmpty()) {
                JsonOperations.putStringArray(RequestManager.this.o, "om_vendors", list);
            }
            try {
                RequestManager requestManager2 = RequestManager.this;
                requestManager2.t.put("cache_time", String.valueOf(requestManager2.v.longValue() - RequestManager.this.u.longValue()));
            } catch (JSONException e) {
                Logger.w(RequestManager.w, e.getMessage());
                NextGen.reportException((Exception) e);
            }
            RequestManager.this.a();
            this.a.setHasEndCard((adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true);
            RequestManager.this.e.put(this.a.getSessionId(), new VideoAdCacheItem(adParams, str, endCardData, str2));
            RequestManager requestManager3 = RequestManager.this;
            requestManager3.q = false;
            requestManager3.r = true;
            if (requestManager3.p && (requestListener = requestManager3.l) != null) {
                requestListener.onRequestSuccess(this.a);
                return;
            }
            CacheListener cacheListener = this.b;
            if (cacheListener != null) {
                cacheListener.onCacheSuccess();
            }
        }
    }

    public RequestManager() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequest adRequest) {
        b(adRequest);
        if (adRequest != null) {
            try {
                this.t.put("ad_request", adRequest.toString());
            } catch (JSONException e) {
                e.printStackTrace();
                NextGen.reportException((Exception) e);
            }
        }
    }

    void b(AdRequest adRequest) {
        if (this.b == null) {
            this.b = NextGen.getApiClient();
        }
        if (this.c == null) {
            this.c = NextGen.getDeviceInfo();
        }
        try {
            this.t.put("timestamp", String.valueOf(System.currentTimeMillis()));
        } catch (JSONException e) {
            e.printStackTrace();
            NextGen.reportException((Exception) e);
        }
        Logger.d(w, "Requesting ad for zone id: " + adRequest.zoneId);
        if (adRequest instanceof NGSDKAdRequest) {
            a((NGSDKAdRequest) adRequest);
        } else {
            a((OpenRTBAdRequest) adRequest);
        }
        if (!TextUtils.isEmpty(this.k)) {
            this.b.setCustomUrl(this.k);
        }
        this.b.getAd(adRequest, this.c.getUserAgent(), new a(adRequest));
    }

    public void cacheAd(Ad ad) {
        cacheAd(ad, null);
    }

    public void destroy() {
        this.l = null;
        this.m = true;
    }

    public AdSize getAdSize() {
        return this.n;
    }

    public NGSDKInitializationHelper getInitializationHelper() {
        return this.h;
    }

    public IntegrationType getIntegrationType() {
        return this.a;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.o);
        if (getAdSize() != null) {
            JsonOperations.putJsonString(jSONObject, "ad_size", getAdSize().toString());
        }
        JsonOperations.putJsonBoolean(jSONObject, "om_enabled", NextGen.isViewabilityMeasurementActivated() && NextGen.getViewabilityManager() != null);
        ApiClient apiClient = this.b;
        if (apiClient != null && (placementParams = apiClient.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public boolean isAutoCacheOnLoad() {
        return this.p;
    }

    public boolean isRewarded() {
        return false;
    }

    public void requestAd() {
        if (CheckUtils.NoThrow.checkArgument(this.h.isInitialized(), "NextGen SDK has not been initialized. Please call NextGen#initialize in your application's onCreate method.") && CheckUtils.NoThrow.checkNotNull(NextGen.getDeviceInfo(), "NextGen SDK has not been initialized yet. Please call NextGen#initialize in your application's onCreate method.") && CheckUtils.NoThrow.checkNotNull(NextGen.getUserDataManager(), "NextGen SDK has not been initialized yet. Please call NextGen#initialize in your application's onCreate method.") && CheckUtils.NoThrow.checkNotNull(this.j, "zone id cannot be null") && CheckUtils.NoThrow.checkArgument(!this.m, "RequestManager has been destroyed")) {
            if (NextGen.isTestMode()) {
                Logger.w(w, "You are using Verve NextGen SDK on test mode. Please disable test mode before submitting your application for production.");
            }
            this.q = false;
            this.r = false;
            this.f.createAdRequest(TextUtils.isEmpty(this.i) ? null : this.i, this.j, getAdSize(), isRewarded(), false, new AdRequestFactory.Callback() { // from class: com.smaato.sdk.ng.api.RequestManager$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.models.AdRequestFactory.Callback
                public final void onRequestCreated(AdRequest adRequest) {
                    RequestManager.this.a(adRequest);
                }
            });
        }
    }

    public void sendAdSessionDataToAtom(Ad ad, Double d) {
        if (ad != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (ad.getCreativeId() != null && !ad.getCreativeId().isEmpty()) {
                    jSONObject.put("creative_id", ad.getCreativeId());
                }
                if (ad.getCampaignId() != null && !ad.getCampaignId().isEmpty()) {
                    jSONObject.put("campaign_id", ad.getCampaignId());
                }
                jSONObject.put("Bid price", HeaderBiddingUtils.getBidFromPoints(ad.getECPM(), PrebidUtils.KeywordMode.THREE_DECIMALS));
                String str = this.s;
                if (str == null) {
                    str = "native";
                }
                jSONObject.put("Ad format", str);
                jSONObject.put("Rendering_status", "rendering success");
                jSONObject.put("Viewability", d != null ? d.doubleValue() : 0.0d);
                HashMap hashMap = new HashMap();
                String jSONObject2 = jSONObject.toString();
                hashMap.put("Ad_Session_Data", jSONObject2);
                AtomManager.setAdSessionData(hashMap);
                if (jSONObject2.isEmpty()) {
                    return;
                }
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setEventType("send_ad_session_data");
                reportingEvent.setTimestamp(System.currentTimeMillis());
                hashMap.put("Ad_Session_Data", jSONObject2);
                reportingEvent.setAdSessionData(jSONObject2);
                ReportingController reportingController = this.g;
                if (reportingController != null) {
                    reportingController.reportEvent(reportingEvent);
                }
            } catch (JSONException e) {
                Logger.d(w, "Error while sending ad session data to Atom: " + e.getMessage());
            }
        }
    }

    public void setAdFormat(String str) {
        AdRequestFactory adRequestFactory = this.f;
        if (adRequestFactory != null) {
            adRequestFactory.setAdFormat(str);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.n = adSize;
        if (adSize != null) {
            JsonOperations.putJsonString(this.o, "ad_size", adSize.toString());
        } else {
            JsonOperations.removeJsonValue(this.o, "ad_size");
        }
    }

    public void setAppToken(String str) {
        this.i = str;
    }

    public void setAutoCacheOnLoad(boolean z) {
        this.p = z;
    }

    public void setCustomUrl(String str) {
        this.k = str;
    }

    public void setIntegrationType(IntegrationType integrationType) {
        if (integrationType != null) {
            this.a = integrationType;
        }
        AdRequestFactory adRequestFactory = this.f;
        if (adRequestFactory != null) {
            adRequestFactory.setIntegrationType(integrationType);
            JsonOperations.putJsonString(this.o, "integration_type", integrationType.getCode());
        }
    }

    public void setMediationVendor(String str) {
        AdRequestFactory adRequestFactory = this.f;
        if (adRequestFactory != null) {
            adRequestFactory.setMediationVendor(str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JsonOperations.putJsonString(this.o, "mediation_vendor", str);
        }
    }

    public void setRequestListener(RequestListener requestListener) {
        this.l = requestListener;
    }

    public void setZoneId(String str) {
        this.j = str;
    }

    public RequestManager(AdSize adSize) {
        this(NextGen.getApiClient(), NextGen.getDeviceInfo(), NextGen.getAdCache(), NextGen.getVideoAdCache(), new NGSDKAdRequestFactory(), NextGen.getReportingController(), adSize, new NGSDKInitializationHelper());
    }

    public void cacheAd(Ad ad, CacheListener cacheListener) {
        if (ad == null || TextUtils.isEmpty(ad.getVast()) || this.q || this.r) {
            if (cacheListener != null) {
                cacheListener.onCacheSuccess();
                return;
            }
            return;
        }
        this.q = true;
        this.r = false;
        try {
            this.t.put("ad_type", VastTagName.VAST);
            this.t.put("vast", ad.getVast());
        } catch (JSONException e) {
            e.printStackTrace();
            NextGen.reportException((Exception) e);
        }
        this.u = Long.valueOf(System.currentTimeMillis());
        new VideoAdProcessor().process(this.b.getContext(), ad.getVast(), getAdSize(), new b(ad, cacheListener));
    }

    public RequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        this(null, apiClient, adRequestFactory);
    }

    public RequestManager(AdSize adSize, ApiClient apiClient, AdRequestFactory adRequestFactory) {
        this(apiClient, NextGen.getDeviceInfo(), NextGen.getAdCache(), NextGen.getVideoAdCache(), adRequestFactory, NextGen.getReportingController(), adSize, new NGSDKInitializationHelper());
    }

    RequestManager(ApiClient apiClient, DeviceInfo deviceInfo, AdCache adCache, VideoAdCache videoAdCache, AdRequestFactory adRequestFactory, ReportingController reportingController, AdSize adSize, NGSDKInitializationHelper nGSDKInitializationHelper) {
        this.a = IntegrationType.STANDALONE;
        this.p = true;
        this.q = false;
        this.r = false;
        this.u = 0L;
        this.v = 0L;
        this.b = apiClient;
        this.c = deviceInfo;
        this.d = adCache;
        this.e = videoAdCache;
        this.g = reportingController;
        this.f = adRequestFactory;
        this.h = nGSDKInitializationHelper;
        JSONObject jSONObject = new JSONObject();
        this.o = jSONObject;
        if (adSize == null) {
            this.n = AdSize.SIZE_320x50;
        } else {
            this.n = adSize;
        }
        JsonOperations.putJsonString(jSONObject, "ad_size", this.n.toString());
        JsonOperations.putJsonString(jSONObject, "integration_type", IntegrationType.HEADER_BIDDING.getCode());
        JSONObject jSONObject2 = new JSONObject();
        this.t = jSONObject2;
        String str = this.i;
        if (str == null || TextUtils.isEmpty(str)) {
            this.i = NextGen.getAppToken();
        }
        try {
            jSONObject2.put("app_token", this.i);
        } catch (JSONException e) {
            e.printStackTrace();
            NextGen.reportException((Exception) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdRequest adRequest, Ad ad) {
        AdCache adCache = this.d;
        if (adCache == null || adCache != NextGen.getAdCache()) {
            this.d = NextGen.getAdCache();
        }
        VideoAdCache videoAdCache = this.e;
        if (videoAdCache == null || videoAdCache != NextGen.getVideoAdCache()) {
            this.e = NextGen.getVideoAdCache();
        }
        ad.setZoneId(adRequest.zoneId);
        this.d.put(ad.getSessionId(), ad);
        AdTopicsAPIManager.setTopicsAPIEnabled(this.b.getContext(), ad);
        int i = ad.assetgroupid;
        if (i != 4 && i != 15) {
            RequestListener requestListener = this.l;
            if (requestListener != null) {
                requestListener.onRequestSuccess(ad);
                return;
            }
            return;
        }
        if (this.p) {
            cacheAd(ad);
            return;
        }
        RequestListener requestListener2 = this.l;
        if (requestListener2 != null) {
            requestListener2.onRequestSuccess(ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.g == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("cache");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a));
        JsonOperations.mergeJsonObjects(this.t, getPlacementParams());
        reportingEvent.mergeJSONObject(this.t);
        this.g.reportEvent(reportingEvent);
    }

    private void a(NGSDKAdRequest nGSDKAdRequest) {
        if (this.g == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("request");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a));
        reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
        if (getAdSize() != null) {
            reportingEvent.setAdSize(getAdSize().toString());
        }
        reportingEvent.setPlacementId(nGSDKAdRequest.zoneId);
        reportingEvent.setSessionDuration(nGSDKAdRequest.sessionduration);
        reportingEvent.setImpDepth(nGSDKAdRequest.impdepth);
        reportingEvent.setAgeOfApp(nGSDKAdRequest.ageofapp);
        reportingEvent.setRequestType("apiv3");
        this.g.reportEvent(reportingEvent);
    }

    private void a(OpenRTBAdRequest openRTBAdRequest) {
        if (this.g == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("request");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.a));
        reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
        if (getAdSize() != null) {
            reportingEvent.setAdSize(getAdSize().toString());
        }
        reportingEvent.setPlacementId(openRTBAdRequest.zoneId);
        reportingEvent.setRequestType("ortb");
        this.g.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdRequest adRequest, Ad ad, IntegrationType integrationType) {
        if (this.g == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("response");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(integrationType));
        reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
        if (getAdSize() != null) {
            reportingEvent.setAdSize(getAdSize().toString());
        }
        reportingEvent.setPlacementId(adRequest.zoneId);
        reportingEvent.setImpId(ad.getSessionId());
        reportingEvent.setCampaignId(ad.getCampaignId());
        reportingEvent.setConfigId(ad.getConfigId());
        reportingEvent.setCustomString("bid_price", HeaderBiddingUtils.getBidFromPoints(ad.getECPM(), PrebidUtils.KeywordMode.THREE_DECIMALS));
        int i = ad.assetgroupid;
        if (i != 4) {
            if (i != 8 && i != 10 && i != 12) {
                if (i != 15) {
                    switch (i) {
                        case 21:
                        case 22:
                        case 23:
                        case 29:
                            if (isRewarded()) {
                                this.s = "rewarded";
                                reportingEvent.setAdFormat("rewarded");
                            } else {
                                this.s = "fullscreen";
                                reportingEvent.setAdFormat("fullscreen");
                            }
                            reportingEvent.setCreativeType("standard");
                            break;
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            this.s = "native";
                            reportingEvent.setAdFormat("native");
                            break;
                    }
                } else {
                    if (isRewarded()) {
                        this.s = "rewarded";
                        reportingEvent.setAdFormat("rewarded");
                    } else {
                        this.s = "fullscreen";
                        reportingEvent.setAdFormat("fullscreen");
                    }
                    reportingEvent.setCreativeType("video");
                }
            }
            this.s = "banner";
            reportingEvent.setAdFormat("banner");
            reportingEvent.setCreativeType("standard");
        } else {
            this.s = "banner";
            reportingEvent.setAdFormat("banner");
            reportingEvent.setCreativeType("video");
        }
        this.g.reportEvent(reportingEvent);
    }
}
