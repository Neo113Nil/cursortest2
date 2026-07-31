package yads;

import kotlin.Unit;

/* loaded from: classes12.dex */
public abstract class x43 {
    public static y43 a() {
        if (y43.b == null) {
            synchronized (y43.c) {
                try {
                    if (y43.b == null) {
                        y43.b = new y43();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y43 y43Var = y43.b;
        if (y43Var != null) {
            return y43Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
