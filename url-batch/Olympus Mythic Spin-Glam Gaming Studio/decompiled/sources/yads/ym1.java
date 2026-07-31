package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Random;

/* loaded from: classes3.dex */
public final class ym1 {
    public final ff2 a;
    public final fo0 e;
    public final sm1 f;
    public final yk0 g;
    public final HashMap h;
    public final HashSet i;
    public boolean k;
    public h93 l;
    public hz2 j = new hz2(new Random());
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();

    public ym1(fo0 fo0Var, kd kdVar, Handler handler, ff2 ff2Var) {
        this.a = ff2Var;
        this.e = fo0Var;
        sm1 sm1Var = new sm1();
        this.f = sm1Var;
        yk0 yk0Var = new yk0();
        this.g = yk0Var;
        this.h = new HashMap();
        this.i = new HashSet();
        kdVar.getClass();
        sm1Var.c.add(new rm1(handler, kdVar));
        yk0Var.c.add(new xk0(handler, kdVar));
    }

    public final g73 a(int i, ArrayList arrayList, hz2 hz2Var) {
        if (!arrayList.isEmpty()) {
            this.j = hz2Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                xm1 xm1Var = (xm1) arrayList.get(i2 - i);
                if (i2 > 0) {
                    xm1 xm1Var2 = (xm1) this.b.get(i2 - 1);
                    xm1Var.d = xm1Var2.a.o.c.b() + xm1Var2.d;
                    xm1Var.e = false;
                    xm1Var.c.clear();
                } else {
                    xm1Var.d = 0;
                    xm1Var.e = false;
                    xm1Var.c.clear();
                }
                int b = xm1Var.a.o.c.b();
                for (int i3 = i2; i3 < this.b.size(); i3++) {
                    ((xm1) this.b.get(i3)).d += b;
                }
                this.b.add(i2, xm1Var);
                this.d.put(xm1Var.b, xm1Var);
                if (this.k) {
                    a(xm1Var);
                    if (this.c.isEmpty()) {
                        this.i.add(xm1Var);
                    } else {
                        wm1 wm1Var = (wm1) this.h.get(xm1Var);
                        if (wm1Var != null) {
                            wm1Var.a.a(wm1Var.b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final g73 a() {
        if (this.b.isEmpty()) {
            return g73.b;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            xm1 xm1Var = (xm1) this.b.get(i2);
            xm1Var.d = i;
            i += xm1Var.a.o.c.b();
        }
        return new vf2(this.b, this.j);
    }

    public final void a(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            xm1 xm1Var = (xm1) this.b.remove(i3);
            this.d.remove(xm1Var.b);
            int i4 = -xm1Var.a.o.c.b();
            for (int i5 = i3; i5 < this.b.size(); i5++) {
                ((xm1) this.b.get(i5)).d += i4;
            }
            xm1Var.e = true;
            if (this.k && xm1Var.c.isEmpty()) {
                wm1 wm1Var = (wm1) this.h.remove(xm1Var);
                wm1Var.getClass();
                wm1Var.a.c(wm1Var.b);
                wm1Var.a.a((tm1) wm1Var.c);
                wm1Var.a.a((zk0) wm1Var.c);
                this.i.remove(xm1Var);
            }
        }
    }

    public final void a(xm1 xm1Var) {
        ao aoVar = xm1Var.a;
        qm1 qm1Var = new qm1() { // from class: yads.ym1$$ExternalSyntheticLambda0
            @Override // yads.qm1
            public final void a(ao aoVar2, g73 g73Var) {
                ym1.this.a(aoVar2, g73Var);
            }
        };
        vm1 vm1Var = new vm1(this, xm1Var);
        this.h.put(xm1Var, new wm1(aoVar, qm1Var, vm1Var));
        Handler b = sb3.b((Handler.Callback) null);
        aoVar.getClass();
        sm1 sm1Var = aoVar.c;
        sm1Var.getClass();
        sm1Var.c.add(new rm1(b, vm1Var));
        Handler b2 = sb3.b((Handler.Callback) null);
        yk0 yk0Var = aoVar.d;
        yk0Var.getClass();
        yk0Var.c.add(new xk0(b2, vm1Var));
        h93 h93Var = this.l;
        ff2 ff2Var = this.a;
        Looper myLooper = Looper.myLooper();
        Looper looper = aoVar.e;
        if (looper != null && looper != myLooper) {
            throw new IllegalArgumentException();
        }
        aoVar.g = ff2Var;
        g73 g73Var = aoVar.f;
        aoVar.a.add(qm1Var);
        if (aoVar.e == null) {
            aoVar.e = myLooper;
            aoVar.b.add(qm1Var);
            aoVar.a(h93Var);
        } else if (g73Var != null) {
            aoVar.b(qm1Var);
            qm1Var.a(aoVar, g73Var);
        }
    }

    public final void a(ao aoVar, g73 g73Var) {
        this.e.i.a.sendEmptyMessage(22);
    }
}
