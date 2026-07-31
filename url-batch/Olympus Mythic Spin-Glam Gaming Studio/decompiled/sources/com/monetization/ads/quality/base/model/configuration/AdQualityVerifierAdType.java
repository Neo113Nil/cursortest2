package com.monetization.ads.quality.base.model.configuration;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;", "", "BANNER", "INTERSTITIAL", BrandSafetyUtils.k, "NATIVE", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdQualityVerifierAdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdQualityVerifierAdType[] $VALUES;
    public static final AdQualityVerifierAdType BANNER;
    public static final AdQualityVerifierAdType INTERSTITIAL;
    public static final AdQualityVerifierAdType NATIVE;
    public static final AdQualityVerifierAdType REWARDED;

    static {
        AdQualityVerifierAdType adQualityVerifierAdType = new AdQualityVerifierAdType(0, "BANNER");
        BANNER = adQualityVerifierAdType;
        AdQualityVerifierAdType adQualityVerifierAdType2 = new AdQualityVerifierAdType(1, "INTERSTITIAL");
        INTERSTITIAL = adQualityVerifierAdType2;
        AdQualityVerifierAdType adQualityVerifierAdType3 = new AdQualityVerifierAdType(2, BrandSafetyUtils.k);
        REWARDED = adQualityVerifierAdType3;
        AdQualityVerifierAdType adQualityVerifierAdType4 = new AdQualityVerifierAdType(3, "NATIVE");
        NATIVE = adQualityVerifierAdType4;
        AdQualityVerifierAdType[] adQualityVerifierAdTypeArr = {adQualityVerifierAdType, adQualityVerifierAdType2, adQualityVerifierAdType3, adQualityVerifierAdType4};
        $VALUES = adQualityVerifierAdTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(adQualityVerifierAdTypeArr);
    }

    private AdQualityVerifierAdType(int i, String str) {
    }

    public static AdQualityVerifierAdType valueOf(String str) {
        return (AdQualityVerifierAdType) Enum.valueOf(AdQualityVerifierAdType.class, str);
    }

    public static AdQualityVerifierAdType[] values() {
        return (AdQualityVerifierAdType[]) $VALUES.clone();
    }
}
