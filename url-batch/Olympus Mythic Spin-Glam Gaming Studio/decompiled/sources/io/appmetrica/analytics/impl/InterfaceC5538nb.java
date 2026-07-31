package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC5538nb extends InterfaceC5564ob {
    @NonNull
    @WorkerThread
    InterfaceC5383hb a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5527n0 c5527n0);

    @Override // io.appmetrica.analytics.impl.InterfaceC5564ob
    @NonNull
    /* synthetic */ InterfaceC5538nb a();

    @NonNull
    InterfaceC5617qb a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    @WorkerThread
    InterfaceC5383hb b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5527n0 c5527n0);

    @NonNull
    InterfaceC5512mb b(@NonNull ReporterConfig reporterConfig);
}
