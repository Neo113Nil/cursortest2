package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class th0 extends sp {
    final /* synthetic */ uh0 this$0;

    /* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
    public static final class a extends sp {
        final /* synthetic */ uh0 this$0;

        public a(uh0 uh0Var) {
            this.this$0 = uh0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            uh0 uh0Var = this.this$0;
            int i = uh0Var.d + 1;
            uh0Var.d = i;
            if (i == 1 && uh0Var.g) {
                uh0Var.i.e(e20.ON_START);
                uh0Var.g = false;
            }
        }
    }

    public th0(uh0 uh0Var) {
        this.this$0 = uh0Var;
    }

    @Override // defpackage.sp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = nk0.e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((nk0) findFragmentByTag).d = this.this$0.k;
        }
    }

    @Override // defpackage.sp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        uh0 uh0Var = this.this$0;
        int i = uh0Var.e - 1;
        uh0Var.e = i;
        if (i == 0) {
            Handler handler = uh0Var.h;
            handler.getClass();
            handler.postDelayed(uh0Var.j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        zi.i(activity, new a(this.this$0));
    }

    @Override // defpackage.sp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        uh0 uh0Var = this.this$0;
        int i = uh0Var.d - 1;
        uh0Var.d = i;
        if (i == 0 && uh0Var.f) {
            uh0Var.i.e(e20.ON_STOP);
            uh0Var.g = true;
        }
    }
}
