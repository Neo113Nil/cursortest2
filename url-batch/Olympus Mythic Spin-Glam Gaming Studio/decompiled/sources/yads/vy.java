package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class vy {
    public static final Object a = new Object();
    public static volatile yy b;

    public static yy a(Context context) {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new yy(sg1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        yy yyVar = b;
        if (yyVar != null) {
            return yyVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
