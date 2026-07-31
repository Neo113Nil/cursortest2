package yads;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class hm1 {
    public final Object a;
    public final Object b;
    public final ys2[] c;
    public boolean d;
    public boolean e;
    public jm1 f;
    public boolean g;
    public final boolean[] h;
    public final fo[] i;
    public final h83 j;
    public final ym1 k;
    public hm1 l;
    public y73 m;
    public i83 n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [yads.pv] */
    public hm1(fo[] foVarArr, long j, h83 h83Var, ub0 ub0Var, ym1 ym1Var, jm1 jm1Var, i83 i83Var) {
        this.i = foVarArr;
        this.o = j;
        this.j = h83Var;
        this.k = ym1Var;
        pm1 pm1Var = jm1Var.a;
        this.b = pm1Var.a;
        this.f = jm1Var;
        this.m = y73.e;
        this.n = i83Var;
        this.c = new ys2[foVarArr.length];
        this.h = new boolean[foVarArr.length];
        long j2 = jm1Var.b;
        long j3 = jm1Var.d;
        ym1Var.getClass();
        Object c = e.c(pm1Var.a);
        pm1 a = pm1Var.a(e.b(pm1Var.a));
        xm1 xm1Var = (xm1) ym1Var.d.get(c);
        xm1Var.getClass();
        ym1Var.i.add(xm1Var);
        wm1 wm1Var = (wm1) ym1Var.h.get(xm1Var);
        if (wm1Var != null) {
            wm1Var.a.b(wm1Var.b);
        }
        xm1Var.c.add(a);
        li1 a2 = xm1Var.a.a(a, ub0Var, j2);
        ym1Var.c.put(a2, xm1Var);
        Iterator it = ym1Var.i.iterator();
        while (it.hasNext()) {
            xm1 xm1Var2 = (xm1) it.next();
            if (xm1Var2.c.isEmpty()) {
                wm1 wm1Var2 = (wm1) ym1Var.h.get(xm1Var2);
                if (wm1Var2 != null) {
                    wm1Var2.a.a(wm1Var2.b);
                }
                it.remove();
            }
        }
        this.a = j3 != -9223372036854775807L ? new pv(a2, true, 0L, j3) : a2;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, yads.gm1] */
    public final long a(i83 i83Var, long j, boolean z, boolean[] zArr) {
        i83 i83Var2;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= i83Var.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || (i83Var2 = this.n) == null || !sb3.a(i83Var.b[i2], i83Var2.b[i2]) || !sb3.a(i83Var.c[i2], i83Var2.c[i2])) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        ys2[] ys2VarArr = this.c;
        int i3 = 0;
        while (true) {
            fo[] foVarArr = this.i;
            if (i3 >= foVarArr.length) {
                break;
            }
            if (foVarArr[i3].b == -2) {
                ys2VarArr[i3] = null;
            }
            i3++;
        }
        a();
        this.n = i83Var;
        if (this.l == null) {
            int i4 = 0;
            while (true) {
                i83 i83Var3 = this.n;
                if (i4 >= i83Var3.a) {
                    break;
                }
                boolean a = i83Var3.a(i4);
                xo0 xo0Var = this.n.c[i4];
                if (a && xo0Var != null) {
                    xo0Var.a();
                }
                i4++;
            }
        }
        long a2 = this.a.a(i83Var.c, this.h, this.c, zArr, j);
        ys2[] ys2VarArr2 = this.c;
        int i5 = 0;
        while (true) {
            fo[] foVarArr2 = this.i;
            if (i5 >= foVarArr2.length) {
                break;
            }
            if (foVarArr2[i5].b == -2 && this.n.a(i5)) {
                ys2VarArr2[i5] = new bm0();
            }
            i5++;
        }
        this.e = false;
        while (true) {
            ys2[] ys2VarArr3 = this.c;
            if (i >= ys2VarArr3.length) {
                return a2;
            }
            if (ys2VarArr3[i] != null) {
                if (!i83Var.a(i)) {
                    throw new IllegalStateException();
                }
                if (this.i[i].b != -2) {
                    this.e = true;
                }
            } else if (i83Var.c[i] != null) {
                throw new IllegalStateException();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yads.gm1] */
    public final void b() {
        a();
        ym1 ym1Var = this.k;
        ?? r1 = this.a;
        try {
            if (!(r1 instanceof pv)) {
                xm1 xm1Var = (xm1) ym1Var.c.remove(r1);
                xm1Var.getClass();
                xm1Var.a.a((gm1) r1);
                xm1Var.c.remove(((li1) r1).b);
                if (!ym1Var.c.isEmpty()) {
                    Iterator it = ym1Var.i.iterator();
                    while (it.hasNext()) {
                        xm1 xm1Var2 = (xm1) it.next();
                        if (xm1Var2.c.isEmpty()) {
                            wm1 wm1Var = (wm1) ym1Var.h.get(xm1Var2);
                            if (wm1Var != null) {
                                wm1Var.a.a(wm1Var.b);
                            }
                            it.remove();
                        }
                    }
                }
                if (xm1Var.e && xm1Var.c.isEmpty()) {
                    wm1 wm1Var2 = (wm1) ym1Var.h.remove(xm1Var);
                    wm1Var2.getClass();
                    wm1Var2.a.c(wm1Var2.b);
                    wm1Var2.a.a((tm1) wm1Var2.c);
                    wm1Var2.a.a((zk0) wm1Var2.c);
                    ym1Var.i.remove(xm1Var);
                    return;
                }
                return;
            }
            gm1 gm1Var = ((pv) r1).b;
            xm1 xm1Var3 = (xm1) ym1Var.c.remove(gm1Var);
            xm1Var3.getClass();
            xm1Var3.a.a(gm1Var);
            xm1Var3.c.remove(((li1) gm1Var).b);
            if (!ym1Var.c.isEmpty()) {
                Iterator it2 = ym1Var.i.iterator();
                while (it2.hasNext()) {
                    xm1 xm1Var4 = (xm1) it2.next();
                    if (xm1Var4.c.isEmpty()) {
                        wm1 wm1Var3 = (wm1) ym1Var.h.get(xm1Var4);
                        if (wm1Var3 != null) {
                            wm1Var3.a.a(wm1Var3.b);
                        }
                        it2.remove();
                    }
                }
            }
            if (xm1Var3.e && xm1Var3.c.isEmpty()) {
                wm1 wm1Var4 = (wm1) ym1Var.h.remove(xm1Var3);
                wm1Var4.getClass();
                wm1Var4.a.c(wm1Var4.b);
                wm1Var4.a.a((tm1) wm1Var4.c);
                wm1Var4.a.a((zk0) wm1Var4.c);
                ym1Var.i.remove(xm1Var3);
            }
        } catch (RuntimeException e) {
            gh1.b("MediaPeriodHolder", gh1.a("Period release failed.", e));
        }
    }

    public final void a() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            i83 i83Var = this.n;
            if (i >= i83Var.a) {
                return;
            }
            boolean a = i83Var.a(i);
            xo0 xo0Var = this.n.c[i];
            if (a && xo0Var != null) {
                xo0Var.b();
            }
            i++;
        }
    }
}
