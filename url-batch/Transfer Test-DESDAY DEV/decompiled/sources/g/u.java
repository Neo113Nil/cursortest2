package g;

import K.C0014m;
import Y.AbstractC0039g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class u extends AbstractC0039g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2256c = 1;
    public final /* synthetic */ y d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, C0014m c0014m) {
        super(yVar);
        this.d = yVar;
        this.f2257e = c0014m;
    }

    @Override // Y.AbstractC0039g
    public final IntentFilter e() {
        switch (this.f2256c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // Y.AbstractC0039g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2256c) {
            case 0:
                return q.a((PowerManager) this.f2257e) ? 2 : 1;
            default:
                C0014m c0014m = (C0014m) this.f2257e;
                C0097F c0097f = (C0097F) c0014m.f426c;
                if (c0097f.f2175b > System.currentTimeMillis()) {
                    z2 = c0097f.f2174a;
                } else {
                    Context context = (Context) c0014m.f424a;
                    int m2 = A.c.m(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0014m.f425b;
                    if (m2 == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (A.c.m(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0096E.d == null) {
                            C0096E.d = new C0096E();
                        }
                        C0096E c0096e = C0096E.d;
                        c0096e.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0096e.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0096e.f2173c == 1;
                        long j3 = c0096e.f2172b;
                        long j4 = c0096e.f2171a;
                        c0096e.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0096e.f2172b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0097f.f2174a = z2;
                        c0097f.f2175b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // Y.AbstractC0039g
    public final void h() {
        switch (this.f2256c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Context context) {
        super(yVar);
        this.d = yVar;
        this.f2257e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
