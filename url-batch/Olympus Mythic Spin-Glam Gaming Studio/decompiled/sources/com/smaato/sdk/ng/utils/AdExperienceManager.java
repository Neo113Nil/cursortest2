package com.smaato.sdk.ng.utils;

/* loaded from: classes4.dex */
public class AdExperienceManager {
    private static boolean a(Integer num) {
        return num.intValue() == 15;
    }

    private static boolean b(Integer num) {
        return num.intValue() == 15 || num.intValue() == 21 || num.intValue() == 29 || num.intValue() == 23 || num.intValue() == 22 || num.intValue() == 27;
    }

    public static boolean isBrandAd(Integer num, String str) {
        return a(num) && str.equalsIgnoreCase("brand");
    }

    public static boolean isPerformanceAd(Integer num, String str) {
        return b(num) && str.equalsIgnoreCase("performance");
    }
}
