package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class D0 implements Rc {
    public final /* synthetic */ E0 a;
    public final /* synthetic */ AppMetricaConfig b;
    public final /* synthetic */ PublicLogger c;

    public D0(E0 e0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.a = e0;
        this.b = appMetricaConfig;
        this.c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Rc
    @NotNull
    public final Dc a() {
        E0 e0 = this.a;
        C5779wi c5779wi = e0.g;
        AppMetricaConfig appMetricaConfig = this.b;
        PublicLogger publicLogger = this.c;
        V7 v7 = e0.i;
        return c5779wi.b(appMetricaConfig, publicLogger, new C5527n0(v7.j, v7.h));
    }
}
