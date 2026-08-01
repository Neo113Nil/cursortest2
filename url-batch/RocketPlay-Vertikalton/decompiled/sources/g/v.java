package g;

import K.C0019l;
import Y.AbstractC0045g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class v extends AbstractC0045g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2696c = 1;
    public final /* synthetic */ z d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, C0019l c0019l) {
        super(zVar);
        this.d = zVar;
        this.f2697e = c0019l;
    }

    @Override // Y.AbstractC0045g
    public final IntentFilter e() {
        switch (this.f2696c) {
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

    @Override // Y.AbstractC0045g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2696c) {
            case 0:
                return r.a((PowerManager) this.f2697e) ? 2 : 1;
            default:
                C0019l c0019l = (C0019l) this.f2697e;
                C0119G c0119g = (C0119G) c0019l.f685c;
                if (c0119g.f2598b > System.currentTimeMillis()) {
                    z2 = c0119g.f2597a;
                } else {
                    Context context = (Context) c0019l.f683a;
                    int l2 = F1.l.l(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0019l.f684b;
                    if (l2 == 0) {
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
                    if (F1.l.l(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (C0118F.d == null) {
                            C0118F.d = new C0118F();
                        }
                        C0118F c0118f = C0118F.d;
                        c0118f.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0118f.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0118f.f2596c == 1;
                        long j3 = c0118f.f2595b;
                        long j4 = c0118f.f2594a;
                        c0118f.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0118f.f2595b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0119g.f2597a = z2;
                        c0119g.f2598b = j2;
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

    @Override // Y.AbstractC0045g
    public final void h() {
        switch (this.f2696c) {
            case 0:
                this.d.m(true, true);
                break;
            default:
                this.d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, Context context) {
        super(zVar);
        this.d = zVar;
        this.f2697e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
