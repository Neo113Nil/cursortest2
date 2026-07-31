package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ty2 {
    public static volatile uy2 a;
    public static final Object b = new Object();

    public static uy2 a(Context context) {
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        a = new uy2(sg1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        uy2 uy2Var = a;
        if (uy2Var != null) {
            return uy2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
