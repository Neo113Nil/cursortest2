package com.my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
class a5 extends t4 {
    private Map a;

    a5() {
    }

    private static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !str.matches("^[0]+(-[0]+)+$");
    }

    private void b(Map map, Context context) {
        mi.a("GoogleAIdDataProvider: Send google AId");
        String str = null;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            str = advertisingIdInfo.getId();
            mi.a("GoogleAIdDataProvider: Google AId - " + str);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            int i = !isLimitAdTrackingEnabled ? 1 : 0;
            mi.a("GoogleAIdDataProvider: Ad tracking enabled - " + isLimitAdTrackingEnabled);
            map.put("advertising_id", str);
            map.put("advertising_tracking_enabled", i + "");
        } catch (Throwable th) {
            mi.a("GoogleAIdDataProvider: Failed to send google AId - " + th.getMessage());
        }
        if (a(str)) {
            return;
        }
        a(map, context);
    }

    synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        if (o0.a()) {
            mi.a("GoogleAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.a == null) {
            HashMap hashMap = new HashMap();
            this.a = hashMap;
            b(hashMap, context);
        }
        return new HashMap(this.a);
    }

    private void a(Map map, Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put("android_id", string);
    }
}
