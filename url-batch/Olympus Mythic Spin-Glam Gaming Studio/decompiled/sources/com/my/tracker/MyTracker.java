package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.c1;
import com.my.tracker.obfuscated.c3;
import com.my.tracker.obfuscated.x2;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MyTracker {

    @NonNull
    public static final String VERSION = "3.5.0";
    private static final List a = Collections.synchronizedList(new ArrayList());
    private static volatile c1 b;

    public interface AttributionListener {
        void onReceiveAttribution(@NonNull MyTrackerAttribution myTrackerAttribution);
    }

    public static final class a {
        public static final y2 a;
        static final MyTrackerConfig b;

        static {
            y2 y = y2.y();
            a = y;
            b = MyTrackerConfig.a(y);
        }
    }

    private static void a(int i, boolean z) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i, z);
        }
    }

    @AnyThread
    public static void applyPlugin(@NonNull MyTrackerPluginConfig myTrackerPluginConfig) {
        a.add(myTrackerPluginConfig);
    }

    @AnyThread
    public static void flush() {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a();
        }
    }

    @NonNull
    @WorkerThread
    public static String getInstanceId(@NonNull Context context) {
        return c3.a(context);
    }

    @NonNull
    @AnyThread
    public static MyTrackerConfig getTrackerConfig() {
        return a.b;
    }

    @NonNull
    @AnyThread
    public static MyTrackerParams getTrackerParams() {
        return a.a.m();
    }

    @Nullable
    @AnyThread
    public static String handleDeeplink(@Nullable Intent intent) {
        c1 c1Var = b;
        if (c1Var != null) {
            return c1Var.a(intent);
        }
        x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    @AnyThread
    public static void incrementEventTimeSpent(int i) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i);
        }
    }

    @AnyThread
    public static void initTracker(@NonNull String str, @NonNull Application application) {
        if (TextUtils.isEmpty(str)) {
            x2.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (b != null) {
            x2.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (b != null) {
                    x2.c("MyTracker has already been initialized");
                    return;
                }
                y2 y2Var = a.a;
                ArrayList arrayList = new ArrayList(a);
                c1 a2 = c1.a(str, y2Var, application);
                a2.a(arrayList);
                b = a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @AnyThread
    public static boolean isDebugMode() {
        return x2.a();
    }

    @AnyThread
    public static void onActivityResult(int i, @Nullable Intent intent) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i, intent);
        }
    }

    @AnyThread
    public static void onPurchasesUpdated(int i, @Nullable List<Object> list) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i, list);
        }
    }

    @AnyThread
    public static void setAttributionListener(@Nullable AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    @AnyThread
    public static void setDebugMode(boolean z) {
        x2.a(z);
    }

    @AnyThread
    public static void startAnytimeTimeSpent(int i) {
        a(i, true);
    }

    @AnyThread
    public static void startForegroundTimeSpent(int i) {
        a(i, false);
    }

    @AnyThread
    public static void stopAnytimeTimeSpent(int i) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(i, true);
        }
    }

    @AnyThread
    public static void stopForegroundTimeSpent(int i) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(i, false);
        }
    }

    @AnyThread
    public static void trackAdEvent(@NonNull AdEvent adEvent) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(adEvent);
        }
    }

    @AnyThread
    public static void trackAppGalleryPurchaseEvent(@NonNull Object obj, @NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(obj, str, str2, str3, map);
        }
    }

    @AnyThread
    public static void trackEvent(@NonNull String str, @Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(str, map);
        }
    }

    @AnyThread
    public static void trackInviteEvent(@Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(map);
        }
    }

    @AnyThread
    public static void trackLaunchManually(@NonNull Activity activity) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(activity);
        }
    }

    @AnyThread
    public static void trackLevelEvent(@Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(map);
        }
    }

    @AnyThread
    public static void trackLoginEvent(@NonNull String str, @Nullable String str2, @Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(str, str2, map);
        }
    }

    @AnyThread
    public static void trackMiniAppEvent(@NonNull MiniAppEvent miniAppEvent) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(miniAppEvent);
        }
    }

    @AnyThread
    public static void trackPurchaseEvent(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull String str, @Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(jSONObject, jSONObject2, str, map);
        }
    }

    @AnyThread
    public static void trackRegistrationEvent(@NonNull String str, @Nullable String str2, @Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(str, str2, map);
        }
    }

    @AnyThread
    public static void setAttributionListener(@Nullable AttributionListener attributionListener, @Nullable Handler handler) {
        a.a.a(attributionListener, handler);
    }

    @AnyThread
    public static void trackEvent(@NonNull String str) {
        trackEvent(str, null);
    }

    @AnyThread
    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    @AnyThread
    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    @AnyThread
    public static void trackLoginEvent(@NonNull String str, @Nullable String str2) {
        trackLoginEvent(str, str2, null);
    }

    @AnyThread
    public static void trackPurchaseEvent(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    @AnyThread
    public static void trackRegistrationEvent(@NonNull String str, @Nullable String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    @AnyThread
    public static void trackLevelEvent(int i, @Nullable Map<String, String> map) {
        c1 c1Var = b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i, map);
        }
    }
}
