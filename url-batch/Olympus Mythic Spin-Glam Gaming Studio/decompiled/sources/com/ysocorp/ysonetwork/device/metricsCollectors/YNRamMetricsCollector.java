package com.ysocorp.ysonetwork.device.metricsCollectors;

import android.app.ActivityManager;
import androidx.annotation.Nullable;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.utils.YNUtils;

/* loaded from: classes15.dex */
public class YNRamMetricsCollector {

    @Nullable
    private final ActivityManager activityManager = (ActivityManager) YNManager.mInitApplication.getSystemService("activity");
    private ActivityManager.MemoryInfo memoryInfo;

    public double getRamTotalMemory() {
        ActivityManager.MemoryInfo memoryInfo = this.memoryInfo;
        if (memoryInfo != null) {
            return YNUtils.round(YNUtils.valueToUnit(memoryInfo.totalMem, 1024, "G"));
        }
        return 0.0d;
    }

    public double getRamAvailableMemory() {
        ActivityManager.MemoryInfo memoryInfo = this.memoryInfo;
        if (memoryInfo != null) {
            return YNUtils.round(YNUtils.valueToUnit(memoryInfo.availMem, 1024, "G"));
        }
        return 0.0d;
    }

    public double getRamThresholdLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = this.memoryInfo;
        if (memoryInfo != null) {
            return YNUtils.round(YNUtils.valueToUnit(memoryInfo.threshold, 1024, "G"));
        }
        return 0.0d;
    }

    public void refreshState() {
        if (this.activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.memoryInfo = memoryInfo;
            this.activityManager.getMemoryInfo(memoryInfo);
            return;
        }
        this.memoryInfo = null;
    }
}
