package sg.bigo.ads.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class d {
    public static String a(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? "" : applicationInfo.publicSourceDir;
        } catch (Exception unused) {
            return "";
        }
    }

    @SuppressLint({"PrivateApi"})
    public static ArrayList<?> a() {
        try {
            Method method = Class.forName(sg.bigo.ads.a.a.ai).getMethod(sg.bigo.ads.a.a.aj, null);
            method.setAccessible(true);
            Object invoke = method.invoke(null, null);
            if (invoke != null) {
                Field declaredField = invoke.getClass().getDeclaredField(sg.bigo.ads.a.a.ak);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj instanceof ArrayList) {
                    return (ArrayList) obj;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
