package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.internal.C6015j;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.protobuf.AdCacheControl;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class AdResponse implements ExpirationHandler.Listener {

    @NonNull
    private static final String CLICK_BROWSER = "clickbrowser";
    private static final long DEF_EXPIRATION_TIME_SEC = TimeUnit.MINUTES.toSeconds(29);

    @NonNull
    private final Ad ad;

    @Nullable
    private final AdCacheControl adCacheControl;

    @Nullable
    private volatile AdObject adObject;

    @NonNull
    @VisibleForTesting
    final AdResponseAdProcessCallback adProcessCallback;

    @NonNull
    private final AdRequestParameters adRequestParameters;

    @NonNull
    private final AuctionResult auctionResult;
    private final String bidId;
    private final long createTimeMs;

    @Nullable
    private final AdExtension.EventConfiguration eventConfiguration;

    @NonNull
    private final ExpirationHandler expirationHandler;
    private final long expirationTimeMs;

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isCached;
    final boolean isCridMonitoringEnabled;

    @Nullable
    @VisibleForTesting
    ExpirationHandler loadExpirationHandler;

    @NonNull
    private final NetworkAdUnitManager networkAdUnitManager;

    @NonNull
    final String responseId;
    private final Struct seatBidExt;

    @NonNull
    final Tag tag;

    @NonNull
    @VisibleForTesting
    final BidMachineTrackingObject trackingObject;

    @NonNull
    private final NetworkAdUnit winnerNetworkAdUnit;

    @VisibleForTesting
    final Map<TrackEventType, List<String>> trackUrlsMap = new EnumMap(TrackEventType.class);

    @NonNull
    private final AtomicBoolean isExpired = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final List<WeakReference<AdRequest<?, ?, ?>>> weakAdRequestList = new CopyOnWriteArrayList();
    private volatile d status = d.Idle;

    public AdResponse(@NonNull AdRequestParameters adRequestParameters, @NonNull NetworkAdUnitManager networkAdUnitManager, @NonNull Response response, @NonNull Response.Seatbid seatbid, @NonNull Response.Seatbid.Bid bid, @NonNull Ad ad, @NonNull NetworkAdapter networkAdapter) {
        boolean z = false;
        AdResponseAdProcessCallback adResponseAdProcessCallback = new AdResponseAdProcessCallback(this);
        this.adProcessCallback = adResponseAdProcessCallback;
        this.isCached = new AtomicBoolean(false);
        this.tag = new Tag("AdResponse");
        this.createTimeMs = System.currentTimeMillis();
        this.adRequestParameters = adRequestParameters;
        this.networkAdUnitManager = networkAdUnitManager;
        this.responseId = response.getId();
        this.seatBidExt = seatbid.getExt();
        this.bidId = bid.getId();
        this.ad = ad;
        AdExtension findFirstAdExtension = ProtoUtils.findFirstAdExtension(ad);
        g gVar = new g(adRequestParameters.getAdsType(), seatbid, bid, ad, networkAdapter, findFirstAdExtension);
        this.auctionResult = gVar;
        this.eventConfiguration = findEventConfiguration(findFirstAdExtension);
        this.adCacheControl = findAdCacheControl(findFirstAdExtension);
        long orDefault = Utils.getOrDefault(bid.getExp(), Response.Seatbid.Bid.getDefaultInstance().getExp(), DEF_EXPIRATION_TIME_SEC) * 1000;
        this.expirationTimeMs = orDefault;
        BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject(gVar.getId());
        this.trackingObject = bidMachineTrackingObject;
        bidMachineTrackingObject.setAdResponse(this);
        this.winnerNetworkAdUnit = networkAdUnitManager.findOrAddWinnerNetworkAdUnit(networkAdapter, adRequestParameters.getAdsFormat(), gVar.getNetworkParams());
        this.expirationHandler = new ExpirationHandler(orDefault, this);
        int creativeLoadingTimeout = findFirstAdExtension != null ? findFirstAdExtension.getCreativeLoadingTimeout() : 0;
        this.loadExpirationHandler = creativeLoadingTimeout > 0 ? new ExpirationHandler(creativeLoadingTimeout, new C6015j(adResponseAdProcessCallback)) : null;
        if (findFirstAdExtension != null && findFirstAdExtension.getCridMonitoringEnabled()) {
            z = true;
        }
        this.isCridMonitoringEnabled = z;
        extractTrackUrls(bid);
        subscribeExpireTracker();
    }

    private boolean canBeUsedInFuture() {
        return (wasShown() || isExpired()) ? false : true;
    }

    private void extractTrackUrls(@NonNull Response.Seatbid.Bid bid) {
        ProtoUtils.addEvent(this.trackUrlsMap, TrackEventType.MediationWin, bid.getPurl());
        ProtoUtils.addEvent(this.trackUrlsMap, TrackEventType.MediationLoss, bid.getLurl());
    }

    @Nullable
    private AdCacheControl findAdCacheControl(@Nullable AdExtension adExtension) {
        AdCacheControl adCacheControl;
        if (adExtension == null || (adCacheControl = adExtension.getAdCacheControl()) == AdCacheControl.UNRECOGNIZED) {
            return null;
        }
        return adCacheControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$attachAdRequest$0() {
        return String.format("attachRequest - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$3() {
        return String.format("destroy - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$4() {
        try {
            AdObject adObject = getAdObject();
            if (adObject != null) {
                adObject.onDestroy();
            }
        } catch (Throwable th) {
            Logger.w(th);
        }
        this.adObject = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$detachAdRequest$1() {
        return String.format("detachRequest - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$notifyExpired$5() {
        return String.format("notifyExpired - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoadStart$2() {
        return String.format("onLoadStart - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$release$6() {
        return String.format("release - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$7() {
        try {
            AdObject adObject = getAdObject();
            if (adObject != null) {
                adObject.hide();
            }
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    private void subscribeExpireTracker() {
        this.expirationHandler.start();
    }

    public void attachAdRequest(@Nullable AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda3
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$attachAdRequest$0;
                lambda$attachAdRequest$0 = AdResponse.this.lambda$attachAdRequest$0();
                return lambda$attachAdRequest$0;
            }
        });
        this.weakAdRequestList.add(new WeakReference<>(adRequest));
    }

    public long calculateExpirationLeftMs() {
        return this.expirationTimeMs - (System.currentTimeMillis() - this.createTimeMs);
    }

    public boolean canCache() {
        return this.adCacheControl == AdCacheControl.AD_CACHE_CONTROL_ENABLED;
    }

    void clearAdRequestList() {
        Iterator<WeakReference<AdRequest<?, ?, ?>>> it = this.weakAdRequestList.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.weakAdRequestList.clear();
    }

    @VisibleForTesting
    void clearCreativeLoadingTimeout() {
        ExpirationHandler expirationHandler = this.loadExpirationHandler;
        if (expirationHandler != null) {
            expirationHandler.stop();
        }
        this.loadExpirationHandler = null;
    }

    @NonNull
    Value createBidCacheExtensionValue() {
        Struct.Builder putFields = Struct.newBuilder().putFields("price", Value.newBuilder().setNumberValue(this.auctionResult.getPrice()).build()).putFields("exp", Value.newBuilder().setNumberValue(calculateExpirationLeftMs()).build()).putFields("request_id", Value.newBuilder().setStringValue(this.responseId).build()).putFields("bid_id", Value.newBuilder().setStringValue(this.bidId).build());
        if (this.seatBidExt.getFieldsCount() > 0) {
            putFields.putFields("seat", Value.newBuilder().setStructValue(this.seatBidExt).build());
        }
        return Value.newBuilder().setStructValue(putFields).build();
    }

    void destroy() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda4
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$destroy$3;
                lambda$destroy$3 = AdResponse.this.lambda$destroy$3();
                return lambda$destroy$3;
            }
        });
        C5999c.a().e(this);
        clearCreativeLoadingTimeout();
        clearAdRequestList();
        unsubscribeExpireTracker();
        this.adProcessCallback.destroy();
        this.trackUrlsMap.clear();
        this.networkAdUnitManager.notifyNetworkClearAuction();
        if (this.adProcessCallback.isLoading()) {
            eventFinish(TrackEventType.Load, false, BMError.Destroyed);
        }
        if (this.adObject != null) {
            eventFinish(TrackEventType.Destroy, false);
        }
        this.trackingObject.clear();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AdResponse.this.lambda$destroy$4();
            }
        });
    }

    public void detachAdRequest(@Nullable AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$detachAdRequest$1;
                lambda$detachAdRequest$1 = AdResponse.this.lambda$detachAdRequest$1();
                return lambda$detachAdRequest$1;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (WeakReference<AdRequest<?, ?, ?>> weakReference : this.weakAdRequestList) {
            AdRequest<?, ?, ?> adRequest2 = weakReference.get();
            if (adRequest2 == null || adRequest2 == adRequest) {
                arrayList.add(weakReference);
            }
        }
        this.weakAdRequestList.removeAll(arrayList);
        if (this.weakAdRequestList.isEmpty()) {
            release();
        }
    }

    void eventFinish(@NonNull TrackEventType trackEventType, boolean z) {
        eventFinish(trackEventType, z, null, null);
    }

    void expireAdRequests(@Nullable AdRequest<?, ?, ?> adRequest) {
        Iterator<WeakReference<AdRequest<?, ?, ?>>> it = this.weakAdRequestList.iterator();
        while (it.hasNext()) {
            AdRequest<?, ?, ?> adRequest2 = it.next().get();
            if (adRequest2 != null && adRequest2 != adRequest) {
                adRequest2.processExpired();
            }
        }
    }

    @Nullable
    @VisibleForTesting
    AdExtension.EventConfiguration findEventConfiguration(@Nullable AdExtension adExtension) {
        AdExtension.EventConfiguration eventConfiguration;
        if (adExtension == null || (eventConfiguration = adExtension.getEventConfiguration()) == AdExtension.EventConfiguration.getDefaultInstance()) {
            return null;
        }
        return eventConfiguration;
    }

    @NonNull
    public Ad getAd() {
        return this.ad;
    }

    @Nullable
    public AdObject getAdObject() {
        return this.adObject;
    }

    @NonNull
    public AdRequestParameters getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @NonNull
    public AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    @NonNull
    public AuctionResult getAuctionResult() {
        return this.auctionResult;
    }

    @Nullable
    public CreativeFormat getCreativeFormat() {
        return this.auctionResult.getCreativeFormat();
    }

    @Nullable
    public AdExtension.EventConfiguration getEventConfiguration() {
        return this.eventConfiguration;
    }

    public double getPrice() {
        return this.auctionResult.getPrice();
    }

    public synchronized d getStatus() {
        return this.status;
    }

    @Nullable
    public List<String> getTrackUrlListByEvent(@NonNull TrackEventType trackEventType) {
        return this.trackUrlsMap.get(trackEventType);
    }

    @NonNull
    public VisibilitySource getVisibilitySource() {
        return this.adProcessCallback.visibilitySource;
    }

    @NonNull
    public NetworkAdUnit getWinnerNetworkAdUnit() {
        return this.winnerNetworkAdUnit;
    }

    public boolean isAdLoaded() {
        return getAdObject() != null && this.adProcessCallback.isLoaded();
    }

    public boolean isCached() {
        return this.isCached.get();
    }

    public boolean isExpired() {
        return this.isExpired.get();
    }

    public synchronized void loadAdObject(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull BidMachineAd bidMachineAd, @NonNull AdProcessCallback adProcessCallback) {
        NetworkAdapter findNetworkAdapter;
        onAdLoadStart(adRequest);
        this.adProcessCallback.appendCallback(adProcessCallback);
        if (isAdLoaded()) {
            adProcessCallback.processLoadSuccess();
            return;
        }
        if (this.adProcessCallback.onLoading()) {
            this.trackingObject.eventStart(TrackEventType.Load);
            if (isExpired()) {
                this.adProcessCallback.processLoadFail(BMError.ResponseExpired);
                return;
            }
            if (wasShown()) {
                this.adProcessCallback.processLoadFail(BMError.ResponseDuplicated);
                return;
            }
            try {
                findNetworkAdapter = adRequest.getAdsType().findNetworkAdapter(this.ad);
            } catch (Throwable th) {
                Logger.w(th);
                this.adProcessCallback.processLoadFail(BMError.throwable("Exception processing response", th));
            }
            if (findNetworkAdapter == null) {
                this.adProcessCallback.processLoadFail(BMError.incorrectContent("Failed to get adapter by response"));
                return;
            }
            AdObjectParams createAdObjectParams = adRequest.getAdsType().createAdObjectParams(this.bidId, this.ad);
            if (createAdObjectParams != null && createAdObjectParams.isValid()) {
                AdObject createAdObject = bidMachineAd.createAdObject(contextProvider, adRequest, findNetworkAdapter, createAdObjectParams, this.adProcessCallback);
                if (createAdObject == null) {
                    this.adProcessCallback.processLoadFail(BMError.incorrectContent("Failed to create ad object by response"));
                    return;
                }
                this.adObject = createAdObject;
                this.trackUrlsMap.putAll(createAdObjectParams.getTrackUrls());
                startCreativeLoadingTimeout();
                createAdObject.load(contextProvider, adRequest.obtainUnifiedRequestParams(contextProvider.getApplicationContext()), this.winnerNetworkAdUnit);
                return;
            }
            this.adProcessCallback.processLoadFail(BMError.incorrectContent("Failed to get parameters by response"));
        }
    }

    void notifyExpired(boolean z) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$notifyExpired$5;
                lambda$notifyExpired$5 = AdResponse.this.lambda$notifyExpired$5();
                return lambda$notifyExpired$5;
            }
        });
        this.isExpired.set(true);
        unsubscribeExpireTracker();
        expireAdRequests(null);
        if (z) {
            destroy();
        }
    }

    public void onAdLoadStart(@Nullable AdRequest<?, ?, ?> adRequest) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdLoadStart$2;
                lambda$onAdLoadStart$2 = AdResponse.this.lambda$onAdLoadStart$2();
                return lambda$onAdLoadStart$2;
            }
        });
        expireAdRequests(adRequest);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.adProcessCallback.processExpired();
    }

    void processClickVerified(@Nullable SystemComponent systemComponent) {
        String str = (systemComponent == null || systemComponent != SystemComponent.InlineInstall) ? null : "inline_install";
        if (str == null) {
            str = "default_browser";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickbrowser", str);
        eventFinish(TrackEventType.Click, false, (Map<String, Object>) hashMap);
    }

    boolean processClicked() {
        AdObject adObject = getAdObject();
        return adObject == null || adObject.onClicked() == null;
    }

    void processClosed(boolean z) {
        AdObject adObject = getAdObject();
        if (adObject != null) {
            adObject.onClosed(z);
        }
        eventFinish(TrackEventType.Close, false);
    }

    void processExpired() {
        AdObject adObject = getAdObject();
        if (adObject != null) {
            adObject.onExpired();
        }
        eventFinish(TrackEventType.Expired, false);
    }

    void processFillAd() {
        C5999c.a().e(this);
        eventFinish(TrackEventType.FillAd, false);
    }

    void processFinished() {
        AdObject adObject = getAdObject();
        if (adObject != null) {
            adObject.onFinished();
        }
    }

    void processLoadFail(@NonNull BMError bMError) {
        clearCreativeLoadingTimeout();
        eventFinish(TrackEventType.Load, false, bMError);
    }

    void processLoadSuccess() {
        clearCreativeLoadingTimeout();
        eventFinish(TrackEventType.Load, false);
    }

    void processMediationLoss() {
        C5999c.a().e(this);
    }

    void processShowFail(@NonNull BMError bMError) {
        AdObject adObject = getAdObject();
        if (adObject != null) {
            adObject.onShowFailed();
        }
        eventFinish(TrackEventType.Show, false, bMError);
    }

    void processShown() {
        unsubscribeExpireTracker();
        C5999c.a().e(this);
        AdObject adObject = getAdObject();
        if (adObject != null) {
            adObject.onShown();
        }
    }

    void release() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda6
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$release$6;
                lambda$release$6 = AdResponse.this.lambda$release$6();
                return lambda$release$6;
            }
        });
        C5999c a = C5999c.a();
        if (!canBeUsedInFuture() || !a.a(this)) {
            destroy();
            return;
        }
        clearAdRequestList();
        setStatus(d.Idle);
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.AdResponse$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                AdResponse.this.lambda$release$7();
            }
        });
    }

    public void removeCallback(@NonNull AdProcessCallback adProcessCallback) {
        this.adProcessCallback.removeCallback(adProcessCallback);
    }

    public synchronized void setCached(boolean z) {
        this.isCached.set(z);
    }

    public synchronized void setStatus(@NonNull d dVar) {
        this.status = dVar;
    }

    @VisibleForTesting
    void startCreativeLoadingTimeout() {
        ExpirationHandler expirationHandler = this.loadExpirationHandler;
        if (expirationHandler != null) {
            expirationHandler.start();
        }
    }

    @NonNull
    public String toString() {
        return this.auctionResult.toString();
    }

    @VisibleForTesting
    void unsubscribeExpireTracker() {
        this.expirationHandler.stop();
    }

    public boolean wasShown() {
        return this.adProcessCallback.isShownTracked();
    }

    void eventFinish(@NonNull TrackEventType trackEventType, boolean z, @Nullable Map<String, Object> map) {
        eventFinish(trackEventType, z, null, map);
    }

    @VisibleForTesting
    void eventFinish(@NonNull TrackEventType trackEventType, boolean z, @Nullable BMError bMError) {
        eventFinish(trackEventType, z, bMError, null);
    }

    @VisibleForTesting
    void eventFinish(@NonNull TrackEventType trackEventType, boolean z, @Nullable BMError bMError, @Nullable Map<String, Object> map) {
        this.trackingObject.eventFinish(trackEventType, z, getAdsType(), this, bMError, map);
    }
}
