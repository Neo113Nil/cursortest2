package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class PK extends AbstractC1851rq {
    public int k;
    public int l;
    public int m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public QK f81o;
    public List p;
    public List q;

    public static PK h() {
        PK pk = new PK();
        pk.f81o = QK.INV;
        List list = Collections.EMPTY_LIST;
        pk.p = list;
        pk.q = list;
        return pk;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        RK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        PK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        RK rk = null;
        try {
            try {
                RK.u.getClass();
                i(new RK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                RK rk2 = (RK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    rk = rk2;
                    if (rk != null) {
                        i(rk);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (rk != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((RK) abstractC2115vq);
        return this;
    }

    public final RK g() {
        RK rk = new RK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        rk.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        rk.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        rk.m = this.n;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        rk.n = this.f81o;
        if ((i & 16) == 16) {
            this.p = Collections.unmodifiableList(this.p);
            this.k &= -17;
        }
        rk.f96o = this.p;
        if ((this.k & 32) == 32) {
            this.q = Collections.unmodifiableList(this.q);
            this.k &= -33;
        }
        rk.p = this.q;
        rk.j = i2;
        return rk;
    }

    public final void i(RK rk) {
        if (rk == RK.t) {
            return;
        }
        int i = rk.j;
        if ((i & 1) == 1) {
            int i2 = rk.k;
            this.k = 1 | this.k;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = rk.l;
            this.k = 2 | this.k;
            this.m = i3;
        }
        if ((i & 4) == 4) {
            boolean z = rk.m;
            this.k = 4 | this.k;
            this.n = z;
        }
        if ((i & 8) == 8) {
            QK qk = rk.n;
            qk.getClass();
            this.k = 8 | this.k;
            this.f81o = qk;
        }
        if (!rk.f96o.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = rk.f96o;
                this.k &= -17;
            } else {
                if ((this.k & 16) != 16) {
                    this.p = new ArrayList(this.p);
                    this.k |= 16;
                }
                this.p.addAll(rk.f96o);
            }
        }
        if (!rk.p.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = rk.p;
                this.k &= -33;
            } else {
                if ((this.k & 32) != 32) {
                    this.q = new ArrayList(this.q);
                    this.k |= 32;
                }
                this.q.addAll(rk.p);
            }
        }
        f(rk);
        this.h = this.h.k(rk.i);
    }
}
