package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.dK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899dK extends AbstractC1851rq {
    public int A;
    public MK B;
    public int C;
    public List D;
    public List E;
    public List F;
    public SK G;
    public List H;
    public ZK I;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public List f156o;
    public List p;
    public List q;
    public List r;
    public List s;
    public List t;
    public List u;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    public static C0899dK h() {
        C0899dK c0899dK = new C0899dK();
        c0899dK.l = 6;
        List list = Collections.EMPTY_LIST;
        c0899dK.f156o = list;
        c0899dK.p = list;
        c0899dK.q = list;
        c0899dK.r = list;
        c0899dK.s = list;
        c0899dK.t = list;
        c0899dK.u = list;
        c0899dK.v = list;
        c0899dK.w = list;
        c0899dK.x = list;
        c0899dK.y = list;
        c0899dK.z = list;
        c0899dK.B = MK.A;
        c0899dK.D = list;
        c0899dK.E = list;
        c0899dK.F = list;
        c0899dK.G = SK.n;
        c0899dK.H = list;
        c0899dK.I = ZK.l;
        return c0899dK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C1030fK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C0899dK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C1030fK c1030fK = null;
        try {
            try {
                C1030fK.R.getClass();
                i(new C1030fK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C1030fK c1030fK2 = (C1030fK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c1030fK = c1030fK2;
                    if (c1030fK != null) {
                        i(c1030fK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c1030fK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((C1030fK) abstractC2115vq);
        return this;
    }

    public final C1030fK g() {
        C1030fK c1030fK = new C1030fK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c1030fK.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c1030fK.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c1030fK.m = this.n;
        if ((i & 8) == 8) {
            this.f156o = Collections.unmodifiableList(this.f156o);
            this.k &= -9;
        }
        c1030fK.n = this.f156o;
        if ((this.k & 16) == 16) {
            this.p = Collections.unmodifiableList(this.p);
            this.k &= -17;
        }
        c1030fK.f164o = this.p;
        if ((this.k & 32) == 32) {
            this.q = Collections.unmodifiableList(this.q);
            this.k &= -33;
        }
        c1030fK.p = this.q;
        if ((this.k & 64) == 64) {
            this.r = Collections.unmodifiableList(this.r);
            this.k &= -65;
        }
        c1030fK.r = this.r;
        if ((this.k & 128) == 128) {
            this.s = Collections.unmodifiableList(this.s);
            this.k &= -129;
        }
        c1030fK.t = this.s;
        if ((this.k & 256) == 256) {
            this.t = Collections.unmodifiableList(this.t);
            this.k &= -257;
        }
        c1030fK.u = this.t;
        if ((this.k & 512) == 512) {
            this.u = Collections.unmodifiableList(this.u);
            this.k &= -513;
        }
        c1030fK.w = this.u;
        if ((this.k & 1024) == 1024) {
            this.v = Collections.unmodifiableList(this.v);
            this.k &= -1025;
        }
        c1030fK.x = this.v;
        if ((this.k & 2048) == 2048) {
            this.w = Collections.unmodifiableList(this.w);
            this.k &= -2049;
        }
        c1030fK.y = this.w;
        if ((this.k & 4096) == 4096) {
            this.x = Collections.unmodifiableList(this.x);
            this.k &= -4097;
        }
        c1030fK.z = this.x;
        if ((this.k & 8192) == 8192) {
            this.y = Collections.unmodifiableList(this.y);
            this.k &= -8193;
        }
        c1030fK.A = this.y;
        if ((this.k & 16384) == 16384) {
            this.z = Collections.unmodifiableList(this.z);
            this.k &= -16385;
        }
        c1030fK.B = this.z;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        c1030fK.D = this.A;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        c1030fK.E = this.B;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        c1030fK.F = this.C;
        if ((this.k & 262144) == 262144) {
            this.D = Collections.unmodifiableList(this.D);
            this.k &= -262145;
        }
        c1030fK.G = this.D;
        if ((this.k & 524288) == 524288) {
            this.E = Collections.unmodifiableList(this.E);
            this.k &= -524289;
        }
        c1030fK.I = this.E;
        if ((this.k & 1048576) == 1048576) {
            this.F = Collections.unmodifiableList(this.F);
            this.k &= -1048577;
        }
        c1030fK.J = this.F;
        if ((i & 2097152) == 2097152) {
            i2 |= 64;
        }
        c1030fK.L = this.G;
        if ((this.k & 4194304) == 4194304) {
            this.H = Collections.unmodifiableList(this.H);
            this.k &= -4194305;
        }
        c1030fK.M = this.H;
        if ((i & 8388608) == 8388608) {
            i2 |= 128;
        }
        c1030fK.N = this.I;
        c1030fK.j = i2;
        return c1030fK;
    }

    public final void i(C1030fK c1030fK) {
        ZK zk;
        SK sk;
        MK mk;
        if (c1030fK == C1030fK.Q) {
            return;
        }
        int i = c1030fK.j;
        if ((i & 1) == 1) {
            int i2 = c1030fK.k;
            this.k = 1 | this.k;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c1030fK.l;
            this.k = 2 | this.k;
            this.m = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c1030fK.m;
            this.k = 4 | this.k;
            this.n = i4;
        }
        if (!c1030fK.n.isEmpty()) {
            if (this.f156o.isEmpty()) {
                this.f156o = c1030fK.n;
                this.k &= -9;
            } else {
                if ((this.k & 8) != 8) {
                    this.f156o = new ArrayList(this.f156o);
                    this.k |= 8;
                }
                this.f156o.addAll(c1030fK.n);
            }
        }
        if (!c1030fK.f164o.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = c1030fK.f164o;
                this.k &= -17;
            } else {
                if ((this.k & 16) != 16) {
                    this.p = new ArrayList(this.p);
                    this.k |= 16;
                }
                this.p.addAll(c1030fK.f164o);
            }
        }
        if (!c1030fK.p.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = c1030fK.p;
                this.k &= -33;
            } else {
                if ((this.k & 32) != 32) {
                    this.q = new ArrayList(this.q);
                    this.k |= 32;
                }
                this.q.addAll(c1030fK.p);
            }
        }
        if (!c1030fK.r.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = c1030fK.r;
                this.k &= -65;
            } else {
                if ((this.k & 64) != 64) {
                    this.r = new ArrayList(this.r);
                    this.k |= 64;
                }
                this.r.addAll(c1030fK.r);
            }
        }
        if (!c1030fK.t.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = c1030fK.t;
                this.k &= -129;
            } else {
                if ((this.k & 128) != 128) {
                    this.s = new ArrayList(this.s);
                    this.k |= 128;
                }
                this.s.addAll(c1030fK.t);
            }
        }
        if (!c1030fK.u.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = c1030fK.u;
                this.k &= -257;
            } else {
                if ((this.k & 256) != 256) {
                    this.t = new ArrayList(this.t);
                    this.k |= 256;
                }
                this.t.addAll(c1030fK.u);
            }
        }
        if (!c1030fK.w.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = c1030fK.w;
                this.k &= -513;
            } else {
                if ((this.k & 512) != 512) {
                    this.u = new ArrayList(this.u);
                    this.k |= 512;
                }
                this.u.addAll(c1030fK.w);
            }
        }
        if (!c1030fK.x.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = c1030fK.x;
                this.k &= -1025;
            } else {
                if ((this.k & 1024) != 1024) {
                    this.v = new ArrayList(this.v);
                    this.k |= 1024;
                }
                this.v.addAll(c1030fK.x);
            }
        }
        if (!c1030fK.y.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = c1030fK.y;
                this.k &= -2049;
            } else {
                if ((this.k & 2048) != 2048) {
                    this.w = new ArrayList(this.w);
                    this.k |= 2048;
                }
                this.w.addAll(c1030fK.y);
            }
        }
        if (!c1030fK.z.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = c1030fK.z;
                this.k &= -4097;
            } else {
                if ((this.k & 4096) != 4096) {
                    this.x = new ArrayList(this.x);
                    this.k |= 4096;
                }
                this.x.addAll(c1030fK.z);
            }
        }
        if (!c1030fK.A.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = c1030fK.A;
                this.k &= -8193;
            } else {
                if ((this.k & 8192) != 8192) {
                    this.y = new ArrayList(this.y);
                    this.k |= 8192;
                }
                this.y.addAll(c1030fK.A);
            }
        }
        if (!c1030fK.B.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = c1030fK.B;
                this.k &= -16385;
            } else {
                if ((this.k & 16384) != 16384) {
                    this.z = new ArrayList(this.z);
                    this.k |= 16384;
                }
                this.z.addAll(c1030fK.B);
            }
        }
        int i5 = c1030fK.j;
        if ((i5 & 8) == 8) {
            int i6 = c1030fK.D;
            this.k |= 32768;
            this.A = i6;
        }
        if ((i5 & 16) == 16) {
            MK mk2 = c1030fK.E;
            if ((this.k & 65536) != 65536 || (mk = this.B) == MK.A) {
                this.B = mk2;
            } else {
                LK r = MK.r(mk);
                r.i(mk2);
                this.B = r.g();
            }
            this.k |= 65536;
        }
        if ((c1030fK.j & 32) == 32) {
            int i7 = c1030fK.F;
            this.k |= 131072;
            this.C = i7;
        }
        if (!c1030fK.G.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = c1030fK.G;
                this.k &= -262145;
            } else {
                if ((this.k & 262144) != 262144) {
                    this.D = new ArrayList(this.D);
                    this.k |= 262144;
                }
                this.D.addAll(c1030fK.G);
            }
        }
        if (!c1030fK.I.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = c1030fK.I;
                this.k &= -524289;
            } else {
                if ((this.k & 524288) != 524288) {
                    this.E = new ArrayList(this.E);
                    this.k |= 524288;
                }
                this.E.addAll(c1030fK.I);
            }
        }
        if (!c1030fK.J.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = c1030fK.J;
                this.k &= -1048577;
            } else {
                if ((this.k & 1048576) != 1048576) {
                    this.F = new ArrayList(this.F);
                    this.k |= 1048576;
                }
                this.F.addAll(c1030fK.J);
            }
        }
        if ((c1030fK.j & 64) == 64) {
            SK sk2 = c1030fK.L;
            if ((this.k & 2097152) != 2097152 || (sk = this.G) == SK.n) {
                this.G = sk2;
            } else {
                C0768bK i8 = SK.i(sk);
                i8.l(sk2);
                this.G = i8.h();
            }
            this.k |= 2097152;
        }
        if (!c1030fK.M.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = c1030fK.M;
                this.k &= -4194305;
            } else {
                if ((this.k & 4194304) != 4194304) {
                    this.H = new ArrayList(this.H);
                    this.k |= 4194304;
                }
                this.H.addAll(c1030fK.M);
            }
        }
        if ((c1030fK.j & 128) == 128) {
            ZK zk2 = c1030fK.N;
            if ((this.k & 8388608) != 8388608 || (zk = this.I) == ZK.l) {
                this.I = zk2;
            } else {
                C1228iK c1228iK = new C1228iK(2);
                c1228iK.k = Collections.EMPTY_LIST;
                c1228iK.m(zk);
                c1228iK.m(zk2);
                this.I = c1228iK.i();
            }
            this.k |= 8388608;
        }
        f(c1030fK);
        this.h = this.h.k(c1030fK.i);
    }
}
