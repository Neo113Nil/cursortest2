package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4177a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4179c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4180e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4181f = false;

    public C0345a(Activity activity) {
        this.f4178b = activity;
        this.f4179c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4178b == activity) {
            this.f4178b = null;
            this.f4180e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4180e || this.f4181f || this.d) {
            return;
        }
        Object obj = this.f4177a;
        try {
            Object obj2 = AbstractC0346b.f4184c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4179c) {
                AbstractC0346b.f4187g.postAtFrontOfQueue(new H.a(AbstractC0346b.f4183b.get(activity), 5, obj2));
                this.f4181f = true;
                this.f4177a = null;
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
        if (this.f4178b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
