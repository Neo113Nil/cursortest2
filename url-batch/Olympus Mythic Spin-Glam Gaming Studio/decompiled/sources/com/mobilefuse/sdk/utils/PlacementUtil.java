package com.mobilefuse.sdk.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.internal.Callback;

/* loaded from: classes9.dex */
public class PlacementUtil {
    public static boolean hasTestMode(@NonNull String str) throws Throwable {
        return str.startsWith(MobileFuseDefaults.TEST_MODE_PLACEMENT_PREFIX);
    }

    public static void detectTestMode(@NonNull String str, @NonNull ObservableConfig observableConfig, @NonNull Callback<String> callback) throws Throwable {
        if (hasTestMode(str)) {
            callback.call(str.substring(5));
            observableConfig.setValue(ObservableConfigKey.TEST_MODE, Boolean.TRUE);
        }
    }

    public static boolean isTestMode(@NonNull ObservableConfig observableConfig) throws Throwable {
        if (observableConfig == null) {
            return false;
        }
        return observableConfig.getBooleanValue(ObservableConfigKey.TEST_MODE);
    }

    public static void setTestMode(@NonNull ObservableConfig observableConfig, boolean z) throws Throwable {
        if (observableConfig == null) {
            return;
        }
        observableConfig.setValue(ObservableConfigKey.TEST_MODE, Boolean.valueOf(z));
    }

    public static void setBidFloor(@NonNull ObservableConfig observableConfig, Float f) throws Throwable {
        if (f != null) {
            observableConfig.setValue(ObservableConfigKey.BID_FLOOR, f);
        }
    }

    public static void clearBidFloor(@NonNull ObservableConfig observableConfig) throws Throwable {
        observableConfig.clearValue(ObservableConfigKey.BID_FLOOR);
    }

    @Nullable
    public static Float getBidFloor(@NonNull ObservableConfig observableConfig) throws Throwable {
        return observableConfig.getFloatValueOrNull(ObservableConfigKey.BID_FLOOR);
    }
}
