package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4521zb implements LocationListener {
    public static final C4521zb a = new C4521zb();
    public static final LocationManager b;
    public static final HandlerThread c;
    public static GoogleApiClient d;
    public static final String e;
    public static boolean f;
    public static final Mutex g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        c = handlerThread;
        e = C4521zb.class.getSimpleName();
        g = MutexKt.Mutex$default(false, 1, null);
        P6.a(handlerThread, "LThread");
        Context context = AbstractC4002fj.a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location c() {
        try {
            Context context = AbstractC4002fj.a;
            Intrinsics.checkNotNull(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task lastLocation = fusedLocationProviderClient.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
            return (Location) lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e2) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            e2.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            if (AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i;
        boolean isLocationEnabled;
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            } catch (Settings.SettingNotFoundException unused) {
                i = 0;
            }
            return i != 0;
        }
        LocationManager locationManager = b;
        if (locationManager != null) {
            isLocationEnabled = locationManager.isLocationEnabled();
            if (isLocationEnabled) {
                return true;
            }
        }
        return false;
    }

    public static boolean f() {
        try {
            Reflection.getOrCreateKotlinClass(GoogleApiClient.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(FusedLocationProviderClient.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(LocationServices.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(9:5|6|(1:(1:9)(2:29|30))(2:31|(1:33)(1:34))|10|11|(2:15|(1:17))|19|20|21))|10|11|(3:13|15|(0))|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r1 = com.inmobi.media.C4521zb.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "TAG");
        r6.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x0062, Exception -> 0x0064, TRY_LEAVE, TryCatch #1 {Exception -> 0x0064, blocks: (B:11:0x0045, B:13:0x004d, B:15:0x0053, B:17:0x005c), top: B:10:0x0045, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C4495yb c4495yb;
        int i;
        Mutex mutex;
        C4521zb c4521zb;
        try {
            if (continuationImpl instanceof C4495yb) {
                c4495yb = (C4495yb) continuationImpl;
                int i2 = c4495yb.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4495yb.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4495yb.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4495yb.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = g;
                        c4495yb.a = mutex2;
                        c4495yb.d = 1;
                        if (mutex2.lock(null, c4495yb) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4495yb.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    c4521zb = a;
                    if (d() && e()) {
                        c4521zb.b();
                        if (!f()) {
                            a(AbstractC4002fj.a);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c4521zb = a;
            if (d()) {
                c4521zb.b();
                if (!f()) {
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c4495yb = new C4495yb(this, continuationImpl);
        Object obj2 = c4495yb.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4495yb.d;
        if (i != 0) {
        }
    }

    public final void b() {
        LocationManager locationManager = b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                Intrinsics.checkNotNullExpressionValue(e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            } else {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            }
        }
        Unit unit = Unit.INSTANCE;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e2) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e2);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNull(context);
                GoogleApiClient build = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C4469xb()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: com.inmobi.media.zb$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(ConnectionResult connectionResult) {
                        C4521zb.a(connectionResult);
                    }
                }).addApi(LocationServices.API).build();
                d = build;
                if (build != null) {
                    build.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e2) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            e2.getMessage();
        }
    }

    public static final void a(ConnectionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f = false;
    }

    public static Location a() {
        Location location;
        Location location2;
        Location location3;
        try {
        } catch (Exception e2) {
            e = e2;
            location = null;
        }
        if (e() && d()) {
            location2 = f ? c() : null;
            try {
                if (b != null && AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.ACCESS_COARSE_LOCATION")) {
                    location3 = a(2, 2);
                }
            } catch (Exception e3) {
                location = location2;
                e = e3;
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                e.getMessage();
                location2 = location;
                location3 = null;
                if (location2 != null) {
                }
                return a(location2, location3);
            }
            location3 = null;
        } else {
            location2 = null;
            location3 = null;
        }
        if (location2 != null && location3 == null) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return null;
        }
        return a(location2, location3);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            String TAG3 = e;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        if (z2) {
            String TAG4 = e;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        if (!z5 && (!z3 || (z4 && z6))) {
            String TAG5 = e;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        String TAG6 = e;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        location.getTime();
        location.toString();
        return location;
    }

    public static Location a(int i, int i2) {
        String bestProvider;
        Location location;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = b;
        Location location2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                location = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                location = null;
            }
            if (location != null || i == 1) {
                location2 = location;
            } else {
                LocationManager locationManager2 = b;
                if (locationManager2 != null) {
                    Intrinsics.checkNotNull(locationManager2);
                    List<String> providers = locationManager2.getProviders(true);
                    Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        location2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (location2 != null) {
                                        break;
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                    }
                }
            }
        }
        String TAG = e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return location2;
    }

    public static HashMap a(Location location, boolean z, Location location2) {
        HashMap hashMap = new HashMap();
        Context context = AbstractC4002fj.a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                hashMap.put("u-latlong-accu", a(location));
                hashMap.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
            }
            Hh hh = AbstractC4477xj.a;
            if (AbstractC4002fj.b() == null || AbstractC4477xj.a().getLocationEnabled()) {
                hashMap.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                hashMap.put("u-latlong-accu-fine", a(location2));
                hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (AbstractC3867ag.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    hashMap.put("loc-granularity", "coarse");
                }
            } else {
                hashMap.put("loc-granularity", "none");
                return hashMap;
            }
        }
        return hashMap;
    }

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy());
    }
}
