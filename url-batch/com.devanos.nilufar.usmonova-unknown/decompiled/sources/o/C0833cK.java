package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.cK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833cK extends AbstractC2115vq {
    public static final C0833cK n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2120vv f146o = new C2120vv(5);
    public final AbstractC1281j9 h;
    public int i;
    public int j;
    public List k;
    public byte l;
    public int m;

    static {
        C0833cK c0833cK = new C0833cK();
        n = c0833cK;
        c0833cK.j = 0;
        c0833cK.k = Collections.EMPTY_LIST;
    }

    public C0833cK() {
        this.l = (byte) -1;
        this.m = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.i & 1) != 1) {
            this.l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!((C0702aK) this.k.get(i)).b()) {
                this.l = (byte) 0;
                return false;
            }
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
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            c += M5.e(2, (E) this.k.get(i2));
        }
        int size = this.h.size() + c;
        this.m = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        C0768bK c0768bK = new C0768bK(0);
        c0768bK.k = Collections.EMPTY_LIST;
        return c0768bK;
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C0768bK c0768bK = new C0768bK(0);
        c0768bK.k = Collections.EMPTY_LIST;
        c0768bK.k(this);
        return c0768bK;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        if ((this.i & 1) == 1) {
            m5.u(1, this.j);
        }
        for (int i = 0; i < this.k.size(); i++) {
            m5.w(2, (E) this.k.get(i));
        }
        m5.z(this.h);
    }

    public C0833cK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.l = (byte) -1;
        this.m = -1;
        boolean z = false;
        this.j = 0;
        this.k = Collections.EMPTY_LIST;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int n2 = c0523Ub.n();
                        if (n2 != 0) {
                            if (n2 == 8) {
                                this.i |= 1;
                                this.j = c0523Ub.k();
                            } else if (n2 != 18) {
                                if (!c0523Ub.q(n2, o2)) {
                                }
                            } else {
                                if ((c & 2) != 2) {
                                    this.k = new ArrayList();
                                    c = 2;
                                }
                                this.k.add(c0523Ub.g(C0702aK.f138o, c1649ol));
                            }
                        }
                        z = true;
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
                if ((c & 2) == 2) {
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
        if ((c & 2) == 2) {
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

    public C0833cK(C0768bK c0768bK) {
        this.l = (byte) -1;
        this.m = -1;
        this.h = c0768bK.h;
    }
}
