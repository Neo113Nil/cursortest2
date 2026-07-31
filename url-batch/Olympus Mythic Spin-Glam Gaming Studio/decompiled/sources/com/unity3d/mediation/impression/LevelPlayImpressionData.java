package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LevelPlayImpressionData {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    @NotNull
    private final JSONObject a;

    @NotNull
    private final DecimalFormat b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(@NotNull JSONObject allData) {
        Intrinsics.checkNotNullParameter(allData, "allData");
        this.a = allData;
        this.b = new DecimalFormat("#.#####");
    }

    @Nullable
    public final String getAb() {
        String it = this.a.optString("ab", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getAdFormat() {
        String it = this.a.optString("adFormat", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getAdNetwork() {
        String it = this.a.optString("adNetwork", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @NotNull
    public final JSONObject getAllData() {
        return this.a;
    }

    @Nullable
    public final String getAuctionId() {
        String it = this.a.optString("auctionId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getCountry() {
        String it = this.a.optString("country", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getCreativeId() {
        String it = this.a.optString("creativeId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getEncryptedCPM() {
        String it = this.a.optString("encryptedCPM", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getInstanceId() {
        String it = this.a.optString("instanceId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getInstanceName() {
        String it = this.a.optString("instanceName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        String it = this.a.optString("mediationAdUnitId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitName() {
        String it = this.a.optString("mediationAdUnitName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getPlacement() {
        String it = this.a.optString("placement", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getPrecision() {
        String it = this.a.optString("precision", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final Double getRevenue() {
        double optDouble = this.a.optDouble("revenue");
        Double valueOf = Double.valueOf(optDouble);
        if (Double.isNaN(optDouble)) {
            return null;
        }
        return valueOf;
    }

    @Nullable
    public final String getSegmentName() {
        String it = this.a.optString("segmentName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "auctionId: '" + getAuctionId() + "', mediationAdUnitName: '" + getMediationAdUnitName() + "', mediationAdUnitId: '" + getMediationAdUnitId() + "', adFormat: '" + getAdFormat() + "', country: '" + getCountry() + "', ab: '" + getAb() + "', segmentName: '" + getSegmentName() + "', placement: '" + getPlacement() + "', adNetwork: '" + getAdNetwork() + "', instanceName: '" + getInstanceName() + "', instanceId: '" + getInstanceId() + "', revenue: " + (getRevenue() == null ? null : this.b.format(getRevenue())) + ", precision: '" + getPrecision() + "', encryptedCPM: '" + getEncryptedCPM() + "', creativeId: '" + getCreativeId() + "'";
    }
}
