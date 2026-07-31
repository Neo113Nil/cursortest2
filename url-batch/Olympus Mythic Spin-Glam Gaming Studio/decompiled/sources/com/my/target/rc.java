package com.my.target;

import android.app.Application;
import android.content.Context;
import com.my.tracker.MyTracker;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class rc {
    private static boolean a;

    public static void a(Context context) {
        if (a) {
            return;
        }
        try {
            String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
            if (str != null) {
                MyTracker.initTracker(str, (Application) context.getApplicationContext());
            } else {
                mi.a("MyTrackerUtils: myTracker SDK key is not provided");
            }
        } catch (Throwable th) {
            mi.a("MyTrackerUtils: Unable to initialize myTracker - " + th.getMessage());
        }
        a = true;
    }
}
