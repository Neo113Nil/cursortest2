package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Placement;
import com.my.tracker.MyTracker;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.utils.BMError;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class AdRequestParameters {

    @NonNull
    private AdPlacementConfig adPlacementConfig;

    @Nullable
    private ResponsePayload bidPayload;

    @Nullable
    private List<NetworkConfig> networkConfigList;

    @Nullable
    private PriceFloorParams priceFloorParams;

    @Nullable
    private TargetingParams targetingParams;

    @Nullable
    private Integer timeOutMs;

    protected AdRequestParameters(@NonNull AdPlacementConfig adPlacementConfig) {
        this.adPlacementConfig = adPlacementConfig;
    }

    @Nullable
    public abstract BMError checkPlacement(@NonNull Placement placement) throws Throwable;

    @NonNull
    public AdFormat getAdFormat() {
        return this.adPlacementConfig.getAdFormat();
    }

    @NonNull
    public AdPlacementConfig getAdPlacementConfig() {
        return this.adPlacementConfig;
    }

    @NonNull
    @Deprecated(since = MyTracker.VERSION)
    public AdsFormat getAdsFormat() {
        return AdsFormat.fromAdFormat(getAdFormat());
    }

    @NonNull
    public AdsType getAdsType() {
        return getAdFormat().getAdsType();
    }

    @Nullable
    public ResponsePayload getBidPayload() {
        return this.bidPayload;
    }

    @Nullable
    public CustomParams getCustomParams() {
        return this.adPlacementConfig.getCustomParams();
    }

    @Nullable
    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    @Nullable
    public String getPlacementId() {
        return this.adPlacementConfig.getPlacementId();
    }

    @Nullable
    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Nullable
    @Deprecated
    public SessionAdParams getSessionAdParams() {
        return null;
    }

    @Nullable
    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    @Nullable
    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        return getAdsType() == adRequestParameters.getAdsType();
    }

    public boolean isPricePassedByPriceFloor(double d) {
        PriceFloorParams priceFloorParams = this.priceFloorParams;
        if (priceFloorParams == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        Iterator<Double> it = priceFloors.values().iterator();
        while (it.hasNext()) {
            if (d > it.next().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    void setAdPlacementConfig(@NonNull AdPlacementConfig adPlacementConfig) {
        AdFormat adFormat = this.adPlacementConfig.getAdFormat();
        AdFormat adFormat2 = adPlacementConfig.getAdFormat();
        if (!adFormat.equals(adFormat2)) {
            Logger.w("setAdPlacementConfig received different AdsFormat. Expected: " + adFormat + ", actual: " + adFormat2);
            adPlacementConfig = adPlacementConfig.newBuilder(adFormat).build();
        }
        this.adPlacementConfig = adPlacementConfig;
    }

    void setBidPayload(@Nullable ResponsePayload responsePayload) {
        this.bidPayload = responsePayload;
    }

    void setNetworkConfigList(@Nullable List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    void setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
        this.priceFloorParams = priceFloorParams;
    }

    void setTargetingParams(@Nullable TargetingParams targetingParams) {
        this.targetingParams = targetingParams;
    }

    void setTimeOutMs(@Nullable Integer num) {
        this.timeOutMs = num;
    }
}
