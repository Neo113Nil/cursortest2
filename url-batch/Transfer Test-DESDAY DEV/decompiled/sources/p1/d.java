package p1;

import T.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g1.f;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object s2;
        try {
            s2 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            s2 = e.s(th);
        }
        if (s2 instanceof U0.e) {
            s2 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            f.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
