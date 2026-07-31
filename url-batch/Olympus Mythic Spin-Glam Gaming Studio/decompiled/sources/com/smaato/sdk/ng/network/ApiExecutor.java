package com.smaato.sdk.ng.network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ApiExecutor {
    private static volatile ApiExecutor a;
    private static ExecutorService b;

    private ApiExecutor() {
    }

    public static ApiExecutor getInstance() {
        if (a == null) {
            synchronized (ApiExecutor.class) {
                try {
                    if (a == null) {
                        a = new ApiExecutor();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public void execute(Runnable runnable) {
        getExecutor().submit(runnable);
    }

    public ExecutorService getExecutor() {
        if (b == null) {
            b = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors() * 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(50), new ThreadPoolExecutor.CallerRunsPolicy());
        }
        return b;
    }
}
