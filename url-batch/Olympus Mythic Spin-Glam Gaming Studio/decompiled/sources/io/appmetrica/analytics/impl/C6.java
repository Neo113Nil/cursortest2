package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes6.dex */
public final class C6 {
    public final Ji a;
    public final Sh b;

    public C6(Wf wf, W8 w8, Ji ji, AppMetricaConfig appMetricaConfig) {
        this.a = ji;
        this.b = new Sh(wf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), w8, appMetricaConfig.userProfileID);
    }

    public final Sh a() {
        return this.b;
    }
}
