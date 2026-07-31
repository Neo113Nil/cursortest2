package org.chromium.base;

import internal.org.chromium.build.BuildConfig;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public abstract class ResettersForTesting {
    private static LinkedHashSet sClassResetters;
    private static boolean sIsFlushing;
    private static final Object sLock = new Object();
    private static LinkedHashSet sMethodResetters;
    private static int sState;

    public static void register(Runnable runnable) {
        if (BuildConfig.IS_FOR_TEST) {
            synchronized (sLock) {
                try {
                    if (sIsFlushing) {
                        throw new IllegalStateException("ResettersForTesting.register() called from within a resetting callback.");
                    }
                    int i = sState;
                    if (i == 1) {
                        sClassResetters.add(runnable);
                    } else if (i == 2) {
                        sClassResetters.add(runnable);
                    } else if (i == 3) {
                        sMethodResetters.add(runnable);
                    } else if (i == 4) {
                        sMethodResetters.add(runnable);
                    }
                } finally {
                }
            }
        }
    }
}
