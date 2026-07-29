package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.sK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885sK extends AbstractC2115vq {
    public static final C1885sK s;
    public static final C2120vv t = new C2120vv(13);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public int k;
    public EnumC1819rK l;
    public MK m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public List f219o;
    public List p;
    public byte q;
    public int r;

    static {
        C1885sK c1885sK = new C1885sK();
        s = c1885sK;
        c1885sK.j = 0;
        c1885sK.k = 0;
        c1885sK.l = EnumC1819rK.TRUE;
        c1885sK.m = MK.A;
        c1885sK.n = 0;
        List list = Collections.EMPTY_LIST;
        c1885sK.f219o = list;
        c1885sK.p = list;
    }

    public C1885sK() {
        this.q = (byte) -1;
        this.r = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.i & 8) == 8 && !this.m.b()) {
            this.q = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f219o.size(); i++) {
            if (!((C1885sK) this.f219o.get(i)).b()) {
                this.q = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            if (!((C1885sK) this.p.get(i2)).b()) {
                this.q = (byte) 0;
                return false;
            }
        }
        this.q = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.r;
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
        if ((this.i & 8) == 8) {
            c += M5.e(4, this.m);
        }
        if ((this.i & 16) == 16) {
            c += M5.c(5, this.n);
        }
        for (int i2 = 0; i2 < this.f219o.size(); i2++) {
            c += M5.e(6, (E) this.f219o.get(i2));
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            c += M5.e(7, (E) this.p.get(i3));
        }
        int size = this.h.size() + c;
        this.r = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C1754qK.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1754qK g = C1754qK.g();
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
        if ((this.i & 8) == 8) {
            m5.w(4, this.m);
        }
        if ((this.i & 16) == 16) {
            m5.u(5, this.n);
        }
        for (int i = 0; i < this.f219o.size(); i++) {
            m5.w(6, (E) this.f219o.get(i));
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            m5.w(7, (E) this.p.get(i2));
        }
        m5.z(this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C1885sK(C0523Ub c0523Ub, C1649ol c1649ol) {
        EnumC1819rK enumC1819rK;
        this.q = (byte) -1;
        this.r = -1;
        boolean z = false;
        this.j = 0;
        this.k = 0;
        EnumC1819rK enumC1819rK2 = EnumC1819rK.TRUE;
        this.l = enumC1819rK2;
        this.m = MK.A;
        this.n = 0;
        List list = Collections.EMPTY_LIST;
        this.f219o = list;
        this.p = list;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.i |= 1;
                            this.j = c0523Ub.k();
                        } else if (n != 16) {
                            LK lk = null;
                            EnumC1819rK enumC1819rK3 = null;
                            if (n == 24) {
                                int k = c0523Ub.k();
                                if (k != 0) {
                                    if (k == 1) {
                                        enumC1819rK3 = EnumC1819rK.FALSE;
                                    } else if (k == 2) {
                                        enumC1819rK3 = EnumC1819rK.NULL;
                                    }
                                    enumC1819rK = enumC1819rK3;
                                } else {
                                    enumC1819rK = enumC1819rK2;
                                }
                                if (enumC1819rK == null) {
                                    o2.D(n);
                                    o2.D(k);
                                } else {
                                    this.i |= 4;
                                    this.l = enumC1819rK;
                                }
                            } else if (n == 34) {
                                if ((this.i & 8) == 8) {
                                    MK mk = this.m;
                                    mk.getClass();
                                    lk = MK.r(mk);
                                }
                                LK lk2 = lk;
                                MK mk2 = (MK) c0523Ub.g(MK.B, c1649ol);
                                this.m = mk2;
                                if (lk2 != null) {
                                    lk2.i(mk2);
                                    this.m = lk2.g();
                                }
                                this.i |= 8;
                            } else if (n != 40) {
                                C2120vv c2120vv = t;
                                if (n == 50) {
                                    int i = (c == true ? 1 : 0) & 32;
                                    c = c;
                                    if (i != 32) {
                                        this.f219o = new ArrayList();
                                        c = (c == true ? 1 : 0) | ' ';
                                    }
                                    this.f219o.add(c0523Ub.g(c2120vv, c1649ol));
                                } else if (n != 58) {
                                    if (!c0523Ub.q(n, o2)) {
                                    }
                                } else {
                                    int i2 = (c == true ? 1 : 0) & 64;
                                    c = c;
                                    if (i2 != 64) {
                                        this.p = new ArrayList();
                                        c = (c == true ? 1 : 0) | '@';
                                    }
                                    this.p.add(c0523Ub.g(c2120vv, c1649ol));
                                }
                            } else {
                                this.i |= 16;
                                this.n = c0523Ub.k();
                            }
                        } else {
                            this.i |= 2;
                            this.k = c0523Ub.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.f219o = Collections.unmodifiableList(this.f219o);
                    }
                    if (((c == true ? 1 : 0) & 64) == 64) {
                        this.p = Collections.unmodifiableList(this.p);
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
        }
        if (((c == true ? 1 : 0) & 32) == 32) {
            this.f219o = Collections.unmodifiableList(this.f219o);
        }
        if (((c == true ? 1 : 0) & 64) == 64) {
            this.p = Collections.unmodifiableList(this.p);
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

    public C1885sK(C1754qK c1754qK) {
        this.q = (byte) -1;
        this.r = -1;
        this.h = c1754qK.h;
    }
}
