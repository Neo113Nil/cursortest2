package yads;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class lq {
    public static Method a;

    public static IBinder a(Bundle bundle, String str) {
        if (sb3.a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                a = method2;
                method2.setAccessible(true);
                method = a;
            } catch (NoSuchMethodException e) {
                gh1.c("BundleUtil", gh1.a("Failed to retrieve getIBinder method", e));
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            gh1.c("BundleUtil", gh1.a("Failed to invoke getIBinder via reflection", e2));
            return null;
        }
    }
}
