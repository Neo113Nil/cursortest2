package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.AdsFormat;
import java.util.List;

/* loaded from: classes3.dex */
public class GAMTypeConfig {

    @NonNull
    private final AdsFormat adsFormat;
    private final int cacheSize;

    @NonNull
    private final List<GAMUnitData> gamUnitDataList;

    public GAMTypeConfig(@NonNull AdsFormat adsFormat, @NonNull List<GAMUnitData> list, int i) {
        this.adsFormat = adsFormat;
        this.cacheSize = i;
        this.gamUnitDataList = list;
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public List<GAMUnitData> getGAMUnitDataList() {
        return this.gamUnitDataList;
    }

    public int getCacheSize() {
        return this.cacheSize;
    }
}
