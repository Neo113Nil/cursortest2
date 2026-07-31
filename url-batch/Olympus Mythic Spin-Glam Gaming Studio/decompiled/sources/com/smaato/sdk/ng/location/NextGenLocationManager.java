package com.smaato.sdk.ng.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKPermissionUtil;
import com.unity3d.services.UnityAdsConstants;

@SuppressLint({"MissingPermission"})
/* loaded from: classes9.dex */
public class NextGenLocationManager implements LocationListener {
    private static final String f = "NextGenLocationManager";
    private final Context a;
    private final LocationManager b;
    private Location c;
    private HandlerThread d;
    private final Runnable e = new Runnable() { // from class: com.smaato.sdk.ng.location.NextGenLocationManager$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            NextGenLocationManager.this.stopLocationUpdates();
        }
    };

    public NextGenLocationManager(Context context) {
        this.b = (LocationManager) context.getSystemService("location");
        this.a = context;
    }

    private Location a() {
        if (d()) {
            return this.b.getLastKnownLocation("network");
        }
        return null;
    }

    private Location b() {
        Location a = c() ? a() : null;
        if (a != null) {
            return a;
        }
        return null;
    }

    private boolean c() {
        return NGSDKPermissionUtil.hasPermission(this.a, "android.permission.ACCESS_COARSE_LOCATION");
    }

    private boolean d() {
        LocationManager locationManager = this.b;
        return (locationManager == null || locationManager.getProvider("network") == null) ? false : true;
    }

    private boolean e() {
        return c();
    }

    public Location getUserLocation() {
        if (!e()) {
            return null;
        }
        Location b = b();
        if (b != null && a(b, this.c)) {
            this.c = b;
        }
        Location location = this.c;
        if (NextGen.isLocationTrackingEnabled() && NextGen.areLocationUpdatesEnabled()) {
            startLocationUpdates();
        }
        return location;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (a(location, this.c)) {
            this.c = location;
            stopLocationUpdates();
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void startLocationUpdates() {
        HandlerThread handlerThread = this.d;
        if (handlerThread == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("NextGenLocationUpdates");
            this.d = handlerThread2;
            handlerThread2.start();
            Handler handler = new Handler(this.d.getLooper());
            try {
                if (c() && d()) {
                    this.b.requestLocationUpdates("network", 0L, 0.0f, this, this.d.getLooper());
                }
            } catch (Exception e) {
                Logger.e(f, "Can't request location updates: ".concat(String.valueOf(e.getMessage())));
            }
            handler.postDelayed(this.e, 10000L);
        }
    }

    public void stopLocationUpdates() {
        LocationManager locationManager = this.b;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
        HandlerThread handlerThread = this.d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.d = null;
        }
    }

    protected boolean a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean a = a(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && a;
        }
        return true;
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
