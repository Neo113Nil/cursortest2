package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class a {
    public static final String a = "ConfigurationHelper";
    public static final Set<String> b = new HashSet(Arrays.asList("CONTENTCAT", "PLAYBACKMETHODS", "STOREID", "STOREURL", "CACHEBUSTING", "TIMESTAMP", "ADCATEGORIES", "ADCOUNT", "ADTYPE", "BLOCKEDADCATEGORIES", "BREAKMAXADLENGTH", "BREAKMAXADS", "BREAKMAXDURATION", "BREAKMINADLENGTH", "BREAKPOSITION", "CONTENTPLAYHEAD", "MEDIAPLAYHEAD", "PLACEMENTTYPE", "TRANSACTIONID", "UNIVERSALADID", "CLIENTUA", "DEVICEIP", "DEVICEUA", "IFA", "IFATYPE", "LATLONG", "SERVERSIDE", "SERVERUA", "APPBUNDLE", "DOMAIN", "PAGEURL", "APIFRAMEWORKS", "CLICKTYPE", "EXTENSIONS", "MEDIAMIME", "OMIDPARTNER", "PLAYERCAPABILITIES", "VASTVERSIONS", "VERIFICATIONVENDORS", "ADPLAYHEAD", "ADSERVINGID", "ASvastMacroQueryParams.RI", "CONTENTID", "CONTENTURI", "INVENTORYSTATE", "PLAYERSIZE", "PLAYERSTATE", "PODSEQUENCE", "CLICKPOS", "ERRORCODE", "REASON", "GDPRCONSENT", "LIMITADTRACKING", "REGULATIONS"));

    public static boolean a(String str) {
        boolean z;
        com.safedk.android.analytics.brandsafety.creatives.b k = CreativeInfoManager.k(str);
        if (k == null) {
            Logger.d(a, "cannot determine config item SUPPORTS_BANNER_IMPRESSION_TRACKING for sdk ", str);
        }
        if (k != null && k.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING)) {
            z = true;
        } else {
            z = false;
        }
        Logger.d(a, "isBannerMonitoringSupported returned ", Boolean.valueOf(z), " for sdk ", str);
        return z;
    }
}
