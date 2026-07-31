package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader;
import io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
class WaterfallController {

    @NonNull
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();

    @NonNull
    @VisibleForTesting
    final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    int cacheSize;

    @NonNull
    private final GAMAdManager gamAdManager;

    @NonNull
    private final GAMEventTracker gamEventTracker;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    @VisibleForTesting
    String id;

    @VisibleForTesting
    int maxRetryDegree;

    @NonNull
    private final NetworkParams networkParams;

    @VisibleForTesting
    long refreshTimeOutMs;

    @Nullable
    @VisibleForTesting
    String refreshUrl;

    @VisibleForTesting
    int retryBaseSec;

    @Nullable
    @VisibleForTesting
    StringValue serverParams;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    @VisibleForTesting
    WaterfallLoader waterfallLoader;

    @NonNull
    @VisibleForTesting
    final List<Waterfall.Configuration.AdUnit> adUnitList = new LinkedList();

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isLoading = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isPolling = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final AtomicBoolean isShouldPollAfter = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    final AtomicInteger failedWaterfallLoadAttempts = new AtomicInteger(0);

    public WaterfallController(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration configuration, @NonNull VersionWrapper versionWrapper, @NonNull GAMNetwork gAMNetwork, @NonNull GAMAdManager gAMAdManager, @NonNull GAMEventTracker gAMEventTracker, @NonNull TaskExecutor taskExecutor) {
        this.tag = new Tag(networkParams.getNetworkName() + "WaterfallController");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = gAMNetwork;
        this.gamAdManager = gAMAdManager;
        this.taskExecutor = taskExecutor;
        this.gamEventTracker = gAMEventTracker;
        setWaterfallConfiguration(configuration);
    }

    public void load(boolean z) {
        if (!this.isLoading.compareAndSet(false, true)) {
            if (!z || this.isPolling.get()) {
                return;
            }
            this.isShouldPollAfter.set(true);
            return;
        }
        this.isPolling.set(true);
        this.failedWaterfallLoadAttempts.set(0);
        loadWaterfall();
    }

    @VisibleForTesting
    void setWaterfallConfiguration(@NonNull Waterfall.Configuration configuration) {
        this.id = configuration.getId();
        this.adUnitList.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            this.adUnitList.addAll(adUnitsList);
            sortDescByPrice(this.adUnitList);
        }
        StringValue refreshUrl = configuration.hasRefreshUrl() ? configuration.getRefreshUrl() : null;
        if (refreshUrl != null) {
            String value = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value) && Utils.isHttpUrl(value)) {
                this.refreshUrl = refreshUrl.getValue();
            }
        }
        UInt32Value cacheSize = configuration.hasCacheSize() ? configuration.getCacheSize() : null;
        this.cacheSize = cacheSize != null ? cacheSize.getValue() : 1;
        UInt32Value retryBase = configuration.hasRetryBase() ? configuration.getRetryBase() : null;
        this.retryBaseSec = retryBase != null ? retryBase.getValue() : 2;
        UInt32Value maxRetryDegree = configuration.hasMaxRetryDegree() ? configuration.getMaxRetryDegree() : null;
        this.maxRetryDegree = maxRetryDegree != null ? maxRetryDegree.getValue() : 5;
        UInt64Value refreshTimeout = configuration.hasRefreshTimeout() ? configuration.getRefreshTimeout() : null;
        this.refreshTimeOutMs = refreshTimeout != null ? refreshTimeout.getValue() : 10000L;
        this.serverParams = configuration.hasServerParams() ? configuration.getServerParams() : null;
    }

    @VisibleForTesting
    void loadWaterfall() {
        this.isShouldPollAfter.set(false);
        this.waterfallLoader = new WaterfallLoader(this.applicationContext, this.networkParams, this.adsFormat, this.versionWrapper, this.gamNetwork, this.gamAdManager, this.gamEventTracker, this.taskExecutor, this.id, this.adUnitList, this.cacheSize, new WaterfallLoaderListener());
        final long calculateLoadingDelayMs = calculateLoadingDelayMs();
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$loadWaterfall$0;
                lambda$loadWaterfall$0 = WaterfallController.this.lambda$loadWaterfall$0(calculateLoadingDelayMs);
                return lambda$loadWaterfall$0;
            }
        });
        if (this.taskExecutor.execute(this.waterfallLoader, calculateLoadingDelayMs)) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$loadWaterfall$1;
                lambda$loadWaterfall$1 = WaterfallController.this.lambda$loadWaterfall$1();
                return lambda$loadWaterfall$1;
            }
        });
        processLoadCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadWaterfall$0(long j) {
        return String.format("(%s) Execution waterfall load started after - %s ms (failedAttempts - %s, maxRetryDegree - %s, retryBase - %s sec)", this.adsFormat, Long.valueOf(j), Integer.valueOf(this.failedWaterfallLoadAttempts.get()), Integer.valueOf(this.maxRetryDegree), Integer.valueOf(this.retryBaseSec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadWaterfall$1() {
        return String.format("(%s) Fail to start loading waterfall", this.adsFormat);
    }

    @VisibleForTesting
    long calculateLoadingDelayMs() {
        return (long) (Math.pow(this.retryBaseSec, Math.min(this.failedWaterfallLoadAttempts.get(), this.maxRetryDegree)) * 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$requestNextWaterfall$2() {
        return String.format("(%s) Request next waterfall", this.adsFormat);
    }

    @VisibleForTesting
    void requestNextWaterfall(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda3
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$requestNextWaterfall$2;
                lambda$requestNextWaterfall$2 = WaterfallController.this.lambda$requestNextWaterfall$2();
                return lambda$requestNextWaterfall$2;
            }
        });
        if (TextUtils.isEmpty(this.refreshUrl) || !Utils.isHttpUrl(this.refreshUrl)) {
            onWaterfallRequestFail("Request next waterfall failed (refreshUrl is null or empty or incorrect)");
            return;
        }
        Waterfall.Result.Builder addAllAdUnitResults = Waterfall.Result.newBuilder().setFormat(StringValue.newBuilder().setValue(this.adsFormat.getRemoteName()).build()).addAllAdUnitResults(queue);
        String str = this.id;
        if (str != null) {
            addAllAdUnitResults.setWaterfallId(str);
        }
        List<Waterfall.Result.CachedAdUnit> cachedAdUnitList = this.gamAdManager.getCachedAdUnitList(this.adsFormat);
        if (cachedAdUnitList != null && !cachedAdUnitList.isEmpty()) {
            addAllAdUnitResults.addAllCachedAdUnits(cachedAdUnitList);
        }
        Struct ext = this.networkParams.getExt(this.applicationContext);
        if (ext != null) {
            addAllAdUnitResults.setExt(ext);
        }
        StringValue stringValue = this.serverParams;
        if (stringValue != null) {
            addAllAdUnitResults.setServerParams(stringValue);
        }
        WaterfallCallback waterfallCallback = new WaterfallCallback();
        WaterfallNetworkRequest waterfallNetworkRequest = new WaterfallNetworkRequest(this.refreshUrl, addAllAdUnitResults.build(), (int) this.refreshTimeOutMs);
        waterfallNetworkRequest.setCallback(waterfallCallback);
        waterfallNetworkRequest.setCancelCallback(waterfallCallback);
        waterfallNetworkRequest.request(TASK_MANAGER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onWaterfallRequestSuccess$3() {
        return String.format("(%s) onWaterfallRequestSuccess", this.adsFormat);
    }

    @VisibleForTesting
    void onWaterfallRequestSuccess(@NonNull Waterfall.Configuration configuration) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda6
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onWaterfallRequestSuccess$3;
                lambda$onWaterfallRequestSuccess$3 = WaterfallController.this.lambda$onWaterfallRequestSuccess$3();
                return lambda$onWaterfallRequestSuccess$3;
            }
        });
        setWaterfallConfiguration(configuration);
        if (!this.isShouldPollAfter.get() && configuration.getShouldBreak()) {
            processLoadCompleted();
        } else {
            loadWaterfall();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onWaterfallRequestFail$4(String str) {
        return String.format("(%s) onWaterfallRequestFail - %s", this.adsFormat, str);
    }

    @VisibleForTesting
    void onWaterfallRequestFail(@NonNull final String str) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda5
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onWaterfallRequestFail$4;
                lambda$onWaterfallRequestFail$4 = WaterfallController.this.lambda$onWaterfallRequestFail$4(str);
                return lambda$onWaterfallRequestFail$4;
            }
        });
        loadWaterfall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$processLoadCompleted$5() {
        return String.format("(%s) Loading completed", this.adsFormat);
    }

    @VisibleForTesting
    void processLoadCompleted() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda4
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$processLoadCompleted$5;
                lambda$processLoadCompleted$5 = WaterfallController.this.lambda$processLoadCompleted$5();
                return lambda$processLoadCompleted$5;
            }
        });
        clearWaterfall();
        this.isLoading.set(false);
    }

    @VisibleForTesting
    void clearWaterfall() {
        this.waterfallLoader = null;
    }

    @VisibleForTesting
    void sortDescByPrice(@NonNull List<Waterfall.Configuration.AdUnit> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.WaterfallController$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortDescByPrice$6;
                lambda$sortDescByPrice$6 = WaterfallController.lambda$sortDescByPrice$6((Waterfall.Configuration.AdUnit) obj, (Waterfall.Configuration.AdUnit) obj2);
                return lambda$sortDescByPrice$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByPrice$6(Waterfall.Configuration.AdUnit adUnit, Waterfall.Configuration.AdUnit adUnit2) {
        return -Double.compare(adUnit.getPrice(), adUnit2.getPrice());
    }

    @VisibleForTesting
    class WaterfallLoaderListener implements WaterfallLoader.Listener {

        @NonNull
        @VisibleForTesting
        final AtomicBoolean isAdLoaded = new AtomicBoolean(false);

        public WaterfallLoaderListener() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onAdLoaded() {
            this.isAdLoaded.set(true);
            WaterfallController.this.failedWaterfallLoadAttempts.set(0);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
            WaterfallController.this.isPolling.set(false);
            if (!this.isAdLoaded.get()) {
                WaterfallController.this.failedWaterfallLoadAttempts.incrementAndGet();
            }
            WaterfallController.this.requestNextWaterfall(queue);
        }
    }

    @VisibleForTesting
    class WaterfallCallback implements WaterfallNetworkRequest.Callback {
        WaterfallCallback() {
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable Waterfall.Configuration configuration) {
            if (configuration != null) {
                WaterfallController.this.onWaterfallRequestSuccess(configuration);
            } else {
                WaterfallController.this.onWaterfallRequestFail("Configuration response is null");
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            String str;
            WaterfallController waterfallController = WaterfallController.this;
            if (bMError != null) {
                str = bMError.getMessage();
            } else {
                str = "Unknown";
            }
            waterfallController.onWaterfallRequestFail(str);
        }

        @Override // io.bidmachine.core.NetworkRequest.CancelCallback
        public void onCanceled() {
            WaterfallController.this.onWaterfallRequestFail("Request is canceled");
        }
    }
}
