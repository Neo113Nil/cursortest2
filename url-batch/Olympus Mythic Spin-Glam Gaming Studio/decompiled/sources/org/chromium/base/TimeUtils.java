package org.chromium.base;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public abstract class TimeUtils {
    public static long elapsedRealtimeMillis() {
        return SystemClock.elapsedRealtime();
    }
}
