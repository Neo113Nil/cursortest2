package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.base.POBAdRequest;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class POBRequest implements POBAdRequest {
    private final POBImpression[] a;
    private final int b;
    private final String c;
    private int d = 5;
    private boolean e;
    private boolean f;
    private final POBAdFormat g;
    private Boolean h;
    private String i;

    public enum API {
        VPAID1(1),
        VPAID2(2),
        MRAID1(3),
        ORMMA(4),
        MRAID2(5),
        MRAID3(6),
        OMSDK(7);

        private final int a;

        API(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    public enum AdPosition {
        UNKNOWN(0),
        ABOVE_THE_FOLD(1),
        BELOW_THE_FOLD(3),
        HEADER(4),
        FOOTER(5),
        SIDEBAR(6),
        FULL_SCREEN(7);

        private final int a;

        AdPosition(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    private POBRequest(String str, int i, POBAdFormat pOBAdFormat, POBImpression... pOBImpressionArr) {
        this.c = str;
        this.b = i;
        this.g = pOBAdFormat;
        this.a = pOBImpressionArr;
    }

    @Nullable
    public static POBRequest createInstance(@NonNull String str, int i, @NonNull POBAdFormat pOBAdFormat, @NonNull POBImpression... pOBImpressionArr) {
        if (POBUtils.isNullOrEmpty(str) || POBUtils.isNull(pOBImpressionArr) || pOBImpressionArr.length <= 0) {
            return null;
        }
        return new POBRequest(str, i, pOBAdFormat, pOBImpressionArr);
    }

    boolean a() {
        return this.e;
    }

    public void enableDebugState(boolean z) {
        this.f = z;
    }

    public void enableReturnAllBidStatus(boolean z) {
        this.e = z;
    }

    public void enableTestMode(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Nullable
    public String getAdServerUrl() {
        return this.i;
    }

    @Nullable
    public POBImpression[] getImpressions() {
        POBImpression[] pOBImpressionArr = this.a;
        if (pOBImpressionArr == null || pOBImpressionArr.length <= 0) {
            return null;
        }
        return (POBImpression[]) Arrays.copyOf(pOBImpressionArr, pOBImpressionArr.length);
    }

    public int getNetworkTimeout() {
        return this.d;
    }

    @NonNull
    public POBAdFormat getPlacementType() {
        return this.g;
    }

    public int getProfileId() {
        return this.b;
    }

    @NonNull
    public String getPubId() {
        return this.c;
    }

    @Nullable
    public Boolean getTestMode() {
        return this.h;
    }

    public boolean isDebugStateEnabled() {
        return this.f;
    }

    public void setAdServerUrl(@Nullable String str) {
        this.i = str;
    }

    public void setNetworkTimeout(int i) {
        if (i > 0) {
            this.d = i;
        }
    }

    @NonNull
    public String getAdUnitId() {
        POBImpression[] impressions = getImpressions();
        return (impressions == null || impressions.length <= 0) ? "" : impressions[0].getAdUnitId();
    }
}
