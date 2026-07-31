package yads;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jj2 {
    public final String a() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, jv1.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
