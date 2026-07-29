package o;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Ev, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128Ev extends AbstractC2115vq {
    public static final C0128Ev t;
    public static final C2120vv u = new C2120vv(4);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public int k;
    public Object l;
    public EnumC0102Dv m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public int f38o;
    public List p;
    public int q;
    public byte r;
    public int s;

    static {
        C0128Ev c0128Ev = new C0128Ev();
        t = c0128Ev;
        c0128Ev.j = 1;
        c0128Ev.k = 0;
        c0128Ev.l = "";
        c0128Ev.m = EnumC0102Dv.NONE;
        List list = Collections.EMPTY_LIST;
        c0128Ev.n = list;
        c0128Ev.p = list;
    }

    public C0128Ev() {
        this.f38o = -1;
        this.q = -1;
        this.r = (byte) -1;
        this.s = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        if (this.r == 1) {
            return true;
        }
        this.r = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        AbstractC1281j9 abstractC1281j9;
        int i = this.s;
        if (i != -1) {
            return i;
        }
        int c = (this.i & 1) == 1 ? M5.c(1, this.j) : 0;
        if ((this.i & 2) == 2) {
            c += M5.c(2, this.k);
        }
        if ((this.i & 8) == 8) {
            c += M5.b(3, this.m.h);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            i2 += M5.d(((Integer) this.n.get(i3)).intValue());
        }
        int i4 = c + i2;
        if (!this.n.isEmpty()) {
            i4 = i4 + 1 + M5.d(i2);
        }
        this.f38o = i2;
        int i5 = 0;
        for (int i6 = 0; i6 < this.p.size(); i6++) {
            i5 += M5.d(((Integer) this.p.get(i6)).intValue());
        }
        int i7 = i4 + i5;
        if (!this.p.isEmpty()) {
            i7 = i7 + 1 + M5.d(i5);
        }
        this.q = i5;
        if ((this.i & 4) == 4) {
            Object obj = this.l;
            if (obj instanceof String) {
                try {
                    abstractC1281j9 = new C2271yA(((String) obj).getBytes("UTF-8"));
                    this.l = abstractC1281j9;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                abstractC1281j9 = (AbstractC1281j9) obj;
            }
            i7 += abstractC1281j9.size() + M5.g(abstractC1281j9.size()) + M5.i(6);
        }
        int size = this.h.size() + i7;
        this.s = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C0076Cv.g();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C0076Cv g = C0076Cv.g();
        g.h(this);
        return g;
    }

    @Override // o.E
    public final void f(M5 m5) {
        AbstractC1281j9 abstractC1281j9;
        c();
        if ((this.i & 1) == 1) {
            m5.u(1, this.j);
        }
        if ((this.i & 2) == 2) {
            m5.u(2, this.k);
        }
        if ((this.i & 8) == 8) {
            m5.t(3, this.m.h);
        }
        if (this.n.size() > 0) {
            m5.D(34);
            m5.D(this.f38o);
        }
        for (int i = 0; i < this.n.size(); i++) {
            m5.v(((Integer) this.n.get(i)).intValue());
        }
        if (this.p.size() > 0) {
            m5.D(42);
            m5.D(this.q);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            m5.v(((Integer) this.p.get(i2)).intValue());
        }
        if ((this.i & 4) == 4) {
            Object obj = this.l;
            if (obj instanceof String) {
                try {
                    abstractC1281j9 = new C2271yA(((String) obj).getBytes("UTF-8"));
                    this.l = abstractC1281j9;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                abstractC1281j9 = (AbstractC1281j9) obj;
            }
            m5.F(6, 2);
            m5.D(abstractC1281j9.size());
            m5.z(abstractC1281j9);
        }
        m5.z(this.h);
    }

    public C0128Ev(C0523Ub c0523Ub) {
        EnumC0102Dv enumC0102Dv;
        this.f38o = -1;
        this.q = -1;
        this.r = (byte) -1;
        this.s = -1;
        this.j = 1;
        boolean z = false;
        this.k = 0;
        this.l = "";
        EnumC0102Dv enumC0102Dv2 = EnumC0102Dv.NONE;
        this.m = enumC0102Dv2;
        List list = Collections.EMPTY_LIST;
        this.n = list;
        this.p = list;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.i |= 1;
                            this.j = c0523Ub.k();
                        } else if (n == 16) {
                            this.i |= 2;
                            this.k = c0523Ub.k();
                        } else if (n == 24) {
                            int k = c0523Ub.k();
                            if (k == 0) {
                                enumC0102Dv = enumC0102Dv2;
                            } else if (k != 1) {
                                enumC0102Dv = k != 2 ? null : EnumC0102Dv.DESC_TO_CLASS_ID;
                            } else {
                                enumC0102Dv = EnumC0102Dv.INTERNAL_TO_CLASS_ID;
                            }
                            if (enumC0102Dv == null) {
                                o2.D(n);
                                o2.D(k);
                            } else {
                                this.i |= 8;
                                this.m = enumC0102Dv;
                            }
                        } else if (n == 32) {
                            if ((i & 16) != 16) {
                                this.n = new ArrayList();
                                i |= 16;
                            }
                            this.n.add(Integer.valueOf(c0523Ub.k()));
                        } else if (n == 34) {
                            int d = c0523Ub.d(c0523Ub.k());
                            if ((i & 16) != 16 && c0523Ub.b() > 0) {
                                this.n = new ArrayList();
                                i |= 16;
                            }
                            while (c0523Ub.b() > 0) {
                                this.n.add(Integer.valueOf(c0523Ub.k()));
                            }
                            c0523Ub.c(d);
                        } else if (n == 40) {
                            if ((i & 32) != 32) {
                                this.p = new ArrayList();
                                i |= 32;
                            }
                            this.p.add(Integer.valueOf(c0523Ub.k()));
                        } else if (n == 42) {
                            int d2 = c0523Ub.d(c0523Ub.k());
                            if ((i & 32) != 32 && c0523Ub.b() > 0) {
                                this.p = new ArrayList();
                                i |= 32;
                            }
                            while (c0523Ub.b() > 0) {
                                this.p.add(Integer.valueOf(c0523Ub.k()));
                            }
                            c0523Ub.c(d2);
                        } else if (n != 50) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            C2271yA e = c0523Ub.e();
                            this.i |= 4;
                            this.l = e;
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if ((i & 32) == 32) {
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
            } catch (C0204Ht e2) {
                e2.h = this;
                throw e2;
            } catch (IOException e3) {
                C0204Ht c0204Ht = new C0204Ht(e3.getMessage());
                c0204Ht.h = this;
                throw c0204Ht;
            }
        }
        if ((i & 16) == 16) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if ((i & 32) == 32) {
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

    public C0128Ev(C0076Cv c0076Cv) {
        this.f38o = -1;
        this.q = -1;
        this.r = (byte) -1;
        this.s = -1;
        this.h = c0076Cv.h;
    }
}
