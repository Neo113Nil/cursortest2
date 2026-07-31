package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes14.dex */
public final class bh1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kd1(context));
        bu2 a = uw2.a().a(context);
        if (a != null && !a.g) {
            if (az0.b == null) {
                synchronized (az0.a) {
                    try {
                        if (az0.b == null) {
                            az0.b = new zx0(context, "com.google.android.gms.location.LocationServices");
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zx0 zx0Var = az0.b;
            if (zx0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(zx0Var);
            arrayList.add(c01.a(context));
        }
        return arrayList;
    }
}
