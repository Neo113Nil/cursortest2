package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class gi {
    public static Object a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            mi.a("SystemUtils: exception when access to application info with key - " + str + ", " + th.getMessage());
            return null;
        }
    }

    public static String b(Throwable th) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                try {
                    th.printStackTrace(printStream);
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    printStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            mi.a(th2.toString());
            return "cannot get stacktrace";
        }
    }

    public static String a(String str) {
        String str2;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            mi.a("SystemUtils: error occurred when getting value for property - " + str + ", " + th.getMessage());
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        mi.a("SystemUtils: value in system properties is null for " + str);
        return null;
    }

    public static String a(Throwable th) {
        return "message=" + th.getMessage() + "\nexception=" + b(th);
    }
}
