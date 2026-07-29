package o;

import java.io.IOException;

/* renamed from: o.Av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024Av extends AbstractC2115vq {
    public static final C0024Av q;
    public static final C2120vv r = new C2120vv(2);
    public final AbstractC1281j9 h;
    public int i;
    public C2252xv j;
    public C2318yv k;
    public C2318yv l;
    public C2318yv m;
    public C2318yv n;

    /* renamed from: o, reason: collision with root package name */
    public byte f15o;
    public int p;

    static {
        C0024Av c0024Av = new C0024Av();
        q = c0024Av;
        c0024Av.j = C2252xv.n;
        C2318yv c2318yv = C2318yv.n;
        c0024Av.k = c2318yv;
        c0024Av.l = c2318yv;
        c0024Av.m = c2318yv;
        c0024Av.n = c2318yv;
    }

    public C0024Av() {
        this.f15o = (byte) -1;
        this.p = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        if (this.f15o == 1) {
            return true;
        }
        this.f15o = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int e = (this.i & 1) == 1 ? M5.e(1, this.j) : 0;
        if ((this.i & 2) == 2) {
            e += M5.e(2, this.k);
        }
        if ((this.i & 4) == 4) {
            e += M5.e(3, this.l);
        }
        if ((this.i & 8) == 8) {
            e += M5.e(4, this.m);
        }
        if ((this.i & 16) == 16) {
            e += M5.e(5, this.n);
        }
        int size = this.h.size() + e;
        this.p = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C2384zv.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C2384zv g = C2384zv.g();
        g.h(this);
        return g;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        if ((this.i & 1) == 1) {
            m5.w(1, this.j);
        }
        if ((this.i & 2) == 2) {
            m5.w(2, this.k);
        }
        if ((this.i & 4) == 4) {
            m5.w(3, this.l);
        }
        if ((this.i & 8) == 8) {
            m5.w(4, this.m);
        }
        if ((this.i & 16) == 16) {
            m5.w(5, this.n);
        }
        m5.z(this.h);
    }

    public C0024Av(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.f15o = (byte) -1;
        this.p = -1;
        this.j = C2252xv.n;
        C2318yv c2318yv = C2318yv.n;
        this.k = c2318yv;
        this.l = c2318yv;
        this.m = c2318yv;
        this.n = c2318yv;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        C2186wv c2186wv = null;
                        if (n == 10) {
                            if ((this.i & 1) == 1) {
                                C2252xv c2252xv = this.j;
                                c2252xv.getClass();
                                c2186wv = new C2186wv(0);
                                c2186wv.h(c2252xv);
                            }
                            C2252xv c2252xv2 = (C2252xv) c0523Ub.g(C2252xv.f244o, c1649ol);
                            this.j = c2252xv2;
                            if (c2186wv != null) {
                                c2186wv.h(c2252xv2);
                                this.j = c2186wv.f();
                            }
                            this.i |= 1;
                        } else if (n == 18) {
                            if ((this.i & 2) == 2) {
                                C2318yv c2318yv2 = this.k;
                                c2318yv2.getClass();
                                c2186wv = C2318yv.i(c2318yv2);
                            }
                            C2318yv c2318yv3 = (C2318yv) c0523Ub.g(C2318yv.f250o, c1649ol);
                            this.k = c2318yv3;
                            if (c2186wv != null) {
                                c2186wv.i(c2318yv3);
                                this.k = c2186wv.g();
                            }
                            this.i |= 2;
                        } else if (n == 26) {
                            if ((this.i & 4) == 4) {
                                C2318yv c2318yv4 = this.l;
                                c2318yv4.getClass();
                                c2186wv = C2318yv.i(c2318yv4);
                            }
                            C2318yv c2318yv5 = (C2318yv) c0523Ub.g(C2318yv.f250o, c1649ol);
                            this.l = c2318yv5;
                            if (c2186wv != null) {
                                c2186wv.i(c2318yv5);
                                this.l = c2186wv.g();
                            }
                            this.i |= 4;
                        } else if (n == 34) {
                            if ((this.i & 8) == 8) {
                                C2318yv c2318yv6 = this.m;
                                c2318yv6.getClass();
                                c2186wv = C2318yv.i(c2318yv6);
                            }
                            C2318yv c2318yv7 = (C2318yv) c0523Ub.g(C2318yv.f250o, c1649ol);
                            this.m = c2318yv7;
                            if (c2186wv != null) {
                                c2186wv.i(c2318yv7);
                                this.m = c2186wv.g();
                            }
                            this.i |= 8;
                        } else if (n != 42) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            if ((this.i & 16) == 16) {
                                C2318yv c2318yv8 = this.n;
                                c2318yv8.getClass();
                                c2186wv = C2318yv.i(c2318yv8);
                            }
                            C2318yv c2318yv9 = (C2318yv) c0523Ub.g(C2318yv.f250o, c1649ol);
                            this.n = c2318yv9;
                            if (c2186wv != null) {
                                c2186wv.i(c2318yv9);
                                this.n = c2186wv.g();
                            }
                            this.i |= 16;
                        }
                    }
                    z = true;
                } catch (C0204Ht e) {
                    e.h = this;
                    throw e;
                } catch (IOException e2) {
                    C0204Ht c0204Ht = new C0204Ht(e2.getMessage());
                    c0204Ht.h = this;
                    throw c0204Ht;
                }
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

    public C0024Av(C2384zv c2384zv) {
        this.f15o = (byte) -1;
        this.p = -1;
        this.h = c2384zv.h;
    }
}
