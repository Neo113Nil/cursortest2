package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.tK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951tK extends AbstractC1851rq {
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public MK f224o;
    public int p;
    public List q;
    public MK r;
    public int s;
    public List t;
    public List u;
    public List v;
    public SK w;
    public List x;
    public C1292jK y;

    public static C1951tK h() {
        C1951tK c1951tK = new C1951tK();
        c1951tK.l = 6;
        c1951tK.m = 6;
        MK mk = MK.A;
        c1951tK.f224o = mk;
        List list = Collections.EMPTY_LIST;
        c1951tK.q = list;
        c1951tK.r = mk;
        c1951tK.t = list;
        c1951tK.u = list;
        c1951tK.v = list;
        c1951tK.w = SK.n;
        c1951tK.x = list;
        c1951tK.y = C1292jK.l;
        return c1951tK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C2017uK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C1951tK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C2017uK c2017uK = null;
        try {
            try {
                C2017uK.C.getClass();
                i(new C2017uK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C2017uK c2017uK2 = (C2017uK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c2017uK = c2017uK2;
                    if (c2017uK != null) {
                        i(c2017uK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c2017uK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((C2017uK) abstractC2115vq);
        return this;
    }

    public final C2017uK g() {
        C2017uK c2017uK = new C2017uK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c2017uK.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c2017uK.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c2017uK.m = this.n;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c2017uK.n = this.f224o;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c2017uK.f229o = this.p;
        if ((i & 32) == 32) {
            this.q = Collections.unmodifiableList(this.q);
            this.k &= -33;
        }
        c2017uK.p = this.q;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c2017uK.q = this.r;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c2017uK.r = this.s;
        if ((this.k & 256) == 256) {
            this.t = Collections.unmodifiableList(this.t);
            this.k &= -257;
        }
        c2017uK.s = this.t;
        if ((this.k & 512) == 512) {
            this.u = Collections.unmodifiableList(this.u);
            this.k &= -513;
        }
        c2017uK.t = this.u;
        if ((this.k & 1024) == 1024) {
            this.v = Collections.unmodifiableList(this.v);
            this.k &= -1025;
        }
        c2017uK.v = this.v;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        c2017uK.w = this.w;
        if ((this.k & 4096) == 4096) {
            this.x = Collections.unmodifiableList(this.x);
            this.k &= -4097;
        }
        c2017uK.x = this.x;
        if ((i & 8192) == 8192) {
            i2 |= 256;
        }
        c2017uK.y = this.y;
        c2017uK.j = i2;
        return c2017uK;
    }

    public final void i(C2017uK c2017uK) {
        C1292jK c1292jK;
        SK sk;
        MK mk;
        MK mk2;
        if (c2017uK == C2017uK.B) {
            return;
        }
        int i = c2017uK.j;
        if ((i & 1) == 1) {
            int i2 = c2017uK.k;
            this.k = 1 | this.k;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c2017uK.l;
            this.k = 2 | this.k;
            this.m = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c2017uK.m;
            this.k = 4 | this.k;
            this.n = i4;
        }
        if ((i & 8) == 8) {
            MK mk3 = c2017uK.n;
            if ((this.k & 8) != 8 || (mk2 = this.f224o) == MK.A) {
                this.f224o = mk3;
            } else {
                LK r = MK.r(mk2);
                r.i(mk3);
                this.f224o = r.g();
            }
            this.k |= 8;
        }
        if ((c2017uK.j & 16) == 16) {
            int i5 = c2017uK.f229o;
            this.k = 16 | this.k;
            this.p = i5;
        }
        if (!c2017uK.p.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = c2017uK.p;
                this.k &= -33;
            } else {
                if ((this.k & 32) != 32) {
                    this.q = new ArrayList(this.q);
                    this.k |= 32;
                }
                this.q.addAll(c2017uK.p);
            }
        }
        if ((c2017uK.j & 32) == 32) {
            MK mk4 = c2017uK.q;
            if ((this.k & 64) != 64 || (mk = this.r) == MK.A) {
                this.r = mk4;
            } else {
                LK r2 = MK.r(mk);
                r2.i(mk4);
                this.r = r2.g();
            }
            this.k |= 64;
        }
        if ((c2017uK.j & 64) == 64) {
            int i6 = c2017uK.r;
            this.k |= 128;
            this.s = i6;
        }
        if (!c2017uK.s.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = c2017uK.s;
                this.k &= -257;
            } else {
                if ((this.k & 256) != 256) {
                    this.t = new ArrayList(this.t);
                    this.k |= 256;
                }
                this.t.addAll(c2017uK.s);
            }
        }
        if (!c2017uK.t.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = c2017uK.t;
                this.k &= -513;
            } else {
                if ((this.k & 512) != 512) {
                    this.u = new ArrayList(this.u);
                    this.k |= 512;
                }
                this.u.addAll(c2017uK.t);
            }
        }
        if (!c2017uK.v.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = c2017uK.v;
                this.k &= -1025;
            } else {
                if ((this.k & 1024) != 1024) {
                    this.v = new ArrayList(this.v);
                    this.k |= 1024;
                }
                this.v.addAll(c2017uK.v);
            }
        }
        if ((c2017uK.j & 128) == 128) {
            SK sk2 = c2017uK.w;
            if ((this.k & 2048) != 2048 || (sk = this.w) == SK.n) {
                this.w = sk2;
            } else {
                C0768bK i7 = SK.i(sk);
                i7.l(sk2);
                this.w = i7.h();
            }
            this.k |= 2048;
        }
        if (!c2017uK.x.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = c2017uK.x;
                this.k &= -4097;
            } else {
                if ((this.k & 4096) != 4096) {
                    this.x = new ArrayList(this.x);
                    this.k |= 4096;
                }
                this.x.addAll(c2017uK.x);
            }
        }
        if ((c2017uK.j & 256) == 256) {
            C1292jK c1292jK2 = c2017uK.y;
            if ((this.k & 8192) != 8192 || (c1292jK = this.y) == C1292jK.l) {
                this.y = c1292jK2;
            } else {
                C1228iK c1228iK = new C1228iK(0);
                c1228iK.k = Collections.EMPTY_LIST;
                c1228iK.j(c1292jK);
                c1228iK.j(c1292jK2);
                this.y = c1228iK.f();
            }
            this.k |= 8192;
        }
        f(c2017uK);
        this.h = this.h.k(c2017uK.i);
    }
}
