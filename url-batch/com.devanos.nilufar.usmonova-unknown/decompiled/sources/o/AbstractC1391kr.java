package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: o.kr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1391kr {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object d;
        try {
            d = new C1325jr(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            d = AbstractC1494mO.d(th);
        }
        if (d instanceof C1362kO) {
            d = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
