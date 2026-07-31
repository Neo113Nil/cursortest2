package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class lc {
    public static volatile kc a;
    public static final Object b = new Object();

    public static kc a(Context context) {
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        a = new kc(sg1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kc kcVar = a;
        if (kcVar != null) {
            return kcVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
