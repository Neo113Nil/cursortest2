package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class jg {
    private static Context b;
    public final Context a;

    public jg(Context context) {
        this.a = context;
        b = context;
    }

    public static boolean a(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                    if (networkCapabilities.hasTransport(3)) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            mi.a("SdkAppContext: can't check network state " + th.getMessage());
            return false;
        }
    }

    public static z3 c() {
        Context context = b;
        if (context == null) {
            return null;
        }
        return z3.b(context);
    }

    public boolean b() {
        return a(this.a);
    }

    public static boolean a(String str) {
        PackageManager packageManager;
        Intent launchIntentForPackage;
        List<ResolveInfo> list;
        Context context = b;
        if (context == null || (launchIntentForPackage = (packageManager = context.getPackageManager()).getLaunchIntentForPackage(str)) == null) {
            return false;
        }
        try {
            list = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        } catch (Throwable unused) {
            list = null;
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    public ve a() {
        return ve.a(this.a);
    }
}
