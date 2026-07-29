package o;

import android.util.Log;

/* renamed from: o.hp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1193hp {
    public static final C1127gp a = C1127gp.a;

    public static C1127gp a(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        while (abstractComponentCallbacksC0069Co != null) {
            if (abstractComponentCallbacksC0069Co.A != null && abstractComponentCallbacksC0069Co.r) {
                abstractComponentCallbacksC0069Co.e();
            }
            abstractComponentCallbacksC0069Co = abstractComponentCallbacksC0069Co.C;
        }
        return a;
    }

    public static void b(C0864cp c0864cp) {
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0864cp.h.getClass().getName()), c0864cp);
        }
    }

    public static final void c(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, String str) {
        AbstractC0048Bt.n(str, "previousFragmentId");
        b(new C0864cp(abstractComponentCallbacksC0069Co, "Attempting to reuse fragment " + abstractComponentCallbacksC0069Co + " with previous ID " + str));
        a(abstractComponentCallbacksC0069Co).getClass();
    }
}
