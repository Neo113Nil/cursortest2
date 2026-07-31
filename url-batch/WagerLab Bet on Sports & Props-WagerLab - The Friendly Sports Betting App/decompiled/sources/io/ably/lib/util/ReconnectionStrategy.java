package io.ably.lib.util;

/* loaded from: classes7.dex */
public class ReconnectionStrategy {
    private static float getBackoffCoefficient(int i) {
        return Math.min((i + 2) / 3.0f, 2.0f);
    }

    private static double getJitterCoefficient() {
        return 1.0d - (Math.random() * 0.2d);
    }

    public static int getRetryTime(long j, int i) {
        return Double.valueOf(j * getJitterCoefficient() * getBackoffCoefficient(i)).intValue();
    }
}
