package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class a {
    public static r0 a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        HashMap hashMap = iAConfigManager.b;
        if (hashMap != null && hashMap.containsKey(str)) {
            return (r0) iAConfigManager.b.get(str);
        }
        IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    public static String a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + str + "/simpleM2M/" + str2;
        }
        return com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
