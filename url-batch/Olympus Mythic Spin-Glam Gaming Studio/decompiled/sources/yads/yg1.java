package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class yg1 {
    public static zg1 a(Context context) {
        if (zg1.g == null) {
            synchronized (zg1.f) {
                try {
                    if (zg1.g == null) {
                        zg1.g = new zg1(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zg1 zg1Var = zg1.g;
        if (zg1Var != null) {
            return zg1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
