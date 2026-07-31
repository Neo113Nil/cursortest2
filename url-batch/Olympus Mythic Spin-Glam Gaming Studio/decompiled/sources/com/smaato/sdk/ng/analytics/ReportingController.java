package com.smaato.sdk.ng.analytics;

import android.os.Handler;
import android.os.Looper;
import com.smaato.sdk.ng.analytics.tracker.ReportingTracker;
import com.smaato.sdk.ng.analytics.tracker.ReportingTrackerCallback;
import com.smaato.sdk.ng.utils.Logger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ReportingController {
    private List<ReportingEvent> b;
    private List<ReportingTracker> d;
    private final List<ReportingEventCallback> a = new ArrayList();
    private final List<ReportingTrackerCallback> c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ReportingEvent reportingEvent) {
        ReportingEventCallback reportingEventCallback;
        for (int i = 0; i < this.a.size(); i++) {
            try {
                if (i < this.a.size() && (reportingEventCallback = this.a.get(i)) != null) {
                    reportingEventCallback.onEvent(reportingEvent);
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
                    if (!this.a.contains(reportingEventCallback)) {
                        this.a.add(reportingEventCallback);
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
                    if (!this.c.contains(reportingTrackerCallback)) {
                        this.c.add(reportingTrackerCallback);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void cacheAdEventList(List<ReportingEvent> list) {
        this.b = list;
    }

    public void clearAdEventList() {
        List<ReportingEvent> list = this.b;
        if (list != null) {
            list.clear();
        }
    }

    public void clearFiredTrackerstList() {
        List<ReportingTracker> list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    public List<ReportingEvent> getAdEventList() {
        return this.b;
    }

    public List<ReportingTracker> getFiredTrackersList() {
        return this.d;
    }

    public boolean removeCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            try {
                if (reportingEventCallback == null) {
                    return false;
                }
                int indexOf = this.a.indexOf(reportingEventCallback);
                if (indexOf == -1) {
                    return false;
                }
                this.a.remove(indexOf);
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
                int indexOf = this.c.indexOf(reportingTrackerCallback);
                if (indexOf == -1) {
                    return false;
                }
                this.c.remove(indexOf);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void reportEvent(final ReportingEvent reportingEvent) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.analytics.ReportingController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.this.a(reportingEvent);
            }
        });
    }

    public synchronized void reportFiredTracker(final ReportingTracker reportingTracker) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.analytics.ReportingController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.this.a(reportingTracker);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ReportingTracker reportingTracker) {
        ReportingTrackerCallback reportingTrackerCallback;
        for (int i = 0; i < this.c.size(); i++) {
            try {
                if (i < this.c.size() && (reportingTrackerCallback = this.c.get(i)) != null) {
                    reportingTrackerCallback.onFire(reportingTracker);
                }
            } catch (Exception e) {
                Logger.d("exception - " + ReportingController.class.getSimpleName(), e.toString());
            }
        }
    }
}
