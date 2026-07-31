package io.bidmachine.ads.networks.gam;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Utils;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GAMAdapter extends HeaderBiddingAdapter {
    private static final int DEFAULT_EXPIRATION_TIME_SEC = 3600;

    @NonNull
    private static final String GAM_NETWORK_ERROR = "GAMNetwork is null";

    @NonNull
    private static final String NETWORK_NAME = "GAM";

    @Nullable
    private GAMNetwork gamNetwork;

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    GAMAdapter() {
        this(BuildConfig.ADAPTER_NAME, "", BuildConfig.ADAPTER_VERSION_NAME, 16);
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
        if (this.gamNetwork != null) {
            return new GAMBanner(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        if (this.gamNetwork != null) {
            return new GAMInterstitial(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        if (this.gamNetwork != null) {
            return new GAMRewarded(this.gamNetwork);
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
        String removeFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("waterfall_configurations");
        if (TextUtils.isEmpty(removeFromNetworkParams2)) {
            networkInitializationCallback.onFail("waterfall_configurations not provided");
            return;
        }
        Map<AdsFormat, GAMTypeConfig> gAMTypeConfigMap = toGAMTypeConfigMap(removeFromNetworkParams2);
        if (gAMTypeConfigMap == null || gAMTypeConfigMap.isEmpty()) {
            networkInitializationCallback.onFail("waterfall_configurations is empty");
            return;
        }
        GAMNetwork gAMNetwork = new GAMNetwork(applicationContext, findVersionWrapper, getNetworkName(), gAMTypeConfigMap, networkConfigParams.removeFromNetworkParams("request_agent"), TimeUnit.SECONDS.toMillis(Utils.parseIntOrDefault(networkConfigParams.removeFromNetworkParams("expiration_time"), DEFAULT_EXPIRATION_TIME_SEC)), Boolean.parseBoolean(networkConfigParams.removeFromNetworkParams("override_callbacks")));
        this.gamNetwork = gAMNetwork;
        gAMNetwork.init(applicationContext);
        this.gamNetwork.cache();
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("ad_unit_id"));
            return;
        }
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("GAM network is null"));
            return;
        }
        GAMUnitData reserveMostExpensiveGAMAd = gAMNetwork.reserveMostExpensiveGAMAd(networkAdUnit, mediationParameter);
        this.gamNetwork.cache(unifiedAdRequestParams.getAdRequestParameters().getAdsFormat());
        if (reserveMostExpensiveGAMAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("Can't find idle ad"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_unit_id", reserveMostExpensiveGAMAd.getAdUnitId());
        hashMap.put("score", String.valueOf(reserveMostExpensiveGAMAd.getScore()));
        hashMap.put("price", String.valueOf(reserveMostExpensiveGAMAd.getPrice()));
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveGAMAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveGAMAd(networkAdUnit);
        }
    }

    @Nullable
    private Map<AdsFormat, GAMTypeConfig> toGAMTypeConfigMap(@NonNull String str) {
        GAMTypeConfig create;
        HashMap hashMap = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (create = GAMTypeConfigFactory.create(optJSONObject)) != null) {
                    hashMap.put(create.getAdsFormat(), create);
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }
}
