package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AK extends AbstractC1917sq {
    public static final AK q;
    public static final C2120vv r = new C2120vv(16);
    public final AbstractC1281j9 i;
    public int j;
    public HK k;
    public GK l;
    public C2281yK m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public byte f11o;
    public int p;

    static {
        AK ak = new AK();
        q = ak;
        ak.k = HK.l;
        ak.l = GK.l;
        ak.m = C2281yK.r;
        ak.n = Collections.EMPTY_LIST;
    }

    public AK(C2347zK c2347zK) {
        super(c2347zK);
        this.f11o = (byte) -1;
        this.p = -1;
        this.i = c2347zK.h;
    }

    @Override // o.EC
    public final E a() {
        return q;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.f11o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.j & 2) == 2 && !this.l.b()) {
            this.f11o = (byte) 0;
            return false;
        }
        if ((this.j & 4) == 4 && !this.m.b()) {
            this.f11o = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!((C1030fK) this.n.get(i)).b()) {
                this.f11o = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f11o = (byte) 1;
            return true;
        }
        this.f11o = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int e = (this.j & 1) == 1 ? M5.e(1, this.k) : 0;
        if ((this.j & 2) == 2) {
            e += M5.e(2, this.l);
        }
        if ((this.j & 4) == 4) {
            e += M5.e(3, this.m);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            e += M5.e(4, (E) this.n.get(i2));
        }
        int size = this.i.size() + j() + e;
        this.p = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C2347zK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C2347zK h = C2347zK.h();
        h.i(this);
        return h;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        if ((this.j & 1) == 1) {
            m5.w(1, this.k);
        }
        if ((this.j & 2) == 2) {
            m5.w(2, this.l);
        }
        if ((this.j & 4) == 4) {
            m5.w(3, this.m);
        }
        for (int i = 0; i < this.n.size(); i++) {
            m5.w(4, (E) this.n.get(i));
        }
        c2002u5.g0(200, m5);
        m5.z(this.i);
    }

    public AK() {
        this.f11o = (byte) -1;
        this.p = -1;
        this.i = AbstractC1281j9.h;
    }

    public AK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.f11o = (byte) -1;
        this.p = -1;
        this.k = HK.l;
        this.l = GK.l;
        this.m = C2281yK.r;
        this.n = Collections.EMPTY_LIST;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        C2215xK c2215xK = null;
                        C1228iK c1228iK = null;
                        C1228iK c1228iK2 = null;
                        if (n == 10) {
                            if ((this.j & 1) == 1) {
                                HK hk = this.k;
                                hk.getClass();
                                c1228iK = new C1228iK(3);
                                c1228iK.k = C1663oz.i;
                                c1228iK.l(hk);
                            }
                            HK hk2 = (HK) c0523Ub.g(HK.m, c1649ol);
                            this.k = hk2;
                            if (c1228iK != null) {
                                c1228iK.l(hk2);
                                this.k = c1228iK.h();
                            }
                            this.j |= 1;
                        } else if (n == 18) {
                            if ((this.j & 2) == 2) {
                                GK gk = this.l;
                                gk.getClass();
                                c1228iK2 = new C1228iK(1);
                                c1228iK2.k = Collections.EMPTY_LIST;
                                c1228iK2.k(gk);
                            }
                            GK gk2 = (GK) c0523Ub.g(GK.m, c1649ol);
                            this.l = gk2;
                            if (c1228iK2 != null) {
                                c1228iK2.k(gk2);
                                this.l = c1228iK2.g();
                            }
                            this.j |= 2;
                        } else if (n == 26) {
                            if ((this.j & 4) == 4) {
                                C2281yK c2281yK = this.m;
                                c2281yK.getClass();
                                c2215xK = C2215xK.h();
                                c2215xK.i(c2281yK);
                            }
                            C2281yK c2281yK2 = (C2281yK) c0523Ub.g(C2281yK.s, c1649ol);
                            this.m = c2281yK2;
                            if (c2215xK != null) {
                                c2215xK.i(c2281yK2);
                                this.m = c2215xK.g();
                            }
                            this.j |= 4;
                        } else if (n != 34) {
                            if (!n(c0523Ub, o2, c1649ol, n)) {
                            }
                        } else {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.n = new ArrayList();
                                c = '\b';
                            }
                            this.n.add(c0523Ub.g(C1030fK.R, c1649ol));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.n = Collections.unmodifiableList(this.n);
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.n = Collections.unmodifiableList(this.n);
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
