package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class RK extends AbstractC1917sq {
    public static final RK t;
    public static final C2120vv u = new C2120vv(24);
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public QK n;

    /* renamed from: o, reason: collision with root package name */
    public List f96o;
    public List p;
    public int q;
    public byte r;
    public int s;

    static {
        RK rk = new RK();
        t = rk;
        rk.k = 0;
        rk.l = 0;
        rk.m = false;
        rk.n = QK.INV;
        List list = Collections.EMPTY_LIST;
        rk.f96o = list;
        rk.p = list;
    }

    public RK(PK pk) {
        super(pk);
        this.q = -1;
        this.r = (byte) -1;
        this.s = -1;
        this.i = pk.h;
    }

    @Override // o.EC
    public final E a() {
        return t;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.j;
        if ((i & 1) != 1) {
            this.r = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.r = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f96o.size(); i2++) {
            if (!((MK) this.f96o.get(i2)).b()) {
                this.r = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.r = (byte) 1;
            return true;
        }
        this.r = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.s;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 1) == 1 ? M5.c(1, this.k) : 0;
        if ((this.j & 2) == 2) {
            c += M5.c(2, this.l);
        }
        if ((this.j & 4) == 4) {
            c += M5.i(3) + 1;
        }
        if ((this.j & 8) == 8) {
            c += M5.b(4, this.n.h);
        }
        for (int i2 = 0; i2 < this.f96o.size(); i2++) {
            c += M5.e(5, (E) this.f96o.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            i3 += M5.d(((Integer) this.p.get(i4)).intValue());
        }
        int i5 = c + i3;
        if (!this.p.isEmpty()) {
            i5 = i5 + 1 + M5.d(i3);
        }
        this.q = i3;
        int size = this.i.size() + j() + i5;
        this.s = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return PK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        PK h = PK.h();
        h.i(this);
        return h;
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
            boolean z = this.m;
            m5.F(3, 0);
            m5.y(z ? 1 : 0);
        }
        if ((this.j & 8) == 8) {
            m5.t(4, this.n.h);
        }
        for (int i = 0; i < this.f96o.size(); i++) {
            m5.w(5, (E) this.f96o.get(i));
        }
        if (this.p.size() > 0) {
            m5.D(50);
            m5.D(this.q);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            m5.v(((Integer) this.p.get(i2)).intValue());
        }
        c2002u5.g0(1000, m5);
        m5.z(this.i);
    }

    public RK() {
        this.q = -1;
        this.r = (byte) -1;
        this.s = -1;
        this.i = AbstractC1281j9.h;
    }

    public RK(C0523Ub c0523Ub, C1649ol c1649ol) {
        QK qk;
        this.q = -1;
        this.r = (byte) -1;
        this.s = -1;
        this.k = 0;
        this.l = 0;
        this.m = false;
        QK qk2 = QK.INV;
        this.n = qk2;
        List list = Collections.EMPTY_LIST;
        this.f96o = list;
        this.p = list;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.j |= 1;
                            this.k = c0523Ub.k();
                        } else if (n == 16) {
                            this.j |= 2;
                            this.l = c0523Ub.k();
                        } else if (n == 24) {
                            this.j |= 4;
                            this.m = c0523Ub.l() != 0;
                        } else if (n == 32) {
                            int k = c0523Ub.k();
                            if (k == 0) {
                                qk = QK.IN;
                            } else if (k != 1) {
                                qk = k != 2 ? null : qk2;
                            } else {
                                qk = QK.OUT;
                            }
                            if (qk == null) {
                                o2.D(n);
                                o2.D(k);
                            } else {
                                this.j |= 8;
                                this.n = qk;
                            }
                        } else if (n == 42) {
                            if ((i & 16) != 16) {
                                this.f96o = new ArrayList();
                                i |= 16;
                            }
                            this.f96o.add(c0523Ub.g(MK.B, c1649ol));
                        } else if (n == 48) {
                            if ((i & 32) != 32) {
                                this.p = new ArrayList();
                                i |= 32;
                            }
                            this.p.add(Integer.valueOf(c0523Ub.k()));
                        } else if (n != 50) {
                            if (!n(c0523Ub, o2, c1649ol, n)) {
                            }
                        } else {
                            int d = c0523Ub.d(c0523Ub.k());
                            if ((i & 32) != 32 && c0523Ub.b() > 0) {
                                this.p = new ArrayList();
                                i |= 32;
                            }
                            while (c0523Ub.b() > 0) {
                                this.p.add(Integer.valueOf(c0523Ub.k()));
                            }
                            c0523Ub.c(d);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.f96o = Collections.unmodifiableList(this.f96o);
                    }
                    if ((i & 32) == 32) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
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
        if ((i & 16) == 16) {
            this.f96o = Collections.unmodifiableList(this.f96o);
        }
        if ((i & 32) == 32) {
            this.p = Collections.unmodifiableList(this.p);
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
