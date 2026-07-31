package com.ogury.ad.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wg {
    public static final wg a = new wg();

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((context.getApplicationInfo().flags & 2) == 0) {
            return;
        }
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Checking permissions...");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter("android.permission.INTERNET", "permission");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            IntegrationLogger.d(logTag, sourceTag, "[Setup] Permissions checked");
        } else {
            IntegrationLogger.e(logTag, sourceTag, "[Setup] No Internet permission");
        }
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Checking components...");
        Intrinsics.checkNotNull(packageInfo);
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr != null) {
            a(activityInfoArr, "com.ogury.ad.interstitial.ui.InterstitialActivity");
            a(activityInfoArr, "com.ogury.ad.interstitial.ui.InterstitialAndroid8TransparentActivity");
            a(activityInfoArr, "com.ogury.ad.interstitial.ui.InterstitialAndroid8RotableActivity");
        }
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Components checked");
    }

    public static void a(ActivityInfo[] activityInfoArr, String str) {
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (Intrinsics.areEqual(activityInfo.name, str)) {
                return;
            }
        }
        IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Missing activity: " + str);
    }
}
