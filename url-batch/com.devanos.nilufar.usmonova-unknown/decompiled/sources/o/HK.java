package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HK extends AbstractC2115vq {
    public static final HK l;
    public static final C2120vv m = new C2120vv(20);
    public final AbstractC1281j9 h;
    public InterfaceC1795qz i;
    public byte j;
    public int k;

    static {
        HK hk = new HK();
        l = hk;
        hk.i = C1663oz.i;
    }

    public HK() {
        this.j = (byte) -1;
        this.k = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        if (this.j == 1) {
            return true;
        }
        this.j = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            AbstractC1281j9 e = this.i.e(i3);
            i2 += e.size() + M5.g(e.size());
        }
        int size = this.h.size() + this.i.size() + i2;
        this.k = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        C1228iK c1228iK = new C1228iK(3);
        c1228iK.k = C1663oz.i;
        return c1228iK;
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1228iK c1228iK = new C1228iK(3);
        c1228iK.k = C1663oz.i;
        c1228iK.l(this);
        return c1228iK;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        for (int i = 0; i < this.i.size(); i++) {
            AbstractC1281j9 e = this.i.e(i);
            m5.F(1, 2);
            m5.D(e.size());
            m5.z(e);
        }
        m5.z(this.h);
    }

    public HK(C0523Ub c0523Ub) {
        this.j = (byte) -1;
        this.k = -1;
        this.i = C1663oz.i;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n != 10) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            C2271yA e = c0523Ub.e();
                            if (!z2) {
                                this.i = new C1663oz();
                                z2 = true;
                            }
                            this.i.g(e);
                        }
                    }
                    z = true;
                } catch (C0204Ht e2) {
                    e2.h = this;
                    throw e2;
                } catch (IOException e3) {
                    C0204Ht c0204Ht = new C0204Ht(e3.getMessage());
                    c0204Ht.h = this;
                    throw c0204Ht;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.i = this.i.a();
                }
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
        if (z2) {
            this.i = this.i.a();
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

    public HK(C1228iK c1228iK) {
        this.j = (byte) -1;
        this.k = -1;
        this.h = c1228iK.h;
    }
}
