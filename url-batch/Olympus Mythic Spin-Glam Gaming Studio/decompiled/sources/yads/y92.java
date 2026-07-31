package yads;

/* loaded from: classes15.dex */
public final class y92 implements tp0 {
    public wp0 a;
    public k43 b;
    public boolean c;

    static {
        new yp0() { // from class: yads.y92$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return y92.a();
            }
        };
    }

    public static /* synthetic */ tp0[] a() {
        return new tp0[]{new y92()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        try {
            return a((pd0) up0Var);
        } catch (cc2 unused) {
            return false;
        }
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.a = wp0Var;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        k43 k43Var = this.b;
        if (k43Var != null) {
            z92 z92Var = k43Var.a;
            aa2 aa2Var = z92Var.a;
            aa2Var.a = 0;
            aa2Var.b = 0L;
            aa2Var.c = 0;
            aa2Var.d = 0;
            aa2Var.e = 0;
            z92Var.b.c(0);
            z92Var.c = -1;
            z92Var.e = false;
            if (j == 0) {
                k43Var.a(!k43Var.l);
                return;
            }
            if (k43Var.h != 0) {
                long j3 = (k43Var.i * j2) / 1000000;
                k43Var.e = j3;
                ba2 ba2Var = k43Var.d;
                int i = sb3.a;
                ba2Var.a(j3);
                k43Var.h = 2;
            }
        }
    }

    @Override // yads.tp0
    public final int a(up0 up0Var, dg2 dg2Var) {
        int i;
        if (this.a != null) {
            if (this.b == null) {
                pd0 pd0Var = (pd0) up0Var;
                if (a(pd0Var)) {
                    pd0Var.f = 0;
                } else {
                    throw new cc2("Failed to determine bitstream type", null, true, 1);
                }
            }
            if (!this.c) {
                c83 a = this.a.a(0, 1);
                this.a.a();
                k43 k43Var = this.b;
                k43Var.c = this.a;
                k43Var.b = a;
                k43Var.a(true);
                this.c = true;
            }
            k43 k43Var2 = this.b;
            if (k43Var2.b != null) {
                int i2 = sb3.a;
                int i3 = k43Var2.h;
                if (i3 == 0) {
                    while (true) {
                        pd0 pd0Var2 = (pd0) up0Var;
                        if (!k43Var2.a.a(pd0Var2)) {
                            k43Var2.h = 3;
                            break;
                        }
                        long j = pd0Var2.d;
                        long j2 = k43Var2.f;
                        k43Var2.k = j - j2;
                        if (k43Var2.a(k43Var2.a.b, j2, k43Var2.j)) {
                            k43Var2.f = pd0Var2.d;
                        } else {
                            jw0 jw0Var = k43Var2.j.a;
                            k43Var2.i = jw0Var.A;
                            if (!k43Var2.m) {
                                k43Var2.b.a(jw0Var);
                                k43Var2.m = true;
                            }
                            tu0 tu0Var = k43Var2.j.b;
                            if (tu0Var != null) {
                                k43Var2.d = tu0Var;
                            } else {
                                long j3 = pd0Var2.c;
                                if (j3 == -1) {
                                    k43Var2.d = new j43();
                                } else {
                                    aa2 aa2Var = k43Var2.a.a;
                                    i = 2;
                                    k43Var2.d = new ne0(k43Var2, k43Var2.f, j3, aa2Var.d + aa2Var.e, aa2Var.b, (aa2Var.a & 4) != 0);
                                    k43Var2.h = i;
                                    k43Var2.a.a();
                                    return 0;
                                }
                            }
                            i = 2;
                            k43Var2.h = i;
                            k43Var2.a.a();
                            return 0;
                        }
                    }
                } else {
                    if (i3 == 1) {
                        ((pd0) up0Var).a((int) k43Var2.f);
                        k43Var2.h = 2;
                        return 0;
                    }
                    if (i3 == 2) {
                        pd0 pd0Var3 = (pd0) up0Var;
                        long a2 = k43Var2.d.a(pd0Var3);
                        if (a2 >= 0) {
                            dg2Var.a = a2;
                            return 1;
                        }
                        if (a2 < -1) {
                            k43Var2.a(-(a2 + 2));
                        }
                        if (!k43Var2.l) {
                            mx2 a3 = k43Var2.d.a();
                            if (a3 != null) {
                                k43Var2.c.a(a3);
                                k43Var2.l = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        if (k43Var2.k <= 0 && !k43Var2.a.a(pd0Var3)) {
                            k43Var2.h = 3;
                        } else {
                            k43Var2.k = 0L;
                            xb2 xb2Var = k43Var2.a.b;
                            long a4 = k43Var2.a(xb2Var);
                            if (a4 >= 0) {
                                long j4 = k43Var2.g;
                                if (j4 + a4 >= k43Var2.e) {
                                    k43Var2.b.a(xb2Var.c, xb2Var);
                                    k43Var2.b.a((j4 * 1000000) / k43Var2.i, 1, xb2Var.c, 0, null);
                                    k43Var2.e = -1L;
                                }
                            }
                            k43Var2.g += a4;
                            return 0;
                        }
                    } else if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                }
                return -1;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final boolean a(pd0 pd0Var) {
        boolean z;
        aa2 aa2Var = new aa2();
        if (aa2Var.a(pd0Var, true) && (aa2Var.a & 2) == 2) {
            int min = Math.min(aa2Var.e, 8);
            xb2 xb2Var = new xb2(min);
            pd0Var.b(xb2Var.a, 0, min, false);
            xb2Var.e(0);
            if (xb2Var.c - xb2Var.b >= 5 && xb2Var.k() == 127 && xb2Var.l() == 1179402563) {
                this.b = new uu0();
            } else {
                xb2Var.e(0);
                try {
                    z = dn3.a(1, xb2Var, true);
                } catch (cc2 unused) {
                    z = false;
                }
                if (z) {
                    this.b = new zm3();
                } else {
                    xb2Var.e(0);
                    if (eb2.a(xb2Var, eb2.o)) {
                        this.b = new eb2();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
