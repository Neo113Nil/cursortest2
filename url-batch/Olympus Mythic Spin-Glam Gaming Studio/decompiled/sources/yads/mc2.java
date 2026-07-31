package yads;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class mc2 implements Runnable {
    public final /* synthetic */ oc2 b;

    public mc2(oc2 oc2Var) {
        this.b = oc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc2 oc2Var = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - oc2Var.h;
        oc2Var.h = elapsedRealtime;
        long j2 = oc2Var.f - j;
        oc2Var.f = j2;
        long max = (long) Math.max(0.0d, j2);
        k73 k73Var = oc2Var.e;
        if (k73Var != null) {
            k73Var.a(max, oc2Var.g - max);
        }
        this.b.c();
    }
}
