package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class i1 implements Application.ActivityLifecycleCallbacks {
    public final m1 a;

    public i1(Activity activity) {
        this.a = new m1(activity);
    }

    public final Activity a() {
        Activity activity;
        m1 m1Var = this.a;
        synchronized (m1Var) {
            CollectionsKt.removeAll((List) m1Var.a, (Function1) k1.b);
            WeakReference weakReference = (WeakReference) CollectionsKt.firstOrNull((List) m1Var.a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final Activity b() {
        Activity activity;
        m1 m1Var = this.a;
        synchronized (m1Var) {
            CollectionsKt.removeAll((List) m1Var.a, (Function1) l1.b);
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull(m1Var.a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
