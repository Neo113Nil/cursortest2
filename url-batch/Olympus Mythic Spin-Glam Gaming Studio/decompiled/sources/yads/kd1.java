package yads;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes14.dex */
public final class kd1 implements ah1 {
    public final ch1 a = new ch1();
    public final LocationManager b;
    public final t53 c;

    public kd1(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.b = locationManager;
        HashSet hashSet = t53.c;
        this.c = new t53(context.getApplicationContext(), locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // yads.ah1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location a() {
        List<String> list;
        Location location;
        LocationManager locationManager;
        LocationManager locationManager2;
        try {
            locationManager2 = this.b;
        } catch (Throwable unused) {
            boolean z = ob1.a;
        }
        if (locationManager2 != null) {
            list = locationManager2.getAllProviders();
            if (list != null) {
                return null;
            }
            List createListBuilder = CollectionsKt.createListBuilder();
            for (String str : list) {
                t53 t53Var = this.c;
                boolean a = t53Var.b.a("android.permission.ACCESS_COARSE_LOCATION");
                boolean a2 = t53Var.b.a("android.permission.ACCESS_FINE_LOCATION");
                boolean contains = t53.c.contains(str);
                if (!t53.d.contains(str) ? !(contains || !a) : !(contains || !a || !a2)) {
                    try {
                        locationManager = t53Var.a;
                    } catch (Throwable unused2) {
                        boolean z2 = ob1.a;
                    }
                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(str);
                        boolean z3 = ob1.a;
                        if (location == null) {
                            createListBuilder.add(location);
                        }
                    }
                }
                location = null;
                if (location == null) {
                }
            }
            return this.a.a(CollectionsKt.build(createListBuilder));
        }
        list = null;
        if (list != null) {
        }
    }
}
