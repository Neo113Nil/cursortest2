package com.smaato.sdk.ng.utils;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public class SkipOffsetManager {
    public static final int INTERSTITIAL_MRAID = 3;
    private static final Integer a = 3;
    private static final Integer b = 30;
    private static Boolean c;
    private static Boolean d;
    private static final Integer e;

    private static class a {
        private Integer a;
        private Boolean b;

        public a(boolean z, Integer num) {
            this.a = num;
            this.b = Boolean.valueOf(z);
        }

        public Integer a() {
            return this.a;
        }

        public Boolean b() {
            return this.b;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        c = bool;
        d = bool;
        e = 3;
    }

    private static Integer a(ArrayList<Integer> arrayList, int i) {
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i2 = -1;
                break;
            }
            Integer num = arrayList.get(i3);
            i3++;
            Integer num2 = num;
            if (num2 != null) {
                a isValidSkipOffset = isValidSkipOffset(num2);
                if (isValidSkipOffset.b().booleanValue()) {
                    i2 = isValidSkipOffset.a().intValue();
                    break;
                }
            }
        }
        if (i2 != -1) {
            i = i2;
        }
        if (i > 30) {
            i = 30;
        }
        return Integer.valueOf(i);
    }

    public static Integer getDefaultBCEndcardSkipOffset() {
        return 0;
    }

    public static Integer getDefaultEndcardCloseDelay() {
        return e;
    }

    public static Integer getDefaultEndcardSkipOffset() {
        return 4;
    }

    public static Integer getDefaultHtmlInterstitialSkipOffset() {
        return 3;
    }

    public static Integer getDefaultNativeCloseButtonDelay() {
        return 15;
    }

    public static Integer getDefaultPCEndcardSkipOffset() {
        return 5;
    }

    public static Integer getDefaultPCHTMLSkipOffset() {
        return a;
    }

    public static Integer getDefaultPCRewardedHTMLSkipOffset() {
        return b;
    }

    public static Integer getDefaultRewardedHtmlSkipOffset() {
        return 30;
    }

    public static Integer getDefaultVideoWithEndCardSkipOffset() {
        return 10;
    }

    public static Integer getDefaultVideoWithoutEndCardSkipOffset() {
        return 15;
    }

    public static Integer getHTMLSkipOffset(Integer num, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        int i = bool.booleanValue() ? 3 : 30;
        arrayList.add(num);
        Integer a2 = a(arrayList, i);
        if (bool.booleanValue()) {
            d = Boolean.valueOf(a2.intValue() != 3);
        }
        return a2;
    }

    public static Integer getMaximumEndcardCloseDelay() {
        return 30;
    }

    public static int getMaximumRewardedSkipOffset() {
        return 30;
    }

    public static Integer getNativeCloseButtonDelay(Integer num) {
        if (num == null || num.intValue() < 0 || num.intValue() > 15) {
            return 15;
        }
        return num;
    }

    public static Integer getVideoSkipOffset(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2) {
        int i = bool2.booleanValue() ? bool.booleanValue() ? 10 : 15 : 30;
        ArrayList arrayList = new ArrayList();
        arrayList.add(num3);
        arrayList.add(num);
        arrayList.add(num2);
        Integer a2 = a(arrayList, i);
        if (bool2.booleanValue()) {
            c = Boolean.valueOf(a2.intValue() != i);
        }
        return a2;
    }

    public static Boolean isCustomInterstitialHTMLSkipOffset() {
        return d;
    }

    public static Boolean isCustomInterstitialVideoSkipOffset() {
        return c;
    }

    public static a isValidSkipOffset(Integer num) {
        boolean z;
        if (num == null || num.intValue() < 0) {
            z = false;
        } else {
            z = true;
            if (num.intValue() > 30) {
                num = 30;
            }
        }
        return new a(z, num);
    }

    @VisibleForTesting
    public static void reset() {
        Boolean bool = Boolean.FALSE;
        c = bool;
        d = bool;
    }
}
