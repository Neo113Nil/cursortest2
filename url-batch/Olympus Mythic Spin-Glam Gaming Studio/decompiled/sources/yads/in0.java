package yads;

import android.os.Handler;

/* loaded from: classes12.dex */
public final class in0 {
    public final gn0 a;

    public in0(Handler handler) {
        this.a = new gn0(handler);
    }

    public final void a(ro2 ro2Var, xp2 xp2Var, gr grVar) {
        synchronized (ro2Var.f) {
            ro2Var.l = true;
        }
        ro2Var.a("post-response");
        gn0 gn0Var = this.a;
        gn0Var.a.post(new hn0(ro2Var, xp2Var, grVar));
    }
}
