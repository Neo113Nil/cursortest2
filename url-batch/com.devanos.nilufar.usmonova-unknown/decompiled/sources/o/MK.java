package o;

import com.google.firebase.database.core.ValidationPath;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class MK extends AbstractC1917sq {
    public static final MK A;
    public static final C2120vv B = new C2120vv(21);
    public final AbstractC1281j9 i;
    public int j;
    public List k;
    public boolean l;
    public int m;
    public MK n;

    /* renamed from: o, reason: collision with root package name */
    public int f68o;
    public int p;
    public int q;
    public int r;
    public int s;
    public MK t;
    public int u;
    public MK v;
    public int w;
    public int x;
    public byte y;
    public int z;

    static {
        MK mk = new MK();
        A = mk;
        mk.q();
    }

    public MK(LK lk) {
        super(lk);
        this.y = (byte) -1;
        this.z = -1;
        this.i = lk.h;
    }

    public static LK r(MK mk) {
        LK h = LK.h();
        h.i(mk);
        return h;
    }

    @Override // o.EC
    public final E a() {
        return A;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!((KK) this.k.get(i)).b()) {
                this.y = (byte) 0;
                return false;
            }
        }
        if ((this.j & 4) == 4 && !this.n.b()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.j & 256) == 256 && !this.t.b()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.j & 1024) == 1024 && !this.v.b()) {
            this.y = (byte) 0;
            return false;
        }
        if (i()) {
            this.y = (byte) 1;
            return true;
        }
        this.y = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.z;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 4096) == 4096 ? M5.c(1, this.x) : 0;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            c += M5.e(2, (E) this.k.get(i2));
        }
        if ((this.j & 1) == 1) {
            c += M5.i(3) + 1;
        }
        if ((this.j & 2) == 2) {
            c += M5.c(4, this.m);
        }
        if ((this.j & 4) == 4) {
            c += M5.e(5, this.n);
        }
        if ((this.j & 16) == 16) {
            c += M5.c(6, this.p);
        }
        if ((this.j & 32) == 32) {
            c += M5.c(7, this.q);
        }
        if ((this.j & 8) == 8) {
            c += M5.c(8, this.f68o);
        }
        if ((this.j & 64) == 64) {
            c += M5.c(9, this.r);
        }
        if ((this.j & 256) == 256) {
            c += M5.e(10, this.t);
        }
        if ((this.j & 512) == 512) {
            c += M5.c(11, this.u);
        }
        if ((this.j & 128) == 128) {
            c += M5.c(12, this.s);
        }
        if ((this.j & 1024) == 1024) {
            c += M5.e(13, this.v);
        }
        if ((this.j & 2048) == 2048) {
            c += M5.c(14, this.w);
        }
        int size = this.i.size() + j() + c;
        this.z = size;
        return size;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return LK.h();
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        if ((this.j & 4096) == 4096) {
            m5.u(1, this.x);
        }
        for (int i = 0; i < this.k.size(); i++) {
            m5.w(2, (E) this.k.get(i));
        }
        if ((this.j & 1) == 1) {
            boolean z = this.l;
            m5.F(3, 0);
            m5.y(z ? 1 : 0);
        }
        if ((this.j & 2) == 2) {
            m5.u(4, this.m);
        }
        if ((this.j & 4) == 4) {
            m5.w(5, this.n);
        }
        if ((this.j & 16) == 16) {
            m5.u(6, this.p);
        }
        if ((this.j & 32) == 32) {
            m5.u(7, this.q);
        }
        if ((this.j & 8) == 8) {
            m5.u(8, this.f68o);
        }
        if ((this.j & 64) == 64) {
            m5.u(9, this.r);
        }
        if ((this.j & 256) == 256) {
            m5.w(10, this.t);
        }
        if ((this.j & 512) == 512) {
            m5.u(11, this.u);
        }
        if ((this.j & 128) == 128) {
            m5.u(12, this.s);
        }
        if ((this.j & 1024) == 1024) {
            m5.w(13, this.v);
        }
        if ((this.j & 2048) == 2048) {
            m5.u(14, this.w);
        }
        c2002u5.g0(200, m5);
        m5.z(this.i);
    }

    public final boolean p() {
        return (this.j & 16) == 16;
    }

    public final void q() {
        this.k = Collections.EMPTY_LIST;
        this.l = false;
        this.m = 0;
        MK mk = A;
        this.n = mk;
        this.f68o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = mk;
        this.u = 0;
        this.v = mk;
        this.w = 0;
        this.x = 0;
    }

    @Override // o.E
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final LK e() {
        return r(this);
    }

    public MK() {
        this.y = (byte) -1;
        this.z = -1;
        this.i = AbstractC1281j9.h;
    }

    public MK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.y = (byte) -1;
        this.z = -1;
        q();
        C1217i9 c1217i9 = new C1217i9();
        M5 o2 = M5.o(c1217i9, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = c0523Ub.n();
                    C2120vv c2120vv = B;
                    LK lk = null;
                    switch (n) {
                        case 0:
                            break;
                        case 8:
                            this.j |= 4096;
                            this.x = c0523Ub.k();
                            continue;
                        case 18:
                            if (!z2) {
                                this.k = new ArrayList();
                                z2 = true;
                            }
                            this.k.add(c0523Ub.g(KK.p, c1649ol));
                            continue;
                        case 24:
                            this.j |= 1;
                            this.l = c0523Ub.l() != 0;
                            continue;
                        case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                            this.j |= 2;
                            this.m = c0523Ub.k();
                            continue;
                        case 42:
                            if ((this.j & 4) == 4) {
                                MK mk = this.n;
                                mk.getClass();
                                lk = r(mk);
                            }
                            MK mk2 = (MK) c0523Ub.g(c2120vv, c1649ol);
                            this.n = mk2;
                            if (lk != null) {
                                lk.i(mk2);
                                this.n = lk.g();
                            }
                            this.j |= 4;
                            continue;
                        case 48:
                            this.j |= 16;
                            this.p = c0523Ub.k();
                            continue;
                        case 56:
                            this.j |= 32;
                            this.q = c0523Ub.k();
                            continue;
                        case 64:
                            this.j |= 8;
                            this.f68o = c0523Ub.k();
                            continue;
                        case 72:
                            this.j |= 64;
                            this.r = c0523Ub.k();
                            continue;
                        case 82:
                            if ((this.j & 256) == 256) {
                                MK mk3 = this.t;
                                mk3.getClass();
                                lk = r(mk3);
                            }
                            MK mk4 = (MK) c0523Ub.g(c2120vv, c1649ol);
                            this.t = mk4;
                            if (lk != null) {
                                lk.i(mk4);
                                this.t = lk.g();
                            }
                            this.j |= 256;
                            continue;
                        case 88:
                            this.j |= 512;
                            this.u = c0523Ub.k();
                            continue;
                        case 96:
                            this.j |= 128;
                            this.s = c0523Ub.k();
                            continue;
                        case 106:
                            if ((this.j & 1024) == 1024) {
                                MK mk5 = this.v;
                                mk5.getClass();
                                lk = r(mk5);
                            }
                            MK mk6 = (MK) c0523Ub.g(c2120vv, c1649ol);
                            this.v = mk6;
                            if (lk != null) {
                                lk.i(mk6);
                                this.v = lk.g();
                            }
                            this.j |= 1024;
                            continue;
                        case 112:
                            this.j |= 2048;
                            this.w = c0523Ub.k();
                            continue;
                        default:
                            if (!n(c0523Ub, o2, c1649ol, n)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.k = Collections.unmodifiableList(this.k);
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
        if (z2) {
            this.k = Collections.unmodifiableList(this.k);
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
