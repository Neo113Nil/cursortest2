package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.LocaleList;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class ad {
    private static double a = -1.0d;

    public static String a() {
        return LocaleList.getDefault().get(0).getLanguage();
    }

    public static String a(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String b() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String b(Context context) {
        int i;
        double d = a;
        double d2 = 0.0d;
        if (d >= 0.0d) {
            i = (int) d;
        } else {
            try {
                Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
                Object newInstance = cls.getConstructor(Context.class).newInstance(context);
                Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
                declaredMethod.setAccessible(true);
                d2 = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
            } catch (Throwable unused) {
            }
            a = d2;
            i = (int) d2;
        }
        return Integer.toString(i);
    }

    public static String c() {
        return "";
    }

    @SuppressLint({"MissingPermission"})
    public static String c(Context context) {
        return "";
    }
}
