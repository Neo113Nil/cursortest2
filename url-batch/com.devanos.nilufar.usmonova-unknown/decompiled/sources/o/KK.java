package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class KK extends AbstractC2115vq {

    /* renamed from: o, reason: collision with root package name */
    public static final KK f57o;
    public static final C2120vv p = new C2120vv(22);
    public final AbstractC1281j9 h;
    public int i;
    public JK j;
    public MK k;
    public int l;
    public byte m;
    public int n;

    static {
        KK kk = new KK();
        f57o = kk;
        kk.j = JK.INV;
        kk.k = MK.A;
        kk.l = 0;
    }

    public KK() {
        this.m = (byte) -1;
        this.n = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.i & 2) != 2 || this.k.b()) {
            this.m = (byte) 1;
            return true;
        }
        this.m = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int b = (this.i & 1) == 1 ? M5.b(1, this.j.h) : 0;
        if ((this.i & 2) == 2) {
            b += M5.e(2, this.k);
        }
        if ((this.i & 4) == 4) {
            b += M5.c(3, this.l);
        }
        int size = this.h.size() + b;
        this.n = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return IK.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        IK g = IK.g();
        g.h(this);
        return g;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        if ((this.i & 1) == 1) {
            m5.t(1, this.j.h);
        }
        if ((this.i & 2) == 2) {
            m5.w(2, this.k);
        }
        if ((this.i & 4) == 4) {
            m5.u(3, this.l);
        }
        m5.z(this.h);
    }

    public KK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.m = (byte) -1;
        this.n = -1;
        JK jk = JK.INV;
        this.j = jk;
        this.k = MK.A;
        boolean z = false;
        this.l = 0;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        LK lk = null;
                        JK jk2 = null;
                        if (n == 8) {
                            int k = c0523Ub.k();
                            if (k == 0) {
                                jk2 = JK.IN;
                            } else if (k == 1) {
                                jk2 = JK.OUT;
                            } else if (k == 2) {
                                jk2 = jk;
                            } else if (k == 3) {
                                jk2 = JK.STAR;
                            }
                            if (jk2 == null) {
                                o2.D(n);
                                o2.D(k);
                            } else {
                                this.i |= 1;
                                this.j = jk2;
                            }
                        } else if (n == 18) {
                            if ((this.i & 2) == 2) {
                                MK mk = this.k;
                                mk.getClass();
                                lk = MK.r(mk);
                            }
                            MK mk2 = (MK) c0523Ub.g(MK.B, c1649ol);
                            this.k = mk2;
                            if (lk != null) {
                                lk.i(mk2);
                                this.k = lk.g();
                            }
                            this.i |= 2;
                        } else if (n != 24) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            this.i |= 4;
                            this.l = c0523Ub.k();
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

    public KK(IK ik) {
        this.m = (byte) -1;
        this.n = -1;
        this.h = ik.h;
    }
}
