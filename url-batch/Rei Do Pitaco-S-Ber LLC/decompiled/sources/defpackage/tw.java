package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tw extends rh {
    final /* synthetic */ uw this$0;

    /* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
    public static final class a extends rh {
        final /* synthetic */ uw this$0;

        public a(uw uwVar) {
            this.this$0 = uwVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            uw uwVar = this.this$0;
            int i = uwVar.f + 1;
            uwVar.f = i;
            if (i == 1 && uwVar.i) {
                uwVar.k.d(fp.ON_START);
                uwVar.i = false;
            }
        }
    }

    public tw(uw uwVar) {
        this.this$0 = uwVar;
    }

    @Override // defpackage.rh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = mz.g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((mz) findFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.rh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        uw uwVar = this.this$0;
        int i = uwVar.g - 1;
        uwVar.g = i;
        if (i == 0) {
            Handler handler = uwVar.j;
            handler.getClass();
            handler.postDelayed(uwVar.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        sw.a(activity, new a(this.this$0));
    }

    @Override // defpackage.rh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        uw uwVar = this.this$0;
        int i = uwVar.f - 1;
        uwVar.f = i;
        if (i == 0 && uwVar.h) {
            uwVar.k.d(fp.ON_STOP);
            uwVar.i = true;
        }
    }
}
