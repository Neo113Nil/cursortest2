package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.uK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2017uK extends AbstractC1917sq {
    public static final C2017uK B;
    public static final C2120vv C = new C2120vv(14);
    public int A;
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public MK n;

    /* renamed from: o, reason: collision with root package name */
    public int f229o;
    public List p;
    public MK q;
    public int r;
    public List s;
    public List t;
    public int u;
    public List v;
    public SK w;
    public List x;
    public C1292jK y;
    public byte z;

    static {
        C2017uK c2017uK = new C2017uK();
        B = c2017uK;
        c2017uK.p();
    }

    public C2017uK(C1951tK c1951tK) {
        super(c1951tK);
        this.u = -1;
        this.z = (byte) -1;
        this.A = -1;
        this.i = c1951tK.h;
    }

    @Override // o.EC
    public final E a() {
        return B;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.z;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.j;
        if ((i & 4) != 4) {
            this.z = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.n.b()) {
            this.z = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            if (!((RK) this.p.get(i2)).b()) {
                this.z = (byte) 0;
                return false;
            }
        }
        if ((this.j & 32) == 32 && !this.q.b()) {
            this.z = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            if (!((MK) this.s.get(i3)).b()) {
                this.z = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            if (!((UK) this.v.get(i4)).b()) {
                this.z = (byte) 0;
                return false;
            }
        }
        if ((this.j & 128) == 128 && !this.w.b()) {
            this.z = (byte) 0;
            return false;
        }
        if ((this.j & 256) == 256 && !this.y.b()) {
            this.z = (byte) 0;
            return false;
        }
        if (i()) {
            this.z = (byte) 1;
            return true;
        }
        this.z = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.A;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 2) == 2 ? M5.c(1, this.l) : 0;
        if ((this.j & 4) == 4) {
            c += M5.c(2, this.m);
        }
        if ((this.j & 8) == 8) {
            c += M5.e(3, this.n);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            c += M5.e(4, (E) this.p.get(i2));
        }
        if ((this.j & 32) == 32) {
            c += M5.e(5, this.q);
        }
        for (int i3 = 0; i3 < this.v.size(); i3++) {
            c += M5.e(6, (E) this.v.get(i3));
        }
        if ((this.j & 16) == 16) {
            c += M5.c(7, this.f229o);
        }
        if ((this.j & 64) == 64) {
            c += M5.c(8, this.r);
        }
        if ((this.j & 1) == 1) {
            c += M5.c(9, this.k);
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            c += M5.e(10, (E) this.s.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.t.size(); i6++) {
            i5 += M5.d(((Integer) this.t.get(i6)).intValue());
        }
        int i7 = c + i5;
        if (!this.t.isEmpty()) {
            i7 = i7 + 1 + M5.d(i5);
        }
        this.u = i5;
        if ((this.j & 128) == 128) {
            i7 += M5.e(30, this.w);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            i8 += M5.d(((Integer) this.x.get(i9)).intValue());
        }
        int size = (this.x.size() * 2) + i7 + i8;
        if ((this.j & 256) == 256) {
            size += M5.e(32, this.y);
        }
        int size2 = this.i.size() + j() + size;
        this.A = size2;
        return size2;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C1951tK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1951tK h = C1951tK.h();
        h.i(this);
        return h;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        if ((this.j & 2) == 2) {
            m5.u(1, this.l);
        }
        if ((this.j & 4) == 4) {
            m5.u(2, this.m);
        }
        if ((this.j & 8) == 8) {
            m5.w(3, this.n);
        }
        for (int i = 0; i < this.p.size(); i++) {
            m5.w(4, (E) this.p.get(i));
        }
        if ((this.j & 32) == 32) {
            m5.w(5, this.q);
        }
        for (int i2 = 0; i2 < this.v.size(); i2++) {
            m5.w(6, (E) this.v.get(i2));
        }
        if ((this.j & 16) == 16) {
            m5.u(7, this.f229o);
        }
        if ((this.j & 64) == 64) {
            m5.u(8, this.r);
        }
        if ((this.j & 1) == 1) {
            m5.u(9, this.k);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            m5.w(10, (E) this.s.get(i3));
        }
        if (this.t.size() > 0) {
            m5.D(90);
            m5.D(this.u);
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            m5.v(((Integer) this.t.get(i4)).intValue());
        }
        if ((this.j & 128) == 128) {
            m5.w(30, this.w);
        }
        for (int i5 = 0; i5 < this.x.size(); i5++) {
            m5.u(31, ((Integer) this.x.get(i5)).intValue());
        }
        if ((this.j & 256) == 256) {
            m5.w(32, this.y);
        }
        c2002u5.g0(19000, m5);
        m5.z(this.i);
    }

    public final void p() {
        this.k = 6;
        this.l = 6;
        this.m = 0;
        MK mk = MK.A;
        this.n = mk;
        this.f229o = 0;
        List list = Collections.EMPTY_LIST;
        this.p = list;
        this.q = mk;
        this.r = 0;
        this.s = list;
        this.t = list;
        this.v = list;
        this.w = SK.n;
        this.x = list;
        this.y = C1292jK.l;
    }

    public C2017uK() {
        this.u = -1;
        this.z = (byte) -1;
        this.A = -1;
        this.i = AbstractC1281j9.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C2017uK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.u = -1;
        this.z = (byte) -1;
        this.A = -1;
        p();
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? r5 = 1024;
            if (!z) {
                try {
                    try {
                        int n = c0523Ub.n();
                        LK lk = null;
                        C1228iK c1228iK = null;
                        C0768bK c0768bK = null;
                        LK lk2 = null;
                        switch (n) {
                            case 0:
                                z = true;
                            case 8:
                                this.j |= 2;
                                this.l = c0523Ub.k();
                            case 16:
                                this.j |= 4;
                                this.m = c0523Ub.k();
                            case 26:
                                if ((this.j & 8) == 8) {
                                    MK mk = this.n;
                                    mk.getClass();
                                    lk = MK.r(mk);
                                }
                                MK mk2 = (MK) c0523Ub.g(MK.B, c1649ol);
                                this.n = mk2;
                                if (lk != null) {
                                    lk.i(mk2);
                                    this.n = lk.g();
                                }
                                this.j |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.p = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.p.add(c0523Ub.g(RK.u, c1649ol));
                            case 42:
                                if ((this.j & 32) == 32) {
                                    MK mk3 = this.q;
                                    mk3.getClass();
                                    lk2 = MK.r(mk3);
                                }
                                MK mk4 = (MK) c0523Ub.g(MK.B, c1649ol);
                                this.q = mk4;
                                if (lk2 != null) {
                                    lk2.i(mk4);
                                    this.q = lk2.g();
                                }
                                this.j |= 32;
                            case 50:
                                int i2 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i2 != 1024) {
                                    this.v = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.v.add(c0523Ub.g(UK.t, c1649ol));
                            case 56:
                                this.j |= 16;
                                this.f229o = c0523Ub.k();
                            case 64:
                                this.j |= 64;
                                this.r = c0523Ub.k();
                            case 72:
                                this.j |= 1;
                                this.k = c0523Ub.k();
                            case 82:
                                int i3 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i3 != 256) {
                                    this.s = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.s.add(c0523Ub.g(MK.B, c1649ol));
                            case 88:
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    this.t = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.t.add(Integer.valueOf(c0523Ub.k()));
                            case 90:
                                int d = c0523Ub.d(c0523Ub.k());
                                int i5 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i5 != 512) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.t = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.t.add(Integer.valueOf(c0523Ub.k()));
                                }
                                c0523Ub.c(d);
                            case 242:
                                if ((this.j & 128) == 128) {
                                    SK sk = this.w;
                                    sk.getClass();
                                    c0768bK = SK.i(sk);
                                }
                                SK sk2 = (SK) c0523Ub.g(SK.f105o, c1649ol);
                                this.w = sk2;
                                if (c0768bK != null) {
                                    c0768bK.l(sk2);
                                    this.w = c0768bK.h();
                                }
                                this.j |= 128;
                            case 248:
                                int i6 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i6 != 4096) {
                                    this.x = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4096;
                                }
                                this.x.add(Integer.valueOf(c0523Ub.k()));
                            case 250:
                                int d2 = c0523Ub.d(c0523Ub.k());
                                int i7 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i7 != 4096) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.x = new ArrayList();
                                        c = (c == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.x.add(Integer.valueOf(c0523Ub.k()));
                                }
                                c0523Ub.c(d2);
                            case 258:
                                if ((this.j & 256) == 256) {
                                    C1292jK c1292jK = this.y;
                                    c1292jK.getClass();
                                    c1228iK = new C1228iK(0);
                                    c1228iK.k = Collections.EMPTY_LIST;
                                    c1228iK.j(c1292jK);
                                }
                                C1292jK c1292jK2 = (C1292jK) c0523Ub.g(C1292jK.m, c1649ol);
                                this.y = c1292jK2;
                                if (c1228iK != null) {
                                    c1228iK.j(c1292jK2);
                                    this.y = c1228iK.f();
                                }
                                this.j |= 256;
                            default:
                                r5 = n(c0523Ub, o2, c1649ol, n);
                                if (r5 == 0) {
                                    z = true;
                                }
                        }
                    } catch (C0204Ht e) {
                        e.h = this;
                        throw e;
                    } catch (IOException e2) {
                        C0204Ht c0204Ht = new C0204Ht(e2.getMessage());
                        c0204Ht.h = this;
                        throw c0204Ht;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    if (((c == true ? 1 : 0) & 1024) == r5) {
                        this.v = Collections.unmodifiableList(this.v);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.s = Collections.unmodifiableList(this.s);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this.x = Collections.unmodifiableList(this.x);
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
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.v = Collections.unmodifiableList(this.v);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if (((c == true ? 1 : 0) & 4096) == 4096) {
                    this.x = Collections.unmodifiableList(this.x);
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
