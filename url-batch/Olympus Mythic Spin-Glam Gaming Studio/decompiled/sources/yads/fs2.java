package yads;

import kotlin.Unit;

/* loaded from: classes13.dex */
public abstract class fs2 {
    public static gs2 a() {
        if (gs2.d == null) {
            synchronized (gs2.c) {
                try {
                    if (gs2.d == null) {
                        gs2.d = new gs2();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        gs2 gs2Var = gs2.d;
        if (gs2Var != null) {
            return gs2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
