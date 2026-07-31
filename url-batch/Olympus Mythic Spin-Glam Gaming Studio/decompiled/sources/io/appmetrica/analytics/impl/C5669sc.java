package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5669sc implements LocationReceiverProviderFactory {
    public final C5695tc a = new C5695tc();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    @NotNull
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.a;
    }
}
