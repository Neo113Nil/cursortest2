package io.bidmachine.ads.networks.gam;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.version.Version;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
class GAMNetwork {

    @NonNull
    private final GAMLoader gamLoader;

    @NonNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final boolean overrideCallbacks;

    @NonNull
    private final Tag tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    GAMNetwork(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j, boolean z) {
        this.tag = new Tag(str + AndroidInitializeBoldSDK.MSG_NETWORK);
        this.versionWrapper = versionWrapper;
        this.gamLoader = new GAMLoader(context, versionWrapper, str, map, str2, j);
        this.overrideCallbacks = z;
    }

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

    @NonNull
    public GAMLoader getGAMLoader() {
        return this.gamLoader;
    }

    public boolean isOverrideCallbacks() {
        return this.overrideCallbacks;
    }

    @SuppressLint({"MissingPermission"})
    void init(@NonNull Context context) {
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            this.versionWrapper.initialize(context);
        } catch (Throwable unused) {
        }
    }

    void cache() {
        this.gamLoader.load();
    }

    void cache(@NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        if (this.gamLoader.load(adsFormat) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        this.gamLoader.load(parent);
    }

    boolean isInitialized() {
        return this.isInitialized.get();
    }

    @Nullable
    GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        return this.gamLoader.reserveMostExpensiveGAMAd(networkAdUnit, str);
    }

    void unReserveGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        this.gamLoader.unReserveGAMAd(networkAdUnit);
    }

    void loadBanner(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalGAMBannerAdListener internalGAMBannerAdListener) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.GAMNetwork$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadBanner$0;
                    lambda$loadBanner$0 = GAMNetwork.lambda$loadBanner$0(NetworkAdUnit.this);
                    return lambda$loadBanner$0;
                }
            });
            onAdLoadFailed(internalGAMBannerAdListener, null, BMError.internal("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (reservedGAMAd instanceof InternalGAMBannerAd) {
            reservedGAMAd.setAdPresentListener(internalGAMBannerAdListener);
            internalGAMBannerAdListener.onAdLoaded((InternalGAMBannerAd) reservedGAMAd);
        } else {
            onAdLoadFailed(internalGAMBannerAdListener, reservedGAMAd, BMError.internal("InternalGAM object has an incompatible ad type"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadBanner$0(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load banner (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    void loadInterstitial(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalGAMInterstitialAdListener internalGAMInterstitialAdListener) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.GAMNetwork$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadInterstitial$1;
                    lambda$loadInterstitial$1 = GAMNetwork.lambda$loadInterstitial$1(NetworkAdUnit.this);
                    return lambda$loadInterstitial$1;
                }
            });
            onAdLoadFailed(internalGAMInterstitialAdListener, null, BMError.internal("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (reservedGAMAd instanceof InternalGAMInterstitialAd) {
            reservedGAMAd.setAdPresentListener(internalGAMInterstitialAdListener);
            internalGAMInterstitialAdListener.onAdLoaded((InternalGAMInterstitialAd) reservedGAMAd);
        } else {
            onAdLoadFailed(internalGAMInterstitialAdListener, reservedGAMAd, BMError.internal("InternalGAM object has an incompatible ad type"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadInterstitial$1(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load interstitial (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    void loadRewarded(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalGAMRewardedAdListener internalGAMRewardedAdListener) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.GAMNetwork$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$loadRewarded$2;
                    lambda$loadRewarded$2 = GAMNetwork.lambda$loadRewarded$2(NetworkAdUnit.this);
                    return lambda$loadRewarded$2;
                }
            });
            onAdLoadFailed(internalGAMRewardedAdListener, null, BMError.internal("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (reservedGAMAd instanceof InternalGAMRewardedAd) {
            reservedGAMAd.setAdPresentListener(internalGAMRewardedAdListener);
            internalGAMRewardedAdListener.onAdLoaded((InternalGAMRewardedAd) reservedGAMAd);
        } else {
            onAdLoadFailed(internalGAMRewardedAdListener, reservedGAMAd, BMError.internal("InternalGAM object has an incompatible ad type"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadRewarded$2(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load rewarded (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    private void onAdLoadFailed(@NonNull InternalGAMAdLoadListener<?> internalGAMAdLoadListener, @Nullable InternalGAMAd internalGAMAd, @Nullable BMError bMError) {
        if (internalGAMAd != null) {
            try {
                internalGAMAd.destroy();
            } catch (Throwable unused) {
            }
        }
        if (bMError == null) {
            bMError = BMError.NoFill;
        }
        internalGAMAdLoadListener.onAdLoadFailed(bMError);
    }
}
