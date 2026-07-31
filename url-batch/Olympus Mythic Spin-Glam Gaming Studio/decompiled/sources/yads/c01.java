package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class c01 {
    public static final Object a = new Object();
    public static volatile zx0 b;

    public static final zx0 a(Context context) {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new zx0(context, "com.huawei.hms.location.LocationServices");
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zx0 zx0Var = b;
        if (zx0Var != null) {
            return zx0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
