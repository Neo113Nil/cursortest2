package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class UK extends AbstractC1917sq {
    public static final UK s;
    public static final C2120vv t = new C2120vv(26);
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public int l;
    public MK m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public MK f115o;
    public int p;
    public byte q;
    public int r;

    static {
        UK uk = new UK();
        s = uk;
        uk.k = 0;
        uk.l = 0;
        MK mk = MK.A;
        uk.m = mk;
        uk.n = 0;
        uk.f115o = mk;
        uk.p = 0;
    }

    public UK(TK tk) {
        super(tk);
        this.q = (byte) -1;
        this.r = -1;
        this.i = tk.h;
    }

    @Override // o.EC
    public final E a() {
        return s;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.j;
        if ((i & 2) != 2) {
            this.q = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.m.b()) {
            this.q = (byte) 0;
            return false;
        }
        if ((this.j & 16) == 16 && !this.f115o.b()) {
            this.q = (byte) 0;
            return false;
        }
        if (i()) {
            this.q = (byte) 1;
            return true;
        }
        this.q = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 1) == 1 ? M5.c(1, this.k) : 0;
        if ((this.j & 2) == 2) {
            c += M5.c(2, this.l);
        }
        if ((this.j & 4) == 4) {
            c += M5.e(3, this.m);
        }
        if ((this.j & 16) == 16) {
            c += M5.e(4, this.f115o);
        }
        if ((this.j & 8) == 8) {
            c += M5.c(5, this.n);
        }
        if ((this.j & 32) == 32) {
            c += M5.c(6, this.p);
        }
        int size = this.i.size() + j() + c;
        this.r = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        TK tk = new TK();
        MK mk = MK.A;
        tk.n = mk;
        tk.p = mk;
        return tk;
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        TK tk = new TK();
        MK mk = MK.A;
        tk.n = mk;
        tk.p = mk;
        tk.h(this);
        return tk;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        if ((this.j & 1) == 1) {
            m5.u(1, this.k);
        }
        if ((this.j & 2) == 2) {
            m5.u(2, this.l);
        }
        if ((this.j & 4) == 4) {
            m5.w(3, this.m);
        }
        if ((this.j & 16) == 16) {
            m5.w(4, this.f115o);
        }
        if ((this.j & 8) == 8) {
            m5.u(5, this.n);
        }
        if ((this.j & 32) == 32) {
            m5.u(6, this.p);
        }
        c2002u5.g0(200, m5);
        m5.z(this.i);
    }

    public UK() {
        this.q = (byte) -1;
        this.r = -1;
        this.i = AbstractC1281j9.h;
    }

    public UK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.q = (byte) -1;
        this.r = -1;
        boolean z = false;
        this.k = 0;
        this.l = 0;
        MK mk = MK.A;
        this.m = mk;
        this.n = 0;
        this.f115o = mk;
        this.p = 0;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.j |= 1;
                            this.k = c0523Ub.k();
                        } else if (n != 16) {
                            LK lk = null;
                            if (n == 26) {
                                if ((this.j & 4) == 4) {
                                    MK mk2 = this.m;
                                    mk2.getClass();
                                    lk = MK.r(mk2);
                                }
                                MK mk3 = (MK) c0523Ub.g(MK.B, c1649ol);
                                this.m = mk3;
                                if (lk != null) {
                                    lk.i(mk3);
                                    this.m = lk.g();
                                }
                                this.j |= 4;
                            } else if (n == 34) {
                                if ((this.j & 16) == 16) {
                                    MK mk4 = this.f115o;
                                    mk4.getClass();
                                    lk = MK.r(mk4);
                                }
                                MK mk5 = (MK) c0523Ub.g(MK.B, c1649ol);
                                this.f115o = mk5;
                                if (lk != null) {
                                    lk.i(mk5);
                                    this.f115o = lk.g();
                                }
                                this.j |= 16;
                            } else if (n == 40) {
                                this.j |= 8;
                                this.n = c0523Ub.k();
                            } else if (n != 48) {
                                if (!n(c0523Ub, o2, c1649ol, n)) {
                                }
                            } else {
                                this.j |= 32;
                                this.p = c0523Ub.k();
                            }
                        } else {
                            this.j |= 2;
                            this.l = c0523Ub.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        o2.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.i = c1217i9.j();
                        throw th2;
                    }
                    this.i = c1217i9.j();
                    m();
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
            this.i = c1217i9.j();
            throw th3;
        }
        this.i = c1217i9.j();
        m();
    }
}
