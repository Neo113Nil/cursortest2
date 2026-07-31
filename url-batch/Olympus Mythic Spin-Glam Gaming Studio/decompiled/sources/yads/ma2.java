package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract class ma2 {
    public static volatile la2 a;
    public static final Object b = new Object();

    public static final la2 a(Context context) {
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        a = new la2(sg1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        la2 la2Var = a;
        if (la2Var != null) {
            return la2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
