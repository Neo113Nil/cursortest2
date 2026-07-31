package com.my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class db {
    private static final Integer a = 1;
    public static boolean b;

    public static void a(jg jgVar) {
        Context context = jgVar.a;
        if (mi.a || b) {
            return;
        }
        b = true;
        try {
            if (a(context)) {
                mi.a = true;
                mi.a("LoggingUtils: debug mode is enabled by device name");
                return;
            }
            if (a.equals((Integer) gi.a(context, "com.my.target.debugMode", Integer.class))) {
                mi.a = true;
                mi.a("LoggingUtils: debug mode is enabled by manifest metadata");
            } else if (b(context)) {
                mi.a = true;
                mi.a("LoggingUtils: debug mode is enabled by system properties");
            }
        } catch (Throwable unused) {
        }
    }

    static boolean b(Context context) {
        if (String.valueOf(a).equals(gi.a(String.format("%s_mytarget_debug", context.getPackageName())))) {
            mi.a("LoggingUtils: debug data in SystemProperties has been found");
            return true;
        }
        mi.a("LoggingUtils: no debug data in SystemProperties");
        return false;
    }

    static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            mi.b("LoggingUtils: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            mi.b("LoggingUtils: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            mi.b("LoggingUtils: case 2 failure");
            return false;
        }
    }
}
