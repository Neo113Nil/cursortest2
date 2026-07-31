package net.pubnative.lite.sdk.analytics;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTracker;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTrackerCallback;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes6.dex */
public class ReportingController {
    private static final String TAG = "ReportingController";
    private List<ReportingEvent> adEventList;
    private List<ReportingTracker> adFiredTrackers;
    private final List<ReportingEventCallback> mListeners = new ArrayList();
    private final List<ReportingTrackerCallback> mTrackerListeners = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportEvent$0(ReportingEvent reportingEvent) {
        ReportingEventCallback reportingEventCallback;
        for (int i = 0; i < this.mListeners.size(); i++) {
            try {
                if (i < this.mListeners.size() && (reportingEventCallback = this.mListeners.get(i)) != null) {
                    reportingEventCallback.onEvent(reportingEvent);
                }
            } catch (Exception e) {
                Logger.d("exception - " + ReportingController.class.getSimpleName(), e.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportFiredTracker$1(ReportingTracker reportingTracker) {
        ReportingTrackerCallback reportingTrackerCallback;
        for (int i = 0; i < this.mTrackerListeners.size(); i++) {
            try {
                if (i < this.mTrackerListeners.size() && (reportingTrackerCallback = this.mTrackerListeners.get(i)) != null) {
                    reportingTrackerCallback.onFire(reportingTracker);
                }
            } catch (Exception e) {
                Logger.d("exception - " + ReportingController.class.getSimpleName(), e.toString());
            }
        }
    }

    public void addCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            if (reportingEventCallback != null) {
                try {
                    if (!this.mListeners.contains(reportingEventCallback)) {
                        this.mListeners.add(reportingEventCallback);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addTrackerCallback(ReportingTrackerCallback reportingTrackerCallback) {
        synchronized (this) {
            if (reportingTrackerCallback != null) {
                try {
                    if (!this.mTrackerListeners.contains(reportingTrackerCallback)) {
                        this.mTrackerListeners.add(reportingTrackerCallback);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void cacheAdEventList(List<ReportingEvent> list) {
        this.adEventList = list;
    }

    public void clearAdEventList() {
        List<ReportingEvent> list = this.adEventList;
        if (list != null) {
            list.clear();
        }
    }

    public void clearFiredTrackerstList() {
        List<ReportingTracker> list = this.adFiredTrackers;
        if (list != null) {
            list.clear();
        }
    }

    public List<ReportingEvent> getAdEventList() {
        return this.adEventList;
    }

    public List<ReportingTracker> getFiredTrackersList() {
        return this.adFiredTrackers;
    }

    public boolean removeCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            try {
                if (reportingEventCallback == null) {
                    return false;
                }
                int indexOf = this.mListeners.indexOf(reportingEventCallback);
                if (indexOf == -1) {
                    return false;
                }
                this.mListeners.remove(indexOf);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean removeTrackerCallback(ReportingTrackerCallback reportingTrackerCallback) {
        synchronized (this) {
            try {
                if (reportingTrackerCallback == null) {
                    return false;
                }
                int indexOf = this.mTrackerListeners.indexOf(reportingTrackerCallback);
                if (indexOf == -1) {
                    return false;
                }
                this.mTrackerListeners.remove(indexOf);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void reportEvent(final ReportingEvent reportingEvent) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.analytics.ReportingController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.this.lambda$reportEvent$0(reportingEvent);
            }
        });
    }

    public synchronized void reportFiredTracker(final ReportingTracker reportingTracker) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.analytics.ReportingController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.this.lambda$reportFiredTracker$1(reportingTracker);
            }
        });
    }
}
