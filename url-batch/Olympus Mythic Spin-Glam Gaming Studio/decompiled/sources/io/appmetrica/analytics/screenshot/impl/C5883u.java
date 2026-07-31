package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5883u implements ActivityLifecycleListener {
    public final /* synthetic */ C5884v a;

    public C5883u(C5884v c5884v) {
        this.a = c5884v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i = AbstractC5882t.a[activityEvent.ordinal()];
        try {
            if (i == 1) {
                C5874k c5874k = this.a.c;
                if (c5874k == null || !c5874k.a) {
                } else {
                    this.a.a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.a.d);
                }
            } else if (i != 2) {
            } else {
                this.a.a.getContext().getContentResolver().unregisterContentObserver(this.a.d);
            }
        } catch (Throwable unused) {
        }
    }
}
