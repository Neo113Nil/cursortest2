package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class x3 extends z3 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ c4 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(c4 c4Var, Context context) {
        super(c4Var);
        this.d = c4Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.z3
    public final IntentFilter e() {
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

    @Override // defpackage.z3
    public final int f() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!s3.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                y5 y5Var = (y5) obj;
                l60 l60Var = (l60) y5Var.b;
                LocationManager locationManager = (LocationManager) y5Var.a;
                if (l60Var.b > System.currentTimeMillis()) {
                    z = l60Var.a;
                } else {
                    Context context = (Context) y5Var.c;
                    Location location3 = null;
                    if (vv.g(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (vv.g(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (k60.d == null) {
                            k60.d = new k60();
                        }
                        k60 k60Var = k60.d;
                        k60Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        k60Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = k60Var.c == 1;
                        long j2 = k60Var.b;
                        long j3 = k60Var.a;
                        k60Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = k60Var.b;
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
                        l60Var.a = z;
                        l60Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // defpackage.z3
    public final void h() {
        int i = this.c;
        c4 c4Var = this.d;
        switch (i) {
            case 0:
                c4Var.l(true, true);
                break;
            default:
                c4Var.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(c4 c4Var, y5 y5Var) {
        super(c4Var);
        this.d = c4Var;
        this.e = y5Var;
    }
}
