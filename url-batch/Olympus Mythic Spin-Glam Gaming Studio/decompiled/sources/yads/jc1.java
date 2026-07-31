package yads;

import kotlin.Unit;

/* loaded from: classes9.dex */
public abstract class jc1 {
    public static kc1 a() {
        if (kc1.d == null) {
            synchronized (kc1.c) {
                try {
                    if (kc1.d == null) {
                        kc1.d = new kc1();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kc1 kc1Var = kc1.d;
        if (kc1Var != null) {
            return kc1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
