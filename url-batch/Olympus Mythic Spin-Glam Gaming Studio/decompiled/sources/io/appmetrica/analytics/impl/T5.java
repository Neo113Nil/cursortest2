package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class T5 implements ActivityLifecycleListener {
    public final /* synthetic */ U5 a;

    public T5(U5 u5) {
        this.a = u5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i = S5.a[activityEvent.ordinal()];
        if (i == 1) {
            this.a.b.resumeSession();
        } else {
            if (i != 2) {
                return;
            }
            this.a.b.pauseSession();
        }
    }
}
