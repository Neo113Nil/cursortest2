package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p5 extends uj {
    public static final lu0 p = new lu0(t3.m);
    public static final n5 q = new n5(0);
    public final Choreographer f;
    public final Handler g;
    public boolean l;
    public boolean m;
    public final r5 o;
    public final Object h = new Object();
    public final h8 i = new h8();
    public ArrayList j = new ArrayList();
    public ArrayList k = new ArrayList();
    public final o5 n = new o5(this);

    public p5(Choreographer choreographer, Handler handler) {
        this.f = choreographer;
        this.g = handler;
        this.o = new r5(choreographer, this);
    }

    public static final void l(p5 p5Var) {
        boolean z;
        do {
            Runnable p2 = p5Var.p();
            while (p2 != null) {
                p2.run();
                p2 = p5Var.p();
            }
            synchronized (p5Var.h) {
                if (p5Var.i.isEmpty()) {
                    z = false;
                    p5Var.l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.uj
    public final void d(rj rjVar, Runnable runnable) {
        synchronized (this.h) {
            this.i.addLast(runnable);
            if (!this.l) {
                this.l = true;
                this.g.post(this.n);
                if (!this.m) {
                    this.m = true;
                    this.f.postFrameCallback(this.n);
                }
            }
        }
    }

    public final Runnable p() {
        Runnable runnable;
        synchronized (this.h) {
            h8 h8Var = this.i;
            runnable = (Runnable) (h8Var.isEmpty() ? null : h8Var.removeFirst());
        }
        return runnable;
    }
}
