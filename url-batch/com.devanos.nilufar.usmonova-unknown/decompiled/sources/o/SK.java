package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SK extends AbstractC2115vq {
    public static final SK n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2120vv f105o = new C2120vv(25);
    public final AbstractC1281j9 h;
    public int i;
    public List j;
    public int k;
    public byte l;
    public int m;

    static {
        SK sk = new SK();
        n = sk;
        sk.j = Collections.EMPTY_LIST;
        sk.k = -1;
    }

    public SK() {
        this.l = (byte) -1;
        this.m = -1;
        this.h = AbstractC1281j9.h;
    }

    public static C0768bK i(SK sk) {
        C0768bK i = C0768bK.i();
        i.l(sk);
        return i;
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
        for (int i = 0; i < this.j.size(); i++) {
            if (!((MK) this.j.get(i)).b()) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            i2 += M5.e(1, (E) this.j.get(i3));
        }
        if ((this.i & 1) == 1) {
            i2 += M5.c(2, this.k);
        }
        int size = this.h.size() + i2;
        this.m = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C0768bK.i();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        return i(this);
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        for (int i = 0; i < this.j.size(); i++) {
            m5.w(1, (E) this.j.get(i));
        }
        if ((this.i & 1) == 1) {
            m5.u(2, this.k);
        }
        m5.z(this.h);
    }

    public final C0768bK j() {
        return i(this);
    }

    public SK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.l = (byte) -1;
        this.m = -1;
        this.j = Collections.EMPTY_LIST;
        this.k = -1;
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int n2 = c0523Ub.n();
                        if (n2 != 0) {
                            if (n2 == 10) {
                                if (!z2) {
                                    this.j = new ArrayList();
                                    z2 = true;
                                }
                                this.j.add(c0523Ub.g(MK.B, c1649ol));
                            } else if (n2 != 16) {
                                if (!c0523Ub.q(n2, o2)) {
                                }
                            } else {
                                this.i |= 1;
                                this.k = c0523Ub.k();
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
                if (z2) {
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
        }
        if (z2) {
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

    public SK(C0768bK c0768bK) {
        this.l = (byte) -1;
        this.m = -1;
        this.h = c0768bK.h;
    }
}
