package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4654a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4655b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4656c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4657e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4658f = false;

    public C0383a(Activity activity) {
        this.f4655b = activity;
        this.f4656c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4655b == activity) {
            this.f4655b = null;
            this.f4657e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4657e || this.f4658f || this.d) {
            return;
        }
        Object obj = this.f4654a;
        try {
            Object obj2 = AbstractC0384b.f4661c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4656c) {
                AbstractC0384b.f4664g.postAtFrontOfQueue(new H.a(AbstractC0384b.f4660b.get(activity), 6, obj2));
                this.f4658f = true;
                this.f4654a = null;
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
        if (this.f4655b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
