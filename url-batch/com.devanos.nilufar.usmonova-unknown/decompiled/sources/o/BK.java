package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class BK extends AbstractC1851rq {
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public MK f18o;
    public int p;
    public List q;
    public MK r;
    public int s;
    public List t;
    public List u;
    public UK v;
    public int w;
    public int x;
    public List y;

    public static BK h() {
        BK bk = new BK();
        bk.l = 518;
        bk.m = 2054;
        MK mk = MK.A;
        bk.f18o = mk;
        List list = Collections.EMPTY_LIST;
        bk.q = list;
        bk.r = mk;
        bk.t = list;
        bk.u = list;
        bk.v = UK.s;
        bk.y = list;
        return bk;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        CK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        BK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        CK ck = null;
        try {
            try {
                CK.C.getClass();
                i(new CK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                CK ck2 = (CK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ck = ck2;
                    if (ck != null) {
                        i(ck);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ck != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((CK) abstractC2115vq);
        return this;
    }

    public final CK g() {
        CK ck = new CK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ck.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ck.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ck.m = this.n;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ck.n = this.f18o;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ck.f21o = this.p;
        if ((i & 32) == 32) {
            this.q = Collections.unmodifiableList(this.q);
            this.k &= -33;
        }
        ck.p = this.q;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ck.q = this.r;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        ck.r = this.s;
        if ((this.k & 256) == 256) {
            this.t = Collections.unmodifiableList(this.t);
            this.k &= -257;
        }
        ck.s = this.t;
        if ((this.k & 512) == 512) {
            this.u = Collections.unmodifiableList(this.u);
            this.k &= -513;
        }
        ck.t = this.u;
        if ((i & 1024) == 1024) {
            i2 |= 128;
        }
        ck.v = this.v;
        if ((i & 2048) == 2048) {
            i2 |= 256;
        }
        ck.w = this.w;
        if ((i & 4096) == 4096) {
            i2 |= 512;
        }
        ck.x = this.x;
        if ((this.k & 8192) == 8192) {
            this.y = Collections.unmodifiableList(this.y);
            this.k &= -8193;
        }
        ck.y = this.y;
        ck.j = i2;
        return ck;
    }

    public final void i(CK ck) {
        UK uk;
        MK mk;
        MK mk2;
        if (ck == CK.B) {
            return;
        }
        int i = ck.j;
        if ((i & 1) == 1) {
            int i2 = ck.k;
            this.k = 1 | this.k;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ck.l;
            this.k = 2 | this.k;
            this.m = i3;
        }
        if ((i & 4) == 4) {
            int i4 = ck.m;
            this.k = 4 | this.k;
            this.n = i4;
        }
        if ((i & 8) == 8) {
            MK mk3 = ck.n;
            if ((this.k & 8) != 8 || (mk2 = this.f18o) == MK.A) {
                this.f18o = mk3;
            } else {
                LK r = MK.r(mk2);
                r.i(mk3);
                this.f18o = r.g();
            }
            this.k |= 8;
        }
        if ((ck.j & 16) == 16) {
            int i5 = ck.f21o;
            this.k = 16 | this.k;
            this.p = i5;
        }
        if (!ck.p.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = ck.p;
                this.k &= -33;
            } else {
                if ((this.k & 32) != 32) {
                    this.q = new ArrayList(this.q);
                    this.k |= 32;
                }
                this.q.addAll(ck.p);
            }
        }
        if ((ck.j & 32) == 32) {
            MK mk4 = ck.q;
            if ((this.k & 64) != 64 || (mk = this.r) == MK.A) {
                this.r = mk4;
            } else {
                LK r2 = MK.r(mk);
                r2.i(mk4);
                this.r = r2.g();
            }
            this.k |= 64;
        }
        if ((ck.j & 64) == 64) {
            int i6 = ck.r;
            this.k |= 128;
            this.s = i6;
        }
        if (!ck.s.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = ck.s;
                this.k &= -257;
            } else {
                if ((this.k & 256) != 256) {
                    this.t = new ArrayList(this.t);
                    this.k |= 256;
                }
                this.t.addAll(ck.s);
            }
        }
        if (!ck.t.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = ck.t;
                this.k &= -513;
            } else {
                if ((this.k & 512) != 512) {
                    this.u = new ArrayList(this.u);
                    this.k |= 512;
                }
                this.u.addAll(ck.t);
            }
        }
        if ((ck.j & 128) == 128) {
            UK uk2 = ck.v;
            if ((this.k & 1024) != 1024 || (uk = this.v) == UK.s) {
                this.v = uk2;
            } else {
                TK tk = new TK();
                MK mk5 = MK.A;
                tk.n = mk5;
                tk.p = mk5;
                tk.h(uk);
                tk.h(uk2);
                this.v = tk.g();
            }
            this.k |= 1024;
        }
        int i7 = ck.j;
        if ((i7 & 256) == 256) {
            int i8 = ck.w;
            this.k |= 2048;
            this.w = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = ck.x;
            this.k |= 4096;
            this.x = i9;
        }
        if (!ck.y.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = ck.y;
                this.k &= -8193;
            } else {
                if ((this.k & 8192) != 8192) {
                    this.y = new ArrayList(this.y);
                    this.k |= 8192;
                }
                this.y.addAll(ck.y);
            }
        }
        f(ck);
        this.h = this.h.k(ck.i);
    }
}
