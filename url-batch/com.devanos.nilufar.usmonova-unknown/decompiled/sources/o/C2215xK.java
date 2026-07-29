package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.xK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2215xK extends AbstractC1851rq {
    public int k;
    public List l;
    public List m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public SK f241o;
    public ZK p;

    public static C2215xK h() {
        C2215xK c2215xK = new C2215xK();
        List list = Collections.EMPTY_LIST;
        c2215xK.l = list;
        c2215xK.m = list;
        c2215xK.n = list;
        c2215xK.f241o = SK.n;
        c2215xK.p = ZK.l;
        return c2215xK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C2281yK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C2215xK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C2281yK c2281yK = null;
        try {
            try {
                C2281yK.s.getClass();
                i(new C2281yK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C2281yK c2281yK2 = (C2281yK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c2281yK = c2281yK2;
                    if (c2281yK != null) {
                        i(c2281yK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c2281yK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((C2281yK) abstractC2115vq);
        return this;
    }

    public final C2281yK g() {
        C2281yK c2281yK = new C2281yK(this);
        int i = this.k;
        if ((i & 1) == 1) {
            this.l = Collections.unmodifiableList(this.l);
            this.k &= -2;
        }
        c2281yK.k = this.l;
        if ((this.k & 2) == 2) {
            this.m = Collections.unmodifiableList(this.m);
            this.k &= -3;
        }
        c2281yK.l = this.m;
        if ((this.k & 4) == 4) {
            this.n = Collections.unmodifiableList(this.n);
            this.k &= -5;
        }
        c2281yK.m = this.n;
        int i2 = (i & 8) != 8 ? 0 : 1;
        c2281yK.n = this.f241o;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        c2281yK.f246o = this.p;
        c2281yK.j = i2;
        return c2281yK;
    }

    public final void i(C2281yK c2281yK) {
        ZK zk;
        SK sk;
        if (c2281yK == C2281yK.r) {
            return;
        }
        if (!c2281yK.k.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = c2281yK.k;
                this.k &= -2;
            } else {
                if ((this.k & 1) != 1) {
                    this.l = new ArrayList(this.l);
                    this.k |= 1;
                }
                this.l.addAll(c2281yK.k);
            }
        }
        if (!c2281yK.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = c2281yK.l;
                this.k &= -3;
            } else {
                if ((this.k & 2) != 2) {
                    this.m = new ArrayList(this.m);
                    this.k |= 2;
                }
                this.m.addAll(c2281yK.l);
            }
        }
        if (!c2281yK.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c2281yK.m;
                this.k &= -5;
            } else {
                if ((this.k & 4) != 4) {
                    this.n = new ArrayList(this.n);
                    this.k |= 4;
                }
                this.n.addAll(c2281yK.m);
            }
        }
        if ((c2281yK.j & 1) == 1) {
            SK sk2 = c2281yK.n;
            if ((this.k & 8) != 8 || (sk = this.f241o) == SK.n) {
                this.f241o = sk2;
            } else {
                C0768bK i = SK.i(sk);
                i.l(sk2);
                this.f241o = i.h();
            }
            this.k |= 8;
        }
        if ((c2281yK.j & 2) == 2) {
            ZK zk2 = c2281yK.f246o;
            if ((this.k & 16) != 16 || (zk = this.p) == ZK.l) {
                this.p = zk2;
            } else {
                C1228iK c1228iK = new C1228iK(2);
                c1228iK.k = Collections.EMPTY_LIST;
                c1228iK.m(zk);
                c1228iK.m(zk2);
                this.p = c1228iK.i();
            }
            this.k |= 16;
        }
        f(c2281yK);
        this.h = this.h.k(c2281yK.i);
    }
}
