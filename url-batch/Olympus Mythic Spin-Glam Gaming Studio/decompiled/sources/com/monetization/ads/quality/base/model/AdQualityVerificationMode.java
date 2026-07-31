package com.monetization.ads.quality.base.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationMode;", "", "FAST_VERIFICATION", "LONG_VERIFICATION", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdQualityVerificationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdQualityVerificationMode[] $VALUES;
    public static final AdQualityVerificationMode FAST_VERIFICATION;
    public static final AdQualityVerificationMode LONG_VERIFICATION;

    static {
        AdQualityVerificationMode adQualityVerificationMode = new AdQualityVerificationMode(0, "FAST_VERIFICATION");
        FAST_VERIFICATION = adQualityVerificationMode;
        AdQualityVerificationMode adQualityVerificationMode2 = new AdQualityVerificationMode(1, "LONG_VERIFICATION");
        LONG_VERIFICATION = adQualityVerificationMode2;
        AdQualityVerificationMode[] adQualityVerificationModeArr = {adQualityVerificationMode, adQualityVerificationMode2};
        $VALUES = adQualityVerificationModeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(adQualityVerificationModeArr);
    }

    private AdQualityVerificationMode(int i, String str) {
    }

    public static AdQualityVerificationMode valueOf(String str) {
        return (AdQualityVerificationMode) Enum.valueOf(AdQualityVerificationMode.class, str);
    }

    public static AdQualityVerificationMode[] values() {
        return (AdQualityVerificationMode[]) $VALUES.clone();
    }
}
