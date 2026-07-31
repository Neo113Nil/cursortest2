package com.ysocorp.ysonetwork.device.metricsCollectors;

import android.os.Environment;
import android.os.StatFs;
import com.ysocorp.ysonetwork.utils.YNLog;
import com.ysocorp.ysonetwork.utils.YNUtils;

/* loaded from: classes5.dex */
public class YNStorageMetricsCollector {
    private StatFs statFs;

    public double getStorageTotalMemory() {
        StatFs statFs = this.statFs;
        if (statFs != null) {
            return YNUtils.round(YNUtils.valueToUnit(statFs.getBlockCountLong() * this.statFs.getBlockSizeLong(), 1024, "G"));
        }
        return 0.0d;
    }

    public double getStorageFreeMemory() {
        StatFs statFs = this.statFs;
        if (statFs != null) {
            return YNUtils.round(YNUtils.valueToUnit(statFs.getAvailableBlocksLong() * this.statFs.getBlockSizeLong(), 1024, "G"));
        }
        return 0.0d;
    }

    public void refreshState() {
        try {
            this.statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        } catch (IllegalArgumentException e) {
            YNLog.Error("Cannot read storage " + e.getMessage());
            this.statFs = null;
        }
    }
}
