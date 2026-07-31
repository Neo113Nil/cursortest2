package sg.bigo.ads.c;

import android.annotation.SuppressLint;
import java.lang.reflect.Method;

@SuppressLint({"PrivateApi"})
/* loaded from: classes15.dex */
public final class e {
    private static Method a;
    private static Method b;

    static {
        try {
            Class<?> cls = Class.forName(sg.bigo.ads.a.a.aq);
            String str = sg.bigo.ads.a.a.ar;
            a = cls.getMethod(str, String.class);
            b = cls.getMethod(str, String.class, String.class);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        try {
            Method method = a;
            return method != null ? (String) method.invoke(null, str) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str, String str2) {
        try {
            Method method = b;
            if (method != null) {
                return (String) method.invoke(null, str, str2);
            }
        } catch (Throwable unused) {
        }
        return str2;
    }
}
