package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorManager.java */
/* loaded from: classes13.dex */
class j {
    private volatile ThreadPoolExecutor a;

    /* compiled from: ExecutorManager.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* compiled from: ExecutorManager.java */
    private static final class b implements Runnable {
        private final Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.a)) {
                return;
            }
            try {
                this.a.run();
            } catch (Exception e) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", "execute error", e);
                }
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.a == null) {
            this.a = a();
        }
        if (this.a.isShutdown()) {
            return;
        }
        this.a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
