package com.my.target;

import android.util.Log;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class mi {
    public static boolean a;

    public static void a(String str) {
        b(null, str);
    }

    public static void b(String str, String str2) {
        if (a) {
            Log.d("[myTarget]", a(str, str2));
        }
    }

    public static void c(String str, String str2) {
        if (a) {
            Log.e("[myTarget]", a(str, str2));
        }
    }

    public static void d(String str) {
        e(null, str);
    }

    public static void e(String str, String str2) {
        if (a) {
            Log.w("[myTarget]", a(str, str2));
        }
    }

    private static String a(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str + ": ";
        }
        sb.append(str3);
        if (str2 == null) {
            str2 = "<empty log>";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void d(String str, String str2) {
        if (a && Log.isLoggable("[myTarget]", 4)) {
            Log.i("[myTarget]", a(str, str2));
        }
    }

    public static void b(String str) {
        c(null, str);
    }

    public static void c(String str) {
        d(null, str);
    }
}
