package org.chromium.base;

import android.app.Activity;
import androidx.annotation.AnyThread;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ApplicationStatus {
    private static Activity sActivity;
    private static ObserverList sApplicationStateListeners;
    private static ApplicationStateListener sNativeApplicationStateListener;
    private static final Map sActivityInfo = Collections.synchronizedMap(new HashMap());
    public static final Map sActivityTaskId = Collections.synchronizedMap(new HashMap());
    private static int sCurrentApplicationState = 0;

    public interface ApplicationStateListener {
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (sActivityInfo) {
            z = sCurrentApplicationState != 0;
        }
        return z;
    }

    public static Activity getLastTrackedFocusedActivity() {
        return sActivity;
    }

    public static List getRunningActivities() {
        ArrayList arrayList;
        Map map = sActivityInfo;
        synchronized (map) {
            arrayList = new ArrayList(map.keySet());
        }
        return arrayList;
    }

    @CalledByNative
    @AnyThread
    public static int getStateForApplication() {
        int i;
        synchronized (sActivityInfo) {
            i = sCurrentApplicationState;
        }
        return i;
    }

    @CalledByNative
    @AnyThread
    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    public static void registerApplicationStateListener(ApplicationStateListener applicationStateListener) {
        if (sApplicationStateListeners == null) {
            sApplicationStateListeners = new ObserverList();
        }
        sApplicationStateListeners.addObserver(applicationStateListener);
    }

    public static void unregisterApplicationStateListener(ApplicationStateListener applicationStateListener) {
        ObserverList observerList = sApplicationStateListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(applicationStateListener);
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: org.chromium.base.ApplicationStatus.3
            @Override // java.lang.Runnable
            public void run() {
                if (ApplicationStatus.sNativeApplicationStateListener != null) {
                    return;
                }
                ApplicationStatus.sNativeApplicationStateListener = new ApplicationStateListener() { // from class: org.chromium.base.ApplicationStatus.3.1
                };
                ApplicationStatus.registerApplicationStateListener(ApplicationStatus.sNativeApplicationStateListener);
            }
        });
    }
}
