package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class u implements LastKnownLocationExtractor {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final LocationListener c;
    public final String d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.a = context;
        this.b = permissionResolutionStrategy;
        this.c = locationListener;
        this.d = str;
    }

    @NotNull
    public final Context a() {
        return this.a;
    }

    @NotNull
    public final LocationListener b() {
        return this.c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.b.hasNecessaryPermissions(this.a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", "getting last known location for provider " + this.d, "location manager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.location.impl.u$$ExternalSyntheticLambda0
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return u.a(u.this, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.d);
    }
}
