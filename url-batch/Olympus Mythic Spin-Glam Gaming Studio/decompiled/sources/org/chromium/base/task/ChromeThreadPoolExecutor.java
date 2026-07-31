package org.chromium.base.task;

import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
class ChromeThreadPoolExecutor extends ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int MAXIMUM_POOL_SIZE;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        MAXIMUM_POOL_SIZE = (availableProcessors * 2) + 1;
        sThreadFactory = new ThreadFactory() { // from class: org.chromium.base.task.ChromeThreadPoolExecutor.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "CrAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sPoolWorkQueue = new ArrayBlockingQueue(128);
    }

    ChromeThreadPoolExecutor() {
        this(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    }

    ChromeThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    private static String getClassName(Runnable runnable) {
        Class<?> cls = runnable.getClass();
        if (cls == AsyncTask$NamedFutureTask.class) {
            throw null;
        }
        if (cls.getEnclosingClass() == AsyncTask.class) {
            cls = AsyncTask.class;
        }
        return cls.getName();
    }

    private Map getNumberOfClassNameOccurrencesInQueue() {
        HashMap hashMap = new HashMap();
        for (Runnable runnable : (Runnable[]) getQueue().toArray(new Runnable[0])) {
            String className = getClassName(runnable);
            hashMap.put(className, Integer.valueOf((hashMap.containsKey(className) ? ((Integer) hashMap.get(className)).intValue() : 0) + 1));
        }
        return hashMap;
    }

    private String findClassNamesWithTooManyRunnables(Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 32) {
                sb.append((String) entry.getKey());
                sb.append(' ');
            }
        }
        if (sb.length() == 0) {
            return "NO CLASSES FOUND";
        }
        return sb.toString();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            throw new RejectedExecutionException("Prominent classes in AsyncTask: " + findClassNamesWithTooManyRunnables(getNumberOfClassNameOccurrencesInQueue()), e);
        }
    }
}
