package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4627ea {
    private static final String a = "_preferences";

    private C4627ea() {
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + a;
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    public static String a(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static String a(Context context, String str, String str2) {
        return a(context, a(context, ""), str, str2);
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        return context == null ? z : context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    static int a(Context context, String str, String str2, int i) {
        return context == null ? i : context.getSharedPreferences(str, 0).getInt(str2, i);
    }

    public static int a(Context context, String str, int i) {
        return a(context, a(context, ""), str, i);
    }
}
