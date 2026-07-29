package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.yK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2281yK extends AbstractC1917sq {
    public static final C2281yK r;
    public static final C2120vv s = new C2120vv(15);
    public final AbstractC1281j9 i;
    public int j;
    public List k;
    public List l;
    public List m;
    public SK n;

    /* renamed from: o, reason: collision with root package name */
    public ZK f246o;
    public byte p;
    public int q;

    static {
        C2281yK c2281yK = new C2281yK();
        r = c2281yK;
        List list = Collections.EMPTY_LIST;
        c2281yK.k = list;
        c2281yK.l = list;
        c2281yK.m = list;
        c2281yK.n = SK.n;
        c2281yK.f246o = ZK.l;
    }

    public C2281yK(C2215xK c2215xK) {
        super(c2215xK);
        this.p = (byte) -1;
        this.q = -1;
        this.i = c2215xK.h;
    }

    @Override // o.EC
    public final E a() {
        return r;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!((C2017uK) this.k.get(i)).b()) {
                this.p = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (!((CK) this.l.get(i2)).b()) {
                this.p = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            if (!((OK) this.m.get(i3)).b()) {
                this.p = (byte) 0;
                return false;
            }
        }
        if ((this.j & 1) == 1 && !this.n.b()) {
            this.p = (byte) 0;
            return false;
        }
        if (i()) {
            this.p = (byte) 1;
            return true;
        }
        this.p = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.q;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            i2 += M5.e(3, (E) this.k.get(i3));
        }
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            i2 += M5.e(4, (E) this.l.get(i4));
        }
        for (int i5 = 0; i5 < this.m.size(); i5++) {
            i2 += M5.e(5, (E) this.m.get(i5));
        }
        if ((this.j & 1) == 1) {
            i2 += M5.e(30, this.n);
        }
        if ((this.j & 2) == 2) {
            i2 += M5.e(32, this.f246o);
        }
        int size = this.i.size() + j() + i2;
        this.q = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C2215xK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C2215xK h = C2215xK.h();
        h.i(this);
        return h;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        for (int i = 0; i < this.k.size(); i++) {
            m5.w(3, (E) this.k.get(i));
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            m5.w(4, (E) this.l.get(i2));
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            m5.w(5, (E) this.m.get(i3));
        }
        if ((this.j & 1) == 1) {
            m5.w(30, this.n);
        }
        if ((this.j & 2) == 2) {
            m5.w(32, this.f246o);
        }
        c2002u5.g0(200, m5);
        m5.z(this.i);
    }

    public C2281yK() {
        this.p = (byte) -1;
        this.q = -1;
        this.i = AbstractC1281j9.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public C2281yK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.p = (byte) -1;
        this.q = -1;
        List list = Collections.EMPTY_LIST;
        this.k = list;
        this.l = list;
        this.m = list;
        this.n = SK.n;
        this.f246o = ZK.l;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 26) {
                            int i = (c == true ? 1 : 0) & 1;
                            c = c;
                            if (i != 1) {
                                this.k = new ArrayList();
                                c = (c == true ? 1 : 0) | 1;
                            }
                            this.k.add(c0523Ub.g(C2017uK.C, c1649ol));
                        } else if (n == 34) {
                            int i2 = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i2 != 2) {
                                this.l = new ArrayList();
                                c = (c == true ? 1 : 0) | 2;
                            }
                            this.l.add(c0523Ub.g(CK.C, c1649ol));
                        } else if (n != 42) {
                            C1228iK c1228iK = null;
                            C0768bK c0768bK = null;
                            if (n == 242) {
                                if ((this.j & 1) == 1) {
                                    SK sk = this.n;
                                    sk.getClass();
                                    c0768bK = SK.i(sk);
                                }
                                SK sk2 = (SK) c0523Ub.g(SK.f105o, c1649ol);
                                this.n = sk2;
                                if (c0768bK != null) {
                                    c0768bK.l(sk2);
                                    this.n = c0768bK.h();
                                }
                                this.j |= 1;
                            } else if (n != 258) {
                                if (!n(c0523Ub, o2, c1649ol, n)) {
                                }
                            } else {
                                if ((this.j & 2) == 2) {
                                    ZK zk = this.f246o;
                                    zk.getClass();
                                    c1228iK = new C1228iK(2);
                                    c1228iK.k = Collections.EMPTY_LIST;
                                    c1228iK.m(zk);
                                }
                                ZK zk2 = (ZK) c0523Ub.g(ZK.m, c1649ol);
                                this.f246o = zk2;
                                if (c1228iK != null) {
                                    c1228iK.m(zk2);
                                    this.f246o = c1228iK.i();
                                }
                                this.j |= 2;
                            }
                        } else {
                            int i3 = (c == true ? 1 : 0) & 4;
                            c = c;
                            if (i3 != 4) {
                                this.m = new ArrayList();
                                c = (c == true ? 1 : 0) | 4;
                            }
                            this.m.add(c0523Ub.g(OK.w, c1649ol));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 1) == 1) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if (((c == true ? 1 : 0) & 4) == 4) {
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
        if (((c == true ? 1 : 0) & 1) == 1) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if (((c == true ? 1 : 0) & 4) == 4) {
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
