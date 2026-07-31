package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5884v implements P {
    public final ClientContext a;
    public final Q b;
    public volatile C5874k c;
    public final W d;

    public C5884v(@NotNull ClientContext clientContext, @NotNull Q q) {
        this.a = clientContext;
        this.b = q;
        this.d = new W(clientContext, new C5881s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(@Nullable C5876m c5876m) {
        this.c = c5876m != null ? c5876m.c : null;
        this.d.c = this.c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new C5883u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
