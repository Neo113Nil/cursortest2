package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class A1 extends IAppMetricaService.Stub {
    public final C1 a;

    public A1(@NotNull C1 c1) {
        this.a = c1;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(@NotNull Bundle bundle) {
        this.a.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, @NotNull Bundle bundle) {
        this.a.reportData(i, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(@NotNull Bundle bundle) {
        this.a.resumeUserSession(bundle);
    }
}
