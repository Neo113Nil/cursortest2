package yads;

import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class gu1 {
    public static iu1 a(nt3 nt3Var) {
        if (iu1.g == null) {
            synchronized (iu1.f) {
                try {
                    if (iu1.g == null) {
                        iu1.g = new iu1(new bu1(new cu1()), new fu1(), new gv2(), nt3Var);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        iu1 iu1Var = iu1.g;
        if (iu1Var != null) {
            return iu1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
