package com.mobilefuse.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.ironsource.Zf;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.utils.LongExtensionsKt;

/* loaded from: classes4.dex */
public class AdmCacheMonitor {
    private static int NEXT_ID = 1;
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private AdController adController;
    private Runnable currentAdExpirationTask;
    private boolean currentAdmExpired;
    private Handler handler;
    private int id;
    private Listener listener;
    private Runnable loadNewAdTask;
    private long loadedNewAdTimestamp;
    private AdController newAdController;
    private AdController.AdListener newAdControllerListener;
    private long startedMonitorTimestamp;
    private final String logPrefix = "[AdmCacheMonitor] ";
    private LoadState loadState = LoadState.IDLE;
    private MonitorState monitorState = MonitorState.IDLE;
    private int currentLoadAttempt = 0;
    private long expirationLimitMillis = LocationService.locationValidTime;

    public interface Listener {
        void onAdExpired(float f) throws Throwable;

        void onAdmCacheExpired() throws Throwable;

        void onNewAdFullyLoaded(AdController adController) throws Throwable;

        void onNewAdLoadFailed() throws Throwable;

        void onNewAdRequested() throws Throwable;
    }

    private enum LoadState {
        IDLE,
        LOADING,
        LOADED,
        FAILED
    }

    private enum MonitorState {
        IDLE,
        RUNNING,
        PAUSED,
        DESTROYED
    }

    public AdmCacheMonitor(AdController adController, @NonNull Listener listener) throws Throwable {
        this.id = 0;
        this.adController = adController;
        this.listener = listener;
        int i = NEXT_ID;
        NEXT_ID = i + 1;
        this.id = i;
        logDebug("-- CREATED");
        this.handler = new Handler(Looper.getMainLooper());
        this.activityLifecycleObserver = createActivityLifecycleObserver();
        this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.AdmCacheMonitor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdmCacheMonitor.this.lambda$new$0();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        try {
            AppLifecycleHelper.addActivityLifecycleObserver(this.activityLifecycleObserver);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public void startMonitor(int i) throws Throwable {
        if (this.monitorState != MonitorState.IDLE) {
            return;
        }
        long j = i * 1000;
        this.expirationLimitMillis = j;
        if (j < 20000) {
            this.expirationLimitMillis = 20000L;
        }
        logDebug("startMonitor");
        if (this.loadNewAdTask == null) {
            this.loadNewAdTask = new Runnable() { // from class: com.mobilefuse.sdk.AdmCacheMonitor$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AdmCacheMonitor.this.lambda$startMonitor$1();
                }
            };
        }
        if (this.currentAdExpirationTask == null) {
            this.currentAdExpirationTask = new Runnable() { // from class: com.mobilefuse.sdk.AdmCacheMonitor$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AdmCacheMonitor.this.lambda$startMonitor$2();
                }
            };
        }
        this.startedMonitorTimestamp = System.currentTimeMillis();
        if (AppLifecycleHelper.isActivityInForeground(this.adController.getRenderingActivity())) {
            this.monitorState = MonitorState.RUNNING;
            startAdmExpirationTimer(this.expirationLimitMillis);
            startLoadNewAdTimer(this.expirationLimitMillis - 15000);
        } else {
            logDebug("activity is not in foreground, pause monitor.");
            this.monitorState = MonitorState.PAUSED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMonitor$1() {
        try {
            loadNewAd();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMonitor$2() {
        try {
            onCurrentAdmCacheExpired();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public void cancelMonitor() throws Throwable {
        logDebug("cancelMonitor");
        AppLifecycleHelper.removeActivityLifecycleObserver(this.activityLifecycleObserver);
        this.startedMonitorTimestamp = 0L;
        cancelLoadNewAdTimer();
        cancelAdmExpirationTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseMonitor() throws Throwable {
        if (this.monitorState != MonitorState.RUNNING) {
            return;
        }
        this.monitorState = MonitorState.PAUSED;
        logDebug("pauseMonitor");
        cancelLoadNewAdTimer();
        cancelAdmExpirationTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeMonitor() throws Throwable {
        LoadState loadState;
        LoadState loadState2;
        logDebug("resumeMonitor");
        if (this.monitorState != MonitorState.PAUSED || (loadState = this.loadState) == (loadState2 = LoadState.FAILED) || loadState == LoadState.LOADED) {
            return;
        }
        if (this.startedMonitorTimestamp == 0) {
            logDebug("can't resume monitor. was not started earlier.");
            return;
        }
        AdController adController = this.newAdController;
        if (adController != null && adController.adState == AdController.AdState.LOADED) {
            logDebug("New Ad was loaded in the meantime in background. Don't resume timers and dispatch ad readiness.");
            if (System.currentTimeMillis() - this.loadedNewAdTimestamp < this.expirationLimitMillis) {
                logDebug("new Ad Controller still has valid ADM cache. Update AdController with it.");
                onNewAdLoaded();
                return;
            } else {
                logDebug("new Ad Controller doesn't have valid ADM cache. Report Ad Expiration.");
                this.loadState = loadState2;
                expireCurrentAd();
                return;
            }
        }
        MonitorState monitorState = MonitorState.RUNNING;
        this.monitorState = monitorState;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.expirationLimitMillis;
        long j2 = this.startedMonitorTimestamp;
        long j3 = j - (currentTimeMillis - j2);
        long j4 = (j - 15000) - (currentTimeMillis - j2);
        if (j3 > 0) {
            this.monitorState = monitorState;
            startAdmExpirationTimer(j3);
        } else {
            this.currentAdExpirationTask.run();
        }
        if (MobileFuseSettings.isExpiredAdReloading()) {
            if (j4 > 0) {
                this.monitorState = monitorState;
                startLoadNewAdTimer(j4);
            } else {
                this.loadNewAdTask.run();
            }
        }
    }

    private void cancelLoadNewAdTimer() throws Throwable {
        logDebug("cancelLoadNewAdTimer");
        this.handler.removeCallbacks(this.loadNewAdTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAdmExpirationTimer() throws Throwable {
        logDebug("cancelAdmExpirationTimer");
        this.handler.removeCallbacks(this.currentAdExpirationTask);
    }

    private void startLoadNewAdTimer(long j) throws Throwable {
        if (MobileFuseSettings.isExpiredAdReloading()) {
            logDebug("startLoadNewAdTimer [delay: " + j + X3.j.e);
            this.handler.postDelayed(this.loadNewAdTask, j);
        }
    }

    private void startAdmExpirationTimer(long j) throws Throwable {
        logDebug("startAdmExpirationTimer [delay: " + j + X3.j.e);
        this.handler.postDelayed(this.currentAdExpirationTask, j);
    }

    private void onCurrentAdmCacheExpired() throws Throwable {
        logDebug("onCurrentAdmCacheExpired");
        this.currentAdmExpired = true;
        this.listener.onAdmCacheExpired();
        if (!MobileFuseSettings.isExpiredAdReloading()) {
            logDebug("The auto ADM cache reloading is disabled. Dispatch ad expiration signal. Call the MobileFuseSettings.setExpiredAdReloading(true) to enable the The auto ADM cache reloading. ");
            this.loadState = LoadState.FAILED;
        }
        if (this.loadState == LoadState.FAILED) {
            expireCurrentAd();
        }
    }

    private void loadNewAd() throws Throwable {
        logDebug("loadNewAd");
        if (!MobileFuseSettings.isExpiredAdReloading()) {
            logDebug("The auto ADM cache reloading is disabled. Can't load new ad. Call the MobileFuseSettings.setExpiredAdReloading(true) to enable the The auto ADM cache reloading. ");
            return;
        }
        this.loadState = LoadState.LOADING;
        if (this.newAdController == null) {
            AdController.AdListener createNewAdControllerListener = createNewAdControllerListener();
            this.newAdControllerListener = createNewAdControllerListener;
            this.newAdController = this.adController.newInstance(createNewAdControllerListener);
        }
        tryToLoadNextAd();
    }

    private void tryToLoadNextAd() throws Throwable {
        this.currentLoadAttempt++;
        logDebug("tryToLoadNextAd [attempt: " + this.currentLoadAttempt + X3.j.e);
        this.listener.onNewAdRequested();
        this.newAdController.loadAd();
    }

    private void expireCurrentAd() throws Throwable {
        logDebug("expireCurrentAd");
        this.listener.onAdExpired(LongExtensionsKt.millisecondsToSeconds(this.expirationLimitMillis));
    }

    private AppLifecycleHelper.ActivityLifecycleObserver createActivityLifecycleObserver() {
        return new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.AdmCacheMonitor.1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onActivityResumed(@NonNull Activity activity) {
                try {
                    if (AdmCacheMonitor.this.adController == null) {
                        return;
                    }
                    if (AdmCacheMonitor.this.adController.getRenderingActivity() == activity || AdmCacheMonitor.this.adController.getRenderingActivity() == null) {
                        AdmCacheMonitor.this.resumeMonitor();
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
            }

            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onActivityPaused(@NonNull Activity activity) {
                try {
                    if (AdmCacheMonitor.this.adController == null) {
                        return;
                    }
                    if (AppLifecycleHelper.getCurrentActivity() == null || AdmCacheMonitor.this.adController.getRenderingActivity() == activity) {
                        AdmCacheMonitor.this.pauseMonitor();
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
            }
        };
    }

    private AdController.AdListener createNewAdControllerListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.AdmCacheMonitor.2
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(String str) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(AdController adController) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float f) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean z) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() throws Throwable {
                AdmCacheMonitor.this.logDebug(Zf.j);
                AdmCacheMonitor.this.loadedNewAdTimestamp = System.currentTimeMillis();
                if (AdmCacheMonitor.this.monitorState == MonitorState.PAUSED) {
                    return;
                }
                AdmCacheMonitor.this.cancelAdmExpirationTimer();
                AdmCacheMonitor.this.onNewAdLoaded();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int i) throws Throwable {
                AdmCacheMonitor.this.logDebug("onAdNotFilled [reason: " + i + X3.j.e);
                AdmCacheMonitor.this.onNewAdLoadFailed(i);
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(AdError adError) throws Throwable {
                AdmCacheMonitor.this.logDebug(TelemetryAdLifecycleEvent.AD_ERROR);
                AdmCacheMonitor.this.onNewAdLoadFailed(2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAdLoaded() throws Throwable {
        logDebug("onNewAdLoaded");
        this.loadState = LoadState.LOADED;
        AdController adController = this.newAdController;
        this.newAdController = null;
        this.newAdControllerListener = null;
        this.listener.onNewAdFullyLoaded(adController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAdLoadFailed(int i) throws Throwable {
        logDebug("onNewAdLoadFailed [reason: " + i + X3.j.e);
        if (this.loadState != LoadState.LOADING) {
            return;
        }
        this.listener.onNewAdLoadFailed();
        if (i != 1 && this.currentLoadAttempt != 2) {
            tryToLoadNextAd();
            return;
        }
        this.loadState = LoadState.FAILED;
        if (this.currentAdmExpired) {
            expireCurrentAd();
        }
    }

    public void destroy() throws Throwable {
        MonitorState monitorState = this.monitorState;
        MonitorState monitorState2 = MonitorState.DESTROYED;
        if (monitorState == monitorState2) {
            return;
        }
        cancelMonitor();
        logDebug("destroy");
        this.monitorState = monitorState2;
        AdController adController = this.newAdController;
        if (adController != null) {
            adController.destroy();
            this.newAdControllerListener = null;
        }
        this.adController = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logDebug(String str) {
        MobileFuse.logDebug("[AdmCacheMonitor] " + this.id + "::" + str);
    }
}
