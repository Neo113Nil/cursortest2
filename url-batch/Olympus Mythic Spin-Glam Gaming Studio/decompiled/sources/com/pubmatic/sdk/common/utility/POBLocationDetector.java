package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public class POBLocationDetector implements LocationListener {
    private final Context a;
    private Location b;
    private LocationManager c;
    private long d = 0;
    private long e = 600000;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.GPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.PASSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        NETWORK("network"),
        GPS("gps"),
        PASSIVE("passive");

        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }

        boolean a(Context context) {
            int i = a.a[ordinal()];
            if (i == 1) {
                return POBUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION") || POBUtils.hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
            }
            if (i == 2 || i == 3) {
                return POBUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
            }
            return false;
        }
    }

    public POBLocationDetector(@NonNull Context context) {
        this.a = context;
    }

    private void a() {
        LocationManager a2 = a(this.a);
        if (a2 == null) {
            POBLog.info("POBLocationDetector", "Location Manager is not available to fetch GPS location", new Object[0]);
            return;
        }
        try {
            b bVar = b.NETWORK;
            if (!a2.isProviderEnabled(bVar.toString())) {
                bVar = b.GPS;
            }
            if (!bVar.a(this.a)) {
                POBLog.info("POBLocationDetector", "No permission to fetch GPS location", new Object[0]);
                return;
            }
            try {
                POBLog.info("POBLocationDetector", "Requesting %s location", bVar);
                a2.requestLocationUpdates(bVar.toString(), 0L, 0.0f, this);
            } catch (Exception e) {
                POBLog.info("POBLocationDetector", "Unable to request location updates. Error: %s", e.getMessage());
            }
        } catch (Exception e2) {
            POBLog.warn("POBLocationDetector", "Unable to check network provider status. Error : %s", e2.getMessage());
        }
    }

    private boolean b() {
        return this.d == 0 || SystemClock.elapsedRealtime() - this.d >= this.e;
    }

    private void c() {
        LocationManager a2 = a(this.a);
        if (a2 != null) {
            try {
                a2.removeUpdates(this);
            } catch (Exception e) {
                POBLog.warn("POBLocationDetector", "Unable to remove location updates. Error : %s" + e.getMessage(), new Object[0]);
            }
        }
    }

    @Nullable
    public Address getAddress() {
        Location location = getLocation();
        if (location == null) {
            return null;
        }
        try {
            List<Address> fromLocation = new Geocoder(this.a, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation == null || fromLocation.isEmpty()) {
                return null;
            }
            return fromLocation.get(0);
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public String getISOAlpha2CountryCode() {
        Location location = getLocation();
        if (location == null) {
            return null;
        }
        try {
            List<Address> fromLocation = new Geocoder(this.a, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation == null || fromLocation.isEmpty()) {
                return null;
            }
            return fromLocation.get(0).getCountryCode();
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public Location getLocation() {
        b bVar = b.GPS;
        if (!bVar.a(this.a) && !b.NETWORK.a(this.a)) {
            return null;
        }
        if (b()) {
            a();
            Location a2 = a(a(this.a, bVar), a(this.a, b.NETWORK));
            this.b = a2;
            if (a2 == null) {
                this.b = a(this.a, b.PASSIVE);
            }
            if (this.b != null) {
                this.d = SystemClock.elapsedRealtime();
            }
            c();
        }
        return this.b;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@NonNull Location location) {
        POBLog.info("POBLocationDetector", "On location changed : %s on time : %s", location, Long.valueOf(location.getTime()));
        this.b = location;
        c();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(@NonNull String str) {
        POBLog.info("POBLocationDetector", "On location provider disabled", new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(@NonNull String str) {
        POBLog.info("POBLocationDetector", "On location provider enabled", new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        POBLog.info("POBLocationDetector", "On location provider status changed : %s", Integer.valueOf(i));
    }

    public void setLocationUpdateIntervalInMs(long j) {
        this.e = j;
    }

    private Location a(Context context, b bVar) {
        LocationManager a2;
        if (bVar.a(context) && (a2 = a(context)) != null) {
            try {
                this.b = a2.getLastKnownLocation(bVar.toString());
            } catch (IllegalArgumentException e) {
                POBLog.error("POBLocationDetector", "Unable to fetch the location. Error : %s", e.getMessage());
            } catch (SecurityException unused) {
                POBLog.error("POBLocationDetector", "Unable to fetch the location as user has restricted/denied location access to this app.", new Object[0]);
            } catch (Exception e2) {
                POBLog.error("POBLocationDetector", "Unable to fetch the location due to unknown reason. Error : %s", e2.getMessage());
            }
        }
        return this.b;
    }

    private Location a(Location location, Location location2) {
        return location == null ? location2 : (location2 != null && location.getTime() <= location2.getTime()) ? location2 : location;
    }

    private LocationManager a(Context context) {
        if (this.c == null) {
            try {
                this.c = (LocationManager) context.getSystemService("location");
            } catch (Exception e) {
                POBLog.warn("POBLocationDetector", "Unable to get location manager. Error : %s" + e.getMessage(), new Object[0]);
            }
        }
        return this.c;
    }
}
