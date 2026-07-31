package com.ysocorp.ysonetwork.device.metricsCollectors;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.annotation.Nullable;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.utils.YNUtils;

/* loaded from: classes3.dex */
public class YNNetworkMetricsCollector {

    @Nullable
    private NetworkCapabilities networkCapabilities;

    public YNNetworkMetricsCollector() {
        ConnectivityManager connectivityManager = (ConnectivityManager) YNManager.mInitApplication.getSystemService("connectivity");
        if (connectivityManager != null) {
            this.networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        }
    }

    public double getNetworkDownSpeed() {
        if (this.networkCapabilities != null) {
            return YNUtils.round(YNUtils.valueToUnit(r0.getLinkDownstreamBandwidthKbps() * 1024, 1024, "M"));
        }
        return 0.0d;
    }
}
