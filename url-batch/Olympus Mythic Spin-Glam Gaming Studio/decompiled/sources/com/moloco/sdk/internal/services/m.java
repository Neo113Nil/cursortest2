package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class m {
    @NotNull
    public static final PackageInfo a(@NotNull Context context) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNull(packageInfo2);
            return packageInfo2;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        Intrinsics.checkNotNull(packageInfo);
        return packageInfo;
    }
}
