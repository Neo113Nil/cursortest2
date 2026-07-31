package com.mobilefuse.sdk.internal;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.internal.IntervalTaskRunner;

/* loaded from: classes13.dex */
public class IntervalTaskRunner {
    private boolean active;
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private boolean completed;
    private Listener listener;
    private boolean loop;
    private boolean paused;
    private long refreshDelayMilli;
    private long startedTimestamp;

    @NonNull
    private final Handler handler = Utils.getHandler();
    private boolean enabled = true;
    private boolean runInBackground = false;
    private Runnable intervalTask = new Runnable() { // from class: com.mobilefuse.sdk.internal.IntervalTaskRunner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            IntervalTaskRunner.this.lambda$new$0();
        }
    };

    public interface Listener {
        void onTaskRun() throws Throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        try {
            this.active = false;
            this.completed = true;
            this.startedTimestamp = 0L;
            Listener listener = this.listener;
            if (listener != null) {
                listener.onTaskRun();
            }
            reset();
            if (this.loop) {
                start();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public IntervalTaskRunner(long j, boolean z, Listener listener) throws Throwable {
        this.refreshDelayMilli = j;
        this.listener = listener;
        this.loop = z;
    }

    public void start() throws Throwable {
        if (!this.enabled || this.active) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.refreshDelayMilli;
        if (this.paused) {
            j = Math.max(0L, j - (currentTimeMillis - this.startedTimestamp));
        } else {
            this.startedTimestamp = currentTimeMillis;
        }
        this.active = true;
        this.paused = false;
        if (j > 0) {
            this.handler.postDelayed(this.intervalTask, j);
            if (this.runInBackground) {
                return;
            }
            startActivityLifecycleChecking();
            return;
        }
        this.intervalTask.run();
    }

    public void pause() throws Throwable {
        if (this.enabled && this.active) {
            this.paused = true;
            this.active = false;
            this.handler.removeCallbacks(this.intervalTask);
        }
    }

    public void reset() throws Throwable {
        this.completed = false;
        this.active = false;
        this.paused = false;
        this.startedTimestamp = 0L;
        this.handler.removeCallbacks(this.intervalTask);
        stopActivityLifecycleChecking();
    }

    public long getRefreshDelay() {
        return this.refreshDelayMilli;
    }

    public void setRefreshDelay(long j) throws Throwable {
        this.refreshDelayMilli = j;
        if (this.active) {
            reset();
            start();
        }
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean z) throws Throwable {
        this.enabled = z;
        if (z) {
            return;
        }
        reset();
    }

    public boolean isRunInBackground() {
        return this.runInBackground;
    }

    public void setRunInBackground(boolean z) throws Throwable {
        this.runInBackground = z;
        if (!z) {
            startActivityLifecycleChecking();
        } else {
            stopActivityLifecycleChecking();
        }
    }

    private void startActivityLifecycleChecking() throws Throwable {
        if (this.activityLifecycleObserver != null) {
            return;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.activityLifecycleObserver = anonymousClass1;
        AppLifecycleHelper.addActivityLifecycleObserver(anonymousClass1);
    }

    /* renamed from: com.mobilefuse.sdk.internal.IntervalTaskRunner$1, reason: invalid class name */
    class AnonymousClass1 extends AppLifecycleHelper.ActivityLifecycleObserver {
        AnonymousClass1() {
        }

        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInBackground() {
            IntervalTaskRunner.this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.internal.IntervalTaskRunner$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IntervalTaskRunner.AnonymousClass1.this.lambda$onApplicationInBackground$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onApplicationInBackground$0() {
            try {
                MobileFuse.logDebug("IntervalTaskRunner stopped due to entering background");
                IntervalTaskRunner.this.pause();
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
            }
        }

        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInForeground() {
            IntervalTaskRunner.this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.internal.IntervalTaskRunner$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    IntervalTaskRunner.AnonymousClass1.this.lambda$onApplicationInForeground$1();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onApplicationInForeground$1() {
            try {
                MobileFuse.logDebug("IntervalTaskRunner started due to entering foreground");
                IntervalTaskRunner.this.start();
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
            }
        }
    }

    private void stopActivityLifecycleChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver == null) {
            return;
        }
        AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
        this.activityLifecycleObserver = null;
    }
}
