package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class d0 implements P {
    public final ClientContext a;
    public final Q b;
    public final Handler c;
    public volatile boolean d;
    public volatile C5877n e;
    public final a0 f = new a0(this);

    public d0(@NotNull ClientContext clientContext, @NotNull Q q) {
        this.a = clientContext;
        this.b = q;
        this.c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(@Nullable C5876m c5876m) {
        this.e = c5876m != null ? c5876m.b : null;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new c0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
