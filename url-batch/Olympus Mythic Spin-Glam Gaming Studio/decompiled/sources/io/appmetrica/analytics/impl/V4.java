package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes9.dex */
public final class V4 extends Sh {
    public V4(Wf wf) {
        super(wf, new CounterConfiguration(), new W8(new Ll(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.Sh
    public final boolean f() {
        return true;
    }
}
