package com.ysocorp.ysonetwork.device;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.device.metricsCollectors.YNBatteryMetricsCollector;
import com.ysocorp.ysonetwork.device.metricsCollectors.YNCpuMetricsCollector;
import com.ysocorp.ysonetwork.device.metricsCollectors.YNNetworkMetricsCollector;
import com.ysocorp.ysonetwork.device.metricsCollectors.YNRamMetricsCollector;
import com.ysocorp.ysonetwork.device.metricsCollectors.YNSessionUuidCollector;
import com.ysocorp.ysonetwork.device.metricsCollectors.YNStorageMetricsCollector;
import com.ysocorp.ysonetwork.utils.YNLog;
import com.ysocorp.ysonetwork.utils.YNUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* loaded from: classes15.dex */
public class YNDeviceManager {
    private static final YNDeviceManager instance = new YNDeviceManager();

    @NonNull
    private final YNSessionUuidCollector sessionUuidCollector = new YNSessionUuidCollector();

    @NonNull
    private final YNNetworkMetricsCollector networkMetricsCollector = new YNNetworkMetricsCollector();

    @NonNull
    private final YNRamMetricsCollector ramMetricsCollector = new YNRamMetricsCollector();

    @NonNull
    private final YNCpuMetricsCollector cpuMetricsCollector = new YNCpuMetricsCollector();

    @NonNull
    private final YNStorageMetricsCollector storageMetricsCollector = new YNStorageMetricsCollector();

    @NonNull
    private final YNBatteryMetricsCollector batteryMetricsCollector = new YNBatteryMetricsCollector(YNManager.mInitApplication);

    public static YNDeviceManager getInstance() {
        return instance;
    }

    private YNDeviceManager() {
    }

    @Nullable
    public String getDeviceMetrics() {
        this.ramMetricsCollector.refreshState();
        this.storageMetricsCollector.refreshState();
        String str = ((((((("" + X3.j.d) + "\"" + this.sessionUuidCollector.getSessionUuid() + "\",") + Objects.toString(Integer.valueOf(this.cpuMetricsCollector.getCpuCores()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.cpuMetricsCollector.getCpuMinFrequency()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.cpuMetricsCollector.getCpuMaxFrequency()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.cpuMetricsCollector.getCpuCurFrequency()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.networkMetricsCollector.getNetworkDownSpeed()), "0") + StringUtils.COMMA) + Objects.toString(Integer.valueOf(this.batteryMetricsCollector.getBatteryPercentage()), "0") + StringUtils.COMMA;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.batteryMetricsCollector.isBatteryCharging() ? "1" : "0");
        sb.append(StringUtils.COMMA);
        String str2 = (((((sb.toString() + Objects.toString(Double.valueOf(this.ramMetricsCollector.getRamTotalMemory()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.ramMetricsCollector.getRamAvailableMemory()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.ramMetricsCollector.getRamThresholdLowMemory()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.storageMetricsCollector.getStorageTotalMemory()), "0") + StringUtils.COMMA) + Objects.toString(Double.valueOf(this.storageMetricsCollector.getStorageFreeMemory()), "0")) + X3.j.e;
        YNLog.Info("[YNDeviceManager] :: stringInfo = " + str2);
        return YNUtils.encryptString(str2, "$#!<-({ysonetwork})->!#$");
    }
}
