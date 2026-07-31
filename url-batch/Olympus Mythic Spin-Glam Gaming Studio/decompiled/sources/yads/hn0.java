package yads;

/* loaded from: classes6.dex */
public final class hn0 implements Runnable {
    public final ro2 b;
    public final xp2 c;
    public final gr d;

    public hn0(ro2 ro2Var, xp2 xp2Var, gr grVar) {
        this.b = ro2Var;
        this.c = xp2Var;
        this.d = grVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vp2 vp2Var;
        if (this.b.i()) {
            this.b.b("canceled-at-delivery");
            return;
        }
        xp2 xp2Var = this.c;
        hm3 hm3Var = xp2Var.c;
        if (hm3Var == null) {
            this.b.a(xp2Var.a);
        } else {
            ro2 ro2Var = this.b;
            synchronized (ro2Var.f) {
                vp2Var = ro2Var.g;
            }
            if (vp2Var != null) {
                vp2Var.a(hm3Var);
            }
        }
        if (this.c.d) {
            this.b.a("intermediate-response");
        } else {
            this.b.b("done");
        }
        gr grVar = this.d;
        if (grVar != null) {
            grVar.run();
        }
    }
}
