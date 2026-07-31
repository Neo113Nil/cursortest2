package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ep2 {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final ar e;
    public final po f;
    public final in0 g;
    public final r82[] h;
    public hr i;
    public final ArrayList j;
    public final ArrayList k;

    public ep2(ar arVar, po poVar, int i) {
        in0 in0Var = new in0(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = arVar;
        this.f = poVar;
        this.h = new r82[i];
        this.g = in0Var;
    }

    public final void a() {
        hr hrVar = this.i;
        if (hrVar != null) {
            hrVar.f = true;
            hrVar.interrupt();
        }
        for (r82 r82Var : this.h) {
            if (r82Var != null) {
                r82Var.f = true;
                r82Var.interrupt();
            }
        }
        hr hrVar2 = new hr(this.c, this.d, this.e, this.g);
        this.i = hrVar2;
        hrVar2.start();
        for (int i = 0; i < this.h.length; i++) {
            r82 r82Var2 = new r82(this.d, this.f, this.e, this.g);
            this.h[i] = r82Var2;
            r82Var2.start();
        }
    }

    public final void a(dp2 dp2Var) {
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ro2 ro2Var = (ro2) it.next();
                    if (dp2Var.a(ro2Var)) {
                        ro2Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(ro2 ro2Var) {
        ro2Var.i = this;
        synchronized (this.b) {
            this.b.add(ro2Var);
        }
        ro2Var.h = Integer.valueOf(this.a.incrementAndGet());
        ro2Var.a("add-to-queue");
        a(ro2Var, 0);
        if (!ro2Var.j) {
            this.d.add(ro2Var);
        } else {
            this.c.add(ro2Var);
        }
    }

    public final void a(ro2 ro2Var, int i) {
        wo2 wo2Var;
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((to2) ((cp2) it.next())).getClass();
                    co coVar = ro2Var instanceof co ? (co) ro2Var : null;
                    if (coVar != null && i == 3 && (wo2Var = coVar.u) != null) {
                        wo2Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(to2 to2Var) {
        synchronized (this.k) {
            this.k.add(to2Var);
        }
    }
}
