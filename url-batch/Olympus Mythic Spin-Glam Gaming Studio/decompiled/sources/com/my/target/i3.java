package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class i3 extends di {
    final long d;
    long e;

    protected i3(t5 t5Var, uh uhVar, long j) {
        super(t5Var, uhVar);
        this.e = 0L;
        this.d = j;
    }

    protected final boolean a(boolean z) {
        if (!z) {
            this.e = 0L;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e == 0) {
            this.e = currentTimeMillis;
        }
        if (currentTimeMillis - this.e < this.d) {
            mi.b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visibility < " + this.d + " millis");
            return false;
        }
        mi.b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visible for " + this.d + " millis");
        return true;
    }
}
