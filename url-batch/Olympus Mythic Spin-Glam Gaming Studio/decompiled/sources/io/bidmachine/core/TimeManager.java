package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.util.time.SystemTimeManagerInstance;
import io.bidmachine.util.time.TimeManagerInstance;

/* loaded from: classes3.dex */
public final class TimeManager {

    @NonNull
    private static TimeManagerInstance instance = new SystemTimeManagerInstance();

    public static long currentTimeMillis() {
        return instance.currentTimeMillis();
    }

    @Nullable
    public static String getTimezoneId() {
        return instance.getTimeZoneId();
    }
}
