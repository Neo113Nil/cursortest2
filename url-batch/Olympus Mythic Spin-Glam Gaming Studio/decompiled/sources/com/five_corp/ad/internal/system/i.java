package com.five_corp.ad.internal.system;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes5.dex */
public abstract class i {
    public static PackageInfo a(Context context, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.getPackageInfo(str, 128);
        }
        of = PackageManager.PackageInfoFlags.of(128L);
        packageInfo = packageManager.getPackageInfo(str, of);
        return packageInfo;
    }
}
