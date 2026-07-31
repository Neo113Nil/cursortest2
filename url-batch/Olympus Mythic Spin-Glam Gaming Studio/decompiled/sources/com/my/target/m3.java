package com.my.target;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
final class m3 {
    final Application a;
    private a b = null;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a implements Application.ActivityLifecycleCallbacks {
        private final Runnable a;
        private final Runnable b;

        a(Runnable runnable, Runnable runnable2) {
            this.a = runnable;
            this.b = runnable2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            this.a.run();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.b.run();
        }
    }

    m3(Application application) {
        this.a = application;
    }

    synchronized void a(Runnable runnable, Runnable runnable2) {
        if (this.b == null) {
            a aVar = new a(runnable, runnable2);
            this.b = aVar;
            this.a.registerActivityLifecycleCallbacks(aVar);
        }
    }

    synchronized void a() {
        a aVar = this.b;
        if (aVar != null) {
            this.a.unregisterActivityLifecycleCallbacks(aVar);
            this.b = null;
        }
    }
}
