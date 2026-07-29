package o;

import java.io.IOException;

/* renamed from: o.xv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2252xv extends AbstractC2115vq {
    public static final C2252xv n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2120vv f244o = new C2120vv(0);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public int k;
    public byte l;
    public int m;

    static {
        C2252xv c2252xv = new C2252xv();
        n = c2252xv;
        c2252xv.j = 0;
        c2252xv.k = 0;
    }

    public C2252xv() {
        this.l = (byte) -1;
        this.m = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        if (this.l == 1) {
            return true;
        }
        this.l = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int c = (this.i & 1) == 1 ? M5.c(1, this.j) : 0;
        if ((this.i & 2) == 2) {
            c += M5.c(2, this.k);
        }
        int size = this.h.size() + c;
        this.m = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return new C2186wv(0);
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C2186wv c2186wv = new C2186wv(0);
        c2186wv.h(this);
        return c2186wv;
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
        m5.z(this.h);
    }

    public C2252xv(C0523Ub c0523Ub) {
        this.l = (byte) -1;
        this.m = -1;
        boolean z = false;
        this.j = 0;
        this.k = 0;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        while (!z) {
            try {
                try {
                    int n2 = c0523Ub.n();
                    if (n2 != 0) {
                        if (n2 == 8) {
                            this.i |= 1;
                            this.j = c0523Ub.k();
                        } else if (n2 != 16) {
                            if (!c0523Ub.q(n2, o2)) {
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

    public C2252xv(C2186wv c2186wv) {
        this.l = (byte) -1;
        this.m = -1;
        this.h = c2186wv.h;
    }
}
