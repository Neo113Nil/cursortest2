package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class o implements LocationReceiverProviderFactory {
    public final q a;

    public o(@NotNull q qVar) {
        this.a = qVar;
    }

    @NotNull
    public final q a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.a;
    }
}
