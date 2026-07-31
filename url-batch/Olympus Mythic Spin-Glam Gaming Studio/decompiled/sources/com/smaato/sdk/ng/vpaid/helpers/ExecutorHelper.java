package com.smaato.sdk.ng.vpaid.helpers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class ExecutorHelper {
    private static final ExecutorService a = Executors.newCachedThreadPool();
    private static final ExecutorService b = Executors.newSingleThreadExecutor();

    private ExecutorHelper() {
    }

    public static ExecutorService getExecutor() {
        return a;
    }

    public static ExecutorService getSingleExecutor() {
        return b;
    }

    public static void shutdown() {
        a.shutdown();
    }
}
