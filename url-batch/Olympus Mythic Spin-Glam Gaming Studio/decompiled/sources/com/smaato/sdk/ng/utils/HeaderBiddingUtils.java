package com.smaato.sdk.ng.utils;

import android.os.Bundle;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.utils.PrebidUtils;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public class HeaderBiddingUtils {

    public interface KEYS {
        public static final String PN_BID = "pn_bid";
    }

    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    private static String a(Ad ad, KeywordMode keywordMode) {
        return String.format(Locale.ENGLISH, keywordMode == KeywordMode.TWO_DECIMALS ? "%.2f" : "%.3f", Double.valueOf(ad.getECPM().doubleValue() / 1000.0d));
    }

    public static String getBidFromPoints(Integer num, PrebidUtils.KeywordMode keywordMode) {
        return String.format(Locale.ENGLISH, keywordMode == PrebidUtils.KeywordMode.TWO_DECIMALS ? "%.2f" : "%.3f", Double.valueOf(num.doubleValue() / 1000.0d));
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
        return "pn_bid:" + a(ad, keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad, String str, KeywordMode keywordMode) {
        Bundle bundle = new Bundle();
        bundle.putString("pn_bid", a(ad, keywordMode));
        return bundle;
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad, String str, KeywordMode keywordMode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(3);
        linkedHashSet.add("pn_bid".concat(":").concat(a(ad, keywordMode)));
        return linkedHashSet;
    }
}
