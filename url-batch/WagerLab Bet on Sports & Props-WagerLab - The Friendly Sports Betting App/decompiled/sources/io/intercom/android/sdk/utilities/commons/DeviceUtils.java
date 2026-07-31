package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes8.dex */
public class DeviceUtils {
    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String getAppVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                return packageInfo.versionName;
            }
            return "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static String getAppMinSdkVersionVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.applicationInfo != null) {
                return String.valueOf(packageInfo.applicationInfo.minSdkVersion);
            }
            return "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        return packageName == null ? "" : packageName;
    }
}
