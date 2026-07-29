package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class NK extends AbstractC1851rq {
    public int k;
    public int l;
    public int m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public MK f71o;
    public int p;
    public MK q;
    public int r;
    public List s;
    public List t;

    public static NK h() {
        NK nk = new NK();
        nk.l = 6;
        List list = Collections.EMPTY_LIST;
        nk.n = list;
        MK mk = MK.A;
        nk.f71o = mk;
        nk.q = mk;
        nk.s = list;
        nk.t = list;
        return nk;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        OK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        NK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        OK ok = null;
        try {
            try {
                OK.w.getClass();
                i(new OK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                OK ok2 = (OK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ok = ok2;
                    if (ok != null) {
                        i(ok);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ok != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((OK) abstractC2115vq);
        return this;
    }

    public final OK g() {
        OK ok = new OK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ok.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ok.l = this.m;
        if ((i & 4) == 4) {
            this.n = Collections.unmodifiableList(this.n);
            this.k &= -5;
        }
        ok.m = this.n;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        ok.n = this.f71o;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        ok.f76o = this.p;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        ok.p = this.q;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ok.q = this.r;
        if ((this.k & 128) == 128) {
            this.s = Collections.unmodifiableList(this.s);
            this.k &= -129;
        }
        ok.r = this.s;
        if ((this.k & 256) == 256) {
            this.t = Collections.unmodifiableList(this.t);
            this.k &= -257;
        }
        ok.s = this.t;
        ok.j = i2;
        return ok;
    }

    public final void i(OK ok) {
        MK mk;
        MK mk2;
        if (ok == OK.v) {
            return;
        }
        int i = ok.j;
        if ((i & 1) == 1) {
            int i2 = ok.k;
            this.k = 1 | this.k;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ok.l;
            this.k = 2 | this.k;
            this.m = i3;
        }
        if (!ok.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = ok.m;
                this.k &= -5;
            } else {
                if ((this.k & 4) != 4) {
                    this.n = new ArrayList(this.n);
                    this.k |= 4;
                }
                this.n.addAll(ok.m);
            }
        }
        if ((ok.j & 4) == 4) {
            MK mk3 = ok.n;
            if ((this.k & 8) != 8 || (mk2 = this.f71o) == MK.A) {
                this.f71o = mk3;
            } else {
                LK r = MK.r(mk2);
                r.i(mk3);
                this.f71o = r.g();
            }
            this.k |= 8;
        }
        int i4 = ok.j;
        if ((i4 & 8) == 8) {
            int i5 = ok.f76o;
            this.k |= 16;
            this.p = i5;
        }
        if ((i4 & 16) == 16) {
            MK mk4 = ok.p;
            if ((this.k & 32) != 32 || (mk = this.q) == MK.A) {
                this.q = mk4;
            } else {
                LK r2 = MK.r(mk);
                r2.i(mk4);
                this.q = r2.g();
            }
            this.k |= 32;
        }
        if ((ok.j & 32) == 32) {
            int i6 = ok.q;
            this.k |= 64;
            this.r = i6;
        }
        if (!ok.r.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = ok.r;
                this.k &= -129;
            } else {
                if ((this.k & 128) != 128) {
                    this.s = new ArrayList(this.s);
                    this.k |= 128;
                }
                this.s.addAll(ok.r);
            }
        }
        if (!ok.s.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = ok.s;
                this.k &= -257;
            } else {
                if ((this.k & 256) != 256) {
                    this.t = new ArrayList(this.t);
                    this.k |= 256;
                }
                this.t.addAll(ok.s);
            }
        }
        f(ok);
        this.h = this.h.k(ok.i);
    }
}
