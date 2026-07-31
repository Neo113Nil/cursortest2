package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5867d implements P {
    public final ClientContext a;
    public final Q b;
    public volatile C5873j c;
    public final Lazy d = LazyKt.lazy(new C5864a(this));

    public C5867d(@NotNull ClientContext clientContext, @NotNull Q q) {
        this.a = clientContext;
        this.b = q;
    }

    public static final Activity.ScreenCaptureCallback d(C5867d c5867d) {
        return d$$ExternalSyntheticApiModelOutline0.m(c5867d.d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(@Nullable C5876m c5876m) {
        this.c = c5876m != null ? c5876m.a : null;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.a.getActivityLifecycleRegistry().registerListener(new C5866c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
