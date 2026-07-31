package com.smaato.sdk.ng.utils;

import android.os.Bundle;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.utils.HeaderBiddingUtils;
import java.util.Set;

/* loaded from: classes13.dex */
public class PrebidUtils {

    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    private static HeaderBiddingUtils.KeywordMode a(KeywordMode keywordMode) {
        return keywordMode == KeywordMode.TWO_DECIMALS ? HeaderBiddingUtils.KeywordMode.TWO_DECIMALS : HeaderBiddingUtils.KeywordMode.THREE_DECIMALS;
    }

    public static String getBidFromPoints(Integer num, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getBidFromPoints(num, keywordMode);
    }

    public static String getPrebidKeywords(Ad ad) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad);
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad);
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad);
    }

    public static String getPrebidKeywords(Ad ad, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad, a(keywordMode));
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad, a(keywordMode));
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad, a(keywordMode));
    }

    public static String getPrebidKeywords(Ad ad, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad, str);
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad, str);
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad, str);
    }

    public static String getPrebidKeywords(Ad ad, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad, str, a(keywordMode));
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad, str, a(keywordMode));
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad, str, a(keywordMode));
    }
}
