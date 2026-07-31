package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* loaded from: classes6.dex */
public final class Bc extends AbstractC5577oo {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(@NonNull InterfaceC5564ob interfaceC5564ob, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC5564ob);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    @NonNull
    public final InterfaceC5617qb a() {
        return this.a.a().a(this.b);
    }
}
