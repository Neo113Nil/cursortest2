package io.bidmachine.ads.networks.gam_dynamic;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.version.Version;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
class GAMNetworkImpl implements GAMNetwork {

    @NonNull
    private static final Map<String, GAMAdManager> GAM_AD_MANAGER_MAP = new HashMap();

    @NonNull
    private static final Object GAM_AD_MANAGER_MAP_LOCK = new Object();

    @NonNull
    @VisibleForTesting
    final GAMAdManager gamAdManager;

    @NonNull
    private final AtomicBoolean isInitialized;

    @NonNull
    private final Tag tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    @NonNull
    @VisibleForTesting
    final Map<AdsFormat, WaterfallController> waterfallControllerMap;

    GAMNetworkImpl(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull Waterfall.Context context2, @NonNull VersionWrapper versionWrapper) {
        this(context, networkParams, context2, versionWrapper, obtainGamAdManager(networkParams.getNetworkKey()));
    }

    GAMNetworkImpl(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull Waterfall.Context context2, @NonNull VersionWrapper versionWrapper, @NonNull GAMAdManager gAMAdManager) {
        GAMNetworkImpl gAMNetworkImpl = this;
        gAMNetworkImpl.tag = new Tag(networkParams.getNetworkName() + AndroidInitializeBoldSDK.MSG_NETWORK);
        gAMNetworkImpl.isInitialized = new AtomicBoolean(false);
        gAMNetworkImpl.versionWrapper = versionWrapper;
        gAMNetworkImpl.gamAdManager = gAMAdManager;
        gAMNetworkImpl.waterfallControllerMap = new EnumMap(AdsFormat.class);
        GAMEventTrackerImpl gAMEventTrackerImpl = new GAMEventTrackerImpl(context2.getEventConfig());
        TaskExecutorImpl taskExecutorImpl = new TaskExecutorImpl();
        for (Waterfall.Configuration configuration : context2.getConfigurationsList()) {
            AdsFormat byRemoteName = AdsFormat.byRemoteName(configuration.getFormat());
            if (byRemoteName != null) {
                gAMNetworkImpl.waterfallControllerMap.put(byRemoteName, new WaterfallController(context, networkParams, byRemoteName, configuration, versionWrapper, this, gAMAdManager, gAMEventTrackerImpl, taskExecutorImpl));
                gAMNetworkImpl = this;
            }
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    @Nullable
    public String getVersion() {
        try {
            Version version = this.versionWrapper.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    @SuppressLint({"MissingPermission"})
    public void init(@NonNull Context context) {
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            this.versionWrapper.initialize(context);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void cache() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            cacheWaterfall(adsFormat, false);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void cache(@NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        if (cacheWaterfall(adsFormat, false) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        cacheWaterfall(parent, false);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public boolean cacheWaterfall(@NonNull AdsFormat adsFormat, boolean z) {
        WaterfallController waterfallController = this.waterfallControllerMap.get(adsFormat);
        if (waterfallController == null) {
            return false;
        }
        waterfallController.load(z);
        return true;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    @Nullable
    public InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        InternalAdData reserveMostExpensiveAd = this.gamAdManager.reserveMostExpensiveAd(networkAdUnit, adsFormat);
        return (reserveMostExpensiveAd != null || (parent = adsFormat.getParent()) == null) ? reserveMostExpensiveAd : this.gamAdManager.reserveMostExpensiveAd(networkAdUnit, parent);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void unReserveAd(@NonNull NetworkAdUnit networkAdUnit) {
        this.gamAdManager.unReserveAd(networkAdUnit);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void loadBanner(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalBannerAdListener internalBannerAdListener) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMNetworkImpl$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadBanner$0;
                    lambda$loadBanner$0 = GAMNetworkImpl.lambda$loadBanner$0(NetworkAdUnit.this);
                    return lambda$loadBanner$0;
                }
            });
            onAdLoadFailed(internalBannerAdListener, null, BMError.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (reservedAd instanceof InternalBannerAd) {
            reservedAd.setAdPresentListener(internalBannerAdListener);
            internalBannerAdListener.onAdLoaded((InternalBannerAd) reservedAd);
        } else {
            onAdLoadFailed(internalBannerAdListener, reservedAd, BMError.internal("InternalAd object has an incompatible ad type"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadBanner$0(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load banner (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void loadInterstitial(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalInterstitialAdListener internalInterstitialAdListener) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMNetworkImpl$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadInterstitial$1;
                    lambda$loadInterstitial$1 = GAMNetworkImpl.lambda$loadInterstitial$1(NetworkAdUnit.this);
                    return lambda$loadInterstitial$1;
                }
            });
            onAdLoadFailed(internalInterstitialAdListener, null, BMError.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (reservedAd instanceof InternalInterstitialAd) {
            reservedAd.setAdPresentListener(internalInterstitialAdListener);
            internalInterstitialAdListener.onAdLoaded((InternalInterstitialAd) reservedAd);
        } else {
            onAdLoadFailed(internalInterstitialAdListener, reservedAd, BMError.internal("InternalAd object has an incompatible ad type"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadInterstitial$1(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load interstitial (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void loadRewarded(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalRewardedAdListener internalRewardedAdListener) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMNetworkImpl$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadRewarded$2;
                    lambda$loadRewarded$2 = GAMNetworkImpl.lambda$loadRewarded$2(NetworkAdUnit.this);
                    return lambda$loadRewarded$2;
                }
            });
            onAdLoadFailed(internalRewardedAdListener, null, BMError.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (reservedAd instanceof InternalRewardedAd) {
            reservedAd.setAdPresentListener(internalRewardedAdListener);
            internalRewardedAdListener.onAdLoaded((InternalRewardedAd) reservedAd);
        } else {
            onAdLoadFailed(internalRewardedAdListener, reservedAd, BMError.internal("InternalAd object has an incompatible ad type"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadRewarded$2(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load rewarded (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    @VisibleForTesting
    void onAdLoadFailed(@NonNull InternalAdLoadListener<?> internalAdLoadListener, @Nullable InternalAd internalAd, @Nullable BMError bMError) {
        if (internalAd != null) {
            internalAd.destroy();
        }
        if (bMError == null) {
            bMError = BMError.NoFill;
        }
        internalAdLoadListener.onAdLoadFailed(bMError);
    }

    @NonNull
    private static GAMAdManager obtainGamAdManager(@NonNull String str) {
        Map<String, GAMAdManager> map = GAM_AD_MANAGER_MAP;
        GAMAdManager gAMAdManager = map.get(str);
        if (gAMAdManager != null) {
            return gAMAdManager;
        }
        synchronized (GAM_AD_MANAGER_MAP_LOCK) {
            try {
                GAMAdManager gAMAdManager2 = map.get(str);
                if (gAMAdManager2 != null) {
                    return gAMAdManager2;
                }
                GAMAdManager gAMAdManager3 = new GAMAdManager(str);
                map.put(str, gAMAdManager3);
                return gAMAdManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    static void clear() {
        GAM_AD_MANAGER_MAP.clear();
    }
}
