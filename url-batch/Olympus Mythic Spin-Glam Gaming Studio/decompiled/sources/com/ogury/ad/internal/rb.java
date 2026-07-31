package com.ogury.ad.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Process;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class rb {
    public static final boolean a(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) systemService).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    str = next.processName;
                    break;
                }
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str2 = applicationInfo != null ? applicationInfo.processName : null;
            if (str == null) {
                return true;
            }
            return Intrinsics.areEqual(str, str2);
        } catch (Exception unused) {
            return true;
        }
    }
}
