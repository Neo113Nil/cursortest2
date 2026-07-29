package o;

import java.io.IOException;

/* renamed from: o.aK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702aK extends AbstractC2115vq {
    public static final C0702aK n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2120vv f138o = new C2120vv(6);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public ZJ k;
    public byte l;
    public int m;

    static {
        C0702aK c0702aK = new C0702aK();
        n = c0702aK;
        c0702aK.j = 0;
        c0702aK.k = ZJ.w;
    }

    public C0702aK() {
        this.l = (byte) -1;
        this.m = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.i;
        if ((i & 1) != 1) {
            this.l = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.l = (byte) 0;
            return false;
        }
        if (this.k.b()) {
            this.l = (byte) 1;
            return true;
        }
        this.l = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int c = (this.i & 1) == 1 ? M5.c(1, this.j) : 0;
        if ((this.i & 2) == 2) {
            c += M5.e(2, this.k);
        }
        int size = this.h.size() + c;
        this.m = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        C0768bK c0768bK = new C0768bK(2);
        c0768bK.k = ZJ.w;
        return c0768bK;
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C0768bK c0768bK = new C0768bK(2);
        c0768bK.k = ZJ.w;
        c0768bK.j(this);
        return c0768bK;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        if ((this.i & 1) == 1) {
            m5.u(1, this.j);
        }
        if ((this.i & 2) == 2) {
            m5.w(2, this.k);
        }
        m5.z(this.h);
    }

    public C0702aK(C0523Ub c0523Ub, C1649ol c1649ol) {
        XJ xj;
        this.l = (byte) -1;
        this.m = -1;
        boolean z = false;
        this.j = 0;
        this.k = ZJ.w;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        while (!z) {
            try {
                try {
                    try {
                        int n2 = c0523Ub.n();
                        if (n2 != 0) {
                            if (n2 == 8) {
                                this.i |= 1;
                                this.j = c0523Ub.k();
                            } else if (n2 != 18) {
                                if (!c0523Ub.q(n2, o2)) {
                                }
                            } else {
                                if ((this.i & 2) == 2) {
                                    ZJ zj = this.k;
                                    zj.getClass();
                                    xj = XJ.g();
                                    xj.h(zj);
                                } else {
                                    xj = null;
                                }
                                ZJ zj2 = (ZJ) c0523Ub.g(ZJ.x, c1649ol);
                                this.k = zj2;
                                if (xj != null) {
                                    xj.h(zj2);
                                    this.k = xj.f();
                                }
                                this.i |= 2;
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        C0204Ht c0204Ht = new C0204Ht(e.getMessage());
                        c0204Ht.h = this;
                        throw c0204Ht;
                    }
                } catch (C0204Ht e2) {
                    e2.h = this;
                    throw e2;
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

    public C0702aK(C0768bK c0768bK) {
        this.l = (byte) -1;
        this.m = -1;
        this.h = c0768bK.h;
    }
}
