package yads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class ao {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final sm1 c = new sm1();
    public final yk0 d = new yk0();
    public Looper e;
    public g73 f;
    public ff2 g;

    public abstract gm1 a(pm1 pm1Var, ub0 ub0Var, long j);

    public void a() {
    }

    public abstract void a(gm1 gm1Var);

    public abstract void a(h93 h93Var);

    public void b() {
    }

    public abstract wl1 c();

    public final void c(qm1 qm1Var) {
        this.a.remove(qm1Var);
        if (!this.a.isEmpty()) {
            a(qm1Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        e();
    }

    public abstract void d();

    public abstract void e();

    public final void a(g73 g73Var) {
        this.f = g73Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qm1) it.next()).a(this, g73Var);
        }
    }

    public final void b(qm1 qm1Var) {
        this.e.getClass();
        boolean isEmpty = this.b.isEmpty();
        this.b.add(qm1Var);
        if (isEmpty) {
            b();
        }
    }

    public final void a(tm1 tm1Var) {
        sm1 sm1Var = this.c;
        Iterator it = sm1Var.c.iterator();
        while (it.hasNext()) {
            rm1 rm1Var = (rm1) it.next();
            if (rm1Var.b == tm1Var) {
                sm1Var.c.remove(rm1Var);
            }
        }
    }

    public final void a(zk0 zk0Var) {
        yk0 yk0Var = this.d;
        Iterator it = yk0Var.c.iterator();
        while (it.hasNext()) {
            xk0 xk0Var = (xk0) it.next();
            if (xk0Var.a == zk0Var) {
                yk0Var.c.remove(xk0Var);
            }
        }
    }

    public final void a(qm1 qm1Var) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(qm1Var);
        if (isEmpty || !this.b.isEmpty()) {
            return;
        }
        a();
    }
}
