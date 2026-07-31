package com.smaato.sdk.ng.utils;

import com.smaato.sdk.ng.models.Ad;

/* loaded from: classes5.dex */
public class AdEndCardManager {
    private static final Boolean a = Boolean.TRUE;
    private static final Boolean b = Boolean.FALSE;

    private static Boolean a(Ad ad) {
        return Boolean.valueOf(ad.isEndCardEnabled() != null);
    }

    public static Boolean getDefaultEndCard() {
        return a;
    }

    public static Boolean isEndCardEnabled(Ad ad) {
        if (ad == null) {
            return Boolean.FALSE;
        }
        boolean shouldShowEndcard = shouldShowEndcard(ad);
        if (!shouldShowEndcard) {
            shouldShowEndcard = shouldShowCustomEndcard(ad);
        }
        return Boolean.valueOf(shouldShowEndcard);
    }

    public static boolean shouldShowCustomEndcard(Ad ad) {
        if (ad.hasCustomEndCard()) {
            return ad.isCustomEndCardEnabled() != null ? ad.isCustomEndCardEnabled().booleanValue() : b.booleanValue();
        }
        return false;
    }

    public static boolean shouldShowEndcard(Ad ad) {
        if (ad.hasEndCard()) {
            return a(ad).booleanValue() ? ad.isEndCardEnabled().booleanValue() : a.booleanValue();
        }
        return false;
    }
}
