package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c0 implements ActivityLifecycleListener {
    public final /* synthetic */ d0 a;

    public c0(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i = b0.a[activityEvent.ordinal()];
        try {
            if (i == 1) {
                C5877n c5877n = this.a.e;
                if (c5877n == null || !c5877n.a) {
                    return;
                }
                this.a.d = false;
                d0 d0Var = this.a;
                d0Var.c.postDelayed(d0Var.f, 0L);
            } else if (i != 2) {
            } else {
                this.a.d = true;
            }
        } catch (Throwable unused) {
        }
    }
}
