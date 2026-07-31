package io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.h;
import io.bidmachine.util.TopActivityHolder;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
abstract class h {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a() {
            try {
                SessionManager.get().pause();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b() {
            try {
                SessionManager.get().resume();
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.h$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.a();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                h.a(activity);
                Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.h$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.b();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            try {
                h.a(activity);
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Context context) {
        if (a.compareAndSet(false, true)) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new b());
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    static Activity a() {
        return TopActivityHolder.INSTANCE.getTopActivity();
    }

    static void a(Activity activity) {
        TopActivityHolder.INSTANCE.setTopActivity(activity);
    }
}
