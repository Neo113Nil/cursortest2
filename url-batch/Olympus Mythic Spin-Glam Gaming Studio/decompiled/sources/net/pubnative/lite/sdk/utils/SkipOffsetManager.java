package net.pubnative.lite.sdk.utils;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class SkipOffsetManager {
    private static final int BC_ENDCARD_SKIP_OFFSET = 0;
    private static final Integer ENDCARD_CLOSE_DELAY_DEFAULT;
    private static final int ENDCARD_CLOSE_DELAY_MAXIMUM = 30;
    private static final int ENDCARD_SKIP_OFFSET = 4;
    public static final int INTERSTITIAL_MRAID = 3;
    private static final int INTERSTITIAL_VIDEO_WITHOUT_END_CARD = 15;
    private static final int INTERSTITIAL_VIDEO_WITH_END_CARD = 10;
    private static final int NATIVE_CLOSE_BUTTON_DELAY = 15;
    private static final int PC_ENDCARD_SKIP_OFFSET = 5;
    private static final Integer PC_HTML_SKIP_OFFSET = 3;
    private static final Integer PC_REWARDED_HTML_SKIP_OFFSET = 30;
    private static final int REWARDED_HTML_SKIP_OFFSET = 30;
    private static final int REWARDED_VIDEO_DEFAULT = 30;
    private static final int VIDEO_WITHOUT_ENDCARD_SKIP_OFFSET = 15;
    private static final int VIDEO_WITH_ENDCARD_SKIP_OFFSET = 10;
    private static final int globalMaximumSkipOffset = 30;
    private static Boolean isCustomInterstitialHTMLSkipOffset;
    private static Boolean isCustomInterstitialVideoSkipOffset;

    private static class SkipOffset {
        private Boolean isValid;
        private Integer skipOffset;

        public SkipOffset(boolean z, Integer num) {
            this.skipOffset = num;
            this.isValid = Boolean.valueOf(z);
        }

        public Integer getSkipOffset() {
            return this.skipOffset;
        }

        public Boolean isValid() {
            return this.isValid;
        }

        public void setSkipOffset(Integer num) {
            this.skipOffset = num;
        }

        public void setValid(Boolean bool) {
            this.isValid = bool;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        isCustomInterstitialVideoSkipOffset = bool;
        isCustomInterstitialHTMLSkipOffset = bool;
        ENDCARD_CLOSE_DELAY_DEFAULT = 3;
    }

    private static Integer findSkipOffset(ArrayList<Integer> arrayList, int i) {
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
                SkipOffset isValidSkipOffset = isValidSkipOffset(num2);
                if (isValidSkipOffset.isValid().booleanValue()) {
                    i2 = isValidSkipOffset.getSkipOffset().intValue();
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
        return ENDCARD_CLOSE_DELAY_DEFAULT;
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
        return PC_HTML_SKIP_OFFSET;
    }

    public static Integer getDefaultPCRewardedHTMLSkipOffset() {
        return PC_REWARDED_HTML_SKIP_OFFSET;
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
        Integer findSkipOffset = findSkipOffset(arrayList, i);
        if (bool.booleanValue()) {
            isCustomInterstitialHTMLSkipOffset = Boolean.valueOf(findSkipOffset.intValue() != 3);
        }
        return findSkipOffset;
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
        Integer findSkipOffset = findSkipOffset(arrayList, i);
        if (bool2.booleanValue()) {
            isCustomInterstitialVideoSkipOffset = Boolean.valueOf(findSkipOffset.intValue() != i);
        }
        return findSkipOffset;
    }

    public static Boolean isCustomInterstitialHTMLSkipOffset() {
        return isCustomInterstitialHTMLSkipOffset;
    }

    public static Boolean isCustomInterstitialVideoSkipOffset() {
        return isCustomInterstitialVideoSkipOffset;
    }

    public static SkipOffset isValidSkipOffset(Integer num) {
        boolean z;
        if (num == null || num.intValue() < 0) {
            z = false;
        } else {
            z = true;
            if (num.intValue() > 30) {
                num = 30;
            }
        }
        return new SkipOffset(z, num);
    }

    public static void reset() {
        Boolean bool = Boolean.FALSE;
        isCustomInterstitialVideoSkipOffset = bool;
        isCustomInterstitialHTMLSkipOffset = bool;
    }
}
