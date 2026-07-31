package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class I1 {
    public static LinkedHashSet a;

    public static void a(boolean z) {
        LinkedHashSet linkedHashSet;
        if (AbstractC4002fj.a == null || (linkedHashSet = a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C4320rl) it.next()).getClass();
                C4320rl.a(z);
            } catch (Exception e) {
                Intrinsics.checkNotNullExpressionValue("I1", "TAG");
                e.getMessage();
            }
        }
    }

    public static void b(Context context) {
        C4320rl listener = C4479xl.c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (a == null) {
            a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new H1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = a;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("I1", "TAG");
            e.getMessage();
            return false;
        }
    }
}
