package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4075a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4077c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4078e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4079f = false;

    public C0351a(Activity activity) {
        this.f4076b = activity;
        this.f4077c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4076b == activity) {
            this.f4076b = null;
            this.f4078e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4078e || this.f4079f || this.d) {
            return;
        }
        Object obj = this.f4075a;
        try {
            Object obj2 = AbstractC0352b.f4082c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4077c) {
                AbstractC0352b.f4085g.postAtFrontOfQueue(new H.a(AbstractC0352b.f4081b.get(activity), 8, obj2));
                this.f4079f = true;
                this.f4075a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
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
        if (this.f4076b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
