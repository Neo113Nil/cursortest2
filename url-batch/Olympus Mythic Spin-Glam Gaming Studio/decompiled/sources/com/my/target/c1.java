package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
class c1 extends t4 {
    c1() {
    }

    synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        try {
            HashMap hashMap = new HashMap();
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return hashMap;
            }
            int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int intExtra3 = registerReceiver.getIntExtra("status", 1);
            if (intExtra >= 0 && intExtra2 > 0) {
                hashMap.put("bl", String.valueOf((intExtra * 100) / intExtra2));
            }
            hashMap.put("bs", String.valueOf(intExtra3));
            return hashMap;
        } catch (Throwable th) {
            throw th;
        }
    }
}
