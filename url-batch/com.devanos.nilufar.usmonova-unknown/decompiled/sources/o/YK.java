package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class YK extends AbstractC2115vq {
    public static final YK r;
    public static final C2120vv s = new C2120vv(27);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public int k;
    public WK l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public XK f133o;
    public byte p;
    public int q;

    static {
        YK yk = new YK();
        r = yk;
        yk.j = 0;
        yk.k = 0;
        yk.l = WK.ERROR;
        yk.m = 0;
        yk.n = 0;
        yk.f133o = XK.LANGUAGE_VERSION;
    }

    public YK() {
        this.p = (byte) -1;
        this.q = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        if (this.p == 1) {
            return true;
        }
        this.p = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.q;
        if (i != -1) {
            return i;
        }
        int c = (this.i & 1) == 1 ? M5.c(1, this.j) : 0;
        if ((this.i & 2) == 2) {
            c += M5.c(2, this.k);
        }
        if ((this.i & 4) == 4) {
            c += M5.b(3, this.l.h);
        }
        if ((this.i & 8) == 8) {
            c += M5.c(4, this.m);
        }
        if ((this.i & 16) == 16) {
            c += M5.c(5, this.n);
        }
        if ((this.i & 32) == 32) {
            c += M5.b(6, this.f133o.h);
        }
        int size = this.h.size() + c;
        this.q = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return VK.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        VK g = VK.g();
        g.h(this);
        return g;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        if ((this.i & 1) == 1) {
            m5.u(1, this.j);
        }
        if ((this.i & 2) == 2) {
            m5.u(2, this.k);
        }
        if ((this.i & 4) == 4) {
            m5.t(3, this.l.h);
        }
        if ((this.i & 8) == 8) {
            m5.u(4, this.m);
        }
        if ((this.i & 16) == 16) {
            m5.u(5, this.n);
        }
        if ((this.i & 32) == 32) {
            m5.t(6, this.f133o.h);
        }
        m5.z(this.h);
    }

    public YK(C0523Ub c0523Ub) {
        this.p = (byte) -1;
        this.q = -1;
        boolean z = false;
        this.j = 0;
        this.k = 0;
        WK wk = WK.ERROR;
        this.l = wk;
        this.m = 0;
        this.n = 0;
        XK xk = XK.LANGUAGE_VERSION;
        this.f133o = xk;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.i |= 1;
                            this.j = c0523Ub.k();
                        } else if (n != 16) {
                            XK xk2 = null;
                            WK wk2 = null;
                            if (n == 24) {
                                int k = c0523Ub.k();
                                if (k == 0) {
                                    wk2 = WK.WARNING;
                                } else if (k == 1) {
                                    wk2 = wk;
                                } else if (k == 2) {
                                    wk2 = WK.HIDDEN;
                                }
                                if (wk2 == null) {
                                    o2.D(n);
                                    o2.D(k);
                                } else {
                                    this.i |= 4;
                                    this.l = wk2;
                                }
                            } else if (n == 32) {
                                this.i |= 8;
                                this.m = c0523Ub.k();
                            } else if (n == 40) {
                                this.i |= 16;
                                this.n = c0523Ub.k();
                            } else if (n != 48) {
                                if (!c0523Ub.q(n, o2)) {
                                }
                            } else {
                                int k2 = c0523Ub.k();
                                if (k2 == 0) {
                                    xk2 = xk;
                                } else if (k2 == 1) {
                                    xk2 = XK.COMPILER_VERSION;
                                } else if (k2 == 2) {
                                    xk2 = XK.API_VERSION;
                                }
                                if (xk2 == null) {
                                    o2.D(n);
                                    o2.D(k2);
                                } else {
                                    this.i |= 32;
                                    this.f133o = xk2;
                                }
                            }
                        } else {
                            this.i |= 2;
                            this.k = c0523Ub.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        o2.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.h = c1217i9.j();
                        throw th2;
                    }
                    this.h = c1217i9.j();
                    throw th;
                }
            } catch (C0204Ht e) {
                e.h = this;
                throw e;
            } catch (IOException e2) {
                C0204Ht c0204Ht = new C0204Ht(e2.getMessage());
                c0204Ht.h = this;
                throw c0204Ht;
            }
        }
        try {
            o2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.h = c1217i9.j();
            throw th3;
        }
        this.h = c1217i9.j();
    }

    public YK(VK vk) {
        this.p = (byte) -1;
        this.q = -1;
        this.h = vk.h;
    }
}
