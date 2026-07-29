package o;

import android.app.Activity;
import android.app.Application;

/* renamed from: o.pJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1687pJ {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0048Bt.n(activity, "activity");
        AbstractC0048Bt.n(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
