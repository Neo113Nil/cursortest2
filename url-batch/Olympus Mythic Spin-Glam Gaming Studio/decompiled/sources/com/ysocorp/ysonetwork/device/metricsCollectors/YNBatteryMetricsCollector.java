package com.ysocorp.ysonetwork.device.metricsCollectors;

import android.content.Context;
import android.os.BatteryManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes15.dex */
public class YNBatteryMetricsCollector {

    @Nullable
    private final BatteryManager batteryManager;

    public YNBatteryMetricsCollector(@NonNull Context context) {
        this.batteryManager = (BatteryManager) context.getApplicationContext().getSystemService("batterymanager");
    }

    public int getBatteryPercentage() {
        BatteryManager batteryManager = this.batteryManager;
        if (batteryManager == null) {
            return 0;
        }
        return Math.max(0, Math.min(batteryManager.getIntProperty(4), 100));
    }

    public boolean isBatteryCharging() {
        BatteryManager batteryManager = this.batteryManager;
        if (batteryManager != null) {
            return batteryManager.isCharging();
        }
        return false;
    }
}
