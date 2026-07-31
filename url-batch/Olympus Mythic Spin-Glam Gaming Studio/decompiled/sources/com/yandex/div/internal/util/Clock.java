package com.yandex.div.internal.util;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.annotations.InternalApi;
import java.util.concurrent.TimeUnit;

@InternalApi
/* loaded from: classes13.dex */
public class Clock {

    @NonNull
    private static Clock sDefault = new Clock();

    @NonNull
    public static Clock get() {
        return sDefault;
    }

    @VisibleForTesting
    public static void setForTests(@Nullable Clock clock) {
        if (clock == null) {
            clock = new Clock();
        }
        sDefault = clock;
    }

    public long getCurrentUnixTimestamp() {
        return TimeUnit.MILLISECONDS.toSeconds(getCurrentTimeMs());
    }

    public long getCurrentTimeMs() {
        return System.currentTimeMillis();
    }

    public long getUptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    public long getElapsedRealtimeMs() {
        return SystemClock.elapsedRealtime();
    }
}
