package com.pubmatic.sdk.common.utility;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@MainThread
/* loaded from: classes14.dex */
public class POBLooper {
    private static final ScheduledThreadPoolExecutor i = new ScheduledThreadPoolExecutor(1);
    private boolean a;
    private POBNetworkMonitor.POBConnectivityListener b;
    private POBNetworkMonitor c;
    private ScheduledFuture d = null;
    private LooperListener e;
    private boolean f;
    private boolean g;
    private long h;

    @MainThread
    public interface LooperListener {
        void invoke();
    }

    class a extends POBNetworkMonitor.POBConnectivityListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
        public void onNetworkConnectionChanged(boolean z) {
            POBLooper.this.a = z;
            POBLog.debug("POBLooper", "Network connectivity = " + POBLooper.this.a, new Object[0]);
            POBLooper pOBLooper = POBLooper.this;
            pOBLooper.a(pOBLooper.a);
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
        public void onNetworkRegistrationFailed() {
            POBLog.warn("POBLooper", "Network registration failed", new Object[0]);
        }
    }

    class b implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                POBLooper.this.a();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTaskHandler.getInstance().runOnMainThread(new a());
        }
    }

    private void c() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.d = null;
        }
    }

    private void d() {
        POBNetworkMonitor pOBNetworkMonitor;
        POBNetworkMonitor.POBConnectivityListener pOBConnectivityListener = this.b;
        if (pOBConnectivityListener == null || (pOBNetworkMonitor = this.c) == null) {
            return;
        }
        pOBNetworkMonitor.unregisterConnectivityListener(pOBConnectivityListener);
        this.b = null;
    }

    public synchronized void destroy() {
        d();
        c();
        this.f = false;
        this.g = false;
    }

    public synchronized void forcePause() {
        if (this.g) {
            POBLog.verbose("POBLooper", "Skipping pause as already in force-paused state.", new Object[0]);
            return;
        }
        POBLog.verbose("POBLooper", "Applying force-paused state.", new Object[0]);
        this.g = true;
        d();
        pause();
    }

    public synchronized void forceResume() {
        if (!this.g) {
            POBLog.verbose("POBLooper", "Skipping resume as not in force-paused state.", new Object[0]);
            return;
        }
        POBLog.verbose("POBLooper", "Removing force-paused state.", new Object[0]);
        this.g = false;
        b();
        resume();
    }

    public synchronized void loop(long j) {
        this.f = true;
        this.h = j * 1000;
        c();
        if (this.g) {
            POBLog.verbose("POBLooper", "Deferring refresh, expecting resumeAutoRefresh to continue the refresh", new Object[0]);
            return;
        }
        POBLog.verbose("POBLooper", "Refreshing after %s seconds", a(this.h));
        a(this.h);
        b();
    }

    public synchronized void pause() {
        if (!this.f) {
            POBLog.verbose("POBLooper", "Deferring pausing as not yet looped.", new Object[0]);
            return;
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            this.h = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            this.d.cancel(true);
            this.d = null;
            POBLog.verbose("POBLooper", "Pausing refresh at %s seconds", a(this.h));
        }
    }

    public synchronized void resume() {
        if (this.g) {
            POBLog.verbose("POBLooper", "Skipping resume as in force-paused state.", new Object[0]);
        } else if (this.f && this.a) {
            POBLog.verbose("POBLooper", "Resuming refresh from %s seconds", a(this.h));
            a(this.h);
        }
    }

    public void setListener(@Nullable LooperListener looperListener) {
        this.e = looperListener;
    }

    public void setNetworkMonitor(@NonNull POBNetworkMonitor pOBNetworkMonitor) {
        this.c = pOBNetworkMonitor;
        this.a = pOBNetworkMonitor.isNetworkAvailable();
    }

    private synchronized void a(long j) {
        if (this.d == null) {
            this.d = i.schedule(new b(), j, TimeUnit.MILLISECONDS);
        }
    }

    private void b() {
        if (this.b != null || this.c == null) {
            return;
        }
        this.b = new a();
        this.a = this.c.isNetworkAvailable();
        this.c.registerConnectivityListener(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.e != null) {
            this.f = false;
            POBLog.verbose("POBLooper", "Invoking scheduled method", new Object[0]);
            this.e.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            resume();
        } else {
            pause();
        }
    }

    private String a(double d) {
        return String.format(Locale.getDefault(), "%.2f", Double.valueOf(d / 1000.0d));
    }
}
