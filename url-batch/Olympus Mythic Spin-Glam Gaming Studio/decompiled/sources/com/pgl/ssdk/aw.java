package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes13.dex */
public class aw {
    private static SharedPreferences a;

    public static int a(Context context, String str, int i) {
        SharedPreferences a2 = a(context);
        return a2 != null ? a2.getInt(str, i) : i;
    }

    public static long a(Context context, String str, long j) {
        SharedPreferences a2 = a(context);
        return a2 != null ? a2.getLong(str, j) : j;
    }

    public static SharedPreferences a(Context context) {
        if (a == null) {
            a = context.getSharedPreferences("ss_config", 0);
        }
        return a;
    }

    public static String a(Context context, String str) {
        return a(context, str, "");
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences a2 = a(context);
        return a2 != null ? a2.getString(str, str2) : str2;
    }

    public static void b(Context context, String str, int i) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            a2.edit().putInt(str, i).apply();
        }
    }

    public static void b(Context context, String str, long j) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            a2.edit().putLong(str, j).apply();
        }
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            a2.edit().putString(str, str2).apply();
        }
    }
}
