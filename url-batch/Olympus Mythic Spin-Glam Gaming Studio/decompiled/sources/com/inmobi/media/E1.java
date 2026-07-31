package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class E1 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final HashMap e = new HashMap();
    public static final byte f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        PackageManager packageManager;
        long longVersionCode;
        String valueOf;
        byte b2 = 2;
        f = (byte) 2;
        Context context = AbstractC4002fj.a;
        String str = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(context.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            String str2 = applicationInfo.packageName;
            a = str2;
            d = applicationInfo.loadLabel(packageManager).toString();
            Intrinsics.checkNotNull(str2);
            b = packageManager.getInstallerPackageName(str2);
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        if (packageInfo != null && ((str = packageInfo.versionName) == null || str.length() == 0)) {
            if (Build.VERSION.SDK_INT < 28) {
                valueOf = String.valueOf(packageInfo.versionCode);
            } else {
                longVersionCode = packageInfo.getLongVersionCode();
                valueOf = String.valueOf(longVersionCode);
            }
            str = valueOf;
        }
        if (N3.a(str)) {
            c = str;
        }
        try {
            F5.a.getClass();
            b2 = F5.y() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        f = b2;
        a();
    }

    public static void a() {
        String str = a;
        if (str != null) {
            e.put("u-appbid", str);
        }
        String str2 = d;
        if (str2 != null) {
            e.put("u-appdnm", str2);
        }
        String str3 = c;
        if (str3 != null) {
            e.put("u-appver", str3);
        }
        HashMap hashMap = e;
        hashMap.put("u-appsecure", String.valueOf((int) f));
        Intrinsics.checkNotNullExpressionValue("E1", "TAG");
        hashMap.toString();
    }
}
