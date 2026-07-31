package com.smaato.sdk.core.ub;

import com.smaato.sdk.ng.models.Ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class SmaatoUBCache {
    private static final Map<String, Ad> UB_BID_CACHE = new HashMap();

    public static Ad getAd(String str) {
        return UB_BID_CACHE.remove(str);
    }

    public static void addToCache(String str, Ad ad) {
        UB_BID_CACHE.put(str, ad);
    }
}
