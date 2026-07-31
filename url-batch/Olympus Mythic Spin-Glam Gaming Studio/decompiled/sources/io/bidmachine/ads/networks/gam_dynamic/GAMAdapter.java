package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    @NonNull
    private static final String GAM_NETWORK_ERROR = "GAMNetwork is null";

    @NonNull
    private static final String NETWORK_NAME = "GAMDynamic";

    @Nullable
    @VisibleForTesting
    GAMNetwork gamNetwork;

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    GAMAdapter(@NonNull String str) {
        this(str, "", "3.7.1.0", 16);
    }

    protected GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i) {
        this(str, str2, str3, i, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    protected GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i, adsTypeArr);
    }

    @Override // io.bidmachine.NetworkAdapter
    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return gAMNetwork.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return new GAMBannerAd(gAMNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return new GAMInterstitialAd(gAMNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return new GAMRewardedAd(gAMNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @NonNull
    public String getNetworkName() {
        return NETWORK_NAME;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        return gAMNetwork != null && gAMNetwork.isInitialized();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String removeFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(removeFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        VersionWrapper findVersionWrapper = VersionManager.findVersionWrapper(removeFromNetworkParams);
        if (findVersionWrapper == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (!findVersionWrapper.isGAMPresent(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String removeFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("context");
        if (TextUtils.isEmpty(removeFromNetworkParams2)) {
            networkInitializationCallback.onFail("context not provided");
            return;
        }
        Waterfall.Context parseWaterfallContext = parseWaterfallContext(removeFromNetworkParams2);
        if (parseWaterfallContext == null) {
            networkInitializationCallback.onFail("context can't transform to model");
            return;
        }
        GAMNetworkImpl gAMNetworkImpl = new GAMNetworkImpl(applicationContext, new GAMNetworkParams(getKey(), getNetworkName()), parseWaterfallContext, findVersionWrapper);
        this.gamNetwork = gAMNetworkImpl;
        gAMNetworkImpl.init(applicationContext);
        this.gamNetwork.cache();
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("GAM network is null"));
            return;
        }
        InternalAdData reserveMostExpensiveAd = gAMNetwork.reserveMostExpensiveAd(networkAdUnit, networkAdUnit.getAdFormat());
        if (reserveMostExpensiveAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("Can't find idle ad"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_unit_id", reserveMostExpensiveAd.getAdUnitId());
        hashMap.put("price", String.valueOf(reserveMostExpensiveAd.getPrice()));
        for (Map.Entry<String, Object> entry : reserveMostExpensiveAd.getCustomParamsMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                hashMap.put(key, String.valueOf(value));
            }
        }
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveAd(networkAdUnit);
        }
    }

    @Nullable
    @VisibleForTesting
    Waterfall.Context parseWaterfallContext(@NonNull String str) {
        try {
            return Waterfall.Context.parseFrom(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    static class GAMNetworkParams extends NetworkParamsImpl {
        public GAMNetworkParams(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
        @Nullable
        public Struct getExt(@NonNull Context context) {
            return ExtraParamsManager.get().getPrivateStruct(context);
        }
    }
}
