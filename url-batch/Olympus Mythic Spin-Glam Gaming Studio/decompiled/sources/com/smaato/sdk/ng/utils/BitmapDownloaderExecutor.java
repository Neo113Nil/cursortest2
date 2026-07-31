package com.smaato.sdk.ng.utils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class BitmapDownloaderExecutor {
    private static final TimeUnit a;
    private static final BlockingQueue<Runnable> b;
    private static final ExecutorService c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = timeUnit;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        b = linkedBlockingQueue;
        c = new ThreadPoolExecutor(4, 10, 60L, timeUnit, linkedBlockingQueue, new ThreadPoolExecutor.CallerRunsPolicy());
    }

    private BitmapDownloaderExecutor() {
    }

    public static synchronized ExecutorService getExecutor() {
        ExecutorService executorService;
        synchronized (BitmapDownloaderExecutor.class) {
            executorService = c;
        }
        return executorService;
    }
}
