package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5866c implements ActivityLifecycleListener {
    public final /* synthetic */ C5867d a;

    public C5866c(C5867d c5867d) {
        this.a = c5867d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i = AbstractC5865b.a[activityEvent.ordinal()];
        try {
            if (i == 1) {
                C5873j c5873j = this.a.c;
                if (c5873j == null || !c5873j.a) {
                    return;
                }
                mainExecutor = this.a.a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C5867d.d(this.a));
            } else if (i != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(C5867d.d(this.a));
            }
        } catch (Throwable unused) {
        }
    }
}
