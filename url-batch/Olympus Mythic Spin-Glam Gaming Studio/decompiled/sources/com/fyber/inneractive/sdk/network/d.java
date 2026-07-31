package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes11.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f fVar = this.a;
        com.fyber.inneractive.sdk.util.d1 d1Var = fVar.d;
        if (d1Var != null) {
            d1Var.post(new c(fVar, 20150330, 3500L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.util.d1 d1Var = this.a.d;
        if (d1Var != null) {
            d1Var.removeMessages(20150330);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
