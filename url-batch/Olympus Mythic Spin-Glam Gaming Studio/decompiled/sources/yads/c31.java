package yads;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c31 implements Runnable {
    public final /* synthetic */ g31 b;

    public c31(g31 g31Var) {
        this.b = g31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (d31 d31Var : this.b.d.values()) {
            Iterator it = d31Var.d.iterator();
            while (it.hasNext()) {
                e31 e31Var = (e31) it.next();
                f31 f31Var = e31Var.b;
                if (f31Var != null) {
                    hm3 hm3Var = d31Var.c;
                    if (hm3Var == null) {
                        e31Var.a = d31Var.b;
                        f31Var.a(e31Var, false);
                    } else {
                        f31Var.a(hm3Var);
                    }
                }
            }
        }
        this.b.d.clear();
        this.b.f = null;
    }
}
