package o;

import java.io.IOException;

/* renamed from: o.pK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688pK extends AbstractC1917sq {
    public static final C1688pK n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2120vv f210o = new C2120vv(12);
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public byte l;
    public int m;

    static {
        C1688pK c1688pK = new C1688pK();
        n = c1688pK;
        c1688pK.k = 0;
    }

    public C1688pK(C1622oK c1622oK) {
        super(c1622oK);
        this.l = (byte) -1;
        this.m = -1;
        this.i = c1622oK.h;
    }

    @Override // o.EC
    public final E a() {
        return n;
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
        if (i()) {
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
        int size = this.i.size() + j() + ((this.j & 1) == 1 ? M5.c(1, this.k) : 0);
        this.m = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return new C1622oK();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1622oK c1622oK = new C1622oK();
        c1622oK.g(this);
        return c1622oK;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        if ((this.j & 1) == 1) {
            m5.u(1, this.k);
        }
        c2002u5.g0(200, m5);
        m5.z(this.i);
    }

    public C1688pK() {
        this.l = (byte) -1;
        this.m = -1;
        this.i = AbstractC1281j9.h;
    }

    public C1688pK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.l = (byte) -1;
        this.m = -1;
        boolean z = false;
        this.k = 0;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        while (!z) {
            try {
                try {
                    int n2 = c0523Ub.n();
                    if (n2 != 0) {
                        if (n2 != 8) {
                            if (!n(c0523Ub, o2, c1649ol, n2)) {
                            }
                        } else {
                            this.j |= 1;
                            this.k = c0523Ub.k();
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
