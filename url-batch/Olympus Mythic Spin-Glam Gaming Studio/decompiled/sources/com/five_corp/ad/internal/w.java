package com.five_corp.ad.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: classes3.dex */
public final class w {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public w(String str, String str2, String str3, String str4, Integer num) {
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.MODEL;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    public static w a(Context context) {
        String str;
        TelephonyManager telephonyManager;
        String str2 = "";
        String str3 = "0";
        Integer num = null;
        try {
            str = context.getPackageName();
            try {
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo a = com.five_corp.ad.internal.system.i.a(context, str);
                    str3 = a.versionName;
                    ApplicationInfo applicationInfo = a.applicationInfo;
                    if (applicationInfo != null) {
                        num = Integer.valueOf(applicationInfo.targetSdkVersion);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", str) == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    str2 = telephonyManager.getSimOperatorName();
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            str = "";
        }
        String str4 = str2;
        String str5 = str3;
        Integer num2 = num;
        String str6 = str;
        String str7 = Build.VERSION.RELEASE;
        String str8 = Build.MODEL;
        return new w(Build.MANUFACTURER, str4, str6, str5, num2);
    }
}
