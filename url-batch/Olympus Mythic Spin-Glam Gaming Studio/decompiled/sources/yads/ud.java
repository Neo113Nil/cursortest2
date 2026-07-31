package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ud {
    public static final mt1 a(Context context, dq3 dq3Var) {
        if (ot1.b == null) {
            synchronized (mt1.e) {
                try {
                    if (ot1.b == null) {
                        Context a = pz.a(context);
                        ot1.b = ot1.a(a, ot1.a.a(a), dq3Var);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mt1 mt1Var = ot1.b;
        if (mt1Var != null) {
            return mt1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
