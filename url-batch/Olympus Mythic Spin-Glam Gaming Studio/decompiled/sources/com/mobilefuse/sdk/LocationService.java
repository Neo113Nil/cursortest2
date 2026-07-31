package com.mobilefuse.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import com.mobilefuse.sdk.device.LocationData;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LocationService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/LocationService;", "", "()V", "Companion", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"MissingPermission"})
/* loaded from: classes14.dex */
public final class LocationService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enabled = true;

    @Nullable
    private static Location lastLocation = null;
    private static long lastLocationRefreshTimestamp = 0;
    public static final long locationValidTime = 900000;

    /* compiled from: LocationService.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001c\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/mobilefuse/sdk/LocationService$Companion;", "", "()V", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "lastLocation", "Landroid/location/Location;", "getLastLocation", "()Landroid/location/Location;", "setLastLocation", "(Landroid/location/Location;)V", "lastLocationRefreshTimestamp", "", "getLastLocationRefreshTimestamp", "()J", "setLastLocationRefreshTimestamp", "(J)V", "locationValidTime", "getLastKnownLocation", "timeProvider", "Lkotlin/Function0;", "getLastKnownLocationData", "Lcom/mobilefuse/sdk/device/LocationData;", "getLocationFromGpsProvider", "context", "Landroid/content/Context;", "locationManager", "Landroid/location/LocationManager;", "getLocationFromNetworkProvider", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getEnabled() {
            return LocationService.enabled;
        }

        public final void setEnabled(boolean z) {
            LocationService.enabled = z;
            if (LocationService.enabled) {
                return;
            }
            Companion companion = LocationService.INSTANCE;
            companion.setLastLocation(null);
            companion.setLastLocationRefreshTimestamp(0L);
        }

        @Nullable
        public final Location getLastLocation() {
            return LocationService.lastLocation;
        }

        public final void setLastLocation(@Nullable Location location) {
            LocationService.lastLocation = location;
        }

        public final long getLastLocationRefreshTimestamp() {
            return LocationService.lastLocationRefreshTimestamp;
        }

        public final void setLastLocationRefreshTimestamp(long j) {
            LocationService.lastLocationRefreshTimestamp = j;
        }

        public static /* synthetic */ Location getLastKnownLocation$default(Companion companion, Function0 function0, int i, Object obj) throws Throwable {
            if ((i & 1) != 0) {
                function0 = new Function0() { // from class: com.mobilefuse.sdk.LocationService$Companion$getLastKnownLocation$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke, reason: collision with other method in class */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        return Long.valueOf(invoke());
                    }

                    public final long invoke() {
                        return System.currentTimeMillis();
                    }
                };
            }
            return companion.getLastKnownLocation(function0);
        }

        @Nullable
        public final synchronized Location getLastKnownLocation(@NotNull Function0 timeProvider) throws Throwable {
            try {
                Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
                Context globalContext = AppLifecycleHelper.getGlobalContext();
                if (!getEnabled()) {
                    return null;
                }
                if (AppLifecycleHelper.getCurrentActivity() == null) {
                    return null;
                }
                if (!AppLifecycleHelper.isAppInForeground()) {
                    return null;
                }
                long longValue = ((Number) timeProvider.mo4828invoke()).longValue();
                if (longValue - getLastLocationRefreshTimestamp() <= LocationService.locationValidTime) {
                    Location lastLocation = getLastLocation();
                    if (lastLocation != null) {
                        return lastLocation;
                    }
                    throw new IllegalStateException("Last location not available");
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Object systemService = globalContext.getSystemService("location");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
                    }
                    LocationManager locationManager = (LocationManager) systemService;
                    Companion companion = LocationService.INSTANCE;
                    Location locationFromGpsProvider = companion.getLocationFromGpsProvider(globalContext, locationManager);
                    if (locationFromGpsProvider == null) {
                        locationFromGpsProvider = companion.getLocationFromNetworkProvider(globalContext, locationManager);
                    }
                    if (locationFromGpsProvider == null) {
                        return null;
                    }
                    companion.setLastLocation(locationFromGpsProvider);
                    companion.setLastLocationRefreshTimestamp(longValue);
                    return locationFromGpsProvider;
                } catch (Throwable th) {
                    int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Nullable
        public final LocationData getLastKnownLocationData() {
            Either errorResult;
            Location lastKnownLocation$default;
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            Object obj = null;
            try {
                lastKnownLocation$default = getLastKnownLocation$default(LocationService.INSTANCE, null, 1, null);
            } catch (Throwable th) {
                if (TryKt.WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                }
                errorResult = new ErrorResult(th);
            }
            if (lastKnownLocation$default == null) {
                return null;
            }
            Float valueOf = Float.valueOf(lastKnownLocation$default.getAccuracy());
            float floatValue = valueOf.floatValue();
            if (floatValue <= 0.0f || Float.isNaN(floatValue)) {
                valueOf = null;
            }
            Integer valueOf2 = valueOf != null ? Integer.valueOf(MathKt.roundToInt(valueOf.floatValue())) : null;
            Double valueOf3 = Double.valueOf(lastKnownLocation$default.getAltitude());
            errorResult = new SuccessResult(new LocationData(lastKnownLocation$default.getLatitude(), lastKnownLocation$default.getLongitude(), valueOf3.doubleValue() != 0.0d ? valueOf3 : null, valueOf2, (int) Math.max(0L, (SystemClock.elapsedRealtime() - (lastKnownLocation$default.getElapsedRealtimeNanos() / 1000000)) / 1000)));
            if (errorResult instanceof ErrorResult) {
            } else {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = ((SuccessResult) errorResult).getValue();
            }
            return (LocationData) obj;
        }

        private final Location getLocationFromGpsProvider(Context context, LocationManager locationManager) throws Throwable {
            if (Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
                return locationManager.getLastKnownLocation("gps");
            }
            return null;
        }

        private final Location getLocationFromNetworkProvider(Context context, LocationManager locationManager) throws Throwable {
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
            if ((listOf instanceof Collection) && listOf.isEmpty()) {
                return null;
            }
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (Utils.hasManifestPermission(context, (String) it.next())) {
                    return locationManager.getLastKnownLocation("network");
                }
            }
            return null;
        }
    }
}
