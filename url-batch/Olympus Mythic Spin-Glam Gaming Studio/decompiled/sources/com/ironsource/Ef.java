package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes12.dex */
public class Ef extends Thread {
    private static Ef b;
    private a a;

    private class a extends HandlerThread {
        private Handler a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        Handler a() {
            return this.a;
        }

        void b() {
            this.a = new Handler(getLooper());
        }
    }

    private Ef() {
        a aVar = new a(getClass().getSimpleName());
        this.a = aVar;
        aVar.start();
        this.a.b();
    }

    public static synchronized Ef a() {
        Ef ef;
        synchronized (Ef.class) {
            try {
                if (b == null) {
                    b = new Ef();
                }
                ef = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ef;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        Handler a2 = aVar.a();
        if (a2 != null) {
            a2.post(runnable);
        }
    }
}
