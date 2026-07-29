package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.MU;
import o.NU;
import o.Y1;

/* loaded from: classes.dex */
class WithinAppServiceConnection implements ServiceConnection {
    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<BindRequest> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    public static class BindRequest {
        final Intent intent;
        private final NU taskCompletionSource = new NU();

        public BindRequest(Intent intent) {
            this.intent = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$arrangeTimeout$0() {
            Log.w(Constants.TAG, "Service took too long to process intent: " + this.intent.getAction() + " finishing.");
            finish();
        }

        public void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
            getTask().a(scheduledExecutorService, new c(4, scheduledExecutorService.schedule(new i(1, this), 20L, TimeUnit.SECONDS)));
        }

        public void finish() {
            this.taskCompletionSource.d(null);
        }

        public MU getTask() {
            return this.taskCompletionSource.a;
        }
    }

    public WithinAppServiceConnection(Context context, String str) {
        this(context, str, createScheduledThreadPoolExecutor());
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor createScheduledThreadPoolExecutor() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    private synchronized void flushQueue() {
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "flush queue called");
            }
            while (!this.intentQueue.isEmpty()) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "found intent to be delivered");
                }
                WithinAppServiceBinder withinAppServiceBinder = this.binder;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    startConnectionIfNeeded();
                    return;
                }
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "binder is alive, sending the intent.");
                }
                this.binder.send(this.intentQueue.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void startConnectionIfNeeded() {
        WithinAppServiceConnection withinAppServiceConnection;
        Y1 Z;
        Context context;
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.connectionInProgress);
            Log.d(Constants.TAG, sb.toString());
        }
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        try {
            Z = Y1.Z();
            context = this.context;
            withinAppServiceConnection = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e(Constants.TAG, "Exception while binding the service", e);
                withinAppServiceConnection.connectionInProgress = false;
                finishAllInQueue();
            }
        } catch (SecurityException e2) {
            e = e2;
            withinAppServiceConnection = this;
        }
        if (Z.j0(context, context.getClass().getName(), this.connectionIntent, withinAppServiceConnection, 65, null)) {
            return;
        }
        Log.e(Constants.TAG, "binding to the service failed");
        withinAppServiceConnection.connectionInProgress = false;
        finishAllInQueue();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "onServiceConnected: " + componentName);
            }
            this.connectionInProgress = false;
            if (iBinder instanceof WithinAppServiceBinder) {
                this.binder = (WithinAppServiceBinder) iBinder;
                flushQueue();
            } else {
                Log.e(Constants.TAG, "Invalid service connection: " + iBinder);
                finishAllInQueue();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "onServiceDisconnected: " + componentName);
        }
        flushQueue();
    }

    public synchronized MU sendIntent(Intent intent) {
        BindRequest bindRequest;
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "new intent queued in the bind-strategy delivery");
            }
            bindRequest = new BindRequest(intent);
            bindRequest.arrangeTimeout(this.scheduledExecutorService);
            this.intentQueue.add(bindRequest);
            flushQueue();
        } catch (Throwable th) {
            throw th;
        }
        return bindRequest.getTask();
    }

    public WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new Intent(str).setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService;
    }
}
