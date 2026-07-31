package com.ysocorp.ysonetwork.device.metricsCollectors;

import com.ysocorp.ysonetwork.utils.YNUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class YNCpuMetricsCollector {
    public int getCpuCores() {
        File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.ysocorp.ysonetwork.device.metricsCollectors.YNCpuMetricsCollector$$ExternalSyntheticLambda0
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean lambda$getCpuCores$0;
                lambda$getCpuCores$0 = YNCpuMetricsCollector.lambda$getCpuCores$0(file);
                return lambda$getCpuCores$0;
            }
        });
        if (listFiles != null) {
            return listFiles.length;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getCpuCores$0(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }

    public double getCpuMinFrequency() {
        return YNUtils.round(YNUtils.valueToUnit(YNUtils.readIntegerFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq") * 1000, 1000, "G"));
    }

    public double getCpuMaxFrequency() {
        return YNUtils.round(YNUtils.valueToUnit(YNUtils.readIntegerFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq") * 1000, 1000, "G"));
    }

    public double getCpuCurFrequency() {
        return YNUtils.round(YNUtils.valueToUnit(YNUtils.readIntegerFile("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq") * 1000, 1000, "G"));
    }
}
