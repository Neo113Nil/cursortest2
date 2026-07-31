package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5410ic implements InterfaceC5358gc {
    public final Qe a = new Qe();
    public final Qb b = new Qb();
    public final C5669sc c = new C5669sc();

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void a(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void b(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
    }
}
