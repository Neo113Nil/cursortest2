package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5618qc implements PermissionStrategy, LocationControllerObserver {

    @NotNull
    public static final C5591pc b = new C5591pc();
    public static final List c = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    public volatile boolean a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (c.contains(str)) {
            return !this.a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.a = false;
    }

    @NotNull
    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.a + ", locationPermissions=" + c + ')';
    }
}
