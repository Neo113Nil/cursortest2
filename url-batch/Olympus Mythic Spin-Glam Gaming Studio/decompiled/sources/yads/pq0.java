package yads;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class pq0 {
    public final mh1 a = new mh1();

    public final void a(final gv1 gv1Var, final hv1 hv1Var) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        mh1 mh1Var = this.a;
        mh1Var.a.post(new Runnable() { // from class: yads.pq0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                pq0.a(elapsedRealtime, gv1Var, hv1Var);
            }
        });
    }

    public static final void a(long j, Function0 function0, Function0 function02) {
        if (SystemClock.elapsedRealtime() - j <= 5000) {
            function0.mo4828invoke();
        } else {
            function02.mo4828invoke();
        }
    }
}
