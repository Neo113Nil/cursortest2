package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5384hc implements InterfaceC5358gc, Bm, LocationProvider {
    public final Context a;
    public final InterfaceC5487lc b;
    public final LocationClient c;
    public final Nl d;
    public final Ok e;
    public final LastKnownLocationExtractorProviderFactory f;
    public final LocationReceiverProviderFactory g;

    public C5384hc(@NotNull Context context, @NotNull InterfaceC5487lc interfaceC5487lc, @NotNull LocationClient locationClient) {
        this.a = context;
        this.b = interfaceC5487lc;
        this.c = locationClient;
        C5618qc c5618qc = new C5618qc();
        this.d = new Nl(new C5844z5(c5618qc, Ka.k().p().getAskForPermissionStrategy()));
        this.e = Ka.k().p();
        ((C5565oc) interfaceC5487lc).a(c5618qc, true);
        ((C5565oc) interfaceC5487lc).a(locationClient, true);
        this.f = locationClient.getLastKnownExtractorProviderFactory();
        this.g = locationClient.getLocationReceiverProviderFactory();
    }

    @NotNull
    public final Nl a() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void b(@NotNull Object obj) {
        ((C5565oc) this.b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return this.c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return this.c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void init() {
        this.c.init(this.a, this.d, Ka.I.d.c(), this.e.d());
        ModuleLocationSourcesServiceController e = this.e.e();
        if (e != null) {
            e.init();
        } else {
            LocationClient locationClient = this.c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C5565oc) this.b).a(this.e.f());
        Ka.I.u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((C5565oc) this.b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Bm
    public final void a(@NotNull C5783wm c5783wm) {
        C5686t3 c5686t3 = c5783wm.x;
        if (c5686t3 != null) {
            long j = c5686t3.a;
            this.c.updateCacheArguments(new CacheArguments(j, 2 * j));
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void a(@NotNull Object obj) {
        ((C5565oc) this.b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void a(boolean z) {
        ((C5565oc) this.b).a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5358gc, io.appmetrica.analytics.impl.InterfaceC5435jc
    public final void a(@Nullable Location location) {
        this.c.updateUserLocation(location);
    }
}
