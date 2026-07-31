package com.my.target;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public abstract class o0 {
    public static final Handler h;
    public static final Executor a = Executors.newFixedThreadPool(6);
    public static final Executor b = Executors.newSingleThreadExecutor();
    public static final Executor c = Executors.newFixedThreadPool(6);
    public static final Executor d = Executors.newSingleThreadExecutor();
    public static final Executor e = new ThreadPoolExecutor(1, 5, 20, TimeUnit.SECONDS, new SynchronousQueue());
    public static final List f = new ArrayList();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final Executor i = new a();
    private static final AtomicBoolean j = new AtomicBoolean();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            o0.g.post(runnable);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("MonitoringHandlerThread");
        handlerThread.start();
        h = new Handler(handlerThread.getLooper());
    }

    public static void a(Runnable runnable) {
        AtomicBoolean atomicBoolean = j;
        if (!atomicBoolean.get()) {
            List list = f;
            synchronized (list) {
                try {
                    if (!atomicBoolean.get()) {
                        list.add(runnable);
                        mi.b("AsyncCommand", "Can't use onAdLoadExecutor - sdk initialize not finished");
                        return;
                    }
                } finally {
                }
            }
        }
        c.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.execute(runnable);
    }

    public static void c(Runnable runnable) {
        a.execute(runnable);
    }

    public static void d(Runnable runnable) {
        d.execute(runnable);
    }

    public static void e(Runnable runnable) {
        i.execute(runnable);
    }

    public static void b() {
        List list = f;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c.execute((Runnable) it.next());
                }
                f.clear();
                j.set(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Runnable runnable, int i2) {
        g.postDelayed(runnable, i2);
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
