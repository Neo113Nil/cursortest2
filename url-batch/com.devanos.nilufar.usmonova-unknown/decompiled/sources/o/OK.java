package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class OK extends AbstractC1917sq {
    public static final OK v;
    public static final C2120vv w = new C2120vv(23);
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public int l;
    public List m;
    public MK n;

    /* renamed from: o, reason: collision with root package name */
    public int f76o;
    public MK p;
    public int q;
    public List r;
    public List s;
    public byte t;
    public int u;

    static {
        OK ok = new OK();
        v = ok;
        ok.k = 6;
        ok.l = 0;
        List list = Collections.EMPTY_LIST;
        ok.m = list;
        MK mk = MK.A;
        ok.n = mk;
        ok.f76o = 0;
        ok.p = mk;
        ok.q = 0;
        ok.r = list;
        ok.s = list;
    }

    public OK(NK nk) {
        super(nk);
        this.t = (byte) -1;
        this.u = -1;
        this.i = nk.h;
    }

    @Override // o.EC
    public final E a() {
        return v;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.j & 2) != 2) {
            this.t = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.m.size(); i++) {
            if (!((RK) this.m.get(i)).b()) {
                this.t = (byte) 0;
                return false;
            }
        }
        if ((this.j & 4) == 4 && !this.n.b()) {
            this.t = (byte) 0;
            return false;
        }
        if ((this.j & 16) == 16 && !this.p.b()) {
            this.t = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (!((C0833cK) this.r.get(i2)).b()) {
                this.t = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.t = (byte) 1;
            return true;
        }
        this.t = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 1) == 1 ? M5.c(1, this.k) : 0;
        if ((this.j & 2) == 2) {
            c += M5.c(2, this.l);
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            c += M5.e(3, (E) this.m.get(i2));
        }
        if ((this.j & 4) == 4) {
            c += M5.e(4, this.n);
        }
        if ((this.j & 8) == 8) {
            c += M5.c(5, this.f76o);
        }
        if ((this.j & 16) == 16) {
            c += M5.e(6, this.p);
        }
        if ((this.j & 32) == 32) {
            c += M5.c(7, this.q);
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            c += M5.e(8, (E) this.r.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s.size(); i5++) {
            i4 += M5.d(((Integer) this.s.get(i5)).intValue());
        }
        int size = this.i.size() + j() + (this.s.size() * 2) + c + i4;
        this.u = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return NK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        NK h = NK.h();
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
        for (int i = 0; i < this.m.size(); i++) {
            m5.w(3, (E) this.m.get(i));
        }
        if ((this.j & 4) == 4) {
            m5.w(4, this.n);
        }
        if ((this.j & 8) == 8) {
            m5.u(5, this.f76o);
        }
        if ((this.j & 16) == 16) {
            m5.w(6, this.p);
        }
        if ((this.j & 32) == 32) {
            m5.u(7, this.q);
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            m5.w(8, (E) this.r.get(i2));
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            m5.u(31, ((Integer) this.s.get(i3)).intValue());
        }
        c2002u5.g0(200, m5);
        m5.z(this.i);
    }

    public OK() {
        this.t = (byte) -1;
        this.u = -1;
        this.i = AbstractC1281j9.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public OK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.t = (byte) -1;
        this.u = -1;
        this.k = 6;
        boolean z = false;
        this.l = 0;
        List list = Collections.EMPTY_LIST;
        this.m = list;
        MK mk = MK.A;
        this.n = mk;
        this.f76o = 0;
        this.p = mk;
        this.q = 0;
        this.r = list;
        this.s = list;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        int i = 0;
        while (true) {
            ?? r5 = 128;
            if (!z) {
                try {
                    try {
                        try {
                            int n = c0523Ub.n();
                            LK lk = null;
                            switch (n) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.j |= 1;
                                    this.k = c0523Ub.k();
                                case 16:
                                    this.j |= 2;
                                    this.l = c0523Ub.k();
                                case 26:
                                    if ((i & 4) != 4) {
                                        this.m = new ArrayList();
                                        i |= 4;
                                    }
                                    this.m.add(c0523Ub.g(RK.u, c1649ol));
                                case 34:
                                    if ((this.j & 4) == 4) {
                                        MK mk2 = this.n;
                                        mk2.getClass();
                                        lk = MK.r(mk2);
                                    }
                                    MK mk3 = (MK) c0523Ub.g(MK.B, c1649ol);
                                    this.n = mk3;
                                    if (lk != null) {
                                        lk.i(mk3);
                                        this.n = lk.g();
                                    }
                                    this.j |= 4;
                                case 40:
                                    this.j |= 8;
                                    this.f76o = c0523Ub.k();
                                case 50:
                                    if ((this.j & 16) == 16) {
                                        MK mk4 = this.p;
                                        mk4.getClass();
                                        lk = MK.r(mk4);
                                    }
                                    MK mk5 = (MK) c0523Ub.g(MK.B, c1649ol);
                                    this.p = mk5;
                                    if (lk != null) {
                                        lk.i(mk5);
                                        this.p = lk.g();
                                    }
                                    this.j |= 16;
                                case 56:
                                    this.j |= 32;
                                    this.q = c0523Ub.k();
                                case 66:
                                    if ((i & 128) != 128) {
                                        this.r = new ArrayList();
                                        i |= 128;
                                    }
                                    this.r.add(c0523Ub.g(C0833cK.f146o, c1649ol));
                                case 248:
                                    if ((i & 256) != 256) {
                                        this.s = new ArrayList();
                                        i |= 256;
                                    }
                                    this.s.add(Integer.valueOf(c0523Ub.k()));
                                case 250:
                                    int d = c0523Ub.d(c0523Ub.k());
                                    if ((i & 256) != 256 && c0523Ub.b() > 0) {
                                        this.s = new ArrayList();
                                        i |= 256;
                                    }
                                    while (c0523Ub.b() > 0) {
                                        this.s.add(Integer.valueOf(c0523Ub.k()));
                                    }
                                    c0523Ub.c(d);
                                    break;
                                default:
                                    r5 = n(c0523Ub, o2, c1649ol, n);
                                    if (r5 == 0) {
                                        z = true;
                                    }
                            }
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
                    if ((i & 4) == 4) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    if ((i & 128) == r5) {
                        this.r = Collections.unmodifiableList(this.r);
                    }
                    if ((i & 256) == 256) {
                        this.s = Collections.unmodifiableList(this.s);
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
            } else {
                if ((i & 4) == 4) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i & 128) == 128) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if ((i & 256) == 256) {
                    this.s = Collections.unmodifiableList(this.s);
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
                return;
            }
        }
    }
}
