package yads;

import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class t0 {
    public static v0 a() {
        if (v0.d == null) {
            synchronized (v0.c) {
                try {
                    if (v0.d == null) {
                        v0.d = new v0();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v0 v0Var = v0.d;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
