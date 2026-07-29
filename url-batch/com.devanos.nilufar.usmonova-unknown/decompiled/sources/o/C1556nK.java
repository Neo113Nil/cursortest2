package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.nK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1556nK extends AbstractC2115vq {
    public static final C1556nK p;
    public static final C2120vv q = new C2120vv(11);
    public final AbstractC1281j9 h;
    public int i;
    public EnumC1424lK j;
    public List k;
    public C1885sK l;
    public EnumC1490mK m;
    public byte n;

    /* renamed from: o, reason: collision with root package name */
    public int f202o;

    static {
        C1556nK c1556nK = new C1556nK();
        p = c1556nK;
        c1556nK.j = EnumC1424lK.RETURNS_CONSTANT;
        c1556nK.k = Collections.EMPTY_LIST;
        c1556nK.l = C1885sK.s;
        c1556nK.m = EnumC1490mK.AT_MOST_ONCE;
    }

    public C1556nK() {
        this.n = (byte) -1;
        this.f202o = -1;
        this.h = AbstractC1281j9.h;
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
        for (int i = 0; i < this.k.size(); i++) {
            if (!((C1885sK) this.k.get(i)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if ((this.i & 2) != 2 || this.l.b()) {
            this.n = (byte) 1;
            return true;
        }
        this.n = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.f202o;
        if (i != -1) {
            return i;
        }
        int b = (this.i & 1) == 1 ? M5.b(1, this.j.h) : 0;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            b += M5.e(2, (E) this.k.get(i2));
        }
        if ((this.i & 2) == 2) {
            b += M5.e(3, this.l);
        }
        if ((this.i & 4) == 4) {
            b += M5.b(4, this.m.h);
        }
        int size = this.h.size() + b;
        this.f202o = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C1358kK.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1358kK g = C1358kK.g();
        g.h(this);
        return g;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        if ((this.i & 1) == 1) {
            m5.t(1, this.j.h);
        }
        for (int i = 0; i < this.k.size(); i++) {
            m5.w(2, (E) this.k.get(i));
        }
        if ((this.i & 2) == 2) {
            m5.w(3, this.l);
        }
        if ((this.i & 4) == 4) {
            m5.t(4, this.m.h);
        }
        m5.z(this.h);
    }

    public C1556nK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.n = (byte) -1;
        this.f202o = -1;
        EnumC1424lK enumC1424lK = EnumC1424lK.RETURNS_CONSTANT;
        this.j = enumC1424lK;
        this.k = Collections.EMPTY_LIST;
        this.l = C1885sK.s;
        EnumC1490mK enumC1490mK = EnumC1490mK.AT_MOST_ONCE;
        this.m = enumC1490mK;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        EnumC1490mK enumC1490mK2 = null;
                        EnumC1424lK enumC1424lK2 = null;
                        C1754qK c1754qK = null;
                        if (n == 8) {
                            int k = c0523Ub.k();
                            if (k == 0) {
                                enumC1424lK2 = enumC1424lK;
                            } else if (k == 1) {
                                enumC1424lK2 = EnumC1424lK.CALLS;
                            } else if (k == 2) {
                                enumC1424lK2 = EnumC1424lK.RETURNS_NOT_NULL;
                            }
                            if (enumC1424lK2 == null) {
                                o2.D(n);
                                o2.D(k);
                            } else {
                                this.i |= 1;
                                this.j = enumC1424lK2;
                            }
                        } else if (n == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.k = new ArrayList();
                                c = 2;
                            }
                            this.k.add(c0523Ub.g(C1885sK.t, c1649ol));
                        } else if (n == 26) {
                            if ((this.i & 2) == 2) {
                                C1885sK c1885sK = this.l;
                                c1885sK.getClass();
                                c1754qK = C1754qK.g();
                                c1754qK.h(c1885sK);
                            }
                            C1885sK c1885sK2 = (C1885sK) c0523Ub.g(C1885sK.t, c1649ol);
                            this.l = c1885sK2;
                            if (c1754qK != null) {
                                c1754qK.h(c1885sK2);
                                this.l = c1754qK.f();
                            }
                            this.i |= 2;
                        } else if (n != 32) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            int k2 = c0523Ub.k();
                            if (k2 == 0) {
                                enumC1490mK2 = enumC1490mK;
                            } else if (k2 == 1) {
                                enumC1490mK2 = EnumC1490mK.EXACTLY_ONCE;
                            } else if (k2 == 2) {
                                enumC1490mK2 = EnumC1490mK.AT_LEAST_ONCE;
                            }
                            if (enumC1490mK2 == null) {
                                o2.D(n);
                                o2.D(k2);
                            } else {
                                this.i |= 4;
                                this.m = enumC1490mK2;
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
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.k = Collections.unmodifiableList(this.k);
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
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.k = Collections.unmodifiableList(this.k);
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

    public C1556nK(C1358kK c1358kK) {
        this.n = (byte) -1;
        this.f202o = -1;
        this.h = c1358kK.h;
    }
}
