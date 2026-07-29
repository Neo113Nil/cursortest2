package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class U7 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final U7 l = new U7();
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicBoolean i = new AtomicBoolean();
    public final ArrayList j = new ArrayList();
    public boolean k = false;

    public static void a(Application application) {
        U7 u7 = l;
        synchronized (u7) {
            try {
                if (!u7.k) {
                    application.registerActivityLifecycleCallbacks(u7);
                    application.registerComponentCallbacks(u7);
                    u7.k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z) {
        synchronized (l) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ((T7) it.next()).onBackgroundStateChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.h.compareAndSet(true, false);
        this.i.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.h.compareAndSet(true, false);
        this.i.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.h.compareAndSet(false, true)) {
            this.i.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
