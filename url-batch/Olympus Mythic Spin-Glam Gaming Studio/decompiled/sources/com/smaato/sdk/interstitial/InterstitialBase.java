package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.ad.KeyValuePairs;
import java.util.Map;

/* loaded from: classes5.dex */
public class InterstitialBase {
    protected static boolean isMediation;
    protected static KeyValuePairs keyValuePairs;
    protected static String mediationAdapterVersion;
    protected static String mediationNetworkName;
    protected static String mediationNetworkSDKVersion;
    protected static Map<String, Object> objectExtras;

    protected InterstitialBase() {
    }

    public static void setMediation(boolean z) {
        isMediation = z;
    }

    public static boolean getMediationAdapter() {
        return isMediation;
    }

    public static void setMediationNetworkName(String str) {
        mediationNetworkName = str;
    }

    public static void setMediationNetworkSDKVersion(String str) {
        mediationNetworkSDKVersion = str;
    }

    public static void setMediationAdapterVersion(String str) {
        mediationAdapterVersion = str;
    }

    public static KeyValuePairs getKeyValuePairs() {
        return keyValuePairs;
    }

    public static void setKeyValuePairs(KeyValuePairs keyValuePairs2) {
        keyValuePairs = keyValuePairs2;
    }

    public static void setObjectExtras(Map<String, Object> map) {
        objectExtras = map;
    }
}
