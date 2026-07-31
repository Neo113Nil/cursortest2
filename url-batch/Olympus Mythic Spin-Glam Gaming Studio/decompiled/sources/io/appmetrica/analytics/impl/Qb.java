package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Qb implements LastKnownLocationExtractorProviderFactory {
    public final Rb a = new Rb();

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.a;
    }
}
