package yads;

import android.os.Handler;
import android.util.Pair;

/* loaded from: classes5.dex */
public final class km1 {
    public final d73 a = new d73();
    public final f73 b = new f73();
    public final kd c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public hm1 h;
    public hm1 i;
    public hm1 j;
    public int k;
    public Object l;
    public long m;

    public km1(kd kdVar, Handler handler) {
        this.c = kdVar;
        this.d = handler;
    }

    public final hm1 a() {
        hm1 hm1Var = this.h;
        if (hm1Var == null) {
            return null;
        }
        if (hm1Var == this.i) {
            this.i = hm1Var.l;
        }
        hm1Var.b();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            hm1 hm1Var2 = this.h;
            this.l = hm1Var2.b;
            this.m = hm1Var2.f.a.d;
        }
        this.h = this.h.l;
        c();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        hm1 hm1Var = this.h;
        if (hm1Var == null) {
            throw new IllegalStateException();
        }
        this.l = hm1Var.b;
        this.m = hm1Var.f.a.d;
        while (hm1Var != null) {
            hm1Var.b();
            hm1Var = hm1Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        c();
    }

    public final void c() {
        i41 i41Var = l41.c;
        final h41 h41Var = new h41();
        for (hm1 hm1Var = this.h; hm1Var != null; hm1Var = hm1Var.l) {
            h41Var.a(hm1Var.f.a);
        }
        hm1 hm1Var2 = this.i;
        final pm1 pm1Var = hm1Var2 == null ? null : hm1Var2.f.a;
        this.d.post(new Runnable() { // from class: yads.km1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                km1.this.a(h41Var, pm1Var);
            }
        });
    }

    public final boolean a(hm1 hm1Var) {
        if (hm1Var != null) {
            int i = 0;
            if (hm1Var.equals(this.j)) {
                return false;
            }
            this.j = hm1Var;
            boolean z = false;
            while (true) {
                hm1Var = hm1Var.l;
                if (hm1Var == null) {
                    break;
                }
                if (hm1Var == this.i) {
                    this.i = this.h;
                    z = true;
                }
                hm1Var.b();
                this.k--;
            }
            hm1 hm1Var2 = this.j;
            if (hm1Var2.l != null) {
                hm1Var2.a();
                hm1Var2.l = null;
                while (true) {
                    i83 i83Var = hm1Var2.n;
                    if (i >= i83Var.a) {
                        break;
                    }
                    boolean a = i83Var.a(i);
                    xo0 xo0Var = hm1Var2.n.c[i];
                    if (a && xo0Var != null) {
                        xo0Var.a();
                    }
                    i++;
                }
            }
            c();
            return z;
        }
        throw new IllegalStateException();
    }

    public final boolean a(g73 g73Var, long j, long j2) {
        jm1 jm1Var;
        jm1 jm1Var2;
        jm1 jm1Var3;
        g73 g73Var2 = g73Var;
        hm1 hm1Var = this.h;
        hm1 hm1Var2 = null;
        while (hm1Var != null) {
            jm1 jm1Var4 = hm1Var.f;
            if (hm1Var2 == null) {
                jm1Var = a(g73Var2, jm1Var4);
            } else {
                jm1 a = a(g73Var2, hm1Var2, j);
                if (a == null) {
                    return !a(hm1Var2);
                }
                if (jm1Var4.b != a.b || !jm1Var4.a.equals(a.a)) {
                    return !a(hm1Var2);
                }
                jm1Var = a;
            }
            long j3 = jm1Var4.c;
            if (j3 == jm1Var.c) {
                jm1Var3 = jm1Var;
                jm1Var2 = jm1Var4;
            } else {
                jm1Var2 = jm1Var4;
                jm1Var3 = new jm1(jm1Var.a, jm1Var.b, j3, jm1Var.d, jm1Var.e, jm1Var.f, jm1Var.g, jm1Var.h, jm1Var.i);
            }
            hm1Var.f = jm1Var3;
            long j4 = jm1Var2.e;
            long j5 = jm1Var.e;
            if (j4 != -9223372036854775807L && j4 != j5) {
                Object obj = hm1Var.a;
                if (obj instanceof pv) {
                    long j6 = jm1Var3.d;
                    if (j6 == -9223372036854775807L) {
                        j6 = Long.MIN_VALUE;
                    }
                    pv pvVar = (pv) obj;
                    pvVar.f = 0L;
                    pvVar.g = j6;
                }
                return (a(hm1Var) || (hm1Var == this.i && !jm1Var3.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : hm1Var.o + j5) ? 1 : (j2 == ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : hm1Var.o + j5) ? 0 : -1)) >= 0))) ? false : true;
            }
            hm1Var2 = hm1Var;
            hm1Var = hm1Var.l;
            g73Var2 = g73Var;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jm1 a(g73 g73Var, jm1 jm1Var) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        int i;
        pm1 pm1Var = jm1Var.a;
        boolean z3 = !pm1Var.a() && pm1Var.e == -1;
        if (!pm1Var.a() && pm1Var.e == -1) {
            if (g73Var.a(g73Var.a(pm1Var.a, this.a).d, this.b, 0L).q == g73Var.a(pm1Var.a)) {
                z = true;
                boolean a = a(g73Var, pm1Var, z3);
                g73Var.a(jm1Var.a.a, this.a);
                long j3 = (!pm1Var.a() || (i = pm1Var.e) == -1) ? -9223372036854775807L : this.a.h.a(i).b;
                if (!pm1Var.a()) {
                    j = this.a.a(pm1Var.b, pm1Var.c);
                } else if (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) {
                    j = this.a.e;
                } else {
                    j2 = j3;
                    if (pm1Var.a()) {
                        z2 = this.a.h.a(pm1Var.b).h;
                    } else {
                        int i2 = pm1Var.e;
                        z2 = i2 != -1 && this.a.h.a(i2).h;
                    }
                    return new jm1(pm1Var, jm1Var.b, jm1Var.c, j3, j2, z2, z3, z, a);
                }
                j2 = j;
                if (pm1Var.a()) {
                }
                return new jm1(pm1Var, jm1Var.b, jm1Var.c, j3, j2, z2, z3, z, a);
            }
        }
        z = false;
        boolean a2 = a(g73Var, pm1Var, z3);
        g73Var.a(jm1Var.a.a, this.a);
        if (pm1Var.a()) {
        }
        if (!pm1Var.a()) {
        }
        j2 = j;
        if (pm1Var.a()) {
        }
        return new jm1(pm1Var, jm1Var.b, jm1Var.c, j3, j2, z2, z3, z, a2);
    }

    public static pm1 a(g73 g73Var, Object obj, long j, long j2, f73 f73Var, d73 d73Var) {
        Object obj2 = obj;
        g73Var.a(obj, d73Var);
        g73Var.a(d73Var.d, f73Var, 0L);
        int a = g73Var.a(obj);
        while (d73Var.e == 0) {
            p5 p5Var = d73Var.h;
            if (p5Var.b <= 0 || !p5Var.a(p5Var.e).h || d73Var.b(0L) != -1) {
                break;
            }
            int i = a + 1;
            if (a >= f73Var.q) {
                break;
            }
            g73Var.a(i, d73Var, true);
            obj2 = d73Var.c;
            obj2.getClass();
            a = i;
        }
        g73Var.a(obj2, d73Var);
        int b = d73Var.b(j);
        if (b == -1) {
            return new pm1(obj2, j2, d73Var.a(j));
        }
        return new pm1(obj2, b, d73Var.a(b), j2);
    }

    public final void a(h41 h41Var, pm1 pm1Var) {
        kd kdVar = this.c;
        um2 a = h41Var.a();
        wb0 wb0Var = (wb0) kdVar;
        vb0 vb0Var = wb0Var.d;
        xn0 xn0Var = wb0Var.g;
        xn0Var.getClass();
        vb0Var.getClass();
        vb0Var.b = l41.a(a);
        if (!a.isEmpty()) {
            vb0Var.e = (pm1) a.get(0);
            pm1Var.getClass();
            vb0Var.f = pm1Var;
        }
        if (vb0Var.d == null) {
            vb0Var.d = vb0.a(xn0Var, vb0Var.b, vb0Var.e, vb0Var.a);
        }
        xn0Var.q();
        vb0Var.a(xn0Var.b0.a);
    }

    public final pm1 a(g73 g73Var, Object obj, long j) {
        long j2;
        int a;
        Object obj2 = obj;
        int i = g73Var.a(obj2, this.a).d;
        Object obj3 = this.l;
        if (obj3 != null && (a = g73Var.a(obj3)) != -1 && g73Var.a(a, this.a, false).d == i) {
            j2 = this.m;
        } else {
            hm1 hm1Var = this.h;
            while (true) {
                if (hm1Var != null) {
                    if (hm1Var.b.equals(obj2)) {
                        j2 = hm1Var.f.a.d;
                        break;
                    }
                    hm1Var = hm1Var.l;
                } else {
                    hm1 hm1Var2 = this.h;
                    while (true) {
                        if (hm1Var2 != null) {
                            int a2 = g73Var.a(hm1Var2.b);
                            if (a2 != -1 && g73Var.a(a2, this.a, false).d == i) {
                                j2 = hm1Var2.f.a.d;
                                break;
                            }
                            hm1Var2 = hm1Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                }
            }
        }
        long j3 = j2;
        g73Var.a(obj2, this.a);
        g73Var.a(this.a.d, this.b, 0L);
        boolean z = false;
        for (int a3 = g73Var.a(obj); a3 >= this.b.p; a3--) {
            g73Var.a(a3, this.a, true);
            d73 d73Var = this.a;
            boolean z2 = d73Var.h.b > 0;
            z |= z2;
            if (d73Var.b(d73Var.e) != -1) {
                obj2 = this.a.c;
                obj2.getClass();
            }
            if (z && (!z2 || this.a.e != 0)) {
                break;
            }
        }
        return a(g73Var, obj2, j, j3, this.b, this.a);
    }

    public final boolean a(g73 g73Var) {
        hm1 hm1Var;
        hm1 hm1Var2 = this.h;
        if (hm1Var2 == null) {
            return true;
        }
        int a = g73Var.a(hm1Var2.b);
        while (true) {
            a = g73Var.a(a, this.a, this.b, this.f, this.g);
            while (true) {
                hm1Var = hm1Var2.l;
                if (hm1Var == null || hm1Var2.f.g) {
                    break;
                }
                hm1Var2 = hm1Var;
            }
            if (a == -1 || hm1Var == null || g73Var.a(hm1Var.b) != a) {
                break;
            }
            hm1Var2 = hm1Var;
        }
        boolean a2 = a(hm1Var2);
        hm1Var2.f = a(g73Var, hm1Var2.f);
        return !a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jm1 a(g73 g73Var, hm1 hm1Var, long j) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z2;
        long j8;
        jm1 jm1Var = hm1Var.f;
        long j9 = (hm1Var.o + jm1Var.e) - j;
        if (jm1Var.g) {
            int a = g73Var.a(g73Var.a(jm1Var.a.a), this.a, this.b, this.f, this.g);
            if (a == -1) {
                return null;
            }
            int i = g73Var.a(a, this.a, true).d;
            Object obj = this.a.c;
            obj.getClass();
            long j10 = jm1Var.a.d;
            long j11 = 0;
            if (g73Var.a(i, this.b, 0L).p == a) {
                Pair a2 = g73Var.a(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j9));
                if (a2 == null) {
                    return null;
                }
                obj = a2.first;
                long longValue = ((Long) a2.second).longValue();
                hm1 hm1Var2 = hm1Var.l;
                if (hm1Var2 != null && hm1Var2.b.equals(obj)) {
                    j8 = hm1Var2.f.a.d;
                } else {
                    j8 = this.e;
                    this.e = 1 + j8;
                }
                j5 = longValue;
                j11 = -9223372036854775807L;
                j10 = j8;
            } else {
                j5 = 0;
            }
            pm1 a3 = a(g73Var, obj, j5, j10, this.b, this.a);
            if (j11 != -9223372036854775807L && jm1Var.c != -9223372036854775807L) {
                if (g73Var.a(jm1Var.a.a, this.a).h.b > 0) {
                    p5 p5Var = this.a.h;
                    if (p5Var.a(p5Var.e).h) {
                        z2 = true;
                        if (!a3.a() && z2) {
                            j6 = jm1Var.c;
                            j7 = j5;
                            g73Var.a(a3.a, this.a);
                            if (a3.a()) {
                            }
                        } else if (z2) {
                            j7 = jm1Var.c;
                            j6 = j11;
                            g73Var.a(a3.a, this.a);
                            if (a3.a()) {
                                return a(g73Var, a3.a, a3.b, a3.c, j6, a3.d);
                            }
                            return a(g73Var, a3.a, j7, j6, a3.d);
                        }
                    }
                }
                z2 = false;
                if (!a3.a()) {
                }
                if (z2) {
                }
            }
            j6 = j11;
            j7 = j5;
            g73Var.a(a3.a, this.a);
            if (a3.a()) {
            }
        } else {
            pm1 pm1Var = jm1Var.a;
            g73Var.a(pm1Var.a, this.a);
            if (pm1Var.a()) {
                int i2 = pm1Var.b;
                int i3 = this.a.h.a(i2).c;
                if (i3 == -1) {
                    return null;
                }
                int a4 = this.a.h.a(i2).a(pm1Var.c);
                if (a4 < i3) {
                    return a(g73Var, pm1Var.a, i2, a4, jm1Var.c, pm1Var.d);
                }
                long j12 = jm1Var.c;
                if (j12 == -9223372036854775807L) {
                    f73 f73Var = this.b;
                    d73 d73Var = this.a;
                    Pair a5 = g73Var.a(f73Var, d73Var, d73Var.d, -9223372036854775807L, Math.max(0L, j9));
                    if (a5 == null) {
                        return null;
                    }
                    j12 = ((Long) a5.second).longValue();
                }
                Object obj2 = pm1Var.a;
                int i4 = pm1Var.b;
                g73Var.a(obj2, this.a);
                long j13 = this.a.h.a(i4).b;
                if (j13 == Long.MIN_VALUE) {
                    j4 = this.a.e;
                } else {
                    j4 = this.a.h.a(i4).g + j13;
                }
                return a(g73Var, pm1Var.a, Math.max(j4, j12), jm1Var.c, pm1Var.d);
            }
            int a6 = this.a.a(pm1Var.e);
            if (this.a.h.a(pm1Var.e).h) {
                o5 a7 = this.a.h.a(pm1Var.e);
                if ((a7.c != -1 ? a7.e[a6] : 0) == 3) {
                    z = true;
                    if (a6 == this.a.h.a(pm1Var.e).c && !z) {
                        return a(g73Var, pm1Var.a, pm1Var.e, a6, jm1Var.e, pm1Var.d);
                    }
                    Object obj3 = pm1Var.a;
                    int i5 = pm1Var.e;
                    g73Var.a(obj3, this.a);
                    j2 = this.a.h.a(i5).b;
                    if (j2 != Long.MIN_VALUE) {
                        j3 = this.a.e;
                    } else {
                        j3 = j2 + this.a.h.a(i5).g;
                    }
                    return a(g73Var, pm1Var.a, j3, jm1Var.e, pm1Var.d);
                }
            }
            z = false;
            if (a6 == this.a.h.a(pm1Var.e).c) {
            }
            Object obj32 = pm1Var.a;
            int i52 = pm1Var.e;
            g73Var.a(obj32, this.a);
            j2 = this.a.h.a(i52).b;
            if (j2 != Long.MIN_VALUE) {
            }
            return a(g73Var, pm1Var.a, j3, jm1Var.e, pm1Var.d);
        }
    }

    public final jm1 a(g73 g73Var, Object obj, int i, int i2, long j, long j2) {
        pm1 pm1Var = new pm1(obj, i, i2, j2);
        long a = g73Var.a(obj, this.a).a(i, i2);
        long j3 = i2 == this.a.a(i) ? this.a.h.c : 0L;
        return new jm1(pm1Var, (a == -9223372036854775807L || j3 < a) ? j3 : Math.max(0L, a - 1), j, -9223372036854775807L, a, this.a.h.a(i).h, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jm1 a(g73 g73Var, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long j5;
        long j6;
        g73Var.a(obj, this.a);
        int a = this.a.a(j);
        if (a == -1) {
            p5 p5Var = this.a.h;
            if (p5Var.b > 0 && p5Var.a(p5Var.e).h) {
                z = true;
            }
            z = false;
            break;
        }
        if (this.a.h.a(a).h) {
            long j7 = this.a.h.a(a).b;
            d73 d73Var = this.a;
            if (j7 == d73Var.e) {
                o5 a2 = d73Var.h.a(a);
                if (a2.c != -1) {
                    for (int i = 0; i < a2.c; i++) {
                        int i2 = a2.e[i];
                        if (i2 != 0 && i2 != 1) {
                        }
                    }
                    z = true;
                    a = -1;
                }
            }
        }
        z = false;
        break;
        pm1 pm1Var = new pm1(obj, j3, a);
        boolean z3 = !pm1Var.a() && a == -1;
        if (!pm1Var.a() && a == -1) {
            if (g73Var.a(g73Var.a(obj, this.a).d, this.b, 0L).q == g73Var.a(obj)) {
                z2 = true;
                boolean a3 = a(g73Var, pm1Var, z3);
                boolean z4 = a == -1 && this.a.h.a(a).h;
                if (a == -1) {
                    j4 = this.a.h.a(a).b;
                } else {
                    j4 = z ? this.a.e : -9223372036854775807L;
                }
                j5 = (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) ? this.a.e : j4;
                if (j5 != -9223372036854775807L || j < j5) {
                    j6 = j;
                } else {
                    j6 = Math.max(0L, j5 - ((a3 || !z) ? 1 : 0));
                }
                return new jm1(pm1Var, j6, j2, j4, j5, z4, z3, z2, a3);
            }
        }
        z2 = false;
        boolean a32 = a(g73Var, pm1Var, z3);
        if (a == -1) {
        }
        if (a == -1) {
        }
        if (j4 != -9223372036854775807L) {
        }
        if (j5 != -9223372036854775807L) {
        }
        j6 = j;
        return new jm1(pm1Var, j6, j2, j4, j5, z4, z3, z2, a32);
    }

    public final boolean a(g73 g73Var, pm1 pm1Var, boolean z) {
        int a = g73Var.a(pm1Var.a);
        return !g73Var.a(g73Var.a(a, this.a, false).d, this.b, 0L).j && g73Var.a(a, this.a, this.b, this.f, this.g) == -1 && z;
    }
}
