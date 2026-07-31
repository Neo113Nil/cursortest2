package yads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes14.dex */
public final class oc2 {
    public final boolean a;
    public final Handler b;
    public nc2 c = nc2.b;
    public pc2 d;
    public k73 e;
    public long f;
    public long g;
    public long h;

    public oc2(boolean z, Handler handler) {
        this.a = z;
        this.b = handler;
    }

    public final void a(long j, pc2 pc2Var) {
        a();
        this.d = pc2Var;
        this.f = j;
        this.g = j;
        if (this.a) {
            this.b.post(new Runnable() { // from class: yads.oc2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    oc2.a(oc2.this);
                }
            });
        } else {
            c();
        }
    }

    public final void b() {
        if (nc2.c == this.c) {
            this.c = nc2.d;
            this.b.removeCallbacksAndMessages(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.h;
            this.h = elapsedRealtime;
            long j2 = this.f - j;
            this.f = j2;
            long max = (long) Math.max(0.0d, j2);
            k73 k73Var = this.e;
            if (k73Var != null) {
                k73Var.a(max, this.g - max);
            }
        }
    }

    public final void c() {
        this.c = nc2.c;
        this.h = SystemClock.elapsedRealtime();
        long min = (long) Math.min(200.0d, this.f);
        if (min > 0) {
            this.b.postDelayed(new mc2(this), min);
            return;
        }
        pc2 pc2Var = this.d;
        if (pc2Var != null) {
            pc2Var.a();
        }
        a();
    }

    public final void d() {
        if (nc2.d == this.c) {
            c();
        }
    }

    public static final void a(oc2 oc2Var) {
        oc2Var.c();
    }

    public final void a() {
        nc2 nc2Var = nc2.b;
        if (nc2Var == this.c) {
            return;
        }
        this.c = nc2Var;
        this.d = null;
        this.b.removeCallbacksAndMessages(null);
    }
}
