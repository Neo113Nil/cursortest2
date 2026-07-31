package yads;

import android.os.Handler;
import android.util.Pair;

/* loaded from: classes15.dex */
public final class oi1 extends my {
    public final ao k;
    public final boolean l;
    public final f73 m;
    public final d73 n;
    public mi1 o;
    public li1 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public oi1(ao aoVar, boolean z) {
        boolean z2;
        this.k = aoVar;
        if (z) {
            aoVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new f73();
        this.n = new d73();
        aoVar.getClass();
        this.o = new mi1(new ni1(aoVar.c()), f73.s, mi1.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d9  */
    @Override // yads.my
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, ao aoVar, g73 g73Var) {
        mi1 mi1Var;
        pm1 a;
        mi1 mi1Var2;
        if (this.r) {
            mi1 mi1Var3 = this.o;
            this.o = new mi1(g73Var, mi1Var3.d, mi1Var3.e);
            li1 li1Var = this.p;
            if (li1Var != null) {
                a(li1Var.i);
            }
        } else if (g73Var.c()) {
            if (this.s) {
                mi1 mi1Var4 = this.o;
                mi1Var2 = new mi1(g73Var, mi1Var4.d, mi1Var4.e);
            } else {
                mi1Var2 = new mi1(g73Var, f73.s, mi1.f);
            }
            this.o = mi1Var2;
        } else {
            g73Var.a(0, this.m, 0L);
            f73 f73Var = this.m;
            long j = f73Var.n;
            Object obj2 = f73Var.b;
            li1 li1Var2 = this.p;
            if (li1Var2 != null) {
                long j2 = li1Var2.c;
                mi1 mi1Var5 = this.o;
                Object obj3 = li1Var2.b.a;
                mi1Var5.a(mi1Var5.a(obj3), this.n, true);
                long j3 = this.n.f + j2;
                if (j3 != this.o.a(0, this.m, 0L).n) {
                    j = j3;
                }
            }
            Pair a2 = g73Var.a(this.m, this.n, 0, j);
            Object obj4 = a2.first;
            long longValue = ((Long) a2.second).longValue();
            if (this.s) {
                mi1 mi1Var6 = this.o;
                mi1Var = new mi1(g73Var, mi1Var6.d, mi1Var6.e);
            } else {
                mi1Var = new mi1(g73Var, obj2, obj4);
            }
            this.o = mi1Var;
            li1 li1Var3 = this.p;
            if (li1Var3 != null) {
                a(longValue);
                pm1 pm1Var = li1Var3.b;
                Object obj5 = pm1Var.a;
                if (this.o.e != null && obj5.equals(mi1.f)) {
                    obj5 = this.o.e;
                }
                a = pm1Var.a(obj5);
                this.s = true;
                this.r = true;
                a(this.o);
                if (a == null) {
                    li1 li1Var4 = this.p;
                    li1Var4.getClass();
                    li1Var4.a(a);
                    return;
                }
                return;
            }
        }
        a = null;
        this.s = true;
        this.r = true;
        a(this.o);
        if (a == null) {
        }
    }

    @Override // yads.ao
    public final wl1 c() {
        return this.k.c();
    }

    @Override // yads.my, yads.ao
    public final void d() {
    }

    @Override // yads.my, yads.ao
    public final void e() {
        this.r = false;
        this.q = false;
        super.e();
    }

    @Override // yads.my
    public final pm1 a(Object obj, pm1 pm1Var) {
        Object obj2 = pm1Var.a;
        Object obj3 = this.o.e;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = mi1.f;
        }
        return pm1Var.a(obj2);
    }

    @Override // yads.ao
    public final void a(h93 h93Var) {
        this.j = h93Var;
        this.i = sb3.a((Handler.Callback) null);
        if (this.l) {
            return;
        }
        this.q = true;
        a((Object) null, this.k);
    }

    @Override // yads.ao
    public final void a(gm1 gm1Var) {
        li1 li1Var = (li1) gm1Var;
        if (li1Var.f != null) {
            ao aoVar = li1Var.e;
            aoVar.getClass();
            aoVar.a(li1Var.f);
        }
        if (gm1Var == this.p) {
            this.p = null;
        }
    }

    public final void a(long j) {
        li1 li1Var = this.p;
        int a = this.o.a(li1Var.b.a);
        if (a == -1) {
            return;
        }
        long j2 = this.o.a(a, this.n, false).e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        li1Var.i = j;
    }

    @Override // yads.ao
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final li1 a(pm1 pm1Var, ub0 ub0Var, long j) {
        li1 li1Var = new li1(pm1Var, ub0Var, j);
        ao aoVar = this.k;
        if (li1Var.e == null) {
            li1Var.e = aoVar;
            if (this.r) {
                Object obj = pm1Var.a;
                if (this.o.e != null && obj.equals(mi1.f)) {
                    obj = this.o.e;
                }
                li1Var.a(pm1Var.a(obj));
            } else {
                this.p = li1Var;
                if (!this.q) {
                    this.q = true;
                    a((Object) null, aoVar);
                }
            }
            return li1Var;
        }
        throw new IllegalStateException();
    }
}
