package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class m extends a {
    final /* synthetic */ n this$0;

    public m(n nVar) {
        this.this$0 = nVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e0.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = q.f450b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            e0.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((q) findFragmentByTag).f451a = this.this$0.f449h;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e0.h.e(activity, "activity");
        n nVar = this.this$0;
        int i2 = nVar.f443b - 1;
        nVar.f443b = i2;
        if (i2 == 0) {
            Handler handler = nVar.f446e;
            e0.h.b(handler);
            handler.postDelayed(nVar.f448g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        e0.h.e(activity, "activity");
        k.a(activity, new l(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        e0.h.e(activity, "activity");
        n nVar = this.this$0;
        int i2 = nVar.f442a - 1;
        nVar.f442a = i2;
        if (i2 == 0 && nVar.f444c) {
            nVar.f447f.a(d.ON_STOP);
            nVar.f445d = true;
        }
    }
}
