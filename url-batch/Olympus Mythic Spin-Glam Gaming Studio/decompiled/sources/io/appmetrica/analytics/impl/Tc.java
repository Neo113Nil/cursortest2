package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes9.dex */
public final class Tc extends V2 {
    public Tc(Context context, Wf wf, ReporterConfig reporterConfig, Ji ji, C5382ha c5382ha) {
        this(context, ji, new Sh(wf, new CounterConfiguration(reporterConfig), new W8(new Ll(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), c5382ha, C5661s4.l().n(), new C5447jo(), new Ng(), new N6(), new C5320f0(), new C5309ef(c5382ha));
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[ManualReporter]";
    }

    public Tc(Context context, Ji ji, Sh sh, C5382ha c5382ha, J6 j6, C5447jo c5447jo, Ng ng, N6 n6, C5320f0 c5320f0, C5309ef c5309ef) {
        super(context, ji, sh, c5382ha, j6, c5447jo, ng, n6, c5320f0, c5309ef);
        C5661s4.l().getClass();
    }
}
