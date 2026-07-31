package sg.bigo.ads.ba;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
class c extends ThreadPoolExecutor {
    private static c a;

    private c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, 3000L, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    protected static synchronized c a(boolean z) {
        c cVar;
        synchronized (c.class) {
            try {
                if (a == null) {
                    synchronized (c.class) {
                        try {
                            if (a == null) {
                                b(z);
                            }
                        } finally {
                        }
                    }
                }
                cVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    private static synchronized void b(boolean z) {
        synchronized (c.class) {
            a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sg.bigo.ads.bh.c("Download", z), new ThreadPoolExecutor.AbortPolicy());
        }
    }
}
