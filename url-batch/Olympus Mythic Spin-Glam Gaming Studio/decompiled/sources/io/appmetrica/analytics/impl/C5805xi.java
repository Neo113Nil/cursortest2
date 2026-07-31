package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5805xi implements InterfaceC5538nb {
    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb, io.appmetrica.analytics.impl.InterfaceC5564ob
    @NonNull
    public final InterfaceC5538nb a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NonNull
    public final InterfaceC5383hb b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5527n0 c5527n0) {
        return new Sc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NonNull
    public final InterfaceC5512mb b(@NonNull ReporterConfig reporterConfig) {
        return new C5727ui();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NonNull
    public final InterfaceC5383hb a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5527n0 c5527n0) {
        return new Sc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NonNull
    public final InterfaceC5617qb a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C5727ui();
    }
}
