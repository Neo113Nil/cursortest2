package com.yandex.mobile.ads.common;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/common/AdType;", "", "BANNER", "INTERSTITIAL", BrandSafetyUtils.k, "NATIVE", "APP_OPEN_AD", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdType {
    public static final AdType APP_OPEN_AD;
    public static final AdType BANNER;
    public static final AdType INTERSTITIAL;
    public static final AdType NATIVE;
    public static final AdType REWARDED;
    private static final /* synthetic */ AdType[] b;
    private static final /* synthetic */ EnumEntries c;

    static {
        AdType adType = new AdType(0, "BANNER");
        BANNER = adType;
        AdType adType2 = new AdType(1, "INTERSTITIAL");
        INTERSTITIAL = adType2;
        AdType adType3 = new AdType(2, BrandSafetyUtils.k);
        REWARDED = adType3;
        AdType adType4 = new AdType(3, "NATIVE");
        NATIVE = adType4;
        AdType adType5 = new AdType(4, "APP_OPEN_AD");
        APP_OPEN_AD = adType5;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5};
        b = adTypeArr;
        c = EnumEntriesKt.enumEntries(adTypeArr);
    }

    private AdType(int i, String str) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return c;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) b.clone();
    }
}
