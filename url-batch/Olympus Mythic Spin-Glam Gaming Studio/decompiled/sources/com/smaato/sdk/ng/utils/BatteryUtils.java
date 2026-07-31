package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public class BatteryUtils {
    private static final String a = "BatteryUtils";
    static Boolean b = Boolean.FALSE;

    public static synchronized int getBatteryPercentageSync(Context context) {
        synchronized (BatteryUtils.class) {
            b = Boolean.FALSE;
            if (context == null) {
                return 0;
            }
            try {
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra >= 0 && intExtra2 > 0) {
                        b = Boolean.TRUE;
                        return (intExtra * 100) / intExtra2;
                    }
                }
            } catch (RuntimeException e) {
                Logger.e(a, "Could not retrieve battery status. The system may be unstable.", e);
            }
            return 0;
        }
    }

    public static synchronized Boolean isBatteryPercentageValueFetched() {
        Boolean bool;
        synchronized (BatteryUtils.class) {
            bool = b;
        }
        return bool;
    }
}
