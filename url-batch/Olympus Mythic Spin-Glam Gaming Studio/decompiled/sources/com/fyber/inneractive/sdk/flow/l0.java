package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ p0 b;

    public l0(p0 p0Var, long j) {
        this.b = p0Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.I()) {
            p0 p0Var = this.b;
            p0Var.n = new k0(this);
            long a = p0Var.a(this.a);
            p0 p0Var2 = this.b;
            p0Var2.getClass();
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, a);
            p0Var2.o = v1Var;
            v1Var.e = new o0(p0Var2);
            v1Var.d = false;
            v1Var.c.sendEmptyMessage(1932593528);
            p0 p0Var3 = this.b;
            p0Var3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(p0Var3), Long.valueOf(a));
            this.b.l = null;
        } else {
            p0 p0Var4 = this.b;
            p0Var4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(p0Var4));
            this.b.e(false);
        }
        Runnable runnable = this.b.l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.b.l = null;
        }
    }
}
