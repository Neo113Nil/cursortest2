package com.smaato.sdk.ng.utils;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes6.dex */
public class CountryUtils {
    private static final Set<String> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.addAll(Arrays.asList("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL", "UK", "GB", "CH", "NO", IronSourceConstants.INTERSTITIAL_EVENT_TYPE, "LI"));
    }

    public static boolean isGDPRCountry(String str) {
        return a.contains(str.toUpperCase(Locale.ENGLISH));
    }
}
