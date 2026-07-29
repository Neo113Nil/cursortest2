package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class GK extends AbstractC2115vq {
    public static final GK l;
    public static final C2120vv m = new C2120vv(18);
    public final AbstractC1281j9 h;
    public List i;
    public byte j;
    public int k;

    static {
        GK gk = new GK();
        l = gk;
        gk.i = Collections.EMPTY_LIST;
    }

    public GK() {
        this.j = (byte) -1;
        this.k = -1;
        this.h = AbstractC1281j9.h;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.i.size(); i++) {
            if (!((FK) this.i.get(i)).b()) {
                this.j = (byte) 0;
                return false;
            }
        }
        this.j = (byte) 1;
        return true;
    }

    @Override // o.E
    public final int c() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            i2 += M5.e(1, (E) this.i.get(i3));
        }
        int size = this.h.size() + i2;
        this.k = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        C1228iK c1228iK = new C1228iK(1);
        c1228iK.k = Collections.EMPTY_LIST;
        return c1228iK;
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C1228iK c1228iK = new C1228iK(1);
        c1228iK.k = Collections.EMPTY_LIST;
        c1228iK.k(this);
        return c1228iK;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        for (int i = 0; i < this.i.size(); i++) {
            m5.w(1, (E) this.i.get(i));
        }
        m5.z(this.h);
    }

    public GK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.j = (byte) -1;
        this.k = -1;
        this.i = Collections.EMPTY_LIST;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    if (n != 0) {
                        if (n != 10) {
                            if (!c0523Ub.q(n, o2)) {
                            }
                        } else {
                            if (!z2) {
                                this.i = new ArrayList();
                                z2 = true;
                            }
                            this.i.add(c0523Ub.g(FK.p, c1649ol));
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
                if (z2) {
                    this.i = Collections.unmodifiableList(this.i);
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
        if (z2) {
            this.i = Collections.unmodifiableList(this.i);
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

    public GK(C1228iK c1228iK) {
        this.j = (byte) -1;
        this.k = -1;
        this.h = c1228iK.h;
    }
}
