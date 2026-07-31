package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class u implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ z a;

    public u(z zVar) {
        this.a = zVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.equals(this.a.d.getContext())) {
            this.a.d.d();
            this.a.d.f();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.equals(this.a.d.getContext())) {
            this.a.d.e();
            this.a.d.f();
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
