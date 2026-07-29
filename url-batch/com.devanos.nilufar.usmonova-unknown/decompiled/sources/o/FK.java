package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class FK extends AbstractC2115vq {

    /* renamed from: o, reason: collision with root package name */
    public static final FK f40o;
    public static final C2120vv p = new C2120vv(19);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public int k;
    public EK l;
    public byte m;
    public int n;

    static {
        FK fk = new FK();
        f40o = fk;
        fk.j = -1;
        fk.k = 0;
        fk.l = EK.PACKAGE;
    }

    public FK() {
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
        if ((this.i & 2) == 2) {
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
        int c = (this.i & 1) == 1 ? M5.c(1, this.j) : 0;
        if ((this.i & 2) == 2) {
            c += M5.c(2, this.k);
        }
        if ((this.i & 4) == 4) {
            c += M5.b(3, this.l.h);
        }
        int size = this.h.size() + c;
        this.n = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return DK.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        DK g = DK.g();
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
        m5.z(this.h);
    }

    public FK(C0523Ub c0523Ub) {
        EK ek;
        this.m = (byte) -1;
        this.n = -1;
        this.j = -1;
        boolean z = false;
        this.k = 0;
        EK ek2 = EK.PACKAGE;
        this.l = ek2;
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
                        } else if (n == 16) {
                            this.i |= 2;
                            this.k = c0523Ub.k();
                        } else if (n != 24) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            int k = c0523Ub.k();
                            if (k == 0) {
                                ek = EK.CLASS;
                            } else if (k != 1) {
                                ek = k != 2 ? null : EK.LOCAL;
                            } else {
                                ek = ek2;
                            }
                            if (ek == null) {
                                o2.D(n);
                                o2.D(k);
                            } else {
                                this.i |= 4;
                                this.l = ek;
                            }
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

    public FK(DK dk) {
        this.m = (byte) -1;
        this.n = -1;
        this.h = dk.h;
    }
}
