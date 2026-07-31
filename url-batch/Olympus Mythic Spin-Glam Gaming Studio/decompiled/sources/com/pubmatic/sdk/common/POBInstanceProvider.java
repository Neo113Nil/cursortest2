package com.pubmatic.sdk.common;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HurlStack;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.network.POBRequestQueue;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.network.POBVolley;
import com.pubmatic.sdk.common.session.POBAppSessionHandler;
import com.pubmatic.sdk.common.session.POBAppStateMonitor;
import com.pubmatic.sdk.common.session.POBImpDepthHandler;
import com.pubmatic.sdk.common.session.POBImpDepthHandling;
import com.pubmatic.sdk.common.taskhandler.POBMainThreadExecutor;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalytics;

/* loaded from: classes4.dex */
public class POBInstanceProvider {
    private static volatile POBDeviceInfo a;
    private static volatile POBAppInfo b;
    private static volatile POBLocationDetector c;
    private static volatile POBNetworkHandler d;
    private static volatile POBNetworkHandler e;
    private static volatile POBRequestQueue f;
    private static volatile POBSDKConfig g;
    private static volatile POBCacheManager h;
    private static volatile POBTrackerHandler i;
    private static volatile POBNetworkMonitor j;
    private static volatile POBAdViewCacheService k;
    private static volatile POBCrashAnalysing l;
    private static volatile POBAppSessionHandler m;
    private static volatile POBImpDepthHandling n;

    private static POBRequestQueue a() {
        if (f == null) {
            synchronized (POBRequestQueue.class) {
                try {
                    if (f == null) {
                        f = POBVolley.newRequestQueue(new BasicNetwork((BaseHttpStack) new HurlStack()));
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @NonNull
    public static POBAdViewCacheService getAdViewCacheService() {
        if (k == null) {
            synchronized (POBAdViewCacheService.class) {
                try {
                    if (k == null) {
                        k = new POBAdViewCacheService();
                    }
                } finally {
                }
            }
        }
        return k;
    }

    @NonNull
    public static POBAppInfo getAppInfo(@NonNull Context context) {
        if (b == null) {
            synchronized (POBAppInfo.class) {
                try {
                    if (b == null) {
                        b = new POBAppInfo(context);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @NonNull
    public static POBAppSessionHandler getApplicationSessionHandler(@NonNull Application application) {
        if (m == null) {
            synchronized (POBAppSessionHandler.class) {
                try {
                    if (m == null) {
                        m = new POBAppSessionHandler(POBAppStateMonitor.getInstance(application));
                    }
                } finally {
                }
            }
        }
        return m;
    }

    @NonNull
    public static POBCacheManager getCacheManager(@NonNull Context context) {
        if (h == null) {
            synchronized (POBCacheManager.class) {
                try {
                    if (h == null) {
                        h = new POBCacheManager(context, getNetworkHandlerWithMainThreadDelivery());
                    }
                } finally {
                }
            }
        }
        return h;
    }

    @Nullable
    public static synchronized POBCrashAnalysing getCrashAnalytics() {
        POBCrashAnalysing pOBCrashAnalysing;
        synchronized (POBInstanceProvider.class) {
            if (l == null) {
                try {
                    POBCrashAnalytics.Companion companion = POBCrashAnalytics.INSTANCE;
                    l = (POBCrashAnalysing) POBCrashAnalytics.class.newInstance();
                } catch (Exception e2) {
                    POBLog.error("POBInstanceProvider", "Exception caught while initializing CrashAnalytics. Message -> " + e2.getMessage(), new Object[0]);
                }
            }
            pOBCrashAnalysing = l;
        }
        return pOBCrashAnalysing;
    }

    @NonNull
    public static POBDeviceInfo getDeviceInfo(@NonNull Context context) {
        if (a == null) {
            synchronized (POBDeviceInfo.class) {
                try {
                    if (a == null) {
                        a = new POBDeviceInfo(context);
                    }
                } finally {
                }
            }
        }
        return a;
    }

    @NonNull
    public static POBImpDepthHandling getImpDepthHandler(@NonNull POBAppSessionHandler pOBAppSessionHandler) {
        if (n == null) {
            synchronized (POBImpDepthHandler.class) {
                try {
                    if (n == null) {
                        n = new POBImpDepthHandler(pOBAppSessionHandler);
                    }
                } finally {
                }
            }
        }
        return n;
    }

    @NonNull
    public static POBLocationDetector getLocationDetector(@NonNull Context context) {
        if (c == null) {
            synchronized (POBLocationDetector.class) {
                try {
                    if (c == null) {
                        c = new POBLocationDetector(context);
                        c.setLocationUpdateIntervalInMs(getSdkConfig().getLocationDetectionDurationInMillis());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @NonNull
    public static POBNetworkHandler getNetworkHandlerWithBackgroundThreadDelivery() {
        if (e == null) {
            synchronized (POBNetworkHandler.class) {
                try {
                    if (e == null) {
                        e = new POBNetworkHandler(a());
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @NonNull
    public static POBNetworkHandler getNetworkHandlerWithMainThreadDelivery() {
        if (d == null) {
            synchronized (POBNetworkHandler.class) {
                try {
                    if (d == null) {
                        d = new POBNetworkHandler(a(), new POBMainThreadExecutor());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @NonNull
    public static POBNetworkMonitor getNetworkMonitor(@NonNull Context context) {
        if (j == null) {
            synchronized (POBNetworkMonitor.class) {
                try {
                    if (j == null) {
                        j = new POBNetworkMonitor(context);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    @NonNull
    public static POBSDKConfig getSdkConfig() {
        if (g == null) {
            synchronized (POBNetworkHandler.class) {
                try {
                    if (g == null) {
                        g = new POBSDKConfig();
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @NonNull
    public static POBTrackerHandler getTrackerHandler(@NonNull POBNetworkHandler pOBNetworkHandler) {
        if (i == null) {
            synchronized (POBTrackerHandler.class) {
                try {
                    if (i == null) {
                        i = new POBTrackerHandler(pOBNetworkHandler);
                    }
                } finally {
                }
            }
        }
        return i;
    }
}
