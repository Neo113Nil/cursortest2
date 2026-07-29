package o;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: o.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949e5 extends E0 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ LayoutInflaterFactory2C1213i5 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0949e5(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5, C0950e6 c0950e6) {
        super(layoutInflaterFactory2C1213i5);
        this.d = layoutInflaterFactory2C1213i5;
        this.e = c0950e6;
    }

    @Override // o.E0
    public final IntentFilter d() {
        switch (this.c) {
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

    @Override // o.E0
    public final int f() {
        Location location;
        boolean z;
        long j;
        Location location2;
        switch (this.c) {
            case 0:
                return Z4.a((PowerManager) this.e) ? 2 : 1;
            default:
                C0950e6 c0950e6 = (C0950e6) this.e;
                JW jw = (JW) c0950e6.j;
                LocationManager locationManager = (LocationManager) c0950e6.i;
                if (jw.b > System.currentTimeMillis()) {
                    z = jw.a;
                } else {
                    Context context = (Context) c0950e6.k;
                    Location location3 = null;
                    if (AbstractC1305jX.j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
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
                    if (AbstractC1305jX.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (IW.d == null) {
                            IW.d = new IW();
                        }
                        IW iw = IW.d;
                        iw.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        iw.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = iw.c == 1;
                        long j2 = iw.b;
                        long j3 = iw.a;
                        iw.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = iw.b;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        jw.a = z;
                        jw.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // o.E0
    public final void j() {
        switch (this.c) {
            case 0:
                this.d.m(true, true);
                break;
            default:
                this.d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0949e5(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5, Context context) {
        super(layoutInflaterFactory2C1213i5);
        this.d = layoutInflaterFactory2C1213i5;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
