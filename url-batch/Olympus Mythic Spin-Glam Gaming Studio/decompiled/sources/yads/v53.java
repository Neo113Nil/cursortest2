package yads;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public abstract class v53 {
    public static Object a(Callable callable, Object obj, String str, String str2) {
        if (obj == null) {
            boolean z = ob1.a;
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            boolean z2 = ob1.a;
            return null;
        }
    }
}
