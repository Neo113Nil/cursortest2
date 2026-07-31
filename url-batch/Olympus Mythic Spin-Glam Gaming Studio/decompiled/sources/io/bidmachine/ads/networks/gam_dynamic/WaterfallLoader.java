package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.tracking.EventData;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
class WaterfallLoader implements Runnable {

    @NonNull
    @VisibleForTesting
    final Queue<Waterfall.Configuration.AdUnit> adUnitQueue;

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    final int cacheSize;

    @NonNull
    private final GAMAdManager gamAdManager;

    @NonNull
    private final GAMEventTracker gamEventTracker;

    @NonNull
    private final GAMNetwork gamNetwork;

    @NonNull
    private final Listener listener;

    @NonNull
    private final NetworkParams networkParams;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    private final String waterfallId;

    @NonNull
    @VisibleForTesting
    final Queue<Waterfall.Result.AdUnit> adUnitResultQueue = new ConcurrentLinkedQueue();

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isLoading = new AtomicBoolean(false);

    public interface Listener {
        void onAdLoaded();

        void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue);
    }

    public WaterfallLoader(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull VersionWrapper versionWrapper, @NonNull GAMNetwork gAMNetwork, @NonNull GAMAdManager gAMAdManager, @NonNull GAMEventTracker gAMEventTracker, @NonNull TaskExecutor taskExecutor, @Nullable String str, @NonNull List<Waterfall.Configuration.AdUnit> list, int i, @NonNull Listener listener) {
        this.tag = new Tag(networkParams.getNetworkName() + "WaterfallLoader");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = gAMNetwork;
        this.gamAdManager = gAMAdManager;
        this.gamEventTracker = gAMEventTracker;
        this.taskExecutor = taskExecutor;
        this.waterfallId = str;
        this.adUnitQueue = new ConcurrentLinkedQueue(list);
        this.cacheSize = i;
        this.listener = listener;
    }

    @Override // java.lang.Runnable
    public void run() {
        load();
    }

    @VisibleForTesting
    void load() {
        if (this.isLoading.compareAndSet(false, true)) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader$$ExternalSyntheticLambda5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$load$0;
                    lambda$load$0 = WaterfallLoader.this.lambda$load$0();
                    return lambda$load$0;
                }
            });
            trackEvent(TrackEventType.WaterfallLoadStart);
            loadNextAdUnit(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$load$0() {
        return String.format("(%s) Polling started (waterfallId - %s, ad unit count - %s)", this.adsFormat, this.waterfallId, Integer.valueOf(this.adUnitQueue.size()));
    }

    @VisibleForTesting
    void loadNextAdUnit(@Nullable Long l) {
        if (this.adUnitQueue.isEmpty()) {
            processLoadCompleted();
            return;
        }
        final Waterfall.Configuration.AdUnit poll = this.adUnitQueue.poll();
        if (poll == null) {
            loadNextAdUnit(l);
            return;
        }
        final long calculateLoadingDelayMs = calculateLoadingDelayMs(poll, l);
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$loadNextAdUnit$1;
                lambda$loadNextAdUnit$1 = WaterfallLoader.this.lambda$loadNextAdUnit$1(calculateLoadingDelayMs);
                return lambda$loadNextAdUnit$1;
            }
        });
        if (this.taskExecutor.execute(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                WaterfallLoader.this.lambda$loadNextAdUnit$4(poll);
            }
        }, calculateLoadingDelayMs)) {
            return;
        }
        processLoadCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadNextAdUnit$1(long j) {
        return String.format("(%s) Execution ad unit load started after %s ms", this.adsFormat, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNextAdUnit$4(Waterfall.Configuration.AdUnit adUnit) {
        InternalAd findCheapestIdleAd = this.gamAdManager.findCheapestIdleAd(this.adsFormat);
        if (findCheapestIdleAd != null && adUnit.getPrice() <= findCheapestIdleAd.getAdUnit().getPrice() && this.gamAdManager.getLoadedAdCount(this.adsFormat) >= this.cacheSize) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadNextAdUnit$2;
                    lambda$loadNextAdUnit$2 = WaterfallLoader.this.lambda$loadNextAdUnit$2();
                    return lambda$loadNextAdUnit$2;
                }
            });
            addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            Iterator<Waterfall.Configuration.AdUnit> it = this.adUnitQueue.iterator();
            while (it.hasNext()) {
                addAdUnitResult(it.next(), Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            }
            processLoadCompleted();
            return;
        }
        try {
            InternalAd createAd = this.versionWrapper.createAd(this.networkParams, this.taskExecutor, this.adsFormat, adUnit, new AdListener());
            if (createAd == null) {
                Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader$$ExternalSyntheticLambda4
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$loadNextAdUnit$3;
                        lambda$loadNextAdUnit$3 = WaterfallLoader.this.lambda$loadNextAdUnit$3();
                        return lambda$loadNextAdUnit$3;
                    }
                });
                addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, BMError.internal("Can't create InternalAd"));
                loadNextAdUnit(null);
            } else {
                if (!TextUtils.isEmpty(this.waterfallId)) {
                    createAd.setCustomParam("gam_waterfall_id", this.waterfallId);
                    createAd.setCustomParam("gam_ad_unit_id", adUnit.getAdUnitId());
                }
                createAd.load(this.applicationContext, new AdLoadListener());
                trackEvent(TrackEventType.AdUnitLoadStart, createAd);
            }
        } catch (Throwable th) {
            Logger.w(th);
            addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, BMError.throwable("Exception loading InternalAd object", th));
            loadNextAdUnit(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadNextAdUnit$2() {
        return String.format("(%s) Stop polling. Waterfall already filled with expensive ads", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadNextAdUnit$3() {
        return String.format("(%s) Can't create InternalAd", this.adsFormat);
    }

    @VisibleForTesting
    long calculateLoadingDelayMs(@NonNull Waterfall.Configuration.AdUnit adUnit, @Nullable Long l) {
        long sleepTimeBeforeMs = getSleepTimeBeforeMs(adUnit);
        return l != null ? sleepTimeBeforeMs + l.longValue() : sleepTimeBeforeMs;
    }

    @VisibleForTesting
    void addAdUnitResult(@NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull Waterfall.Result.AdUnit.Status status, @Nullable InternalAdLoadData internalAdLoadData, @Nullable BMError bMError) {
        this.adUnitResultQueue.add(create(adUnit, status, internalAdLoadData, bMError));
    }

    @VisibleForTesting
    void processLoadCompleted() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$processLoadCompleted$5;
                lambda$processLoadCompleted$5 = WaterfallLoader.this.lambda$processLoadCompleted$5();
                return lambda$processLoadCompleted$5;
            }
        });
        trackEvent(TrackEventType.WaterfallLoadFinish);
        this.isLoading.set(false);
        this.listener.onWaterfallLoadCompleted(this.adUnitResultQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$processLoadCompleted$5() {
        StringBuilder sb = new StringBuilder(String.format("(%s) Polling completed (waterfallId - %s, ad unit count - %s)", this.adsFormat, this.waterfallId, Integer.valueOf(this.adUnitResultQueue.size())));
        Iterator<Waterfall.Result.AdUnit> it = this.adUnitResultQueue.iterator();
        while (it.hasNext()) {
            sb.append(String.format("\n> %s", GAMUtils.toString(it.next())));
        }
        return sb.toString();
    }

    @VisibleForTesting
    void removeAdFromCaches(@NonNull InternalAd internalAd) {
        if (this.gamAdManager.removeAdFromCaches(internalAd)) {
            this.gamNetwork.cacheWaterfall(internalAd.getAdsFormat(), true);
        }
    }

    @VisibleForTesting
    void trackEvent(@NonNull TrackEventType trackEventType) {
        trackEvent(trackEventType, null, null, null);
    }

    @VisibleForTesting
    void trackEvent(@NonNull TrackEventType trackEventType, @NonNull InternalAd internalAd) {
        trackEvent(trackEventType, internalAd.getAdUnit(), internalAd, null);
    }

    @VisibleForTesting
    void trackEvent(@NonNull TrackEventType trackEventType, @Nullable Waterfall.Configuration.AdUnit adUnit, @Nullable InternalAd internalAd, @Nullable BMError bMError) {
        EventData networkName = new EventData().setNetworkName(this.networkParams.getNetworkKey());
        if (adUnit != null) {
            networkName.setPrice(Double.valueOf(adUnit.getPrice()));
        }
        if (internalAd != null) {
            networkName.setCustomParams(internalAd.getCustomParamsMap());
        }
        if (!TextUtils.isEmpty(this.waterfallId)) {
            networkName.setCustomParam("gam_waterfall_id", this.waterfallId);
        }
        this.gamEventTracker.trackEvent(trackEventType, this.adsFormat, networkName, bMError);
    }

    @VisibleForTesting
    long getSleepTimeBeforeMs(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        if ((adUnit.hasSleepTimeBefore() ? adUnit.getSleepTimeBefore() : null) != null) {
            return r3.getValue();
        }
        return 0L;
    }

    @VisibleForTesting
    long getSleepTimeAfterMs(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        if ((adUnit.hasSleepTimeAfter() ? adUnit.getSleepTimeAfter() : null) != null) {
            return r3.getValue();
        }
        return 0L;
    }

    @NonNull
    @VisibleForTesting
    Waterfall.Result.AdUnit create(@NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull Waterfall.Result.AdUnit.Status status, @Nullable InternalAdLoadData internalAdLoadData, @Nullable BMError bMError) {
        Waterfall.Result.AdUnit.Builder price = Waterfall.Result.AdUnit.newBuilder().setStatus(status).setPrice(adUnit.getPrice());
        if (adUnit.getAdUnitId() != null) {
            price.setAdUnitId(adUnit.getAdUnitId());
        }
        StringValue serverParams = adUnit.getServerParams();
        if (serverParams != null) {
            price.setServerParams(serverParams);
        }
        if (internalAdLoadData != null) {
            Waterfall.Result.EstimatedPrice price2 = internalAdLoadData.getPrice();
            if (price2 != null) {
                price.setEstimatedPrice(price2);
            }
            String adResponse = internalAdLoadData.getAdResponse();
            if (!TextUtils.isEmpty(adResponse)) {
                price.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
            }
        }
        if (bMError != null) {
            price.setError(Waterfall.Result.AdUnit.Error.newBuilder().setCode(bMError.getCode()).setDescription(bMError.getMessage()));
        }
        return price.build();
    }

    @VisibleForTesting
    class AdListener implements InternalAdListener {
        AdListener() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdShown(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.removeAdFromCaches(internalAd);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitShown, internalAd);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdExpired(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitExpired, internalAd);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdDestroyed(@NonNull InternalAd internalAd, boolean z) {
            if (!z) {
                WaterfallLoader.this.gamAdManager.unReserveAd(internalAd);
            } else {
                WaterfallLoader.this.removeAdFromCaches(internalAd);
            }
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onPaidEvent(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitPaidEvent, internalAd);
        }
    }

    @VisibleForTesting
    class AdLoadListener implements InternalLoadListener {
        AdLoadListener() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener
        public void onAdLoaded(@NonNull InternalAd internalAd, @Nullable InternalAdLoadData internalAdLoadData) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoadFinish, internalAd);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitWin, internalAd);
            WaterfallLoader.this.addAdUnitResult(internalAd.getAdUnit(), Waterfall.Result.AdUnit.Status.STATUS_SUCCESS, internalAdLoadData, null);
            InternalAd storeOrSwapCheapestIdleAd = WaterfallLoader.this.gamAdManager.storeOrSwapCheapestIdleAd(internalAd, WaterfallLoader.this.cacheSize);
            if (storeOrSwapCheapestIdleAd != null) {
                WaterfallLoader.this.trackEvent(TrackEventType.AdUnitCheapestDequeued, storeOrSwapCheapestIdleAd);
                storeOrSwapCheapestIdleAd.destroy();
            }
            WaterfallLoader.this.listener.onAdLoaded();
            WaterfallLoader.this.loadNextAdUnit(null);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener
        public void onAdLoadFailed(@NonNull InternalAd internalAd, @NonNull BMError bMError) {
            Waterfall.Configuration.AdUnit adUnit = internalAd.getAdUnit();
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoadFinish, adUnit, internalAd, bMError);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoss, internalAd);
            WaterfallLoader.this.addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_ERROR, null, bMError);
            internalAd.destroy();
            WaterfallLoader waterfallLoader = WaterfallLoader.this;
            waterfallLoader.loadNextAdUnit(Long.valueOf(waterfallLoader.getSleepTimeAfterMs(adUnit)));
        }
    }
}
