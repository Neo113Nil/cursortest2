package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Fv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154Fv extends AbstractC2115vq {
    public static final C0154Fv n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2120vv f41o = new C2120vv(3);
    public final AbstractC1281j9 h;
    public List i;
    public List j;
    public int k;
    public byte l;
    public int m;

    static {
        C0154Fv c0154Fv = new C0154Fv();
        n = c0154Fv;
        List list = Collections.EMPTY_LIST;
        c0154Fv.i = list;
        c0154Fv.j = list;
    }

    public C0154Fv() {
        this.k = -1;
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            i2 += M5.e(1, (E) this.i.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.j.size(); i5++) {
            i4 += M5.d(((Integer) this.j.get(i5)).intValue());
        }
        int i6 = i2 + i4;
        if (!this.j.isEmpty()) {
            i6 = i6 + 1 + M5.d(i4);
        }
        this.k = i4;
        int size = this.h.size() + i6;
        this.m = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        C0050Bv c0050Bv = new C0050Bv();
        List list = Collections.EMPTY_LIST;
        c0050Bv.j = list;
        c0050Bv.k = list;
        return c0050Bv;
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C0050Bv c0050Bv = new C0050Bv();
        List list = Collections.EMPTY_LIST;
        c0050Bv.j = list;
        c0050Bv.k = list;
        c0050Bv.g(this);
        return c0050Bv;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        for (int i = 0; i < this.i.size(); i++) {
            m5.w(1, (E) this.i.get(i));
        }
        if (this.j.size() > 0) {
            m5.D(42);
            m5.D(this.k);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            m5.v(((Integer) this.j.get(i2)).intValue());
        }
        m5.z(this.h);
    }

    public C0154Fv(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.k = -1;
        this.l = (byte) -1;
        this.m = -1;
        List list = Collections.EMPTY_LIST;
        this.i = list;
        this.j = list;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int n2 = c0523Ub.n();
                    if (n2 != 0) {
                        if (n2 == 10) {
                            if ((i & 1) != 1) {
                                this.i = new ArrayList();
                                i |= 1;
                            }
                            this.i.add(c0523Ub.g(C0128Ev.u, c1649ol));
                        } else if (n2 == 40) {
                            if ((i & 2) != 2) {
                                this.j = new ArrayList();
                                i |= 2;
                            }
                            this.j.add(Integer.valueOf(c0523Ub.k()));
                        } else if (n2 != 42) {
                            if (!c0523Ub.q(n2, o2)) {
                            }
                        } else {
                            int d = c0523Ub.d(c0523Ub.k());
                            if ((i & 2) != 2 && c0523Ub.b() > 0) {
                                this.j = new ArrayList();
                                i |= 2;
                            }
                            while (c0523Ub.b() > 0) {
                                this.j.add(Integer.valueOf(c0523Ub.k()));
                            }
                            c0523Ub.c(d);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 2) == 2) {
                        this.j = Collections.unmodifiableList(this.j);
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
        if ((i & 1) == 1) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i & 2) == 2) {
            this.j = Collections.unmodifiableList(this.j);
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

    public C0154Fv(C0050Bv c0050Bv) {
        this.k = -1;
        this.l = (byte) -1;
        this.m = -1;
        this.h = c0050Bv.h;
    }
}
