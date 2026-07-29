package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ZJ extends AbstractC2115vq {
    public static final ZJ w;
    public static final C2120vv x = new C2120vv(7);
    public final AbstractC1281j9 h;
    public int i;
    public YJ j;
    public long k;
    public float l;
    public double m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f135o;
    public int p;
    public C0833cK q;
    public List r;
    public int s;
    public int t;
    public byte u;
    public int v;

    static {
        ZJ zj = new ZJ();
        w = zj;
        zj.i();
    }

    public ZJ() {
        this.u = (byte) -1;
        this.v = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.i & 128) == 128 && !this.q.b()) {
            this.u = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.r.size(); i++) {
            if (!((ZJ) this.r.get(i)).b()) {
                this.u = (byte) 0;
                return false;
            }
        }
        this.u = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int b = (this.i & 1) == 1 ? M5.b(1, this.j.h) : 0;
        if ((this.i & 2) == 2) {
            long j = this.k;
            b += M5.h((j >> 63) ^ (j << 1)) + M5.i(2);
        }
        if ((this.i & 4) == 4) {
            b += M5.i(3) + 4;
        }
        if ((this.i & 8) == 8) {
            b += M5.i(4) + 8;
        }
        if ((this.i & 16) == 16) {
            b += M5.c(5, this.n);
        }
        if ((this.i & 32) == 32) {
            b += M5.c(6, this.f135o);
        }
        if ((this.i & 64) == 64) {
            b += M5.c(7, this.p);
        }
        if ((this.i & 128) == 128) {
            b += M5.e(8, this.q);
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            b += M5.e(9, (E) this.r.get(i2));
        }
        if ((this.i & 512) == 512) {
            b += M5.c(10, this.t);
        }
        if ((this.i & 256) == 256) {
            b += M5.c(11, this.s);
        }
        int size = this.h.size() + b;
        this.v = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return XJ.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        XJ g = XJ.g();
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
            long j = this.k;
            m5.F(2, 0);
            m5.E((j >> 63) ^ (j << 1));
        }
        if ((this.i & 4) == 4) {
            float f = this.l;
            m5.F(3, 5);
            m5.B(Float.floatToRawIntBits(f));
        }
        if ((this.i & 8) == 8) {
            double d = this.m;
            m5.F(4, 1);
            m5.C(Double.doubleToRawLongBits(d));
        }
        if ((this.i & 16) == 16) {
            m5.u(5, this.n);
        }
        if ((this.i & 32) == 32) {
            m5.u(6, this.f135o);
        }
        if ((this.i & 64) == 64) {
            m5.u(7, this.p);
        }
        if ((this.i & 128) == 128) {
            m5.w(8, this.q);
        }
        for (int i = 0; i < this.r.size(); i++) {
            m5.w(9, (E) this.r.get(i));
        }
        if ((this.i & 512) == 512) {
            m5.u(10, this.t);
        }
        if ((this.i & 256) == 256) {
            m5.u(11, this.s);
        }
        m5.z(this.h);
    }

    public final void i() {
        this.j = YJ.BYTE;
        this.k = 0L;
        this.l = 0.0f;
        this.m = 0.0d;
        this.n = 0;
        this.f135o = 0;
        this.p = 0;
        this.q = C0833cK.n;
        this.r = Collections.EMPTY_LIST;
        this.s = 0;
        this.t = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ZJ(C0523Ub c0523Ub, C1649ol c1649ol) {
        C0768bK c0768bK;
        this.u = (byte) -1;
        this.v = -1;
        i();
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? r5 = 256;
            if (!z) {
                try {
                    try {
                        int n = c0523Ub.n();
                        switch (n) {
                            case 0:
                                z = true;
                            case 8:
                                int k = c0523Ub.k();
                                YJ a = YJ.a(k);
                                if (a == null) {
                                    o2.D(n);
                                    o2.D(k);
                                } else {
                                    this.i |= 1;
                                    this.j = a;
                                }
                            case 16:
                                this.i |= 2;
                                long l = c0523Ub.l();
                                this.k = (-(l & 1)) ^ (l >>> 1);
                            case 29:
                                this.i |= 4;
                                this.l = Float.intBitsToFloat(c0523Ub.i());
                            case 33:
                                this.i |= 8;
                                this.m = Double.longBitsToDouble(c0523Ub.j());
                            case 40:
                                this.i |= 16;
                                this.n = c0523Ub.k();
                            case 48:
                                this.i |= 32;
                                this.f135o = c0523Ub.k();
                            case 56:
                                this.i |= 64;
                                this.p = c0523Ub.k();
                            case 66:
                                if ((this.i & 128) == 128) {
                                    C0833cK c0833cK = this.q;
                                    c0833cK.getClass();
                                    c0768bK = new C0768bK(0);
                                    c0768bK.k = Collections.EMPTY_LIST;
                                    c0768bK.k(c0833cK);
                                } else {
                                    c0768bK = null;
                                }
                                C0833cK c0833cK2 = (C0833cK) c0523Ub.g(C0833cK.f146o, c1649ol);
                                this.q = c0833cK2;
                                if (c0768bK != null) {
                                    c0768bK.k(c0833cK2);
                                    this.q = c0768bK.g();
                                }
                                this.i |= 128;
                            case 74:
                                if ((c & 256) != 256) {
                                    this.r = new ArrayList();
                                    c = 256;
                                }
                                this.r.add(c0523Ub.g(x, c1649ol));
                            case 80:
                                this.i |= 512;
                                this.t = c0523Ub.k();
                            case 88:
                                this.i |= 256;
                                this.s = c0523Ub.k();
                            default:
                                r5 = c0523Ub.q(n, o2);
                                if (r5 == 0) {
                                    z = true;
                                }
                        }
                    } catch (Throwable th) {
                        if ((c & 256) == r5) {
                            this.r = Collections.unmodifiableList(this.r);
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
                } catch (C0204Ht e) {
                    e.h = this;
                    throw e;
                } catch (IOException e2) {
                    C0204Ht c0204Ht = new C0204Ht(e2.getMessage());
                    c0204Ht.h = this;
                    throw c0204Ht;
                }
            } else {
                if ((c & 256) == 256) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                try {
                    o2.j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.h = c1217i9.j();
                    throw th3;
                }
                this.h = c1217i9.j();
                return;
            }
        }
    }

    public ZJ(XJ xj) {
        this.u = (byte) -1;
        this.v = -1;
        this.h = xj.h;
    }
}
