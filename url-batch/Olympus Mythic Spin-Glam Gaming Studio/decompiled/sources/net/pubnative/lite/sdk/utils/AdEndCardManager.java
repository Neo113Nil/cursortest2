package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.models.Ad;

/* loaded from: classes12.dex */
public class AdEndCardManager {
    private static final Boolean END_CARD_ENABLED = Boolean.TRUE;
    private static final Boolean CUSTOM_END_CARD_ENABLED = Boolean.FALSE;

    public static Boolean getDefaultEndCard() {
        return END_CARD_ENABLED;
    }

    private static Boolean hasEndcardRemoteConfig(Ad ad) {
        return Boolean.valueOf(ad.isEndCardEnabled() != null);
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
            return ad.isCustomEndCardEnabled() != null ? ad.isCustomEndCardEnabled().booleanValue() : CUSTOM_END_CARD_ENABLED.booleanValue();
        }
        return false;
    }

    public static boolean shouldShowEndcard(Ad ad) {
        if (ad.hasEndCard()) {
            return hasEndcardRemoteConfig(ad).booleanValue() ? ad.isEndCardEnabled().booleanValue() : END_CARD_ENABLED.booleanValue();
        }
        return false;
    }
}
