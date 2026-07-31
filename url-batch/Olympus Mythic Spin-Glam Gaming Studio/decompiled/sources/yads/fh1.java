package yads;

import android.content.Context;

/* loaded from: classes15.dex */
public final class fh1 {
    public final dh1 a;
    public final tc2 b;
    public eh1 c;

    public fh1(Context context, String str) {
        dh1 dh1Var = new dh1(context, str);
        tc2 tc2Var = new tc2(context);
        this.a = dh1Var;
        this.b = tc2Var;
        this.c = null;
    }

    public final eh1 a() {
        Class<?> cls;
        Object a;
        Object a2;
        dh1 dh1Var = this.a;
        sm2 sm2Var = dh1Var.b;
        try {
            cls = Class.forName(dh1Var.a);
        } catch (Throwable unused) {
            boolean z = ob1.a;
            cls = null;
        }
        ay0 ay0Var = (cls == null || (a2 = sm2.a(cls, "getFusedLocationProviderClient", dh1Var.c)) == null) ? null : new ay0(a2);
        if (ay0Var == null) {
            return null;
        }
        boolean a3 = this.b.a("android.permission.ACCESS_COARSE_LOCATION");
        boolean a4 = this.b.a("android.permission.ACCESS_FINE_LOCATION");
        if ((a3 || a4) && (a = rm2.a(ay0Var.a, "getLastLocation", new Object[0])) != null) {
            return new eh1(a);
        }
        return null;
    }
}
