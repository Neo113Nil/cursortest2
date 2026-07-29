package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;
import o.C1576ne;
import o.DY;
import o.ExecutorC2280yJ;
import o.MU;
import o.NU;
import o.RunnableC0139Fg;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, MU mu) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, NU nu) {
        try {
            handleIntent(intent);
        } finally {
            nu.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MU processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return DY.i(null);
        }
        NU nu = new NU();
        this.executor.execute(new RunnableC0139Fg(this, intent, nu, 2));
        return nu.a;
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                    @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                    public MU handle(Intent intent2) {
                        return EnhancedIntentService.this.processIntent(intent2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        MU processIntent = processIntent(startCommandIntent);
        if (processIntent.h()) {
            finishTask(intent);
            return 2;
        }
        processIntent.a(new ExecutorC2280yJ(), new C1576ne(this, 1, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
