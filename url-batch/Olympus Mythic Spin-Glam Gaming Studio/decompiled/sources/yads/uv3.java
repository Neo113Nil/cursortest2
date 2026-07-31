package yads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes5.dex */
public class uv3 implements Application.ActivityLifecycleCallbacks {
    public boolean a;
    public boolean b;
    public sv3 c;

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(boolean z) {
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        boolean z = true;
        this.a = true;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !a()) {
            z = false;
        }
        this.b = z;
        a(z);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.b) {
            this.b = true;
            if (this.a) {
                a(true);
                sv3 sv3Var = this.c;
                if (sv3Var != null) {
                    sv3Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = runningAppProcessInfo.importance == 100 || a();
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                a(z);
                sv3 sv3Var = this.c;
                if (sv3Var != null) {
                    sv3Var.a(z);
                }
            }
        }
    }
}
