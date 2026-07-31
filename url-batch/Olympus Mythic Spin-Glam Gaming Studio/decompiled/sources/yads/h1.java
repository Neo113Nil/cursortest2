package yads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class h1 {
    public static final h1 a = new h1();
    public static i1 b;

    public static final void a(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        i1 i1Var = new i1(activity);
                        b = i1Var;
                        application.registerActivityLifecycleCallbacks(i1Var);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Activity a() {
        Activity a2;
        synchronized (a) {
            i1 i1Var = b;
            a2 = i1Var != null ? i1Var.a() : null;
        }
        return a2;
    }
}
