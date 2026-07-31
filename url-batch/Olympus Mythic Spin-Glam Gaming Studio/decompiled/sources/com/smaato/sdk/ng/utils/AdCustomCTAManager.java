package com.smaato.sdk.ng.utils;

import android.text.TextUtils;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdData;

/* loaded from: classes4.dex */
public class AdCustomCTAManager {
    public static final Integer CUSTOM_CTA_DELAY_DEFAULT = 2;
    public static final Integer CUSTOM_CTA_DELAY_MAX = 10;

    public enum CtaType {
        DEFAULT("default"),
        EXTENDED("extended");

        private final String a;

        CtaType(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    private static Boolean a(Ad ad) {
        if (ad == null || !ad.hasCustomCTA()) {
            return Boolean.FALSE;
        }
        AdData asset = ad.getAsset("custom_cta");
        String stringField = asset != null ? asset.getStringField("icon") : null;
        return Boolean.valueOf(!TextUtils.isEmpty(stringField) && URLValidator.isValidURL(stringField));
    }

    public static Integer getCustomCtaDelay(Ad ad) {
        return Integer.valueOf(Math.min(((ad == null || ad.getCustomCTADelay() == null || ad.getCustomCTADelay().intValue() < 0) ? CUSTOM_CTA_DELAY_DEFAULT : ad.getCustomCTADelay()).intValue(), CUSTOM_CTA_DELAY_MAX.intValue()));
    }

    public static CtaType getCustomCtaType(Ad ad) {
        String customCTAType = ad.getCustomCTAType();
        if (customCTAType != null) {
            CtaType ctaType = CtaType.EXTENDED;
            if (customCTAType.equals(ctaType.toString())) {
                return ctaType;
            }
        }
        return CtaType.DEFAULT;
    }

    public static Boolean isAbleShow(Ad ad) {
        return Boolean.valueOf(isEnabled(ad).booleanValue() && a(ad).booleanValue());
    }

    public static Boolean isEnabled(Ad ad) {
        return Boolean.valueOf((ad == null || ad.isCustomCTAEnabled() == null || !ad.isCustomCTAEnabled().booleanValue()) ? false : true);
    }
}
