package com.monetization.ads.exo.source.dash;

import yads.d73;
import yads.e30;
import yads.f73;
import yads.g73;
import yads.k30;
import yads.oh;
import yads.oo2;
import yads.p5;
import yads.ql1;
import yads.sb3;
import yads.sc2;
import yads.ta;
import yads.wl1;

/* loaded from: classes4.dex */
public final class b extends g73 {
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final e30 j;
    public final wl1 k;
    public final ql1 l;

    public b(long j, long j2, long j3, int i, long j4, long j5, long j6, e30 e30Var, wl1 wl1Var, ql1 ql1Var) {
        if (e30Var.d != (ql1Var != null)) {
            throw new IllegalStateException();
        }
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = e30Var;
        this.k = wl1Var;
        this.l = ql1Var;
    }

    @Override // yads.g73
    public final int a() {
        return this.j.m.size();
    }

    @Override // yads.g73
    public final int b() {
        return 1;
    }

    @Override // yads.g73
    public final d73 a(int i, d73 d73Var, boolean z) {
        oh.a(i, a());
        String str = z ? ((sc2) this.j.m.get(i)).a : null;
        Integer valueOf = z ? Integer.valueOf(this.f + i) : null;
        long a = sb3.a(this.j.a(i));
        long a2 = sb3.a(((sc2) this.j.m.get(i)).b - ((sc2) this.j.m.get(0)).b) - this.g;
        d73Var.getClass();
        return d73Var.a(str, valueOf, 0, a, a2, p5.g, false);
    }

    @Override // yads.g73
    public final f73 a(int i, f73 f73Var, long j) {
        long j2;
        k30 d;
        oh.a(i, 1);
        long j3 = this.i;
        e30 e30Var = this.j;
        if (e30Var.d && e30Var.e != -9223372036854775807L && e30Var.b == -9223372036854775807L) {
            if (j > 0) {
                j3 += j;
                if (j3 > this.h) {
                    j2 = -9223372036854775807L;
                    Object obj = f73.s;
                    wl1 wl1Var = this.k;
                    e30 e30Var2 = this.j;
                    return f73Var.a(obj, wl1Var, e30Var2, this.c, this.d, this.e, true, (e30Var2.d || e30Var2.e == -9223372036854775807L || e30Var2.b != -9223372036854775807L) ? false : true, this.l, j2, this.h, 0, a() - 1, this.g);
                }
            }
            long j4 = this.g + j3;
            long a = sb3.a(e30Var.a(0));
            int i2 = 0;
            while (i2 < this.j.m.size() - 1 && j4 >= a) {
                j4 -= a;
                i2++;
                a = sb3.a(this.j.a(i2));
            }
            sc2 sc2Var = (sc2) this.j.m.get(i2);
            int size = sc2Var.c.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((ta) sc2Var.c.get(i3)).b == 2) {
                    break;
                }
                i3++;
            }
            if (i3 != -1 && (d = ((oo2) ((ta) sc2Var.c.get(i3)).c.get(0)).d()) != null && d.c(a) != 0) {
                j3 = (d.a(d.a(j4, a)) + j3) - j4;
            }
        }
        j2 = j3;
        Object obj2 = f73.s;
        wl1 wl1Var2 = this.k;
        e30 e30Var22 = this.j;
        return f73Var.a(obj2, wl1Var2, e30Var22, this.c, this.d, this.e, true, (e30Var22.d || e30Var22.e == -9223372036854775807L || e30Var22.b != -9223372036854775807L) ? false : true, this.l, j2, this.h, 0, a() - 1, this.g);
    }

    @Override // yads.g73
    public final int a(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f) >= 0 && intValue < a()) {
            return intValue;
        }
        return -1;
    }

    @Override // yads.g73
    public final Object a(int i) {
        oh.a(i, a());
        return Integer.valueOf(this.f + i);
    }
}
