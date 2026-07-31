package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes4.dex */
public class BatteryUtils {
    private static final String TAG = "BatteryUtils";
    static Boolean isBatteryPercentageValueFetched = Boolean.FALSE;

    public static synchronized int getBatteryPercentageSync(Context context) {
        synchronized (BatteryUtils.class) {
            isBatteryPercentageValueFetched = Boolean.FALSE;
            if (context == null) {
                return 0;
            }
            try {
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra >= 0 && intExtra2 > 0) {
                        isBatteryPercentageValueFetched = Boolean.TRUE;
                        return (intExtra * 100) / intExtra2;
                    }
                }
            } catch (RuntimeException e) {
                Logger.e(TAG, "Could not retrieve battery status. The system may be unstable.", e);
            }
            return 0;
        }
    }

    public static synchronized Boolean isBatteryPercentageValueFetched() {
        Boolean bool;
        synchronized (BatteryUtils.class) {
            bool = isBatteryPercentageValueFetched;
        }
        return bool;
    }
}
