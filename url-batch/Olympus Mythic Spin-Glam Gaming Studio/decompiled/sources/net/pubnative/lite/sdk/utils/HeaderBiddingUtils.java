package net.pubnative.lite.sdk.utils;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.utils.PrebidUtils;

/* loaded from: classes11.dex */
public class HeaderBiddingUtils {
    private static final double ECPM_POINTS_DIVIDER = 1000.0d;

    public interface KEYS {
        public static final String PN_BID = "pn_bid";
    }

    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    private static String getBidECPM(Ad ad, KeywordMode keywordMode) {
        return String.format(Locale.ENGLISH, keywordMode == KeywordMode.TWO_DECIMALS ? "%.2f" : "%.3f", Double.valueOf(ad.getECPM().doubleValue() / ECPM_POINTS_DIVIDER));
    }

    public static String getBidFromPoints(Integer num, PrebidUtils.KeywordMode keywordMode) {
        return String.format(Locale.ENGLISH, keywordMode == PrebidUtils.KeywordMode.TWO_DECIMALS ? "%.2f" : "%.3f", Double.valueOf(num.doubleValue() / ECPM_POINTS_DIVIDER));
    }

    public static String getHeaderBiddingKeywords(Ad ad) {
        return getHeaderBiddingKeywords(ad, "");
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad) {
        return getHeaderBiddingKeywordsBundle(ad, "");
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad) {
        return getHeaderBiddingKeywordsSet(ad, "");
    }

    public static String getHeaderBiddingKeywords(Ad ad, KeywordMode keywordMode) {
        return getHeaderBiddingKeywords(ad, "", keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad, KeywordMode keywordMode) {
        return getHeaderBiddingKeywordsBundle(ad, "", keywordMode);
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad, KeywordMode keywordMode) {
        return getHeaderBiddingKeywordsSet(ad, "", keywordMode);
    }

    public static String getHeaderBiddingKeywords(Ad ad, String str) {
        return getHeaderBiddingKeywords(ad, str, KeywordMode.THREE_DECIMALS);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad, String str) {
        return getHeaderBiddingKeywordsBundle(ad, str, KeywordMode.THREE_DECIMALS);
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad, String str) {
        return getHeaderBiddingKeywordsSet(ad, str, KeywordMode.THREE_DECIMALS);
    }

    public static String getHeaderBiddingKeywords(Ad ad, String str, KeywordMode keywordMode) {
        return "pn_bid:" + getBidECPM(ad, keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad, String str, KeywordMode keywordMode) {
        Bundle bundle = new Bundle();
        bundle.putString("pn_bid", getBidECPM(ad, keywordMode));
        return bundle;
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad, String str, KeywordMode keywordMode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(3);
        linkedHashSet.add("pn_bid".concat(":").concat(getBidECPM(ad, keywordMode)));
        return linkedHashSet;
    }
}
