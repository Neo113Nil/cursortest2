package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.hK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162hK extends AbstractC1917sq {
    public static final C1162hK p;
    public static final C2120vv q = new C2120vv(9);
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public List l;
    public List m;
    public byte n;

    /* renamed from: o, reason: collision with root package name */
    public int f174o;

    static {
        C1162hK c1162hK = new C1162hK();
        p = c1162hK;
        c1162hK.k = 6;
        List list = Collections.EMPTY_LIST;
        c1162hK.l = list;
        c1162hK.m = list;
    }

    public C1162hK(C1096gK c1096gK) {
        super(c1096gK);
        this.n = (byte) -1;
        this.f174o = -1;
        this.i = c1096gK.h;
    }

    @Override // o.EC
    public final E a() {
        return p;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.l.size(); i++) {
            if (!((UK) this.l.get(i)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.n = (byte) 1;
            return true;
        }
        this.n = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.f174o;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 1) == 1 ? M5.c(1, this.k) : 0;
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            c += M5.e(2, (E) this.l.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            i3 += M5.d(((Integer) this.m.get(i4)).intValue());
        }
        int size = this.i.size() + j() + (this.m.size() * 2) + c + i3;
        this.f174o = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C1096gK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1096gK h = C1096gK.h();
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
        for (int i = 0; i < this.l.size(); i++) {
            m5.w(2, (E) this.l.get(i));
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            m5.u(31, ((Integer) this.m.get(i2)).intValue());
        }
        c2002u5.g0(19000, m5);
        m5.z(this.i);
    }

    public C1162hK() {
        this.n = (byte) -1;
        this.f174o = -1;
        this.i = AbstractC1281j9.h;
    }

    public C1162hK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.n = (byte) -1;
        this.f174o = -1;
        this.k = 6;
        List list = Collections.EMPTY_LIST;
        this.l = list;
        this.m = list;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.j |= 1;
                            this.k = c0523Ub.k();
                        } else if (n == 18) {
                            if ((i & 2) != 2) {
                                this.l = new ArrayList();
                                i |= 2;
                            }
                            this.l.add(c0523Ub.g(UK.t, c1649ol));
                        } else if (n == 248) {
                            if ((i & 4) != 4) {
                                this.m = new ArrayList();
                                i |= 4;
                            }
                            this.m.add(Integer.valueOf(c0523Ub.k()));
                        } else if (n != 250) {
                            if (!n(c0523Ub, o2, c1649ol, n)) {
                            }
                        } else {
                            int d = c0523Ub.d(c0523Ub.k());
                            if ((i & 4) != 4 && c0523Ub.b() > 0) {
                                this.m = new ArrayList();
                                i |= 4;
                            }
                            while (c0523Ub.b() > 0) {
                                this.m.add(Integer.valueOf(c0523Ub.k()));
                            }
                            c0523Ub.c(d);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if ((i & 4) == 4) {
                        this.m = Collections.unmodifiableList(this.m);
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
        if ((i & 2) == 2) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i & 4) == 4) {
            this.m = Collections.unmodifiableList(this.m);
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
